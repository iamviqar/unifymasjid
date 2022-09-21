package com.hqv.unifymasjid.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hqv.unifymasjid.entity.MasjidMembers;
@Repository
public interface MasjidMembersRepository extends JpaRepository<MasjidMembers, Long> {

}
