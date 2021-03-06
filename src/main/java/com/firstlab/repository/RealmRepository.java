package com.firstlab.repository;

import com.firstlab.jpa.Realm;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RealmRepository extends MongoRepository<Realm, ObjectId> {
    Optional<Realm> findByTittle(String tittle);
}
