package com.example.server.child;


import com.example.server.parent.Parent;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChildService {

    public List<Child> getChild() {
        return List.of(
                new Child(
                        1,
                        1,
                        20
                )
        );
    }

}
