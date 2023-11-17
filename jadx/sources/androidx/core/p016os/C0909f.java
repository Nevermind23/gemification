package androidx.core.p016os;

import android.os.CancellationSignal;

/* renamed from: androidx.core.os.f */
public final class C0909f {

    /* renamed from: a */
    private boolean f3535a;

    /* renamed from: b */
    private C0911b f3536b;

    /* renamed from: c */
    private Object f3537c;

    /* renamed from: d */
    private boolean f3538d;

    /* renamed from: androidx.core.os.f$a */
    static class C0910a {
        /* renamed from: a */
        static void m3341a(Object obj) {
            ((CancellationSignal) obj).cancel();
        }

        /* renamed from: b */
        static CancellationSignal m3342b() {
            return new CancellationSignal();
        }
    }

    /* renamed from: androidx.core.os.f$b */
    public interface C0911b {
        /* renamed from: a */
        void mo3362a();
    }

    /* renamed from: d */
    private void m3337d() {
        while (this.f3538d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r0.mo3362a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001a, code lost:
        if (r1 == null) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001c, code lost:
        androidx.core.p016os.C0909f.C0910a.m3341a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r3.f3538d = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0027, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x002b, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r3.f3538d = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0031, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0032, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r0 == null) goto L_0x001a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3359a() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f3535a     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)     // Catch:{ all -> 0x0036 }
            return
        L_0x0007:
            r0 = 1
            r3.f3535a = r0     // Catch:{ all -> 0x0036 }
            r3.f3538d = r0     // Catch:{ all -> 0x0036 }
            androidx.core.os.f$b r0 = r3.f3536b     // Catch:{ all -> 0x0036 }
            java.lang.Object r1 = r3.f3537c     // Catch:{ all -> 0x0036 }
            monitor-exit(r3)     // Catch:{ all -> 0x0036 }
            r2 = 0
            if (r0 == 0) goto L_0x001a
            r0.mo3362a()     // Catch:{ all -> 0x0018 }
            goto L_0x001a
        L_0x0018:
            r0 = move-exception
            goto L_0x0020
        L_0x001a:
            if (r1 == 0) goto L_0x002b
            androidx.core.p016os.C0909f.C0910a.m3341a(r1)     // Catch:{ all -> 0x0018 }
            goto L_0x002b
        L_0x0020:
            monitor-enter(r3)
            r3.f3538d = r2     // Catch:{ all -> 0x0028 }
            r3.notifyAll()     // Catch:{ all -> 0x0028 }
            monitor-exit(r3)     // Catch:{ all -> 0x0028 }
            throw r0
        L_0x0028:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0028 }
            throw r0
        L_0x002b:
            monitor-enter(r3)
            r3.f3538d = r2     // Catch:{ all -> 0x0033 }
            r3.notifyAll()     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0033:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            throw r0
        L_0x0036:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0036 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.p016os.C0909f.mo3359a():void");
    }

    /* renamed from: b */
    public Object mo3360b() {
        Object obj;
        synchronized (this) {
            if (this.f3537c == null) {
                CancellationSignal b = C0910a.m3342b();
                this.f3537c = b;
                if (this.f3535a) {
                    C0910a.m3341a(b);
                }
            }
            obj = this.f3537c;
        }
        return obj;
    }

    /* renamed from: c */
    public void mo3361c(C0911b bVar) {
        synchronized (this) {
            m3337d();
            if (this.f3536b != bVar) {
                this.f3536b = bVar;
                if (this.f3535a) {
                    if (bVar != null) {
                        bVar.mo3362a();
                    }
                }
            }
        }
    }
}
