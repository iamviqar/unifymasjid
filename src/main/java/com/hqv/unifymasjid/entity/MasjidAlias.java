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
@Table(name = "masjid_alias")
@Data
public class MasjidAlias {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "maid")
	
	private Long maid;
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "id")
	private Masjid masjid;


}
