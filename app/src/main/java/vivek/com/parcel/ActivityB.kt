package vivek.com.parcel

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

/**
 * @author Vivek Singh
 * @version 1.0
 * @since 2018-08-11
 */

class ActivityB: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val list = intent.getParcelableExtra<WrapperModel>("yolo")
        Log.d("bhakk","adf")
    }
}