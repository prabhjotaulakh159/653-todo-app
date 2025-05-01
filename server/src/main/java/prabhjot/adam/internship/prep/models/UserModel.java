package prabhjot.adam.internship.prep.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * Documentation reference: 
 * https://docs.spring.io/spring-data/mongodb/docs/current-SNAPSHOT/reference/html/#mapping-usage
 * 
 * Authors: Prabhjot Aulakh and Adam Sean Winter
 */
@Document
public class UserModel {
  
  @Id
  private ObjectId id;

  @Indexed(unique = true)
  private String username;

  private String password;

  public UserModel() {
  }

  public UserModel(String username, String password) {
    this.username = username;
    this.password = password;
  }

  public ObjectId getId() {
    return id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
