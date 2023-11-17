package ql0;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccount;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccountItem;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccounts;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferExternalFile;
import w31.C39513a;

/* renamed from: ql0.a */
public final class C27845a {

    /* renamed from: a */
    private final C39513a f70978a;

    public C27845a(C39513a aVar) {
        C41536l.m120489i(aVar, "accountsMapper");
        this.f70978a = aVar;
    }

    /* renamed from: a */
    public final List mo67363a(TransferAccounts transferAccounts, String str) {
        List<TransferAccountItem> list;
        TransferAccountItem transferAccountItem;
        Object obj;
        String str2 = str;
        C41536l.m120489i(transferAccounts, "accounts");
        C41536l.m120489i(str2, "mainCurrency");
        TransferAccount a = transferAccounts.mo52161a();
        if (a == null || (list = a.mo52123b()) == null) {
            list = C41341q.m119907j();
        }
        ArrayList arrayList = new ArrayList();
        for (TransferAccountItem transferAccountItem2 : list) {
            Iterator it = transferAccountItem2.mo52151t().iterator();
            while (true) {
                transferAccountItem = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C41536l.m120484d(((TransferAccountItem) obj).mo52142i(), str2)) {
                    break;
                }
            }
            TransferAccountItem transferAccountItem3 = (TransferAccountItem) obj;
            if (transferAccountItem3 != null) {
                transferAccountItem = TransferAccountItem.m68075b(transferAccountItem3, false, false, 0, (String) null, (String) null, (String) null, (BigDecimal) null, 0, (BigDecimal) null, false, (String) null, false, (String) null, (List) null, (String) null, transferAccountItem2.mo52143j(), (TransferExternalFile) null, (TransferExternalFile) null, 229375, (Object) null);
            }
            if (transferAccountItem != null) {
                arrayList.add(transferAccountItem);
            }
        }
        return this.f70978a.mo93147b(arrayList, list);
    }
}
