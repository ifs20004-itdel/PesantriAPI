package com.webPesantri.pesantri.service;

import com.webPesantri.pesantri.model.Report;
import com.webPesantri.pesantri.repository.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportService {

    @Autowired
    private ReportRepository repository;

    public Report saveReport( Report report){
        return repository.save(report);
    }
}
