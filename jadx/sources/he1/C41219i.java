package he1;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ue1.C43064a;

/* renamed from: he1.i */
abstract class C41219i {

    /* renamed from: he1.i$a */
    public /* synthetic */ class C41220a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f97203a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                he1.k[] r0 = he1.C41222k.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                he1.k r1 = he1.C41222k.SYNCHRONIZED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                he1.k r1 = he1.C41222k.PUBLICATION     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                he1.k r1 = he1.C41222k.NONE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f97203a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: he1.C41219i.C41220a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static C41217g m119469a(C41222k kVar, C43064a aVar) {
        C41536l.m120489i(kVar, "mode");
        C41536l.m120489i(aVar, "initializer");
        int i = C41220a.f97203a[kVar.ordinal()];
        if (i == 1) {
            return new C41231q(aVar, (Object) null, 2, (DefaultConstructorMarker) null);
        }
        if (i == 2) {
            return new C41229p(aVar);
        }
        if (i == 3) {
            return new C41239x(aVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: b */
    public static C41217g m119470b(C43064a aVar) {
        C41536l.m120489i(aVar, "initializer");
        return new C41231q(aVar, (Object) null, 2, (DefaultConstructorMarker) null);
    }
}
