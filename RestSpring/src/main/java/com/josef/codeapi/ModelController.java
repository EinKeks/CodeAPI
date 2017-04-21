package com.josef.codeapi;




import com.josef.json.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.*;

@RestController
public class ModelController implements ErrorController {


    private static final String ERRORPATH = "/error";

    @Autowired
    private UserRepo userRepo;

    @CrossOrigin
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public JsonLogin login(@RequestParam(value="mail") String mail,@RequestParam(value="password") String password) {
        JsonLogin jsonLogin = new JsonLogin();
        User user = userRepo.findByMail(mail);

        System.out.println(mail);
        System.out.println(user);
        System.out.println(password);

        if(user != null && user.getPassword().equals(password)) {
            jsonLogin.setSuccess(true);
        } else {
            jsonLogin.setSuccess(false);
        }

        return jsonLogin;

    }


    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public JsonSearch search(@RequestParam(value="skills") String[] skills) {

        return new JsonSearch();

    }

    @RequestMapping(value = "/skills", method = RequestMethod.GET)
    public JsonCands skills(@RequestParam(value="userID") int userID) {

        return new JsonCands(userID);

    }

    @RequestMapping(value = ERRORPATH)
    public String error() {
        return "Error handling";
    }

    @Override
    public String getErrorPath() {
        return ERRORPATH;
    }
}
