package templatefora;
import org.checkerframework.checker.security.qual.*;

public class ReturnTest {
    @Safe Object test1(Object foo) {
        // :: error: return
        return foo;
    };

    @Trusted Object test2(Object foo) {
        // :: error: return
        return foo;
    };

    Object test3(Object foo) {
        return foo;
    }
}
