package p195o6;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p182n6.C7264i;

/* renamed from: o6.b */
public abstract class C7462b {
    /* renamed from: a */
    public static SafeParcelable m28395a(byte[] bArr, Parcelable.Creator creator) {
        C7264i.m27902k(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        SafeParcelable safeParcelable = (SafeParcelable) creator.createFromParcel(obtain);
        obtain.recycle();
        return safeParcelable;
    }

    /* renamed from: b */
    public static SafeParcelable m28396b(Intent intent, String str, Parcelable.Creator creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return m28395a(byteArrayExtra, creator);
    }
}
