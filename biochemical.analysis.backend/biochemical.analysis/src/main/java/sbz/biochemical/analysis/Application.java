package sbz.biochemical.analysis;

import org.kie.api.KieServices;
import org.kie.api.builder.KieScanner;
import org.kie.api.runtime.KieContainer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public KieContainer kieContainer() {
		KieServices ks = KieServices.Factory.get();
		KieContainer kieContainer = ks
				.newKieContainer(ks.newReleaseId("sbz", "biochemical.analysis.kjar", "0.0.1-SNAPSHOT"));
		KieScanner kieScanner = ks.newKieScanner(kieContainer);
		kieScanner.start(10_000);
		return kieContainer;
	}
}
