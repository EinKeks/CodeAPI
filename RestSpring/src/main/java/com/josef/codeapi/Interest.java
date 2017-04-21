package com.josef.codeapi;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by julian on 21.04.17.
 */
@Entity
@Table(name = "interest")
public class Interest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private long ID;

    @NotNull
    private String name;

    private String description;

    private int parentID;

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getParentID() {
        return parentID;
    }

    public void setParentID(int parentID) {
        this.parentID = parentID;
    }
}

