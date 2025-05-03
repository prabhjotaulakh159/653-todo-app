package prabhjot.adam.internship.prep.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import prabhjot.adam.internship.prep.models.UserModel;

@RestController
public class UserController {

  @Autowired // this means I inject it into user controller
  private MongoTemplate mongoTemplate;

  // https://docs.spring.io/spring-framework/reference/web/webmvc/mvc-controller/ann-methods/requestbody.html
  // https://docs.spring.io/spring-framework/reference/web/webmvc/mvc-controller/ann-methods/responseentity.html#page-title
  @PostMapping("/api/auth/register")
  public ResponseEntity<Void> registerNewUser(@RequestBody AuthRequest authRequest) {
    UserModel user = new UserModel(authRequest.getUsername(), authRequest.getPassword());
    mongoTemplate.insert(user);
    return ResponseEntity.ok(null);
  }

}
