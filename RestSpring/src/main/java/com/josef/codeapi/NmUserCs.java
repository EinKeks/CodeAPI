
package com.josef.codeapi;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by julian on 21.04.17.
 */
@Entity
@Table(name = "nm_user_cs")
public class NmUserCs {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private long ID;

    @NotNull
    private long userID;

    @NotNull
    private long csID;

    @NotNull
    private int level;

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public void setCsID(long csID) {
        this.csID = csID;
    }

    public long getCsID() {
        return csID;
    }
}

