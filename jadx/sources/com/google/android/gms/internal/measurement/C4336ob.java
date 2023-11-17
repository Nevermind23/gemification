package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.ob */
final class C4336ob extends C4370qb {
    C4336ob(Unsafe unsafe) {
        super(unsafe);
    }

    /* renamed from: a */
    public final double mo13430a(Object obj, long j) {
        return Double.longBitsToDouble(this.f13617a.getLong(obj, j));
    }

    /* renamed from: b */
    public final float mo13431b(Object obj, long j) {
        return Float.intBitsToFloat(this.f13617a.getInt(obj, j));
    }

    /* renamed from: c */
    public final void mo13432c(Object obj, long j, boolean z) {
        if (C4387rb.f13641h) {
            C4387rb.m16577d(obj, j, r3 ? (byte) 1 : 0);
        } else {
            C4387rb.m16578e(obj, j, r3 ? (byte) 1 : 0);
        }
    }

    /* renamed from: d */
    public final void mo13433d(Object obj, long j, byte b) {
        if (C4387rb.f13641h) {
            C4387rb.m16577d(obj, j, b);
        } else {
            C4387rb.m16578e(obj, j, b);
        }
    }

    /* renamed from: e */
    public final void mo13434e(Object obj, long j, double d) {
        this.f13617a.putLong(obj, j, Double.doubleToLongBits(d));
    }

    /* renamed from: f */
    public final void mo13435f(Object obj, long j, float f) {
        this.f13617a.putInt(obj, j, Float.floatToIntBits(f));
    }

    /* renamed from: g */
    public final boolean mo13436g(Object obj, long j) {
        if (C4387rb.f13641h) {
            return C4387rb.m16598y(obj, j);
        }
        return C4387rb.m16599z(obj, j);
    }
}
