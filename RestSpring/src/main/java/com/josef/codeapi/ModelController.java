package com.josef.codeapi;




import com.josef.json.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModelController {


    @Autowired
    private UserRepo userRepo;


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
    public JsonLogin search(@RequestParam(value="skills") String[] skills) {



        return new JsonLogin();

    }


















}
