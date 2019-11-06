package com.shalahuddin.api.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shalahuddin.api.dto.AnggotaDto;
import com.shalahuddin.api.entity.Anggota;
import com.shalahuddin.api.model.RestResponseModel;
import com.shalahuddin.api.service.AnggotaService;
import com.shalahuddin.api.utils.ControllerHelper;
import com.shalahuddin.api.utils.MessageDetail;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin("*")
@RestController
@RequestMapping("anggota")
@Api(value = "ANGGOTA API", description = "Operation Pertaining to ANGGOTA", tags = "ANGGOTA")
public class AnggotaController {
	Logger logger = Logger.getLogger(getClass());

	@Autowired
	AnggotaService anggotaService;

	@ApiOperation(value = "Get All Anggota", response = RestResponseModel.class)
	@GetMapping("/getAll")
	public ResponseEntity<RestResponseModel<Anggota>> findAll(){
		List<Anggota> data = anggotaService.findAll();
		int totalRow = 0;
		if (null != data) {
			totalRow = data.size();
		}

		RestResponseModel<Anggota> resp = new RestResponseModel<>();
		resp.setContent(data);
		resp.setTotalRow(totalRow);
		resp.setId("getAll");

		MessageDetail info = new MessageDetail();
		if (totalRow == 0) {
			logger.info("NO_CONTENT ....");
			info.setMessage(HttpStatus.NO_CONTENT.name());
			info.setStatus(HttpStatus.NO_CONTENT.value());
			resp.setInfo(info);
			return new ResponseEntity<>(resp, HttpStatus.OK);
		} else {
			info.setMessage(HttpStatus.OK.name());
			info.setStatus(HttpStatus.OK.value());
			resp.setInfo(info);
			return new ResponseEntity<>(resp, HttpStatus.OK);
		}
	}

	@ApiOperation(value = "Create Anggota", response = RestResponseModel.class)
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ResponseEntity<RestResponseModel<AnggotaDto>> doSave(@RequestBody AnggotaDto anggota, BindingResult result){
		RestResponseModel<AnggotaDto> resp = new RestResponseModel<>();
		MessageDetail info = new MessageDetail();
		if(result.hasErrors()) {
			String sfieldErrors="";
			for (ObjectError error : result.getAllErrors()) { // 1.
				String fieldErrors = ((FieldError) error).getField(); // 2.
				sfieldErrors=sfieldErrors+fieldErrors+" : " +error.getDefaultMessage() + ", ";
			}
			sfieldErrors=sfieldErrors.substring(0, sfieldErrors.length()-1);
			info.setDetailMessage(sfieldErrors);
			info.setMessage(HttpStatus.NOT_ACCEPTABLE.name());
			info.setStatus(HttpStatus.NOT_ACCEPTABLE.value());
			resp.setInfo(info);
			resp.setErrorMessage(HttpStatus.NOT_ACCEPTABLE.name());
			return new ResponseEntity<>(resp, HttpStatus.NOT_ACCEPTABLE);

		}
		if (null == anggota) {
			logger.info("Anggota with Not Found");
			info.setMessage(HttpStatus.NOT_FOUND.name());
			info.setStatus(HttpStatus.NOT_FOUND.value());
			resp.setInfo(info);
			return new ResponseEntity<>(resp, HttpStatus.NOT_FOUND);
		} else if (result.hasErrors()) {
			logger.info("Anggota property is not correct");
			info.setMessage(HttpStatus.BAD_REQUEST.name());
			info.setStatus(HttpStatus.BAD_REQUEST.value());
			info.setDetailMessage(ControllerHelper.parseValidationError(result));
			resp.setInfo(info);
			return new ResponseEntity<>(resp, HttpStatus.BAD_REQUEST);
		} else {
			// Call process
			String rtn = anggotaService.save(anggota);
			if(rtn.contains("IS_EXIST"))
			{
				info.setMessage(HttpStatus.CONFLICT.name());
				info.setStatus(HttpStatus.CONFLICT.value());
				info.setDetailMessage("Data sudah ada");
				resp.setInfo(info);
				return new ResponseEntity<>(resp, HttpStatus.CONFLICT);
			}else{
				logger.info("Save Anggota, with id: " + anggota.getId());
				info.setMessage(HttpStatus.OK.name());
				info.setStatus(HttpStatus.OK.value());
			}
			resp.setInfo(info);
			return new ResponseEntity<>(resp, HttpStatus.OK);
		}

	}

	@ApiOperation(value = "Get Singgle Anggota Record by ID", response = RestResponseModel.class)
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<RestResponseModel<Anggota>> getRecord(@PathVariable("id") Integer id) {
		RestResponseModel<Anggota> resp = new RestResponseModel<>();
		MessageDetail info = new MessageDetail();
		if (!anggotaService.isExist(id)) {
			logger.info("Anggota with id: " + id + " Not Found");
			info.setMessage(HttpStatus.NOT_FOUND.name());
			info.setStatus(HttpStatus.NOT_FOUND.value());
			info.setDetailMessage("Anggota with id: " + id + ", Not Found");
			resp.setInfo(info);
			return new ResponseEntity<>(resp, HttpStatus.NOT_FOUND);
		} else {
			logger.info("Find Anggota, with id: " + id);

			Anggota data = anggotaService.findOneById(id);

			resp.setContent(new ArrayList<>(Arrays.asList(data)));
			resp.setTotalRow(1);

			info.setMessage(HttpStatus.OK.name());
			info.setStatus(HttpStatus.OK.value());
			resp.setInfo(info);

			return new ResponseEntity<>(resp, HttpStatus.OK);
		}
	}
}
