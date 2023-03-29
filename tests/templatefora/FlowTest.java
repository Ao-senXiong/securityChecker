package templatefora;

import org.checkerframework.checker.security.qual.*;


public class FlowTest {
    void test1(@Safe Object a, @Trusted Object b) {
        @Trusted Object x = a;
        x = b;
    }

    void test2(@Safe int a, @Trusted int b) {
        // :: error: assignment
        @Safe int x = a + b;
    }
}
