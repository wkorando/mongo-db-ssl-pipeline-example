package com.ibm.developer.mongodbsslpipelineexample;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MessageRepository extends MongoRepository<Message, Long> {

}
