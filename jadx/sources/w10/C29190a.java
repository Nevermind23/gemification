package w10;

import g91.C32289b0;
import kotlin.jvm.internal.C41536l;
import p366bk.C10320i;
import p891su.C28261a;

/* renamed from: w10.a */
public abstract class C29190a {

    /* renamed from: w10.a$a */
    public /* synthetic */ class C29191a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f74207a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                su.e[] r0 = p891su.C28269e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                su.e r1 = p891su.C28269e.BUDGET     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                su.e r1 = p891su.C28269e.JURIDICAL_PERSON     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f74207a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: w10.C29190a.C29191a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static final int m89129a(C28261a aVar) {
        C41536l.m120489i(aVar, "<this>");
        int i = C29191a.f74207a[aVar.mo67850g().ordinal()];
        if (i == 1) {
            return C10320i.ic_contact_treasury;
        }
        if (i == 2) {
            return C10320i.ic_contact_company_small;
        }
        if (aVar.mo67861q()) {
            return C10320i.ic_contact_default_avatar_bog;
        }
        return C10320i.ic_contact_default_avatar;
    }

    /* renamed from: b */
    public static final String m89130b(C28261a aVar) {
        C41536l.m120489i(aVar, "<this>");
        return C32289b0.m95089a(aVar.mo67860p());
    }
}
