package models;

import java.sql.Blob;
import javax.persistence.*;

@Entity
@Table(name = "company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Blob descript;
    private Blob address;

    public Company() {
    }

    public Company(String name, Blob descript, Blob address) {
        this.name = name;
        this.descript = descript;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Blob getDescript() {
        return descript;
    }

    public void setDescript(Blob descript) {
        this.descript = descript;
    }

    public Blob getAddress() {
        return address;
    }

    public void setAddress(Blob address) {
        this.address = address;
    }
}