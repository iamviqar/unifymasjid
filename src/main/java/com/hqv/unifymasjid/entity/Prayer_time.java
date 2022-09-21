package com.hqv.unifymasjid.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "prayer_times")
@Data

public class Prayer_time {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")


	private Long id;


	private String name;


	private String call_time;


	private String prayer_time;

	@ManyToOne
	@JoinColumn(name = "masjid_id")
	private Masjid masjid;

}
