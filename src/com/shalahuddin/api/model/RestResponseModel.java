package com.shalahuddin.api.model;

import java.util.List;

import org.apache.poi.ss.formula.functions.T;

import com.shalahuddin.api.utils.MessageDetail;

public class RestResponseModel {
	private MessageDetail info;
	private int totalRow;
	private String errorMessage;
	private List<T> content;

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
