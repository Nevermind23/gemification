package xh0;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: xh0.a */
public final class C29780a {

    /* renamed from: a */
    private final long f75311a;

    /* renamed from: b */
    private final String f75312b;

    /* renamed from: c */
    private final String f75313c;

    /* renamed from: d */
    private final String f75314d;

    /* renamed from: e */
    private final String f75315e;

    /* renamed from: f */
    private final Boolean f75316f;

    /* renamed from: g */
    private final String f75317g;

    /* renamed from: h */
    private final List f75318h;

    /* renamed from: i */
    private final String f75319i;

    /* renamed from: j */
    private final String f75320j;

    /* renamed from: k */
    private final Boolean f75321k;

    /* renamed from: l */
    private final String f75322l;

    /* renamed from: m */
    private final Integer f75323m;

    /* renamed from: n */
    private final String f75324n;

    public C29780a(long j, String str, String str2, String str3, String str4, Boolean bool, String str5, List list, String str6, String str7, Boolean bool2, String str8, Integer num, String str9) {
        C41536l.m120489i(str, "fileId");
        C41536l.m120489i(str2, "fileUrl");
        this.f75311a = j;
        this.f75312b = str;
        this.f75313c = str2;
        this.f75314d = str3;
        this.f75315e = str4;
        this.f75316f = bool;
        this.f75317g = str5;
        this.f75318h = list;
        this.f75319i = str6;
        this.f75320j = str7;
        this.f75321k = bool2;
        this.f75322l = str8;
        this.f75323m = num;
        this.f75324n = str9;
    }

    /* renamed from: a */
    public final List mo69939a() {
        return this.f75318h;
    }

    /* renamed from: b */
    public final String mo69940b() {
        return this.f75319i;
    }

    /* renamed from: c */
    public final String mo69941c() {
        return this.f75313c;
    }

    /* renamed from: d */
    public final long mo69942d() {
        return this.f75311a;
    }

    /* renamed from: e */
    public final Boolean mo69943e() {
        return this.f75321k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29780a)) {
            return false;
        }
        C29780a aVar = (C29780a) obj;
        return this.f75311a == aVar.f75311a && C41536l.m120484d(this.f75312b, aVar.f75312b) && C41536l.m120484d(this.f75313c, aVar.f75313c) && C41536l.m120484d(this.f75314d, aVar.f75314d) && C41536l.m120484d(this.f75315e, aVar.f75315e) && C41536l.m120484d(this.f75316f, aVar.f75316f) && C41536l.m120484d(this.f75317g, aVar.f75317g) && C41536l.m120484d(this.f75318h, aVar.f75318h) && C41536l.m120484d(this.f75319i, aVar.f75319i) && C41536l.m120484d(this.f75320j, aVar.f75320j) && C41536l.m120484d(this.f75321k, aVar.f75321k) && C41536l.m120484d(this.f75322l, aVar.f75322l) && C41536l.m120484d(this.f75323m, aVar.f75323m) && C41536l.m120484d(this.f75324n, aVar.f75324n);
    }

    public int hashCode() {
        int a = ((((C7397t.m28148a(this.f75311a) * 31) + this.f75312b.hashCode()) * 31) + this.f75313c.hashCode()) * 31;
        String str = this.f75314d;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f75315e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f75316f;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.f75317g;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.f75318h;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.f75319i;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f75320j;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool2 = this.f75321k;
        int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str6 = this.f75322l;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.f75323m;
        int hashCode10 = (hashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        String str7 = this.f75324n;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode10 + i;
    }

    public String toString() {
        long j = this.f75311a;
        String str = this.f75312b;
        String str2 = this.f75313c;
        String str3 = this.f75314d;
        String str4 = this.f75315e;
        Boolean bool = this.f75316f;
        String str5 = this.f75317g;
        List list = this.f75318h;
        String str6 = this.f75319i;
        String str7 = this.f75320j;
        Boolean bool2 = this.f75321k;
        String str8 = this.f75322l;
        Integer num = this.f75323m;
        String str9 = this.f75324n;
        return "BffExternalFile(id=" + j + ", fileId=" + str + ", fileUrl=" + str2 + ", channelCode=" + str3 + ", customerType=" + str4 + ", darkMode=" + bool + ", directory=" + str5 + ", extensions=" + list + ", fileSubtype=" + str6 + ", fileType=" + str7 + ", isDark=" + bool2 + ", langCode=" + str8 + ", orderNo=" + num + ", status=" + str9 + ")";
    }
}
