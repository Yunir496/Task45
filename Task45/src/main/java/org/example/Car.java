package org.example;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Car {
    private Engine engine;
    private Transmission transmission;
    private Type type;
    private Wheel wheel;
}
