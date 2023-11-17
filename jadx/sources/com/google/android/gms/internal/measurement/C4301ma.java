package com.google.android.gms.internal.measurement;

import android.support.p013v4.media.session.C0125b;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.ma */
final class C4301ma {
    C4301ma() {
    }

    /* renamed from: a */
    public static final int m16281a(int i, Object obj, Object obj2) {
        C4284la laVar = (C4284la) obj;
        C0125b.m366a(obj2);
        if (laVar.isEmpty()) {
            return 0;
        }
        Iterator it = laVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    /* renamed from: b */
    public static final Object m16282b(Object obj, Object obj2) {
        C4284la laVar = (C4284la) obj;
        C4284la laVar2 = (C4284la) obj2;
        if (!laVar2.isEmpty()) {
            if (!laVar.mo13326e()) {
                laVar = laVar.mo13322b();
            }
            laVar.mo13325d(laVar2);
        }
        return laVar;
    }
}
