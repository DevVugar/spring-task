package com.example.springtask.repository;

import com.example.springtask.model.entity.Guide;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface GuideRepository extends JpaRepository<Guide,Long> {


}
