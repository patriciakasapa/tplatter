package turntabl.io.tplatter.models;

import jdk.jfr.DataAmount;

public class DomainTplatter {

    private Long id;
    private String city;
    private String temp;

    public DomainTplatter() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }
}

