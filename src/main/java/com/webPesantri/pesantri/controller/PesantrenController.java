package com.webPesantri.pesantri.controller;

import com.webPesantri.pesantri.model.Pesantren;
import com.webPesantri.pesantri.service.PesantrenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RestController
@RequestMapping("pesantren")
@CrossOrigin(origins = "*")
public class PesantrenController {

    @Autowired
    private PesantrenService pesantrenService;

    @GetMapping
    public ResponseEntity<List<Pesantren>> getAllPesantri(){
        return ResponseEntity.ok(pesantrenService.allPesantren());
    }
}
