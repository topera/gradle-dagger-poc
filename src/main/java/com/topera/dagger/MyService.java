package com.topera.dagger;

import javax.inject.Inject;

class MyService {

    @Inject
    MyService(){
    }

    String read() {
        return "Injections Working!";
    }

}
