package com.hqv.unifymasjid.pojo;

import java.util.List;


import lombok.Data;

@Data
public class MasjidDto {

	private Long masjid_id;
	private String name;
	private String address;
	private String phone;
	private String email;
	private String area_code;
	private String username;
	private String contact_person_name;
	private String contact_person_phone;
	private String contact_person_email;

	private List<Masjid_memberDto> masjid_memberList;
	private List<Prayer_timeDto> prayer_timeList;
	private List<Masjid_aliasDto> masjid_aliasList;

}
