package com.salesforce.marketingcloud.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.salesforce.marketingcloud.internal.i */
public class C11508i {
    private C11508i() {
    }

    /* renamed from: a */
    public static <T> T m42061a(byte[] bArr, Parcelable.Creator<T> creator) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        T createFromParcel = creator.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }

    /* renamed from: a */
    public static byte[] m42062a(Parcelable parcelable) {
        Parcel obtain = Parcel.obtain();
        parcelable.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }
}
