package io.quarkiverse.prettytime;

import jakarta.enterprise.inject.Produces;
import jakarta.inject.Named;
import jakarta.inject.Singleton;

import org.ocpsoft.prettytime.PrettyTime;

import io.quarkus.arc.DefaultBean;

public class PrettyTimeProducer {

    @Named("prettyTime")
    @Produces
    @Singleton
    @DefaultBean
    PrettyTime produce() {
        return new PrettyTime();
    }
}
