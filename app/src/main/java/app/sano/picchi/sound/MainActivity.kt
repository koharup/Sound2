package app.sano.picchi.sound

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val drumSound  = MediaPlayer.create(this, R.raw.drum_sound)


        drumImageView.setOnClickListener {
            //音を巻き戻す
            drumSound.seekTo(0)
            drumSound.start()

        }
    }
}
