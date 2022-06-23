package com.example.demo.repository;

import com.example.demo.entity.Fiche;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FicheRepository extends JpaRepository<Fiche,Long>
{

}
