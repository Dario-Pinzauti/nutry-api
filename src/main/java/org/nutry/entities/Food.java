package org.nutry.entities;

import javax.persistence.*;
import java.util.Set;
@Entity
@Table(name = "FOOD")
public class Food {
    private Long id;
    private String name;
    private String description;


    private Set<FoodProperty> foodProperties;

    private Set<Meal> meals;

    private Set<FoodAlternatives>foodAlternatives;

    @Id
    @Column(name = "FOOD_ID")
    @SequenceGenerator(name = "seq_food", sequenceName = "seq_id_food", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "seq_food")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "FOOD_NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "FOOD_DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @OneToMany
    @JoinColumn(name = "FOOD_PROPERTY_ID")
    public Set<FoodProperty> getFoodProperties() {
        return foodProperties;
    }

    public void setFoodProperties(Set<FoodProperty> foodProperties) {
        this.foodProperties = foodProperties;
    }
    @OneToMany
    @JoinColumn(name = "PRINCIPAL_FOOD_ID")
    public Set<FoodAlternatives> getFoodAlternatives() {
        return foodAlternatives;
    }

    public void setFoodAlternatives(Set<FoodAlternatives> foodAlternatives) {
        this.foodAlternatives = foodAlternatives;
    }

    @ManyToMany
    @JoinTable(
            name = "MEAL_FOOD",
            joinColumns = { @JoinColumn(name = "FOOD_ID") },
            inverseJoinColumns = { @JoinColumn(name = "MEAL_ID") }
    )
    public Set<Meal> getMeals() {
        return meals;
    }

    public void setMeals(Set<Meal> meals) {
        this.meals = meals;
    }
}
