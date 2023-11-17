package com.google.android.gms.internal.measurement;

import com.github.mikephil.charting.utils.Utils;

/* renamed from: com.google.android.gms.internal.measurement.x9 */
public enum C4486x9 {
    VOID(Void.class, Void.class, (Class) null),
    INT(r1, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(Utils.FLOAT_EPSILON)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(Utils.DOUBLE_EPSILON)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(C4418t8.class, C4418t8.class, C4418t8.f13699e),
    ENUM(r1, Integer.class, (Class) null),
    MESSAGE(Object.class, Object.class, (Class) null);
    

    /* renamed from: d */
    private final Class f13818d;

    /* renamed from: e */
    private final Class f13819e;

    /* renamed from: f */
    private final Object f13820f;

    private C4486x9(Class cls, Class cls2, Object obj) {
        this.f13818d = cls;
        this.f13819e = cls2;
        this.f13820f = obj;
    }

    /* renamed from: a */
    public final Class mo13813a() {
        return this.f13819e;
    }
}
