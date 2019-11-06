package com.shalahuddin.api.utils;

public class MessageDetail {
	private int status;
	private String message;
	private Object detailMessage;

	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getDetailMessage() {
		return detailMessage;
	}
	public void setDetailMessage(Object detailMessage) {
		this.detailMessage = detailMessage;
	}
}
