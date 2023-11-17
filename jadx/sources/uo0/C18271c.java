package uo0;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: uo0.c */
public final class C18271c {

    /* renamed from: a */
    private final long f51593a;

    /* renamed from: b */
    private final String f51594b;

    /* renamed from: c */
    private final String f51595c;

    /* renamed from: d */
    private final String f51596d;

    public C18271c(long j, String str, String str2, String str3) {
        C41536l.m120489i(str, "categoryDesc");
        this.f51593a = j;
        this.f51594b = str;
        this.f51595c = str2;
        this.f51596d = str3;
    }

    /* renamed from: a */
    public final String mo45934a() {
        return this.f51594b;
    }

    /* renamed from: b */
    public final String mo45935b() {
        return this.f51595c;
    }

    /* renamed from: c */
    public final long mo45936c() {
        return this.f51593a;
    }

    /* renamed from: d */
    public final String mo45937d() {
        return this.f51596d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18271c)) {
            return false;
        }
        C18271c cVar = (C18271c) obj;
        return this.f51593a == cVar.f51593a && C41536l.m120484d(this.f51594b, cVar.f51594b) && C41536l.m120484d(this.f51595c, cVar.f51595c) && C41536l.m120484d(this.f51596d, cVar.f51596d);
    }

    public int hashCode() {
        int a = ((C7397t.m28148a(this.f51593a) * 31) + this.f51594b.hashCode()) * 31;
        String str = this.f51595c;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f51596d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        long j = this.f51593a;
        String str = this.f51594b;
        String str2 = this.f51595c;
        String str3 = this.f51596d;
        return "LifestyleOfferCategoryDescriptionUiModel(categoryId=" + j + ", categoryDesc=" + str + ", categoryIconUrl=" + str2 + ", categoryImageUrl=" + str3 + ")";
    }
}
