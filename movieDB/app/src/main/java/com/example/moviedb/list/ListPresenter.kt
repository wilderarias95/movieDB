package com.example.moviedb.list

class ListPresenter: IListContract.PresenterView, IListContract.PresenterModel {

    private  var view: IListContract.View
    private  var interactor: IListContract.Model

    constructor(view: IListContract.View){
        this.view = view
        interactor = ListInteractor(this)
    }
}