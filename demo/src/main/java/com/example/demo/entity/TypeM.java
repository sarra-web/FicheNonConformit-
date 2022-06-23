package com.example.demo.entity;

public enum TypeM {


    MainOeuvre("MainOeuvre"), Methode("Methode"), Matiere("Matiere"),Machine("Machine"),Milieu("Milieu");

    private final String text;

    /**
     * @param text
     */
    private TypeM(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
