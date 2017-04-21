package com.josef.json;

import com.josef.codeapi.ConnectionDatabase;
import com.josef.codeapi.Skill;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by pablo on 21.04.2017.
 */
public class JsonCands {
    private List<Skill> skills;

    public JsonCands(int userID) throws SQLException {
        skills = (new ConnectionDatabase()).cands(userID);
    }

    public List<Skill> getSkills() {
        return skills;
    }

}
