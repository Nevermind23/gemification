package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class ObservableInt extends C1355b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableInt> CREATOR = new C1341a();
    static final long serialVersionUID = 1;

    /* renamed from: d */
    private int f3889d;

    /* renamed from: androidx.databinding.ObservableInt$a */
    class C1341a implements Parcelable.Creator {
        C1341a() {
        }

        /* renamed from: a */
        public ObservableInt createFromParcel(Parcel parcel) {
            return new ObservableInt(parcel.readInt());
        }

        /* renamed from: b */
        public ObservableInt[] newArray(int i) {
            return new ObservableInt[i];
        }
    }

    public ObservableInt(int i) {
        this.f3889d = i;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3889d);
    }

    public ObservableInt() {
    }
}
