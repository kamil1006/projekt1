package com.komowo.projekt1.repository;

import com.komowo.projekt1.entity.Medal;
import com.komowo.projekt1.entity.Pracownik;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedalRepository extends JpaRepository<Medal,String> {


}
