package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class ObservableDouble extends C1355b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableDouble> CREATOR = new C1339a();
    static final long serialVersionUID = 1;

    /* renamed from: d */
    private double f3887d;

    /* renamed from: androidx.databinding.ObservableDouble$a */
    class C1339a implements Parcelable.Creator {
        C1339a() {
        }

        /* renamed from: a */
        public ObservableDouble createFromParcel(Parcel parcel) {
            return new ObservableDouble(parcel.readDouble());
        }

        /* renamed from: b */
        public ObservableDouble[] newArray(int i) {
            return new ObservableDouble[i];
        }
    }

    public ObservableDouble(double d) {
        this.f3887d = d;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.f3887d);
    }

    public ObservableDouble() {
    }
}
