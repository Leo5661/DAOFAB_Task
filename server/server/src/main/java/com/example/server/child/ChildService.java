package com.example.server.child;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChildService {

    @Autowired
    private final ChildRepository childRepository;

    public ChildService(ChildRepository childRepository){
        this.childRepository = childRepository;
    }

    public List<ChildResult> getChild(Integer id) {
//        return childRepository.findAll();
        return  childRepository.findChild(id);
    }

}
