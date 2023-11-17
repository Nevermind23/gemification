package sso.queery;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p243s2.C8124o;
import sso.queery.GetClientInfoQuery;
import ue1.C43075l;

/* renamed from: sso.queery.GetClientInfoQuery$GetClientInfo$Companion$invoke$1$clientContacts$1 */
final class C42633x90221252 extends C41537m implements C43075l {
    public static final C42633x90221252 INSTANCE = new C42633x90221252();

    C42633x90221252() {
        super(1);
    }

    public final GetClientInfoQuery.ClientContact invoke(C8124o.C8129b bVar) {
        C41536l.m120489i(bVar, "reader");
        return (GetClientInfoQuery.ClientContact) bVar.mo19033b(C426341.INSTANCE);
    }
}
