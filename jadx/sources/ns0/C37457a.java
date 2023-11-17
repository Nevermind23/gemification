package ns0;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccount;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccountItem;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccounts;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferExternalFile;
import p341ge.bog.mobilebank.model.RepaymentAccount;
import w31.C39513a;

/* renamed from: ns0.a */
public final class C37457a {

    /* renamed from: a */
    private final C39513a f90056a;

    public C37457a(C39513a aVar) {
        C41536l.m120489i(aVar, "accountsMapper");
        this.f90056a = aVar;
    }

    /* renamed from: a */
    public final List mo90589a(TransferAccounts transferAccounts, List list, String str) {
        List list2;
        TransferAccountItem transferAccountItem;
        Object obj;
        boolean z;
        List list3 = list;
        String str2 = str;
        C41536l.m120489i(transferAccounts, "accounts");
        C41536l.m120489i(list3, "repaymentAccounts");
        C41536l.m120489i(str2, "mainCurrency");
        TransferAccount b = transferAccounts.mo52162b();
        if (b == null || (list2 = b.mo52123b()) == null) {
            list2 = C41341q.m119907j();
        }
        ArrayList<TransferAccountItem> arrayList = new ArrayList<>();
        for (Object next : list2) {
            TransferAccountItem transferAccountItem2 = (TransferAccountItem) next;
            boolean z2 = false;
            if (!(list3 instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((RepaymentAccount) it.next()).getMainAcctKey() == transferAccountItem2.mo52147p()) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (z) {
                            z2 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z2) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (TransferAccountItem transferAccountItem3 : arrayList) {
            Iterator it2 = transferAccountItem3.mo52151t().iterator();
            while (true) {
                transferAccountItem = null;
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (C41536l.m120484d(((TransferAccountItem) obj).mo52142i(), str2)) {
                    break;
                }
            }
            TransferAccountItem transferAccountItem4 = (TransferAccountItem) obj;
            if (transferAccountItem4 != null) {
                transferAccountItem = TransferAccountItem.m68075b(transferAccountItem4, false, false, 0, (String) null, (String) null, (String) null, (BigDecimal) null, 0, (BigDecimal) null, false, (String) null, false, (String) null, (List) null, (String) null, transferAccountItem3.mo52143j(), (TransferExternalFile) null, (TransferExternalFile) null, 229375, (Object) null);
            }
            if (transferAccountItem != null) {
                arrayList2.add(transferAccountItem);
            }
        }
        return this.f90056a.mo93147b(arrayList2, list2);
    }
}
