package com.example.demo;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Entity
public class Beer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Double abv;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getAbv() {
        return abv;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAbv(Double abv) {
        this.abv = abv;
    }
}
