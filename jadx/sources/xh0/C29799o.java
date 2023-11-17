package xh0;

import kotlin.jvm.internal.C41536l;

/* renamed from: xh0.o */
public final class C29799o {

    /* renamed from: a */
    private final String f75455a;

    /* renamed from: b */
    private final Long f75456b;

    public C29799o(String str, Long l) {
        this.f75455a = str;
        this.f75456b = l;
    }

    /* renamed from: a */
    public final String mo70043a() {
        return this.f75455a;
    }

    /* renamed from: b */
    public final Long mo70044b() {
        return this.f75456b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29799o)) {
            return false;
        }
        C29799o oVar = (C29799o) obj;
        return C41536l.m120484d(this.f75455a, oVar.f75455a) && C41536l.m120484d(this.f75456b, oVar.f75456b);
    }

    public int hashCode() {
        String str = this.f75455a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.f75456b;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.f75455a;
        Long l = this.f75456b;
        return "OfferExpiration(afterPurchaseDays=" + str + ", fixedDate=" + l + ")";
    }
}
