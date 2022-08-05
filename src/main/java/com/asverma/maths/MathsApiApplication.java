package com.asverma.maths;

import com.asverma.maths.resources.MathsResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class MathsApiApplication extends Application<MathsApiConfiguration> {

    public static void main(final String[] args) throws Exception {
        new MathsApiApplication().run(args);
    }

    @Override
    public String getName() {
        return "MathsApi";
    }

    @Override
    public void initialize(final Bootstrap<MathsApiConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final MathsApiConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
        environment.jersey().register(new MathsResource());
    }

}
