package com.example.server.parent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1")

public class ParentController {

    @Autowired
    private final ParentService parentService;

    public ParentController(ParentService parentService){
        this.parentService = parentService;
    }

    @GetMapping(path = "/parent/{id}")
    @CrossOrigin
    public Optional
            <Parent> getParent(@PathVariable Integer id) {
        return parentService.getParent(id);
    }

    @GetMapping(path = "/parent")
    @CrossOrigin
    public Page<Parent> getParentPaged(@RequestParam(value = "page") Integer page, @RequestParam(value = "limit") Integer limit){
        return parentService.getParentPaged(page, limit);
    }
}
