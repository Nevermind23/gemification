package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import p182n6.C7258g;
import p195o6.C7461a;
import p196o7.C7479h;
import p209p7.C7739f;

public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new C4550a();

    /* renamed from: w */
    private static final Integer f13998w = Integer.valueOf(Color.argb(C11051p3.f31759c, 236, 233, 225));

    /* renamed from: d */
    private Boolean f13999d;

    /* renamed from: e */
    private Boolean f14000e;

    /* renamed from: f */
    private int f14001f = -1;

    /* renamed from: g */
    private CameraPosition f14002g;

    /* renamed from: h */
    private Boolean f14003h;

    /* renamed from: i */
    private Boolean f14004i;

    /* renamed from: j */
    private Boolean f14005j;

    /* renamed from: k */
    private Boolean f14006k;

    /* renamed from: l */
    private Boolean f14007l;

    /* renamed from: m */
    private Boolean f14008m;

    /* renamed from: n */
    private Boolean f14009n;

    /* renamed from: o */
    private Boolean f14010o;

    /* renamed from: p */
    private Boolean f14011p;

    /* renamed from: q */
    private Float f14012q = null;

    /* renamed from: r */
    private Float f14013r = null;

    /* renamed from: s */
    private LatLngBounds f14014s = null;

    /* renamed from: t */
    private Boolean f14015t;

    /* renamed from: u */
    private Integer f14016u = null;

    /* renamed from: v */
    private String f14017v = null;

    public GoogleMapOptions() {
    }

    /* renamed from: X1 */
    public static CameraPosition m17394X1(Context context, AttributeSet attributeSet) {
        float f;
        float f2;
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C7479h.f21763a);
        int i = C7479h.f21769g;
        if (obtainAttributes.hasValue(i)) {
            f = obtainAttributes.getFloat(i, Utils.FLOAT_EPSILON);
        } else {
            f = 0.0f;
        }
        int i2 = C7479h.f21770h;
        if (obtainAttributes.hasValue(i2)) {
            f2 = obtainAttributes.getFloat(i2, Utils.FLOAT_EPSILON);
        } else {
            f2 = 0.0f;
        }
        LatLng latLng = new LatLng((double) f, (double) f2);
        CameraPosition.C4555a v = CameraPosition.m17444v();
        v.mo14091c(latLng);
        int i3 = C7479h.f21772j;
        if (obtainAttributes.hasValue(i3)) {
            v.mo14093e(obtainAttributes.getFloat(i3, Utils.FLOAT_EPSILON));
        }
        int i4 = C7479h.f21766d;
        if (obtainAttributes.hasValue(i4)) {
            v.mo14089a(obtainAttributes.getFloat(i4, Utils.FLOAT_EPSILON));
        }
        int i5 = C7479h.f21771i;
        if (obtainAttributes.hasValue(i5)) {
            v.mo14092d(obtainAttributes.getFloat(i5, Utils.FLOAT_EPSILON));
        }
        obtainAttributes.recycle();
        return v.mo14090b();
    }

    /* renamed from: Y1 */
    public static LatLngBounds m17395Y1(Context context, AttributeSet attributeSet) {
        Float f;
        Float f2;
        Float f3;
        Float f4;
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C7479h.f21763a);
        int i = C7479h.f21775m;
        if (obtainAttributes.hasValue(i)) {
            f = Float.valueOf(obtainAttributes.getFloat(i, Utils.FLOAT_EPSILON));
        } else {
            f = null;
        }
        int i2 = C7479h.f21776n;
        if (obtainAttributes.hasValue(i2)) {
            f2 = Float.valueOf(obtainAttributes.getFloat(i2, Utils.FLOAT_EPSILON));
        } else {
            f2 = null;
        }
        int i3 = C7479h.f21773k;
        if (obtainAttributes.hasValue(i3)) {
            f3 = Float.valueOf(obtainAttributes.getFloat(i3, Utils.FLOAT_EPSILON));
        } else {
            f3 = null;
        }
        int i4 = C7479h.f21774l;
        if (obtainAttributes.hasValue(i4)) {
            f4 = Float.valueOf(obtainAttributes.getFloat(i4, Utils.FLOAT_EPSILON));
        } else {
            f4 = null;
        }
        obtainAttributes.recycle();
        if (f == null || f2 == null || f3 == null || f4 == null) {
            return null;
        }
        return new LatLngBounds(new LatLng((double) f.floatValue(), (double) f2.floatValue()), new LatLng((double) f3.floatValue(), (double) f4.floatValue()));
    }

    /* renamed from: f0 */
    public static GoogleMapOptions m17396f0(Context context, AttributeSet attributeSet) {
        String string;
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C7479h.f21763a);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        int i = C7479h.f21779q;
        if (obtainAttributes.hasValue(i)) {
            googleMapOptions.mo14035M1(obtainAttributes.getInt(i, -1));
        }
        int i2 = C7479h.f21762A;
        if (obtainAttributes.hasValue(i2)) {
            googleMapOptions.mo14044U1(obtainAttributes.getBoolean(i2, false));
        }
        int i3 = C7479h.f21788z;
        if (obtainAttributes.hasValue(i3)) {
            googleMapOptions.mo14043T1(obtainAttributes.getBoolean(i3, false));
        }
        int i4 = C7479h.f21780r;
        if (obtainAttributes.hasValue(i4)) {
            googleMapOptions.mo14040R(obtainAttributes.getBoolean(i4, true));
        }
        int i5 = C7479h.f21782t;
        if (obtainAttributes.hasValue(i5)) {
            googleMapOptions.mo14038P1(obtainAttributes.getBoolean(i5, true));
        }
        int i6 = C7479h.f21784v;
        if (obtainAttributes.hasValue(i6)) {
            googleMapOptions.mo14041R1(obtainAttributes.getBoolean(i6, true));
        }
        int i7 = C7479h.f21783u;
        if (obtainAttributes.hasValue(i7)) {
            googleMapOptions.mo14039Q1(obtainAttributes.getBoolean(i7, true));
        }
        int i8 = C7479h.f21785w;
        if (obtainAttributes.hasValue(i8)) {
            googleMapOptions.mo14042S1(obtainAttributes.getBoolean(i8, true));
        }
        int i9 = C7479h.f21787y;
        if (obtainAttributes.hasValue(i9)) {
            googleMapOptions.mo14046W1(obtainAttributes.getBoolean(i9, true));
        }
        int i12 = C7479h.f21786x;
        if (obtainAttributes.hasValue(i12)) {
            googleMapOptions.mo14045V1(obtainAttributes.getBoolean(i12, true));
        }
        int i13 = C7479h.f21777o;
        if (obtainAttributes.hasValue(i13)) {
            googleMapOptions.mo14032J1(obtainAttributes.getBoolean(i13, false));
        }
        int i14 = C7479h.f21781s;
        if (obtainAttributes.hasValue(i14)) {
            googleMapOptions.mo14034L1(obtainAttributes.getBoolean(i14, true));
        }
        int i15 = C7479h.f21764b;
        if (obtainAttributes.hasValue(i15)) {
            googleMapOptions.mo14052v(obtainAttributes.getBoolean(i15, false));
        }
        int i16 = C7479h.f21768f;
        if (obtainAttributes.hasValue(i16)) {
            googleMapOptions.mo14037O1(obtainAttributes.getFloat(i16, Float.NEGATIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(i16)) {
            googleMapOptions.mo14036N1(obtainAttributes.getFloat(C7479h.f21767e, Float.POSITIVE_INFINITY));
        }
        int i17 = C7479h.f21765c;
        if (obtainAttributes.hasValue(i17)) {
            googleMapOptions.mo14053w(Integer.valueOf(obtainAttributes.getColor(i17, f13998w.intValue())));
        }
        int i18 = C7479h.f21778p;
        if (obtainAttributes.hasValue(i18) && (string = obtainAttributes.getString(i18)) != null && !string.isEmpty()) {
            googleMapOptions.mo14033K1(string);
        }
        googleMapOptions.mo14031I1(m17395Y1(context, attributeSet));
        googleMapOptions.mo14055x(m17394X1(context, attributeSet));
        obtainAttributes.recycle();
        return googleMapOptions;
    }

    /* renamed from: F1 */
    public int mo14028F1() {
        return this.f14001f;
    }

    /* renamed from: G1 */
    public Float mo14029G1() {
        return this.f14013r;
    }

    /* renamed from: H1 */
    public Float mo14030H1() {
        return this.f14012q;
    }

    /* renamed from: I1 */
    public GoogleMapOptions mo14031I1(LatLngBounds latLngBounds) {
        this.f14014s = latLngBounds;
        return this;
    }

    /* renamed from: J1 */
    public GoogleMapOptions mo14032J1(boolean z) {
        this.f14009n = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: K1 */
    public GoogleMapOptions mo14033K1(String str) {
        this.f14017v = str;
        return this;
    }

    /* renamed from: L1 */
    public GoogleMapOptions mo14034L1(boolean z) {
        this.f14010o = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: M1 */
    public GoogleMapOptions mo14035M1(int i) {
        this.f14001f = i;
        return this;
    }

    /* renamed from: N1 */
    public GoogleMapOptions mo14036N1(float f) {
        this.f14013r = Float.valueOf(f);
        return this;
    }

    /* renamed from: O1 */
    public GoogleMapOptions mo14037O1(float f) {
        this.f14012q = Float.valueOf(f);
        return this;
    }

    /* renamed from: P1 */
    public GoogleMapOptions mo14038P1(boolean z) {
        this.f14008m = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: Q1 */
    public GoogleMapOptions mo14039Q1(boolean z) {
        this.f14005j = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: R */
    public GoogleMapOptions mo14040R(boolean z) {
        this.f14004i = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: R1 */
    public GoogleMapOptions mo14041R1(boolean z) {
        this.f14015t = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: S1 */
    public GoogleMapOptions mo14042S1(boolean z) {
        this.f14007l = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: T1 */
    public GoogleMapOptions mo14043T1(boolean z) {
        this.f14000e = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: U1 */
    public GoogleMapOptions mo14044U1(boolean z) {
        this.f13999d = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: V1 */
    public GoogleMapOptions mo14045V1(boolean z) {
        this.f14003h = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: W1 */
    public GoogleMapOptions mo14046W1(boolean z) {
        this.f14006k = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: f1 */
    public LatLngBounds mo14047f1() {
        return this.f14014s;
    }

    /* renamed from: i1 */
    public String mo14048i1() {
        return this.f14017v;
    }

    /* renamed from: q0 */
    public Integer mo14049q0() {
        return this.f14016u;
    }

    /* renamed from: s0 */
    public CameraPosition mo14050s0() {
        return this.f14002g;
    }

    public String toString() {
        return C7258g.m27882c(this).mo21632a("MapType", Integer.valueOf(this.f14001f)).mo21632a("LiteMode", this.f14009n).mo21632a("Camera", this.f14002g).mo21632a("CompassEnabled", this.f14004i).mo21632a("ZoomControlsEnabled", this.f14003h).mo21632a("ScrollGesturesEnabled", this.f14005j).mo21632a("ZoomGesturesEnabled", this.f14006k).mo21632a("TiltGesturesEnabled", this.f14007l).mo21632a("RotateGesturesEnabled", this.f14008m).mo21632a("ScrollGesturesEnabledDuringRotateOrZoom", this.f14015t).mo21632a("MapToolbarEnabled", this.f14010o).mo21632a("AmbientEnabled", this.f14011p).mo21632a("MinZoomPreference", this.f14012q).mo21632a("MaxZoomPreference", this.f14013r).mo21632a("BackgroundColor", this.f14016u).mo21632a("LatLngBoundsForCameraTarget", this.f14014s).mo21632a("ZOrderOnTop", this.f13999d).mo21632a("UseViewLifecycleInFragment", this.f14000e).toString();
    }

    /* renamed from: v */
    public GoogleMapOptions mo14052v(boolean z) {
        this.f14011p = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: w */
    public GoogleMapOptions mo14053w(Integer num) {
        this.f14016u = num;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28375g(parcel, 2, C7739f.m29386a(this.f13999d));
        C7461a.m28375g(parcel, 3, C7739f.m29386a(this.f14000e));
        C7461a.m28383o(parcel, 4, mo14028F1());
        C7461a.m28390v(parcel, 5, mo14050s0(), i, false);
        C7461a.m28375g(parcel, 6, C7739f.m29386a(this.f14003h));
        C7461a.m28375g(parcel, 7, C7739f.m29386a(this.f14004i));
        C7461a.m28375g(parcel, 8, C7739f.m29386a(this.f14005j));
        C7461a.m28375g(parcel, 9, C7739f.m29386a(this.f14006k));
        C7461a.m28375g(parcel, 10, C7739f.m29386a(this.f14007l));
        C7461a.m28375g(parcel, 11, C7739f.m29386a(this.f14008m));
        C7461a.m28375g(parcel, 12, C7739f.m29386a(this.f14009n));
        C7461a.m28375g(parcel, 14, C7739f.m29386a(this.f14010o));
        C7461a.m28375g(parcel, 15, C7739f.m29386a(this.f14011p));
        C7461a.m28381m(parcel, 16, mo14030H1(), false);
        C7461a.m28381m(parcel, 17, mo14029G1(), false);
        C7461a.m28390v(parcel, 18, mo14047f1(), i, false);
        C7461a.m28375g(parcel, 19, C7739f.m29386a(this.f14015t));
        C7461a.m28385q(parcel, 20, mo14049q0(), false);
        C7461a.m28392x(parcel, 21, mo14048i1(), false);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public GoogleMapOptions mo14055x(CameraPosition cameraPosition) {
        this.f14002g = cameraPosition;
        return this;
    }

    GoogleMapOptions(byte b, byte b2, int i, CameraPosition cameraPosition, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b12, byte b13, Float f, Float f2, LatLngBounds latLngBounds, byte b14, Integer num, String str) {
        this.f13999d = C7739f.m29387b(b);
        this.f14000e = C7739f.m29387b(b2);
        this.f14001f = i;
        this.f14002g = cameraPosition;
        this.f14003h = C7739f.m29387b(b3);
        this.f14004i = C7739f.m29387b(b4);
        this.f14005j = C7739f.m29387b(b5);
        this.f14006k = C7739f.m29387b(b6);
        this.f14007l = C7739f.m29387b(b7);
        this.f14008m = C7739f.m29387b(b8);
        this.f14009n = C7739f.m29387b(b9);
        this.f14010o = C7739f.m29387b(b12);
        this.f14011p = C7739f.m29387b(b13);
        this.f14012q = f;
        this.f14013r = f2;
        this.f14014s = latLngBounds;
        this.f14015t = C7739f.m29387b(b14);
        this.f14016u = num;
        this.f14017v = str;
    }
}
