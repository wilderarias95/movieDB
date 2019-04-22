package com.example.moviedb.favorites


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.moviedb.R

/**
 * A simple [Fragment] subclass.
 *
 */
class FavoritesFragment : Fragment(), IFavoritesContract.View{

    private lateinit var presenter: IFavoritesContract.PresenterView
    private lateinit var viewFragment: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        viewFragment = inflater.inflate(R.layout.fragment_favorites, container, false)

        presenter = FavoritesPresenter(this)
        return viewFragment
    }


}
