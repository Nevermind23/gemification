package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import androidx.collection.LruCache;
import androidx.collection.SimpleArrayMap;
import androidx.core.graphics.C0860g;
import androidx.core.provider.C0953g;
import androidx.core.util.C1000a;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* renamed from: androidx.core.provider.f */
abstract class C0947f {

    /* renamed from: a */
    static final LruCache f3570a = new LruCache(16);

    /* renamed from: b */
    private static final ExecutorService f3571b = C0957h.m3432a("fonts-androidx", 10, 10000);

    /* renamed from: c */
    static final Object f3572c = new Object();

    /* renamed from: d */
    static final SimpleArrayMap f3573d = new SimpleArrayMap();

    /* renamed from: androidx.core.provider.f$a */
    class C0948a implements Callable {

        /* renamed from: d */
        final /* synthetic */ String f3574d;

        /* renamed from: e */
        final /* synthetic */ Context f3575e;

        /* renamed from: f */
        final /* synthetic */ C0946e f3576f;

        /* renamed from: g */
        final /* synthetic */ int f3577g;

        C0948a(String str, Context context, C0946e eVar, int i) {
            this.f3574d = str;
            this.f3575e = context;
            this.f3576f = eVar;
            this.f3577g = i;
        }

        /* renamed from: a */
        public C0952e call() {
            return C0947f.m3410c(this.f3574d, this.f3575e, this.f3576f, this.f3577g);
        }
    }

    /* renamed from: androidx.core.provider.f$b */
    class C0949b implements C1000a {

        /* renamed from: a */
        final /* synthetic */ C0939a f3578a;

        C0949b(C0939a aVar) {
            this.f3578a = aVar;
        }

        /* renamed from: a */
        public void accept(C0952e eVar) {
            if (eVar == null) {
                eVar = new C0952e(-3);
            }
            this.f3578a.mo3382b(eVar);
        }
    }

    /* renamed from: androidx.core.provider.f$c */
    class C0950c implements Callable {

        /* renamed from: d */
        final /* synthetic */ String f3579d;

        /* renamed from: e */
        final /* synthetic */ Context f3580e;

        /* renamed from: f */
        final /* synthetic */ C0946e f3581f;

        /* renamed from: g */
        final /* synthetic */ int f3582g;

        C0950c(String str, Context context, C0946e eVar, int i) {
            this.f3579d = str;
            this.f3580e = context;
            this.f3581f = eVar;
            this.f3582g = i;
        }

        /* renamed from: a */
        public C0952e call() {
            try {
                return C0947f.m3410c(this.f3579d, this.f3580e, this.f3581f, this.f3582g);
            } catch (Throwable unused) {
                return new C0952e(-3);
            }
        }
    }

    /* renamed from: androidx.core.provider.f$d */
    class C0951d implements C1000a {

        /* renamed from: a */
        final /* synthetic */ String f3583a;

        C0951d(String str) {
            this.f3583a = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
            if (r0 >= r2.size()) goto L_0x002a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
            ((androidx.core.util.C1000a) r2.get(r0)).accept(r5);
            r0 = r0 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
            r0 = 0;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void accept(androidx.core.provider.C0947f.C0952e r5) {
            /*
                r4 = this;
                java.lang.Object r0 = androidx.core.provider.C0947f.f3572c
                monitor-enter(r0)
                androidx.collection.SimpleArrayMap r1 = androidx.core.provider.C0947f.f3573d     // Catch:{ all -> 0x002b }
                java.lang.String r2 = r4.f3583a     // Catch:{ all -> 0x002b }
                java.lang.Object r2 = r1.get(r2)     // Catch:{ all -> 0x002b }
                java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x002b }
                if (r2 != 0) goto L_0x0011
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                return
            L_0x0011:
                java.lang.String r3 = r4.f3583a     // Catch:{ all -> 0x002b }
                r1.remove(r3)     // Catch:{ all -> 0x002b }
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                r0 = 0
            L_0x0018:
                int r1 = r2.size()
                if (r0 >= r1) goto L_0x002a
                java.lang.Object r1 = r2.get(r0)
                androidx.core.util.a r1 = (androidx.core.util.C1000a) r1
                r1.accept(r5)
                int r0 = r0 + 1
                goto L_0x0018
            L_0x002a:
                return
            L_0x002b:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.provider.C0947f.C0951d.accept(androidx.core.provider.f$e):void");
        }
    }

    /* renamed from: a */
    private static String m3408a(C0946e eVar, int i) {
        return eVar.mo3388d() + "-" + i;
    }

    /* renamed from: b */
    private static int m3409b(C0953g.C0954a aVar) {
        int i = 1;
        if (aVar.mo3401c() == 0) {
            C0953g.C0955b[] b = aVar.mo3400b();
            if (!(b == null || b.length == 0)) {
                int length = b.length;
                i = 0;
                int i2 = 0;
                while (i2 < length) {
                    int b2 = b[i2].mo3402b();
                    if (b2 == 0) {
                        i2++;
                    } else if (b2 < 0) {
                        return -3;
                    } else {
                        return b2;
                    }
                }
            }
            return i;
        } else if (aVar.mo3401c() != 1) {
            return -3;
        } else {
            return -2;
        }
    }

    /* renamed from: c */
    static C0952e m3410c(String str, Context context, C0946e eVar, int i) {
        LruCache lruCache = f3570a;
        Typeface typeface = (Typeface) lruCache.get(str);
        if (typeface != null) {
            return new C0952e(typeface);
        }
        try {
            C0953g.C0954a e = C0944d.m3396e(context, eVar, (CancellationSignal) null);
            int b = m3409b(e);
            if (b != 0) {
                return new C0952e(b);
            }
            Typeface b2 = C0860g.m3212b(context, (CancellationSignal) null, e.mo3400b(), i);
            if (b2 == null) {
                return new C0952e(-3);
            }
            lruCache.put(str, b2);
            return new C0952e(b2);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C0952e(-1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        r9 = new androidx.core.provider.C0947f.C0950c(r0, r5, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (r8 != null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        r8 = f3571b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        androidx.core.provider.C0957h.m3433b(r8, r9, new androidx.core.provider.C0947f.C0951d(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        return null;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.graphics.Typeface m3411d(android.content.Context r5, androidx.core.provider.C0946e r6, int r7, java.util.concurrent.Executor r8, androidx.core.provider.C0939a r9) {
        /*
            java.lang.String r0 = m3408a(r6, r7)
            androidx.collection.LruCache r1 = f3570a
            java.lang.Object r1 = r1.get(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0017
            androidx.core.provider.f$e r5 = new androidx.core.provider.f$e
            r5.<init>((android.graphics.Typeface) r1)
            r9.mo3382b(r5)
            return r1
        L_0x0017:
            androidx.core.provider.f$b r1 = new androidx.core.provider.f$b
            r1.<init>(r9)
            java.lang.Object r9 = f3572c
            monitor-enter(r9)
            androidx.collection.SimpleArrayMap r2 = f3573d     // Catch:{ all -> 0x004d }
            java.lang.Object r3 = r2.get(r0)     // Catch:{ all -> 0x004d }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x004d }
            r4 = 0
            if (r3 == 0) goto L_0x002f
            r3.add(r1)     // Catch:{ all -> 0x004d }
            monitor-exit(r9)     // Catch:{ all -> 0x004d }
            return r4
        L_0x002f:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x004d }
            r3.<init>()     // Catch:{ all -> 0x004d }
            r3.add(r1)     // Catch:{ all -> 0x004d }
            r2.put(r0, r3)     // Catch:{ all -> 0x004d }
            monitor-exit(r9)     // Catch:{ all -> 0x004d }
            androidx.core.provider.f$c r9 = new androidx.core.provider.f$c
            r9.<init>(r0, r5, r6, r7)
            if (r8 != 0) goto L_0x0044
            java.util.concurrent.ExecutorService r8 = f3571b
        L_0x0044:
            androidx.core.provider.f$d r5 = new androidx.core.provider.f$d
            r5.<init>(r0)
            androidx.core.provider.C0957h.m3433b(r8, r9, r5)
            return r4
        L_0x004d:
            r5 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x004d }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.provider.C0947f.m3411d(android.content.Context, androidx.core.provider.e, int, java.util.concurrent.Executor, androidx.core.provider.a):android.graphics.Typeface");
    }

    /* renamed from: e */
    static Typeface m3412e(Context context, C0946e eVar, C0939a aVar, int i, int i2) {
        String a = m3408a(eVar, i);
        Typeface typeface = (Typeface) f3570a.get(a);
        if (typeface != null) {
            aVar.mo3382b(new C0952e(typeface));
            return typeface;
        } else if (i2 == -1) {
            C0952e c = m3410c(a, context, eVar, i);
            aVar.mo3382b(c);
            return c.f3584a;
        } else {
            try {
                C0952e eVar2 = (C0952e) C0957h.m3434c(f3571b, new C0948a(a, context, eVar, i), i2);
                aVar.mo3382b(eVar2);
                return eVar2.f3584a;
            } catch (InterruptedException unused) {
                aVar.mo3382b(new C0952e(-3));
                return null;
            }
        }
    }

    /* renamed from: androidx.core.provider.f$e */
    static final class C0952e {

        /* renamed from: a */
        final Typeface f3584a;

        /* renamed from: b */
        final int f3585b;

        C0952e(int i) {
            this.f3584a = null;
            this.f3585b = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo3399a() {
            return this.f3585b == 0;
        }

        C0952e(Typeface typeface) {
            this.f3584a = typeface;
            this.f3585b = 0;
        }
    }
}
