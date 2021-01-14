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

    @PostMapping("/jira/{issueId}/{issueKey}")
    public ResponseEntity webhookSaidaJira(@PathVariable Integer issueId,@PathVariable String issueKey,@RequestBody String json){
        System.out.println("issueId: " + issueId);
        System.out.println("issueKey: " + issueKey);
        System.out.println("CorpoJira: " + json);
        return ResponseEntity.ok(issueId);
    }
}
