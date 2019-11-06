package com.shalahuddin.api.dto;

import java.sql.Date;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonFormat;

public class AnggotaDto {
	private Integer id;
	private String nama;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date tangggal_lahir;
	private String kota_lahir;
	private String alamat;
	private String prodi;
	private String angkatan;
	private Integer departemen_id;
	private String kontak;
	private String email;
	private byte[] pic;
	private String universitas;
	private String keanggotaan;
	private boolean is_active;
	private String created_by;
	private String created_terminal;
	private String updated_by;
	private String updated_terminal;

	public AnggotaDto() {
	}

	public AnggotaDto(Integer id, String nama, Date tangggal_lahir, String kota_lahir, String alamat, String prodi,
			String angkatan, Integer departemen_id, String kontak, String email, byte[] pic, String universitas,
			String keanggotaan, boolean is_active, String created_by, String created_terminal, String updated_by,
			String updated_terminal) {
		super();
		this.id = id;
		this.nama = nama;
		this.tangggal_lahir = tangggal_lahir;
		this.kota_lahir = kota_lahir;
		this.alamat = alamat;
		this.prodi = prodi;
		this.angkatan = angkatan;
		this.departemen_id = departemen_id;
		this.kontak = kontak;
		this.email = email;
		this.pic = pic;
		this.universitas = universitas;
		this.keanggotaan = keanggotaan;
		this.is_active = is_active;
		this.created_by = created_by;
		this.created_terminal = created_terminal;
		this.updated_by = updated_by;
		this.updated_terminal = updated_terminal;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public Date getTangggal_lahir() {
		return tangggal_lahir;
	}
	public void setTangggal_lahir(Date tangggal_lahir) {
		this.tangggal_lahir = tangggal_lahir;
	}
	public String getKota_lahir() {
		return kota_lahir;
	}
	public void setKota_lahir(String kota_lahir) {
		this.kota_lahir = kota_lahir;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public String getProdi() {
		return prodi;
	}
	public void setProdi(String prodi) {
		this.prodi = prodi;
	}
	public String getAngkatan() {
		return angkatan;
	}
	public void setAngkatan(String angkatan) {
		this.angkatan = angkatan;
	}
	public Integer getDepartemen_id() {
		return departemen_id;
	}
	public void setDepartemen_id(Integer departemen_id) {
		this.departemen_id = departemen_id;
	}
	public String getKontak() {
		return kontak;
	}
	public void setKontak(String kontak) {
		this.kontak = kontak;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public byte[] getPic() {
		return pic;
	}
	public void setPic(byte[] pic) {
		this.pic = pic;
	}
	public String getUniversitas() {
		return universitas;
	}
	public void setUniversitas(String universitas) {
		this.universitas = universitas;
	}
	public String getKeanggotaan() {
		return keanggotaan;
	}
	public void setKeanggotaan(String keanggotaan) {
		this.keanggotaan = keanggotaan;
	}
	public boolean getIs_active() {
		return is_active;
	}
	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public String getCreated_terminal() {
		return created_terminal;
	}
	public void setCreated_terminal(String created_terminal) {
		this.created_terminal = created_terminal;
	}
	public String getUpdated_by() {
		return updated_by;
	}
	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}
	public String getUpdated_terminal() {
		return updated_terminal;
	}
	public void setUpdated_terminal(String updated_terminal) {
		this.updated_terminal = updated_terminal;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AnggotaDto [id=");
		builder.append(id);
		builder.append(", nama=");
		builder.append(nama);
		builder.append(", tangggal_lahir=");
		builder.append(tangggal_lahir);
		builder.append(", kota_lahir=");
		builder.append(kota_lahir);
		builder.append(", alamat=");
		builder.append(alamat);
		builder.append(", prodi=");
		builder.append(prodi);
		builder.append(", angkatan=");
		builder.append(angkatan);
		builder.append(", departemen_id=");
		builder.append(departemen_id);
		builder.append(", kontak=");
		builder.append(kontak);
		builder.append(", email=");
		builder.append(email);
		builder.append(", pic=");
		builder.append(Arrays.toString(pic));
		builder.append(", universitas=");
		builder.append(universitas);
		builder.append(", keanggotaan=");
		builder.append(keanggotaan);
		builder.append(", is_active=");
		builder.append(is_active);
		builder.append(", created_by=");
		builder.append(created_by);
		builder.append(", created_terminal=");
		builder.append(created_terminal);
		builder.append(", updated_by=");
		builder.append(updated_by);
		builder.append(", updated_terminal=");
		builder.append(updated_terminal);
		builder.append("]");
		return builder.toString();
	}
}
