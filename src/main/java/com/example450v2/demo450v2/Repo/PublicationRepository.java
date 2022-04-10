package com.example450v2.demo450v2.Repo;
import java.util.List;
import java.util.Optional;

import com.example450v2.demo450v2.Entity.Publications;

import org.springframework.data.repository.CrudRepository;
public interface PublicationRepository extends CrudRepository<Publications, String>{
}
