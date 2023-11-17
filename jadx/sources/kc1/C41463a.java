package kc1;

import android.graphics.drawable.Drawable;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: kc1.a */
public final class C41463a {

    /* renamed from: a */
    private boolean f97598a;

    /* renamed from: b */
    private String f97599b;

    /* renamed from: c */
    private String f97600c;

    /* renamed from: d */
    private boolean f97601d;

    /* renamed from: e */
    private Drawable f97602e;

    /* renamed from: f */
    private BigDecimal f97603f;

    public C41463a(boolean z, String str, String str2, boolean z2, Drawable drawable, BigDecimal bigDecimal) {
        C41536l.m120489i(bigDecimal, "id");
        this.f97598a = z;
        this.f97599b = str;
        this.f97600c = str2;
        this.f97601d = z2;
        this.f97602e = drawable;
        this.f97603f = bigDecimal;
    }

    /* renamed from: a */
    public final String mo96218a() {
        return this.f97600c;
    }

    /* renamed from: b */
    public final String mo96219b() {
        return this.f97599b;
    }

    /* renamed from: c */
    public final Drawable mo96220c() {
        return this.f97602e;
    }

    /* renamed from: d */
    public final BigDecimal mo96221d() {
        return this.f97603f;
    }

    /* renamed from: e */
    public final boolean mo96222e() {
        return this.f97601d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41463a)) {
            return false;
        }
        C41463a aVar = (C41463a) obj;
        return this.f97598a == aVar.f97598a && C41536l.m120484d(this.f97599b, aVar.f97599b) && C41536l.m120484d(this.f97600c, aVar.f97600c) && this.f97601d == aVar.f97601d && C41536l.m120484d(this.f97602e, aVar.f97602e) && C41536l.m120484d(this.f97603f, aVar.f97603f);
    }

    /* renamed from: f */
    public final boolean mo96224f() {
        return this.f97598a;
    }

    /* renamed from: g */
    public final void mo96225g(boolean z) {
        this.f97598a = z;
    }

    public int hashCode() {
        boolean z = this.f97598a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.f97599b;
        int i2 = 0;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f97600c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z3 = this.f97601d;
        if (!z3) {
            z2 = z3;
        }
        int i3 = (hashCode2 + (z2 ? 1 : 0)) * 31;
        Drawable drawable = this.f97602e;
        if (drawable != null) {
            i2 = drawable.hashCode();
        }
        return ((i3 + i2) * 31) + this.f97603f.hashCode();
    }

    public String toString() {
        return "CustomerDevice(isTrusted=" + this.f97598a + ", deviceInfo=" + this.f97599b + ", date=" + this.f97600c + ", isCurrentSession=" + this.f97601d + ", drawable=" + this.f97602e + ", id=" + this.f97603f + ')';
    }
}
