package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.w7 */
public abstract class C4468w7 {
    /* renamed from: a */
    static Object m17093a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i);
    }

    /* renamed from: b */
    static Object[] m17094b(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            m17093a(objArr[i2], i2);
        }
        return objArr;
    }
}
