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
@Table(name = "masjid_members")
@Data
public class MasjidMembers {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "mmid")
	
	private Long mmid;
	private String name;
	private String phone;
	private String email;


	@ManyToOne
	@JoinColumn(name = "id")
	private Masjid masjid;

}
