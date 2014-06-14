package com.leiyu.springREST.web;

import com.leiyu.springREST.model.User;
import com.leiyu.springREST.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RegisterController
{
    @Autowired
    private RegisterService userService;

    public RegisterController() {}

    @RequestMapping(value={"/register"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
    @ResponseBody
    public String handleUserLogin(@RequestBody User user)
    {
        this.userService.createUser(user);
        return "success";
    }

    @RequestMapping(value={"/register"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    @ResponseBody
    public String test()
    {
        User user = new User("test", "Pass");
        this.userService.createUser(user);
        return "hello";
    }
}
