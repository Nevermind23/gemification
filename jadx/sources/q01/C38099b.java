package q01;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: q01.b */
public final class C38099b {

    /* renamed from: a */
    private final C38098a f91509a;

    /* renamed from: b */
    private final List f91510b;

    public C38099b(C38098a aVar, List list) {
        C41536l.m120489i(list, "cards");
        this.f91509a = aVar;
        this.f91510b = list;
    }

    /* renamed from: a */
    public final List mo91522a() {
        return this.f91510b;
    }

    /* renamed from: b */
    public final C38098a mo91523b() {
        return this.f91509a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38099b)) {
            return false;
        }
        C38099b bVar = (C38099b) obj;
        return this.f91509a == bVar.f91509a && C41536l.m120484d(this.f91510b, bVar.f91510b);
    }

    public int hashCode() {
        C38098a aVar = this.f91509a;
        return ((aVar == null ? 0 : aVar.hashCode()) * 31) + this.f91510b.hashCode();
    }

    public String toString() {
        C38098a aVar = this.f91509a;
        List list = this.f91510b;
        return "CardChooserUiState(error=" + aVar + ", cards=" + list + ")";
    }
}
