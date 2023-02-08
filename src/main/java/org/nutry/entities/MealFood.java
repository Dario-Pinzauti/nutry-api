package org.nutry.entities;

import javax.persistence.*;

@Entity
@Table(name = "MEAL_FOOD")
public class MealFood {
    @Id
    private Long id;
    private String quantity;

    @Column(name = "MEAL_FOOD_QUANTITY")
    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @Column(name = "MEAL_FOOD_ID")
    @SequenceGenerator(name = "seq_meal_food", sequenceName = "seq_id_meal_food", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "seq_meal_food")
    public Long getId() {
        return id;
    }
}
