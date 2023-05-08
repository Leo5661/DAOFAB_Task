package com.example.server.child;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1")
public class ChildController {

    @Autowired
    private final ChildService childService;

    public ChildController(ChildService childService){
        this.childService = childService;
    }

    @GetMapping(path = "/child/{id}")
    public List<ChildResult> getChild(@PathVariable Integer id){
        return childService.getChild(id);
    }
}
