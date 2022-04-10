package com.example450v2.demo450v2.Repo;

import java.util.List;

import com.example450v2.demo450v2.Entity.Authors;
import com.example450v2.demo450v2.Entity.Publications;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorsRepo extends JpaRepository<Authors, String>{
    @Query(value="SELECT * FROM AUTHORS r where r.PUBLICATIONID = :PUBLICATIONID", nativeQuery = true)
    public List<Authors> findAllById(@Param("PUBLICATIONID") String PUBLICATIONID);
}
