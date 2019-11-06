package com.shalahuddin.api.repository.impl;

import com.shalahuddin.api.utils.MessageDetail;

public class BaseRepositoryImpl {
	private MessageDetail info;
	private boolean isStoredProcedure;
	private int totalRow;

	public MessageDetail getInfo() {
		return info;
	}
	public void setInfo(MessageDetail info) {
		this.info = info;
	}
	public boolean isStoredProcedure() {
		return isStoredProcedure;
	}
	public void setStoredProcedure(boolean isStoredProcedure) {
		this.isStoredProcedure = isStoredProcedure;
	}
	public int getTotalRow() {
		return totalRow;
	}
	public void setTotalRow(int totalRow) {
		this.totalRow = totalRow;
	}
}
