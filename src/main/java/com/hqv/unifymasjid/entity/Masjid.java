package com.hqv.unifymasjid.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "masjids")
@Data

public class Masjid {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "masjid_id")

	private Long id;
	private String name;
	private String address;
	private String phone;
	private String email;
	private String area_code;
	private String username;
	private String contact_person_name;
	private String contact_person_phone;
	private String contact_person_email;

}
