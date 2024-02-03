package com.sda.jdbc.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.IdClass;


@IdClass(CountryLanguageId.class)
@Entity
@Table(name = "countrylanguage")
public class CountryLanguage {
    @Id
    private String countrycode;
    @Id
    private String language;
    @Column(name = "isofficial")
    private String isofficial;
  
    @Column(name = "percentage")
    private Double percentage;

    public CountryLanguage(String countrycode, String language, String isofficial, Double percentage) {
        this.countrycode = countrycode;
        this.language = language;
        this.isofficial = isofficial;
        this.percentage = percentage;
    }

    public CountryLanguage() {
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getIsofficial() {
        return isofficial;
    }

    public void setIsofficial(String isofficial) {
        this.isofficial = isofficial;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "CountryLanguage{countrycode="+countrycode+"/language="+ language +"/isofficial="+ isofficial +"/percentage="+ percentage +"} ";
    }
}