package com.example.server.child;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @CrossOrigin
    public List<ChildResult> getChild(@PathVariable Integer id){
        return childService.getChild(id);
    }
}
