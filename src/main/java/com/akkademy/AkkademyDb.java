package com.akkademy;

import akka.actor.AbstractActor;
import akka.event.Logging;
import akka.event.LoggingAdapter;
import akka.japi.pf.ReceiveBuilder;
import com.akkademy.messages.SetRequest;
import com.google.common.collect.Maps;

import java.util.Map;

public class AkkademyDb extends AbstractActor {

    protected final LoggingAdapter log = Logging.getLogger(context().system(), this);
    protected final Map<String, Object> map = Maps.newHashMap();

    private AkkademyDb() {
        receive(ReceiveBuilder.match(SetRequest.class, message -> {
            log.info("received set request: {}", message);
            map.put(message.getKey(), message.getValue());
        }).matchAny(o -> log.info("received unkown message: {}", 0)).build());
    }
}
