package p341ge.bog.sso_client.models;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.sso_client.models.q */
public final class C35961q {

    /* renamed from: a */
    private final List f87003a;

    /* renamed from: b */
    private final BigDecimal f87004b;

    /* renamed from: c */
    private final BigDecimal f87005c;

    public C35961q(List list, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        C41536l.m120489i(list, "contacts");
        C41536l.m120489i(bigDecimal, "maxChooseLimit");
        C41536l.m120489i(bigDecimal2, "timeLimit");
        this.f87003a = list;
        this.f87004b = bigDecimal;
        this.f87005c = bigDecimal2;
    }

    /* renamed from: a */
    public final List mo88549a() {
        return this.f87003a;
    }

    /* renamed from: b */
    public final BigDecimal mo88550b() {
        return this.f87004b;
    }

    /* renamed from: c */
    public final BigDecimal mo88551c() {
        return this.f87005c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35961q)) {
            return false;
        }
        C35961q qVar = (C35961q) obj;
        return C41536l.m120484d(this.f87003a, qVar.f87003a) && C41536l.m120484d(this.f87004b, qVar.f87004b) && C41536l.m120484d(this.f87005c, qVar.f87005c);
    }

    public int hashCode() {
        return (((this.f87003a.hashCode() * 31) + this.f87004b.hashCode()) * 31) + this.f87005c.hashCode();
    }

    public String toString() {
        return "SelectTransactionsConfig(contacts=" + this.f87003a + ", maxChooseLimit=" + this.f87004b + ", timeLimit=" + this.f87005c + ')';
    }
}
