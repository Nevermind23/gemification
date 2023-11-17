package hs0;

import g91.C32343x;
import g91.C32359z0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o31.C37603j;
import p341ge.bog.mobilebank.loans.presentation.LoansFlow;
import p341ge.bog.mobilebank.loans.presentation.model.PaymentResultData;
import p341ge.bog.mobilebank.loans.presentation.repayment.model.RepaymentDetailsUiModel;
import p341ge.bog.mobilebank.shared.helper.StringSource;

/* renamed from: hs0.g */
public final class C36194g {
    /* renamed from: a */
    public final List mo88954a(LoansFlow.PawnLoanPayment pawnLoanPayment) {
        C41536l.m120489i(pawnLoanPayment, "pawnLoanData");
        ArrayList arrayList = new ArrayList();
        BigDecimal add = pawnLoanPayment.mo74034b().add(pawnLoanPayment.mo74039f());
        C41536l.m120488h(add, "this.add(other)");
        BigDecimal add2 = add.add(pawnLoanPayment.mo74041h());
        C41536l.m120488h(add2, "this.add(other)");
        List m = C41341q.m119910m(add2, pawnLoanPayment.mo74034b(), pawnLoanPayment.mo74039f(), pawnLoanPayment.mo74041h());
        List m2 = C41341q.m119910m("pln.loan.repayment.loan.details.full.amount", "pln.loan.repayment.loan.details.principal", "pln.loan.repayment.loan.details.interest", "pln.loan.repayment.loan.details.penalty");
        int i = 0;
        for (Object next : m) {
            int i2 = i + 1;
            if (i < 0) {
                C41341q.m119917t();
            }
            BigDecimal bigDecimal = (BigDecimal) next;
            if (C37603j.m110583f(bigDecimal)) {
                String bigDecimal2 = bigDecimal.toString();
                C41536l.m120488h(bigDecimal2, "number.toString()");
                arrayList.add(new RepaymentDetailsUiModel((String) m2.get(i), C32343x.m95406O(C37603j.m110581d(bigDecimal2), pawnLoanPayment.mo74037e()), false));
            }
            i = i2;
        }
        return arrayList;
    }

    /* renamed from: b */
    public final PaymentResultData mo88955b(LoansFlow.PawnLoanPayment pawnLoanPayment, String str) {
        C41536l.m120489i(pawnLoanPayment, "pawnLoanData");
        C41536l.m120489i(str, "input");
        StringSource.Dictionary dictionary = new StringSource.Dictionary(pawnLoanPayment.mo74043i(), (Boolean) null, (List) null, 6, (DefaultConstructorMarker) null);
        String F = C32343x.m95388F("pln.loan.payment.result.paid.amount", new Object[0]);
        String N = C32359z0.m95543N(C37603j.m110580c(str));
        C41536l.m120488h(N, "getFormatedAmountFromTet…s()\n                    )");
        return new PaymentResultData(dictionary, (String) null, false, false, C41339p.m119900e(new RepaymentDetailsUiModel(F, C32343x.m95406O(N, pawnLoanPayment.mo74037e()), false)), 8, (DefaultConstructorMarker) null);
    }
}
