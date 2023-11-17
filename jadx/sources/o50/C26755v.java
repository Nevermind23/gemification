package o50;

import kotlin.jvm.internal.C41536l;

/* renamed from: o50.v */
final class C26755v {

    /* renamed from: a */
    private final Long f67407a;

    public C26755v(Long l) {
        this.f67407a = l;
    }

    /* renamed from: a */
    public final Long mo65956a() {
        return this.f67407a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26755v) && C41536l.m120484d(this.f67407a, ((C26755v) obj).f67407a);
    }

    public int hashCode() {
        Long l = this.f67407a;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public String toString() {
        Long l = this.f67407a;
        return "JuniorRequest(requestId=" + l + ")";
    }
}
