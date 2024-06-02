package com.casasbahia.filial.controller;

import com.casasbahia.filial.model.Filial;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/filial")
public class FilialController {
    @GetMapping
    public ResponseEntity<Filial> listarVendedores() {
        return ResponseEntity.ok(new Filial());
    }
}
