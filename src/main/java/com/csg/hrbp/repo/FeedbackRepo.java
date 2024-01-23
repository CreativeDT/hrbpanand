package com.csg.hrbp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csg.hrbp.entity.Feedback;
@Repository
public interface FeedbackRepo extends JpaRepository<Feedback, Integer> {

}
