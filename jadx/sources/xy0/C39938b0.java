package xy0;

import java.util.HashMap;
import kotlin.jvm.internal.C41536l;

/* renamed from: xy0.b0 */
public final class C39938b0 {

    /* renamed from: a */
    private final String f94752a;

    /* renamed from: b */
    private final HashMap f94753b;

    public C39938b0(String str, HashMap hashMap) {
        C41536l.m120489i(str, "service");
        C41536l.m120489i(hashMap, "parameters");
        this.f94752a = str;
        this.f94753b = hashMap;
    }

    /* renamed from: a */
    public final HashMap mo93673a() {
        return this.f94753b;
    }

    /* renamed from: b */
    public final String mo93674b() {
        return this.f94752a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39938b0)) {
            return false;
        }
        C39938b0 b0Var = (C39938b0) obj;
        return C41536l.m120484d(this.f94752a, b0Var.f94752a) && C41536l.m120484d(this.f94753b, b0Var.f94753b);
    }

    public int hashCode() {
        return (this.f94752a.hashCode() * 31) + this.f94753b.hashCode();
    }

    public String toString() {
        String str = this.f94752a;
        HashMap hashMap = this.f94753b;
        return "ScaParamPair(service=" + str + ", parameters=" + hashMap + ")";
    }
}
