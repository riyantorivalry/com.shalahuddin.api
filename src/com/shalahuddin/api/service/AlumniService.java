package com.shalahuddin.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shalahuddin.api.entity.Alumni;
import com.shalahuddin.api.repository.AlumniRepository;

@Service
public class AlumniService {

	@Autowired
	AlumniRepository alumniRepo;

	public List<Alumni> findAll(){
		return alumniRepo.findAll();
	}

	public String save (Alumni anggota) {
		return alumniRepo.callSpApiAnggota("1", anggota);
	}

	public String update (Alumni anggota) {
		return alumniRepo.callSpApiAnggota("2", anggota);
	}

	public String delete (Alumni anggota) {
		return alumniRepo.callSpApiAnggota("3", anggota);
	}

	public boolean isExist(Integer id) {
		return alumniRepo.isExist(id);
	}

	public Alumni findOneById(Integer id) {
		return alumniRepo.findOneById(id);
	}

}
