package com.topera.dagger;

import javax.inject.Inject;

class MyController {

    private MyService myService;

    @Inject
    MyController(MyService myService) {
        this.myService = myService;
    }

    String read() {
        return myService.read();
    }

}
