package hc0;

import bc0.C19369a;
import com.github.mikephil.charting.utils.Utils;
import g91.C32343x;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.Amount;
import p341ge.bog.mobilebank.deposits.presentation.model.depositbreak.C23233a;
import p341ge.bog.mobilebank.deposits.presentation.model.depositbreak.DepositBreakDetailItem;
import p341ge.bog.mobilebank.shared.cardaccountselector.presentation.model.CardAccountSelectorUiModel;

/* renamed from: hc0.a */
public final class C24973a {
    /* renamed from: b */
    private static final boolean m79815b(DepositBreakDetailItem depositBreakDetailItem, List list) {
        return list.add(depositBreakDetailItem);
    }

    /* renamed from: c */
    private static final boolean m79816c(DepositBreakDetailItem depositBreakDetailItem, List list) {
        return list.add(depositBreakDetailItem);
    }

    /* renamed from: e */
    private static final boolean m79817e(DepositBreakDetailItem depositBreakDetailItem, List list) {
        return list.add(depositBreakDetailItem);
    }

    /* renamed from: a */
    public final C23233a mo63375a(C19369a aVar) {
        double d;
        boolean z;
        C41536l.m120489i(aVar, "resources");
        String f = aVar.mo47574a().mo90671f();
        Number l = aVar.mo47574a().mo90678l();
        if (l != null) {
            d = l.doubleValue();
        } else {
            d = 0.0d;
        }
        List c = C41339p.m119898c();
        m79815b(new DepositBreakDetailItem.LostInterestWithBreak(d - aVar.mo47575b().mo91174c(), f), c);
        m79815b(new DepositBreakDetailItem.TotalAmountWithBreak(aVar.mo47575b().mo91172a(), f), c);
        List a = C41339p.m119896a(c);
        List c2 = C41339p.m119898c();
        DepositBreakDetailItem.AccruedAmountItem accruedAmountItem = new DepositBreakDetailItem.AccruedAmountItem(d, f);
        if (d <= Utils.DOUBLE_EPSILON) {
            z = true;
        } else {
            z = false;
        }
        DepositBreakDetailItem.AccruedAmountItem accruedAmountItem2 = (DepositBreakDetailItem.AccruedAmountItem) C32343x.m95409P0(accruedAmountItem, z);
        if (accruedAmountItem2 != null) {
            m79816c(accruedAmountItem2, c2);
        }
        m79816c(new DepositBreakDetailItem.TotalAmountWithoutBreak(aVar.mo47574a().mo90672g() + d, f), c2);
        return new C23233a(a, C41339p.m119896a(c2), new Amount(aVar.mo47575b().mo91172a(), f), new DepositBreakDetailItem.DepositAmountItem(aVar.mo47574a().mo90672g(), f));
    }

    /* renamed from: d */
    public final List mo63376d(C19369a aVar, CardAccountSelectorUiModel cardAccountSelectorUiModel) {
        String b;
        C41536l.m120489i(aVar, "resources");
        List c = C41339p.m119898c();
        String s = aVar.mo47574a().mo90685s();
        if (s == null) {
            s = C32343x.m95388F(aVar.mo47574a().mo90675i(), new Object[0]);
        }
        m79817e(new DepositBreakDetailItem.ClosedDeposit(s), c);
        if (!(cardAccountSelectorUiModel == null || (b = cardAccountSelectorUiModel.mo84204b()) == null)) {
            m79817e(new DepositBreakDetailItem.ClosedDepositAccount(b), c);
        }
        m79817e(new DepositBreakDetailItem.ClosedDepositAmount(aVar.mo47575b().mo91172a(), aVar.mo47574a().mo90671f()), c);
        return C41339p.m119896a(c);
    }
}
