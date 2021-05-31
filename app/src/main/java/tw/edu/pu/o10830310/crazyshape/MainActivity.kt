package tw.edu.pu.o10830310.crazyshape

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.module.AppGlideModule
import kotlinx.android.synthetic.main.activity_main.*
import tw.edu.pu.o10830190.crazyshape.R
import tw.edu.pu.o10830310.crazyshape.GameActivity
@GlideModule
public final class MyAppGlideModule : AppGlideModule()


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(baseContext, "作者：張小琴", Toast.LENGTH_LONG).show()
        GlideApp.with(this)
            .load(R.drawable.cover)
            .override(800, 600)
            .into(imageTitle)

//
        imgNext.setOnLongClickListener(object : View.OnLongClickListener {
            override fun onLongClick(p0: View?): Boolean {
                intent = Intent(this@MainActivity, GameActivity::class.java)
                startActivity(intent)
                return true
            }
        })
    }
}