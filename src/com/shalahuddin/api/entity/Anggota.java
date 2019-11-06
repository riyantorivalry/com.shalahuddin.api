package com.shalahuddin.api.entity;

import java.sql.Date;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Anggota extends BaseEntity {
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((alamat == null) ? 0 : alamat.hashCode());
		result = prime * result + ((angkatan == null) ? 0 : angkatan.hashCode());
		result = prime * result + ((departemen_id == null) ? 0 : departemen_id.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + (is_active ? 1231 : 1237);
		result = prime * result + ((keanggotaan == null) ? 0 : keanggotaan.hashCode());
		result = prime * result + ((kontak == null) ? 0 : kontak.hashCode());
		result = prime * result + ((kota_lahir == null) ? 0 : kota_lahir.hashCode());
		result = prime * result + ((nama == null) ? 0 : nama.hashCode());
		result = prime * result + Arrays.hashCode(pic);
		result = prime * result + ((prodi == null) ? 0 : prodi.hashCode());
		result = prime * result + ((tangggal_lahir == null) ? 0 : tangggal_lahir.hashCode());
		result = prime * result + ((universitas == null) ? 0 : universitas.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Anggota other = (Anggota) obj;
		if (alamat == null) {
			if (other.alamat != null) {
				return false;
			}
		} else if (!alamat.equals(other.alamat)) {
			return false;
		}
		if (angkatan == null) {
			if (other.angkatan != null) {
				return false;
			}
		} else if (!angkatan.equals(other.angkatan)) {
			return false;
		}
		if (departemen_id == null) {
			if (other.departemen_id != null) {
				return false;
			}
		} else if (!departemen_id.equals(other.departemen_id)) {
			return false;
		}
		if (email == null) {
			if (other.email != null) {
				return false;
			}
		} else if (!email.equals(other.email)) {
			return false;
		}
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (is_active != other.is_active) {
			return false;
		}
		if (keanggotaan == null) {
			if (other.keanggotaan != null) {
				return false;
			}
		} else if (!keanggotaan.equals(other.keanggotaan)) {
			return false;
		}
		if (kontak == null) {
			if (other.kontak != null) {
				return false;
			}
		} else if (!kontak.equals(other.kontak)) {
			return false;
		}
		if (kota_lahir == null) {
			if (other.kota_lahir != null) {
				return false;
			}
		} else if (!kota_lahir.equals(other.kota_lahir)) {
			return false;
		}
		if (nama == null) {
			if (other.nama != null) {
				return false;
			}
		} else if (!nama.equals(other.nama)) {
			return false;
		}
		if (!Arrays.equals(pic, other.pic)) {
			return false;
		}
		if (prodi == null) {
			if (other.prodi != null) {
				return false;
			}
		} else if (!prodi.equals(other.prodi)) {
			return false;
		}
		if (tangggal_lahir == null) {
			if (other.tangggal_lahir != null) {
				return false;
			}
		} else if (!tangggal_lahir.equals(other.tangggal_lahir)) {
			return false;
		}
		if (universitas == null) {
			if (other.universitas != null) {
				return false;
			}
		} else if (!universitas.equals(other.universitas)) {
			return false;
		}
		return true;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Anggota [id=");
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
		builder.append("]");
		return builder.toString();
	}
}
