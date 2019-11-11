package com.shalahuddin.api.entity;

import java.util.Arrays;

public class Alumni extends BaseEntity{
	private Integer id;
	private String nama;
	private String alamat;
	private String kontak;
	private String email;
	private String profesi;
	private Integer anggota_id;
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
	public String getProfesi() {
		return profesi;
	}
	public void setProfesi(String profesi) {
		this.profesi = profesi;
	}
	public Integer getAnggota_id() {
		return anggota_id;
	}
	public void setAnggota_id(Integer anggota_id) {
		this.anggota_id = anggota_id;
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
		int result = super.hashCode();
		result = prime * result + ((alamat == null) ? 0 : alamat.hashCode());
		result = prime * result + ((anggota_id == null) ? 0 : anggota_id.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((kontak == null) ? 0 : kontak.hashCode());
		result = prime * result + ((nama == null) ? 0 : nama.hashCode());
		result = prime * result + Arrays.hashCode(pic);
		result = prime * result + ((profesi == null) ? 0 : profesi.hashCode());
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
		Alumni other = (Alumni) obj;
		if (alamat == null) {
			if (other.alamat != null) {
				return false;
			}
		} else if (!alamat.equals(other.alamat)) {
			return false;
		}
		if (anggota_id == null) {
			if (other.anggota_id != null) {
				return false;
			}
		} else if (!anggota_id.equals(other.anggota_id)) {
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
		if (profesi == null) {
			if (other.profesi != null) {
				return false;
			}
		} else if (!profesi.equals(other.profesi)) {
			return false;
		}
		return true;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Alumni [id=");
		builder.append(id);
		builder.append(", nama=");
		builder.append(nama);
		builder.append(", alamat=");
		builder.append(alamat);
		builder.append(", kontak=");
		builder.append(kontak);
		builder.append(", email=");
		builder.append(email);
		builder.append(", profesi=");
		builder.append(profesi);
		builder.append(", anggota_id=");
		builder.append(anggota_id);
		builder.append(", pic=");
		builder.append(Arrays.toString(pic));
		builder.append("]");
		return builder.toString();
	}
}
