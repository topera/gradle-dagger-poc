package com.topera.dagger;

import dagger.Module;
import dagger.Provides;

@Module
public class MyModule {

    @Provides
    public MyController providesMyController(MyService myService) {
        return new MyController(myService);
    }

    @Provides
    public MyService providesMyService() {
        return new MyService();
    }

}