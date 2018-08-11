package vivek.com.parcel

import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable

/**
 * @author Vivek Singh
 * @version 1.0
 * @since 2018-08-11
 */

class WrapperModel(): Parcelable{

    lateinit var list1: ArrayList<IModel>
    var list2: ArrayList<IModel> = ArrayList()
    constructor(parcel: Parcel) : this() {
//        list1 = parcel.readArrayList(IModel::class.java.classLoader) as ArrayList<IModel>
        parcel.readTypedList(list2, IModel.CREATOR)
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
       // parcel.writeList(list1)
        parcel.writeTypedList(list2)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<WrapperModel> {
        override fun createFromParcel(parcel: Parcel): WrapperModel {
            return WrapperModel(parcel)
        }

        override fun newArray(size: Int): Array<WrapperModel?> {
            return arrayOfNulls(size)
        }
    }

}