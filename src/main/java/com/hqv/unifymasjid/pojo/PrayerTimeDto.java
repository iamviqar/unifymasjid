package com.hqv.unifymasjid.pojo;

import lombok.Data;

@Data
public class PrayerTimeDto {
	private Long pid;
	private String name;
	private String call_time;
	private String prayer_time;

	private MasjidDto masjidDto;

}
