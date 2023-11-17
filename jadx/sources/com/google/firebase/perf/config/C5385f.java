package com.google.firebase.perf.config;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p095ga.C6397a;

/* renamed from: com.google.firebase.perf.config.f */
public final class C5385f extends C5402v {

    /* renamed from: a */
    private static C5385f f17189a;

    /* renamed from: b */
    private static final Map f17190b = Collections.unmodifiableMap(new C5386a());

    /* renamed from: com.google.firebase.perf.config.f$a */
    class C5386a extends HashMap {
        C5386a() {
            put(461L, "FIREPERF_AUTOPUSH");
            put(462L, "FIREPERF");
            put(675L, "FIREPERF_INTERNAL_LOW");
            put(676L, "FIREPERF_INTERNAL_HIGH");
        }
    }

    private C5385f() {
    }

    /* renamed from: e */
    public static synchronized C5385f m21320e() {
        C5385f fVar;
        synchronized (C5385f.class) {
            if (f17189a == null) {
                f17189a = new C5385f();
            }
            fVar = f17189a;
        }
        return fVar;
    }

    /* renamed from: f */
    protected static String m21321f(long j) {
        return (String) f17190b.get(Long.valueOf(j));
    }

    /* renamed from: g */
    protected static boolean m21322g(long j) {
        return f17190b.containsKey(Long.valueOf(j));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo17735a() {
        return "com.google.firebase.perf.LogSourceName";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo17736c() {
        return "fpr_log_source";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo17739d() {
        return C6397a.f19636c;
    }
}
