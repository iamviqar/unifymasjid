package com.hqv.unifymasjid.pojo;

import javax.persistence.Column;

import lombok.Data;

@Data

public class Masjid_memberDto {
	private Long id;
	private String name;
	private String phone;
	private String email;
	private MasjidDto masjiddto;

}
