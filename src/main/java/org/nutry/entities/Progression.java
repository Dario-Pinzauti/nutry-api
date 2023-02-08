package org.nutry.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;
@Entity
@Table(name = "PROGRESSION")
public class Progression {
    private Long id;

    private String weight;
    private Date date;

    private Set<Diet> diet;

    @Id
    @Column(name = "PROGRESION_ID")
    @SequenceGenerator(name = "seq_progression", sequenceName = "seq_id_progression", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "seq_progression")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Column(name = "PROGRESSION_WEIGHT")
    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
    @Column(name = "PROGRESSION_DATE")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    @ManyToMany
    @JoinTable(
            name = "DIET_PROGRESSION",
            joinColumns = { @JoinColumn(name = "PROGRESSION_ID") },
            inverseJoinColumns = { @JoinColumn(name = "DIET_ID") }
    )
    public Set<Diet> getDiet() {
        return diet;
    }

    public void setDiet(Set<Diet> diet) {
        this.diet = diet;
    }


}
