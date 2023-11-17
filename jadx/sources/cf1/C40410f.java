package cf1;

import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41536l;
import ze1.C43420e;

/* renamed from: cf1.f */
public final class C40410f {

    /* renamed from: a */
    private final String f96007a;

    /* renamed from: b */
    private final C43420e f96008b;

    public C40410f(String str, C43420e eVar) {
        C41536l.m120489i(str, C11755a.C11756a.f34100b);
        C41536l.m120489i(eVar, "range");
        this.f96007a = str;
        this.f96008b = eVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40410f)) {
            return false;
        }
        C40410f fVar = (C40410f) obj;
        return C41536l.m120484d(this.f96007a, fVar.f96007a) && C41536l.m120484d(this.f96008b, fVar.f96008b);
    }

    public int hashCode() {
        return (this.f96007a.hashCode() * 31) + this.f96008b.hashCode();
    }

    public String toString() {
        return "MatchGroup(value=" + this.f96007a + ", range=" + this.f96008b + ')';
    }
}
