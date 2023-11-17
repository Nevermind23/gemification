package j31;

import kotlin.jvm.internal.C41536l;

/* renamed from: j31.c */
public final class C36727c {

    /* renamed from: a */
    private final String f88627a;

    /* renamed from: b */
    private final String f88628b;

    public C36727c(String str, String str2) {
        C41536l.m120489i(str, "key");
        this.f88627a = str;
        this.f88628b = str2;
    }

    /* renamed from: a */
    public final String mo89551a() {
        return this.f88627a;
    }

    /* renamed from: b */
    public final String mo89552b() {
        return this.f88628b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36727c)) {
            return false;
        }
        C36727c cVar = (C36727c) obj;
        return C41536l.m120484d(this.f88627a, cVar.f88627a) && C41536l.m120484d(this.f88628b, cVar.f88628b);
    }

    public int hashCode() {
        int hashCode = this.f88627a.hashCode() * 31;
        String str = this.f88628b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f88627a;
        String str2 = this.f88628b;
        return "UrlParam(key=" + str + ", value=" + str2 + ")";
    }
}
