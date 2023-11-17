package k51;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.mobilebank.model.usrinfo.ClientCategory;

/* renamed from: k51.c */
public final class C36875c {

    /* renamed from: a */
    private final long f88974a;

    /* renamed from: b */
    private final String f88975b;

    /* renamed from: c */
    private final long f88976c;

    /* renamed from: d */
    private final ClientCategory f88977d;

    public C36875c(long j, String str, long j2, ClientCategory clientCategory) {
        C41536l.m120489i(str, "clientIdCBS");
        C41536l.m120489i(clientCategory, "clientCategory");
        this.f88974a = j;
        this.f88975b = str;
        this.f88976c = j2;
        this.f88977d = clientCategory;
    }

    /* renamed from: a */
    public final ClientCategory mo89812a() {
        return this.f88977d;
    }

    /* renamed from: b */
    public final String mo89813b() {
        return this.f88975b;
    }

    /* renamed from: c */
    public final long mo89814c() {
        return this.f88976c;
    }

    /* renamed from: d */
    public final long mo89815d() {
        return this.f88974a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36875c)) {
            return false;
        }
        C36875c cVar = (C36875c) obj;
        return this.f88974a == cVar.f88974a && C41536l.m120484d(this.f88975b, cVar.f88975b) && this.f88976c == cVar.f88976c && this.f88977d == cVar.f88977d;
    }

    public int hashCode() {
        return (((((C7397t.m28148a(this.f88974a) * 31) + this.f88975b.hashCode()) * 31) + C7397t.m28148a(this.f88976c)) * 31) + this.f88977d.hashCode();
    }

    public String toString() {
        long j = this.f88974a;
        String str = this.f88975b;
        long j2 = this.f88976c;
        ClientCategory clientCategory = this.f88977d;
        return "UserDetails(userId=" + j + ", clientIdCBS=" + str + ", customerId=" + j2 + ", clientCategory=" + clientCategory + ")";
    }
}
