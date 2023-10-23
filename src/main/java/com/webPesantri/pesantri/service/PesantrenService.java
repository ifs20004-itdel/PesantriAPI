package com.webPesantri.pesantri.service;

import com.webPesantri.pesantri.model.Pesantren;
import com.webPesantri.pesantri.repository.PesantrenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PesantrenService {

    @Autowired
    private PesantrenRepository pesantrenRepository;

    public List<Pesantren> allPesantren(){
        return pesantrenRepository.findAll();
    }

    public Pesantren savePesantren(Pesantren pesantren){
        return pesantrenRepository.save(pesantren);

    }

}