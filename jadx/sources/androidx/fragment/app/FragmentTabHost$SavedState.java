package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

class FragmentTabHost$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<FragmentTabHost$SavedState> CREATOR = new C1462a();

    /* renamed from: d */
    String f4266d;

    /* renamed from: androidx.fragment.app.FragmentTabHost$SavedState$a */
    class C1462a implements Parcelable.Creator {
        C1462a() {
        }

        /* renamed from: a */
        public FragmentTabHost$SavedState createFromParcel(Parcel parcel) {
            return new FragmentTabHost$SavedState(parcel);
        }

        /* renamed from: b */
        public FragmentTabHost$SavedState[] newArray(int i) {
            return new FragmentTabHost$SavedState[i];
        }
    }

    FragmentTabHost$SavedState(Parcel parcel) {
        super(parcel);
        this.f4266d = parcel.readString();
    }

    public String toString() {
        return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.f4266d + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f4266d);
    }
}
