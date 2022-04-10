package com.example450v2.demo450v2.Repo;
import java.util.List;
import java.util.Optional;

import com.example450v2.demo450v2.Entity.Publications;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface PublicationRepository extends JpaRepository<Publications, String>{
    @Query(value="SELECT * FROM PUBLICATIONS r where r.TITLE = :TITLE", nativeQuery = true)
    List<Publications> findAllByTitle(@Param("TITLE") String TITLE);
}
