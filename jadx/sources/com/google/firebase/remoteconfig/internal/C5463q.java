package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import com.google.firebase.C5270e;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import p339z9.C9270e;

/* renamed from: com.google.firebase.remoteconfig.internal.q */
public class C5463q {

    /* renamed from: a */
    private final Set f17452a;

    /* renamed from: b */
    private final C5465s f17453b;

    /* renamed from: c */
    private final C5455m f17454c;

    /* renamed from: d */
    private final C5270e f17455d;

    /* renamed from: e */
    private final C9270e f17456e;

    /* renamed from: f */
    private final C5444f f17457f;

    /* renamed from: g */
    private final Context f17458g;

    /* renamed from: h */
    private final String f17459h;

    /* renamed from: i */
    private final C5460p f17460i;

    /* renamed from: j */
    private final ScheduledExecutorService f17461j;

    public C5463q(C5270e eVar, C9270e eVar2, C5455m mVar, C5444f fVar, Context context, String str, C5460p pVar, ScheduledExecutorService scheduledExecutorService) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f17452a = linkedHashSet;
        this.f17453b = new C5465s(eVar, eVar2, mVar, fVar, context, str, linkedHashSet, pVar, scheduledExecutorService);
        this.f17455d = eVar;
        this.f17454c = mVar;
        this.f17456e = eVar2;
        this.f17457f = fVar;
        this.f17458g = context;
        this.f17459h = str;
        this.f17460i = pVar;
        this.f17461j = scheduledExecutorService;
    }

    /* renamed from: a */
    private synchronized void m21749a() {
        if (!this.f17452a.isEmpty()) {
            this.f17453b.mo18138B();
        }
    }

    /* renamed from: b */
    public synchronized void mo18136b(boolean z) {
        this.f17453b.mo18143y(z);
        if (!z) {
            m21749a();
        }
    }
}
