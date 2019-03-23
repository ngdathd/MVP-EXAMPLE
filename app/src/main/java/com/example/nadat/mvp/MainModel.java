package com.example.nadat.mvp;

import java.util.Random;

public class MainModel implements IContract.IModel {

    @Override
    public boolean isTrue() {
        return new Random().nextBoolean();
    }
}
