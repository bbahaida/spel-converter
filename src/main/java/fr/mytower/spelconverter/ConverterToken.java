package fr.mytower.spelconverter;

import lombok.Data;

@Data
public class ConverterToken {
    private ConverterTokenEnum op;
    private String value;
    private int number;
}
