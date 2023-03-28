import org.checkerframework.checker.security.qual.*;

// Test basic subtyping relationships for the TemplateForA Checker.
class SubtypeTest {
    void allSubtypingRelationships(@Untrusted int x, @Trusted int y, @Safe int z) {
        // :: error: assignment
        @Safe int a = x;
        // :: error: assignment
        @Safe int b = y;
        @Safe int c = z;
        // :: error: assignment
        @Trusted int d = x;
        @Trusted int e = y;
        @Trusted int f = z;
        @Untrusted int g = x;
        @Untrusted int h = y;
        @Untrusted int j = z;
    }
}
