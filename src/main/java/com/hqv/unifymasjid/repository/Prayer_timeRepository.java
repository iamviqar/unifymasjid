package com.hqv.unifymasjid.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hqv.unifymasjid.entity.Masjid_member;
import com.hqv.unifymasjid.entity.Prayer_time;

@Repository
public interface Prayer_timeRepository extends JpaRepository<Prayer_time, Long> {
	
	List<Prayer_time> findByMasjidId(long id);

}
