package com.hqv.unifymasjid.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.hqv.unifymasjid.assembler.MasjidAssembler;
import com.hqv.unifymasjid.entity.Masjid;
import com.hqv.unifymasjid.entity.MasjidAlias;
import com.hqv.unifymasjid.entity.MasjidMembers;
import com.hqv.unifymasjid.entity.PrayerTime;
import com.hqv.unifymasjid.pojo.MasjidAliasDto;
import com.hqv.unifymasjid.pojo.MasjidDto;
import com.hqv.unifymasjid.pojo.MasjidMembersDto;
import com.hqv.unifymasjid.pojo.PrayerTimeDto;
import com.hqv.unifymasjid.repository.MasjidAliasRepository;
import com.hqv.unifymasjid.repository.MasjidMembersRepository;
import com.hqv.unifymasjid.repository.MasjidRepository;
import com.hqv.unifymasjid.repository.PrayerTimeRepository;

@Service
public class MasjidService {
	@Autowired
	private MasjidRepository masjidRepository;

	@Autowired
	private MasjidMembersRepository masjidMembersRepository;
	
	@Autowired
	private PrayerTimeRepository prayerTimeRepository;
	
	@Autowired
	private MasjidAliasRepository masjidAliasRepository;
	
	@Autowired
	private MasjidAssembler masjidAssembler;

	public MasjidDto saveMasjid(MasjidDto masjidDto) {
		Masjid masjid = masjidRepository.save(masjidAssembler.assembleMasjid(masjidDto));
		for (MasjidMembersDto masjidMembersDto : masjidDto.getMasjidMembersList()) {
		MasjidMembers masjidMembers = masjidAssembler.assembleMasjidMembers(masjidMembersDto);
			masjidMembers.setMasjid(masjid);
			masjidMembersRepository.save(masjidMembers);
		}
		for (PrayerTimeDto prayerTimeDto : masjidDto.getPrayerTimeList()) {
			PrayerTime prayerTime = masjidAssembler.assemblePrayerTime(prayerTimeDto);
			prayerTime.setMasjid(masjid);
			prayerTimeRepository.save(prayerTime);
		}
		
		for (MasjidAliasDto masjidAliasDto : masjidDto.getMasjidAliasList()) {
			MasjidAlias masjidAlias = masjidAssembler.assembleMasjidAlias(masjidAliasDto);
			masjidAlias.setMasjid(masjid);
			masjidAliasRepository.save(masjidAlias);
		}
		
	return masjidDto;
	}
	
}


