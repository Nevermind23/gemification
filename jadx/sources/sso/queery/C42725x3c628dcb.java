package sso.queery;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p243s2.C8124o;
import sso.queery.GetRelatedCompaniesQuery;
import ue1.C43075l;

/* renamed from: sso.queery.GetRelatedCompaniesQuery$LoginServices$Companion$invoke$1$getRelatedCompanies$1 */
final class C42725x3c628dcb extends C41537m implements C43075l {
    public static final C42725x3c628dcb INSTANCE = new C42725x3c628dcb();

    C42725x3c628dcb() {
        super(1);
    }

    public final GetRelatedCompaniesQuery.GetRelatedCompany invoke(C8124o.C8129b bVar) {
        C41536l.m120489i(bVar, "reader");
        return (GetRelatedCompaniesQuery.GetRelatedCompany) bVar.mo19033b(C427261.INSTANCE);
    }
}
