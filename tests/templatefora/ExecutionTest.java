package templatefora;

import org.checkerframework.checker.security.qual.*;

public class ExecutionTest {
    void Execute(@Safe int input) {};

    void test1(int s1, @Trusted int s2, @Safe int s3) {
        // :: error: argument
        Execute(s1);
        // :: error: argument
        Execute(s2);
        Execute(s3);
    }

    void test2(int s1, @Trusted int s2, @Safe int s3, @Safe int s4) {
        // :: error: argument
        Execute(s1 + s2);
        // :: error: argument
        Execute(s1 + s3);
        // :: error: argument
        Execute(s2 + s3);
        Execute(s3 + s4);
    }
}
