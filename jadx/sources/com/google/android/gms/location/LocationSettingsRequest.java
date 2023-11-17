package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p195o6.C7461a;

public final class LocationSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationSettingsRequest> CREATOR = new C4541o();

    /* renamed from: d */
    private final List f13928d;

    /* renamed from: e */
    private final boolean f13929e;

    /* renamed from: f */
    private final boolean f13930f;

    /* renamed from: com.google.android.gms.location.LocationSettingsRequest$a */
    public static final class C4526a {

        /* renamed from: a */
        private final ArrayList f13931a = new ArrayList();

        /* renamed from: b */
        private boolean f13932b = false;

        /* renamed from: c */
        private boolean f13933c = false;

        /* renamed from: a */
        public C4526a mo13950a(LocationRequest locationRequest) {
            if (locationRequest != null) {
                this.f13931a.add(locationRequest);
            }
            return this;
        }

        /* renamed from: b */
        public LocationSettingsRequest mo13951b() {
            return new LocationSettingsRequest(this.f13931a, this.f13932b, this.f13933c);
        }
    }

    LocationSettingsRequest(List list, boolean z, boolean z2) {
        this.f13928d = list;
        this.f13929e = z;
        this.f13930f = z2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28364C(parcel, 1, Collections.unmodifiableList(this.f13928d), false);
        C7461a.m28372d(parcel, 2, this.f13929e);
        C7461a.m28372d(parcel, 3, this.f13930f);
        C7461a.m28370b(parcel, a);
    }
}
