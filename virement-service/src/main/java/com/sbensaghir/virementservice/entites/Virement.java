package com.sbensaghir.virementservice.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;
@Entity
@AllArgsConstructor @NoArgsConstructor @Getter @Setter @Builder
public class Virement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long virementId;

    private Long beneficiaireId;
    private String ribSource;
    private Double montant;
    private String description;
    private Date date;
    private Type type;
}
