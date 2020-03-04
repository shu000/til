import java.util.Properties;
import java.io.*;

public class FileProperties implements FileIO {
  private Properties properties;
  private File file;

  public FileProperties() {
    this.properties = new Properties();
  }

  public void readFromFile(String filepath) throws IOException {
    try {
      properties.load(new FileInputStream(filepath));
    } catch (Exception e) {
      throw new IOException(e.getMessage());
    }
  }

  public void writeToFile(String filepath) throws IOException {
    try {
      properties.store(new FileOutputStream(filepath), "written by FileProperties");
    } catch (Exception e) {
      throw new IOException(e.getMessage());
    }
  }
  public void setValue(String key, String value) {
    properties.setProperty(key, value);
  }
  public String getValue(String key) {
    return properties.getProperty(key);
  }
}