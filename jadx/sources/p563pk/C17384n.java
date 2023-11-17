package p563pk;

import java.util.HashMap;
import kotlin.jvm.internal.C41536l;

/* renamed from: pk.n */
public final class C17384n {

    /* renamed from: a */
    private final String f48777a;

    /* renamed from: b */
    private final HashMap f48778b;

    public C17384n(String str, HashMap hashMap) {
        C41536l.m120489i(str, "service");
        C41536l.m120489i(hashMap, "parameters");
        this.f48777a = str;
        this.f48778b = hashMap;
    }

    /* renamed from: a */
    public final HashMap mo44889a() {
        return this.f48778b;
    }

    /* renamed from: b */
    public final String mo44890b() {
        return this.f48777a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17384n)) {
            return false;
        }
        C17384n nVar = (C17384n) obj;
        return C41536l.m120484d(this.f48777a, nVar.f48777a) && C41536l.m120484d(this.f48778b, nVar.f48778b);
    }

    public int hashCode() {
        return (this.f48777a.hashCode() * 31) + this.f48778b.hashCode();
    }

    public String toString() {
        String str = this.f48777a;
        HashMap hashMap = this.f48778b;
        return "ScaParamPair(service=" + str + ", parameters=" + hashMap + ")";
    }
}
