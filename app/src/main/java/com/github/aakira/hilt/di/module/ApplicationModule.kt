package com.github.aakira.hilt.di.module

import com.github.aakira.hilt.di.qualifiers.AppHash
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class ApplicationModule {
    @AppHash
    @Provides
    fun provideHash(): String {
        return hashCode().toString()
    }
}
