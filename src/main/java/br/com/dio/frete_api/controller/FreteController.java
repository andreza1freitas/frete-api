package br.com.dio.frete_api.controller;


import br.com.dio.frete_api.entity.Frete;
import br.com.dio.frete_api.service.FreteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/frete")
public class FreteController {

    private final FreteService service;

    public FreteController(FreteService service) {
        this.service = service;
    }

    // CREATE
    @PostMapping
    public ResponseEntity<Frete> calcular(
            @RequestParam String tipo,
            @RequestParam Double peso) {

        return ResponseEntity.ok(
                service.calcular(tipo, peso)
        );
    }

    // READ
    @GetMapping
    public ResponseEntity<List<Frete>> listar() {

        return ResponseEntity.ok(service.listar());
    }

    // UPDATE
    @PutMapping("/{id}")
    public ResponseEntity<Frete> atualizar(
            @PathVariable Long id,
            @RequestParam String tipo,
            @RequestParam Double peso) {

        return ResponseEntity.ok(
                service.atualizar(id, tipo, peso)
        );
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(
            @PathVariable Long id) {

        service.excluir(id);

        return ResponseEntity.noContent().build();
    }
}
