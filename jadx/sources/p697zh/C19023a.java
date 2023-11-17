package p697zh;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.common.Image;

/* renamed from: zh.a */
public final class C19023a {

    /* renamed from: a */
    private final String f53139a;

    /* renamed from: b */
    private final Image f53140b;

    /* renamed from: c */
    private final String f53141c;

    /* renamed from: d */
    private final boolean f53142d;

    /* renamed from: e */
    private final CharSequence f53143e;

    /* renamed from: f */
    private final CharSequence f53144f;

    /* renamed from: g */
    private final List f53145g;

    public C19023a(String str, Image image, String str2, boolean z, CharSequence charSequence, CharSequence charSequence2, List list) {
        C41536l.m120489i(str, "id");
        C41536l.m120489i(image, "image");
        C41536l.m120489i(str2, "depositTitleText");
        this.f53139a = str;
        this.f53140b = image;
        this.f53141c = str2;
        this.f53142d = z;
        this.f53143e = charSequence;
        this.f53144f = charSequence2;
        this.f53145g = list;
    }

    /* renamed from: a */
    public final CharSequence mo47193a() {
        return this.f53143e;
    }

    /* renamed from: b */
    public final List mo47194b() {
        return this.f53145g;
    }

    /* renamed from: c */
    public final String mo47195c() {
        return this.f53141c;
    }

    /* renamed from: d */
    public final CharSequence mo47196d() {
        return this.f53144f;
    }

    /* renamed from: e */
    public final String mo47197e() {
        return this.f53139a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19023a)) {
            return false;
        }
        C19023a aVar = (C19023a) obj;
        return C41536l.m120484d(this.f53139a, aVar.f53139a) && C41536l.m120484d(this.f53140b, aVar.f53140b) && C41536l.m120484d(this.f53141c, aVar.f53141c) && this.f53142d == aVar.f53142d && C41536l.m120484d(this.f53143e, aVar.f53143e) && C41536l.m120484d(this.f53144f, aVar.f53144f) && C41536l.m120484d(this.f53145g, aVar.f53145g);
    }

    /* renamed from: f */
    public final Image mo47199f() {
        return this.f53140b;
    }

    /* renamed from: g */
    public final boolean mo47200g() {
        return this.f53142d;
    }

    public int hashCode() {
        int hashCode = ((((this.f53139a.hashCode() * 31) + this.f53140b.hashCode()) * 31) + this.f53141c.hashCode()) * 31;
        boolean z = this.f53142d;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        CharSequence charSequence = this.f53143e;
        int i2 = 0;
        int hashCode2 = (i + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.f53144f;
        int hashCode3 = (hashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        List list = this.f53145g;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        String str = this.f53139a;
        Image image = this.f53140b;
        String str2 = this.f53141c;
        boolean z = this.f53142d;
        CharSequence charSequence = this.f53143e;
        CharSequence charSequence2 = this.f53144f;
        List list = this.f53145g;
        return "DepositDetails(id=" + str + ", image=" + image + ", depositTitleText=" + str2 + ", isRecommended=" + z + ", annualInterestRate=" + charSequence + ", effectiveInterestRate=" + charSequence2 + ", depositFeatures=" + list + ")";
    }
}
