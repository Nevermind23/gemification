package ul0;

import kotlin.jvm.internal.C41536l;

/* renamed from: ul0.a */
public final class C28874a {

    /* renamed from: a */
    private final String f73704a;

    /* renamed from: b */
    private final String f73705b;

    /* renamed from: c */
    private final String f73706c;

    /* renamed from: d */
    private final Boolean f73707d;

    public C28874a(String str, String str2, String str3, Boolean bool) {
        this.f73704a = str;
        this.f73705b = str2;
        this.f73706c = str3;
        this.f73707d = bool;
    }

    /* renamed from: a */
    public final String mo68601a() {
        return this.f73705b;
    }

    /* renamed from: b */
    public final Boolean mo68602b() {
        return this.f73707d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28874a)) {
            return false;
        }
        C28874a aVar = (C28874a) obj;
        return C41536l.m120484d(this.f73704a, aVar.f73704a) && C41536l.m120484d(this.f73705b, aVar.f73705b) && C41536l.m120484d(this.f73706c, aVar.f73706c) && C41536l.m120484d(this.f73707d, aVar.f73707d);
    }

    public int hashCode() {
        String str = this.f73704a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f73705b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f73706c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f73707d;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        String str = this.f73704a;
        String str2 = this.f73705b;
        String str3 = this.f73706c;
        Boolean bool = this.f73707d;
        return "AdditionalCoverage(category=" + str + ", name=" + str2 + ", limit=" + str3 + ", isCovered=" + bool + ")";
    }
}
