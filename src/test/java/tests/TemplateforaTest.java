package tests;

import java.io.File;
import java.util.List;
import org.checkerframework.checker.security.SecurityChecker;
import org.checkerframework.framework.test.CheckerFrameworkPerDirectoryTest;
import org.junit.runners.Parameterized.Parameters;

public class TemplateforaTest extends CheckerFrameworkPerDirectoryTest {
    public TemplateforaTest(List<File> testFiles) {
        super(
                testFiles,
                SecurityChecker.class,
                "templatefora",
                "-Anomsgtext",
                "-Astubs=stubs/",
                "-nowarn");
    }

    @Parameters
    public static String[] getTestDirs() {
        return new String[] {"templatefora"};
    }
}
