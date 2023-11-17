package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class ObservableLong extends C1355b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableLong> CREATOR = new C1342a();
    static final long serialVersionUID = 1;

    /* renamed from: d */
    private long f3890d;

    /* renamed from: androidx.databinding.ObservableLong$a */
    class C1342a implements Parcelable.Creator {
        C1342a() {
        }

        /* renamed from: a */
        public ObservableLong createFromParcel(Parcel parcel) {
            return new ObservableLong(parcel.readLong());
        }

        /* renamed from: b */
        public ObservableLong[] newArray(int i) {
            return new ObservableLong[i];
        }
    }

    public ObservableLong(long j) {
        this.f3890d = j;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f3890d);
    }

    public ObservableLong() {
    }
}
