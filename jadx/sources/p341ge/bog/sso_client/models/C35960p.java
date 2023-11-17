package p341ge.bog.sso_client.models;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.sso_client.models.p */
public final class C35960p {

    /* renamed from: a */
    private final List f87000a;

    /* renamed from: b */
    private final BigDecimal f87001b;

    /* renamed from: c */
    private final BigDecimal f87002c;

    public C35960p(List list, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        C41536l.m120489i(list, "contacts");
        C41536l.m120489i(bigDecimal, "maxChooseLimit");
        C41536l.m120489i(bigDecimal2, "timeLimit");
        this.f87000a = list;
        this.f87001b = bigDecimal;
        this.f87002c = bigDecimal2;
    }

    /* renamed from: a */
    public final List mo88543a() {
        return this.f87000a;
    }

    /* renamed from: b */
    public final BigDecimal mo88544b() {
        return this.f87001b;
    }

    /* renamed from: c */
    public final BigDecimal mo88545c() {
        return this.f87002c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35960p)) {
            return false;
        }
        C35960p pVar = (C35960p) obj;
        return C41536l.m120484d(this.f87000a, pVar.f87000a) && C41536l.m120484d(this.f87001b, pVar.f87001b) && C41536l.m120484d(this.f87002c, pVar.f87002c);
    }

    public int hashCode() {
        return (((this.f87000a.hashCode() * 31) + this.f87001b.hashCode()) * 31) + this.f87002c.hashCode();
    }

    public String toString() {
        return "SelectContactsConfig(contacts=" + this.f87000a + ", maxChooseLimit=" + this.f87001b + ", timeLimit=" + this.f87002c + ')';
    }
}
