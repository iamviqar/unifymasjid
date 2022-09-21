package com.hqv.unifymasjid.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hqv.unifymasjid.entity.MasjidAlias;
@Repository
public interface MasjidAliasRepository extends JpaRepository<MasjidAlias, Long> {

}
