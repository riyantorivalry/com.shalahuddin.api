package com.shalahuddin.api.repository.impl;

import java.sql.Types;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.shalahuddin.api.entity.Alumni;
import com.shalahuddin.api.repository.AlumniRepository;

@Repository
@SuppressWarnings({ "rawtypes", "unchecked" })
public class AlumniRepositoryImpl extends BaseRepositoryImpl implements AlumniRepository{
	Logger logger = Logger.getLogger(getClass());
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<Alumni> findAll() {
		String sql = "SELECT * FROM alumni";
		List<Alumni> listData = jdbcTemplate.query(sql, new BeanPropertyRowMapper(Alumni.class));
		return listData;
	}

	@Override
	public String callSpApiAnggota(String cmd, Alumni alumni) {
		this.setStoredProcedure(true);

		logger.info("==============================================================");
		logger.info("Alumni {} :" + alumni.toString());
		logger.info("==============================================================");

		Map<String, Object> inParamMap = new HashMap<>();
		inParamMap.put("I_CMD", cmd);
		inParamMap.put("I_ID", alumni.getId());
		inParamMap.put("I_ANGGOTAID", alumni.getAnggota_id());
		inParamMap.put("I_NAMA", alumni.getNama());
		inParamMap.put("I_ALAMAT", alumni.getAlamat());
		inParamMap.put("I_EMAIL", alumni.getEmail());
		inParamMap.put("I_KONTAK", alumni.getKontak());
		inParamMap.put("I_PIC", alumni.getPic());
		inParamMap.put("I_PROFESI", alumni.getProfesi());
		inParamMap.put("I_CREATEBY", alumni.getCreated_by());
		inParamMap.put("I_UPDATEBY", alumni.getUpdated_by());
		inParamMap.put("I_CREATEDTERMINAL", alumni.getCreated_terminal());
		inParamMap.put("I_UPDATETERMINAL", alumni.getUpdated_terminal());
		SimpleJdbcCall call = new SimpleJdbcCall(jdbcTemplate);
		Map<String, Object> map = call.withoutProcedureColumnMetaDataAccess().withProcedureName("SP_API_ALUMNI")
				.declareParameters(new SqlParameter[] {
						new SqlParameter("I_CMD", Types.INTEGER),
						new SqlParameter("I_ID", Types.INTEGER),
						new SqlParameter("I_ANGGOTAID", Types.INTEGER),
						new SqlParameter("I_NAMA", Types.VARCHAR),
						new SqlParameter("I_ALAMAT", Types.VARCHAR),
						new SqlParameter("I_EMAIL", Types.VARCHAR),
						new SqlParameter("I_KONTAK", Types.VARCHAR),
						new SqlParameter("I_PIC", Types.BLOB),
						new SqlParameter("I_CREATEBY", Types.VARCHAR),
						new SqlParameter("I_UPDATEBY", Types.VARCHAR),
						new SqlParameter("I_CREATEDTERMINAL", Types.VARCHAR),
						new SqlParameter("I_UPDATETERMINAL", Types.VARCHAR),
						new SqlOutParameter("O_STATUS_MSG", Types.VARCHAR) })
				.execute(inParamMap);
		return (String) map.get("O_STATUS_MSG");
	}

	@Override
	public boolean isExist(Integer id) {
		String sql = "SELECT COUNT (1) FROM alumni WHERE ID = ?";
		Integer count = jdbcTemplate.queryForObject(sql, Integer.class, id);
		return count != null && count > 0;
	}

	@Override
	public Alumni findOneById(Integer id) {
		String sql = "SELECT * FROM alumni WHERE ID = ?";
		Alumni alumni = (Alumni)jdbcTemplate.queryForObject(sql, new Object[] {id},new BeanPropertyRowMapper(Alumni.class));

		return alumni;
	}

}
