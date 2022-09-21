package com.hqv.unifymasjid.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hqv.unifymasjid.entity.Prayer_time;

@Repository
public interface Prayer_timeRepository extends JpaRepository<Prayer_time, Long> {

}
