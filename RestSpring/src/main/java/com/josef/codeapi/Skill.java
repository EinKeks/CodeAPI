package com.josef.codeapi;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by pablo on 21.04.2017.
 */

@Entity
@Table(name="c_s")
public class Skill {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @NotNull
    public int ID;
    @NotNull
    public String name;
    @NotNull
    public String description;
    @NotNull
    public int level;
    public int parentID;    //may crash due to an primitive datatype beeing null

    public Skill()
    {

    }
    public int getID() { return ID; }

    public String getName() { return name; }

    public String getDescription() { return description; }

    public int getLevel() { return level; }

    public int getParentID() { return parentID; }

    public void setID(int ID) { this.ID = ID; }

    public void setName(String name) { this.name = name; }

    public void setDescription(String description) { this.description = description; }

    public void setLevel(int level) { this.level = level; }

    public void setParentID(int parentID) { this.parentID = parentID; }
}