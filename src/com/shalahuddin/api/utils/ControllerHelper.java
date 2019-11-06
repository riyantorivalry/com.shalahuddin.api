package com.shalahuddin.api.utils;

import org.springframework.validation.BindingResult;

public class ControllerHelper {
	public static String parseValidationError(BindingResult result) {
		return result.getFieldError().getField() + " " + result.getFieldError().getDefaultMessage();
	}

}
