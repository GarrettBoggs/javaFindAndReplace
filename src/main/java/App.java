import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console console = System.console();
    System.out.println("Enter full sentence");
    String completeSentence = console.readLine();

    System.out.println("Enter a word you want to replace");
    String findWord = console.readLine();

    System.out.println("Enter what you want to replace with");
    String replaceWord = console.readLine();

    Findandreplace myObject = new Findandreplace(completeSentence, findWord, replaceWord);

    System.out.println(myObject.runFindAndReplace());

  }
}
