package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new C1460a();

    /* renamed from: d */
    ArrayList f4245d;

    /* renamed from: e */
    ArrayList f4246e;

    /* renamed from: f */
    BackStackRecordState[] f4247f;

    /* renamed from: g */
    int f4248g;

    /* renamed from: h */
    String f4249h = null;

    /* renamed from: i */
    ArrayList f4250i = new ArrayList();

    /* renamed from: j */
    ArrayList f4251j = new ArrayList();

    /* renamed from: k */
    ArrayList f4252k;

    /* renamed from: androidx.fragment.app.FragmentManagerState$a */
    class C1460a implements Parcelable.Creator {
        C1460a() {
        }

        /* renamed from: a */
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        /* renamed from: b */
        public FragmentManagerState[] newArray(int i) {
            return new FragmentManagerState[i];
        }
    }

    public FragmentManagerState() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f4245d);
        parcel.writeStringList(this.f4246e);
        parcel.writeTypedArray(this.f4247f, i);
        parcel.writeInt(this.f4248g);
        parcel.writeString(this.f4249h);
        parcel.writeStringList(this.f4250i);
        parcel.writeTypedList(this.f4251j);
        parcel.writeTypedList(this.f4252k);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f4245d = parcel.createStringArrayList();
        this.f4246e = parcel.createStringArrayList();
        this.f4247f = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
        this.f4248g = parcel.readInt();
        this.f4249h = parcel.readString();
        this.f4250i = parcel.createStringArrayList();
        this.f4251j = parcel.createTypedArrayList(BackStackState.CREATOR);
        this.f4252k = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }
}
