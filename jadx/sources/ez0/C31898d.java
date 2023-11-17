package ez0;

import kotlin.NoWhenBranchMatchedException;
import p601sg.C17778c;

/* renamed from: ez0.d */
public enum C31898d {
    OFF(C17778c.f49605C),
    SEMI_ON(C17778c.f49611L),
    ON(C17778c.f49617S);
    

    /* renamed from: d */
    private final int f78631d;

    /* renamed from: ez0.d$a */
    public /* synthetic */ class C31899a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f78632a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                ez0.d[] r0 = ez0.C31898d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ez0.d r1 = ez0.C31898d.OFF     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ez0.d r1 = ez0.C31898d.SEMI_ON     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ez0.d r1 = ez0.C31898d.ON     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f78632a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ez0.C31898d.C31899a.<clinit>():void");
        }
    }

    private C31898d(int i) {
        this.f78631d = i;
    }

    /* renamed from: b */
    public final int mo72330b() {
        return this.f78631d;
    }

    /* renamed from: c */
    public final String mo72331c(boolean z) {
        int i = C31899a.f78632a[ordinal()];
        if (i == 1 || i == 2) {
            if (z) {
                return "card.insurance.main.page.card.not.insured";
            }
            return "card.insurance.main.page.cards.not.insured";
        } else if (i != 3) {
            throw new NoWhenBranchMatchedException();
        } else if (z) {
            return "card.insurance.main.page.card.is.insured";
        } else {
            return "card.insurance.main.page.cards.are.insured";
        }
    }
}
