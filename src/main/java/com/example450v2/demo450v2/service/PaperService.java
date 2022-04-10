package com.example450v2.demo450v2.service;
import java.util.List;
import java.util.Optional;

import com.example450v2.demo450v2.Entity.Publications;
import com.example450v2.demo450v2.Repo.PublicationRepository;

import java.util.ArrayList;    
import org.springframework.beans.factory.annotation.Autowired;    
import org.springframework.stereotype.Service;  
public class PaperService {
    @Autowired
    private PublicationRepository publicationRepository;
    
    public List<Publications> getAllPublications() {
        return (List<Publications>) publicationRepository.findAll();
    }
    public Optional<Publications> getPublication(String id) {
        return publicationRepository.findById(id);
    }
    public void addPublication(Publications publication) {
        publicationRepository.save(publication);
    }
    public void updatePublication(String id, Publications publication) {
        publicationRepository.save(publication);
    }
    public void deletePublication(String id) {
        publicationRepository.deleteById(id);
    }
    
    
}
