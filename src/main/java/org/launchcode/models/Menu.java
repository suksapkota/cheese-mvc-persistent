package org.launchcode.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bikram on 4/12/2017.
 */
@Entity
public class Menu {
    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=3, max=15)
    private String name;

    @ManyToMany
    private List<Cheese> cheeses=new ArrayList<>();

    public Menu(){}

    public Menu(String name){
        this.name=name;
    }
    public void addItem(Cheese item){
        cheeses.add(item);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public List<Cheese> getCheeses() {
        return cheeses;
    }

    public void setName(String name) {
        this.name = name;

    }
}