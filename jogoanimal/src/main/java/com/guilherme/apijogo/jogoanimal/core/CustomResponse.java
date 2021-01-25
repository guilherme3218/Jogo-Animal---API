package com.guilherme.apijogo.jogoanimal.core;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomResponse<T> {

	private T data;

	private List<String> errors;

	public CustomResponse(T data) {
		this.data = data;
	}

	public CustomResponse(List<String> errors) {
		this.errors = errors;
	}

	public CustomResponse(T data, List<String> errors) {
		this.data = data;
		this.errors = errors;
	}

}