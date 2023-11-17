package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import p195o6.C7461a;

public final class StringToIntConverter extends AbstractSafeParcelable implements FastJsonResponse.C4002a {
    public static final Parcelable.Creator<StringToIntConverter> CREATOR = new C4000b();

    /* renamed from: d */
    final int f12755d;

    /* renamed from: e */
    private final HashMap f12756e;

    /* renamed from: f */
    private final SparseArray f12757f;

    public StringToIntConverter() {
        this.f12755d = 1;
        this.f12756e = new HashMap();
        this.f12757f = new SparseArray();
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ Object mo12330i(Object obj) {
        String str = (String) this.f12757f.get(((Integer) obj).intValue());
        if (str != null || !this.f12756e.containsKey("gms_unknown")) {
            return str;
        }
        return "gms_unknown";
    }

    /* renamed from: v */
    public StringToIntConverter mo12331v(String str, int i) {
        this.f12756e.put(str, Integer.valueOf(i));
        this.f12757f.put(i, str);
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, this.f12755d);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f12756e.keySet()) {
            arrayList.add(new zac(str, ((Integer) this.f12756e.get(str)).intValue()));
        }
        C7461a.m28364C(parcel, 2, arrayList, false);
        C7461a.m28370b(parcel, a);
    }

    StringToIntConverter(int i, ArrayList arrayList) {
        this.f12755d = i;
        this.f12756e = new HashMap();
        this.f12757f = new SparseArray();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zac zac = (zac) arrayList.get(i2);
            mo12331v(zac.f12761e, zac.f12762f);
        }
    }
}
