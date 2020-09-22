package com.komowo.projekt1.repository;

import com.komowo.projekt1.entity.Pracownik;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PracownikRepository extends JpaRepository<Pracownik,String> {


}
