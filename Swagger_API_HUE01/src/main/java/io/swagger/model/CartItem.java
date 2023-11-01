package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * CartItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-09-27T17:52:30.403097720Z[GMT]")


public class CartItem   {
  @JsonProperty("productId")
  private Long productId = null;

  @JsonProperty("quantity")
  private Integer quantity = null;

  public CartItem productId(Long productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Die ID des Produkts im Warenkorb.
   * @return productId
   **/
  @Schema(description = "Die ID des Produkts im Warenkorb.")
  
    public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }

  public CartItem quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Anzahl der Produkte im Warenkorb
   * minimum: 1
   * @return quantity
   **/
  @Schema(description = "Anzahl der Produkte im Warenkorb")
  
  @Min(1)  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartItem cartItem = (CartItem) o;
    return Objects.equals(this.productId, cartItem.productId) &&
        Objects.equals(this.quantity, cartItem.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, quantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartItem {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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
