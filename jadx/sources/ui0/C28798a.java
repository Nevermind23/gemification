package ui0;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.mobilebank.shared.helper.StringSource;

/* renamed from: ui0.a */
public final class C28798a {

    /* renamed from: a */
    private final StringSource f73617a;

    /* renamed from: b */
    private final long f73618b;

    /* renamed from: c */
    private final Long f73619c;

    public C28798a(StringSource stringSource, long j, Long l) {
        C41536l.m120489i(stringSource, "text");
        this.f73617a = stringSource;
        this.f73618b = j;
        this.f73619c = l;
    }

    /* renamed from: a */
    public final long mo68520a() {
        return this.f73618b;
    }

    /* renamed from: b */
    public final Long mo68521b() {
        return this.f73619c;
    }

    /* renamed from: c */
    public final StringSource mo68522c() {
        return this.f73617a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28798a)) {
            return false;
        }
        C28798a aVar = (C28798a) obj;
        return C41536l.m120484d(this.f73617a, aVar.f73617a) && this.f73618b == aVar.f73618b && C41536l.m120484d(this.f73619c, aVar.f73619c);
    }

    public int hashCode() {
        int hashCode = ((this.f73617a.hashCode() * 31) + C7397t.m28148a(this.f73618b)) * 31;
        Long l = this.f73619c;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        StringSource stringSource = this.f73617a;
        long j = this.f73618b;
        Long l = this.f73619c;
        return "CategoryTabsUiModel(text=" + stringSource + ", categoryId=" + j + ", startingCategoryId=" + l + ")";
    }
}
