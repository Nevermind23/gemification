package h01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import m01.C37195i;
import p341ge.bog.mobilebank.qrwithdrawal.data.model.QrDailyLimitApiModel;

/* renamed from: h01.b */
public final class C36141b {
    /* renamed from: a */
    public final List mo88894a(List list) {
        List list2 = list;
        C41536l.m120489i(list2, "qrDailyLimitApiModel");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list2, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            QrDailyLimitApiModel qrDailyLimitApiModel = (QrDailyLimitApiModel) it.next();
            Iterator it2 = it;
            C37195i iVar = r3;
            C37195i iVar2 = new C37195i(qrDailyLimitApiModel.getId(), qrDailyLimitApiModel.getCardId(), qrDailyLimitApiModel.getChannelType(), qrDailyLimitApiModel.getChannelTypeDesc(), qrDailyLimitApiModel.getCurrentCount(), qrDailyLimitApiModel.getCurrentAmount(), qrDailyLimitApiModel.getMaxLimitCount(), qrDailyLimitApiModel.getMaxLimitAmount(), qrDailyLimitApiModel.getAvailableLimitCount(), qrDailyLimitApiModel.getAvailableLimitAmount(), qrDailyLimitApiModel.getLimitStartDate(), qrDailyLimitApiModel.getLimitEndDate());
            arrayList.add(iVar);
            it = it2;
        }
        return arrayList;
    }
}
