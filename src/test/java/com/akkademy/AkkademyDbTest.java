package com.akkademy;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.testkit.TestActorRef;
import com.akkademy.messages.SetRequest;
import javafx.scene.effect.SepiaTone;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 测试
 */
public class AkkademyDbTest {

    ActorSystem system = ActorSystem.create();

    @Test
    public void itShouldPlaceKeyValueFromSetMessageIntoMap() {
        TestActorRef<AkkademyDb> actorRef = TestActorRef.create(system, Props.create(AkkademyDb.class));
        actorRef.tell(new SetRequest("key", "value"), ActorRef.noSender());

        AkkademyDb akkademyDb = actorRef.underlyingActor();

        assertEquals(akkademyDb.map.get("key"), "value");
    }
}