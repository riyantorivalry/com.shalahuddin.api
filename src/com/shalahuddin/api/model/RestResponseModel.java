package com.shalahuddin.api.model;

import java.util.List;

import com.shalahuddin.api.utils.MessageDetail;

public class RestResponseModel <T>{
	private MessageDetail info;
	private int totalRow;
	private String errorMessage;
	private List<T> content;
	private String id;


	public RestResponseModel() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public MessageDetail getInfo() {
		return info;
	}
	public void setInfo(MessageDetail info) {
		this.info = info;
	}
	public int getTotalRow() {
		return totalRow;
	}
	public void setTotalRow(int totalRow) {
		this.totalRow = totalRow;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public List<T> getContent() {
		return content;
	}
	public void setContent(List<T> content) {
		this.content = content;
	}
}
