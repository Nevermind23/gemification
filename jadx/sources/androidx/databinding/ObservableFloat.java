package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class ObservableFloat extends C1355b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableFloat> CREATOR = new C1340a();
    static final long serialVersionUID = 1;

    /* renamed from: d */
    private float f3888d;

    /* renamed from: androidx.databinding.ObservableFloat$a */
    class C1340a implements Parcelable.Creator {
        C1340a() {
        }

        /* renamed from: a */
        public ObservableFloat createFromParcel(Parcel parcel) {
            return new ObservableFloat(parcel.readFloat());
        }

        /* renamed from: b */
        public ObservableFloat[] newArray(int i) {
            return new ObservableFloat[i];
        }
    }

    public ObservableFloat(float f) {
        this.f3888d = f;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f3888d);
    }

    public ObservableFloat() {
    }
}
