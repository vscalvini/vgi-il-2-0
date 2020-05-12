package it.vwgroup.il.leadservice.stream;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface LeadStreams {
	//String INPUT = "";
    String OUTPUT = "topic-test";

//    @Input(INPUT)
//    SubscribableChannel inboundGreetings();

    @Output(OUTPUT)
    MessageChannel outboundGreetings();
}
