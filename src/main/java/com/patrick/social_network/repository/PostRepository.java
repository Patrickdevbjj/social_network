package com.patrick.social_network.repository;


import com.patrick.social_network.domain.Post;
import com.patrick.social_network.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String > {
}
