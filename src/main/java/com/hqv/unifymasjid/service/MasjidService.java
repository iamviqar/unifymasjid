package com.hqv.unifymasjid.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hqv.unifymasjid.assembler.MasjidAssembler;
import com.hqv.unifymasjid.entity.Masjid;
import com.hqv.unifymasjid.entity.Masjid_alias;
import com.hqv.unifymasjid.entity.Masjid_member;
import com.hqv.unifymasjid.entity.Prayer_time;
import com.hqv.unifymasjid.pojo.MasjidDto;
import com.hqv.unifymasjid.pojo.Masjid_aliasDto;
import com.hqv.unifymasjid.pojo.Masjid_memberDto;
import com.hqv.unifymasjid.pojo.Prayer_timeDto;
import com.hqv.unifymasjid.repository.MasjidRepository;
import com.hqv.unifymasjid.repository.Masjid_aliasRepository;
import com.hqv.unifymasjid.repository.Masjid_memberRepository;
import com.hqv.unifymasjid.repository.Prayer_timeRepository;

@Service
public class MasjidService {
	@Autowired
	private MasjidRepository masjidRepository;
	@Autowired
	private Masjid_memberRepository masjid_memberRepository;
	@Autowired
	private Prayer_timeRepository prayer_timeRepository;
	@Autowired
	private Masjid_aliasRepository masjid_aliasRepository;
	@Autowired
	private MasjidAssembler masjidAssembler;

	public MasjidDto saveMasjid(MasjidDto masjidDto) {
		Masjid masjid = masjidRepository.save(masjidAssembler.assembleMasjid(masjidDto));

		for (Masjid_aliasDto masjid_aliasDto : masjidDto.getMasjid_aliasList()) {
			Masjid_alias masjid_alias = masjidAssembler.assembleMasjid_alias(masjid_aliasDto);
			masjid_alias.setMasjid(masjid);
			masjid_aliasRepository.save(masjid_alias);
		}
		for (Masjid_memberDto masjid_memberDto : masjidDto.getMasjid_memberList()) {
			Masjid_member masjid_member = masjidAssembler.assembleMasjid_member(masjid_memberDto);
			masjid_member.setMasjid(masjid);
			masjid_memberRepository.save(masjid_member);
		}
		for (Prayer_timeDto prayer_timeDto : masjidDto.getPrayer_timeList()) {
			Prayer_time prayer_time = masjidAssembler.assemblePrayer_time(prayer_timeDto);
			prayer_time.setMasjid(masjid);
			prayer_timeRepository.save(prayer_time);
		}
		return masjidDto;

	}
	public MasjidDto updateMasjid(MasjidDto masjidDto, long id) {
		masjidDto.setMasjid_id(id);
		Masjid masjid = masjidAssembler.assembleMasjid(masjidDto);
		masjidRepository.save(masjid);
		return masjidDto;
	}
	public Optional<Masjid> getMasjidById(long id) {
		List<Masjid_member> listmm = masjid_memberRepository.findByMasjidId(id);
		
		
		return masjidRepository.findById(id);
		
		
	}
	public List<Masjid> getList() {
		return masjidRepository.findAll();
	}
	
	/*
	 * public Optional<Masjid_member> getMasjidMById(long id) { return
	 * masjid_memberRepository.findById(id);
	 * 
	 * }
	 */
	
	
	
	
}
