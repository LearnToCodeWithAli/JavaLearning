package org.example.enums;

public enum Characters {
    KATARA("Katara"),
    AANG("Aang"),
    SOKKA("Sokka"),
    MOMO("Momo"),
    APPA("Appa"),
    TOPH("Toph");

    private String name;

    private Characters(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
