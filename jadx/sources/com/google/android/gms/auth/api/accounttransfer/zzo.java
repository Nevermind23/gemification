package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p195o6.C7461a;

public final class zzo extends zzbz {
    public static final Parcelable.Creator<zzo> CREATOR = new C3796a();

    /* renamed from: i */
    private static final HashMap f12006i;

    /* renamed from: d */
    final Set f12007d;

    /* renamed from: e */
    final int f12008e;

    /* renamed from: f */
    private ArrayList f12009f;

    /* renamed from: g */
    private int f12010g;

    /* renamed from: h */
    private zzs f12011h;

    static {
        HashMap hashMap = new HashMap();
        f12006i = hashMap;
        hashMap.put("authenticatorData", FastJsonResponse.Field.m15216x("authenticatorData", 2, zzu.class));
        hashMap.put("progress", FastJsonResponse.Field.m15215w("progress", 4, zzs.class));
    }

    public zzo() {
        this.f12007d = new HashSet(1);
        this.f12008e = 1;
    }

    /* renamed from: a */
    public final /* synthetic */ Map mo11599a() {
        return f12006i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo11600b(FastJsonResponse.Field field) {
        int s0 = field.mo12351s0();
        if (s0 == 1) {
            return Integer.valueOf(this.f12008e);
        }
        if (s0 == 2) {
            return this.f12009f;
        }
        if (s0 == 4) {
            return this.f12011h;
        }
        int s02 = field.mo12351s0();
        throw new IllegalStateException("Unknown SafeParcelable id=" + s02);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo11601e(FastJsonResponse.Field field) {
        return this.f12007d.contains(Integer.valueOf(field.mo12351s0()));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        Set set = this.f12007d;
        if (set.contains(1)) {
            C7461a.m28383o(parcel, 1, this.f12008e);
        }
        if (set.contains(2)) {
            C7461a.m28364C(parcel, 2, this.f12009f, true);
        }
        if (set.contains(3)) {
            C7461a.m28383o(parcel, 3, this.f12010g);
        }
        if (set.contains(4)) {
            C7461a.m28390v(parcel, 4, this.f12011h, i, true);
        }
        C7461a.m28370b(parcel, a);
    }

    zzo(Set set, int i, ArrayList arrayList, int i2, zzs zzs) {
        this.f12007d = set;
        this.f12008e = i;
        this.f12009f = arrayList;
        this.f12010g = i2;
        this.f12011h = zzs;
    }
}
