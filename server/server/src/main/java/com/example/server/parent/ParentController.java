package com.example.server.parent;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/parent")
public class ParentController {

    @GetMapping
    public List<Parent> getParent() {
        return List.of(
                new Parent(
                        1,
                        "ABC",
                        "XYZ",
                        200
                )
        );
    }

}
