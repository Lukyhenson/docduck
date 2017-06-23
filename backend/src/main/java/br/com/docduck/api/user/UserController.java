package br.com.docduck.api.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Jean on 22/06/2017.
 */

@RestController
public class UserController {

    @RequestMapping(value = "/api/user", method = RequestMethod.GET)
    public User getUser() {
        return new User();
    }

}