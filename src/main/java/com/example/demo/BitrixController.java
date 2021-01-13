package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teste")
public class BitrixController {
    @GetMapping
    public ResponseEntity teste(){
        return ResponseEntity.ok("teste");
    }
    @PostMapping("/{idDeal}")
    public ResponseEntity webhookSaida(@PathVariable Integer idDeal,@RequestBody String json){
        System.out.println("idDeal: " + idDeal);
        System.out.println("Corpo: " + json);
        return ResponseEntity.ok(idDeal);
    }
}
