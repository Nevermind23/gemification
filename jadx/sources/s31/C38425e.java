package s31;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: s31.e */
public final class C38425e {

    /* renamed from: a */
    private final String f92063a;

    /* renamed from: b */
    private final String f92064b;

    /* renamed from: c */
    private final String f92065c;

    /* renamed from: d */
    private final String f92066d;

    /* renamed from: e */
    private final Boolean f92067e;

    /* renamed from: f */
    private final Boolean f92068f;

    /* renamed from: g */
    private final Boolean f92069g;

    /* renamed from: h */
    private final List f92070h;

    public C38425e(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, Boolean bool3, List list) {
        C41536l.m120489i(str, "id");
        this.f92063a = str;
        this.f92064b = str2;
        this.f92065c = str3;
        this.f92066d = str4;
        this.f92067e = bool;
        this.f92068f = bool2;
        this.f92069g = bool3;
        this.f92070h = list;
    }

    /* renamed from: a */
    public final String mo91984a() {
        return this.f92063a;
    }

    /* renamed from: b */
    public final List mo91985b() {
        return this.f92070h;
    }

    /* renamed from: c */
    public final Boolean mo91986c() {
        return this.f92067e;
    }

    /* renamed from: d */
    public final String mo91987d() {
        return this.f92065c;
    }

    /* renamed from: e */
    public final String mo91988e() {
        return this.f92064b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38425e)) {
            return false;
        }
        C38425e eVar = (C38425e) obj;
        return C41536l.m120484d(this.f92063a, eVar.f92063a) && C41536l.m120484d(this.f92064b, eVar.f92064b) && C41536l.m120484d(this.f92065c, eVar.f92065c) && C41536l.m120484d(this.f92066d, eVar.f92066d) && C41536l.m120484d(this.f92067e, eVar.f92067e) && C41536l.m120484d(this.f92068f, eVar.f92068f) && C41536l.m120484d(this.f92069g, eVar.f92069g) && C41536l.m120484d(this.f92070h, eVar.f92070h);
    }

    /* renamed from: f */
    public final Boolean mo91990f() {
        return this.f92068f;
    }

    /* renamed from: g */
    public final Boolean mo91991g() {
        return this.f92069g;
    }

    public int hashCode() {
        int hashCode = this.f92063a.hashCode() * 31;
        String str = this.f92064b;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f92065c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f92066d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f92067e;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f92068f;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f92069g;
        int hashCode7 = (hashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        List list = this.f92070h;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        String str = this.f92063a;
        String str2 = this.f92064b;
        String str3 = this.f92065c;
        String str4 = this.f92066d;
        Boolean bool = this.f92067e;
        Boolean bool2 = this.f92068f;
        Boolean bool3 = this.f92069g;
        List list = this.f92070h;
        return "PaymentServiceConfigParameter(id=" + str + ", paramType=" + str2 + ", name=" + str3 + ", description=" + str4 + ", mandatory=" + bool + ", successParam=" + bool2 + ", isHidden=" + bool3 + ", input=" + list + ")";
    }
}
