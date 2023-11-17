package p633ul;

import kotlin.jvm.internal.C41536l;

/* renamed from: ul.d */
public final class C18181d {

    /* renamed from: a */
    private final int f51498a;

    /* renamed from: b */
    private final int f51499b;

    /* renamed from: c */
    private final String f51500c;

    /* renamed from: d */
    private final String f51501d;

    /* renamed from: e */
    private final String f51502e;

    public C18181d(int i, int i2, String str, String str2, String str3) {
        C41536l.m120489i(str, "titleText");
        C41536l.m120489i(str2, "descText");
        C41536l.m120489i(str3, "buttonText");
        this.f51498a = i;
        this.f51499b = i2;
        this.f51500c = str;
        this.f51501d = str2;
        this.f51502e = str3;
    }

    /* renamed from: a */
    public final String mo45842a() {
        return this.f51502e;
    }

    /* renamed from: b */
    public final String mo45843b() {
        return this.f51501d;
    }

    /* renamed from: c */
    public final int mo45844c() {
        return this.f51498a;
    }

    /* renamed from: d */
    public final int mo45845d() {
        return this.f51499b;
    }

    /* renamed from: e */
    public final String mo45846e() {
        return this.f51500c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18181d)) {
            return false;
        }
        C18181d dVar = (C18181d) obj;
        return this.f51498a == dVar.f51498a && this.f51499b == dVar.f51499b && C41536l.m120484d(this.f51500c, dVar.f51500c) && C41536l.m120484d(this.f51501d, dVar.f51501d) && C41536l.m120484d(this.f51502e, dVar.f51502e);
    }

    public int hashCode() {
        return (((((((this.f51498a * 31) + this.f51499b) * 31) + this.f51500c.hashCode()) * 31) + this.f51501d.hashCode()) * 31) + this.f51502e.hashCode();
    }

    public String toString() {
        int i = this.f51498a;
        int i2 = this.f51499b;
        String str = this.f51500c;
        String str2 = this.f51501d;
        String str3 = this.f51502e;
        return "ApplicationStatusResp(imageId=" + i + ", tintColorId=" + i2 + ", titleText=" + str + ", descText=" + str2 + ", buttonText=" + str3 + ")";
    }
}
