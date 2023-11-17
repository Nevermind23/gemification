package lb1;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.sso_client.onboarding.model.StringSource;

/* renamed from: lb1.c */
public final class C37121c {

    /* renamed from: a */
    private final StringSource f89332a;

    /* renamed from: b */
    private final StringSource f89333b;

    /* renamed from: c */
    private final int f89334c;

    /* renamed from: d */
    private final int f89335d;

    public C37121c(StringSource stringSource, StringSource stringSource2, int i, int i2) {
        C41536l.m120489i(stringSource, "title");
        C41536l.m120489i(stringSource2, "desc");
        this.f89332a = stringSource;
        this.f89333b = stringSource2;
        this.f89334c = i;
        this.f89335d = i2;
    }

    /* renamed from: a */
    public final StringSource mo90046a() {
        return this.f89333b;
    }

    /* renamed from: b */
    public final int mo90047b() {
        return this.f89334c;
    }

    /* renamed from: c */
    public final int mo90048c() {
        return this.f89335d;
    }

    /* renamed from: d */
    public final StringSource mo90049d() {
        return this.f89332a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37121c)) {
            return false;
        }
        C37121c cVar = (C37121c) obj;
        return C41536l.m120484d(this.f89332a, cVar.f89332a) && C41536l.m120484d(this.f89333b, cVar.f89333b) && this.f89334c == cVar.f89334c && this.f89335d == cVar.f89335d;
    }

    public int hashCode() {
        return (((((this.f89332a.hashCode() * 31) + this.f89333b.hashCode()) * 31) + this.f89334c) * 31) + this.f89335d;
    }

    public String toString() {
        return "InfoCardModel(title=" + this.f89332a + ", desc=" + this.f89333b + ", iconId=" + this.f89334c + ", pos=" + this.f89335d + ')';
    }
}
