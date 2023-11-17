package p970zw;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: zw.a */
public final class C30412a {

    /* renamed from: a */
    private final long f76400a;

    /* renamed from: b */
    private final long f76401b;

    /* renamed from: c */
    private final String f76402c;

    /* renamed from: d */
    private final String f76403d;

    /* renamed from: e */
    private final String f76404e;

    /* renamed from: f */
    private String f76405f;

    /* renamed from: g */
    private final String f76406g;

    /* renamed from: h */
    private final String f76407h;

    /* renamed from: i */
    private final List f76408i;

    public C30412a(long j, long j2, String str, String str2, String str3, String str4, String str5, String str6, List list) {
        C41536l.m120489i(str, "langCode");
        C41536l.m120489i(str2, "pointType");
        C41536l.m120489i(str3, "pointValue");
        C41536l.m120489i(str5, "hasSoloSc");
        C41536l.m120489i(str6, "customerType");
        this.f76400a = j;
        this.f76401b = j2;
        this.f76402c = str;
        this.f76403d = str2;
        this.f76404e = str3;
        this.f76405f = str4;
        this.f76406g = str5;
        this.f76407h = str6;
        this.f76408i = list;
    }

    /* renamed from: a */
    public final String mo70759a() {
        return this.f76407h;
    }

    /* renamed from: b */
    public final String mo70760b() {
        return this.f76406g;
    }

    /* renamed from: c */
    public final long mo70761c() {
        return this.f76400a;
    }

    /* renamed from: d */
    public final String mo70762d() {
        return this.f76402c;
    }

    /* renamed from: e */
    public final long mo70763e() {
        return this.f76401b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30412a)) {
            return false;
        }
        C30412a aVar = (C30412a) obj;
        return this.f76400a == aVar.f76400a && this.f76401b == aVar.f76401b && C41536l.m120484d(this.f76402c, aVar.f76402c) && C41536l.m120484d(this.f76403d, aVar.f76403d) && C41536l.m120484d(this.f76404e, aVar.f76404e) && C41536l.m120484d(this.f76405f, aVar.f76405f) && C41536l.m120484d(this.f76406g, aVar.f76406g) && C41536l.m120484d(this.f76407h, aVar.f76407h) && C41536l.m120484d(this.f76408i, aVar.f76408i);
    }

    /* renamed from: f */
    public final String mo70765f() {
        return this.f76405f;
    }

    /* renamed from: g */
    public final String mo70766g() {
        return this.f76403d;
    }

    /* renamed from: h */
    public final String mo70767h() {
        return this.f76404e;
    }

    public int hashCode() {
        int a = ((((((((C7397t.m28148a(this.f76400a) * 31) + C7397t.m28148a(this.f76401b)) * 31) + this.f76402c.hashCode()) * 31) + this.f76403d.hashCode()) * 31) + this.f76404e.hashCode()) * 31;
        String str = this.f76405f;
        int i = 0;
        int hashCode = (((((a + (str == null ? 0 : str.hashCode())) * 31) + this.f76406g.hashCode()) * 31) + this.f76407h.hashCode()) * 31;
        List list = this.f76408i;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: i */
    public final List mo70769i() {
        return this.f76408i;
    }

    public String toString() {
        long j = this.f76400a;
        long j2 = this.f76401b;
        String str = this.f76402c;
        String str2 = this.f76403d;
        String str3 = this.f76404e;
        String str4 = this.f76405f;
        String str5 = this.f76406g;
        String str6 = this.f76407h;
        List list = this.f76408i;
        return "ServiceCenter(id=" + j + ", parentId=" + j2 + ", langCode=" + str + ", pointType=" + str2 + ", pointValue=" + str3 + ", pointDesc=" + str4 + ", hasSoloSc=" + str5 + ", customerType=" + str6 + ", points=" + list + ")";
    }
}
