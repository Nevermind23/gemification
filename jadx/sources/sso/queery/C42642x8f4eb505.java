package sso.queery;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p243s2.C8124o;
import sso.queery.GetCountryCodesQuery;
import ue1.C43075l;

/* renamed from: sso.queery.GetCountryCodesQuery$CommonServices$Companion$invoke$1$getCountryCodes$1 */
final class C42642x8f4eb505 extends C41537m implements C43075l {
    public static final C42642x8f4eb505 INSTANCE = new C42642x8f4eb505();

    C42642x8f4eb505() {
        super(1);
    }

    public final GetCountryCodesQuery.GetCountryCode invoke(C8124o.C8129b bVar) {
        C41536l.m120489i(bVar, "reader");
        return (GetCountryCodesQuery.GetCountryCode) bVar.mo19033b(C426431.INSTANCE);
    }
}
