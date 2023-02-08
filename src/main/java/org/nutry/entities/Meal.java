package org.nutry.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "MEAL")
public class Meal {
    private Long id;
    private Integer name;
    private Integer description;

    private Set<Food> foods;


    @Id
    @Column(name = "MEAL_ID")
    @SequenceGenerator(name = "seq_meal", sequenceName = "seq_id_meal", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "seq_meal")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "MEAL_NAME")
    public Integer getName() {
        return name;
    }

    public void setName(Integer name) {
        this.name = name;
    }

    @Column(name = "MEAL_DESCRIPTION")
    public Integer getDescription() {
        return description;
    }

    public void setDescription(Integer description) {
        this.description = description;
    }

    @ManyToMany
    @JoinTable(
            name = "MEAL_FOOD",
            joinColumns = { @JoinColumn(name = "MEAL_ID") },
            inverseJoinColumns = { @JoinColumn(name = "FOOD_ID") }
    )
    public Set<Food> getFoods() {
        return foods;
    }

    public void setFoods(Set<Food> foods) {
        this.foods = foods;
    }
}
