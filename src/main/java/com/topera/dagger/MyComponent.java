package com.topera.dagger;

import dagger.Component;

@SuppressWarnings("unused")
@Component(modules = {MyModule.class})
interface MyComponent {

    void inject(MyApp myApp);

}