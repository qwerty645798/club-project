package com.project.match.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.match.entity.Question;

public interface QuestionRepository extends JpaRepository<Question, Integer> {

	Question findBySubject(String subject);
	
	Question findBySubjectAndContent(String subject, String content);
}
