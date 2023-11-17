package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class ObservableShort extends C1355b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableShort> CREATOR = new C1344a();
    static final long serialVersionUID = 1;

    /* renamed from: d */
    private short f3891d;

    /* renamed from: androidx.databinding.ObservableShort$a */
    class C1344a implements Parcelable.Creator {
        C1344a() {
        }

        /* renamed from: a */
        public ObservableShort createFromParcel(Parcel parcel) {
            return new ObservableShort((short) parcel.readInt());
        }

        /* renamed from: b */
        public ObservableShort[] newArray(int i) {
            return new ObservableShort[i];
        }
    }

    public ObservableShort(short s) {
        this.f3891d = s;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3891d);
    }

    public ObservableShort() {
    }
}
