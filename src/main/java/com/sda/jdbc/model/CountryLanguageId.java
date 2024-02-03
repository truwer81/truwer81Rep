package com.sda.jdbc.model;
import java.io.Serializable;
import java.util.Objects;

public class CountryLanguageId implements Serializable {
    private String countrycode;
    private String language;

    public CountryLanguageId() {
    }

    public CountryLanguageId(String countrycode, String language) {
        this.countrycode = countrycode;
        this.language = language;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CountryLanguageId)) return false;
        CountryLanguageId that = (CountryLanguageId) o;
        return Objects.equals(getCountrycode(), that.getCountrycode()) && Objects.equals(getLanguage(), that.getLanguage());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCountrycode(), getLanguage());
    }
}
