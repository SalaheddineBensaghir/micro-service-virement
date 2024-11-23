package com.sbensaghir.beneficiaresercice.services;


import com.sbensaghir.beneficiaresercice.entites.Beneficiare;
import com.sbensaghir.beneficiaresercice.respository.BeneficiareRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Date;
import java.util.List;

@Service
public class BeneficiaireService {

    private  BeneficiareRepository beneficiareRepository;

    public BeneficiaireService(BeneficiareRepository repository) {
        this.beneficiareRepository = repository;
    }

    public List<Beneficiare> getAllBeneficiaires() {
        return beneficiareRepository.findAll();
    }

    public Beneficiare saveBeneficiaire(Beneficiare beneficiaire) {
        return beneficiareRepository.save(beneficiaire);
    }

}
