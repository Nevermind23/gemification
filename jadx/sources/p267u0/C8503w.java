package p267u0;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p097h.C6408c;
import p280v0.C8684b;
import p318y0.C8992c;
import p318y0.C8998i;
import p318y0.C8999j;
import p318y0.C9007l;
import p318y0.C9008m;
import p330z0.C9165f;
import p342j$.util.DesugarCollections;
import ue1.C43075l;

/* renamed from: u0.w */
public abstract class C8503w {

    /* renamed from: o */
    public static final C8506c f24154o = new C8506c((DefaultConstructorMarker) null);
    /* access modifiers changed from: protected */

    /* renamed from: a */
    public volatile C8998i f24155a;

    /* renamed from: b */
    private Executor f24156b;

    /* renamed from: c */
    private Executor f24157c;

    /* renamed from: d */
    private C8999j f24158d;

    /* renamed from: e */
    private final C8488q f24159e = mo6754g();

    /* renamed from: f */
    private boolean f24160f;

    /* renamed from: g */
    private boolean f24161g;
    /* access modifiers changed from: protected */

    /* renamed from: h */
    public List f24162h;

    /* renamed from: i */
    private Map f24163i = new LinkedHashMap();

    /* renamed from: j */
    private final ReentrantReadWriteLock f24164j = new ReentrantReadWriteLock();

    /* renamed from: k */
    private C8443c f24165k;

    /* renamed from: l */
    private final ThreadLocal f24166l = new ThreadLocal();

    /* renamed from: m */
    private final Map f24167m;

    /* renamed from: n */
    private final Map f24168n;

    /* renamed from: u0.w$a */
    public static class C8504a {

        /* renamed from: a */
        private final Context f24169a;

        /* renamed from: b */
        private final Class f24170b;

        /* renamed from: c */
        private final String f24171c;

        /* renamed from: d */
        private final List f24172d = new ArrayList();

        /* renamed from: e */
        private final List f24173e = new ArrayList();

        /* renamed from: f */
        private List f24174f = new ArrayList();

        /* renamed from: g */
        private Executor f24175g;

        /* renamed from: h */
        private Executor f24176h;

        /* renamed from: i */
        private C8999j.C9005c f24177i;

        /* renamed from: j */
        private boolean f24178j;

        /* renamed from: k */
        private C8507d f24179k = C8507d.AUTOMATIC;

        /* renamed from: l */
        private Intent f24180l;

        /* renamed from: m */
        private boolean f24181m = true;

        /* renamed from: n */
        private boolean f24182n;

        /* renamed from: o */
        private long f24183o = -1;

        /* renamed from: p */
        private TimeUnit f24184p;

        /* renamed from: q */
        private final C8508e f24185q = new C8508e();

        /* renamed from: r */
        private Set f24186r = new LinkedHashSet();

        /* renamed from: s */
        private Set f24187s;

        /* renamed from: t */
        private String f24188t;

        /* renamed from: u */
        private File f24189u;

        /* renamed from: v */
        private Callable f24190v;

        public C8504a(Context context, Class cls, String str) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(cls, "klass");
            this.f24169a = context;
            this.f24170b = cls;
            this.f24171c = str;
        }

        /* renamed from: a */
        public C8504a mo23822a(C8505b bVar) {
            C41536l.m120489i(bVar, "callback");
            this.f24172d.add(bVar);
            return this;
        }

        /* renamed from: b */
        public C8504a mo23823b(C8684b... bVarArr) {
            C41536l.m120489i(bVarArr, "migrations");
            if (this.f24187s == null) {
                this.f24187s = new HashSet();
            }
            for (C8684b bVar : bVarArr) {
                Set set = this.f24187s;
                C41536l.m120486f(set);
                set.add(Integer.valueOf(bVar.f24500a));
                Set set2 = this.f24187s;
                C41536l.m120486f(set2);
                set2.add(Integer.valueOf(bVar.f24501b));
            }
            this.f24185q.mo23832b((C8684b[]) Arrays.copyOf(bVarArr, bVarArr.length));
            return this;
        }

        /* renamed from: c */
        public C8504a mo23824c() {
            this.f24178j = true;
            return this;
        }

        /* renamed from: d */
        public C8503w mo23825d() {
            int i;
            int i2;
            int i3;
            Executor executor = this.f24175g;
            if (executor == null && this.f24176h == null) {
                Executor f = C6408c.m25462f();
                this.f24176h = f;
                this.f24175g = f;
            } else if (executor != null && this.f24176h == null) {
                this.f24176h = executor;
            } else if (executor == null) {
                this.f24175g = this.f24176h;
            }
            Set<Number> set = this.f24187s;
            boolean z = true;
            if (set != null) {
                C41536l.m120486f(set);
                for (Number intValue : set) {
                    int intValue2 = intValue.intValue();
                    if (!(!this.f24186r.contains(Integer.valueOf(intValue2)))) {
                        throw new IllegalArgumentException(("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + intValue2).toString());
                    }
                }
            }
            C8462e eVar = this.f24177i;
            if (eVar == null) {
                eVar = new C9165f();
            }
            if (eVar != null) {
                if (this.f24183o > 0) {
                    if (this.f24171c != null) {
                        long j = this.f24183o;
                        TimeUnit timeUnit = this.f24184p;
                        if (timeUnit != null) {
                            Executor executor2 = this.f24175g;
                            if (executor2 != null) {
                                eVar = new C8462e(eVar, new C8443c(j, timeUnit, executor2));
                            } else {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                        } else {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.".toString());
                    }
                }
                String str = this.f24188t;
                if (!(str == null && this.f24189u == null && this.f24190v == null)) {
                    if (this.f24171c != null) {
                        if (str == null) {
                            i = 0;
                        } else {
                            i = 1;
                        }
                        File file = this.f24189u;
                        if (file == null) {
                            i2 = 0;
                        } else {
                            i2 = 1;
                        }
                        Callable callable = this.f24190v;
                        if (callable == null) {
                            i3 = 0;
                        } else {
                            i3 = 1;
                        }
                        if (i + i2 + i3 != 1) {
                            z = false;
                        }
                        if (z) {
                            eVar = new C8461d0(str, file, callable, eVar);
                        } else {
                            throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.".toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.".toString());
                    }
                }
            } else {
                eVar = null;
            }
            C8461d0 d0Var = eVar;
            if (d0Var != null) {
                Context context = this.f24169a;
                String str2 = this.f24171c;
                C8508e eVar2 = this.f24185q;
                List list = this.f24172d;
                boolean z2 = this.f24178j;
                C8507d c = this.f24179k.mo23831c(context);
                Executor executor3 = this.f24175g;
                if (executor3 != null) {
                    Executor executor4 = this.f24176h;
                    if (executor4 != null) {
                        C8474h hVar = new C8474h(context, str2, d0Var, eVar2, list, z2, c, executor3, executor4, this.f24180l, this.f24181m, this.f24182n, this.f24186r, this.f24188t, this.f24189u, this.f24190v, (C8509f) null, this.f24173e, this.f24174f);
                        C8503w wVar = (C8503w) C8502v.m31832b(this.f24170b, "_Impl");
                        wVar.mo23818u(hVar);
                        return wVar;
                    }
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        /* renamed from: e */
        public C8504a mo23826e() {
            this.f24181m = false;
            this.f24182n = true;
            return this;
        }

        /* renamed from: f */
        public C8504a mo23827f(C8999j.C9005c cVar) {
            this.f24177i = cVar;
            return this;
        }

        /* renamed from: g */
        public C8504a mo23828g(Executor executor) {
            C41536l.m120489i(executor, "executor");
            this.f24175g = executor;
            return this;
        }
    }

    /* renamed from: u0.w$b */
    public static abstract class C8505b {
        /* renamed from: a */
        public void mo23829a(C8998i iVar) {
            C41536l.m120489i(iVar, "db");
        }

        /* renamed from: b */
        public void mo23830b(C8998i iVar) {
            C41536l.m120489i(iVar, "db");
        }

        /* renamed from: c */
        public void mo6807c(C8998i iVar) {
            C41536l.m120489i(iVar, "db");
        }
    }

    /* renamed from: u0.w$c */
    public static final class C8506c {
        private C8506c() {
        }

        public /* synthetic */ C8506c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: u0.w$d */
    public enum C8507d {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        /* renamed from: b */
        private final boolean m31878b(ActivityManager activityManager) {
            return C8992c.m33285b(activityManager);
        }

        /* renamed from: c */
        public final C8507d mo23831c(Context context) {
            ActivityManager activityManager;
            C41536l.m120489i(context, "context");
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = context.getSystemService("activity");
            if (systemService instanceof ActivityManager) {
                activityManager = (ActivityManager) systemService;
            } else {
                activityManager = null;
            }
            if (activityManager == null || m31878b(activityManager)) {
                return TRUNCATE;
            }
            return WRITE_AHEAD_LOGGING;
        }
    }

    /* renamed from: u0.w$e */
    public static class C8508e {

        /* renamed from: a */
        private final Map f24195a = new LinkedHashMap();

        /* renamed from: a */
        private final void m31880a(C8684b bVar) {
            int i = bVar.f24500a;
            int i2 = bVar.f24501b;
            Map map = this.f24195a;
            Integer valueOf = Integer.valueOf(i);
            Object obj = map.get(valueOf);
            if (obj == null) {
                obj = new TreeMap();
                map.put(valueOf, obj);
            }
            TreeMap treeMap = (TreeMap) obj;
            if (treeMap.containsKey(Integer.valueOf(i2))) {
                Log.w("ROOM", "Overriding migration " + treeMap.get(Integer.valueOf(i2)) + " with " + bVar);
            }
            treeMap.put(Integer.valueOf(i2), bVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
            if (r6 <= r12) goto L_0x0056;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0054, code lost:
            if (r6 < r11) goto L_0x0056;
         */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x005b A[SYNTHETIC] */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final java.util.List m31881e(java.util.List r9, boolean r10, int r11, int r12) {
            /*
                r8 = this;
            L_0x0000:
                r0 = 1
                r1 = 0
                if (r10 == 0) goto L_0x0007
                if (r11 >= r12) goto L_0x000b
                goto L_0x0009
            L_0x0007:
                if (r11 <= r12) goto L_0x000b
            L_0x0009:
                r2 = r0
                goto L_0x000c
            L_0x000b:
                r2 = r1
            L_0x000c:
                if (r2 == 0) goto L_0x006e
                java.util.Map r2 = r8.f24195a
                java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
                java.lang.Object r2 = r2.get(r3)
                java.util.TreeMap r2 = (java.util.TreeMap) r2
                r3 = 0
                if (r2 != 0) goto L_0x001e
                return r3
            L_0x001e:
                if (r10 == 0) goto L_0x0025
                java.util.NavigableSet r4 = r2.descendingKeySet()
                goto L_0x0029
            L_0x0025:
                java.util.Set r4 = r2.keySet()
            L_0x0029:
                java.util.Iterator r4 = r4.iterator()
            L_0x002d:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L_0x006a
                java.lang.Object r5 = r4.next()
                java.lang.Integer r5 = (java.lang.Integer) r5
                java.lang.String r6 = "targetVersion"
                if (r10 == 0) goto L_0x004b
                int r7 = r11 + 1
                kotlin.jvm.internal.C41536l.m120488h(r5, r6)
                int r6 = r5.intValue()
                if (r7 > r6) goto L_0x0058
                if (r6 > r12) goto L_0x0058
                goto L_0x0056
            L_0x004b:
                kotlin.jvm.internal.C41536l.m120488h(r5, r6)
                int r6 = r5.intValue()
                if (r12 > r6) goto L_0x0058
                if (r6 >= r11) goto L_0x0058
            L_0x0056:
                r6 = r0
                goto L_0x0059
            L_0x0058:
                r6 = r1
            L_0x0059:
                if (r6 == 0) goto L_0x002d
                java.lang.Object r11 = r2.get(r5)
                kotlin.jvm.internal.C41536l.m120486f(r11)
                r9.add(r11)
                int r11 = r5.intValue()
                goto L_0x006b
            L_0x006a:
                r0 = r1
            L_0x006b:
                if (r0 != 0) goto L_0x0000
                return r3
            L_0x006e:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p267u0.C8503w.C8508e.m31881e(java.util.List, boolean, int, int):java.util.List");
        }

        /* renamed from: b */
        public void mo23832b(C8684b... bVarArr) {
            C41536l.m120489i(bVarArr, "migrations");
            for (C8684b a : bVarArr) {
                m31880a(a);
            }
        }

        /* renamed from: c */
        public final boolean mo23833c(int i, int i2) {
            Map f = mo23835f();
            if (!f.containsKey(Integer.valueOf(i))) {
                return false;
            }
            Map map = (Map) f.get(Integer.valueOf(i));
            if (map == null) {
                map = C41344r0.m119928j();
            }
            return map.containsKey(Integer.valueOf(i2));
        }

        /* renamed from: d */
        public List mo23834d(int i, int i2) {
            boolean z;
            if (i == i2) {
                return C41341q.m119907j();
            }
            if (i2 > i) {
                z = true;
            } else {
                z = false;
            }
            return m31881e(new ArrayList(), z, i, i2);
        }

        /* renamed from: f */
        public Map mo23835f() {
            return this.f24195a;
        }
    }

    /* renamed from: u0.w$f */
    public static abstract class C8509f {
    }

    /* renamed from: u0.w$g */
    static final class C8510g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C8503w f24196d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8510g(C8503w wVar) {
            super(1);
            this.f24196d = wVar;
        }

        /* renamed from: a */
        public final Object invoke(C8998i iVar) {
            C41536l.m120489i(iVar, "it");
            this.f24196d.m31838v();
            return null;
        }
    }

    /* renamed from: u0.w$h */
    static final class C8511h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C8503w f24197d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8511h(C8503w wVar) {
            super(1);
            this.f24197d = wVar;
        }

        /* renamed from: a */
        public final Object invoke(C8998i iVar) {
            C41536l.m120489i(iVar, "it");
            this.f24197d.m31839w();
            return null;
        }
    }

    public C8503w() {
        Map synchronizedMap = DesugarCollections.synchronizedMap(new LinkedHashMap());
        C41536l.m120488h(synchronizedMap, "synchronizedMap(mutableMapOf())");
        this.f24167m = synchronizedMap;
        this.f24168n = new LinkedHashMap();
    }

    /* renamed from: C */
    public static /* synthetic */ Cursor m31834C(C8503w wVar, C9007l lVar, CancellationSignal cancellationSignal, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                cancellationSignal = null;
            }
            return wVar.mo23801B(lVar, cancellationSignal);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
    }

    /* renamed from: G */
    private final Object m31835G(Class cls, C8999j jVar) {
        if (cls.isInstance(jVar)) {
            return jVar;
        }
        if (jVar instanceof C8476i) {
            return m31835G(cls, ((C8476i) jVar).mo23644a());
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public final void m31838v() {
        mo23805c();
        C8998i Z0 = mo23813n().mo23643Z0();
        mo23812m().mo23771u(Z0);
        if (Z0.mo23665w1()) {
            Z0.mo23657Z();
        } else {
            Z0.mo23650F();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public final void m31839w() {
        mo23813n().mo23643Z0().mo23662i0();
        if (!mo23817t()) {
            mo23812m().mo23766m();
        }
    }

    /* renamed from: A */
    public final boolean mo23800A() {
        C8998i iVar = this.f24155a;
        return iVar != null && iVar.isOpen();
    }

    /* renamed from: B */
    public Cursor mo23801B(C9007l lVar, CancellationSignal cancellationSignal) {
        C41536l.m120489i(lVar, "query");
        mo23805c();
        mo23806d();
        if (cancellationSignal != null) {
            return mo23813n().mo23643Z0().mo23649A1(lVar, cancellationSignal);
        }
        return mo23813n().mo23643Z0().mo23661g1(lVar);
    }

    /* renamed from: D */
    public Object mo23802D(Callable callable) {
        C41536l.m120489i(callable, "body");
        mo23807e();
        try {
            Object call = callable.call();
            mo23804F();
            return call;
        } finally {
            mo23809i();
        }
    }

    /* renamed from: E */
    public void mo23803E(Runnable runnable) {
        C41536l.m120489i(runnable, "body");
        mo23807e();
        try {
            runnable.run();
            mo23804F();
        } finally {
            mo23809i();
        }
    }

    /* renamed from: F */
    public void mo23804F() {
        mo23813n().mo23643Z0().mo23655X();
    }

    /* renamed from: c */
    public void mo23805c() {
        if (!this.f24160f && !(!mo23820y())) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.".toString());
        }
    }

    /* renamed from: d */
    public void mo23806d() {
        if (!(mo23817t() || this.f24166l.get() == null)) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.".toString());
        }
    }

    /* renamed from: e */
    public void mo23807e() {
        mo23805c();
        C8443c cVar = this.f24165k;
        if (cVar == null) {
            m31838v();
        } else {
            cVar.mo23635g(new C8510g(this));
        }
    }

    /* renamed from: f */
    public C9008m mo23808f(String str) {
        C41536l.m120489i(str, "sql");
        mo23805c();
        mo23806d();
        return mo23813n().mo23643Z0().mo23653N0(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract C8488q mo6754g();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract C8999j mo6755h(C8474h hVar);

    /* renamed from: i */
    public void mo23809i() {
        C8443c cVar = this.f24165k;
        if (cVar == null) {
            m31839w();
        } else {
            cVar.mo23635g(new C8511h(this));
        }
    }

    /* renamed from: j */
    public List mo6756j(Map map) {
        C41536l.m120489i(map, "autoMigrationSpecs");
        return C41341q.m119907j();
    }

    /* renamed from: k */
    public final Map mo23810k() {
        return this.f24167m;
    }

    /* renamed from: l */
    public final Lock mo23811l() {
        ReentrantReadWriteLock.ReadLock readLock = this.f24164j.readLock();
        C41536l.m120488h(readLock, "readWriteLock.readLock()");
        return readLock;
    }

    /* renamed from: m */
    public C8488q mo23812m() {
        return this.f24159e;
    }

    /* renamed from: n */
    public C8999j mo23813n() {
        C8999j jVar = this.f24158d;
        if (jVar != null) {
            return jVar;
        }
        C41536l.m120506z("internalOpenHelper");
        return null;
    }

    /* renamed from: o */
    public Executor mo23814o() {
        Executor executor = this.f24156b;
        if (executor != null) {
            return executor;
        }
        C41536l.m120506z("internalQueryExecutor");
        return null;
    }

    /* renamed from: p */
    public Set mo6757p() {
        return C41357x0.m119985e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public Map mo6758q() {
        return C41344r0.m119928j();
    }

    /* renamed from: r */
    public final ThreadLocal mo23815r() {
        return this.f24166l;
    }

    /* renamed from: s */
    public Executor mo23816s() {
        Executor executor = this.f24157c;
        if (executor != null) {
            return executor;
        }
        C41536l.m120506z("internalTransactionExecutor");
        return null;
    }

    /* renamed from: t */
    public boolean mo23817t() {
        return mo23813n().mo23643Z0().mo23664m1();
    }

    /* renamed from: u */
    public void mo23818u(C8474h hVar) {
        boolean z;
        boolean z2;
        C41536l.m120489i(hVar, "configuration");
        this.f24158d = mo6755h(hVar);
        Set p = mo6757p();
        BitSet bitSet = new BitSet();
        Iterator it = p.iterator();
        while (true) {
            boolean z3 = true;
            int i = -1;
            if (it.hasNext()) {
                Class cls = (Class) it.next();
                int size = hVar.f24091r.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i2 = size - 1;
                        if (cls.isAssignableFrom(hVar.f24091r.get(size).getClass())) {
                            bitSet.set(size);
                            i = size;
                            break;
                        } else if (i2 < 0) {
                            break;
                        } else {
                            size = i2;
                        }
                    }
                }
                if (i < 0) {
                    z3 = false;
                }
                if (z3) {
                    this.f24163i.put(cls, hVar.f24091r.get(i));
                } else {
                    throw new IllegalArgumentException(("A required auto migration spec (" + cls.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
            } else {
                int size2 = hVar.f24091r.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i3 = size2 - 1;
                        if (!bitSet.get(size2)) {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.".toString());
                        } else if (i3 < 0) {
                            break;
                        } else {
                            size2 = i3;
                        }
                    }
                }
                for (C8684b bVar : mo6756j(this.f24163i)) {
                    if (!hVar.f24077d.mo23833c(bVar.f24500a, bVar.f24501b)) {
                        hVar.f24077d.mo23832b(bVar);
                    }
                }
                C8445c0 c0Var = (C8445c0) m31835G(C8445c0.class, mo23813n());
                if (c0Var != null) {
                    c0Var.mo23646e(hVar);
                }
                C8446d dVar = (C8446d) m31835G(C8446d.class, mo23813n());
                if (dVar != null) {
                    this.f24165k = dVar.f24025e;
                    mo23812m().mo23768p(dVar.f24025e);
                }
                if (hVar.f24080g == C8507d.WRITE_AHEAD_LOGGING) {
                    z = true;
                } else {
                    z = false;
                }
                mo23813n().setWriteAheadLoggingEnabled(z);
                this.f24162h = hVar.f24078e;
                this.f24156b = hVar.f24081h;
                this.f24157c = new C8475h0(hVar.f24082i);
                this.f24160f = hVar.f24079f;
                this.f24161g = z;
                if (hVar.f24083j != null) {
                    if (hVar.f24075b != null) {
                        mo23812m().mo23769q(hVar.f24074a, hVar.f24075b, hVar.f24083j);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                Map q = mo6758q();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry entry : q.entrySet()) {
                    Class cls2 = (Class) entry.getKey();
                    Iterator it2 = ((List) entry.getValue()).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Class cls3 = (Class) it2.next();
                            int size3 = hVar.f24090q.size() - 1;
                            if (size3 >= 0) {
                                while (true) {
                                    int i4 = size3 - 1;
                                    if (cls3.isAssignableFrom(hVar.f24090q.get(size3).getClass())) {
                                        bitSet2.set(size3);
                                        break;
                                    } else if (i4 < 0) {
                                        break;
                                    } else {
                                        size3 = i4;
                                    }
                                }
                            }
                            size3 = -1;
                            if (size3 >= 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                this.f24168n.put(cls3, hVar.f24090q.get(size3));
                            } else {
                                throw new IllegalArgumentException(("A required type converter (" + cls3 + ") for " + cls2.getCanonicalName() + " is missing in the database configuration.").toString());
                            }
                        }
                    }
                }
                int size4 = hVar.f24090q.size() - 1;
                if (size4 >= 0) {
                    while (true) {
                        int i5 = size4 - 1;
                        if (!bitSet2.get(size4)) {
                            throw new IllegalArgumentException("Unexpected type converter " + hVar.f24090q.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                        } else if (i5 >= 0) {
                            size4 = i5;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo23819x(C8998i iVar) {
        C41536l.m120489i(iVar, "db");
        mo23812m().mo23764j(iVar);
    }

    /* renamed from: y */
    public final boolean mo23820y() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: z */
    public boolean mo23821z() {
        Boolean bool;
        boolean isOpen;
        C8443c cVar = this.f24165k;
        if (cVar != null) {
            isOpen = cVar.mo23640l();
        } else {
            C8998i iVar = this.f24155a;
            if (iVar != null) {
                isOpen = iVar.isOpen();
            } else {
                bool = null;
                return C41536l.m120484d(bool, Boolean.TRUE);
            }
        }
        bool = Boolean.valueOf(isOpen);
        return C41536l.m120484d(bool, Boolean.TRUE);
    }
}
