package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class ObservableBoolean extends C1355b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableBoolean> CREATOR = new C1336a();
    static final long serialVersionUID = 1;

    /* renamed from: d */
    private boolean f3884d;

    /* renamed from: androidx.databinding.ObservableBoolean$a */
    class C1336a implements Parcelable.Creator {
        C1336a() {
        }

        /* renamed from: a */
        public ObservableBoolean createFromParcel(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            return new ObservableBoolean(z);
        }

        /* renamed from: b */
        public ObservableBoolean[] newArray(int i) {
            return new ObservableBoolean[i];
        }
    }

    public ObservableBoolean(boolean z) {
        this.f3884d = z;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3884d ? 1 : 0);
    }

    public ObservableBoolean() {
    }
}
