package com.komowo.projekt1.repository;

import com.komowo.projekt1.entity.Pracownik;
import com.komowo.projekt1.entity.PracownikDodatkowe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PracownikDodatkoweRepository extends JpaRepository<PracownikDodatkowe,String> {


}
