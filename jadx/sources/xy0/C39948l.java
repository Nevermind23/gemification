package xy0;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: xy0.l */
public final class C39948l {

    /* renamed from: a */
    private final C39942f f94826a;

    /* renamed from: b */
    private final List f94827b;

    /* renamed from: c */
    private final List f94828c;

    public C39948l(C39942f fVar, List list, List list2) {
        C41536l.m120489i(fVar, "cardsContainer");
        C41536l.m120489i(list, "billInfo");
        C41536l.m120489i(list2, "details");
        this.f94826a = fVar;
        this.f94827b = list;
        this.f94828c = list2;
    }

    /* renamed from: a */
    public final List mo93734a() {
        return this.f94827b;
    }

    /* renamed from: b */
    public final C39942f mo93735b() {
        return this.f94826a;
    }

    /* renamed from: c */
    public final List mo93736c() {
        return this.f94828c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39948l)) {
            return false;
        }
        C39948l lVar = (C39948l) obj;
        return C41536l.m120484d(this.f94826a, lVar.f94826a) && C41536l.m120484d(this.f94827b, lVar.f94827b) && C41536l.m120484d(this.f94828c, lVar.f94828c);
    }

    public int hashCode() {
        return (((this.f94826a.hashCode() * 31) + this.f94827b.hashCode()) * 31) + this.f94828c.hashCode();
    }

    public String toString() {
        C39942f fVar = this.f94826a;
        List list = this.f94827b;
        List list2 = this.f94828c;
        return "CreditCardsWrapper(cardsContainer=" + fVar + ", billInfo=" + list + ", details=" + list2 + ")";
    }
}
