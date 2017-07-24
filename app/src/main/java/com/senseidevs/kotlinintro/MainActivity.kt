package com.senseidevs.kotlinintro

import android.content.DialogInterface
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)







        val fab = findViewById(R.id.fab) as FloatingActionButton
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }


















        // Anonymous classes
        // TODO Implement the required methods
        // TODO Convert to lambda
        // TODO Rename unused parameters to _
        val dialog = AlertDialog.Builder(this)
                .setPositiveButton("Click me", object : DialogInterface.OnClickListener {

                }).create()

    }













    // Static constants
    companion object {

        val REFRESH_THRESHOLD = 10.toLong()

        @JvmField // Accessibility to Java
        val TIMEOUT = 5
    }














}
