package com.vandele.classicalmusicnews.data.local.database

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object CmnDatabaseModule {
    @Provides
    @Singleton
    fun providesCmnDatabase(@ApplicationContext context: Context) =
        Room.databaseBuilder(
            context.applicationContext,
            CmnDatabase::class.java,
            "ArticlesDatabase.db",
        ).build()
}