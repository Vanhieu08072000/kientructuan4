package com.example.springdatajpa.repository;


import com.example.springdatajpa.entity.ChuyenBay;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ChuyenBayRepository extends CrudRepository<ChuyenBay, String> {
    @Query("select cb from ChuyenBay cb where cb.gaDen = ?1")
    List<ChuyenBay> findChuyenBayByGaDen(String gaDen);

    @Query("select cb from ChuyenBay cb where cb.doDai between 8000 and 10000")
    List<ChuyenBay> findChuyenBayByDoDai();

    @Query("select cb from ChuyenBay cb where cb.gaDi = 'SGN' and cb.gaDen = 'BMV'")
    List<ChuyenBay> findChuyenBayByGaDiVaGaDen();

    @Query("select count(cb) from ChuyenBay cb where cb.gaDi = 'SGN'")
    int findChuyenBayByGaDi();


}
