package t40;

import android.app.Activity;
import android.os.Bundle;
import iu0.C36546y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.faq.FAQActivity;
import p380ck.C10464h;
import r40.C27917c;

/* renamed from: t40.a */
public final class C28304a {

    /* renamed from: a */
    public static final C28304a f71822a = new C28304a();

    /* renamed from: t40.a$a */
    public /* synthetic */ class C28305a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f71823a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                r40.c[] r0 = r40.C27917c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r40.c r1 = r40.C27917c.ANALYSIS     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r40.c r1 = r40.C27917c.CASH_FLOW     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r40.c r1 = r40.C27917c.OPERATIONS     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                r40.c r1 = r40.C27917c.CALENDAR     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f71823a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: t40.C28304a.C28305a.<clinit>():void");
        }
    }

    private C28304a() {
    }

    /* renamed from: a */
    public final void mo67958a(Activity activity, C27917c cVar) {
        String str;
        C41536l.m120489i(activity, "activity");
        C41536l.m120489i(cVar, "faqType");
        int i = C28305a.f71823a[cVar.ordinal()];
        if (i == 1) {
            str = "category_analysis";
        } else if (i == 2) {
            str = "dynamics";
        } else if (i == 3) {
            str = "statement";
        } else if (i == 4) {
            str = "calendar";
        } else {
            throw new NoWhenBranchMatchedException();
        }
        C36546y.m108282F().mo27137H("help", "open_help", str, (Bundle) null, C10464h.C10465a.FIREBASE);
        FAQActivity.f58888N.mo54978a(activity, cVar, "help", "close_help", str);
    }
}
