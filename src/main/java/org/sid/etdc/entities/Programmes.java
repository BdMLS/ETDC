package org.sid.etdc.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor 
public class Programmes implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nameprog;
	@Temporal(TemporalType.DATE)
	private Date datedebut;
	@Temporal(TemporalType.DATE)
	private Date datefin;
	@OneToMany(mappedBy = "programmes")
	private Collection<Solutions> solutions;
	private enum statutprog {Partiel, Reussite, Abandon, Echec} ;   ;
}
