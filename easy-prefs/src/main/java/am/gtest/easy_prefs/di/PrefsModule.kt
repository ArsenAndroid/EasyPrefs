package am.gtest.easy_prefs.di

import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object PrefsModule {

    const val PREF_FILE_CURRENT_USER = "current_user"
    const val PREF_FILE_ANY_USER = "any_user"

    @Singleton
    @Provides
    @Named(PREF_FILE_CURRENT_USER)
    fun provideSharedPreferenceCurrentUser(@ApplicationContext ctx: Context): SharedPreferences {
        return ctx.getSharedPreferences(PREF_FILE_CURRENT_USER, Context.MODE_PRIVATE)
    }

    @Singleton
    @Provides
    @Named(PREF_FILE_ANY_USER)
    fun provideSharedPreferenceAnyUser(@ApplicationContext ctx: Context): SharedPreferences {
        return ctx.getSharedPreferences(PREF_FILE_ANY_USER, Context.MODE_PRIVATE)
    }
}