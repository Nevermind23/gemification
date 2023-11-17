package com.otaliastudios.cameraview.video;

import com.otaliastudios.cameraview.C11280b;
import p458id.C15600b;

/* renamed from: com.otaliastudios.cameraview.video.d */
public abstract class C11291d {

    /* renamed from: f */
    private static final C15600b f32820f = C15600b.m56349a(C11291d.class.getSimpleName());

    /* renamed from: a */
    C11280b.C11281a f32821a;

    /* renamed from: b */
    private final C11292a f32822b;

    /* renamed from: c */
    protected Exception f32823c;

    /* renamed from: d */
    private int f32824d;

    /* renamed from: e */
    private final Object f32825e = new Object();

    /* renamed from: com.otaliastudios.cameraview.video.d$a */
    public interface C11292a {
        /* renamed from: a */
        void mo29500a();

        /* renamed from: d */
        void mo29501d();

        /* renamed from: p */
        void mo29502p(C11280b.C11281a aVar, Exception exc);
    }

    C11291d(C11292a aVar) {
        this.f32822b = aVar;
        this.f32824d = 0;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        mo29486k();
        r1.mo42878c("dispatchResult:", "About to dispatch result:", r7.f32821a, r7.f32823c);
        r0 = r7.f32822b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004b, code lost:
        if (r0 == null) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004d, code lost:
        r0.mo29502p(r7.f32821a, r7.f32823c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0054, code lost:
        r7.f32821a = null;
        r7.f32823c = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0059, code lost:
        return;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo29494g() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f32825e
            monitor-enter(r0)
            boolean r1 = r7.mo29497j()     // Catch:{ all -> 0x005a }
            r2 = 1
            r3 = 2
            r4 = 0
            if (r1 != 0) goto L_0x001d
            id.b r1 = f32820f     // Catch:{ all -> 0x005a }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x005a }
            java.lang.String r5 = "dispatchResult:"
            r3[r4] = r5     // Catch:{ all -> 0x005a }
            java.lang.String r4 = "Called, but not recording! Aborting."
            r3[r2] = r4     // Catch:{ all -> 0x005a }
            r1.mo42880h(r3)     // Catch:{ all -> 0x005a }
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            return
        L_0x001d:
            id.b r1 = f32820f     // Catch:{ all -> 0x005a }
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ all -> 0x005a }
            java.lang.String r6 = "dispatchResult:"
            r5[r4] = r6     // Catch:{ all -> 0x005a }
            java.lang.String r6 = "Changed state to STATE_IDLE."
            r5[r2] = r6     // Catch:{ all -> 0x005a }
            r1.mo42878c(r5)     // Catch:{ all -> 0x005a }
            r7.f32824d = r4     // Catch:{ all -> 0x005a }
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            r7.mo29486k()
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r5 = "dispatchResult:"
            r0[r4] = r5
            java.lang.String r4 = "About to dispatch result:"
            r0[r2] = r4
            com.otaliastudios.cameraview.b$a r2 = r7.f32821a
            r0[r3] = r2
            r2 = 3
            java.lang.Exception r3 = r7.f32823c
            r0[r2] = r3
            r1.mo42878c(r0)
            com.otaliastudios.cameraview.video.d$a r0 = r7.f32822b
            if (r0 == 0) goto L_0x0054
            com.otaliastudios.cameraview.b$a r1 = r7.f32821a
            java.lang.Exception r2 = r7.f32823c
            r0.mo29502p(r1, r2)
        L_0x0054:
            r0 = 0
            r7.f32821a = r0
            r7.f32823c = r0
            return
        L_0x005a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.otaliastudios.cameraview.video.C11291d.mo29494g():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo29495h() {
        f32820f.mo42878c("dispatchVideoRecordingEnd:", "About to dispatch.");
        C11292a aVar = this.f32822b;
        if (aVar != null) {
            aVar.mo29501d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo29496i() {
        f32820f.mo42878c("dispatchVideoRecordingStart:", "About to dispatch.");
        C11292a aVar = this.f32822b;
        if (aVar != null) {
            aVar.mo29500a();
        }
    }

    /* renamed from: j */
    public boolean mo29497j() {
        boolean z;
        synchronized (this.f32825e) {
            if (this.f32824d != 0) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo29486k() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract void mo29481l();

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract void mo29487m(boolean z);

    /* renamed from: n */
    public final void mo29498n(C11280b.C11281a aVar) {
        synchronized (this.f32825e) {
            int i = this.f32824d;
            if (i != 0) {
                f32820f.mo42877b("start:", "called twice, or while stopping! Ignoring. state:", Integer.valueOf(i));
                return;
            }
            f32820f.mo42878c("start:", "Changed state to STATE_RECORDING");
            this.f32824d = 1;
            this.f32821a = aVar;
            mo29481l();
        }
    }

    /* renamed from: o */
    public final void mo29499o(boolean z) {
        synchronized (this.f32825e) {
            if (this.f32824d == 0) {
                f32820f.mo42877b("stop:", "called twice, or called before start! Ignoring. isCameraShutdown:", Boolean.valueOf(z));
                return;
            }
            f32820f.mo42878c("stop:", "Changed state to STATE_STOPPING");
            this.f32824d = 2;
            mo29487m(z);
        }
    }
}
