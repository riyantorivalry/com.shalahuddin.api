package com.shalahuddin.api.repository;

import java.util.List;

import com.shalahuddin.api.entity.Alumni;

public interface AlumniRepository {
	public List<Alumni> findAll();
	public String callSpApiAnggota (String cmd, Alumni anggota);
	public boolean isExist(Integer id);
	public Alumni findOneById(Integer id);

}
