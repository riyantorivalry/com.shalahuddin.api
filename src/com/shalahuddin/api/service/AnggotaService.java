package com.shalahuddin.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shalahuddin.api.dto.AnggotaDto;
import com.shalahuddin.api.entity.Anggota;
import com.shalahuddin.api.repository.AnggotaRepository;

@Service
public class AnggotaService {
	@Autowired
	AnggotaRepository anggotaRepo;

	public List<Anggota> findAll(){
		return anggotaRepo.findAll();
	}

	public String save (AnggotaDto anggota) {
		return anggotaRepo.callSpApiAnggota("1", anggota);
	}

	public String update (AnggotaDto anggota) {
		return anggotaRepo.callSpApiAnggota("2", anggota);
	}

	public String delete (AnggotaDto anggota) {
		return anggotaRepo.callSpApiAnggota("3", anggota);
	}

	public boolean isExist(Integer id) {
		return anggotaRepo.isExist(id);
	}

	public Anggota findOneById(Integer id) {
		return anggotaRepo.findOneById(id);
	}

}
