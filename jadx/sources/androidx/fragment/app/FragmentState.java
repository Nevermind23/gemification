package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.C1593j;

@SuppressLint({"BanParcelableUsage"})
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new C1461a();

    /* renamed from: d */
    final String f4253d;

    /* renamed from: e */
    final String f4254e;

    /* renamed from: f */
    final boolean f4255f;

    /* renamed from: g */
    final int f4256g;

    /* renamed from: h */
    final int f4257h;

    /* renamed from: i */
    final String f4258i;

    /* renamed from: j */
    final boolean f4259j;

    /* renamed from: k */
    final boolean f4260k;

    /* renamed from: l */
    final boolean f4261l;

    /* renamed from: m */
    final Bundle f4262m;

    /* renamed from: n */
    final boolean f4263n;

    /* renamed from: o */
    final int f4264o;

    /* renamed from: p */
    Bundle f4265p;

    /* renamed from: androidx.fragment.app.FragmentState$a */
    class C1461a implements Parcelable.Creator {
        C1461a() {
        }

        /* renamed from: a */
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        /* renamed from: b */
        public FragmentState[] newArray(int i) {
            return new FragmentState[i];
        }
    }

    FragmentState(Fragment fragment) {
        this.f4253d = fragment.getClass().getName();
        this.f4254e = fragment.mWho;
        this.f4255f = fragment.mFromLayout;
        this.f4256g = fragment.mFragmentId;
        this.f4257h = fragment.mContainerId;
        this.f4258i = fragment.mTag;
        this.f4259j = fragment.mRetainInstance;
        this.f4260k = fragment.mRemoving;
        this.f4261l = fragment.mDetached;
        this.f4262m = fragment.mArguments;
        this.f4263n = fragment.mHidden;
        this.f4264o = fragment.mMaxState.ordinal();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Fragment mo4492a(C1519l lVar, ClassLoader classLoader) {
        Fragment a = lVar.mo4458a(classLoader, this.f4253d);
        Bundle bundle = this.f4262m;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a.setArguments(this.f4262m);
        a.mWho = this.f4254e;
        a.mFromLayout = this.f4255f;
        a.mRestored = true;
        a.mFragmentId = this.f4256g;
        a.mContainerId = this.f4257h;
        a.mTag = this.f4258i;
        a.mRetainInstance = this.f4259j;
        a.mRemoving = this.f4260k;
        a.mDetached = this.f4261l;
        a.mHidden = this.f4263n;
        a.mMaxState = C1593j.C1598b.values()[this.f4264o];
        Bundle bundle2 = this.f4265p;
        if (bundle2 != null) {
            a.mSavedFragmentState = bundle2;
        } else {
            a.mSavedFragmentState = new Bundle();
        }
        return a;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f4253d);
        sb.append(" (");
        sb.append(this.f4254e);
        sb.append(")}:");
        if (this.f4255f) {
            sb.append(" fromLayout");
        }
        if (this.f4257h != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f4257h));
        }
        String str = this.f4258i;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f4258i);
        }
        if (this.f4259j) {
            sb.append(" retainInstance");
        }
        if (this.f4260k) {
            sb.append(" removing");
        }
        if (this.f4261l) {
            sb.append(" detached");
        }
        if (this.f4263n) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f4253d);
        parcel.writeString(this.f4254e);
        parcel.writeInt(this.f4255f ? 1 : 0);
        parcel.writeInt(this.f4256g);
        parcel.writeInt(this.f4257h);
        parcel.writeString(this.f4258i);
        parcel.writeInt(this.f4259j ? 1 : 0);
        parcel.writeInt(this.f4260k ? 1 : 0);
        parcel.writeInt(this.f4261l ? 1 : 0);
        parcel.writeBundle(this.f4262m);
        parcel.writeInt(this.f4263n ? 1 : 0);
        parcel.writeBundle(this.f4265p);
        parcel.writeInt(this.f4264o);
    }

    FragmentState(Parcel parcel) {
        this.f4253d = parcel.readString();
        this.f4254e = parcel.readString();
        boolean z = true;
        this.f4255f = parcel.readInt() != 0;
        this.f4256g = parcel.readInt();
        this.f4257h = parcel.readInt();
        this.f4258i = parcel.readString();
        this.f4259j = parcel.readInt() != 0;
        this.f4260k = parcel.readInt() != 0;
        this.f4261l = parcel.readInt() != 0;
        this.f4262m = parcel.readBundle();
        this.f4263n = parcel.readInt() == 0 ? false : z;
        this.f4265p = parcel.readBundle();
        this.f4264o = parcel.readInt();
    }
}
