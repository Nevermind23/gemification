package ja0;

import ed1.C40762x;
import ka0.C25695d;
import kotlin.jvm.internal.C41536l;

/* renamed from: ja0.d */
public final class C25367d {

    /* renamed from: a */
    private final C25365b f65013a;

    /* renamed from: b */
    private final C25366c f65014b;

    /* renamed from: ja0.d$a */
    public /* synthetic */ class C25368a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f65015a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                ka0.d[] r0 = ka0.C25695d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ka0.d r1 = ka0.C25695d.CALL     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ka0.d r1 = ka0.C25695d.PREMIUM     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ka0.d r1 = ka0.C25695d.TERM     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                ka0.d r1 = ka0.C25695d.ENLARG     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f65015a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ja0.C25367d.C25368a.<clinit>():void");
        }
    }

    public C25367d(C25365b bVar, C25366c cVar) {
        C41536l.m120489i(bVar, "getInterestRateForCallPremium");
        C41536l.m120489i(cVar, "getInterestRateForTermEnlarg");
        this.f65013a = bVar;
        this.f65014b = cVar;
    }

    /* renamed from: a */
    public final C40762x mo63956a(C25695d dVar, String str, String str2, String str3, String str4, String str5, String str6) {
        C41536l.m120489i(dVar, "depositType");
        C41536l.m120489i(str, "prodType");
        C41536l.m120489i(str2, "amount");
        C41536l.m120489i(str3, "currency");
        C41536l.m120489i(str4, "withdrawalType");
        int i = C25368a.f65015a[dVar.ordinal()];
        if (i == 1 || i == 2) {
            return this.f65013a.mo63954a(str, str2, str3, "-1", str4);
        }
        if (i == 3 || i == 4) {
            C25366c cVar = this.f65014b;
            if (str5 == null) {
                throw new IllegalArgumentException("depositTerm should not be null".toString());
            } else if (str6 != null) {
                return cVar.mo63955a(str, str2, str3, str5, str6, str4);
            } else {
                throw new IllegalArgumentException("depositEndDate should not be null".toString());
            }
        } else {
            throw new IllegalStateException("Unknown Deposit Type: " + dVar);
        }
    }
}
