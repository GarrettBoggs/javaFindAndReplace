import org.junit.*;
import static org.junit.Assert.*;

public class FindandreplaceTest {

  @Test
  public void runFindAndReplace_changeOneLetter_stringLetter() {
  Findandreplace tester = new Findandreplace("a", "a", "w");
  assertEquals("w", tester.runFindAndReplace());
  }

  @Test
  public void runFindAndReplace_changeOneLetter_multiLetterString() {
  Findandreplace tester = new Findandreplace("cab", "a", "w");
  assertEquals("cwb", tester.runFindAndReplace());
  }

  @Test
  public void runFindAndReplace_changeOneLetter_multiWordString() {
  Findandreplace tester = new Findandreplace("cab dad", "a", "w");
  assertEquals("cwb dwd", tester.runFindAndReplace());
  }

  @Test
  public void runFindAndReplace_changeOneLetter_replaceWordString() {
  Findandreplace tester = new Findandreplace("I am walking my cat to the cathedral", "cat", "dog");
  assertEquals("I am walking my dog to the doghedral", tester.runFindAndReplace());
  }

  @Test
  public void runFindAndReplace_changeOneLetter_replaceWordStringCaps() {
  Findandreplace tester = new Findandreplace("I am walking my Cat to the cAThedral", "cat", "dog");
  assertEquals("I am walking my dog to the doghedral", tester.runFindAndReplace());
  }
}
