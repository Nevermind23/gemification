package p267u0;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p280v0.C8684b;
import p318y0.C8998i;
import p318y0.C8999j;

/* renamed from: u0.z */
public class C8521z extends C8999j.C9000a {

    /* renamed from: g */
    public static final C8522a f24219g = new C8522a((DefaultConstructorMarker) null);

    /* renamed from: c */
    private C8474h f24220c;

    /* renamed from: d */
    private final C8523b f24221d;

    /* renamed from: e */
    private final String f24222e;

    /* renamed from: f */
    private final String f24223f;

    /* renamed from: u0.z$a */
    public static final class C8522a {
        private C8522a() {
        }

        public /* synthetic */ C8522a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
            se1.C42550b.m123187a(r3, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
            throw r1;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo23848a(p318y0.C8998i r3) {
            /*
                r2 = this;
                java.lang.String r0 = "db"
                kotlin.jvm.internal.C41536l.m120489i(r3, r0)
                java.lang.String r0 = "SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"
                android.database.Cursor r3 = r3.mo23659b1(r0)
                boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x001e }
                r1 = 0
                if (r0 == 0) goto L_0x0019
                int r0 = r3.getInt(r1)     // Catch:{ all -> 0x001e }
                if (r0 != 0) goto L_0x0019
                r1 = 1
            L_0x0019:
                r0 = 0
                se1.C42550b.m123187a(r3, r0)
                return r1
            L_0x001e:
                r0 = move-exception
                throw r0     // Catch:{ all -> 0x0020 }
            L_0x0020:
                r1 = move-exception
                se1.C42550b.m123187a(r3, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p267u0.C8521z.C8522a.mo23848a(y0.i):boolean");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
            se1.C42550b.m123187a(r3, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
            throw r1;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo23849b(p318y0.C8998i r3) {
            /*
                r2 = this;
                java.lang.String r0 = "db"
                kotlin.jvm.internal.C41536l.m120489i(r3, r0)
                java.lang.String r0 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
                android.database.Cursor r3 = r3.mo23659b1(r0)
                boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x001e }
                r1 = 0
                if (r0 == 0) goto L_0x0019
                int r0 = r3.getInt(r1)     // Catch:{ all -> 0x001e }
                if (r0 == 0) goto L_0x0019
                r1 = 1
            L_0x0019:
                r0 = 0
                se1.C42550b.m123187a(r3, r0)
                return r1
            L_0x001e:
                r0 = move-exception
                throw r0     // Catch:{ all -> 0x0020 }
            L_0x0020:
                r1 = move-exception
                se1.C42550b.m123187a(r3, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p267u0.C8521z.C8522a.mo23849b(y0.i):boolean");
        }
    }

    /* renamed from: u0.z$b */
    public static abstract class C8523b {

        /* renamed from: a */
        public final int f24224a;

        public C8523b(int i) {
            this.f24224a = i;
        }

        /* renamed from: a */
        public abstract void mo6759a(C8998i iVar);

        /* renamed from: b */
        public abstract void mo6760b(C8998i iVar);

        /* renamed from: c */
        public abstract void mo6761c(C8998i iVar);

        /* renamed from: d */
        public abstract void mo6762d(C8998i iVar);

        /* renamed from: e */
        public abstract void mo6763e(C8998i iVar);

        /* renamed from: f */
        public abstract void mo6764f(C8998i iVar);

        /* renamed from: g */
        public abstract C8524c mo6765g(C8998i iVar);
    }

    /* renamed from: u0.z$c */
    public static class C8524c {

        /* renamed from: a */
        public final boolean f24225a;

        /* renamed from: b */
        public final String f24226b;

        public C8524c(boolean z, String str) {
            this.f24225a = z;
            this.f24226b = str;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8521z(C8474h hVar, C8523b bVar, String str, String str2) {
        super(bVar.f24224a);
        C41536l.m120489i(hVar, "configuration");
        C41536l.m120489i(bVar, "delegate");
        C41536l.m120489i(str, "identityHash");
        C41536l.m120489i(str2, "legacyHash");
        this.f24220c = hVar;
        this.f24221d = bVar;
        this.f24222e = str;
        this.f24223f = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0058, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
        se1.C42550b.m123187a(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        throw r1;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m31901h(p318y0.C8998i r4) {
        /*
            r3 = this;
            u0.z$a r0 = f24219g
            boolean r0 = r0.mo23849b(r4)
            if (r0 == 0) goto L_0x005d
            y0.a r0 = new y0.a
            java.lang.String r1 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r0.<init>(r1)
            android.database.Cursor r4 = r4.mo23661g1(r0)
            boolean r0 = r4.moveToFirst()     // Catch:{ all -> 0x0056 }
            r1 = 0
            if (r0 == 0) goto L_0x0020
            r0 = 0
            java.lang.String r0 = r4.getString(r0)     // Catch:{ all -> 0x0056 }
            goto L_0x0021
        L_0x0020:
            r0 = r1
        L_0x0021:
            se1.C42550b.m123187a(r4, r1)
            java.lang.String r4 = r3.f24222e
            boolean r4 = kotlin.jvm.internal.C41536l.m120484d(r4, r0)
            if (r4 != 0) goto L_0x006f
            java.lang.String r4 = r3.f24223f
            boolean r4 = kotlin.jvm.internal.C41536l.m120484d(r4, r0)
            if (r4 == 0) goto L_0x0035
            goto L_0x006f
        L_0x0035:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "
            r1.append(r2)
            java.lang.String r2 = r3.f24222e
            r1.append(r2)
            java.lang.String r2 = ", found: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.<init>(r0)
            throw r4
        L_0x0056:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r1 = move-exception
            se1.C42550b.m123187a(r4, r0)
            throw r1
        L_0x005d:
            u0.z$b r0 = r3.f24221d
            u0.z$c r0 = r0.mo6765g(r4)
            boolean r1 = r0.f24225a
            if (r1 == 0) goto L_0x0070
            u0.z$b r0 = r3.f24221d
            r0.mo6763e(r4)
            r3.m31903j(r4)
        L_0x006f:
            return
        L_0x0070:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Pre-packaged database has an invalid schema: "
            r1.append(r2)
            java.lang.String r0 = r0.f24226b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p267u0.C8521z.m31901h(y0.i):void");
    }

    /* renamed from: i */
    private final void m31902i(C8998i iVar) {
        iVar.mo23652L("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    /* renamed from: j */
    private final void m31903j(C8998i iVar) {
        m31902i(iVar);
        iVar.mo23652L(C8520y.m31900a(this.f24222e));
    }

    /* renamed from: b */
    public void mo23843b(C8998i iVar) {
        C41536l.m120489i(iVar, "db");
        super.mo23843b(iVar);
    }

    /* renamed from: d */
    public void mo23844d(C8998i iVar) {
        C41536l.m120489i(iVar, "db");
        boolean a = f24219g.mo23848a(iVar);
        this.f24221d.mo6759a(iVar);
        if (!a) {
            C8524c g = this.f24221d.mo6765g(iVar);
            if (!g.f24225a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g.f24226b);
            }
        }
        m31903j(iVar);
        this.f24221d.mo6761c(iVar);
    }

    /* renamed from: e */
    public void mo23845e(C8998i iVar, int i, int i2) {
        C41536l.m120489i(iVar, "db");
        mo23847g(iVar, i, i2);
    }

    /* renamed from: f */
    public void mo23846f(C8998i iVar) {
        C41536l.m120489i(iVar, "db");
        super.mo23846f(iVar);
        m31901h(iVar);
        this.f24221d.mo6762d(iVar);
        this.f24220c = null;
    }

    /* renamed from: g */
    public void mo23847g(C8998i iVar, int i, int i2) {
        List<C8684b> d;
        C41536l.m120489i(iVar, "db");
        C8474h hVar = this.f24220c;
        boolean z = false;
        if (!(hVar == null || (d = hVar.f24077d.mo23834d(i, i2)) == null)) {
            this.f24221d.mo6764f(iVar);
            for (C8684b a : d) {
                a.mo6809a(iVar);
            }
            C8524c g = this.f24221d.mo6765g(iVar);
            if (g.f24225a) {
                this.f24221d.mo6763e(iVar);
                m31903j(iVar);
                z = true;
            } else {
                throw new IllegalStateException("Migration didn't properly handle: " + g.f24226b);
            }
        }
        if (!z) {
            C8474h hVar2 = this.f24220c;
            if (hVar2 == null || hVar2.mo23743a(i, i2)) {
                throw new IllegalStateException("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
            }
            this.f24221d.mo6760b(iVar);
            this.f24221d.mo6759a(iVar);
        }
    }
}
