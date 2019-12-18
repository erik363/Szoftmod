package com.howtodoinjava.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "emberekk")
public class Employee {

	private Employee() {
		
	}

	public Employee(Long id, String name, String email, String telefonszam) {
	    this.id = id;
		this.email = email;
		this.name = name;
		this.telefonszam=telefonszam;
	}

	@Id
    private Long id;
    private String name;
	private String email;
	private String telefonszam;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTelefonszam() {
        return telefonszam;
    }

    public void setTelefonszam(String telefonszam) {
        this.telefonszam = telefonszam;
    }

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "email='" + email + '\'' +
                ", telefonszam='" + telefonszam + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
//
