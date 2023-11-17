package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p195o6.C7461a;

public final class zzu extends zzbz {
    public static final Parcelable.Creator<zzu> CREATOR = new C3798c();

    /* renamed from: j */
    private static final HashMap f12019j;

    /* renamed from: d */
    final Set f12020d;

    /* renamed from: e */
    final int f12021e;

    /* renamed from: f */
    private zzw f12022f;

    /* renamed from: g */
    private String f12023g;

    /* renamed from: h */
    private String f12024h;

    /* renamed from: i */
    private String f12025i;

    static {
        HashMap hashMap = new HashMap();
        f12019j = hashMap;
        hashMap.put("authenticatorInfo", FastJsonResponse.Field.m15215w("authenticatorInfo", 2, zzw.class));
        hashMap.put("signature", FastJsonResponse.Field.m15211f0("signature", 3));
        hashMap.put("package", FastJsonResponse.Field.m15211f0("package", 4));
    }

    public zzu() {
        this.f12020d = new HashSet(3);
        this.f12021e = 1;
    }

    /* renamed from: a */
    public final /* synthetic */ Map mo11599a() {
        return f12019j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo11600b(FastJsonResponse.Field field) {
        int s0 = field.mo12351s0();
        if (s0 == 1) {
            return Integer.valueOf(this.f12021e);
        }
        if (s0 == 2) {
            return this.f12022f;
        }
        if (s0 == 3) {
            return this.f12023g;
        }
        if (s0 == 4) {
            return this.f12024h;
        }
        int s02 = field.mo12351s0();
        throw new IllegalStateException("Unknown SafeParcelable id=" + s02);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo11601e(FastJsonResponse.Field field) {
        return this.f12020d.contains(Integer.valueOf(field.mo12351s0()));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        Set set = this.f12020d;
        if (set.contains(1)) {
            C7461a.m28383o(parcel, 1, this.f12021e);
        }
        if (set.contains(2)) {
            C7461a.m28390v(parcel, 2, this.f12022f, i, true);
        }
        if (set.contains(3)) {
            C7461a.m28392x(parcel, 3, this.f12023g, true);
        }
        if (set.contains(4)) {
            C7461a.m28392x(parcel, 4, this.f12024h, true);
        }
        if (set.contains(5)) {
            C7461a.m28392x(parcel, 5, this.f12025i, true);
        }
        C7461a.m28370b(parcel, a);
    }

    zzu(Set set, int i, zzw zzw, String str, String str2, String str3) {
        this.f12020d = set;
        this.f12021e = i;
        this.f12022f = zzw;
        this.f12023g = str;
        this.f12024h = str2;
        this.f12025i = str3;
    }
}
