package org.sid.etdc.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor 
public class Evenements implements Serializable {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String libelleevenement;
	private String tiersevenement;
	@Temporal(TemporalType.TIMESTAMP)
	private Date hDevenement;
	@Temporal(TemporalType.TIMESTAMP)
	private Date hFevenement;
	private double dureeevenement;
	private String lieuevenement;
	private String detailsevenement;
	@Temporal(TemporalType.DATE)
	private Date dateevenement;
	@OneToMany(mappedBy = "evenements")
	private Collection<Solutions> solution;
	@ManyToOne
	private Personne personne;
	@ManyToOne
	private CategorieEvent catEvent;
}
