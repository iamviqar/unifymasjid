package com.hqv.unifymasjid.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hqv.unifymasjid.entity.Masjid;
import com.hqv.unifymasjid.pojo.UserResponse;

@Repository
public interface MasjidRepository extends JpaRepository<Masjid, Long> {

	@Query("SELECT new com.hqv.unifymasjid.pojo.UserResponse (m.name , m.address , p.call_time , p.prayer_time , p.pname) FROM Masjid m JOIN m.prayers p")
	public List<UserResponse> MasjidInfo();
}
