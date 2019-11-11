package com.shalahuddin.api.entity;

public class JabatanKepanitiaan extends BaseEntity{
	private int id;
	private String nama;

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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("JabatanKepanitiaan [id=");
		builder.append(id);
		builder.append(", nama=");
		builder.append(nama);
		builder.append("]");
		return builder.toString();
	}
}
