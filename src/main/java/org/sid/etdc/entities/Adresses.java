package org.sid.etdc.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor 
public class Adresses implements Serializable {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomAdresse;
	private String libelleAdresse;
	private String complementAdresse;
	private String cpAdresse;
	private String departementAdresse;
	private String villeAdresse;
	private String paysAdresse;
	@ManyToOne
	private Personne personne;
	
	
	
}
