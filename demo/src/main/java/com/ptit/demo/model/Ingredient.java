package com.ptit.demo.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * Created by pat on 4/20/2022 - 4:55 PM
 *
 * @author pat
 * @project demo
 */
@Data
@RequiredArgsConstructor
public class Ingredient {
    private final String id;
    private final String name;
    private final Type type;
    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
