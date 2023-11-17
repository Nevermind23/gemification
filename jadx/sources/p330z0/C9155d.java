package p330z0;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import he1.C41217g;
import java.io.File;
import java.util.UUID;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p002a1.C0015a;
import p318y0.C8991b;
import p318y0.C8993d;
import p318y0.C8998i;
import p318y0.C8999j;
import ue1.C43064a;

/* renamed from: z0.d */
public final class C9155d implements C8999j {

    /* renamed from: k */
    public static final C9156a f25385k = new C9156a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Context f25386d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final String f25387e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C8999j.C9000a f25388f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final boolean f25389g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final boolean f25390h;

    /* renamed from: i */
    private final C41217g f25391i = C41219i.m119470b(new C9163d(this));
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f25392j;

    /* renamed from: z0.d$a */
    public static final class C9156a {
        private C9156a() {
        }

        public /* synthetic */ C9156a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: z0.d$b */
    private static final class C9157b {

        /* renamed from: a */
        private C9152c f25393a;

        public C9157b(C9152c cVar) {
            this.f25393a = cVar;
        }

        /* renamed from: a */
        public final C9152c mo24729a() {
            return this.f25393a;
        }

        /* renamed from: b */
        public final void mo24730b(C9152c cVar) {
            this.f25393a = cVar;
        }
    }

    /* renamed from: z0.d$c */
    private static final class C9158c extends SQLiteOpenHelper {

        /* renamed from: k */
        public static final C9161c f25394k = new C9161c((DefaultConstructorMarker) null);

        /* renamed from: d */
        private final Context f25395d;

        /* renamed from: e */
        private final C9157b f25396e;

        /* renamed from: f */
        private final C8999j.C9000a f25397f;

        /* renamed from: g */
        private final boolean f25398g;

        /* renamed from: h */
        private boolean f25399h;

        /* renamed from: i */
        private final C0015a f25400i;

        /* renamed from: j */
        private boolean f25401j;

        /* renamed from: z0.d$c$a */
        private static final class C9159a extends RuntimeException {

            /* renamed from: d */
            private final C9160b f25402d;

            /* renamed from: e */
            private final Throwable f25403e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9159a(C9160b bVar, Throwable th) {
                super(th);
                C41536l.m120489i(bVar, "callbackName");
                C41536l.m120489i(th, "cause");
                this.f25402d = bVar;
                this.f25403e = th;
            }

            /* renamed from: a */
            public final C9160b mo24739a() {
                return this.f25402d;
            }

            public Throwable getCause() {
                return this.f25403e;
            }
        }

        /* renamed from: z0.d$c$b */
        public enum C9160b {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN
        }

        /* renamed from: z0.d$c$c */
        public static final class C9161c {
            private C9161c() {
            }

            public /* synthetic */ C9161c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C9152c mo24741a(C9157b bVar, SQLiteDatabase sQLiteDatabase) {
                C41536l.m120489i(bVar, "refHolder");
                C41536l.m120489i(sQLiteDatabase, "sqLiteDatabase");
                C9152c a = bVar.mo24729a();
                if (a != null && a.mo24727d(sQLiteDatabase)) {
                    return a;
                }
                C9152c cVar = new C9152c(sQLiteDatabase);
                bVar.mo24730b(cVar);
                return cVar;
            }
        }

        /* renamed from: z0.d$c$d */
        public /* synthetic */ class C9162d {

            /* renamed from: a */
            public static final /* synthetic */ int[] f25410a;

            /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    z0.d$c$b[] r0 = p330z0.C9155d.C9158c.C9160b.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    z0.d$c$b r1 = p330z0.C9155d.C9158c.C9160b.ON_CONFIGURE     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    z0.d$c$b r1 = p330z0.C9155d.C9158c.C9160b.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    z0.d$c$b r1 = p330z0.C9155d.C9158c.C9160b.ON_UPGRADE     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    z0.d$c$b r1 = p330z0.C9155d.C9158c.C9160b.ON_DOWNGRADE     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    z0.d$c$b r1 = p330z0.C9155d.C9158c.C9160b.ON_OPEN     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    f25410a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p330z0.C9155d.C9158c.C9162d.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9158c(Context context, String str, C9157b bVar, C8999j.C9000a aVar, boolean z) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, aVar.f25029a, new C9164e(aVar, bVar));
            C41536l.m120489i(context, "context");
            C41536l.m120489i(bVar, "dbRef");
            C41536l.m120489i(aVar, "callback");
            this.f25395d = context;
            this.f25396e = bVar;
            this.f25397f = aVar;
            this.f25398g = z;
            if (str == null) {
                str = UUID.randomUUID().toString();
                C41536l.m120488h(str, "randomUUID().toString()");
            }
            this.f25400i = new C0015a(str, context.getCacheDir(), false);
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m33810c(C8999j.C9000a aVar, C9157b bVar, SQLiteDatabase sQLiteDatabase) {
            C41536l.m120489i(aVar, "$callback");
            C41536l.m120489i(bVar, "$dbRef");
            C9161c cVar = f25394k;
            C41536l.m120488h(sQLiteDatabase, "dbObj");
            aVar.mo24408c(cVar.mo24741a(bVar, sQLiteDatabase));
        }

        /* renamed from: f */
        private final SQLiteDatabase m33811f(boolean z) {
            if (z) {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                C41536l.m120488h(writableDatabase, "{\n                super.…eDatabase()\n            }");
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            C41536l.m120488h(readableDatabase, "{\n                super.…eDatabase()\n            }");
            return readableDatabase;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(7:12|11|13|14|15|16|17) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0042 */
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final android.database.sqlite.SQLiteDatabase m33812h(boolean r5) {
            /*
                r4 = this;
                java.lang.String r0 = r4.getDatabaseName()
                boolean r1 = r4.f25401j
                if (r0 == 0) goto L_0x0035
                if (r1 != 0) goto L_0x0035
                android.content.Context r1 = r4.f25395d
                java.io.File r1 = r1.getDatabasePath(r0)
                java.io.File r1 = r1.getParentFile()
                if (r1 == 0) goto L_0x0035
                r1.mkdirs()
                boolean r2 = r1.isDirectory()
                if (r2 != 0) goto L_0x0035
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Invalid database parent file, not a directory: "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                java.lang.String r2 = "SupportSQLite"
                android.util.Log.w(r2, r1)
            L_0x0035:
                android.database.sqlite.SQLiteDatabase r5 = r4.m33811f(r5)     // Catch:{ all -> 0x003a }
                return r5
            L_0x003a:
                super.close()
                r1 = 500(0x1f4, double:2.47E-321)
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x0042 }
            L_0x0042:
                android.database.sqlite.SQLiteDatabase r5 = r4.m33811f(r5)     // Catch:{ all -> 0x0047 }
                return r5
            L_0x0047:
                r1 = move-exception
                super.close()
                boolean r2 = r1 instanceof p330z0.C9155d.C9158c.C9159a
                if (r2 == 0) goto L_0x0074
                z0.d$c$a r1 = (p330z0.C9155d.C9158c.C9159a) r1
                java.lang.Throwable r2 = r1.getCause()
                z0.d$c$b r1 = r1.mo24739a()
                int[] r3 = p330z0.C9155d.C9158c.C9162d.f25410a
                int r1 = r1.ordinal()
                r1 = r3[r1]
                r3 = 1
                if (r1 == r3) goto L_0x0073
                r3 = 2
                if (r1 == r3) goto L_0x0073
                r3 = 3
                if (r1 == r3) goto L_0x0073
                r3 = 4
                if (r1 == r3) goto L_0x0073
                boolean r1 = r2 instanceof android.database.sqlite.SQLiteException
                if (r1 == 0) goto L_0x0072
                goto L_0x007e
            L_0x0072:
                throw r2
            L_0x0073:
                throw r2
            L_0x0074:
                boolean r2 = r1 instanceof android.database.sqlite.SQLiteException
                if (r2 == 0) goto L_0x008f
                if (r0 == 0) goto L_0x008e
                boolean r2 = r4.f25398g
                if (r2 == 0) goto L_0x008e
            L_0x007e:
                android.content.Context r1 = r4.f25395d
                r1.deleteDatabase(r0)
                android.database.sqlite.SQLiteDatabase r5 = r4.m33811f(r5)     // Catch:{ a -> 0x0088 }
                return r5
            L_0x0088:
                r5 = move-exception
                java.lang.Throwable r5 = r5.getCause()
                throw r5
            L_0x008e:
                throw r1
            L_0x008f:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p330z0.C9155d.C9158c.m33812h(boolean):android.database.sqlite.SQLiteDatabase");
        }

        public void close() {
            try {
                C0015a.m105c(this.f25400i, false, 1, (Object) null);
                super.close();
                this.f25396e.mo24730b((C9152c) null);
                this.f25401j = false;
            } finally {
                this.f25400i.mo69d();
            }
        }

        /* renamed from: d */
        public final C8998i mo24732d(boolean z) {
            boolean z2;
            try {
                C0015a aVar = this.f25400i;
                if (this.f25401j || getDatabaseName() == null) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                aVar.mo68b(z2);
                this.f25399h = false;
                SQLiteDatabase h = m33812h(z);
                if (this.f25399h) {
                    close();
                    return mo24732d(z);
                }
                C9152c e = mo24733e(h);
                this.f25400i.mo69d();
                return e;
            } finally {
                this.f25400i.mo69d();
            }
        }

        /* renamed from: e */
        public final C9152c mo24733e(SQLiteDatabase sQLiteDatabase) {
            C41536l.m120489i(sQLiteDatabase, "sqLiteDatabase");
            return f25394k.mo24741a(this.f25396e, sQLiteDatabase);
        }

        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            C41536l.m120489i(sQLiteDatabase, "db");
            if (!this.f25399h && this.f25397f.f25029a != sQLiteDatabase.getVersion()) {
                sQLiteDatabase.setMaxSqlCacheSize(1);
            }
            try {
                this.f25397f.mo23843b(mo24733e(sQLiteDatabase));
            } catch (Throwable th) {
                throw new C9159a(C9160b.ON_CONFIGURE, th);
            }
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            C41536l.m120489i(sQLiteDatabase, "sqLiteDatabase");
            try {
                this.f25397f.mo23844d(mo24733e(sQLiteDatabase));
            } catch (Throwable th) {
                throw new C9159a(C9160b.ON_CREATE, th);
            }
        }

        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            C41536l.m120489i(sQLiteDatabase, "db");
            this.f25399h = true;
            try {
                this.f25397f.mo23845e(mo24733e(sQLiteDatabase), i, i2);
            } catch (Throwable th) {
                throw new C9159a(C9160b.ON_DOWNGRADE, th);
            }
        }

        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            C41536l.m120489i(sQLiteDatabase, "db");
            if (!this.f25399h) {
                try {
                    this.f25397f.mo23846f(mo24733e(sQLiteDatabase));
                } catch (Throwable th) {
                    throw new C9159a(C9160b.ON_OPEN, th);
                }
            }
            this.f25401j = true;
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            C41536l.m120489i(sQLiteDatabase, "sqLiteDatabase");
            this.f25399h = true;
            try {
                this.f25397f.mo23847g(mo24733e(sQLiteDatabase), i, i2);
            } catch (Throwable th) {
                throw new C9159a(C9160b.ON_UPGRADE, th);
            }
        }
    }

    /* renamed from: z0.d$d */
    static final class C9163d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C9155d f25411d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9163d(C9155d dVar) {
            super(0);
            this.f25411d = dVar;
        }

        /* renamed from: b */
        public final C9158c invoke() {
            C9158c cVar;
            if (this.f25411d.f25387e == null || !this.f25411d.f25389g) {
                cVar = new C9158c(this.f25411d.f25386d, this.f25411d.f25387e, new C9157b((C9152c) null), this.f25411d.f25388f, this.f25411d.f25390h);
            } else {
                cVar = new C9158c(this.f25411d.f25386d, new File(C8993d.m33286a(this.f25411d.f25386d), this.f25411d.f25387e).getAbsolutePath(), new C9157b((C9152c) null), this.f25411d.f25388f, this.f25411d.f25390h);
            }
            C8991b.m33283f(cVar, this.f25411d.f25392j);
            return cVar;
        }
    }

    public C9155d(Context context, String str, C8999j.C9000a aVar, boolean z, boolean z2) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(aVar, "callback");
        this.f25386d = context;
        this.f25387e = str;
        this.f25388f = aVar;
        this.f25389g = z;
        this.f25390h = z2;
    }

    /* renamed from: k */
    private final C9158c m33805k() {
        return (C9158c) this.f25391i.getValue();
    }

    /* renamed from: Z0 */
    public C8998i mo23643Z0() {
        return m33805k().mo24732d(true);
    }

    public void close() {
        if (this.f25391i.mo4932a()) {
            m33805k().close();
        }
    }

    public String getDatabaseName() {
        return this.f25387e;
    }

    public void setWriteAheadLoggingEnabled(boolean z) {
        if (this.f25391i.mo4932a()) {
            C8991b.m33283f(m33805k(), z);
        }
        this.f25392j = z;
    }
}
