package ts0;

import at0.C31064a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.data.entity.MoneyBoxTariffApiEntity;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.data.entity.OpenMoneyBoxResultEntity;
import ys0.C40058b;

/* renamed from: ts0.b */
public final class C38794b {
    /* renamed from: a */
    public final C31064a mo92495a(OpenMoneyBoxResultEntity openMoneyBoxResultEntity) {
        C41536l.m120489i(openMoneyBoxResultEntity, "openMoneyBoxResultEntity");
        return new C31064a(openMoneyBoxResultEntity.getCasId());
    }

    /* renamed from: b */
    public final List mo92496b(List list) {
        C41536l.m120489i(list, "entity");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo92497c((MoneyBoxTariffApiEntity) it.next()));
        }
        return arrayList;
    }

    /* renamed from: c */
    public final C40058b mo92497c(MoneyBoxTariffApiEntity moneyBoxTariffApiEntity) {
        C41536l.m120489i(moneyBoxTariffApiEntity, "entity");
        return new C40058b(moneyBoxTariffApiEntity.getId(), moneyBoxTariffApiEntity.getSchemeType(), moneyBoxTariffApiEntity.getTariff().doubleValue(), moneyBoxTariffApiEntity.getDfltCcy());
    }
}
