package com.sbensaghir.beneficiaresercice.Config;

import com.sbensaghir.beneficiaresercice.entites.Beneficiare;
import com.sbensaghir.beneficiaresercice.respository.BeneficiareRepository;
import com.sbensaghir.beneficiaresercice.services.BeneficiaireService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/beneficiaires")
public class BeneficiaireController {

    private  BeneficiaireService service;
    private BeneficiareRepository beneficiareRepository;

    public BeneficiaireController(BeneficiaireService service) {
        this.service = service;
    }

    @GetMapping
    public List<Beneficiare> getAllBeneficiaires() {
        return service.getAllBeneficiaires();
    }

    @PostMapping
    public Beneficiare createBeneficiaire(@RequestBody Beneficiare beneficiaire) {
        return service.saveBeneficiaire(beneficiaire);
    }
    @PutMapping("/beneficiaire/{id}")
    public Beneficiare updateBeneficiaire(@PathVariable Long id, @RequestBody Beneficiare beneficiare){
        Beneficiare beneficiare1= beneficiareRepository.findById(id).orElseThrow(()->new RuntimeException(String.format("Account %s not found",id)));
        if (beneficiare.getNom()!=null)
            beneficiare1.setNom(beneficiare.getNom());
        if (beneficiare.getPrenom()!=null)
            beneficiare1.setNom(beneficiare.getNom());
        if (beneficiare.getType()!=null)
            beneficiare1.setType(beneficiare.getType());

        return beneficiareRepository.save(beneficiare1);
    }
}
