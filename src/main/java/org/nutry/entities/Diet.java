package org.nutry.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "DIET")
public class Diet {
    private Long id;

    private String type;

    private Set<Progression> progression;


    private Set<DietDay> dietDay;

    public Diet() {
    }

    public Diet(Long id, String type, Set<Progression> progression, Set<DietDay> dietDay) {
        this.id = id;
        this.type = type;
        this.progression = progression;
        this.dietDay = dietDay;
    }

    @Id
    @Column(name = "DIET_ID")
    @SequenceGenerator(name = "seq_diet", sequenceName = "seq_id_diet", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "seq_diet")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Column(name = "DIET_TYPE")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @ManyToMany
    @JoinTable(
            name = "DIET_PROGRESSION",
            joinColumns = { @JoinColumn(name = "DIET_ID") },
            inverseJoinColumns = { @JoinColumn(name = "PROGRESSION_ID") }
    )
    public Set<Progression> getProgression() {
        return progression;
    }

    public void setProgression(Set<Progression> progression) {
        this.progression = progression;
    }
    @OneToMany(mappedBy="diet")
    public Set<DietDay> getDietDay() {
        return dietDay;
    }

    public void setDietDay(Set<DietDay> dietDay) {
        this.dietDay = dietDay;
    }
}
