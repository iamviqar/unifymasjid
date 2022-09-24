package com.hqv.unifymasjid.restapi;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hqv.unifymasjid.entity.Masjid;
import com.hqv.unifymasjid.pojo.MasjidDto;
import com.hqv.unifymasjid.service.MasjidService;

@RestController
public class MasjidRestapi {
	@Autowired
	MasjidService masjidService;

	@PostMapping("/masjiddto")
	public MasjidDto saveMasjid(@RequestBody MasjidDto masjidDto) {
		masjidService.saveMasjid(masjidDto);

		return masjidDto;
	}
	
	@PutMapping("/masjids/{id}")
	public MasjidDto updateMasjid(

			@RequestBody MasjidDto masjidDto, @PathVariable("id") long id) {
		masjidService.updateMasjid(masjidDto, id);
		return masjidDto;
	}
	
	@GetMapping("/getmasjid")
	public List<Masjid> getList() {
		return this.masjidService.getList();
	}

	@GetMapping("/getmasjid/{id}")
	public Optional<Masjid> getMasjidByMasjid_id(@PathVariable("id") long masjid_id) {
		return this.masjidService.getMasjidByMasjid_id(masjid_id);
	}

}
