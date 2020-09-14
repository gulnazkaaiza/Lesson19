import java.io.IOException;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.main();
    }
    public void main() throws IOException {
        Program.readFile(Paths.get("/Users/gulnaz/IdeaProjects/Lesson19/Products.txt"));
    }
}
