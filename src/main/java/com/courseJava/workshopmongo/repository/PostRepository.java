package com.courseJava.workshopmongo.repository;


import com.courseJava.workshopmongo.domain.Post;
import com.courseJava.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
