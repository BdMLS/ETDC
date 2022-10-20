package org.sid.etdc.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@SuppressWarnings("serial")
@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Personne implements Serializable {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private enum Civilite {MADAME, MADEMOISELLE, MONSIEUR};
private String nomPersonne;
private String prenomPersonne;
private String emailPersonne;
private Date ddnPersonne;
private String diagnosticConc;
private Date dateDiag;
private String lieuDiag;
@OneToMany(mappedBy = "personne")
private Collection<Adresses> adresses;
@OneToMany(mappedBy = "personne")
private Collection<Evenements> evenements;
@ManyToOne
private CatPersonne catPersonne;


}
