package gy0;

import kotlin.jvm.internal.C41536l;

/* renamed from: gy0.a */
public final class C36088a {

    /* renamed from: a */
    private final boolean f87239a;

    /* renamed from: b */
    private final String f87240b;

    /* renamed from: c */
    private final String f87241c;

    /* renamed from: d */
    private final String f87242d;

    public C36088a(boolean z, String str, String str2, String str3) {
        C41536l.m120489i(str, "title");
        C41536l.m120489i(str2, "buttonText");
        C41536l.m120489i(str3, "bannerImage");
        this.f87239a = z;
        this.f87240b = str;
        this.f87241c = str2;
        this.f87242d = str3;
    }

    /* renamed from: a */
    public final String mo88828a() {
        return this.f87242d;
    }

    /* renamed from: b */
    public final String mo88829b() {
        return this.f87241c;
    }

    /* renamed from: c */
    public final String mo88830c() {
        return this.f87240b;
    }

    /* renamed from: d */
    public final boolean mo88831d() {
        return this.f87239a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36088a)) {
            return false;
        }
        C36088a aVar = (C36088a) obj;
        return this.f87239a == aVar.f87239a && C41536l.m120484d(this.f87240b, aVar.f87240b) && C41536l.m120484d(this.f87241c, aVar.f87241c) && C41536l.m120484d(this.f87242d, aVar.f87242d);
    }

    public int hashCode() {
        boolean z = this.f87239a;
        if (z) {
            z = true;
        }
        return ((((((z ? 1 : 0) * true) + this.f87240b.hashCode()) * 31) + this.f87241c.hashCode()) * 31) + this.f87242d.hashCode();
    }

    public String toString() {
        boolean z = this.f87239a;
        String str = this.f87240b;
        String str2 = this.f87241c;
        String str3 = this.f87242d;
        return "PaymentBannerUiModel(visible=" + z + ", title=" + str + ", buttonText=" + str2 + ", bannerImage=" + str3 + ")";
    }
}
