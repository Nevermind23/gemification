package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class ObservableChar extends C1355b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableChar> CREATOR = new C1338a();
    static final long serialVersionUID = 1;

    /* renamed from: d */
    private char f3886d;

    /* renamed from: androidx.databinding.ObservableChar$a */
    class C1338a implements Parcelable.Creator {
        C1338a() {
        }

        /* renamed from: a */
        public ObservableChar createFromParcel(Parcel parcel) {
            return new ObservableChar((char) parcel.readInt());
        }

        /* renamed from: b */
        public ObservableChar[] newArray(int i) {
            return new ObservableChar[i];
        }
    }

    public ObservableChar(char c) {
        this.f3886d = c;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3886d);
    }

    public ObservableChar() {
    }
}
