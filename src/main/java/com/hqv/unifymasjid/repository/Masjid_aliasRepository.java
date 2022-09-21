package com.hqv.unifymasjid.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hqv.unifymasjid.entity.Masjid_alias;

@Repository
public interface Masjid_aliasRepository extends JpaRepository<Masjid_alias, Long>  {

}
