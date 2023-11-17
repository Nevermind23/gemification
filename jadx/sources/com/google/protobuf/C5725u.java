package com.google.protobuf;

import com.github.mikephil.charting.utils.Utils;

/* renamed from: com.google.protobuf.u */
public enum C5725u {
    VOID(Void.class, Void.class, (Class) null),
    INT(r4, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(Utils.FLOAT_EPSILON)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(Utils.DOUBLE_EPSILON)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(C5648f.class, C5648f.class, C5648f.f17856e),
    ENUM(r4, Integer.class, (Class) null),
    MESSAGE(Object.class, Object.class, (Class) null);
    

    /* renamed from: d */
    private final Class f18090d;

    /* renamed from: e */
    private final Class f18091e;

    /* renamed from: f */
    private final Object f18092f;

    private C5725u(Class cls, Class cls2, Object obj) {
        this.f18090d = cls;
        this.f18091e = cls2;
        this.f18092f = obj;
    }

    /* renamed from: b */
    public Class mo18799b() {
        return this.f18091e;
    }
}
