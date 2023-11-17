package p816kz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccountItem;
import p341ge.bog.mobilebank.model.account.AccountLov;

/* renamed from: kz.b */
public final class C25795b {
    /* renamed from: a */
    private final AccountLov m81092a(TransferAccountItem transferAccountItem) {
        String str;
        AccountLov accountLov = new AccountLov();
        accountLov.setCreditCard(transferAccountItem.mo52153u());
        accountLov.setForCreditSTO(transferAccountItem.mo52155w());
        accountLov.setId(transferAccountItem.mo52146m());
        accountLov.setAcctNo(transferAccountItem.mo52134d());
        accountLov.setName(transferAccountItem.mo52148q());
        accountLov.setCcy(transferAccountItem.mo52142i());
        accountLov.setAvailableAmount(transferAccountItem.mo52139g());
        accountLov.setMainAcctKey(transferAccountItem.mo52147p());
        accountLov.setRealAmount(transferAccountItem.mo52150s());
        if (transferAccountItem.mo52154v()) {
            str = "Y";
        } else {
            str = "N";
        }
        accountLov.setIsDefault(str);
        accountLov.setAttachmentId(transferAccountItem.mo52136e());
        accountLov.setHasDeposit(transferAccountItem.mo52145l());
        accountLov.setAttachmentUrl(transferAccountItem.mo52138f());
        accountLov.setSubAccounts(new ArrayList(mo64418b(transferAccountItem.mo52151t())));
        accountLov.setProductCode(transferAccountItem.mo52149r());
        return accountLov;
    }

    /* renamed from: b */
    public final List mo64418b(List list) {
        C41536l.m120489i(list, "accts");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m81092a((TransferAccountItem) it.next()));
        }
        return arrayList;
    }
}
