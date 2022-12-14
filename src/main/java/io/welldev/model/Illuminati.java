package io.welldev.model;

import javax.persistence.*;

@Entity

@Table(name = "illuminati")
public class Illuminati {

    @Id
    @Column(name="id")
    @SequenceGenerator(name="seq", sequenceName = "illuminati_id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
    private Integer id;
    private String name;
    private String country;
    private String Designation;
    private int balance;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Illuminati{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", Designation='" + Designation + '\'' +
                ", balance=" + balance +
                '}';
    }
}
