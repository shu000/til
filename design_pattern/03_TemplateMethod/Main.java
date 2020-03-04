public class Main {
  public static void main(String[] args) {
    AbstractDisplay c = new CharDisplay('c');
    c.display();
    AbstractDisplay s = new StringDisplay("Hello");
    s.display();
  }
}