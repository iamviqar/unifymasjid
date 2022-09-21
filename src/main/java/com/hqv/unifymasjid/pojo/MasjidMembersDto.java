package com.hqv.unifymasjid.pojo;

import lombok.Data;

@Data
public class MasjidMembersDto {

	private Long mmid;
	private String name;
	private String phone;
	private String email;
	

	private MasjidDto masjidDto;

	
}
