package com.hqv.unifymasjid.assembler;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hqv.unifymasjid.entity.Masjid;
import com.hqv.unifymasjid.entity.Masjid_alias;
import com.hqv.unifymasjid.entity.Masjid_member;
import com.hqv.unifymasjid.entity.Prayer_time;
import com.hqv.unifymasjid.pojo.MasjidDto;
import com.hqv.unifymasjid.pojo.Masjid_aliasDto;
import com.hqv.unifymasjid.pojo.Masjid_memberDto;
import com.hqv.unifymasjid.pojo.Prayer_timeDto;

@Service
public class MasjidAssembler {

	public Masjid assembleMasjid(MasjidDto masjidDto) {
		Masjid masjid = null;
		if (masjidDto != null) {
			masjid = new Masjid();
			masjid.setId(masjidDto.getMasjid_id());
			masjid.setName(masjidDto.getName());
			masjid.setAddress(masjidDto.getAddress());
			masjid.setPhone(masjidDto.getPhone());
			masjid.setEmail(masjidDto.getEmail());
			masjid.setArea_code(masjidDto.getArea_code());
			masjid.setUsername(masjidDto.getUsername());
			masjid.setContact_person_name(masjidDto.getContact_person_name());
			masjid.setContact_person_phone(masjidDto.getContact_person_phone());
			masjid.setContact_person_email(masjidDto.getContact_person_email());

		}
		return masjid;

	}

	public Masjid_alias assembleMasjid_alias(Masjid_aliasDto masjid_aliasDto) {
		Masjid_alias masjid_alias = new Masjid_alias();
		masjid_alias.setId(masjid_aliasDto.getId());
		masjid_alias.setName(masjid_aliasDto.getName());
		masjid_alias.setMasjid(assembleMasjid(masjid_aliasDto.getMasjiddto()));
		return masjid_alias;
	}

	public Masjid_member assembleMasjid_member(Masjid_memberDto masjid_memberDto) {
		Masjid_member masjid_member = new Masjid_member();
		masjid_member.setId(masjid_memberDto.getId());
		masjid_member.setName(masjid_memberDto.getName());
		masjid_member.setEmail(masjid_memberDto.getEmail());
		masjid_member.setPhone(masjid_memberDto.getPhone());
		masjid_member.setMasjid(assembleMasjid(masjid_memberDto.getMasjiddto()));
		return masjid_member;
	}

	public Prayer_time assemblePrayer_time(Prayer_timeDto prayer_timeDto) {
		Prayer_time prayer_time = new Prayer_time();
		prayer_time.setId(prayer_timeDto.getId());
		prayer_time.setPname(prayer_timeDto.getPname());
		prayer_time.setCall_time(prayer_timeDto.getCall_time());
		prayer_time.setPrayer_time(prayer_timeDto.getPrayer_time());
		prayer_time.setMasjid(assembleMasjid(prayer_timeDto.getMasjiddto()));
		return prayer_time;

	}

}
