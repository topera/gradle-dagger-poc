package com.topera.dagger;

public class Main {

    public static void main(String[] args) {
        MyApp myApp = new MyApp();
        DaggerMyComponent.builder().build().inject(myApp); // DaggerMyComponent is created at runtime. Please ignore IDE errors on this line
        System.out.println(myApp.read());
    }

}
