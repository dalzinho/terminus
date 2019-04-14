package com.terminl.demo.resource;

import com.terminl.demo.database.entity.user.UserEntity;
import com.terminl.demo.service.TerminlService;
import com.terminl.demo.service.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.List;

@RestController
public class TerminlApi {

    private TerminlService terminlService;

    @Autowired
    public TerminlApi(TerminlService terminlService) {
        this.terminlService = terminlService;
    }

    @GetMapping("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello!";
    }

    @PostMapping("/add-user")
    public UserEntity addUser(@NotNull @QueryParam("firstName") String firstName, @NotNull @QueryParam("lastName") String lastName) {
        return terminlService.addUser(firstName, lastName);
    }

    @PostMapping("add-visit/{userId}")
    @Consumes(MediaType.APPLICATION_JSON)
    public List<String> addVisits(@PathVariable("userId") Integer userId, @RequestBody List<String> airportsToAdd) {
        return terminlService.addVisits(userId, airportsToAdd);
    }

    @GetMapping("/user/{id}")
    public UserModel getUserInfo(@PathVariable("id") int id) {
        return terminlService.getUser(id);
    }

}
