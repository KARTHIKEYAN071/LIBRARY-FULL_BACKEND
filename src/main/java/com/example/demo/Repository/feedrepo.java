package com.example.demo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entity.feedback;

public interface feedrepo extends JpaRepository<feedback,String>{

}
