package com.akkademy.messages;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class SetRequest {

    @Getter
    private final String key;
    @Getter
    private final Object value;

    public SetRequest(String key, Object value) {
        this.key = key;
        this.value = value;
    }
}
