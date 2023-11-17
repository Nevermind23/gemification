package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.ArraySet;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p195o6.C7461a;

public final class zzw extends zzbz {
    public static final Parcelable.Creator<zzw> CREATOR = new C3799d();

    /* renamed from: k */
    private static final HashMap f12026k;

    /* renamed from: d */
    final Set f12027d;

    /* renamed from: e */
    final int f12028e;

    /* renamed from: f */
    private String f12029f;

    /* renamed from: g */
    private int f12030g;

    /* renamed from: h */
    private byte[] f12031h;

    /* renamed from: i */
    private PendingIntent f12032i;

    /* renamed from: j */
    private DeviceMetaData f12033j;

    static {
        HashMap hashMap = new HashMap();
        f12026k = hashMap;
        hashMap.put("accountType", FastJsonResponse.Field.m15211f0("accountType", 2));
        hashMap.put("status", FastJsonResponse.Field.m15210R("status", 3));
        hashMap.put("transferBytes", FastJsonResponse.Field.m15214v("transferBytes", 4));
    }

    public zzw() {
        this.f12027d = new ArraySet(3);
        this.f12028e = 1;
    }

    /* renamed from: a */
    public final /* synthetic */ Map mo11599a() {
        return f12026k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo11600b(FastJsonResponse.Field field) {
        int s0 = field.mo12351s0();
        if (s0 == 1) {
            return Integer.valueOf(this.f12028e);
        }
        if (s0 == 2) {
            return this.f12029f;
        }
        if (s0 == 3) {
            return Integer.valueOf(this.f12030g);
        }
        if (s0 == 4) {
            return this.f12031h;
        }
        int s02 = field.mo12351s0();
        throw new IllegalStateException("Unknown SafeParcelable id=" + s02);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo11601e(FastJsonResponse.Field field) {
        return this.f12027d.contains(Integer.valueOf(field.mo12351s0()));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        Set set = this.f12027d;
        if (set.contains(1)) {
            C7461a.m28383o(parcel, 1, this.f12028e);
        }
        if (set.contains(2)) {
            C7461a.m28392x(parcel, 2, this.f12029f, true);
        }
        if (set.contains(3)) {
            C7461a.m28383o(parcel, 3, this.f12030g);
        }
        if (set.contains(4)) {
            C7461a.m28376h(parcel, 4, this.f12031h, true);
        }
        if (set.contains(5)) {
            C7461a.m28390v(parcel, 5, this.f12032i, i, true);
        }
        if (set.contains(6)) {
            C7461a.m28390v(parcel, 6, this.f12033j, i, true);
        }
        C7461a.m28370b(parcel, a);
    }

    zzw(Set set, int i, String str, int i2, byte[] bArr, PendingIntent pendingIntent, DeviceMetaData deviceMetaData) {
        this.f12027d = set;
        this.f12028e = i;
        this.f12029f = str;
        this.f12030g = i2;
        this.f12031h = bArr;
        this.f12032i = pendingIntent;
        this.f12033j = deviceMetaData;
    }
}
