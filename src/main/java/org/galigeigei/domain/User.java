package org.galigeigei.domain;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class User implements Serializable {
	private Integer id;

	@NotNull(message = "姓名为空")
	private String name;

	private String address;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address == null ? null : address.trim();
	}
}