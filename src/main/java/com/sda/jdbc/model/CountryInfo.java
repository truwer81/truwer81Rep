package com.sda.jdbc.model;

public class CountryInfo {
    private String name;
    private String region;
    private String language;

    public CountryInfo(String name, String region, String language) {
        this.name = name;
        this.region = region;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Country{name="+ name +"/region="+ region +"/language="+language+"} ";
    }
}

