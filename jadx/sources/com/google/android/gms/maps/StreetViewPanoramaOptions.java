package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewSource;
import p182n6.C7258g;
import p195o6.C7461a;
import p209p7.C7739f;

public final class StreetViewPanoramaOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaOptions> CREATOR = new C4551b();

    /* renamed from: d */
    private StreetViewPanoramaCamera f14018d;

    /* renamed from: e */
    private String f14019e;

    /* renamed from: f */
    private LatLng f14020f;

    /* renamed from: g */
    private Integer f14021g;

    /* renamed from: h */
    private Boolean f14022h;

    /* renamed from: i */
    private Boolean f14023i;

    /* renamed from: j */
    private Boolean f14024j;

    /* renamed from: k */
    private Boolean f14025k;

    /* renamed from: l */
    private Boolean f14026l;

    /* renamed from: m */
    private StreetViewSource f14027m = StreetViewSource.f14138e;

    public StreetViewPanoramaOptions() {
        Boolean bool = Boolean.TRUE;
        this.f14022h = bool;
        this.f14023i = bool;
        this.f14024j = bool;
        this.f14025k = bool;
    }

    /* renamed from: R */
    public StreetViewSource mo14056R() {
        return this.f14027m;
    }

    /* renamed from: f0 */
    public StreetViewPanoramaCamera mo14057f0() {
        return this.f14018d;
    }

    public String toString() {
        return C7258g.m27882c(this).mo21632a("PanoramaId", this.f14019e).mo21632a("Position", this.f14020f).mo21632a("Radius", this.f14021g).mo21632a("Source", this.f14027m).mo21632a("StreetViewPanoramaCamera", this.f14018d).mo21632a("UserNavigationEnabled", this.f14022h).mo21632a("ZoomGesturesEnabled", this.f14023i).mo21632a("PanningGesturesEnabled", this.f14024j).mo21632a("StreetNamesEnabled", this.f14025k).mo21632a("UseViewLifecycleInFragment", this.f14026l).toString();
    }

    /* renamed from: v */
    public String mo14059v() {
        return this.f14019e;
    }

    /* renamed from: w */
    public LatLng mo14060w() {
        return this.f14020f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28390v(parcel, 2, mo14057f0(), i, false);
        C7461a.m28392x(parcel, 3, mo14059v(), false);
        C7461a.m28390v(parcel, 4, mo14060w(), i, false);
        C7461a.m28385q(parcel, 5, mo14062x(), false);
        C7461a.m28375g(parcel, 6, C7739f.m29386a(this.f14022h));
        C7461a.m28375g(parcel, 7, C7739f.m29386a(this.f14023i));
        C7461a.m28375g(parcel, 8, C7739f.m29386a(this.f14024j));
        C7461a.m28375g(parcel, 9, C7739f.m29386a(this.f14025k));
        C7461a.m28375g(parcel, 10, C7739f.m29386a(this.f14026l));
        C7461a.m28390v(parcel, 11, mo14056R(), i, false);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public Integer mo14062x() {
        return this.f14021g;
    }

    StreetViewPanoramaOptions(StreetViewPanoramaCamera streetViewPanoramaCamera, String str, LatLng latLng, Integer num, byte b, byte b2, byte b3, byte b4, byte b5, StreetViewSource streetViewSource) {
        Boolean bool = Boolean.TRUE;
        this.f14022h = bool;
        this.f14023i = bool;
        this.f14024j = bool;
        this.f14025k = bool;
        this.f14018d = streetViewPanoramaCamera;
        this.f14020f = latLng;
        this.f14021g = num;
        this.f14019e = str;
        this.f14022h = C7739f.m29387b(b);
        this.f14023i = C7739f.m29387b(b2);
        this.f14024j = C7739f.m29387b(b3);
        this.f14025k = C7739f.m29387b(b4);
        this.f14026l = C7739f.m29387b(b5);
        this.f14027m = streetViewSource;
    }
}
