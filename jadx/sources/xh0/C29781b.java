package xh0;

import kotlin.jvm.internal.C41536l;

/* renamed from: xh0.b */
public final class C29781b {

    /* renamed from: a */
    private final String f75325a;

    /* renamed from: b */
    private final String f75326b;

    /* renamed from: c */
    private final int f75327c;

    /* renamed from: d */
    private final int f75328d;

    /* renamed from: e */
    private final int f75329e;

    /* renamed from: f */
    private final int f75330f;

    /* renamed from: g */
    private final Boolean f75331g;

    /* renamed from: h */
    private final Integer f75332h;

    public C29781b(String str, String str2, int i, int i2, int i3, int i4, Boolean bool, Integer num) {
        this.f75325a = str;
        this.f75326b = str2;
        this.f75327c = i;
        this.f75328d = i2;
        this.f75329e = i3;
        this.f75330f = i4;
        this.f75331g = bool;
        this.f75332h = num;
    }

    /* renamed from: a */
    public final String mo69947a() {
        return this.f75326b;
    }

    /* renamed from: b */
    public final int mo69948b() {
        return this.f75327c;
    }

    /* renamed from: c */
    public final int mo69949c() {
        return this.f75328d;
    }

    /* renamed from: d */
    public final int mo69950d() {
        return this.f75329e;
    }

    /* renamed from: e */
    public final int mo69951e() {
        return this.f75330f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29781b)) {
            return false;
        }
        C29781b bVar = (C29781b) obj;
        return C41536l.m120484d(this.f75325a, bVar.f75325a) && C41536l.m120484d(this.f75326b, bVar.f75326b) && this.f75327c == bVar.f75327c && this.f75328d == bVar.f75328d && this.f75329e == bVar.f75329e && this.f75330f == bVar.f75330f && C41536l.m120484d(this.f75331g, bVar.f75331g) && C41536l.m120484d(this.f75332h, bVar.f75332h);
    }

    /* renamed from: f */
    public final Integer mo69953f() {
        return this.f75332h;
    }

    public int hashCode() {
        String str = this.f75325a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f75326b;
        int hashCode2 = (((((((((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f75327c) * 31) + this.f75328d) * 31) + this.f75329e) * 31) + this.f75330f) * 31;
        Boolean bool = this.f75331g;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.f75332h;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        String str = this.f75325a;
        String str2 = this.f75326b;
        int i = this.f75327c;
        int i2 = this.f75328d;
        int i3 = this.f75329e;
        int i4 = this.f75330f;
        Boolean bool = this.f75331g;
        Integer num = this.f75332h;
        return "BffExternalFileDetail(fileId=" + str + ", fileUrl=" + str2 + ", maxPixelX=" + i + ", maxPixelY=" + i2 + ", minPixelX=" + i3 + ", minPixelY=" + i4 + ", isDark=" + bool + ", orderNo=" + num + ")";
    }
}
