package lb1;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.sso_client.models.UserContact;

/* renamed from: lb1.d */
public final class C37122d {

    /* renamed from: a */
    private final UserContact f89336a;

    /* renamed from: b */
    private final String f89337b;

    /* renamed from: c */
    private final boolean f89338c;

    public C37122d(UserContact userContact, String str, boolean z) {
        C41536l.m120489i(userContact, "contact");
        C41536l.m120489i(str, "operationReference");
        this.f89336a = userContact;
        this.f89337b = str;
        this.f89338c = z;
    }

    /* renamed from: a */
    public final UserContact mo90053a() {
        return this.f89336a;
    }

    /* renamed from: b */
    public final String mo90054b() {
        return this.f89337b;
    }

    /* renamed from: c */
    public final boolean mo90055c() {
        return this.f89338c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37122d)) {
            return false;
        }
        C37122d dVar = (C37122d) obj;
        return C41536l.m120484d(this.f89336a, dVar.f89336a) && C41536l.m120484d(this.f89337b, dVar.f89337b) && this.f89338c == dVar.f89338c;
    }

    public int hashCode() {
        int hashCode = ((this.f89336a.hashCode() * 31) + this.f89337b.hashCode()) * 31;
        boolean z = this.f89338c;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        return "PhoneApproveData(contact=" + this.f89336a + ", operationReference=" + this.f89337b + ", showEmailPopup=" + this.f89338c + ')';
    }
}
