package vivek.com.parcel

import android.os.Parcel
import android.os.Parcelable

/**
 * @author Vivek Singh
 * @version 1.0
 * @since 2018-08-11
 */

class ModelC(var E: Float, var F: Boolean): IModel() {
    constructor(parcel: Parcel) : this(
            parcel.readFloat(),
            parcel.readByte() != 0.toByte()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(2)
        parcel.writeFloat(E)
        parcel.writeByte(if (F) 1 else 0)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ModelC> {
        override fun createFromParcel(parcel: Parcel): ModelC {
            return ModelC(parcel)
        }

        override fun newArray(size: Int): Array<ModelC?> {
            return arrayOfNulls(size)
        }
    }

}