package org.ada.school.repository;

import org.ada.school.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserDocument, String>
{


}
