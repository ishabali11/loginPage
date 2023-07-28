package com.example.First.Repository;

import com.example.First.Entity.Logintable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

@EnableJpaRepositories
@EntityScan
    @Repository
    public  interface LoginRepo extends JpaRepository<Logintable,String>
    {
       @Query


       Logintable   findByUsername(@Param(" username") String username);



       // Logintable   findById(@Param("") int Id);

    }

