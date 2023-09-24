package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * User
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-09-24T16:26:29.294335690Z[GMT]")


public class User   {
  @JsonProperty("email")
  private Object email = null;

  @JsonProperty("username")
  private Object username = null;

  @JsonProperty("password")
  private Object password = null;

  @JsonProperty("password2")
  private Object password2 = null;

  public User email(Object email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   **/
  @Schema(example = "test@gmail.com", description = "")
  
    public Object getEmail() {
    return email;
  }

  public void setEmail(Object email) {
    this.email = email;
  }

  public User username(Object username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
   **/
  @Schema(example = "Max Mustermann", description = "")
  
    public Object getUsername() {
    return username;
  }

  public void setUsername(Object username) {
    this.username = username;
  }

  public User password(Object password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
   **/
  @Schema(example = "123456", description = "")
  
    public Object getPassword() {
    return password;
  }

  public void setPassword(Object password) {
    this.password = password;
  }

  public User password2(Object password2) {
    this.password2 = password2;
    return this;
  }

  /**
   * Get password2
   * @return password2
   **/
  @Schema(example = "123456", description = "")
  
    public Object getPassword2() {
    return password2;
  }

  public void setPassword2(Object password2) {
    this.password2 = password2;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.email, user.email) &&
        Objects.equals(this.username, user.username) &&
        Objects.equals(this.password, user.password) &&
        Objects.equals(this.password2, user.password2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, username, password, password2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    password2: ").append(toIndentedString(password2)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
