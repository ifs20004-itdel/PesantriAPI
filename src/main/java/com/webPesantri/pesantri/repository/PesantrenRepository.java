package com.webPesantri.pesantri.repository;

import com.webPesantri.pesantri.model.Pesantren;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PesantrenRepository extends JpaRepository<Pesantren, Integer> {

}
