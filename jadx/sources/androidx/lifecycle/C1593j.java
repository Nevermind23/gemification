package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.lifecycle.j */
public abstract class C1593j {

    /* renamed from: a */
    private AtomicReference f4599a = new AtomicReference();

    /* renamed from: androidx.lifecycle.j$a */
    public enum C1594a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;
        
        public static final C1595a Companion = null;

        /* renamed from: androidx.lifecycle.j$a$a */
        public static final class C1595a {

            /* renamed from: androidx.lifecycle.j$a$a$a */
            public /* synthetic */ class C1596a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f4600a = null;

                /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
                static {
                    /*
                        androidx.lifecycle.j$b[] r0 = androidx.lifecycle.C1593j.C1598b.values()
                        int r0 = r0.length
                        int[] r0 = new int[r0]
                        androidx.lifecycle.j$b r1 = androidx.lifecycle.C1593j.C1598b.CREATED     // Catch:{ NoSuchFieldError -> 0x0010 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                        r2 = 1
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                    L_0x0010:
                        androidx.lifecycle.j$b r1 = androidx.lifecycle.C1593j.C1598b.STARTED     // Catch:{ NoSuchFieldError -> 0x0019 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                        r2 = 2
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                    L_0x0019:
                        androidx.lifecycle.j$b r1 = androidx.lifecycle.C1593j.C1598b.RESUMED     // Catch:{ NoSuchFieldError -> 0x0022 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                        r2 = 3
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                    L_0x0022:
                        androidx.lifecycle.j$b r1 = androidx.lifecycle.C1593j.C1598b.DESTROYED     // Catch:{ NoSuchFieldError -> 0x002b }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                        r2 = 4
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                    L_0x002b:
                        androidx.lifecycle.j$b r1 = androidx.lifecycle.C1593j.C1598b.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0034 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                        r2 = 5
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                    L_0x0034:
                        f4600a = r0
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C1593j.C1594a.C1595a.C1596a.<clinit>():void");
                }
            }

            private C1595a() {
            }

            public /* synthetic */ C1595a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C1594a mo4911a(C1598b bVar) {
                C41536l.m120489i(bVar, "state");
                int i = C1596a.f4600a[bVar.ordinal()];
                if (i == 1) {
                    return C1594a.ON_DESTROY;
                }
                if (i == 2) {
                    return C1594a.ON_STOP;
                }
                if (i != 3) {
                    return null;
                }
                return C1594a.ON_PAUSE;
            }

            /* renamed from: b */
            public final C1594a mo4912b(C1598b bVar) {
                C41536l.m120489i(bVar, "state");
                int i = C1596a.f4600a[bVar.ordinal()];
                if (i == 1) {
                    return C1594a.ON_START;
                }
                if (i == 2) {
                    return C1594a.ON_RESUME;
                }
                if (i != 5) {
                    return null;
                }
                return C1594a.ON_CREATE;
            }

            /* renamed from: c */
            public final C1594a mo4913c(C1598b bVar) {
                C41536l.m120489i(bVar, "state");
                int i = C1596a.f4600a[bVar.ordinal()];
                if (i == 1) {
                    return C1594a.ON_CREATE;
                }
                if (i == 2) {
                    return C1594a.ON_START;
                }
                if (i != 3) {
                    return null;
                }
                return C1594a.ON_RESUME;
            }
        }

        /* renamed from: androidx.lifecycle.j$a$b */
        public /* synthetic */ class C1597b {

            /* renamed from: a */
            public static final /* synthetic */ int[] f4601a = null;

            /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|17) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    androidx.lifecycle.j$a[] r0 = androidx.lifecycle.C1593j.C1594a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    androidx.lifecycle.j$a r1 = androidx.lifecycle.C1593j.C1594a.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    androidx.lifecycle.j$a r1 = androidx.lifecycle.C1593j.C1594a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    androidx.lifecycle.j$a r1 = androidx.lifecycle.C1593j.C1594a.ON_START     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    androidx.lifecycle.j$a r1 = androidx.lifecycle.C1593j.C1594a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    androidx.lifecycle.j$a r1 = androidx.lifecycle.C1593j.C1594a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    androidx.lifecycle.j$a r1 = androidx.lifecycle.C1593j.C1594a.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x003d }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                    r2 = 6
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
                L_0x003d:
                    androidx.lifecycle.j$a r1 = androidx.lifecycle.C1593j.C1594a.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0046 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                    r2 = 7
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
                L_0x0046:
                    f4601a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C1593j.C1594a.C1597b.<clinit>():void");
            }
        }

        static {
            Companion = new C1595a((DefaultConstructorMarker) null);
        }

        /* renamed from: b */
        public static final C1594a m5629b(C1598b bVar) {
            return Companion.mo4911a(bVar);
        }

        /* renamed from: e */
        public static final C1594a m5630e(C1598b bVar) {
            return Companion.mo4913c(bVar);
        }

        /* renamed from: c */
        public final C1598b mo4910c() {
            switch (C1597b.f4601a[ordinal()]) {
                case 1:
                case 2:
                    return C1598b.CREATED;
                case 3:
                case 4:
                    return C1598b.STARTED;
                case 5:
                    return C1598b.RESUMED;
                case 6:
                    return C1598b.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* renamed from: androidx.lifecycle.j$b */
    public enum C1598b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        /* renamed from: b */
        public final boolean mo4914b(C1598b bVar) {
            C41536l.m120489i(bVar, "state");
            if (compareTo(bVar) >= 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public abstract void mo4906a(C1616p pVar);

    /* renamed from: b */
    public abstract C1598b mo4907b();

    /* renamed from: c */
    public final AtomicReference mo4908c() {
        return this.f4599a;
    }

    /* renamed from: d */
    public abstract void mo4909d(C1616p pVar);
}
