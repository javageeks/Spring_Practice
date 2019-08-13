package com.greenhorn.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.greenhorn.spring.model.SequenceGenerator;

@Configuration
public class SequenceGeneratorConfiguration {
	@Bean
	public SequenceGenerator sequenceGenerator() {
		SequenceGenerator seqgen = new SequenceGenerator();
		seqgen.setPrefix("30");
		seqgen.setSuffix("A");
		seqgen.setInitial(100000);
		return seqgen;
	}
}
