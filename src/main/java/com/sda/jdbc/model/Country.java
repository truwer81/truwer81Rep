package com.sda.jdbc.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "country")
public class Country {
    @Id
    private String code;
    @Column(name = "name")
    private String name;
    @ManyToOne
    @JoinColumn(name = "capital")
    private City capitalCity;

    @Column(name = "population")
    private String population;
    @Column(name = "district")
    private String region;


    public Country(String code, String name, City capitalCity, String population, String region) {
        this.code = code;
        this.name =name;
        this.capitalCity = capitalCity;
        this.region = region;
        this.population =population;
    }
    public Country() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCapitalCity() {
        return capitalCity;
    }

    public void setCapitalCity(City capitalCity) {
        this.capitalCity = capitalCity;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "Country{code="+code+"/name="+ name +"/capital city="+ capitalCity +"/population="+population+"} ";
    }
}