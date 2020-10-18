package org.study.studying.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @Column(length = 50)
    private String email;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    private int score;

    public Etudiant() {
    }

    public Etudiant(Long id, String name, String email, Date dateNaissance, int score) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dateNaissance = dateNaissance;
        this.score = score;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dateNaissance=" + dateNaissance +
                ", score=" + score +
                '}';
    }
}
