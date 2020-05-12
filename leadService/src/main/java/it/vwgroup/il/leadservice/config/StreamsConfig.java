package it.vwgroup.il.leadservice.config;

import org.springframework.cloud.stream.annotation.EnableBinding;

import it.vwgroup.il.leadservice.stream.LeadStreams;

@EnableBinding(LeadStreams.class)
public class StreamsConfig {
}
