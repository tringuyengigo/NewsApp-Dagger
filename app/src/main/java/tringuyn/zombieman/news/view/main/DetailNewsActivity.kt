package tringuyn.zombieman.news.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import tringuyn.zombieman.news.R
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction


class DetailNewsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addFragment()
    }

    private fun addFragment() {
        supportFragmentManager.beginTransaction().add(R.id.frame_layout, NewsFragment()).commit()
    }
}
