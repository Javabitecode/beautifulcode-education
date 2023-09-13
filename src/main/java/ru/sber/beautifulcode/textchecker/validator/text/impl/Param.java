package ru.sber.beautifulcode.textchecker.validator.text.impl;


import java.util.List;
import lombok.Builder;
import lombok.Data;
import org.checkerframework.checker.nullness.qual.NonNull;

@Data
@Builder
public class Param {

    @NonNull
    private String name;

    @NonNull
    private List<String> values;
}