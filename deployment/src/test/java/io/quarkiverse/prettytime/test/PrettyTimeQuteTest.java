package io.quarkiverse.prettytime.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;
import java.util.Locale;

import jakarta.inject.Inject;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.StringAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.ocpsoft.prettytime.PrettyTime;

import io.quarkus.qute.Template;
import io.quarkus.test.QuarkusUnitTest;

public class PrettyTimeQuteTest {

    @RegisterExtension
    static final QuarkusUnitTest config = new QuarkusUnitTest()
            .setArchiveProducer(() -> ShrinkWrap.create(JavaArchive.class)
                    .addAsResource(new StringAsset("{inject:prettyTime.format(time)}"), "templates/pretty.txt"));

    @Inject
    Template pretty;

    @Inject
    PrettyTime prettyTime;

    @Test
    public void testNamed() {
        // Set the reference and locale
        prettyTime.setReference(new Date(6000));
        prettyTime.setLocale(Locale.ENGLISH);
        assertEquals("moments ago", pretty.data("time", new Date(0)).render());
    }
}
