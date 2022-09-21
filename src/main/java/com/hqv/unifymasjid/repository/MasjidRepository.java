package com.hqv.unifymasjid.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hqv.unifymasjid.entity.Masjid;

@Repository
public interface MasjidRepository extends JpaRepository<Masjid, Long>{
	

}





