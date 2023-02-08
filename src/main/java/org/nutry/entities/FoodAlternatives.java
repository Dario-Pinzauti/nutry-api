package org.nutry.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "FOOD_ALTERNATIVES")
public class FoodAlternatives {

    private Long id;
    private Set<Food> foodAlternatives;
    @Id
    @Column(name = "FOOD_ALTERNATIVES_ID")
    @SequenceGenerator(name = "seq_food_alternative", sequenceName = "seq_id_food_alternative", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "seq_food_alternative")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @OneToMany
    @JoinColumn(name = "FOOD_ID")
    public Set<Food> getFoodAlternatives() {
        return foodAlternatives;
    }

    public void setFoodAlternatives(Set<Food> foodAlternatives) {
        this.foodAlternatives = foodAlternatives;
    }
}
