package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p182n6.C7264i;
import p195o6.C7461a;

public final class zan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zan> CREATOR = new C4005c();

    /* renamed from: d */
    final int f12787d;

    /* renamed from: e */
    private final HashMap f12788e;

    /* renamed from: f */
    private final String f12789f;

    zan(int i, ArrayList arrayList, String str) {
        this.f12787d = i;
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zal zal = (zal) arrayList.get(i2);
            String str2 = zal.f12782e;
            HashMap hashMap2 = new HashMap();
            int size2 = ((ArrayList) C7264i.m27902k(zal.f12783f)).size();
            for (int i3 = 0; i3 < size2; i3++) {
                zam zam = (zam) zal.f12783f.get(i3);
                hashMap2.put(zam.f12785e, zam.f12786f);
            }
            hashMap.put(str2, hashMap2);
        }
        this.f12788e = hashMap;
        this.f12789f = (String) C7264i.m27902k(str);
        mo12375x();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.f12788e.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map map = (Map) this.f12788e.get(str);
            for (String str2 : map.keySet()) {
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    /* renamed from: v */
    public final String mo12372v() {
        return this.f12789f;
    }

    /* renamed from: w */
    public final Map mo12373w(String str) {
        return (Map) this.f12788e.get(str);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, this.f12787d);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f12788e.keySet()) {
            arrayList.add(new zal(str, (Map) this.f12788e.get(str)));
        }
        C7461a.m28364C(parcel, 2, arrayList, false);
        C7461a.m28392x(parcel, 3, this.f12789f, false);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public final void mo12375x() {
        for (String str : this.f12788e.keySet()) {
            Map map = (Map) this.f12788e.get(str);
            for (String str2 : map.keySet()) {
                ((FastJsonResponse.Field) map.get(str2)).mo12348I1(this);
            }
        }
    }
}
