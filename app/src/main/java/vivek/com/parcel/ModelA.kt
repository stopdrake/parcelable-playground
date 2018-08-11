package vivek.com.parcel

import android.os.Parcel
import android.os.Parcelable

/**
 * @author Vivek Singh
 * @version 1.0
 * @since 2018-08-11
 */

class ModelA(var A: String, var B: Int): IModel() {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readInt()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(0)
        parcel.writeString(A)
        parcel.writeInt(B)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ModelA> {
        override fun createFromParcel(parcel: Parcel): ModelA {
            return ModelA(parcel)
        }

        override fun newArray(size: Int): Array<ModelA?> {
            return arrayOfNulls(size)
        }
    }

}