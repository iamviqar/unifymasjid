package com.hqv.unifymasjid.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hqv.unifymasjid.pojo.MasjidDto;
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
	@PutMapping("/country/{id}")
	public MasjidDto updateMasjid(

			@RequestBody MasjidDto masjidDto, @PathVariable("id") long id) {
		masjidService.updateMasjid(masjidDto, id);
		return masjidDto;

	}

}
