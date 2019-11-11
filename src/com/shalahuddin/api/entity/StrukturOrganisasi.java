package com.shalahuddin.api.entity;

public class StrukturOrganisasi extends BaseEntity{
	private int id;
	private String nama;
	private boolean is_active;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public boolean isIs_active() {
		return is_active;
	}
	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StrukturOrganisasi [id=");
		builder.append(id);
		builder.append(", nama=");
		builder.append(nama);
		builder.append(", is_active=");
		builder.append(is_active);
		builder.append("]");
		return builder.toString();
	}
}
