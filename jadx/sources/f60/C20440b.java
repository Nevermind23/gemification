package f60;

import f60.C20444f;
import kotlin.jvm.internal.C41536l;

/* renamed from: f60.b */
public final class C20440b implements C20444f {

    /* renamed from: a */
    private final C20444f.C20445a f55421a;

    public C20440b(C20444f.C20445a aVar) {
        C41536l.m120489i(aVar, "itemType");
        this.f55421a = aVar;
    }

    /* renamed from: a */
    public C20444f.C20445a mo48943a() {
        return this.f55421a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20440b) && this.f55421a == ((C20440b) obj).f55421a;
    }

    public int hashCode() {
        return this.f55421a.hashCode();
    }

    public String toString() {
        C20444f.C20445a aVar = this.f55421a;
        return "SimpleTPItem(itemType=" + aVar + ")";
    }
}
