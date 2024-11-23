package com.sbensaghir.beneficiaresercice;

import com.sbensaghir.beneficiaresercice.entites.Beneficiare;
import com.sbensaghir.beneficiaresercice.enums.Type;
import com.sbensaghir.beneficiaresercice.respository.BeneficiareRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BeneficiareSerciceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeneficiareSerciceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(BeneficiareRepository beneficiareRepository){
        return  args -> {
            beneficiareRepository.save(Beneficiare.builder()
                            .nom("Ben saghir").prenom("Salaheddine").rib(2222).type(Type.Physique)
                    .build());
            beneficiareRepository.save(Beneficiare.builder()
                    .nom("Amine").prenom("Mohamed").rib(544545).type(Type.Morale)
                    .build());
            beneficiareRepository.save(Beneficiare.builder()
                    .nom("said").prenom("mounir").rib(126355).type(Type.Physique)
                    .build());

            beneficiareRepository.findAll().forEach(beneficiare -> {
                System.out.println("...................");
                System.out.println(beneficiare.getId());
                System.out.println(beneficiare.getNom());
                System.out.println(beneficiare.getPrenom());
                System.out.println(beneficiare.getRib());
                System.out.println(beneficiare.getType());
                System.out.println("...................");

            });
        };
    }

}
