package com.topera.dagger;

import javax.inject.Inject;

class MyApp {

    private MyController myController;

    String read() {
        return myController.read();
    }

    @Inject
    public void setMyController(MyController myController) {
        this.myController = myController;
    }

}
