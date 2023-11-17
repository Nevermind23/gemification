package androidx.slidingpanelayout.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

class SlidingPaneLayout$SavedState extends AbsSavedState {
    public static final Parcelable.Creator<SlidingPaneLayout$SavedState> CREATOR = new C1850a();

    /* renamed from: f */
    boolean f5530f;

    /* renamed from: g */
    int f5531g;

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$SavedState$a */
    class C1850a implements Parcelable.ClassLoaderCreator {
        C1850a() {
        }

        /* renamed from: a */
        public SlidingPaneLayout$SavedState createFromParcel(Parcel parcel) {
            return new SlidingPaneLayout$SavedState(parcel, (ClassLoader) null);
        }

        /* renamed from: b */
        public SlidingPaneLayout$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new SlidingPaneLayout$SavedState(parcel, (ClassLoader) null);
        }

        /* renamed from: c */
        public SlidingPaneLayout$SavedState[] newArray(int i) {
            return new SlidingPaneLayout$SavedState[i];
        }
    }

    SlidingPaneLayout$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z;
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f5530f = z;
        this.f5531g = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f5530f ? 1 : 0);
        parcel.writeInt(this.f5531g);
    }
}
