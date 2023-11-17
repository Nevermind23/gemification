package x70;

import k80.C25685a;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.consumerloanapplication.data.creditinfo.entity.CreditInfoStatusEntity;

/* renamed from: x70.a */
public abstract class C29656a {
    /* renamed from: a */
    public static final C25685a m89993a(CreditInfoStatusEntity creditInfoStatusEntity) {
        C41536l.m120489i(creditInfoStatusEntity, "<this>");
        return new C25685a(creditInfoStatusEntity.getServiceKey(), creditInfoStatusEntity.getServiceStatus());
    }
}
