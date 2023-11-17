package s31;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: s31.d */
public final class C38424d {

    /* renamed from: a */
    private final String f92056a;

    /* renamed from: b */
    private final String f92057b;

    /* renamed from: c */
    private final String f92058c;

    /* renamed from: d */
    private final String f92059d;

    /* renamed from: e */
    private final String f92060e;

    /* renamed from: f */
    private final String f92061f;

    /* renamed from: g */
    private final List f92062g;

    public C38424d(String str, String str2, String str3, String str4, String str5, String str6, List list) {
        C41536l.m120489i(str, "id");
        this.f92056a = str;
        this.f92057b = str2;
        this.f92058c = str3;
        this.f92059d = str4;
        this.f92060e = str5;
        this.f92061f = str6;
        this.f92062g = list;
    }

    /* renamed from: a */
    public final List mo91979a() {
        return this.f92062g;
    }

    /* renamed from: b */
    public final String mo91980b() {
        return this.f92061f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38424d)) {
            return false;
        }
        C38424d dVar = (C38424d) obj;
        return C41536l.m120484d(this.f92056a, dVar.f92056a) && C41536l.m120484d(this.f92057b, dVar.f92057b) && C41536l.m120484d(this.f92058c, dVar.f92058c) && C41536l.m120484d(this.f92059d, dVar.f92059d) && C41536l.m120484d(this.f92060e, dVar.f92060e) && C41536l.m120484d(this.f92061f, dVar.f92061f) && C41536l.m120484d(this.f92062g, dVar.f92062g);
    }

    public int hashCode() {
        int hashCode = this.f92056a.hashCode() * 31;
        String str = this.f92057b;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f92058c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f92059d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f92060e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f92061f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List list = this.f92062g;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        String str = this.f92056a;
        String str2 = this.f92057b;
        String str3 = this.f92058c;
        String str4 = this.f92059d;
        String str5 = this.f92060e;
        String str6 = this.f92061f;
        List list = this.f92062g;
        return "PaymentServiceConfigJson(id=" + str + ", name=" + str2 + ", description=" + str3 + ", logo=" + str4 + ", logoSmall=" + str5 + ", type=" + str6 + ", parameter=" + list + ")";
    }
}
