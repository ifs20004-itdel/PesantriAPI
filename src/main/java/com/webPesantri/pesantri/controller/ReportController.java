package com.webPesantri.pesantri.controller;

import com.webPesantri.pesantri.model.Report;
import com.webPesantri.pesantri.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/report")
@CrossOrigin(origins = "*")
public class ReportController {

    @Autowired
    private ReportService service;

    @PostMapping("/save")
    public Report saveReport(@RequestBody Report report){
        return service.saveReport(report);
    }

}
