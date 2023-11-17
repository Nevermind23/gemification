package uo0;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: uo0.b */
public final class C18270b {

    /* renamed from: a */
    private final List f51587a;

    /* renamed from: b */
    private final List f51588b;

    /* renamed from: c */
    private final String f51589c;

    /* renamed from: d */
    private final String f51590d;

    /* renamed from: e */
    private final boolean f51591e;

    /* renamed from: f */
    private final boolean f51592f;

    public C18270b(List list, List list2, String str, String str2, boolean z, boolean z2) {
        C41536l.m120489i(list, "imagesTop");
        C41536l.m120489i(list2, "imagesBottom");
        this.f51587a = list;
        this.f51588b = list2;
        this.f51589c = str;
        this.f51590d = str2;
        this.f51591e = z;
        this.f51592f = z2;
    }

    /* renamed from: a */
    public final String mo45925a() {
        return this.f51589c;
    }

    /* renamed from: b */
    public final boolean mo45926b() {
        return this.f51591e;
    }

    /* renamed from: c */
    public final String mo45927c() {
        return this.f51590d;
    }

    /* renamed from: d */
    public final List mo45928d() {
        return this.f51588b;
    }

    /* renamed from: e */
    public final List mo45929e() {
        return this.f51587a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18270b)) {
            return false;
        }
        C18270b bVar = (C18270b) obj;
        return C41536l.m120484d(this.f51587a, bVar.f51587a) && C41536l.m120484d(this.f51588b, bVar.f51588b) && C41536l.m120484d(this.f51589c, bVar.f51589c) && C41536l.m120484d(this.f51590d, bVar.f51590d) && this.f51591e == bVar.f51591e && this.f51592f == bVar.f51592f;
    }

    /* renamed from: f */
    public final boolean mo45931f() {
        return this.f51592f;
    }

    public int hashCode() {
        int hashCode = ((this.f51587a.hashCode() * 31) + this.f51588b.hashCode()) * 31;
        String str = this.f51589c;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f51590d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.f51591e;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f51592f;
        if (!z3) {
            z2 = z3;
        }
        return i3 + (z2 ? 1 : 0);
    }

    public String toString() {
        List list = this.f51587a;
        List list2 = this.f51588b;
        String str = this.f51589c;
        String str2 = this.f51590d;
        boolean z = this.f51591e;
        boolean z2 = this.f51592f;
        return "LifestyleBnplUiModel(imagesTop=" + list + ", imagesBottom=" + list2 + ", amount=" + str + ", ccy=" + str2 + ", available=" + z + ", show=" + z2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18270b(List list, List list2, String str, String str2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, str, str2, (i & 16) != 0 ? true : z, (i & 32) != 0 ? true : z2);
    }
}
