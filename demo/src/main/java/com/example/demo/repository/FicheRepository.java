package com.example.demo.repository;

import com.example.demo.entity.Fiche;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FicheRepository extends JpaRepository<Fiche,Long>
{@Query(value="select * from task order by name desc" ,nativeQuery = true)
    public List<Fiche> getAllTaskByDueDate();
/*    @Query(value="select new com.example.demo.DTO.obj (count(*),name) FROM Task group by name" )
    public List<obj> getCount();*/

}
