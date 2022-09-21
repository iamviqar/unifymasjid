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

public class PrayerTime {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pid")
	private Long pid;
	private String name; 
	private String call_time;
	private String prayer_time;

	@ManyToOne
	@JoinColumn(name = "id")
	private Masjid masjid;

}
