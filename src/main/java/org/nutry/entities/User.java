package org.nutry.entities;

import javax.persistence.*;
import java.util.List;
import java.util.Set;
@Entity
@Table(name = "USERS")
public class User {
    private Long id;
    private String name;
    private String surname;
    private String eMail;



    private Set<Progression> progressions;

    @Id
    @Column(name = "USER_ID")
    @SequenceGenerator(name = "seq_user", sequenceName = "seq_id_user", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "seq_user")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "USER_NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Column(name = "USER_SURNAME")
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    @Column(name = "USER_EMAIL")
    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    @OneToMany
    @JoinColumn(name = "USER_ID")
    public Set<Progression> getProgressions() {
        return progressions;
    }

    public void setProgressions(Set<Progression> progressions) {
        this.progressions = progressions;
    }
}
