package org.densoft.corsdemo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GreetingRequest {
    private String message;
    private String person;
}
