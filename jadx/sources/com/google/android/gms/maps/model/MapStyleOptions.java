package com.google.android.gms.maps.model;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.IOException;
import p182n6.C7264i;
import p195o6.C7461a;
import p222q7.C7906k;
import p260t6.C8410l;

public final class MapStyleOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MapStyleOptions> CREATOR = new C7906k();

    /* renamed from: d */
    private String f14081d;

    public MapStyleOptions(String str) {
        C7264i.m27903l(str, "json must not be null");
        this.f14081d = str;
    }

    /* renamed from: v */
    public static MapStyleOptions m17480v(Context context, int i) {
        try {
            return new MapStyleOptions(new String(C8410l.m31559c(context.getResources().openRawResource(i)), "UTF-8"));
        } catch (IOException e) {
            String obj = e.toString();
            throw new Resources.NotFoundException("Failed to read resource " + i + ": " + obj);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28392x(parcel, 2, this.f14081d, false);
        C7461a.m28370b(parcel, a);
    }
}
