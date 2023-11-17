package za1;

import ed1.C40734b;
import kotlin.jvm.internal.C41536l;
import sso.type.ContactType;
import ya1.C40042a;

/* renamed from: za1.a */
public final class C40218a {

    /* renamed from: a */
    private final C40042a f95596a;

    public C40218a(C40042a aVar) {
        C41536l.m120489i(aVar, "repository");
        this.f95596a = aVar;
    }

    /* renamed from: a */
    public final C40734b mo94172a(String str, ContactType contactType, String str2, String str3, String str4) {
        C41536l.m120489i(str, "contact");
        C41536l.m120489i(contactType, "contactType");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "otp");
        C41536l.m120489i(str4, "operationId");
        return this.f95596a.mo93282g(str, contactType, str2, str3, str4);
    }
}
