package com.shalahuddin.api.entity;

import java.util.Arrays;

public class Tokoh extends BaseEntity {
	private Integer id;
	private String nama;
	private String gelar_depan;
	private String gelar_belakang;
	private String bidang_keahlian;
	private String alamat;
	private String kontak;
	private String email;
	private String catatan;
	private byte[] pic;
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
	public String getGelar_depan() {
		return gelar_depan;
	}
	public void setGelar_depan(String gelar_depan) {
		this.gelar_depan = gelar_depan;
	}
	public String getGelar_belakang() {
		return gelar_belakang;
	}
	public void setGelar_belakang(String gelar_belakang) {
		this.gelar_belakang = gelar_belakang;
	}
	public String getBidang_keahlian() {
		return bidang_keahlian;
	}
	public void setBidang_keahlian(String bidang_keahlian) {
		this.bidang_keahlian = bidang_keahlian;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
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
	public String getCatatan() {
		return catatan;
	}
	public void setCatatan(String catatan) {
		this.catatan = catatan;
	}
	public byte[] getPic() {
		return pic;
	}
	public void setPic(byte[] pic) {
		this.pic = pic;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alamat == null) ? 0 : alamat.hashCode());
		result = prime * result + ((bidang_keahlian == null) ? 0 : bidang_keahlian.hashCode());
		result = prime * result + ((catatan == null) ? 0 : catatan.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((gelar_belakang == null) ? 0 : gelar_belakang.hashCode());
		result = prime * result + ((gelar_depan == null) ? 0 : gelar_depan.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((kontak == null) ? 0 : kontak.hashCode());
		result = prime * result + ((nama == null) ? 0 : nama.hashCode());
		result = prime * result + Arrays.hashCode(pic);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Tokoh other = (Tokoh) obj;
		if (alamat == null) {
			if (other.alamat != null) {
				return false;
			}
		} else if (!alamat.equals(other.alamat)) {
			return false;
		}
		if (bidang_keahlian == null) {
			if (other.bidang_keahlian != null) {
				return false;
			}
		} else if (!bidang_keahlian.equals(other.bidang_keahlian)) {
			return false;
		}
		if (catatan == null) {
			if (other.catatan != null) {
				return false;
			}
		} else if (!catatan.equals(other.catatan)) {
			return false;
		}
		if (email == null) {
			if (other.email != null) {
				return false;
			}
		} else if (!email.equals(other.email)) {
			return false;
		}
		if (gelar_belakang == null) {
			if (other.gelar_belakang != null) {
				return false;
			}
		} else if (!gelar_belakang.equals(other.gelar_belakang)) {
			return false;
		}
		if (gelar_depan == null) {
			if (other.gelar_depan != null) {
				return false;
			}
		} else if (!gelar_depan.equals(other.gelar_depan)) {
			return false;
		}
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (kontak == null) {
			if (other.kontak != null) {
				return false;
			}
		} else if (!kontak.equals(other.kontak)) {
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
		return true;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tokoh [id=");
		builder.append(id);
		builder.append(", nama=");
		builder.append(nama);
		builder.append(", gelar_depan=");
		builder.append(gelar_depan);
		builder.append(", gelar_belakang=");
		builder.append(gelar_belakang);
		builder.append(", bidang_keahlian=");
		builder.append(bidang_keahlian);
		builder.append(", alamat=");
		builder.append(alamat);
		builder.append(", kontak=");
		builder.append(kontak);
		builder.append(", email=");
		builder.append(email);
		builder.append(", catatan=");
		builder.append(catatan);
		builder.append(", pic=");
		builder.append(Arrays.toString(pic));
		builder.append("]");
		return builder.toString();
	}
}
