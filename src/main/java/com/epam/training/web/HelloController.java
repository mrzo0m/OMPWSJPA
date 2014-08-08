package com.epam.training.web;


import com.epam.training.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import java.util.HashSet;
import java.util.Set;

@Controller
@RequestMapping("/")
public class HelloController {

    private EntityManagerFactory emf;


    @Autowired
    UserService userService;


    @PersistenceUnit
    public void setEntityManagerFactory(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public String printWelcome() {
//        demoDAO.demo();
//        userService.read();

        return "hello";
    }

    @RequestMapping(value = "/ajaxtest", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    @ResponseBody
    public Set<String> ajaxTest() {
        Set<String> records = new HashSet<String>();
        records.add("Record #1");
        records.add("Record #2");

        return records;
    }
}