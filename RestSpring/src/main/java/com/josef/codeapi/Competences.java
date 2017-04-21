package com.josef.codeapi;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by josef on 4/21/17.
 */
@Entity
@Table(name = "c_s")
public class Competences {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private long ID;

    @NotNull
    private String name;

    private String description;

    @NotNull
    private int level;

    private int parentID;

    @NotNull
    private int isCompetence;

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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getParentID() {
        return parentID;
    }

    public void setParentID(int parentID) {
        this.parentID = parentID;
    }

    public int getIsCompetence() {
        return isCompetence;
    }

    public void setIsCompetence(int isCompetence) {
        this.isCompetence = isCompetence;
    }
}
