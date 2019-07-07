package com.kodilla;

final public class UnitPair {
    private final String unitA, unitB;
    UnitPair(String unitA, String unitB) {
        this.unitA = unitA;
        this.unitB = unitB;
    }

    public String getUnitA() {
        return unitA;
    }

    public String getUnitB() {
        return unitB;
    }

    public String toString() {
        return unitA + "~" + unitB;
    }
}
