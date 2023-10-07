package pe.chambitape.config;

import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Configuration
public class SwaggerConfig {
    private static final Set<String> DEFAULT_PRODUCES_CONSUMES = new HashSet<String>(Arrays.asList("application/json"));


}