
package com.bezkoder.springjwt.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@Inheritance(strategy = InheritanceType.JOINED)
public class Employee implements Serializable {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long id;

    private String matricule;
    private String nomPrenom;
    private String adresse;
    private long telephone;
    private String tache;
    private int solde;


   @JsonIgnore
   @OneToMany(mappedBy="employee",
            cascade = CascadeType.ALL)
   private List<Conge> conge = new ArrayList<>();


   @ManyToMany(cascade = CascadeType.ALL)
   private List<JoursFeries> joursferies;


   @JsonIgnore
   @ManyToOne
   private Departement departement;

    @OneToOne
    private Carriere carriere;

    @OneToOne
    @JoinColumn(name="ACCOUNT_ID")
    private User account;


    public long getId() {
        return id;
    }

    public String getMatricule() {
        return matricule;
    }

    public String getNomPrenom() {
        return nomPrenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public long getTelephone() {
        return telephone;
    }

    public String getTache() {
        return tache;
    }

    public int getSolde() {
        return solde;
    }

    public List<Conge> getConge() {
        return conge;
    }

    public List<JoursFeries> getJoursferies() {
        return joursferies;
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public void setNomPrenom(String nomPrenom) {
        this.nomPrenom = nomPrenom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setTelephone(long telephone) {
        this.telephone = telephone;
    }

    public void setTache(String tache) {
        this.tache = tache;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }

    public void setConge(List<Conge> conge) {
        this.conge = conge;
    }

    public void setJoursferies(List<JoursFeries> joursferies) {
        this.joursferies = joursferies;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }
}
