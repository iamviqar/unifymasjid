package com.hqv.unifymasjid.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hqv.unifymasjid.pojo.MasjidDto;
import com.hqv.unifymasjid.service.MasjidService;

@RestController

public class MasjidRestApi {

	@Autowired
	MasjidService masjidService;

	@PostMapping("/masjiddto")
	public MasjidDto saveMasjid(@RequestBody MasjidDto masjidDto) {
		masjidService.saveMasjid(masjidDto);
		return masjidDto;
	}
}