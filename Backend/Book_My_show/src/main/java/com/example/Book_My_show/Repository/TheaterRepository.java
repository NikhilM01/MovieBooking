package com.example.Book_My_show.Repository;

import com.example.Book_My_show.Entity.TheaterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TheaterRepository extends JpaRepository<TheaterEntity,Integer> {


}