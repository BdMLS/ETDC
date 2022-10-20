package org.sid.etdc.dao;
import org.sid.etdc.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public interface EvenementsRepository extends JpaRepository<Evenements, Long> {

}
