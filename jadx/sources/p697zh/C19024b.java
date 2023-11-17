package p697zh;

import kotlin.jvm.internal.C41536l;
import p697zh.C19025c;

/* renamed from: zh.b */
public final class C19024b {

    /* renamed from: a */
    private final String f53146a;

    /* renamed from: b */
    private final C19025c.C19026a f53147b;

    public C19024b(String str, C19025c.C19026a aVar) {
        C41536l.m120489i(str, "message");
        C41536l.m120489i(aVar, "type");
        this.f53146a = str;
        this.f53147b = aVar;
    }

    /* renamed from: a */
    public final String mo47203a() {
        return this.f53146a;
    }

    /* renamed from: b */
    public final C19025c.C19026a mo47204b() {
        return this.f53147b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19024b)) {
            return false;
        }
        C19024b bVar = (C19024b) obj;
        return C41536l.m120484d(this.f53146a, bVar.f53146a) && this.f53147b == bVar.f53147b;
    }

    public int hashCode() {
        return (this.f53146a.hashCode() * 31) + this.f53147b.hashCode();
    }

    public String toString() {
        String str = this.f53146a;
        C19025c.C19026a aVar = this.f53147b;
        return "DepositFeature(message=" + str + ", type=" + aVar + ")";
    }
}
