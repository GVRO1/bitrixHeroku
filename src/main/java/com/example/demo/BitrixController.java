package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/teste")
public class BitrixController {
    @GetMapping
    public ResponseEntity teste(){
        return ResponseEntity.ok("teste");
    }
    @PostMapping("/{idDeal}/{nome}")
    public ResponseEntity webhookSaida(@PathVariable Integer idDeal,@PathVariable String nome,@RequestBody String json){
        System.out.println("idDeal: " + idDeal);
        System.out.println("nome: " + nome);
        System.out.println("Corpo: " + json);
        return ResponseEntity.ok(idDeal);
    }
}
