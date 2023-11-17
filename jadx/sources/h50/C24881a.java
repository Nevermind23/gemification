package h50;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.model.account.AccountOperation;
import p341ge.bog.mobilebank.model.payment.PaymentProviderConfiguration;
import r90.C27954d;

/* renamed from: h50.a */
public abstract class C24881a {
    /* renamed from: a */
    public static final boolean m79530a(AccountOperation accountOperation) {
        C41536l.m120489i(accountOperation, "<this>");
        PaymentProviderConfiguration c = m79532c(accountOperation);
        if (c != null) {
            return c.isDDAllowed;
        }
        return accountOperation.isDDSTOAlllowed();
    }

    /* renamed from: b */
    public static final boolean m79531b(AccountOperation accountOperation) {
        C41536l.m120489i(accountOperation, "<this>");
        PaymentProviderConfiguration c = m79532c(accountOperation);
        if (c != null) {
            return c.isTemplateAccessAllowed;
        }
        return accountOperation.isTemplateAllowed();
    }

    /* renamed from: c */
    public static final PaymentProviderConfiguration m79532c(AccountOperation accountOperation) {
        C41536l.m120489i(accountOperation, "<this>");
        if (C41536l.m120484d(accountOperation.getPrintFormType(), "OUT_TRANSFER") || accountOperation.getEssServiceId() == null) {
            return null;
        }
        return C27954d.m86301g(accountOperation.getEssServiceId());
    }
}
