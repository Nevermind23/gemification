package g91;

import android.os.Bundle;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import m11.C37196a;
import p341ge.bog.mobilebank.rest.model.DarkModeType;
import p380ck.C10463g;
import p380ck.C10464h;

/* renamed from: g91.l */
public final class C32316l {

    /* renamed from: a */
    public static final C32316l f79744a = new C32316l();

    /* renamed from: g91.l$a */
    public /* synthetic */ class C32317a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f79745a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                ge.bog.mobilebank.rest.model.DarkModeType[] r0 = p341ge.bog.mobilebank.rest.model.DarkModeType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ge.bog.mobilebank.rest.model.DarkModeType r1 = p341ge.bog.mobilebank.rest.model.DarkModeType.NONE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ge.bog.mobilebank.rest.model.DarkModeType r1 = p341ge.bog.mobilebank.rest.model.DarkModeType.DARK     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ge.bog.mobilebank.rest.model.DarkModeType r1 = p341ge.bog.mobilebank.rest.model.DarkModeType.AUTO     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f79745a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: g91.C32316l.C32317a.<clinit>():void");
        }
    }

    private C32316l() {
    }

    /* renamed from: a */
    public static final void m95278a(C37196a aVar, C10463g gVar) {
        C41536l.m120489i(aVar, "<this>");
        C41536l.m120489i(gVar, "analytics");
        C32343x.m95399K0(gVar, "Dark_Mode", aVar.mo90251a(), aVar.mo90252b(), (C10464h.C10465a) null, (Bundle) null, 24, (Object) null);
    }

    /* renamed from: b */
    public static final C37196a.C37200d m95279b(DarkModeType darkModeType) {
        C41536l.m120489i(darkModeType, "<this>");
        int i = C32317a.f79745a[darkModeType.ordinal()];
        if (i == 1) {
            return C37196a.C37200d.LIGHT;
        }
        if (i == 2) {
            return C37196a.C37200d.DARK;
        }
        if (i == 3) {
            return C37196a.C37200d.SYSTEM;
        }
        throw new NoWhenBranchMatchedException();
    }
}
