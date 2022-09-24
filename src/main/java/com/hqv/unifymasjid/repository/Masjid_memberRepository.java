package com.hqv.unifymasjid.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hqv.unifymasjid.entity.Masjid_member;

@Repository
public interface Masjid_memberRepository extends JpaRepository<Masjid_member, Long> {
	
	
	List<Masjid_member> findByMasjidId(long id);

}
