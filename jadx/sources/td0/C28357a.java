package td0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;
import p341ge.bog.mobilebank.endyearcampaign2022.data.entity.EndYearCampaignInfoEntity;
import p341ge.bog.mobilebank.endyearcampaign2022.data.entity.PrizeTypeEntity;
import yd0.C30003b;
import yd0.C30004c;

/* renamed from: td0.a */
public final class C28357a {

    /* renamed from: td0.a$a */
    public /* synthetic */ class C28358a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f71869a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                ge.bog.mobilebank.endyearcampaign2022.data.entity.PrizeTypeEntity[] r0 = p341ge.bog.mobilebank.endyearcampaign2022.data.entity.PrizeTypeEntity.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ge.bog.mobilebank.endyearcampaign2022.data.entity.PrizeTypeEntity r1 = p341ge.bog.mobilebank.endyearcampaign2022.data.entity.PrizeTypeEntity.PLUS     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ge.bog.mobilebank.endyearcampaign2022.data.entity.PrizeTypeEntity r1 = p341ge.bog.mobilebank.endyearcampaign2022.data.entity.PrizeTypeEntity.GEL     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ge.bog.mobilebank.endyearcampaign2022.data.entity.PrizeTypeEntity r1 = p341ge.bog.mobilebank.endyearcampaign2022.data.entity.PrizeTypeEntity.GB     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f71869a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: td0.C28357a.C28358a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public final C30003b mo67990a(EndYearCampaignInfoEntity endYearCampaignInfoEntity) {
        boolean z;
        Long l;
        C30004c cVar;
        boolean z2;
        boolean z3;
        C41536l.m120489i(endYearCampaignInfoEntity, "entity");
        YesNoApiEntity isWinner = endYearCampaignInfoEntity.isWinner();
        YesNoApiEntity yesNoApiEntity = YesNoApiEntity.YES;
        if (isWinner == yesNoApiEntity) {
            z = true;
        } else {
            z = false;
        }
        Double prizeAmount = endYearCampaignInfoEntity.getPrizeAmount();
        if (prizeAmount != null) {
            l = Long.valueOf((long) prizeAmount.doubleValue());
        } else {
            l = null;
        }
        Long l2 = l;
        if (endYearCampaignInfoEntity.isWinner() == yesNoApiEntity) {
            cVar = mo67991b(endYearCampaignInfoEntity.getPrizeType());
        } else {
            cVar = C30004c.NONE;
        }
        C30004c cVar2 = cVar;
        if (endYearCampaignInfoEntity.getShowPopup() == yesNoApiEntity) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (endYearCampaignInfoEntity.isSuperPrize() == yesNoApiEntity) {
            z3 = true;
        } else {
            z3 = false;
        }
        return new C30003b(z, l2, cVar2, z2, z3);
    }

    /* renamed from: b */
    public final C30004c mo67991b(PrizeTypeEntity prizeTypeEntity) {
        int i;
        if (prizeTypeEntity == null) {
            i = -1;
        } else {
            i = C28358a.f71869a[prizeTypeEntity.ordinal()];
        }
        if (i == -1) {
            return C30004c.NONE;
        }
        if (i == 1) {
            return C30004c.PLUS;
        }
        if (i == 2) {
            return C30004c.GEL;
        }
        if (i == 3) {
            return C30004c.GB;
        }
        throw new NoWhenBranchMatchedException();
    }
}
