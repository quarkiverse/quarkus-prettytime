package io.quarkiverse.prettytime.deployment;

import io.quarkiverse.prettytime.PrettyTimeProducer;
import io.quarkus.arc.deployment.AdditionalBeanBuildItem;
import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;
import io.quarkus.deployment.builditem.nativeimage.NativeImageResourceBundleBuildItem;

class PrettyTimeProcessor {

    private static final String FEATURE = "pretty-time";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }

    @BuildStep
    NativeImageResourceBundleBuildItem registerResourceBundle() {
        return new NativeImageResourceBundleBuildItem("org.ocpsoft.prettytime.i18n.Resources");
    }

    @BuildStep
    AdditionalBeanBuildItem producePrettyTime() {
        return new AdditionalBeanBuildItem(PrettyTimeProducer.class);
    }

}
