package com.example.demo.Controller;



import com.example.demo.Service.FicheService;
import com.example.demo.entity.Fiche;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.HashMap;
import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
@RequestMapping("/api/v1")
public class FicheController {
    private FicheService ts;
    /*@GetMapping("/Fiche")
    public List<Fiche> getFiches(){
        return ts.getFiches();
    }*/

    @GetMapping("/Fiche/{id}")
    public Fiche getFiche(@PathVariable Long id){
        return ts.getFicheById(id).orElseThrow(
                ()->new EntityNotFoundException("Requested Fiche not found")
        );

    }
    @PostMapping("/Fiche")
    public Fiche addFiche(@RequestBody Fiche Fiche)
    {
        return ts.save(Fiche);
    }
    @PutMapping("Fiche/{id}")//ResponseEntity<?> ? c'est a dire peut etre soit... soit..(if else)
    public ResponseEntity<?> addFiche(@RequestBody Fiche Fiche, @PathVariable Long id){
        if(ts.existsById(id)){
            Fiche Fiche1=ts.getFicheById(id).orElseThrow(()->new EntityNotFoundException("Request Fiche not found"));
            Fiche1.setNumFiche(Fiche.getNumFiche());
            ts.save(Fiche);
            return ResponseEntity.ok().body(Fiche1);
        }
        else {
            HashMap<String,String> message=new HashMap<>();
            message.put("message",id+"Fiche not found or matched");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
        }
    }
    @DeleteMapping("Fiche/{id}")//ResponseEntity<?> ? c'est a dire peut etre soit... soit..(if else)
    public ResponseEntity<?> deleteFiche(@PathVariable Long id) {
        if (ts.existsById(id)) {
            ts.deleteFiche(id);

            HashMap<String, String> message = new HashMap<>();
            message.put("message", id + "delete successfully");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);


        } else {
            HashMap<String,String> message=new HashMap<>();
            message.put("message",id+"Fiche not found or matched");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
        }

    }

   /* @GetMapping("/Fiche/m")
    public List<obj> getCount(){
        return ts.getCount();
    }*/
}
