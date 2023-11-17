package u61;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: u61.b */
public final class C39034b {

    /* renamed from: a */
    private final long f93163a;

    /* renamed from: b */
    private final String f93164b;

    /* renamed from: c */
    private final String f93165c;

    /* renamed from: d */
    private final String f93166d;

    /* renamed from: e */
    private final Integer f93167e;

    /* renamed from: f */
    private final Object f93168f;

    public C39034b(long j, String str, String str2, String str3, Integer num, Object obj) {
        this.f93163a = j;
        this.f93164b = str;
        this.f93165c = str2;
        this.f93166d = str3;
        this.f93167e = num;
        this.f93168f = obj;
    }

    /* renamed from: a */
    public final Integer mo92708a() {
        return this.f93167e;
    }

    /* renamed from: b */
    public final String mo92709b() {
        return this.f93164b;
    }

    /* renamed from: c */
    public final String mo92710c() {
        return this.f93165c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39034b)) {
            return false;
        }
        C39034b bVar = (C39034b) obj;
        return this.f93163a == bVar.f93163a && C41536l.m120484d(this.f93164b, bVar.f93164b) && C41536l.m120484d(this.f93165c, bVar.f93165c) && C41536l.m120484d(this.f93166d, bVar.f93166d) && C41536l.m120484d(this.f93167e, bVar.f93167e) && C41536l.m120484d(this.f93168f, bVar.f93168f);
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f93163a) * 31;
        String str = this.f93164b;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f93165c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f93166d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f93167e;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Object obj = this.f93168f;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        long j = this.f93163a;
        String str = this.f93164b;
        String str2 = this.f93165c;
        String str3 = this.f93166d;
        Integer num = this.f93167e;
        Object obj = this.f93168f;
        return "TemplateParameter(id=" + j + ", parameterKey=" + str + ", parameterValue=" + str2 + ", parameterType=" + str3 + ", parameterIndex=" + num + ", verifyParameterData=" + obj + ")";
    }
}
