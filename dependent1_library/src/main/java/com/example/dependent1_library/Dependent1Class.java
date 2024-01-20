package com.example.dependent1_library;


import com.example.base_library.BaseClass;

public class Dependent1Class {

    public static void create() {
        BaseClass.intialize("Dependent1Class");
    }
}
