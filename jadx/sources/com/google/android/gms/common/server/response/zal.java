package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.Map;
import p195o6.C7461a;

public final class zal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zal> CREATOR = new C4006d();

    /* renamed from: d */
    final int f12781d;

    /* renamed from: e */
    final String f12782e;

    /* renamed from: f */
    final ArrayList f12783f;

    zal(int i, String str, ArrayList arrayList) {
        this.f12781d = i;
        this.f12782e = str;
        this.f12783f = arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, this.f12781d);
        C7461a.m28392x(parcel, 2, this.f12782e, false);
        C7461a.m28364C(parcel, 3, this.f12783f, false);
        C7461a.m28370b(parcel, a);
    }

    zal(String str, Map map) {
        ArrayList arrayList;
        this.f12781d = 1;
        this.f12782e = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (String str2 : map.keySet()) {
                arrayList.add(new zam(str2, (FastJsonResponse.Field) map.get(str2)));
            }
        }
        this.f12783f = arrayList;
    }
}
