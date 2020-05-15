package it.vwgroup.il.leadservice.stream;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface LeadStreams {
    String OUTPUT = "leads-out";

    @Output(OUTPUT)
    MessageChannel outboundLeads();
}
