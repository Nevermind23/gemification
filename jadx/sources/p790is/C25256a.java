package p790is;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.creditapplicationdetails.entity.CreditApplicationEntity;
import p946xu.C29859a;

/* renamed from: is.a */
public abstract class C25256a {
    /* renamed from: a */
    public static final C29859a m80361a(CreditApplicationEntity creditApplicationEntity) {
        C41536l.m120489i(creditApplicationEntity, "<this>");
        return new C29859a(creditApplicationEntity.getAppId(), creditApplicationEntity.getAmount(), creditApplicationEntity.getCurrency(), creditApplicationEntity.getTerm(), creditApplicationEntity.getLoanAmount(), creditApplicationEntity.getLoanCurrency(), creditApplicationEntity.getCommissionAmt(), creditApplicationEntity.getSubProduct(), creditApplicationEntity.getCondition(), creditApplicationEntity.getRsDataApprovePhone());
    }
}
