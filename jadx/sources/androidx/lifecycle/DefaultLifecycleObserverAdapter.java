package androidx.lifecycle;

import androidx.lifecycle.C1593j;
import kotlin.jvm.internal.C41536l;

public final class DefaultLifecycleObserverAdapter implements C1606m {

    /* renamed from: d */
    private final C1579f f4501d;

    /* renamed from: e */
    private final C1606m f4502e;

    /* renamed from: androidx.lifecycle.DefaultLifecycleObserverAdapter$a */
    public /* synthetic */ class C1548a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4503a;

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
                androidx.lifecycle.j$a r1 = androidx.lifecycle.C1593j.C1594a.ON_START     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.lifecycle.j$a r1 = androidx.lifecycle.C1593j.C1594a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.lifecycle.j$a r1 = androidx.lifecycle.C1593j.C1594a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                androidx.lifecycle.j$a r1 = androidx.lifecycle.C1593j.C1594a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x0034 }
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
                f4503a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.DefaultLifecycleObserverAdapter.C1548a.<clinit>():void");
        }
    }

    public DefaultLifecycleObserverAdapter(C1579f fVar, C1606m mVar) {
        C41536l.m120489i(fVar, "defaultLifecycleObserver");
        this.f4501d = fVar;
        this.f4502e = mVar;
    }

    /* renamed from: b */
    public void mo336b(C1619q qVar, C1593j.C1594a aVar) {
        C41536l.m120489i(qVar, "source");
        C41536l.m120489i(aVar, "event");
        switch (C1548a.f4503a[aVar.ordinal()]) {
            case 1:
                this.f4501d.mo3970a(qVar);
                break;
            case 2:
                this.f4501d.onStart(qVar);
                break;
            case 3:
                this.f4501d.mo3971d(qVar);
                break;
            case 4:
                this.f4501d.mo3972e(qVar);
                break;
            case 5:
                this.f4501d.onStop(qVar);
                break;
            case 6:
                this.f4501d.onDestroy(qVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        C1606m mVar = this.f4502e;
        if (mVar != null) {
            mVar.mo336b(qVar, aVar);
        }
    }
}
