package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import java.util.List;
import java.util.Map;
import p195o6.C7461a;

public final class zzs extends zzbz {
    public static final Parcelable.Creator<zzs> CREATOR = new C3797b();

    /* renamed from: j */
    private static final ArrayMap f12012j;

    /* renamed from: d */
    final int f12013d;

    /* renamed from: e */
    private List f12014e;

    /* renamed from: f */
    private List f12015f;

    /* renamed from: g */
    private List f12016g;

    /* renamed from: h */
    private List f12017h;

    /* renamed from: i */
    private List f12018i;

    static {
        ArrayMap arrayMap = new ArrayMap();
        f12012j = arrayMap;
        arrayMap.put("registered", FastJsonResponse.Field.m15213q0("registered", 2));
        arrayMap.put("in_progress", FastJsonResponse.Field.m15213q0("in_progress", 3));
        arrayMap.put("success", FastJsonResponse.Field.m15213q0("success", 4));
        arrayMap.put("failed", FastJsonResponse.Field.m15213q0("failed", 5));
        arrayMap.put("escrowed", FastJsonResponse.Field.m15213q0("escrowed", 6));
    }

    public zzs() {
        this.f12013d = 1;
    }

    /* renamed from: a */
    public final Map mo11599a() {
        return f12012j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo11600b(FastJsonResponse.Field field) {
        switch (field.mo12351s0()) {
            case 1:
                return Integer.valueOf(this.f12013d);
            case 2:
                return this.f12014e;
            case 3:
                return this.f12015f;
            case 4:
                return this.f12016g;
            case 5:
                return this.f12017h;
            case 6:
                return this.f12018i;
            default:
                int s0 = field.mo12351s0();
                throw new IllegalStateException("Unknown SafeParcelable id=" + s0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo11601e(FastJsonResponse.Field field) {
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, this.f12013d);
        C7461a.m28394z(parcel, 2, this.f12014e, false);
        C7461a.m28394z(parcel, 3, this.f12015f, false);
        C7461a.m28394z(parcel, 4, this.f12016g, false);
        C7461a.m28394z(parcel, 5, this.f12017h, false);
        C7461a.m28394z(parcel, 6, this.f12018i, false);
        C7461a.m28370b(parcel, a);
    }

    zzs(int i, List list, List list2, List list3, List list4, List list5) {
        this.f12013d = i;
        this.f12014e = list;
        this.f12015f = list2;
        this.f12016g = list3;
        this.f12017h = list4;
        this.f12018i = list5;
    }
}
