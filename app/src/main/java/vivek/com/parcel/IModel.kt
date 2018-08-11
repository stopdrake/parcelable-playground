package vivek.com.parcel

import android.os.Parcel
import android.os.Parcelable

/**
 * @author Vivek Singh
 * @version 1.0
 * @since 2018-08-11
 */

abstract class IModel(var base: Int = 0): Parcelable {
    constructor(parcel: Parcel) : this(parcel.readInt()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(base)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<IModel> {
        override fun createFromParcel(parcel: Parcel): IModel {
            when(parcel.readInt()) {
                0 -> return ModelA(parcel)
                1 -> return ModelB(parcel)
                2 -> return ModelC(parcel)
                else -> return object: IModel(){}
            }
        }

        override fun newArray(size: Int): Array<IModel?> {
            return arrayOfNulls(size)
        }
    }


}