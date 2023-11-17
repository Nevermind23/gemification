package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.data.C2415d;
import com.bumptech.glide.load.engine.C2443f;
import java.io.IOException;
import java.util.List;
import p166m3.C7079a;
import p166m3.C7083e;
import p192o3.C7423a;
import p244s3.C8188n;

/* renamed from: com.bumptech.glide.load.engine.v */
class C2483v implements C2443f, C2443f.C2444a {

    /* renamed from: d */
    private final C2445g f7890d;

    /* renamed from: e */
    private final C2443f.C2444a f7891e;

    /* renamed from: f */
    private volatile int f7892f;

    /* renamed from: g */
    private volatile C2440c f7893g;

    /* renamed from: h */
    private volatile Object f7894h;

    /* renamed from: i */
    private volatile C8188n.C8189a f7895i;

    /* renamed from: j */
    private volatile C2441d f7896j;

    /* renamed from: com.bumptech.glide.load.engine.v$a */
    class C2484a implements C2415d.C2416a {

        /* renamed from: d */
        final /* synthetic */ C8188n.C8189a f7897d;

        C2484a(C8188n.C8189a aVar) {
            this.f7897d = aVar;
        }

        /* renamed from: c */
        public void mo7797c(Exception exc) {
            if (C2483v.this.mo7960g(this.f7897d)) {
                C2483v.this.mo7962i(this.f7897d, exc);
            }
        }

        /* renamed from: f */
        public void mo7798f(Object obj) {
            if (C2483v.this.mo7960g(this.f7897d)) {
                C2483v.this.mo7961h(this.f7897d, obj);
            }
        }
    }

    C2483v(C2445g gVar, C2443f.C2444a aVar) {
        this.f7890d = gVar;
        this.f7891e = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00e0  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m9591c(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r0 = "SourceGenerator"
            long r1 = p089g4.C6218g.m24714b()
            r3 = 0
            com.bumptech.glide.load.engine.g r4 = r11.f7890d     // Catch:{ all -> 0x00dd }
            com.bumptech.glide.load.data.e r4 = r4.mo7867o(r12)     // Catch:{ all -> 0x00dd }
            java.lang.Object r5 = r4.mo7774a()     // Catch:{ all -> 0x00dd }
            com.bumptech.glide.load.engine.g r6 = r11.f7890d     // Catch:{ all -> 0x00dd }
            m3.d r6 = r6.mo7869q(r5)     // Catch:{ all -> 0x00dd }
            com.bumptech.glide.load.engine.e r7 = new com.bumptech.glide.load.engine.e     // Catch:{ all -> 0x00dd }
            com.bumptech.glide.load.engine.g r8 = r11.f7890d     // Catch:{ all -> 0x00dd }
            m3.h r8 = r8.mo7863k()     // Catch:{ all -> 0x00dd }
            r7.<init>(r6, r5, r8)     // Catch:{ all -> 0x00dd }
            com.bumptech.glide.load.engine.d r5 = new com.bumptech.glide.load.engine.d     // Catch:{ all -> 0x00dd }
            s3.n$a r8 = r11.f7895i     // Catch:{ all -> 0x00dd }
            m3.e r8 = r8.f23349a     // Catch:{ all -> 0x00dd }
            com.bumptech.glide.load.engine.g r9 = r11.f7890d     // Catch:{ all -> 0x00dd }
            m3.e r9 = r9.mo7868p()     // Catch:{ all -> 0x00dd }
            r5.<init>(r8, r9)     // Catch:{ all -> 0x00dd }
            com.bumptech.glide.load.engine.g r8 = r11.f7890d     // Catch:{ all -> 0x00dd }
            q3.a r8 = r8.mo7856d()     // Catch:{ all -> 0x00dd }
            r8.mo22834b(r5, r7)     // Catch:{ all -> 0x00dd }
            r7 = 2
            boolean r7 = android.util.Log.isLoggable(r0, r7)     // Catch:{ all -> 0x00dd }
            java.lang.String r9 = ", data: "
            if (r7 == 0) goto L_0x0071
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00dd }
            r7.<init>()     // Catch:{ all -> 0x00dd }
            java.lang.String r10 = "Finished encoding source to cache, key: "
            r7.append(r10)     // Catch:{ all -> 0x00dd }
            r7.append(r5)     // Catch:{ all -> 0x00dd }
            r7.append(r9)     // Catch:{ all -> 0x00dd }
            r7.append(r12)     // Catch:{ all -> 0x00dd }
            java.lang.String r10 = ", encoder: "
            r7.append(r10)     // Catch:{ all -> 0x00dd }
            r7.append(r6)     // Catch:{ all -> 0x00dd }
            java.lang.String r6 = ", duration: "
            r7.append(r6)     // Catch:{ all -> 0x00dd }
            double r1 = p089g4.C6218g.m24713a(r1)     // Catch:{ all -> 0x00dd }
            r7.append(r1)     // Catch:{ all -> 0x00dd }
            java.lang.String r1 = r7.toString()     // Catch:{ all -> 0x00dd }
            android.util.Log.v(r0, r1)     // Catch:{ all -> 0x00dd }
        L_0x0071:
            java.io.File r1 = r8.mo22833a(r5)     // Catch:{ all -> 0x00dd }
            r2 = 1
            if (r1 == 0) goto L_0x0093
            r11.f7896j = r5     // Catch:{ all -> 0x00dd }
            com.bumptech.glide.load.engine.c r12 = new com.bumptech.glide.load.engine.c     // Catch:{ all -> 0x00dd }
            s3.n$a r0 = r11.f7895i     // Catch:{ all -> 0x00dd }
            m3.e r0 = r0.f23349a     // Catch:{ all -> 0x00dd }
            java.util.List r0 = java.util.Collections.singletonList(r0)     // Catch:{ all -> 0x00dd }
            com.bumptech.glide.load.engine.g r1 = r11.f7890d     // Catch:{ all -> 0x00dd }
            r12.<init>(r0, r1, r11)     // Catch:{ all -> 0x00dd }
            r11.f7893g = r12     // Catch:{ all -> 0x00dd }
            s3.n$a r12 = r11.f7895i
            com.bumptech.glide.load.data.d r12 = r12.f23351c
            r12.mo7786b()
            return r2
        L_0x0093:
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00dd }
            if (r1 == 0) goto L_0x00bb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00dd }
            r1.<init>()     // Catch:{ all -> 0x00dd }
            java.lang.String r5 = "Attempt to write: "
            r1.append(r5)     // Catch:{ all -> 0x00dd }
            com.bumptech.glide.load.engine.d r5 = r11.f7896j     // Catch:{ all -> 0x00dd }
            r1.append(r5)     // Catch:{ all -> 0x00dd }
            r1.append(r9)     // Catch:{ all -> 0x00dd }
            r1.append(r12)     // Catch:{ all -> 0x00dd }
            java.lang.String r12 = " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly..."
            r1.append(r12)     // Catch:{ all -> 0x00dd }
            java.lang.String r12 = r1.toString()     // Catch:{ all -> 0x00dd }
            android.util.Log.d(r0, r12)     // Catch:{ all -> 0x00dd }
        L_0x00bb:
            com.bumptech.glide.load.engine.f$a r12 = r11.f7891e     // Catch:{ all -> 0x00da }
            s3.n$a r0 = r11.f7895i     // Catch:{ all -> 0x00da }
            m3.e r5 = r0.f23349a     // Catch:{ all -> 0x00da }
            java.lang.Object r6 = r4.mo7774a()     // Catch:{ all -> 0x00da }
            s3.n$a r0 = r11.f7895i     // Catch:{ all -> 0x00da }
            com.bumptech.glide.load.data.d r7 = r0.f23351c     // Catch:{ all -> 0x00da }
            s3.n$a r0 = r11.f7895i     // Catch:{ all -> 0x00da }
            com.bumptech.glide.load.data.d r0 = r0.f23351c     // Catch:{ all -> 0x00da }
            m3.a r8 = r0.mo7789d()     // Catch:{ all -> 0x00da }
            s3.n$a r0 = r11.f7895i     // Catch:{ all -> 0x00da }
            m3.e r9 = r0.f23349a     // Catch:{ all -> 0x00da }
            r4 = r12
            r4.mo7851b(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00da }
            return r3
        L_0x00da:
            r12 = move-exception
            r3 = r2
            goto L_0x00de
        L_0x00dd:
            r12 = move-exception
        L_0x00de:
            if (r3 != 0) goto L_0x00e7
            s3.n$a r0 = r11.f7895i
            com.bumptech.glide.load.data.d r0 = r0.f23351c
            r0.mo7786b()
        L_0x00e7:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C2483v.m9591c(java.lang.Object):boolean");
    }

    /* renamed from: f */
    private boolean m9592f() {
        return this.f7892f < this.f7890d.mo7859g().size();
    }

    /* renamed from: j */
    private void m9593j(C8188n.C8189a aVar) {
        this.f7895i.f23351c.mo7790e(this.f7890d.mo7864l(), new C2484a(aVar));
    }

    /* renamed from: a */
    public void mo7850a(C7083e eVar, Exception exc, C2415d dVar, C7079a aVar) {
        this.f7891e.mo7850a(eVar, exc, dVar, this.f7895i.f23351c.mo7789d());
    }

    /* renamed from: b */
    public void mo7851b(C7083e eVar, Object obj, C2415d dVar, C7079a aVar, C7083e eVar2) {
        this.f7891e.mo7851b(eVar, obj, dVar, this.f7895i.f23351c.mo7789d(), eVar);
    }

    public void cancel() {
        C8188n.C8189a aVar = this.f7895i;
        if (aVar != null) {
            aVar.f23351c.cancel();
        }
    }

    /* renamed from: d */
    public boolean mo7844d() {
        if (this.f7894h != null) {
            Object obj = this.f7894h;
            this.f7894h = null;
            try {
                if (!m9591c(obj)) {
                    return true;
                }
            } catch (IOException e) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e);
                }
            }
        }
        if (this.f7893g != null && this.f7893g.mo7844d()) {
            return true;
        }
        this.f7893g = null;
        this.f7895i = null;
        boolean z = false;
        while (!z && m9592f()) {
            List g = this.f7890d.mo7859g();
            int i = this.f7892f;
            this.f7892f = i + 1;
            this.f7895i = (C8188n.C8189a) g.get(i);
            if (this.f7895i != null && (this.f7890d.mo7857e().mo21831c(this.f7895i.f23351c.mo7789d()) || this.f7890d.mo7873u(this.f7895i.f23351c.mo7781a()))) {
                m9593j(this.f7895i);
                z = true;
            }
        }
        return z;
    }

    /* renamed from: e */
    public void mo7852e() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo7960g(C8188n.C8189a aVar) {
        C8188n.C8189a aVar2 = this.f7895i;
        return aVar2 != null && aVar2 == aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo7961h(C8188n.C8189a aVar, Object obj) {
        C7423a e = this.f7890d.mo7857e();
        if (obj == null || !e.mo21831c(aVar.f23351c.mo7789d())) {
            C2443f.C2444a aVar2 = this.f7891e;
            C7083e eVar = aVar.f23349a;
            C2415d dVar = aVar.f23351c;
            aVar2.mo7851b(eVar, obj, dVar, dVar.mo7789d(), this.f7896j);
            return;
        }
        this.f7894h = obj;
        this.f7891e.mo7852e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo7962i(C8188n.C8189a aVar, Exception exc) {
        C2443f.C2444a aVar2 = this.f7891e;
        C2441d dVar = this.f7896j;
        C2415d dVar2 = aVar.f23351c;
        aVar2.mo7850a(dVar, exc, dVar2, dVar2.mo7789d());
    }
}
