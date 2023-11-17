package p267u0;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p110i.C6495b;
import p318y0.C8998i;
import p318y0.C9008m;

/* renamed from: u0.q */
public class C8488q {

    /* renamed from: q */
    public static final C8489a f24105q = new C8489a((DefaultConstructorMarker) null);

    /* renamed from: r */
    private static final String[] f24106r = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a */
    private final C8503w f24107a;

    /* renamed from: b */
    private final Map f24108b;

    /* renamed from: c */
    private final Map f24109c;

    /* renamed from: d */
    private final Map f24110d;

    /* renamed from: e */
    private final String[] f24111e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C8443c f24112f;

    /* renamed from: g */
    private final AtomicBoolean f24113g = new AtomicBoolean(false);

    /* renamed from: h */
    private volatile boolean f24114h;

    /* renamed from: i */
    private volatile C9008m f24115i;

    /* renamed from: j */
    private final C8490b f24116j;

    /* renamed from: k */
    private final C8486o f24117k;

    /* renamed from: l */
    private final C6495b f24118l;

    /* renamed from: m */
    private C8497t f24119m;

    /* renamed from: n */
    private final Object f24120n;

    /* renamed from: o */
    private final Object f24121o;

    /* renamed from: p */
    public final Runnable f24122p;

    /* renamed from: u0.q$a */
    public static final class C8489a {
        private C8489a() {
        }

        public /* synthetic */ C8489a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo23772a(C8998i iVar) {
            C41536l.m120489i(iVar, "database");
            if (iVar.mo23665w1()) {
                iVar.mo23657Z();
            } else {
                iVar.mo23650F();
            }
        }

        /* renamed from: b */
        public final String mo23773b(String str, String str2) {
            C41536l.m120489i(str, "tableName");
            C41536l.m120489i(str2, "triggerType");
            return "`room_table_modification_trigger_" + str + '_' + str2 + '`';
        }
    }

    /* renamed from: u0.q$b */
    public static final class C8490b {

        /* renamed from: e */
        public static final C8491a f24123e = new C8491a((DefaultConstructorMarker) null);

        /* renamed from: a */
        private final long[] f24124a;

        /* renamed from: b */
        private final boolean[] f24125b;

        /* renamed from: c */
        private final int[] f24126c;

        /* renamed from: d */
        private boolean f24127d;

        /* renamed from: u0.q$b$a */
        public static final class C8491a {
            private C8491a() {
            }

            public /* synthetic */ C8491a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public C8490b(int i) {
            this.f24124a = new long[i];
            this.f24125b = new boolean[i];
            this.f24126c = new int[i];
        }

        /* renamed from: a */
        public final int[] mo23774a() {
            boolean z;
            synchronized (this) {
                if (!this.f24127d) {
                    return null;
                }
                long[] jArr = this.f24124a;
                int length = jArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    int i4 = 1;
                    if (jArr[i] > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean[] zArr = this.f24125b;
                    if (z != zArr[i2]) {
                        int[] iArr = this.f24126c;
                        if (!z) {
                            i4 = 2;
                        }
                        iArr[i2] = i4;
                    } else {
                        this.f24126c[i2] = 0;
                    }
                    zArr[i2] = z;
                    i++;
                    i2 = i3;
                }
                this.f24127d = false;
                int[] iArr2 = (int[]) this.f24126c.clone();
                return iArr2;
            }
        }

        /* renamed from: b */
        public final boolean mo23775b(int... iArr) {
            boolean z;
            C41536l.m120489i(iArr, "tableIds");
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long[] jArr = this.f24124a;
                    long j = jArr[i];
                    jArr[i] = 1 + j;
                    if (j == 0) {
                        z = true;
                        this.f24127d = true;
                    }
                }
                C41238w wVar = C41238w.f97225a;
            }
            return z;
        }

        /* renamed from: c */
        public final boolean mo23776c(int... iArr) {
            boolean z;
            C41536l.m120489i(iArr, "tableIds");
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long[] jArr = this.f24124a;
                    long j = jArr[i];
                    jArr[i] = j - 1;
                    if (j == 1) {
                        z = true;
                        this.f24127d = true;
                    }
                }
                C41238w wVar = C41238w.f97225a;
            }
            return z;
        }

        /* renamed from: d */
        public final void mo23777d() {
            synchronized (this) {
                Arrays.fill(this.f24125b, false);
                this.f24127d = true;
                C41238w wVar = C41238w.f97225a;
            }
        }
    }

    /* renamed from: u0.q$c */
    public static abstract class C8492c {

        /* renamed from: a */
        private final String[] f24128a;

        public C8492c(String[] strArr) {
            C41536l.m120489i(strArr, "tables");
            this.f24128a = strArr;
        }

        /* renamed from: a */
        public final String[] mo23778a() {
            return this.f24128a;
        }

        /* renamed from: b */
        public abstract boolean mo23779b();

        /* renamed from: c */
        public abstract void mo23780c(Set set);
    }

    /* renamed from: u0.q$d */
    public static final class C8493d {

        /* renamed from: a */
        private final C8492c f24129a;

        /* renamed from: b */
        private final int[] f24130b;

        /* renamed from: c */
        private final String[] f24131c;

        /* renamed from: d */
        private final Set f24132d;

        public C8493d(C8492c cVar, int[] iArr, String[] strArr) {
            boolean z;
            Set set;
            C41536l.m120489i(cVar, "observer");
            C41536l.m120489i(iArr, "tableIds");
            C41536l.m120489i(strArr, "tableNames");
            this.f24129a = cVar;
            this.f24130b = iArr;
            this.f24131c = strArr;
            boolean z2 = true;
            if (strArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                set = C41355w0.m119981d(strArr[0]);
            } else {
                set = C41357x0.m119985e();
            }
            this.f24132d = set;
            if (!(iArr.length != strArr.length ? false : z2)) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }

        /* renamed from: a */
        public final int[] mo23781a() {
            return this.f24130b;
        }

        /* renamed from: b */
        public final void mo23782b(Set set) {
            Set set2;
            C41536l.m120489i(set, "invalidatedTablesIds");
            int[] iArr = this.f24130b;
            int length = iArr.length;
            if (length != 0) {
                int i = 0;
                if (length != 1) {
                    Set b = C41355w0.m119979b();
                    int[] iArr2 = this.f24130b;
                    int length2 = iArr2.length;
                    int i2 = 0;
                    while (i < length2) {
                        int i3 = i2 + 1;
                        if (set.contains(Integer.valueOf(iArr2[i]))) {
                            b.add(this.f24131c[i2]);
                        }
                        i++;
                        i2 = i3;
                    }
                    set2 = C41355w0.m119978a(b);
                } else if (set.contains(Integer.valueOf(iArr[0]))) {
                    set2 = this.f24132d;
                } else {
                    set2 = C41357x0.m119985e();
                }
            } else {
                set2 = C41357x0.m119985e();
            }
            if (!set2.isEmpty()) {
                this.f24129a.mo23780c(set2);
            }
        }

        /* renamed from: c */
        public final void mo23783c(String[] strArr) {
            Set set;
            C41536l.m120489i(strArr, "tables");
            int length = this.f24131c.length;
            if (length != 0) {
                boolean z = false;
                if (length != 1) {
                    Set b = C41355w0.m119979b();
                    for (String str : strArr) {
                        for (String str2 : this.f24131c) {
                            if (C40439w.m117115s(str2, str, true)) {
                                b.add(str2);
                            }
                        }
                    }
                    set = C41355w0.m119978a(b);
                } else {
                    int length2 = strArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length2) {
                            break;
                        } else if (C40439w.m117115s(strArr[i], this.f24131c[0], true)) {
                            z = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (z) {
                        set = this.f24132d;
                    } else {
                        set = C41357x0.m119985e();
                    }
                }
            } else {
                set = C41357x0.m119985e();
            }
            if (!set.isEmpty()) {
                this.f24129a.mo23780c(set);
            }
        }
    }

    /* renamed from: u0.q$e */
    public static final class C8494e implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C8488q f24133d;

        C8494e(C8488q qVar) {
            this.f24133d = qVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0068, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0069, code lost:
            se1.C42550b.m123187a(r0, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x006c, code lost:
            throw r2;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final java.util.Set m31811a() {
            /*
                r5 = this;
                u0.q r0 = r5.f24133d
                java.util.Set r1 = ie1.C41355w0.m119979b()
                u0.w r0 = r0.mo23760f()
                y0.a r2 = new y0.a
                java.lang.String r3 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1;"
                r2.<init>(r3)
                r3 = 2
                r4 = 0
                android.database.Cursor r0 = p267u0.C8503w.m31834C(r0, r2, r4, r3, r4)
            L_0x0017:
                boolean r2 = r0.moveToNext()     // Catch:{ all -> 0x0066 }
                if (r2 == 0) goto L_0x002a
                r2 = 0
                int r2 = r0.getInt(r2)     // Catch:{ all -> 0x0066 }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0066 }
                r1.add(r2)     // Catch:{ all -> 0x0066 }
                goto L_0x0017
            L_0x002a:
                he1.w r2 = he1.C41238w.f97225a     // Catch:{ all -> 0x0066 }
                se1.C42550b.m123187a(r0, r4)
                java.util.Set r0 = ie1.C41355w0.m119978a(r1)
                boolean r1 = r0.isEmpty()
                r1 = r1 ^ 1
                if (r1 == 0) goto L_0x0065
                u0.q r1 = r5.f24133d
                y0.m r1 = r1.mo23759e()
                java.lang.String r2 = "Required value was null."
                if (r1 == 0) goto L_0x005b
                u0.q r1 = r5.f24133d
                y0.m r1 = r1.mo23759e()
                if (r1 == 0) goto L_0x0051
                r1.mo23676O()
                goto L_0x0065
            L_0x0051:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r2.toString()
                r0.<init>(r1)
                throw r0
            L_0x005b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = r2.toString()
                r0.<init>(r1)
                throw r0
            L_0x0065:
                return r0
            L_0x0066:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x0068 }
            L_0x0068:
                r2 = move-exception
                se1.C42550b.m123187a(r0, r1)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p267u0.C8488q.C8494e.m31811a():java.util.Set");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0080, code lost:
            if (r0 != null) goto L_0x0082;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0082, code lost:
            r0.mo23634e();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a2, code lost:
            if (r0 == null) goto L_0x00bd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ba, code lost:
            if (r0 == null) goto L_0x00bd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c2, code lost:
            if ((!r3.isEmpty()) == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c4, code lost:
            r0 = r5.f24133d.mo23761g();
            r1 = r5.f24133d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x00cc, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
            r1 = r1.mo23761g().iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d9, code lost:
            if (r1.hasNext() == false) goto L_0x00eb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00db, code lost:
            ((p267u0.C8488q.C8493d) ((java.util.Map.Entry) r1.next()).getValue()).mo23782b(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x00eb, code lost:
            r1 = he1.C41238w.f97225a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ed, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r5 = this;
                u0.q r0 = r5.f24133d
                u0.w r0 = r0.mo23760f()
                java.util.concurrent.locks.Lock r0 = r0.mo23811l()
                r0.lock()
                r1 = 1
                u0.q r2 = r5.f24133d     // Catch:{ IllegalStateException -> 0x00a5, SQLiteException -> 0x008d }
                boolean r2 = r2.mo23758d()     // Catch:{ IllegalStateException -> 0x00a5, SQLiteException -> 0x008d }
                if (r2 != 0) goto L_0x0025
                r0.unlock()
                u0.q r0 = r5.f24133d
                u0.c r0 = r0.f24112f
                if (r0 == 0) goto L_0x0024
                r0.mo23634e()
            L_0x0024:
                return
            L_0x0025:
                u0.q r2 = r5.f24133d     // Catch:{ IllegalStateException -> 0x00a5, SQLiteException -> 0x008d }
                java.util.concurrent.atomic.AtomicBoolean r2 = r2.mo23762h()     // Catch:{ IllegalStateException -> 0x00a5, SQLiteException -> 0x008d }
                r3 = 0
                boolean r2 = r2.compareAndSet(r1, r3)     // Catch:{ IllegalStateException -> 0x00a5, SQLiteException -> 0x008d }
                if (r2 != 0) goto L_0x0041
                r0.unlock()
                u0.q r0 = r5.f24133d
                u0.c r0 = r0.f24112f
                if (r0 == 0) goto L_0x0040
                r0.mo23634e()
            L_0x0040:
                return
            L_0x0041:
                u0.q r2 = r5.f24133d     // Catch:{ IllegalStateException -> 0x00a5, SQLiteException -> 0x008d }
                u0.w r2 = r2.mo23760f()     // Catch:{ IllegalStateException -> 0x00a5, SQLiteException -> 0x008d }
                boolean r2 = r2.mo23817t()     // Catch:{ IllegalStateException -> 0x00a5, SQLiteException -> 0x008d }
                if (r2 == 0) goto L_0x005c
                r0.unlock()
                u0.q r0 = r5.f24133d
                u0.c r0 = r0.f24112f
                if (r0 == 0) goto L_0x005b
                r0.mo23634e()
            L_0x005b:
                return
            L_0x005c:
                u0.q r2 = r5.f24133d     // Catch:{ IllegalStateException -> 0x00a5, SQLiteException -> 0x008d }
                u0.w r2 = r2.mo23760f()     // Catch:{ IllegalStateException -> 0x00a5, SQLiteException -> 0x008d }
                y0.j r2 = r2.mo23813n()     // Catch:{ IllegalStateException -> 0x00a5, SQLiteException -> 0x008d }
                y0.i r2 = r2.mo23643Z0()     // Catch:{ IllegalStateException -> 0x00a5, SQLiteException -> 0x008d }
                r2.mo23657Z()     // Catch:{ IllegalStateException -> 0x00a5, SQLiteException -> 0x008d }
                java.util.Set r3 = r5.m31811a()     // Catch:{ all -> 0x0086 }
                r2.mo23655X()     // Catch:{ all -> 0x0086 }
                r2.mo23662i0()     // Catch:{ IllegalStateException -> 0x00a5, SQLiteException -> 0x008d }
                r0.unlock()
                u0.q r0 = r5.f24133d
                u0.c r0 = r0.f24112f
                if (r0 == 0) goto L_0x00bd
            L_0x0082:
                r0.mo23634e()
                goto L_0x00bd
            L_0x0086:
                r3 = move-exception
                r2.mo23662i0()     // Catch:{ IllegalStateException -> 0x00a5, SQLiteException -> 0x008d }
                throw r3     // Catch:{ IllegalStateException -> 0x00a5, SQLiteException -> 0x008d }
            L_0x008b:
                r1 = move-exception
                goto L_0x00f3
            L_0x008d:
                r2 = move-exception
                java.lang.String r3 = "ROOM"
                java.lang.String r4 = "Cannot run invalidation tracker. Is the db closed?"
                android.util.Log.e(r3, r4, r2)     // Catch:{ all -> 0x008b }
                java.util.Set r3 = ie1.C41357x0.m119985e()     // Catch:{ all -> 0x008b }
                r0.unlock()
                u0.q r0 = r5.f24133d
                u0.c r0 = r0.f24112f
                if (r0 == 0) goto L_0x00bd
                goto L_0x0082
            L_0x00a5:
                r2 = move-exception
                java.lang.String r3 = "ROOM"
                java.lang.String r4 = "Cannot run invalidation tracker. Is the db closed?"
                android.util.Log.e(r3, r4, r2)     // Catch:{ all -> 0x008b }
                java.util.Set r3 = ie1.C41357x0.m119985e()     // Catch:{ all -> 0x008b }
                r0.unlock()
                u0.q r0 = r5.f24133d
                u0.c r0 = r0.f24112f
                if (r0 == 0) goto L_0x00bd
                goto L_0x0082
            L_0x00bd:
                boolean r0 = r3.isEmpty()
                r0 = r0 ^ r1
                if (r0 == 0) goto L_0x00f2
                u0.q r0 = r5.f24133d
                i.b r0 = r0.mo23761g()
                u0.q r1 = r5.f24133d
                monitor-enter(r0)
                i.b r1 = r1.mo23761g()     // Catch:{ all -> 0x00ef }
                java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00ef }
            L_0x00d5:
                boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00ef }
                if (r2 == 0) goto L_0x00eb
                java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00ef }
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x00ef }
                java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x00ef }
                u0.q$d r2 = (p267u0.C8488q.C8493d) r2     // Catch:{ all -> 0x00ef }
                r2.mo23782b(r3)     // Catch:{ all -> 0x00ef }
                goto L_0x00d5
            L_0x00eb:
                he1.w r1 = he1.C41238w.f97225a     // Catch:{ all -> 0x00ef }
                monitor-exit(r0)
                goto L_0x00f2
            L_0x00ef:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L_0x00f2:
                return
            L_0x00f3:
                r0.unlock()
                u0.q r0 = r5.f24133d
                u0.c r0 = r0.f24112f
                if (r0 == 0) goto L_0x0101
                r0.mo23634e()
            L_0x0101:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p267u0.C8488q.C8494e.run():void");
        }
    }

    public C8488q(C8503w wVar, Map map, Map map2, String... strArr) {
        String str;
        C41536l.m120489i(wVar, "database");
        C41536l.m120489i(map, "shadowTablesMap");
        C41536l.m120489i(map2, "viewTables");
        C41536l.m120489i(strArr, "tableNames");
        this.f24107a = wVar;
        this.f24108b = map;
        this.f24109c = map2;
        this.f24116j = new C8490b(strArr.length);
        this.f24117k = new C8486o(wVar);
        this.f24118l = new C6495b();
        this.f24120n = new Object();
        this.f24121o = new Object();
        this.f24110d = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr[i];
            Locale locale = Locale.US;
            C41536l.m120488h(locale, "US");
            String lowerCase = str2.toLowerCase(locale);
            C41536l.m120488h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.f24110d.put(lowerCase, Integer.valueOf(i));
            String str3 = (String) this.f24108b.get(strArr[i]);
            if (str3 != null) {
                C41536l.m120488h(locale, "US");
                str = str3.toLowerCase(locale);
                C41536l.m120488h(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i] = lowerCase;
        }
        this.f24111e = strArr2;
        for (Map.Entry entry : this.f24108b.entrySet()) {
            Locale locale2 = Locale.US;
            C41536l.m120488h(locale2, "US");
            String lowerCase2 = ((String) entry.getValue()).toLowerCase(locale2);
            C41536l.m120488h(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (this.f24110d.containsKey(lowerCase2)) {
                C41536l.m120488h(locale2, "US");
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                C41536l.m120488h(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                Map map3 = this.f24110d;
                map3.put(lowerCase3, C41344r0.m119929k(map3, lowerCase2));
            }
        }
        this.f24122p = new C8494e(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public final void m31780l() {
        synchronized (this.f24121o) {
            this.f24114h = false;
            this.f24116j.mo23777d();
            C9008m mVar = this.f24115i;
            if (mVar != null) {
                mVar.close();
                C41238w wVar = C41238w.f97225a;
            }
        }
    }

    /* renamed from: o */
    private final String[] m31781o(String[] strArr) {
        Set b = C41355w0.m119979b();
        for (String str : strArr) {
            Map map = this.f24109c;
            Locale locale = Locale.US;
            C41536l.m120488h(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            C41536l.m120488h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (map.containsKey(lowerCase)) {
                Map map2 = this.f24109c;
                C41536l.m120488h(locale, "US");
                String lowerCase2 = str.toLowerCase(locale);
                C41536l.m120488h(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Object obj = map2.get(lowerCase2);
                C41536l.m120486f(obj);
                b.addAll((Collection) obj);
            } else {
                b.add(str);
            }
        }
        Object[] array = C41355w0.m119978a(b).toArray(new String[0]);
        C41536l.m120487g(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    /* renamed from: r */
    private final void m31782r(C8998i iVar, int i) {
        iVar.mo23652L("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.f24111e[i];
        for (String str2 : f24106r) {
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + f24105q.mo23773b(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE " + "room_table_modification_log" + " SET " + "invalidated" + " = 1" + " WHERE " + "table_id" + " = " + i + " AND " + "invalidated" + " = 0" + "; END";
            C41536l.m120488h(str3, "StringBuilder().apply(builderAction).toString()");
            iVar.mo23652L(str3);
        }
    }

    /* renamed from: s */
    private final void m31783s(C8998i iVar, int i) {
        String str = this.f24111e[i];
        for (String str2 : f24106r) {
            String str3 = "DROP TRIGGER IF EXISTS " + f24105q.mo23773b(str, str2);
            C41536l.m120488h(str3, "StringBuilder().apply(builderAction).toString()");
            iVar.mo23652L(str3);
        }
    }

    /* renamed from: c */
    public void mo23757c(C8492c cVar) {
        C8493d dVar;
        C41536l.m120489i(cVar, "observer");
        String[] o = m31781o(cVar.mo23778a());
        ArrayList arrayList = new ArrayList(o.length);
        int length = o.length;
        int i = 0;
        while (i < length) {
            String str = o[i];
            Map map = this.f24110d;
            Locale locale = Locale.US;
            C41536l.m120488h(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            C41536l.m120488h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Integer num = (Integer) map.get(lowerCase);
            if (num != null) {
                arrayList.add(Integer.valueOf(num.intValue()));
                i++;
            } else {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
        }
        int[] y0 = C41358y.m120035y0(arrayList);
        C8493d dVar2 = new C8493d(cVar, y0, o);
        synchronized (this.f24118l) {
            dVar = (C8493d) this.f24118l.mo20414l(cVar, dVar2);
        }
        if (dVar == null && this.f24116j.mo23775b(Arrays.copyOf(y0, y0.length))) {
            mo23770t();
        }
    }

    /* renamed from: d */
    public final boolean mo23758d() {
        if (!this.f24107a.mo23800A()) {
            return false;
        }
        if (!this.f24114h) {
            this.f24107a.mo23813n().mo23643Z0();
        }
        if (this.f24114h) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    /* renamed from: e */
    public final C9008m mo23759e() {
        return this.f24115i;
    }

    /* renamed from: f */
    public final C8503w mo23760f() {
        return this.f24107a;
    }

    /* renamed from: g */
    public final C6495b mo23761g() {
        return this.f24118l;
    }

    /* renamed from: h */
    public final AtomicBoolean mo23762h() {
        return this.f24113g;
    }

    /* renamed from: i */
    public final Map mo23763i() {
        return this.f24110d;
    }

    /* renamed from: j */
    public final void mo23764j(C8998i iVar) {
        C41536l.m120489i(iVar, "database");
        synchronized (this.f24121o) {
            if (this.f24114h) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            iVar.mo23652L("PRAGMA temp_store = MEMORY;");
            iVar.mo23652L("PRAGMA recursive_triggers='ON';");
            iVar.mo23652L("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            mo23771u(iVar);
            this.f24115i = iVar.mo23653N0("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            this.f24114h = true;
            C41238w wVar = C41238w.f97225a;
        }
    }

    /* renamed from: k */
    public final void mo23765k(String... strArr) {
        C41536l.m120489i(strArr, "tables");
        synchronized (this.f24118l) {
            for (Map.Entry entry : this.f24118l) {
                C41536l.m120488h(entry, "(observer, wrapper)");
                C8493d dVar = (C8493d) entry.getValue();
                if (!((C8492c) entry.getKey()).mo23779b()) {
                    dVar.mo23783c(strArr);
                }
            }
            C41238w wVar = C41238w.f97225a;
        }
    }

    /* renamed from: m */
    public void mo23766m() {
        if (this.f24113g.compareAndSet(false, true)) {
            C8443c cVar = this.f24112f;
            if (cVar != null) {
                cVar.mo23638j();
            }
            this.f24107a.mo23814o().execute(this.f24122p);
        }
    }

    /* renamed from: n */
    public void mo23767n(C8492c cVar) {
        C8493d dVar;
        C41536l.m120489i(cVar, "observer");
        synchronized (this.f24118l) {
            dVar = (C8493d) this.f24118l.mo20415n(cVar);
        }
        if (dVar != null) {
            C8490b bVar = this.f24116j;
            int[] a = dVar.mo23781a();
            if (bVar.mo23776c(Arrays.copyOf(a, a.length))) {
                mo23770t();
            }
        }
    }

    /* renamed from: p */
    public final void mo23768p(C8443c cVar) {
        C41536l.m120489i(cVar, "autoCloser");
        this.f24112f = cVar;
        cVar.mo23641m(new C8487p(this));
    }

    /* renamed from: q */
    public final void mo23769q(Context context, String str, Intent intent) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(str, "name");
        C41536l.m120489i(intent, "serviceIntent");
        this.f24119m = new C8497t(context, str, intent, this, this.f24107a.mo23814o());
    }

    /* renamed from: t */
    public final void mo23770t() {
        if (this.f24107a.mo23800A()) {
            mo23771u(this.f24107a.mo23813n().mo23643Z0());
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: u */
    public final void mo23771u(C8998i iVar) {
        C41536l.m120489i(iVar, "database");
        if (!iVar.mo23664m1()) {
            try {
                Lock l = this.f24107a.mo23811l();
                l.lock();
                try {
                    synchronized (this.f24120n) {
                        int[] a = this.f24116j.mo23774a();
                        if (a != null) {
                            f24105q.mo23772a(iVar);
                            try {
                                int length = a.length;
                                int i = 0;
                                int i2 = 0;
                                while (i < length) {
                                    int i3 = a[i];
                                    int i4 = i2 + 1;
                                    if (i3 == 1) {
                                        m31782r(iVar, i2);
                                    } else if (i3 == 2) {
                                        m31783s(iVar, i2);
                                    }
                                    i++;
                                    i2 = i4;
                                }
                                iVar.mo23655X();
                                iVar.mo23662i0();
                                C41238w wVar = C41238w.f97225a;
                                l.unlock();
                            } catch (Throwable th) {
                                iVar.mo23662i0();
                                throw th;
                            }
                        }
                    }
                } finally {
                    l.unlock();
                }
            } catch (IllegalStateException e) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
            } catch (SQLiteException e2) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
            }
        }
    }
}
