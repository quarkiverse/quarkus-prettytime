package io.quarkiverse.prettytime.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import jakarta.inject.Inject;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.ocpsoft.prettytime.PrettyTime;

import io.quarkus.test.QuarkusUnitTest;

public class PrettyTimeTest {

    @RegisterExtension
    static final QuarkusUnitTest unitTest = new QuarkusUnitTest()
            .setArchiveProducer(() -> ShrinkWrap.create(JavaArchive.class));

    @Inject
    PrettyTime prettyTime;

    @Test
    public void canInjectPrettyTime() {
        assertNotNull(prettyTime);
    }
}
