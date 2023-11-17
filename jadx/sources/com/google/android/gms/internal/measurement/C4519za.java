package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentMap;
import p342j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.measurement.za */
final class C4519za {

    /* renamed from: c */
    private static final C4519za f13851c = new C4519za();

    /* renamed from: a */
    private final C4149db f13852a = new C4267ka();

    /* renamed from: b */
    private final ConcurrentMap f13853b = new ConcurrentHashMap();

    private C4519za() {
    }

    /* renamed from: a */
    public static C4519za m17310a() {
        return f13851c;
    }

    /* renamed from: b */
    public final C4132cb mo13872b(Class cls) {
        C4470w9.m17097c(cls, "messageType");
        C4132cb cbVar = (C4132cb) this.f13853b.get(cls);
        if (cbVar == null) {
            cbVar = this.f13852a.mo13044a(cls);
            C4470w9.m17097c(cls, "messageType");
            C4470w9.m17097c(cbVar, "schema");
            C4132cb cbVar2 = (C4132cb) this.f13853b.putIfAbsent(cls, cbVar);
            if (cbVar2 == null) {
                return cbVar;
            }
            return cbVar2;
        }
        return cbVar;
    }
}
