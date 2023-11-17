package lo0;

import ao0.C10119a;
import co0.C10521a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import sn0.C17900d;

/* renamed from: lo0.a */
public abstract class C16641a {

    /* renamed from: lo0.a$a */
    public /* synthetic */ class C16642a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f46839a;

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
                ao0.a[] r0 = ao0.C10119a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ao0.a r1 = ao0.C10119a.PLUS     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ao0.a r1 = ao0.C10119a.DISCOUNT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ao0.a r1 = ao0.C10119a.PRESENT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                ao0.a r1 = ao0.C10119a.CASHBACK     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                ao0.a r1 = ao0.C10119a.MR     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                ao0.a r1 = ao0.C10119a.INSTALLMENT     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                ao0.a r1 = ao0.C10119a.BNPL     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                f46839a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: lo0.C16641a.C16642a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static final Integer m58963a(C10119a aVar) {
        C41536l.m120489i(aVar, "benefName");
        switch (C16642a.f46839a[aVar.ordinal()]) {
            case 1:
                return Integer.valueOf(C17900d.icons_24_badge_plus);
            case 2:
                return Integer.valueOf(C17900d.icons_24_badge_gift);
            case 3:
                return Integer.valueOf(C17900d.icons_24_badge_gift);
            case 4:
                return Integer.valueOf(C17900d.icons_24_badge_cashback);
            case 5:
                return Integer.valueOf(C17900d.icons_24_badge_mr);
            case 6:
                return Integer.valueOf(C17900d.icons_24_badge_installment);
            case 7:
                return Integer.valueOf(C17900d.icons_bnpl_filter);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: b */
    public static final String m58964b(C10119a aVar) {
        C41536l.m120489i(aVar, "benefName");
        switch (C16642a.f46839a[aVar.ordinal()]) {
            case 1:
                return C10521a.m38133i();
            case 2:
                return C10521a.m38130f();
            case 3:
                return C10521a.m38134j();
            case 4:
                return C10521a.m38129e();
            case 5:
                return C10521a.m38132h();
            case 6:
                return C10521a.m38131g();
            case 7:
                return C10521a.m38128d();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
