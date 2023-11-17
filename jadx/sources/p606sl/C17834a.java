package p606sl;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: sl.a */
public final class C17834a {

    /* renamed from: a */
    private long f50720a;

    /* renamed from: b */
    private String f50721b;

    /* renamed from: c */
    private String f50722c;

    /* renamed from: d */
    private String f50723d;

    public C17834a(long j, String str, String str2, String str3) {
        C41536l.m120489i(str, "categoryDesc");
        C41536l.m120489i(str2, "categoryDescEn");
        C41536l.m120489i(str3, "categoryNameKey");
        this.f50720a = j;
        this.f50721b = str;
        this.f50722c = str2;
        this.f50723d = str3;
    }

    /* renamed from: a */
    public final String mo45421a() {
        return this.f50721b;
    }

    /* renamed from: b */
    public final String mo45422b() {
        return this.f50722c;
    }

    /* renamed from: c */
    public final long mo45423c() {
        return this.f50720a;
    }

    /* renamed from: d */
    public final String mo45424d() {
        return this.f50723d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17834a)) {
            return false;
        }
        C17834a aVar = (C17834a) obj;
        return this.f50720a == aVar.f50720a && C41536l.m120484d(this.f50721b, aVar.f50721b) && C41536l.m120484d(this.f50722c, aVar.f50722c) && C41536l.m120484d(this.f50723d, aVar.f50723d);
    }

    public int hashCode() {
        return (((((C7397t.m28148a(this.f50720a) * 31) + this.f50721b.hashCode()) * 31) + this.f50722c.hashCode()) * 31) + this.f50723d.hashCode();
    }

    public String toString() {
        long j = this.f50720a;
        String str = this.f50721b;
        String str2 = this.f50722c;
        String str3 = this.f50723d;
        return "BnplCategory(categoryId=" + j + ", categoryDesc=" + str + ", categoryDescEn=" + str2 + ", categoryNameKey=" + str3 + ")";
    }
}
