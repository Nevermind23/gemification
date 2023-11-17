package p821lu;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.commissions.entity.UpcomingPaymentDataEntity;
import p341ge.bog.mobilebank.cleanarch.data.commissions.entity.UpcomingPaymentSummaryEntity;
import p831mu.C26300b;

/* renamed from: lu.d */
public final class C26092d {
    /* renamed from: a */
    public final List mo65005a(UpcomingPaymentDataEntity upcomingPaymentDataEntity) {
        BigDecimal bigDecimal;
        int i;
        C41536l.m120489i(upcomingPaymentDataEntity, "upcomingPaymentDataEntity");
        List<UpcomingPaymentSummaryEntity> summary = upcomingPaymentDataEntity.getSummary();
        ArrayList<UpcomingPaymentSummaryEntity> arrayList = new ArrayList<>();
        for (T next : summary) {
            if (C41536l.m120484d(((UpcomingPaymentSummaryEntity) next).getProductGroup(), "FEE")) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(arrayList, 10));
        for (UpcomingPaymentSummaryEntity upcomingPaymentSummaryEntity : arrayList) {
            String productGroup = upcomingPaymentSummaryEntity.getProductGroup();
            Double amountSum = upcomingPaymentSummaryEntity.getAmountSum();
            if (amountSum != null) {
                bigDecimal = new BigDecimal(String.valueOf(amountSum.doubleValue()));
            } else {
                bigDecimal = BigDecimal.ZERO;
            }
            C41536l.m120488h(bigDecimal, "it.amountSum?.toBigDecimal() ?: BigDecimal.ZERO");
            String ccy = upcomingPaymentSummaryEntity.getCcy();
            Integer count = upcomingPaymentSummaryEntity.getCount();
            if (count != null) {
                i = count.intValue();
            } else {
                i = 0;
            }
            int i2 = i;
            String nameDictionaryKey = upcomingPaymentSummaryEntity.getNameDictionaryKey();
            if (nameDictionaryKey == null) {
                nameDictionaryKey = "null";
            }
            arrayList2.add(new C26300b(productGroup, bigDecimal, ccy, i2, nameDictionaryKey));
        }
        return arrayList2;
    }
}
