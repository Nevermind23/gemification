package xw0;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p277ua.C8664c;

/* renamed from: xw0.a */
public final class C39918a {
    @C8664c("H")

    /* renamed from: a */
    private final String f94671a;
    @C8664c("L")

    /* renamed from: b */
    private final List<C39919b> f94672b;

    public C39918a(String str, List list) {
        C41536l.m120489i(str, "hashCode");
        C41536l.m120489i(list, "configs");
        this.f94671a = str;
        this.f94672b = list;
    }

    /* renamed from: a */
    public final List mo93611a() {
        return this.f94672b;
    }

    /* renamed from: b */
    public final String mo93612b() {
        return this.f94671a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39918a)) {
            return false;
        }
        C39918a aVar = (C39918a) obj;
        return C41536l.m120484d(this.f94671a, aVar.f94671a) && C41536l.m120484d(this.f94672b, aVar.f94672b);
    }

    public int hashCode() {
        return (this.f94671a.hashCode() * 31) + this.f94672b.hashCode();
    }

    public String toString() {
        String str = this.f94671a;
        List<C39919b> list = this.f94672b;
        return "PaymentConfigLocalData(hashCode=" + str + ", configs=" + list + ")";
    }
}
