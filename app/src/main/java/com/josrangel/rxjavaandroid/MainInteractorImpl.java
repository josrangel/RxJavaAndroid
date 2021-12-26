package com.josrangel.rxjavaandroid;

import com.josrangel.rxjavaandroid.interfaces.MainInteractor;

import java.util.ArrayList;

public class MainInteractorImpl implements MainInteractor {

    public ArrayList getAnimals(){
        ArrayList animals = new ArrayList();
        animals.add("Ajolote");
        animals.add("Tigre");
        animals.add("Gato");
        animals.add("Perro");
        animals.add("Aguila");
        return animals;
    }
}
