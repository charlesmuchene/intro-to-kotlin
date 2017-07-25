package com.senseidevs.kotlinintro

import android.content.BroadcastReceiver
import android.content.DialogInterface
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)














        // TODO Use synthetic import by commenting out below
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
























        // Extension function usages

        // Show toast
        showToast("Working with Kotlin is fun")

        fab.gone()





    }













    // Static constants
    companion object {

        val REFRESH_THRESHOLD = 10.toLong()

        @JvmField // Accessibility to Java
        val TIMEOUT = 5
    }


















    // Initialized elsewhere -- useful for dependency injection
    lateinit var homeView: View




























    // Lazy properties computed upon first access only
    val alertDialog: AlertDialog by lazy {

        AlertDialog.Builder(this).apply {

            setTitle("Kotlin is Awesome")
            setMessage("You love it before you start using it")
            setPositiveButton(android.R.string.ok, null)

        }.create()
    }


























    var numberOfPeople: Int by Delegates.notNull<Int>()


    // Standard Delegates
    // Lazy, Observable, Vetoable
}
