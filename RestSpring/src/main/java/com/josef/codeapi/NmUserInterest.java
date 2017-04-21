package com.josef.codeapi;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by julian on 21.04.17.
 */
@Entity
@Table(name = "nm_user_interest")
public class NmUserInterest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @NotNull
    private long ID;
    
    @NotNull
    private long userID;

    @NotNull
    private int level;

    public long getID() {
        return ID;
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
