package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;

public class ObservableParcelable<T extends Parcelable> extends C1361h implements Parcelable {
    public static final Parcelable.Creator<ObservableParcelable> CREATOR = new C1343a();
    static final long serialVersionUID = 1;

    /* renamed from: androidx.databinding.ObservableParcelable$a */
    class C1343a implements Parcelable.Creator {
        C1343a() {
        }

        /* renamed from: a */
        public ObservableParcelable createFromParcel(Parcel parcel) {
            return new ObservableParcelable(parcel.readParcelable(getClass().getClassLoader()));
        }

        /* renamed from: b */
        public ObservableParcelable[] newArray(int i) {
            return new ObservableParcelable[i];
        }
    }

    public ObservableParcelable(Parcelable parcelable) {
        super(parcelable);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable((Parcelable) mo3958d(), 0);
    }

    public ObservableParcelable() {
    }
}
