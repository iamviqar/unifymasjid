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
@Data
@Table(name = "masjids_alias")
public class Masjid_alias {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")

	private Long id;
	private String name;

	@ManyToOne
	@JoinColumn(name = "masjid_id")
	private Masjid masjid;

}
