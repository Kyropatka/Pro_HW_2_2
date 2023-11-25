import java.io.FileWriter;
import java.io.IOException;

@MyAnnotation.SaveTo(path = "C:\\Users\\smede\\Desktop\\прога\\test.txt")
class TextContainer {
    String text = "Hello world";

    @MyAnnotation.Saver
    public void save(String path) {
        try (FileWriter fw = new FileWriter(path)) {
            fw.write(text);
            System.out.println("Text saved to: " + path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
