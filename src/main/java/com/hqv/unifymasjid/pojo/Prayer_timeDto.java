package com.hqv.unifymasjid.pojo;

import javax.persistence.Column;

import lombok.Data;

@Data
public class Prayer_timeDto {

	private Long id;
	@Column(name = "name")
	private String pname;
	private String call_time;
	private String prayer_time;
	private MasjidDto masjiddto;

}
