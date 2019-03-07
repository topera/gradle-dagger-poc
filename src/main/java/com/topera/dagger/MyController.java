package com.topera.dagger;

class MyController {

    private MyService myService;

    MyController(MyService myService) {
        this.myService = myService;
    }

    String read() {
        return myService.read();
    }

}
