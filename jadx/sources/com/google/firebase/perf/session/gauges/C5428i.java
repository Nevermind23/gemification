package com.google.firebase.perf.session.gauges;

import android.app.ActivityManager;
import android.content.Context;
import p134ja.C6763a;
import p212pa.C7789k;
import p212pa.C7797n;

/* renamed from: com.google.firebase.perf.session.gauges.i */
class C5428i {

    /* renamed from: e */
    private static final C6763a f17297e = C6763a.m26371e();

    /* renamed from: a */
    private final Runtime f17298a;

    /* renamed from: b */
    private final ActivityManager f17299b;

    /* renamed from: c */
    private final ActivityManager.MemoryInfo f17300c;

    /* renamed from: d */
    private final Context f17301d;

    C5428i(Context context) {
        this(Runtime.getRuntime(), context);
    }

    /* renamed from: a */
    public int mo18031a() {
        return C7797n.m29504c(C7789k.BYTES.mo22550a(this.f17300c.totalMem));
    }

    /* renamed from: b */
    public int mo18032b() {
        return C7797n.m29504c(C7789k.BYTES.mo22550a(this.f17298a.maxMemory()));
    }

    /* renamed from: c */
    public int mo18033c() {
        return C7797n.m29504c(C7789k.MEGABYTES.mo22550a((long) this.f17299b.getMemoryClass()));
    }

    C5428i(Runtime runtime, Context context) {
        this.f17298a = runtime;
        this.f17301d = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f17299b = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.f17300c = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
    }
}
