package q11;

import g11.C32041b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.rest.model.DarkModeType;
import p341ge.bog.mobilebank.shared.helper.C34646b;

/* renamed from: q11.a */
public final class C38100a {

    /* renamed from: a */
    private final C38102b f91511a;

    /* renamed from: q11.a$a */
    public /* synthetic */ class C38101a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f91512a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                ge.bog.mobilebank.rest.model.DarkModeType[] r0 = p341ge.bog.mobilebank.rest.model.DarkModeType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ge.bog.mobilebank.rest.model.DarkModeType r1 = p341ge.bog.mobilebank.rest.model.DarkModeType.DARK     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ge.bog.mobilebank.rest.model.DarkModeType r1 = p341ge.bog.mobilebank.rest.model.DarkModeType.NONE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ge.bog.mobilebank.rest.model.DarkModeType r1 = p341ge.bog.mobilebank.rest.model.DarkModeType.AUTO     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f91512a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: q11.C38100a.C38101a.<clinit>():void");
        }
    }

    public C38100a(C38102b bVar) {
        C41536l.m120489i(bVar, "getDarkMode");
        this.f91511a = bVar;
    }

    /* renamed from: a */
    private final String m111956a(DarkModeType darkModeType) {
        int i = C38101a.f91512a[darkModeType.ordinal()];
        if (i == 1) {
            return "theme.switcher.actionsheet.radiobutton.light";
        }
        if (i == 2) {
            return "theme.switcher.actionsheet.radiobutton.dark";
        }
        if (i == 3) {
            return "theme.switcher.actionsheet.radiobutton.system";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: b */
    public final C32041b.C32042a mo91527b() {
        return new C32041b.C32042a.C32045c(C34646b.m101748b(m111956a(this.f91511a.mo91528a()), new Object[0]));
    }
}
