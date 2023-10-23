package com.webPesantri.pesantri.controller;

import com.webPesantri.pesantri.model.Pesantren;
import com.webPesantri.pesantri.service.PesantrenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

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

    @PostMapping("/create")
    public ResponseEntity<Pesantren> savePesantren(@RequestBody Pesantren pesantren){
        return ResponseEntity.ok(pesantrenService.savePesantren(pesantren));
    }

}
