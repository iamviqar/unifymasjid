package com.hqv.unifymasjid.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
	
	 @OneToMany(targetEntity = Prayer_time.class,cascade = CascadeType.ALL)
	    @JoinColumn(name ="masjid_id",referencedColumnName = "masjid_id")
	    private List<Prayer_time> prayers;
	
	
	/*
	 * @OneToMany(cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "pt", referencedColumnName = "id") List<Prayer_time>
	 * prayer_times = new ArrayList<>();
	 */
	
	/*
	 * @OneToMany(fetch = FetchType.EAGER) private List<Prayer_time> prayer_times;
	 */
	
	
	/*
	 * @OneToMany(fetch = FetchType.EAGER, mappedBy = "prayer_time", cascade =
	 * CascadeType.ALL) private List<Prayer_time> prayer_times;
	 */
	
	
	
	/*
	 * @OneToMany(mappedBy="masjid") private Set<Prayer_time> times ;
	 */

}
