package hn0;

import kotlin.jvm.internal.C41536l;

/* renamed from: hn0.d */
public final class C15539d {

    /* renamed from: a */
    private final int f44106a;

    /* renamed from: b */
    private final String f44107b;

    /* renamed from: c */
    private final boolean f44108c;

    public C15539d(int i, String str, boolean z) {
        C41536l.m120489i(str, "sourceAmountDesc");
        this.f44106a = i;
        this.f44107b = str;
        this.f44108c = z;
    }

    /* renamed from: a */
    public final int mo42668a() {
        return this.f44106a;
    }

    /* renamed from: b */
    public final String mo42669b() {
        return this.f44107b;
    }

    /* renamed from: c */
    public final boolean mo42670c() {
        return this.f44106a == 110;
    }

    /* renamed from: d */
    public final boolean mo42671d() {
        return this.f44108c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15539d)) {
            return false;
        }
        C15539d dVar = (C15539d) obj;
        return this.f44106a == dVar.f44106a && C41536l.m120484d(this.f44107b, dVar.f44107b) && this.f44108c == dVar.f44108c;
    }

    public int hashCode() {
        int hashCode = ((this.f44106a * 31) + this.f44107b.hashCode()) * 31;
        boolean z = this.f44108c;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        int i = this.f44106a;
        String str = this.f44107b;
        boolean z = this.f44108c;
        return "IncomeSource(id=" + i + ", sourceAmountDesc=" + str + ", isNoteMandatory=" + z + ")";
    }
}
