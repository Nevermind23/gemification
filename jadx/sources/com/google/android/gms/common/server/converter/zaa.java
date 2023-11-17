package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import p195o6.C7461a;

public final class zaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaa> CREATOR = new C3999a();

    /* renamed from: d */
    final int f12758d;

    /* renamed from: e */
    private final StringToIntConverter f12759e;

    zaa(int i, StringToIntConverter stringToIntConverter) {
        this.f12758d = i;
        this.f12759e = stringToIntConverter;
    }

    /* renamed from: v */
    public static zaa m15201v(FastJsonResponse.C4002a aVar) {
        if (aVar instanceof StringToIntConverter) {
            return new zaa((StringToIntConverter) aVar);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    /* renamed from: w */
    public final FastJsonResponse.C4002a mo12339w() {
        StringToIntConverter stringToIntConverter = this.f12759e;
        if (stringToIntConverter != null) {
            return stringToIntConverter;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, this.f12758d);
        C7461a.m28390v(parcel, 2, this.f12759e, i, false);
        C7461a.m28370b(parcel, a);
    }

    private zaa(StringToIntConverter stringToIntConverter) {
        this.f12758d = 1;
        this.f12759e = stringToIntConverter;
    }
}
