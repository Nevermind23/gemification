package j71;

import java.util.HashMap;
import kotlin.jvm.internal.C41536l;

/* renamed from: j71.h */
public final class C36755h {

    /* renamed from: a */
    private final String f88707a;

    /* renamed from: b */
    private final HashMap f88708b;

    public C36755h(String str, HashMap hashMap) {
        C41536l.m120489i(str, "service");
        C41536l.m120489i(hashMap, "parameters");
        this.f88707a = str;
        this.f88708b = hashMap;
    }

    /* renamed from: a */
    public final HashMap mo89634a() {
        return this.f88708b;
    }

    /* renamed from: b */
    public final String mo89635b() {
        return this.f88707a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36755h)) {
            return false;
        }
        C36755h hVar = (C36755h) obj;
        return C41536l.m120484d(this.f88707a, hVar.f88707a) && C41536l.m120484d(this.f88708b, hVar.f88708b);
    }

    public int hashCode() {
        return (this.f88707a.hashCode() * 31) + this.f88708b.hashCode();
    }

    public String toString() {
        String str = this.f88707a;
        HashMap hashMap = this.f88708b;
        return "ScaParamPair(service=" + str + ", parameters=" + hashMap + ")";
    }
}
