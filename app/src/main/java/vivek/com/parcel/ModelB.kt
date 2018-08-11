package vivek.com.parcel

import android.os.Parcel
import android.os.Parcelable

/**
 * @author Vivek Singh
 * @version 1.0
 * @since 2018-08-11
 */

class ModelB(var C: String, var D: Double): IModel() {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readDouble()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(1)
        parcel.writeString(C)
        parcel.writeDouble(D)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ModelB> {
        override fun createFromParcel(parcel: Parcel): ModelB {
            return ModelB(parcel)
        }

        override fun newArray(size: Int): Array<ModelB?> {
            return arrayOfNulls(size)
        }
    }

}