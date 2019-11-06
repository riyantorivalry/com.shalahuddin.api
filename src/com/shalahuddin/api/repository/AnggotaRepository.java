package com.shalahuddin.api.repository;

import java.util.List;

import com.shalahuddin.api.dto.AnggotaDto;
import com.shalahuddin.api.entity.Anggota;

public interface AnggotaRepository {
	public List<Anggota> findAll();
	public String callSpApiAnggota (String cmd, AnggotaDto anggota);
	public boolean isExist(Integer id);
	public Anggota findOneById(Integer id);
}
