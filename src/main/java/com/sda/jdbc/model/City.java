package com.sda.jdbc.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Table;
@Entity
@Table(name = "city")
public class City {
    @Id
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "countrycode")
    private String countryCode;
    @Column(name = "district")
    private String district;
    @Column(name = "population")
    private Integer population;

    public City(Long id, String name, String countryCode, String district, Integer population) {
        this.id = id;
        this.name = name;
        this.countryCode = countryCode;
        this.district = district;
        this.population = population;
    }

    public City() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountrycode() {
        return countryCode;
    }

    public String getDistrict() {
        return district;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "City{id="+id+"/countrycode="+countryCode+"/name="+ name +"/population="+population+"} ";
    }
}