package org.nutry.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "DIET_DAY")
public class DietDay {
    private Long id;
    private String name;
    private String description;


    private Diet diet;


    private Set<Meal> meal;

    public DietDay() {
    }

    public DietDay(Long id, String name, String description, Diet diet, Set<Meal> meal) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.diet = diet;
        this.meal = meal;
    }

    @Id
    @Column(name = "DIET_DAY_ID")
    @SequenceGenerator(name = "seq_diet_day", sequenceName = "seq_id_diet_day", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "seq_diet_day")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Column(name = "DIET_DAY_NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "DIET_DAY_DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @OneToMany
    @JoinColumn(name = "MEAL_ID")
    public Set<Meal> getMeal() {
        return meal;
    }

    public void setMeal(Set<Meal> meal) {
        this.meal = meal;
    }

    @ManyToOne
    @JoinColumn(name="diet_id", nullable=false)
    public Diet getDiet() {
        return diet;
    }

    public void setDiet(Diet diet) {
        this.diet = diet;
    }
}
