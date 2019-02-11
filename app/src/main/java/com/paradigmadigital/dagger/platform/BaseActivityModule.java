package com.paradigmadigital.dagger.platform;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class BaseActivityModule<T extends AppCompatActivity> {

    @Binds
    public abstract Activity provideActivity(T activity);
}
