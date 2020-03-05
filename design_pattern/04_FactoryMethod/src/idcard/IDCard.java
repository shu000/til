package idcard;
import framework.*;

public class IDCard extends Product {
  private String owner;

  IDCard(String owner) {
    System.out.println("Create a IDCard owned by: " + owner);
    this.owner = owner;
  }

  public void use() {
    System.out.println("Use the IDCard owned by: " + owner);
  }

  public String getOwner() {
    return owner;
  }
}