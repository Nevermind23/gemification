package androidx.drawerlayout.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

public class DrawerLayout$SavedState extends AbsSavedState {
    public static final Parcelable.Creator<DrawerLayout$SavedState> CREATOR = new C1363a();

    /* renamed from: f */
    int f3919f = 0;

    /* renamed from: g */
    int f3920g;

    /* renamed from: h */
    int f3921h;

    /* renamed from: i */
    int f3922i;

    /* renamed from: j */
    int f3923j;

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$SavedState$a */
    class C1363a implements Parcelable.ClassLoaderCreator {
        C1363a() {
        }

        /* renamed from: a */
        public DrawerLayout$SavedState createFromParcel(Parcel parcel) {
            return new DrawerLayout$SavedState(parcel, (ClassLoader) null);
        }

        /* renamed from: b */
        public DrawerLayout$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new DrawerLayout$SavedState(parcel, classLoader);
        }

        /* renamed from: c */
        public DrawerLayout$SavedState[] newArray(int i) {
            return new DrawerLayout$SavedState[i];
        }
    }

    public DrawerLayout$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3919f = parcel.readInt();
        this.f3920g = parcel.readInt();
        this.f3921h = parcel.readInt();
        this.f3922i = parcel.readInt();
        this.f3923j = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f3919f);
        parcel.writeInt(this.f3920g);
        parcel.writeInt(this.f3921h);
        parcel.writeInt(this.f3922i);
        parcel.writeInt(this.f3923j);
    }
}
