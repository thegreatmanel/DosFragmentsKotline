package com.example.propa.kotlintest1

import android.os.Bundle
import android.view.View
import android.view.ViewGroup

import android.support.v4.app.Fragment
import android.view.LayoutInflater

/**
 * A simple [Fragment] subclass.
 */
class FragmentB : Fragment() {


        override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                                                                savedInstanceState: Bundle?): View? {
                // Inflate the layout for this fragment
                return inflater!!.inflate(R.layout.fragment_b, container, false)
            }

    }// Required empty public constructor