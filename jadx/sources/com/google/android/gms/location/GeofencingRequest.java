package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.location.zzbj;
import java.util.ArrayList;
import java.util.List;
import p182n6.C7264i;
import p183n7.C7297b;
import p195o6.C7461a;

public class GeofencingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GeofencingRequest> CREATOR = new C4536j();

    /* renamed from: d */
    private final List f13897d;

    /* renamed from: e */
    private final int f13898e;

    /* renamed from: f */
    private final String f13899f;

    /* renamed from: g */
    private final String f13900g;

    /* renamed from: com.google.android.gms.location.GeofencingRequest$a */
    public static final class C4524a {

        /* renamed from: a */
        private final List f13901a = new ArrayList();

        /* renamed from: b */
        private int f13902b = 5;

        /* renamed from: c */
        private String f13903c = "";

        /* renamed from: a */
        public C4524a mo13919a(C7297b bVar) {
            C7264i.m27903l(bVar, "geofence can't be null.");
            C7264i.m27893b(bVar instanceof zzbj, "Geofence must be created using Geofence.Builder.");
            this.f13901a.add((zzbj) bVar);
            return this;
        }

        /* renamed from: b */
        public GeofencingRequest mo13920b() {
            C7264i.m27893b(!this.f13901a.isEmpty(), "No geofence has been added to this request.");
            return new GeofencingRequest(this.f13901a, this.f13902b, this.f13903c, (String) null);
        }

        /* renamed from: c */
        public C4524a mo13921c(int i) {
            this.f13902b = i & 7;
            return this;
        }
    }

    GeofencingRequest(List list, int i, String str, String str2) {
        this.f13897d = list;
        this.f13898e = i;
        this.f13899f = str;
        this.f13900g = str2;
    }

    public String toString() {
        return "GeofencingRequest[geofences=" + this.f13897d + ", initialTrigger=" + this.f13898e + ", tag=" + this.f13899f + ", attributionTag=" + this.f13900g + "]";
    }

    /* renamed from: v */
    public int mo13916v() {
        return this.f13898e;
    }

    /* renamed from: w */
    public final GeofencingRequest mo13917w(String str) {
        return new GeofencingRequest(this.f13897d, this.f13898e, this.f13899f, str);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28364C(parcel, 1, this.f13897d, false);
        C7461a.m28383o(parcel, 2, mo13916v());
        C7461a.m28392x(parcel, 3, this.f13899f, false);
        C7461a.m28392x(parcel, 4, this.f13900g, false);
        C7461a.m28370b(parcel, a);
    }
}
