package com.example.moviedb.list

class ListInteractor(): IListContract.Model{

    private lateinit var presenter: IListContract.PresenterModel
    private lateinit var repository: IListRepository

    constructor(presenter: IListContract.PresenterModel):this(){
        this.presenter = presenter
        repository = ListRepository(this)
    }

}