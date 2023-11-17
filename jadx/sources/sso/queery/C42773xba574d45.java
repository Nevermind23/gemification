package sso.queery;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p243s2.C8124o;
import sso.queery.GetUserContactsQuery;
import ue1.C43075l;

/* renamed from: sso.queery.GetUserContactsQuery$CommonServices$Companion$invoke$1$getUserContacts$1 */
final class C42773xba574d45 extends C41537m implements C43075l {
    public static final C42773xba574d45 INSTANCE = new C42773xba574d45();

    C42773xba574d45() {
        super(1);
    }

    public final GetUserContactsQuery.GetUserContact invoke(C8124o.C8129b bVar) {
        C41536l.m120489i(bVar, "reader");
        return (GetUserContactsQuery.GetUserContact) bVar.mo19033b(C427741.INSTANCE);
    }
}
