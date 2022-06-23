package com.example.demo.Service;


import com.example.demo.entity.Fiche;
import com.example.demo.repository.FicheRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor

public class FicheService {
    private FicheRepository t;
  /*  public List<Fiche> getFiches(){
        return t.getAllFicheByDueDate();
    }*/
    public Optional<Fiche> getFicheById(Long id){// optional
       return t.findById(id);
    }

    public Fiche save(Fiche Fiche) {
       return t.saveAndFlush(Fiche);
    }

    public boolean existsById(Long id) {
        return t.existsById(id);
    }

    public void deleteFiche(Long id) {
        t.deleteById(id);
    }

    /*public List<obj> getCount(){
        return t.getCount();
    }*/
}
