package com.hqv.unifymasjid.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hqv.unifymasjid.pojo.MasjidDto;
import com.hqv.unifymasjid.pojo.Masjid_memberDto;
import com.hqv.unifymasjid.pojo.Prayer_timeDto;
import com.hqv.unifymasjid.service.MasjidService;

@RestController
public class MasjidRestapi {
	@Autowired
	MasjidService masjidService;
	
	
	
	
	@PostMapping("/masjid")
	public MasjidDto saveMasjid(@RequestBody MasjidDto masjidDto) {
		masjidService.saveMasjid(masjidDto);
		
		return masjidDto;
	}
	/*
	 * public Prayer_timeDto savePrayer_times(@RequestBody Prayer_timeDto
	 * prayer_timeDto) { masjidService.savePrayer_times(prayer_timeDto); return
	 * prayer_timeDto; } public Masjid_memberDto saveMasjid_members(@RequestBody
	 * Masjid_memberDto masjid_memberDto) {
	 * masjidService.saveMasjid_members(masjid_memberDto);
	 * 
	 * return masjid_memberDto; }
	 */
	

}
