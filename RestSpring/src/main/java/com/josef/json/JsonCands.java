package com.josef.json;

import com.josef.codeapi.ConnectionDatabase;
import com.josef.codeapi.Skill;

/**
 * Created by pablo on 21.04.2017.
 */
public class JsonCands {
    private List<Skill> skills;

    public JsonCands(int userID) {
        skills = (new ConnectionDatabase()).cands(userID);
    }

    public List<Skill> getSkills() {
        return skills;
    }

}
