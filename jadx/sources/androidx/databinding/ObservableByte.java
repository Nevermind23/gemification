package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class ObservableByte extends C1355b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableByte> CREATOR = new C1337a();
    static final long serialVersionUID = 1;

    /* renamed from: d */
    private byte f3885d;

    /* renamed from: androidx.databinding.ObservableByte$a */
    class C1337a implements Parcelable.Creator {
        C1337a() {
        }

        /* renamed from: a */
        public ObservableByte createFromParcel(Parcel parcel) {
            return new ObservableByte(parcel.readByte());
        }

        /* renamed from: b */
        public ObservableByte[] newArray(int i) {
            return new ObservableByte[i];
        }
    }

    public ObservableByte(byte b) {
        this.f3885d = b;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f3885d);
    }

    public ObservableByte() {
    }
}
