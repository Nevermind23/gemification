package ao0;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ao0.d */
public final class C10123d {

    /* renamed from: a */
    private final long f28013a;

    /* renamed from: b */
    private final String f28014b;

    /* renamed from: c */
    private final String f28015c;

    /* renamed from: d */
    private final String f28016d;

    /* renamed from: e */
    private final String f28017e;

    /* renamed from: f */
    private final List f28018f;

    public C10123d(long j, String str, String str2, String str3, String str4, List list) {
        C41536l.m120489i(str, "categoryDescGe");
        C41536l.m120489i(str2, "categoryDescEn");
        C41536l.m120489i(list, "offers");
        this.f28013a = j;
        this.f28014b = str;
        this.f28015c = str2;
        this.f28016d = str3;
        this.f28017e = str4;
        this.f28018f = list;
    }

    /* renamed from: a */
    public final String mo26613a() {
        return this.f28015c;
    }

    /* renamed from: b */
    public final String mo26614b() {
        return this.f28014b;
    }

    /* renamed from: c */
    public final String mo26615c() {
        return this.f28016d;
    }

    /* renamed from: d */
    public final long mo26616d() {
        return this.f28013a;
    }

    /* renamed from: e */
    public final String mo26617e() {
        return this.f28017e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10123d)) {
            return false;
        }
        C10123d dVar = (C10123d) obj;
        return this.f28013a == dVar.f28013a && C41536l.m120484d(this.f28014b, dVar.f28014b) && C41536l.m120484d(this.f28015c, dVar.f28015c) && C41536l.m120484d(this.f28016d, dVar.f28016d) && C41536l.m120484d(this.f28017e, dVar.f28017e) && C41536l.m120484d(this.f28018f, dVar.f28018f);
    }

    /* renamed from: f */
    public final List mo26619f() {
        return this.f28018f;
    }

    public int hashCode() {
        int a = ((((C7397t.m28148a(this.f28013a) * 31) + this.f28014b.hashCode()) * 31) + this.f28015c.hashCode()) * 31;
        String str = this.f28016d;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f28017e;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode + i) * 31) + this.f28018f.hashCode();
    }

    public String toString() {
        long j = this.f28013a;
        String str = this.f28014b;
        String str2 = this.f28015c;
        String str3 = this.f28016d;
        String str4 = this.f28017e;
        List list = this.f28018f;
        return "LifestyleOfferCategory(categoryId=" + j + ", categoryDescGe=" + str + ", categoryDescEn=" + str2 + ", categoryIconUrl=" + str3 + ", categoryImageUrl=" + str4 + ", offers=" + list + ")";
    }
}
