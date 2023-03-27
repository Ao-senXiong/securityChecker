import org.checkerframework.checker.templatefora.qual.*;

// Test basic subtyping relationships for the TemplateForA Checker.
class SubtypeTest {
    void allSubtypingRelationships(@Untrusted int x, @Unsafe int y) {
        // :: error: assignment
        @Safe int a = x;
        // :: error: assignment
        @Untrusted int b = y;
        @Unsafe int c = x;
        // :: error: assignment
        @Trusted int d = y;
    }
}
