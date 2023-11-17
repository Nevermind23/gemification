package uo0;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: uo0.d */
public final class C18272d {

    /* renamed from: a */
    private final long f51597a;

    /* renamed from: b */
    private final String f51598b;

    /* renamed from: c */
    private final String f51599c;

    /* renamed from: d */
    private final String f51600d;

    /* renamed from: e */
    private final List f51601e;

    public C18272d(long j, String str, String str2, String str3, List list) {
        C41536l.m120489i(str, "categoryDesc");
        C41536l.m120489i(list, "offers");
        this.f51597a = j;
        this.f51598b = str;
        this.f51599c = str2;
        this.f51600d = str3;
        this.f51601e = list;
    }

    /* renamed from: b */
    public static /* synthetic */ C18272d m62494b(C18272d dVar, long j, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            j = dVar.f51597a;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = dVar.f51598b;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = dVar.f51599c;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = dVar.f51600d;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            list = dVar.f51601e;
        }
        return dVar.mo45941a(j2, str4, str5, str6, list);
    }

    /* renamed from: a */
    public final C18272d mo45941a(long j, String str, String str2, String str3, List list) {
        C41536l.m120489i(str, "categoryDesc");
        C41536l.m120489i(list, "offers");
        return new C18272d(j, str, str2, str3, list);
    }

    /* renamed from: c */
    public final String mo45942c() {
        return this.f51598b;
    }

    /* renamed from: d */
    public final String mo45943d() {
        return this.f51599c;
    }

    /* renamed from: e */
    public final long mo45944e() {
        return this.f51597a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18272d)) {
            return false;
        }
        C18272d dVar = (C18272d) obj;
        return this.f51597a == dVar.f51597a && C41536l.m120484d(this.f51598b, dVar.f51598b) && C41536l.m120484d(this.f51599c, dVar.f51599c) && C41536l.m120484d(this.f51600d, dVar.f51600d) && C41536l.m120484d(this.f51601e, dVar.f51601e);
    }

    /* renamed from: f */
    public final String mo45946f() {
        return this.f51600d;
    }

    /* renamed from: g */
    public final List mo45947g() {
        return this.f51601e;
    }

    public int hashCode() {
        int a = ((C7397t.m28148a(this.f51597a) * 31) + this.f51598b.hashCode()) * 31;
        String str = this.f51599c;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f51600d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode + i) * 31) + this.f51601e.hashCode();
    }

    public String toString() {
        long j = this.f51597a;
        String str = this.f51598b;
        String str2 = this.f51599c;
        String str3 = this.f51600d;
        List list = this.f51601e;
        return "LifestyleOfferCategoryUiModel(categoryId=" + j + ", categoryDesc=" + str + ", categoryIconUrl=" + str2 + ", categoryImageUrl=" + str3 + ", offers=" + list + ")";
    }
}
