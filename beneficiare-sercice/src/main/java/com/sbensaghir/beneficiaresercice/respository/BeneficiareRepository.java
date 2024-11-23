package com.sbensaghir.beneficiaresercice.respository;

import com.sbensaghir.beneficiaresercice.entites.Beneficiare;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BeneficiareRepository extends JpaRepository<Beneficiare,Long> {
}
