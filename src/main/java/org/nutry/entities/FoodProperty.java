package org.nutry.entities;

import javax.persistence.*;

@Entity
@Table(name = "FOOD_PROPERTY")
public class FoodProperty {
    private Long id;
    private String name;
    private String description;


    @Id
    @Column(name = "FOOD_PROPERTY_ID")
    @SequenceGenerator(name = "seq_food_property", sequenceName = "seq_id_food_property", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "seq_food_property")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "FOOD_PROPERTY_NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "FOOD_PROPERTY_DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
