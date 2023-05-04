package com.example.server.parent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/parent")
public class ParentController {

    @Autowired
    private final ParentService parentService;

    public ParentController(ParentService parentService){
        this.parentService = parentService;
    }
    @GetMapping
    public List<Parent> getParent() {
        return parentService.getParent();
    }

}
