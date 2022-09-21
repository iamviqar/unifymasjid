package com.hqv.unifymasjid.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hqv.unifymasjid.entity.Masjid_member;

@Repository
public interface Masjid_memberRepository extends JpaRepository<Masjid_member, Long> {

}
