package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar

class lockfrag : Fragment(R.layout.fragment_lockfrag) {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_lockfrag, container, false)
        val LockButton: Button = view.findViewById(R.id.LockButFrag)
        val UnlockButton: Button = view.findViewById(R.id.UnlockButFrag)

        LockButton.setOnClickListener { view2 ->
            Snackbar.make(view2, "My SignOff Locked!", Snackbar.LENGTH_SHORT).show()
        }
        UnlockButton.setOnClickListener { view3 ->
            Snackbar.make(view3, "My SignOff Unlocked!", Snackbar.LENGTH_SHORT).show()
        }
        return view
    }
    /* override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        LockButton.setOnClickListener { view ->
            Snackbar.make(view, "My SignOff Locked!", Snackbar.LENGTH_LONG)
        }
        UnlockButton.setOnClickListener { view ->
            Snackbar.make(view, "My SignOff Unlocked!", Snackbar.LENGTH_LONG)
        }
    } */
}

