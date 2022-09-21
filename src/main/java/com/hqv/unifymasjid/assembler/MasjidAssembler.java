package com.hqv.unifymasjid.assembler;

import org.springframework.stereotype.Service;

import com.hqv.unifymasjid.entity.Masjid;
import com.hqv.unifymasjid.entity.MasjidAlias;
import com.hqv.unifymasjid.entity.MasjidMembers;
import com.hqv.unifymasjid.entity.PrayerTime;
import com.hqv.unifymasjid.pojo.MasjidAliasDto;
import com.hqv.unifymasjid.pojo.MasjidDto;
import com.hqv.unifymasjid.pojo.MasjidMembersDto;
import com.hqv.unifymasjid.pojo.PrayerTimeDto;

@Service
public class MasjidAssembler {
	public Masjid assembleMasjid(MasjidDto masjidDto) {
		Masjid masjid = null;
		if(masjidDto!=null) {
		masjid = new Masjid();
		masjid.setId(masjidDto.getId());
		masjid.setArea_code(masjidDto.getArea_code());
		masjid.setName(masjidDto.getName());
		masjid.setAddress(masjidDto.getAddress());
		masjid.setPhone(masjidDto.getPhone());
		masjid.setEmail(masjidDto.getEmail());
		masjid.setUsername(masjidDto.getUsername());
		masjid.setContact_person_name(masjidDto.getContact_person_name());
		masjid.setContact_person_phone(masjidDto.getContact_person_phone());
		masjid.setContact_person_email(masjidDto.getContact_person_email());
		
		
	}
		return masjid;

	}

	public MasjidMembers assembleMasjidMembers(MasjidMembersDto masjidMembersDto) {
		MasjidMembers masjidMembers = new MasjidMembers();
		masjidMembers.setMmid(masjidMembersDto.getMmid());
		masjidMembers.setName(masjidMembersDto.getName());
		masjidMembers.setPhone(masjidMembersDto.getPhone());
		masjidMembers.setEmail(masjidMembersDto.getEmail());
		masjidMembers.setMasjid(assembleMasjid(masjidMembersDto.getMasjidDto()));
		return masjidMembers;
	}
	/*
	 * public List<MasjidMembers> assembleMasjidMembersList(MasjidDto masjidDto) {
	 * 
	 * List<MasjidMembers> masjidMembersList = new ArrayList<MasjidMembers>();
	 * for(MasjidMembersDto masjidMembersDto : masjidDto.getMasjidMembersList()) {
	 * MasjidMembers masjidMembers = new MasjidMembers();
	 * masjidMembers.setMmid(masjidMembersDto.getMmid());
	 * masjidMembers.setName(masjidMembersDto.getName());
	 * masjidMembers.setPhone(masjidMembersDto.getPhone());
	 * masjidMembers.setEmail(masjidMembersDto.getEmail());
	 * masjidMembers.setMasjid(assembleMasjid(masjidMembersDto.getMasjidDto()));
	 * masjidMembersList.add(masjidMembers); } return masjidMembersList; }
	 */
	
	public PrayerTime assemblePrayerTime(PrayerTimeDto prayerTimeDto) {
		PrayerTime prayerTime = new PrayerTime();
		prayerTime.setPid(prayerTimeDto.getPid());
		prayerTime.setName(prayerTimeDto.getName());
		prayerTime.setCall_time(prayerTimeDto.getCall_time());
		prayerTime.setPrayer_time(prayerTimeDto.getPrayer_time());
		prayerTime.setMasjid(assembleMasjid(prayerTimeDto.getMasjidDto()));
		return prayerTime;
	}

	/*
	 * public List<PrayerTime> assemblePrayerTimeList(MasjidDto masjidDto) {
	 * 
	 * List<PrayerTime> prayerTimeList = new ArrayList<PrayerTime>();
	 * for(PrayerTimeDto prayerTimeDto : masjidDto.getPrayerTimeList()) { PrayerTime
	 * prayerTime = new PrayerTime(); prayerTime.setPid(prayerTimeDto.getPid());
	 * prayerTime.setName(prayerTimeDto.getName());
	 * prayerTime.setCall_time(prayerTimeDto.getCall_time());
	 * prayerTime.setPrayer_time(prayerTimeDto.getPrayer_time());
	 * prayerTime.setMasjid(assembleMasjid(prayerTimeDto.getMasjidDto()));
	 * prayerTimeList.add(prayerTime); } return prayerTimeList;
	
	}
	 */
public MasjidAlias assembleMasjidAlias(MasjidAliasDto masjidAliasDto) {
	MasjidAlias masjidAlias = new MasjidAlias();
	masjidAlias.setMaid(masjidAliasDto.getMaid());
	masjidAlias.setName(masjidAliasDto.getName());
	masjidAlias.setMasjid(assembleMasjid(masjidAliasDto.getMasjidDto()));
	
	return masjidAlias;
	
}
/*
 * public List<MasjidAlias> assembleMasjidAliasList(MasjidAliasDto
 * masjidAliasDto) {
 * 
 * List<MasjidAlias> masjidAliasList = new ArrayList<MasjidAlias>();
 * for(MasjidAliasDto masjidAliasDto : masjidDto.getMasjidAliasList()) {
 * MasjidAlias masjidAlias = new MasjidAlias();
 * masjidAlias.setMaid(masjidAliasDto.getMaid());
 * masjidAlias.setName(masjidAliasDto.getName());
 * masjidAlias.setMasjid(assembleMasjid(masjidAliasDto.getMasjidDto()));
 * masjidAliasList.add(masjidAlias); } return masjidAliasList; }
 */


}

