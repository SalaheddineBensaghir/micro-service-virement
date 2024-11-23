package com.sbensaghir.virementservice.repository;


import com.sbensaghir.virementservice.entites.Virement;
import com.sbensaghir.virementservice.services.VirementService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/virements")
public class VirementController {

    private  VirementService virementService;

    public VirementController(VirementService service) {
        this.virementService = service;
    }

    @GetMapping
    public List<Virement> getAllVirements() {
        return virementService.getAllVirements();
    }

    @GetMapping("/beneficiaire/{id}")
    public List<Virement> getVirementsByBeneficiaire(@PathVariable Long id) {
        return virementService.getVirementsByBeneficiaire(id);
    }

    @PostMapping
    public Virement createVirement(@RequestBody Virement virement) {
        return virementService.saveVirement(virement);
    }
}
