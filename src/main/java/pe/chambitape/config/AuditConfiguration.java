package pe.chambitape.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import pe.chambitape.audit.AuditorAwareImpl;

@Configuration
@RequiredArgsConstructor
public class AuditConfiguration {



  @Bean
  public AuditorAware<String> auditorProvider() {
    return new AuditorAwareImpl();
  }

}
