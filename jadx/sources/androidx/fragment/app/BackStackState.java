package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressLint({"BanParcelableUsage"})
class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new C1426a();

    /* renamed from: d */
    final List f4125d;

    /* renamed from: e */
    final List f4126e;

    /* renamed from: androidx.fragment.app.BackStackState$a */
    class C1426a implements Parcelable.Creator {
        C1426a() {
        }

        /* renamed from: a */
        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        /* renamed from: b */
        public BackStackState[] newArray(int i) {
            return new BackStackState[i];
        }
    }

    BackStackState(List list, List list2) {
        this.f4125d = list;
        this.f4126e = list2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List mo4141a(FragmentManager fragmentManager, Map map) {
        HashMap hashMap = new HashMap(this.f4125d.size());
        for (String str : this.f4125d) {
            Fragment fragment = (Fragment) map.get(str);
            if (fragment != null) {
                hashMap.put(fragment.mWho, fragment);
            } else {
                FragmentState B = fragmentManager.mo4443x0().mo4604B(str, (FragmentState) null);
                if (B != null) {
                    Fragment a = B.mo4492a(fragmentManager.mo4441w0(), fragmentManager.mo4449z0().mo4762f().getClassLoader());
                    hashMap.put(a.mWho, a);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (BackStackRecordState d : this.f4126e) {
            arrayList.add(d.mo4134d(fragmentManager, hashMap));
        }
        return arrayList;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f4125d);
        parcel.writeTypedList(this.f4126e);
    }

    BackStackState(Parcel parcel) {
        this.f4125d = parcel.createStringArrayList();
        this.f4126e = parcel.createTypedArrayList(BackStackRecordState.CREATOR);
    }
}
