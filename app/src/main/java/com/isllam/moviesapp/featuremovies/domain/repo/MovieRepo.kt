package com.isllam.moviesapp.featuremovies.domain.repo

import com.isllam.moviesapp.featuremovies.domain.model.Movie
import com.isllam.moviesapp.featuremovies.utils.Resource
import kotlinx.coroutines.flow.Flow

interface MovieRepo {
    suspend fun getMovieList(
        forceFetchFromRemote: Boolean,
        category: String,
        page: Int
    ): Flow<Resource<List<Movie>>>

    suspend fun getMovie(id: Int): Flow<Resource<Movie>>
}