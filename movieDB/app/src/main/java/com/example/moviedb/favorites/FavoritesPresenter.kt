package com.example.moviedb.favorites

class FavoritesPresenter : IFavoritesContract.PresenterView, IFavoritesContract.PresenterModel {

    private lateinit var view: IFavoritesContract.View
    private lateinit var interactor: IFavoritesContract.Model

    constructor(view: IFavoritesContract.View){
        this.view = view
        interactor = FavoritesInteractor(this)
    }

}