package app.sano.picchi.sound

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val drumSound  = MediaPlayer.create(this, R.raw.drum_sound)

        drumImageView.setOnTouchListener { view, event ->

            if (event.action == MotionEvent.ACTION_DOWN){

                drumImageView.setImageResource(R.drawable.drum_playing_image)
                drumSound.seekTo(0)
                drumSound.start()


                }
            else if (event.action == MotionEvent.ACTION_UP){
                drumImageView.setImageResource(R.drawable.drum_image)
            }

            true

        }

//         サウンドアプリ1の内容
//        drumImageView.setOnClickListener {
//            //音を巻き戻す
//            drumImageView.setImageResource(R.drawable.drum_playing_image)
//            drumSound.seekTo(0)
//            drumSound.start()
//        }
    }
}
