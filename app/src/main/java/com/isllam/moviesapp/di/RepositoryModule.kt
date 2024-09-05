package com.isllam.moviesapp.di

import com.isllam.moviesapp.featuremovies.data.repo.MovieRepoImpl
import com.isllam.moviesapp.featuremovies.domain.repo.MovieRepo
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindMovieListRepository(
        movieListRepositoryImpl: MovieRepoImpl
    ): MovieRepo

}