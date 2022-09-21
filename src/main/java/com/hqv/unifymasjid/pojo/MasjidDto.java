package com.hqv.unifymasjid.pojo;

import java.util.List;
import lombok.Data;

@Data
public class MasjidDto {
	private Long id;
	private String area_code;
	private String name;
	private String address;
	private String phone;
	private String email;
	private String username;
	private String contact_person_name;
	private String contact_person_phone;
	private String contact_person_email;

	public List<MasjidMembersDto> masjidMembersList;
	public List<PrayerTimeDto> prayerTimeList;
	public List<MasjidAliasDto> masjidAliasList;

}
