package com.example.moviedb.favorites

class FavoritesInteractor() : IFavoritesContract.Model{

    private lateinit var presenter: IFavoritesContract.PresenterModel
    private lateinit var repository: IFavoritesRepository

    constructor(presenter: IFavoritesContract.PresenterModel): this(){
        this.presenter = presenter
        repository = FavoritesRepository(this)
    }
}