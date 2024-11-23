package com.sbensaghir.virementservice.services;

import com.sbensaghir.virementservice.entites.Virement;
import com.sbensaghir.virementservice.repository.VirementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class VirementService {
@Autowired
    private  VirementRepository virementRepository;



    public List<Virement> getAllVirements() {
        return virementRepository.findAll();
    }

    public List<Virement> getVirementsByBeneficiaire(Long beneficiaireId) {
        return virementRepository.findByBeneficiaireId(beneficiaireId);
    }

    public Virement saveVirement(Virement virement) {
        return virementRepository.save(virement);
    }
}
