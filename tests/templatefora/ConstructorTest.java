package templatefora;

import org.checkerframework.checker.security.qual.*;

public class ConstructorTest {

    private int testField;

    public ConstructorTest(int s) {
        this.testField = s;
    }

    public ConstructorTest(@Safe int s, Integer dummy) {
        this.testField = s;
    }

    public ConstructorTest(@Trusted int s, String dummy) {
        this.testField = s;
    }

    ConstructorTest object1 = new ConstructorTest(0);
    // :: error: argument
    ConstructorTest object2 = new ConstructorTest(1, 1);
    // :: error: argument
    ConstructorTest object3 = new ConstructorTest(2, "2");

}
