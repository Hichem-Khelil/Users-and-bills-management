package com.example.payroll;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity

public class Bill {

    private @Id Long id;
    private String dateEmission;
    private String dateEchéance;
    private Long montantTotal;
    private String statut;
    private String méthodePaiement;
    @ManyToOne
    @JoinColumn(name = "employee_id")
    @JsonIgnore
    private Employee employee;
    //private Long employeeId;


    public Bill() {
    }

    public Bill(Long id,
                String dateEmission,
                String dateEchéance,
                Long montantTotal,
                String statut,
                String méthodePaiement
                 /*Long employeeId*/) {
        this.id = id;
        this.dateEmission = dateEmission;
        this.dateEchéance = dateEchéance;
        this.montantTotal = montantTotal;
        this.statut = statut;
        this.méthodePaiement = méthodePaiement;
        //this.employeeId=employeeId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDateEmission() {
        return dateEmission;
    }

    public void setDateEmission(String dateEmission) {
        this.dateEmission = dateEmission;
    }

    public String getDateEchéance() {
        return dateEchéance;
    }

    public void setDateEchéance(String dateEchéance) {
        this.dateEchéance = dateEchéance;
    }

    public Long getMontantTotal() {
        return montantTotal;
    }

    public void setMontantTotal(Long montantTotal) {
        this.montantTotal = montantTotal;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getMéthodePaiement() {
        return méthodePaiement;
    }

    public void setMéthodePaiement(String méthodePaiement) {
        this.méthodePaiement = méthodePaiement;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    /*
    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }*/


    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", dateEmission=" + dateEmission +
                ", dateEchéance=" + dateEchéance +
                ", montantTotal=" + montantTotal +
                ", statut='" + statut + '\'' +
                ", méthodePaiement='" + méthodePaiement + '\'' +
                ", employee=" + employee +

                '}';
    }
}
