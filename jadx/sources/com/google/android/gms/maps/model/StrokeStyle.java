package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p195o6.C7461a;

public final class StrokeStyle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StrokeStyle> CREATOR = new C4568j();

    /* renamed from: d */
    private final float f14141d;

    /* renamed from: e */
    private final int f14142e;

    /* renamed from: f */
    private final int f14143f;

    /* renamed from: g */
    private final boolean f14144g;

    /* renamed from: h */
    private final StampStyle f14145h;

    /* renamed from: com.google.android.gms.maps.model.StrokeStyle$a */
    public static final class C4558a {

        /* renamed from: a */
        private float f14146a;

        /* renamed from: b */
        private int f14147b;

        /* renamed from: c */
        private int f14148c;

        /* renamed from: d */
        private boolean f14149d;

        /* renamed from: e */
        private StampStyle f14150e;

        public C4558a(StrokeStyle strokeStyle) {
            this.f14146a = strokeStyle.mo14215x();
            Pair R = strokeStyle.mo14211R();
            this.f14147b = ((Integer) R.first).intValue();
            this.f14148c = ((Integer) R.second).intValue();
            this.f14149d = strokeStyle.mo14213w();
            this.f14150e = strokeStyle.mo14212v();
        }

        /* renamed from: a */
        public StrokeStyle mo14216a() {
            return new StrokeStyle(this.f14146a, this.f14147b, this.f14148c, this.f14149d, this.f14150e);
        }

        /* renamed from: b */
        public final C4558a mo14217b(boolean z) {
            this.f14149d = z;
            return this;
        }

        /* renamed from: c */
        public final C4558a mo14218c(float f) {
            this.f14146a = f;
            return this;
        }
    }

    StrokeStyle(float f, int i, int i2, boolean z, StampStyle stampStyle) {
        this.f14141d = f;
        this.f14142e = i;
        this.f14143f = i2;
        this.f14144g = z;
        this.f14145h = stampStyle;
    }

    /* renamed from: R */
    public final Pair mo14211R() {
        return new Pair(Integer.valueOf(this.f14142e), Integer.valueOf(this.f14143f));
    }

    /* renamed from: v */
    public StampStyle mo14212v() {
        return this.f14145h;
    }

    /* renamed from: w */
    public boolean mo14213w() {
        return this.f14144g;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28380l(parcel, 2, this.f14141d);
        C7461a.m28383o(parcel, 3, this.f14142e);
        C7461a.m28383o(parcel, 4, this.f14143f);
        C7461a.m28372d(parcel, 5, mo14213w());
        C7461a.m28390v(parcel, 6, mo14212v(), i, false);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public final float mo14215x() {
        return this.f14141d;
    }
}
