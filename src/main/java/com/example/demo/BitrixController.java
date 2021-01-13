package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class BitrixController {
    @GetMapping
    public ResponseEntity teste(){
        return ResponseEntity.ok("teste");
    }
    @GetMapping("/{idDeal}")
    public ResponseEntity webhookSaida(@PathVariable Integer idDeal){
        System.out.println("idDeal: " + idDeal);
        return ResponseEntity.ok(idDeal);
    }
}
