package com.shalahuddin.api.entity;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

public class BaseEntity {
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss.SSS",timezone = "GMT+7")
	private Timestamp created_date;
	private String created_by;
	private String created_terminal;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss.SSS",timezone = "GMT+7")
	private Timestamp update_date;
	private String updated_by;
	private String updated_terminal;

	public Timestamp getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Timestamp created_date) {
		this.created_date = created_date;
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
	public Timestamp getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(Timestamp update_date) {
		this.update_date = update_date;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((created_by == null) ? 0 : created_by.hashCode());
		result = prime * result + ((created_date == null) ? 0 : created_date.hashCode());
		result = prime * result + ((created_terminal == null) ? 0 : created_terminal.hashCode());
		result = prime * result + ((update_date == null) ? 0 : update_date.hashCode());
		result = prime * result + ((updated_by == null) ? 0 : updated_by.hashCode());
		result = prime * result + ((updated_terminal == null) ? 0 : updated_terminal.hashCode());
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
		BaseEntity other = (BaseEntity) obj;
		if (created_by == null) {
			if (other.created_by != null) {
				return false;
			}
		} else if (!created_by.equals(other.created_by)) {
			return false;
		}
		if (created_date == null) {
			if (other.created_date != null) {
				return false;
			}
		} else if (!created_date.equals(other.created_date)) {
			return false;
		}
		if (created_terminal == null) {
			if (other.created_terminal != null) {
				return false;
			}
		} else if (!created_terminal.equals(other.created_terminal)) {
			return false;
		}
		if (update_date == null) {
			if (other.update_date != null) {
				return false;
			}
		} else if (!update_date.equals(other.update_date)) {
			return false;
		}
		if (updated_by == null) {
			if (other.updated_by != null) {
				return false;
			}
		} else if (!updated_by.equals(other.updated_by)) {
			return false;
		}
		if (updated_terminal == null) {
			if (other.updated_terminal != null) {
				return false;
			}
		} else if (!updated_terminal.equals(other.updated_terminal)) {
			return false;
		}
		return true;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BaseEntity [created_date=");
		builder.append(created_date);
		builder.append(", created_by=");
		builder.append(created_by);
		builder.append(", created_terminal=");
		builder.append(created_terminal);
		builder.append(", update_date=");
		builder.append(update_date);
		builder.append(", updated_by=");
		builder.append(updated_by);
		builder.append(", updated_terminal=");
		builder.append(updated_terminal);
		builder.append("]");
		return builder.toString();
	}
}
