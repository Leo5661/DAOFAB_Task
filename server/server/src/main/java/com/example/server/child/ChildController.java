package com.example.server.child;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/child")
public class ChildController {

    @Autowired
    private final ChildService childService;

    public ChildController(ChildService childService){
        this.childService = childService;
    }

    @GetMapping
    public List<Child> getChild(){
        return childService.getChild();
    }
}
