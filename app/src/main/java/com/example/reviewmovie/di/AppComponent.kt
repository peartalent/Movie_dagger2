package com.example.testdemo.di

import com.example.reviewmovie.MyApplication
import com.example.reviewmovie.di.ActivityBindingModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

//scope
@Singleton
@Component(
    modules = [
        // chưa tất cả thứ có thể inject đc: thông qua map, (fragment, activity)
        AndroidInjectionModule::class,
        AppModule::class,
        ActivityBindingModule::class
    ]
)
interface AppComponent : AndroidInjector<MyApplication> {
    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(app: MyApplication): Builder

        // bắt buôc phải có
        fun build(): AppComponent
    }
}