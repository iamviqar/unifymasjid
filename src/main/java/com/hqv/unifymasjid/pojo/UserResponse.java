package com.hqv.unifymasjid.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserResponse {
	
	private String name;
	private String address;
	private String pname;
	private String call_time;
	private String prayer_time;

}
