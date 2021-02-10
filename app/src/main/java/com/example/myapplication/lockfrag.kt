package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class lockfrag : Fragment(R.layout.fragment_lockfrag) {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        /*
        val view: View = inflater.inflate(R.layout.fragment_lockfrag, container, false)
        val LockButton: Button = view.findViewById(R.id.LockButFrag)
        val mainAct = activity as MainActivity
        val ipcomm: String = mainAct.intent.getStringExtra("IPValT2").toString()
        val ipcomm2: String = ipcomm + "/toggle"
        var i = 1
        LockButton.setOnClickListener { view2 ->
            if (i == 1) {
                Snackbar.make(view2, ipcomm2, Snackbar.LENGTH_SHORT).show()
                //val connection: URLConnection = URL(ipcomm).openConnection()
                //connection.setDoOutput(true)
                i = 0
            }
            else if (i == 0) {
                Snackbar.make(view2, "My SignOff Unlocked!", Snackbar.LENGTH_SHORT).show()
                //val connection2 = URL(ipcomm).openConnection()
                //connection2.setDoOutput(true)
                i = 1
            }
        } */
        return view
    }
}