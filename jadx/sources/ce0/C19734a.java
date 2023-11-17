package ce0;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.endyearcampaign2022.presentation.model.EndYearPopUpDataUiModel;
import yd0.C30003b;

/* renamed from: ce0.a */
public final class C19734a {

    /* renamed from: a */
    public static final C19734a f54090a = new C19734a();

    /* renamed from: ce0.a$a */
    public /* synthetic */ class C19735a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f54091a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                yd0.c[] r0 = yd0.C30004c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                yd0.c r1 = yd0.C30004c.GEL     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                yd0.c r1 = yd0.C30004c.PLUS     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                yd0.c r1 = yd0.C30004c.GB     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f54091a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ce0.C19734a.C19735a.<clinit>():void");
        }
    }

    private C19734a() {
    }

    /* renamed from: a */
    public final EndYearPopUpDataUiModel mo47939a(C30003b bVar) {
        long j;
        C41536l.m120489i(bVar, "<this>");
        Long a = bVar.mo70298a();
        if (a != null) {
            j = a.longValue();
        } else {
            j = 0;
        }
        int i = C19735a.f54091a[bVar.mo70299b().ordinal()];
        if (i == 1) {
            return new EndYearPopUpDataUiModel.GelPrize(j);
        }
        if (i != 2) {
            if (i != 3) {
                return EndYearPopUpDataUiModel.NoPrizePopup.f60932g;
            }
            return new EndYearPopUpDataUiModel.GBPrize(j);
        } else if (bVar.mo70301d()) {
            return new EndYearPopUpDataUiModel.PlusPrizeSuper(j);
        } else {
            return new EndYearPopUpDataUiModel.PlusPrizeRegular(j);
        }
    }
}
