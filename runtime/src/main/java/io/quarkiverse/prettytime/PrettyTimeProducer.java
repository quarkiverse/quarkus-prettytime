package io.quarkiverse.prettytime;

import javax.enterprise.inject.Produces;
import javax.inject.Singleton;

import org.ocpsoft.prettytime.PrettyTime;

import io.quarkus.arc.DefaultBean;

public class PrettyTimeProducer {

    @Produces
    @Singleton
    @DefaultBean
    PrettyTime produce() {
        return new PrettyTime();
    }
}
