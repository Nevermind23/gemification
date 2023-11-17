package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.provider.C0946e;
import androidx.core.provider.C0953g;
import androidx.core.util.C1008h;
import androidx.emoji2.text.C1378e;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: androidx.emoji2.text.j */
public class C1395j extends C1378e.C1382c {

    /* renamed from: j */
    private static final C1396a f3991j = new C1396a();

    /* renamed from: androidx.emoji2.text.j$a */
    public static class C1396a {
        /* renamed from: a */
        public Typeface mo4030a(Context context, C0953g.C0955b bVar) {
            return C0953g.m3418a(context, (CancellationSignal) null, new C0953g.C0955b[]{bVar});
        }

        /* renamed from: b */
        public C0953g.C0954a mo4031b(Context context, C0946e eVar) {
            return C0953g.m3419b(context, (CancellationSignal) null, eVar);
        }

        /* renamed from: c */
        public void mo4032c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* renamed from: androidx.emoji2.text.j$b */
    private static class C1397b implements C1378e.C1386g {

        /* renamed from: a */
        private final Context f3992a;

        /* renamed from: b */
        private final C0946e f3993b;

        /* renamed from: c */
        private final C1396a f3994c;

        /* renamed from: d */
        private final Object f3995d = new Object();

        /* renamed from: e */
        private Handler f3996e;

        /* renamed from: f */
        private Executor f3997f;

        /* renamed from: g */
        private ThreadPoolExecutor f3998g;

        /* renamed from: h */
        C1378e.C1387h f3999h;

        /* renamed from: i */
        private ContentObserver f4000i;

        /* renamed from: j */
        private Runnable f4001j;

        C1397b(Context context, C0946e eVar, C1396a aVar) {
            C1008h.m3531h(context, "Context cannot be null");
            C1008h.m3531h(eVar, "FontRequest cannot be null");
            this.f3992a = context.getApplicationContext();
            this.f3993b = eVar;
            this.f3994c = aVar;
        }

        /* renamed from: b */
        private void m4803b() {
            synchronized (this.f3995d) {
                this.f3999h = null;
                ContentObserver contentObserver = this.f4000i;
                if (contentObserver != null) {
                    this.f3994c.mo4032c(this.f3992a, contentObserver);
                    this.f4000i = null;
                }
                Handler handler = this.f3996e;
                if (handler != null) {
                    handler.removeCallbacks(this.f4001j);
                }
                this.f3996e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f3998g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f3997f = null;
                this.f3998g = null;
            }
        }

        /* renamed from: e */
        private C0953g.C0955b m4804e() {
            try {
                C0953g.C0954a b = this.f3994c.mo4031b(this.f3992a, this.f3993b);
                if (b.mo3401c() == 0) {
                    C0953g.C0955b[] b2 = b.mo3400b();
                    if (b2 != null && b2.length != 0) {
                        return b2[0];
                    }
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                throw new RuntimeException("fetchFonts failed (" + b.mo3401c() + ")");
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        }

        /* renamed from: a */
        public void mo3976a(C1378e.C1387h hVar) {
            C1008h.m3531h(hVar, "LoaderCallback cannot be null");
            synchronized (this.f3995d) {
                this.f3999h = hVar;
            }
            mo4034d();
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
            if (r1 != 2) goto L_0x001e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
            r2 = r4.f3995d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x001e, code lost:
            if (r1 != 0) goto L_0x0062;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            androidx.core.p016os.C0934x.m3381a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
            r1 = r4.f3994c.mo4030a(r4.f3992a, r0);
            r0 = androidx.core.graphics.C0884q0.m3290f(r4.f3992a, (android.os.CancellationSignal) null, r0.mo3404d());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0038, code lost:
            if (r0 == null) goto L_0x0055;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x003a, code lost:
            if (r1 == null) goto L_0x0055;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x003c, code lost:
            r0 = androidx.emoji2.text.C1403m.m4821b(r1, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
            androidx.core.p016os.C0934x.m3382b();
            r1 = r4.f3995d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0045, code lost:
            monitor-enter(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            r2 = r4.f3999h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0048, code lost:
            if (r2 == null) goto L_0x004d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x004a, code lost:
            r2.mo3979b(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x004d, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
            m4803b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x005c, code lost:
            throw new java.lang.RuntimeException("Unable to open file.");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x005d, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
            androidx.core.p016os.C0934x.m3382b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x0061, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x007d, code lost:
            throw new java.lang.RuntimeException("fetchFonts result is not OK. (" + r1 + ")");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x007e, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x0081, code lost:
            monitor-enter(r4.f3995d);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
            r2 = r4.f3999h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x0084, code lost:
            if (r2 != null) goto L_0x0086;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x0086, code lost:
            r2.mo3978a(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x008a, code lost:
            m4803b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            r0 = m4804e();
            r1 = r0.mo3402b();
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo4033c() {
            /*
                r4 = this;
                java.lang.Object r0 = r4.f3995d
                monitor-enter(r0)
                androidx.emoji2.text.e$h r1 = r4.f3999h     // Catch:{ all -> 0x0091 }
                if (r1 != 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x0091 }
                return
            L_0x0009:
                monitor-exit(r0)     // Catch:{ all -> 0x0091 }
                androidx.core.provider.g$b r0 = r4.m4804e()     // Catch:{ all -> 0x007e }
                int r1 = r0.mo3402b()     // Catch:{ all -> 0x007e }
                r2 = 2
                if (r1 != r2) goto L_0x001e
                java.lang.Object r2 = r4.f3995d     // Catch:{ all -> 0x007e }
                monitor-enter(r2)     // Catch:{ all -> 0x007e }
                monitor-exit(r2)     // Catch:{ all -> 0x001c }
                goto L_0x001e
            L_0x001a:
                monitor-exit(r2)     // Catch:{ all -> 0x001c }
                throw r0     // Catch:{ all -> 0x007e }
            L_0x001c:
                r0 = move-exception
                goto L_0x001a
            L_0x001e:
                if (r1 != 0) goto L_0x0062
                java.lang.String r1 = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"
                androidx.core.p016os.C0934x.m3381a(r1)     // Catch:{ all -> 0x005d }
                androidx.emoji2.text.j$a r1 = r4.f3994c     // Catch:{ all -> 0x005d }
                android.content.Context r2 = r4.f3992a     // Catch:{ all -> 0x005d }
                android.graphics.Typeface r1 = r1.mo4030a(r2, r0)     // Catch:{ all -> 0x005d }
                android.content.Context r2 = r4.f3992a     // Catch:{ all -> 0x005d }
                android.net.Uri r0 = r0.mo3404d()     // Catch:{ all -> 0x005d }
                r3 = 0
                java.nio.ByteBuffer r0 = androidx.core.graphics.C0884q0.m3290f(r2, r3, r0)     // Catch:{ all -> 0x005d }
                if (r0 == 0) goto L_0x0055
                if (r1 == 0) goto L_0x0055
                androidx.emoji2.text.m r0 = androidx.emoji2.text.C1403m.m4821b(r1, r0)     // Catch:{ all -> 0x005d }
                androidx.core.p016os.C0934x.m3382b()     // Catch:{ all -> 0x007e }
                java.lang.Object r1 = r4.f3995d     // Catch:{ all -> 0x007e }
                monitor-enter(r1)     // Catch:{ all -> 0x007e }
                androidx.emoji2.text.e$h r2 = r4.f3999h     // Catch:{ all -> 0x0052 }
                if (r2 == 0) goto L_0x004d
                r2.mo3979b(r0)     // Catch:{ all -> 0x0052 }
            L_0x004d:
                monitor-exit(r1)     // Catch:{ all -> 0x0052 }
                r4.m4803b()     // Catch:{ all -> 0x007e }
                goto L_0x008d
            L_0x0052:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0052 }
                throw r0     // Catch:{ all -> 0x007e }
            L_0x0055:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x005d }
                java.lang.String r1 = "Unable to open file."
                r0.<init>(r1)     // Catch:{ all -> 0x005d }
                throw r0     // Catch:{ all -> 0x005d }
            L_0x005d:
                r0 = move-exception
                androidx.core.p016os.C0934x.m3382b()     // Catch:{ all -> 0x007e }
                throw r0     // Catch:{ all -> 0x007e }
            L_0x0062:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x007e }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x007e }
                r2.<init>()     // Catch:{ all -> 0x007e }
                java.lang.String r3 = "fetchFonts result is not OK. ("
                r2.append(r3)     // Catch:{ all -> 0x007e }
                r2.append(r1)     // Catch:{ all -> 0x007e }
                java.lang.String r1 = ")"
                r2.append(r1)     // Catch:{ all -> 0x007e }
                java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x007e }
                r0.<init>(r1)     // Catch:{ all -> 0x007e }
                throw r0     // Catch:{ all -> 0x007e }
            L_0x007e:
                r0 = move-exception
                java.lang.Object r1 = r4.f3995d
                monitor-enter(r1)
                androidx.emoji2.text.e$h r2 = r4.f3999h     // Catch:{ all -> 0x008e }
                if (r2 == 0) goto L_0x0089
                r2.mo3978a(r0)     // Catch:{ all -> 0x008e }
            L_0x0089:
                monitor-exit(r1)     // Catch:{ all -> 0x008e }
                r4.m4803b()
            L_0x008d:
                return
            L_0x008e:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x008e }
                throw r0
            L_0x0091:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0091 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.C1395j.C1397b.mo4033c():void");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4034d() {
            synchronized (this.f3995d) {
                if (this.f3999h != null) {
                    if (this.f3997f == null) {
                        ThreadPoolExecutor b = C1370b.m4708b("emojiCompat");
                        this.f3998g = b;
                        this.f3997f = b;
                    }
                    this.f3997f.execute(new C1398k(this));
                }
            }
        }

        /* renamed from: f */
        public void mo4035f(Executor executor) {
            synchronized (this.f3995d) {
                this.f3997f = executor;
            }
        }
    }

    public C1395j(Context context, C0946e eVar) {
        super(new C1397b(context, eVar, f3991j));
    }

    /* renamed from: c */
    public C1395j mo4029c(Executor executor) {
        ((C1397b) mo4005a()).mo4035f(executor);
        return this;
    }
}
