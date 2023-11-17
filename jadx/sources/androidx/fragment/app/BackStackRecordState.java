package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.C1493e0;
import androidx.lifecycle.C1593j;
import java.util.ArrayList;
import java.util.Map;

@SuppressLint({"BanParcelableUsage"})
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new C1425a();

    /* renamed from: d */
    final int[] f4111d;

    /* renamed from: e */
    final ArrayList f4112e;

    /* renamed from: f */
    final int[] f4113f;

    /* renamed from: g */
    final int[] f4114g;

    /* renamed from: h */
    final int f4115h;

    /* renamed from: i */
    final String f4116i;

    /* renamed from: j */
    final int f4117j;

    /* renamed from: k */
    final int f4118k;

    /* renamed from: l */
    final CharSequence f4119l;

    /* renamed from: m */
    final int f4120m;

    /* renamed from: n */
    final CharSequence f4121n;

    /* renamed from: o */
    final ArrayList f4122o;

    /* renamed from: p */
    final ArrayList f4123p;

    /* renamed from: q */
    final boolean f4124q;

    /* renamed from: androidx.fragment.app.BackStackRecordState$a */
    class C1425a implements Parcelable.Creator {
        C1425a() {
        }

        /* renamed from: a */
        public BackStackRecordState createFromParcel(Parcel parcel) {
            return new BackStackRecordState(parcel);
        }

        /* renamed from: b */
        public BackStackRecordState[] newArray(int i) {
            return new BackStackRecordState[i];
        }
    }

    BackStackRecordState(C1463a aVar) {
        int size = aVar.f4362c.size();
        this.f4111d = new int[(size * 6)];
        if (aVar.f4368i) {
            this.f4112e = new ArrayList(size);
            this.f4113f = new int[size];
            this.f4114g = new int[size];
            int i = 0;
            int i2 = 0;
            while (i < size) {
                C1493e0.C1494a aVar2 = (C1493e0.C1494a) aVar.f4362c.get(i);
                int i3 = i2 + 1;
                this.f4111d[i2] = aVar2.f4379a;
                ArrayList arrayList = this.f4112e;
                Fragment fragment = aVar2.f4380b;
                arrayList.add(fragment != null ? fragment.mWho : null);
                int[] iArr = this.f4111d;
                int i4 = i3 + 1;
                iArr[i3] = aVar2.f4381c;
                int i5 = i4 + 1;
                iArr[i4] = aVar2.f4382d;
                int i6 = i5 + 1;
                iArr[i5] = aVar2.f4383e;
                int i7 = i6 + 1;
                iArr[i6] = aVar2.f4384f;
                iArr[i7] = aVar2.f4385g;
                this.f4113f[i] = aVar2.f4386h.ordinal();
                this.f4114g[i] = aVar2.f4387i.ordinal();
                i++;
                i2 = i7 + 1;
            }
            this.f4115h = aVar.f4367h;
            this.f4116i = aVar.f4370k;
            this.f4117j = aVar.f4269v;
            this.f4118k = aVar.f4371l;
            this.f4119l = aVar.f4372m;
            this.f4120m = aVar.f4373n;
            this.f4121n = aVar.f4374o;
            this.f4122o = aVar.f4375p;
            this.f4123p = aVar.f4376q;
            this.f4124q = aVar.f4377r;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    /* renamed from: a */
    private void m4919a(C1463a aVar) {
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i < this.f4111d.length) {
                C1493e0.C1494a aVar2 = new C1493e0.C1494a();
                int i3 = i + 1;
                aVar2.f4379a = this.f4111d[i];
                if (FragmentManager.m4954M0(2)) {
                    Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i2 + " base fragment #" + this.f4111d[i3]);
                }
                aVar2.f4386h = C1593j.C1598b.values()[this.f4113f[i2]];
                aVar2.f4387i = C1593j.C1598b.values()[this.f4114g[i2]];
                int[] iArr = this.f4111d;
                int i4 = i3 + 1;
                if (iArr[i3] == 0) {
                    z = false;
                }
                aVar2.f4381c = z;
                int i5 = i4 + 1;
                int i6 = iArr[i4];
                aVar2.f4382d = i6;
                int i7 = i5 + 1;
                int i8 = iArr[i5];
                aVar2.f4383e = i8;
                int i9 = i7 + 1;
                int i12 = iArr[i7];
                aVar2.f4384f = i12;
                int i13 = iArr[i9];
                aVar2.f4385g = i13;
                aVar.f4363d = i6;
                aVar.f4364e = i8;
                aVar.f4365f = i12;
                aVar.f4366g = i13;
                aVar.mo4635f(aVar2);
                i2++;
                i = i9 + 1;
            } else {
                aVar.f4367h = this.f4115h;
                aVar.f4370k = this.f4116i;
                aVar.f4368i = true;
                aVar.f4371l = this.f4118k;
                aVar.f4372m = this.f4119l;
                aVar.f4373n = this.f4120m;
                aVar.f4374o = this.f4121n;
                aVar.f4375p = this.f4122o;
                aVar.f4376q = this.f4123p;
                aVar.f4377r = this.f4124q;
                return;
            }
        }
    }

    /* renamed from: b */
    public C1463a mo4133b(FragmentManager fragmentManager) {
        C1463a aVar = new C1463a(fragmentManager);
        m4919a(aVar);
        aVar.f4269v = this.f4117j;
        for (int i = 0; i < this.f4112e.size(); i++) {
            String str = (String) this.f4112e.get(i);
            if (str != null) {
                ((C1493e0.C1494a) aVar.f4362c.get(i)).f4380b = fragmentManager.mo4410h0(str);
            }
        }
        aVar.mo4526y(1);
        return aVar;
    }

    /* renamed from: d */
    public C1463a mo4134d(FragmentManager fragmentManager, Map map) {
        C1463a aVar = new C1463a(fragmentManager);
        m4919a(aVar);
        for (int i = 0; i < this.f4112e.size(); i++) {
            String str = (String) this.f4112e.get(i);
            if (str != null) {
                Fragment fragment = (Fragment) map.get(str);
                if (fragment != null) {
                    ((C1493e0.C1494a) aVar.f4362c.get(i)).f4380b = fragment;
                } else {
                    throw new IllegalStateException("Restoring FragmentTransaction " + this.f4116i + " failed due to missing saved state for Fragment (" + str + ")");
                }
            }
        }
        return aVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f4111d);
        parcel.writeStringList(this.f4112e);
        parcel.writeIntArray(this.f4113f);
        parcel.writeIntArray(this.f4114g);
        parcel.writeInt(this.f4115h);
        parcel.writeString(this.f4116i);
        parcel.writeInt(this.f4117j);
        parcel.writeInt(this.f4118k);
        TextUtils.writeToParcel(this.f4119l, parcel, 0);
        parcel.writeInt(this.f4120m);
        TextUtils.writeToParcel(this.f4121n, parcel, 0);
        parcel.writeStringList(this.f4122o);
        parcel.writeStringList(this.f4123p);
        parcel.writeInt(this.f4124q ? 1 : 0);
    }

    BackStackRecordState(Parcel parcel) {
        this.f4111d = parcel.createIntArray();
        this.f4112e = parcel.createStringArrayList();
        this.f4113f = parcel.createIntArray();
        this.f4114g = parcel.createIntArray();
        this.f4115h = parcel.readInt();
        this.f4116i = parcel.readString();
        this.f4117j = parcel.readInt();
        this.f4118k = parcel.readInt();
        this.f4119l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f4120m = parcel.readInt();
        this.f4121n = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f4122o = parcel.createStringArrayList();
        this.f4123p = parcel.createStringArrayList();
        this.f4124q = parcel.readInt() != 0;
    }
}
