package wp0;

import kotlin.jvm.internal.C41536l;

/* renamed from: wp0.e */
public final class C39633e {

    /* renamed from: a */
    private final String f94204a;

    /* renamed from: b */
    private final String f94205b;

    public C39633e(String str, String str2) {
        this.f94204a = str;
        this.f94205b = str2;
    }

    /* renamed from: a */
    public final String mo93339a() {
        return this.f94205b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39633e)) {
            return false;
        }
        C39633e eVar = (C39633e) obj;
        return C41536l.m120484d(this.f94204a, eVar.f94204a) && C41536l.m120484d(this.f94205b, eVar.f94205b);
    }

    public int hashCode() {
        String str = this.f94204a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f94205b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.f94204a;
        String str2 = this.f94205b;
        return "ParamInfo(parameterCode=" + str + ", parameterValue=" + str2 + ")";
    }
}
