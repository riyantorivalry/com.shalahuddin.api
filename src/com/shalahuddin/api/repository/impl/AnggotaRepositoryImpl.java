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

import com.shalahuddin.api.dto.AnggotaDto;
import com.shalahuddin.api.entity.Anggota;
import com.shalahuddin.api.repository.AnggotaRepository;

@Repository
@SuppressWarnings({ "rawtypes", "unchecked" })
public class AnggotaRepositoryImpl extends BaseRepositoryImpl implements AnggotaRepository  {
	Logger logger = Logger.getLogger(getClass());
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<Anggota> findAll() {
		String sql = "SELECT * FROM anggota";
		List<Anggota> listData = jdbcTemplate.query(sql, new BeanPropertyRowMapper(Anggota.class));
		return listData;
	}

	@Override
	public String callSpApiAnggota(String cmd, AnggotaDto anggota) {
		this.setStoredProcedure(true);

		logger.info("==============================================================");
		logger.info("anggota {} :" + anggota.toString());
		logger.info("==============================================================");

		Map<String, Object> inParamMap = new HashMap<>();
		inParamMap.put("I_CMD", cmd);
		inParamMap.put("I_ID", anggota.getId());
		inParamMap.put("I_NAMA", anggota.getNama());
		inParamMap.put("I_ALAMAT", anggota.getAlamat());
		inParamMap.put("I_ANGKATAN", anggota.getAngkatan());
		inParamMap.put("I_DEPARTEMENID", anggota.getDepartemen_id());
		inParamMap.put("I_EMAIL", anggota.getEmail());
		inParamMap.put("I_KEANGGOTAAN", anggota.getKeanggotaan());
		inParamMap.put("I_KONTAK", anggota.getKontak());
		inParamMap.put("I_KOTALAHIR", anggota.getKota_lahir());
		inParamMap.put("I_PIC", anggota.getPic());
		inParamMap.put("I_PRODI", anggota.getProdi());
		inParamMap.put("I_TANGGALLAHIR", anggota.getTangggal_lahir());
		inParamMap.put("I_UNIVERSITAS", anggota.getUniversitas());
		inParamMap.put("I_ISACTIVE", anggota.getIs_active());
		inParamMap.put("I_CREATEBY", anggota.getCreated_by());
		inParamMap.put("I_UPDATEBY", anggota.getUpdated_by());
		inParamMap.put("I_CREATEDTERMINAL", anggota.getCreated_terminal());
		inParamMap.put("I_UPDATETERMINAL", anggota.getUpdated_terminal());
		SimpleJdbcCall call = new SimpleJdbcCall(jdbcTemplate);
		Map<String, Object> map = call.withoutProcedureColumnMetaDataAccess().withProcedureName("SP_API_ANGGOTA")
				.declareParameters(new SqlParameter[] {
						new SqlParameter("I_CMD", Types.INTEGER),
						new SqlParameter("I_ID", Types.INTEGER),
						new SqlParameter("I_NAMA", Types.VARCHAR),
						new SqlParameter("I_ALAMAT", Types.VARCHAR),
						new SqlParameter("I_ANGKATAN", Types.VARCHAR),
						new SqlParameter("I_DEPARTEMENID", Types.SMALLINT),
						new SqlParameter("I_EMAIL", Types.VARCHAR),
						new SqlParameter("I_KEANGGOTAAN", Types.VARCHAR),
						new SqlParameter("I_KONTAK", Types.VARCHAR),
						new SqlParameter("I_KOTALAHIR", Types.VARCHAR),
						new SqlParameter("I_PIC", Types.BLOB),
						new SqlParameter("I_PRODI", Types.VARCHAR),
						new SqlParameter("I_TANGGALLAHIR", Types.DATE),
						new SqlParameter("I_UNIVERSITAS", Types.VARCHAR),
						new SqlParameter("I_ISACTIVE", Types.BOOLEAN),
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
		String sql = "SELECT COUNT (1) FROM anggota WHERE ID = ?";
		Integer count = jdbcTemplate.queryForObject(sql, Integer.class, id);
		return count != null && count > 0;
	}

	@Override
	public Anggota findOneById(Integer id) {
		String sql = "SELECT * FROM anggota WHERE ID = ?";
		Anggota anggota = (Anggota)jdbcTemplate.queryForObject(sql, new Object[] {id},new BeanPropertyRowMapper(Anggota.class));

		return anggota;
	}
}
