package p708at;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.pfm.cashflow.entity.CashFlowBalanceEntity;
import p341ge.bog.mobilebank.cleanarch.data.pfm.cashflow.entity.CashFlowMonthEntity;
import p341ge.bog.mobilebank.cleanarch.data.pfm.cashflow.entity.CashFlowResponse;
import p969zv.C30411a;

/* renamed from: at.a */
public final class C19276a {
    /* renamed from: a */
    private final boolean m64727a(Date date) {
        return date.compareTo(new Date()) > 0;
    }

    /* renamed from: c */
    private final List m64728c(List list) {
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CashFlowMonthEntity cashFlowMonthEntity = (CashFlowMonthEntity) it.next();
            arrayList.add(m64729d(cashFlowMonthEntity.getMonth(), cashFlowMonthEntity.getCurrent(), cashFlowMonthEntity.getForecasting()));
        }
        return arrayList;
    }

    /* renamed from: d */
    private final C30411a m64729d(String str, CashFlowBalanceEntity cashFlowBalanceEntity, CashFlowBalanceEntity cashFlowBalanceEntity2) {
        Date parse = new SimpleDateFormat("yyyy-MM").parse(str);
        C41536l.m120488h(parse, "monthDate");
        boolean a = m64727a(parse);
        if (a) {
            return new C30411a(parse, cashFlowBalanceEntity2.getIncome(), cashFlowBalanceEntity2.getExpenses(), cashFlowBalanceEntity2.getBalance(), cashFlowBalanceEntity2.getNetCashFlow(), a);
        }
        return new C30411a(parse, cashFlowBalanceEntity.getIncome(), cashFlowBalanceEntity.getExpenses(), cashFlowBalanceEntity.getBalance(), cashFlowBalanceEntity.getNetCashFlow(), a);
    }

    /* renamed from: b */
    public final List mo47498b(CashFlowResponse cashFlowResponse) {
        C41536l.m120489i(cashFlowResponse, "cashFlowResponse");
        return m64728c(cashFlowResponse.getPfmData());
    }
}
