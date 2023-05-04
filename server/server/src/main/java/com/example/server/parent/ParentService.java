package com.example.server.parent;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParentService {
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
