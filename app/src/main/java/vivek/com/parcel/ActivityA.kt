package vivek.com.parcel

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

/**
 * @author Vivek Singh
 * @version 1.0
 * @since 2018-08-11
 */

class ActivityA: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_a)
        val list = ArrayList<IModel>()
        list.add(ModelA("yolo", 1))
        list.add(ModelB("bhalo", 3.0))
        list.add(ModelC(2.0F, false))
        val model = WrapperModel()
        model.list1 = list
        model.list2 = list

        findViewById<Button>(R.id.button).setOnClickListener {
            val intent = Intent()
            intent.putExtra("yolo", model)
            intent.setClass(baseContext, ActivityB::class.java)
            startActivity(intent)
        }
    }
}