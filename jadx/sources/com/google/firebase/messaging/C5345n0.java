package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import p195o6.C7461a;

/* renamed from: com.google.firebase.messaging.n0 */
public class C5345n0 implements Parcelable.Creator {
    /* renamed from: c */
    static void m21146c(RemoteMessage remoteMessage, Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28374f(parcel, 2, remoteMessage.f16963d, false);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: a */
    public RemoteMessage createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            if (SafeParcelReader.m15151w(E) != 2) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                bundle = SafeParcelReader.m15134f(parcel, E);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new RemoteMessage(bundle);
    }

    /* renamed from: b */
    public RemoteMessage[] newArray(int i) {
        return new RemoteMessage[i];
    }
}
