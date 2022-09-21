package com.hqv.unifymasjid.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hqv.unifymasjid.entity.PrayerTime;

@Repository

public interface PrayerTimeRepository extends JpaRepository<PrayerTime, Long>{

}
