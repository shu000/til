import java.io.*;

public class Main {
  public static void main(String[] args) {
    FileIO f = new FileProperties();

    String pwd = System.getProperty("user.dir");
    String filedir = pwd.substring(0, pwd.length() - 3); // trim "tmp"

    try {

      f.readFromFile(filedir + "file.txt");
      f.setValue("year", "2020");
      f.setValue("month", "3");
      f.setValue("day", "3");
      f.writeToFile(filedir + "newfile.txt");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}