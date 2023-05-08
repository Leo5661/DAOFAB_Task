package com.example.server.parent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ParentService {

    private final ParentRepository parentRepository;

    @Autowired
    public ParentService(ParentRepository parentRepository){
        this.parentRepository = parentRepository;
    }

    public List<Parent> getParents() {
        return parentRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }

    public Optional<Parent> getParent(Integer id){
        return parentRepository.findById(id);
    }

    public Page<Parent> getParentPaged(Integer page, Integer limit){
        return parentRepository.findAll(PageRequest.of(page, limit, Sort.by(Sort.Direction.ASC, "id")));
    }
}
