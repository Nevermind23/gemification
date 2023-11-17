package z31;

import i31.C36344a;
import i31.C36346c;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p863pw.C27636n;

/* renamed from: z31.a */
public final class C40143a extends C40144b {

    /* renamed from: a */
    private final C36346c f95392a;

    /* renamed from: b */
    private final C36344a f95393b;

    /* renamed from: c */
    private final C27636n f95394c;

    /* renamed from: d */
    private final String f95395d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C40143a(C36346c cVar, C36344a aVar, C27636n nVar, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, aVar, nVar, (i & 8) != 0 ? cVar.mo89077g() : str);
    }

    /* renamed from: a */
    public String mo94074a() {
        return this.f95395d;
    }

    /* renamed from: b */
    public final C36344a mo94075b() {
        return this.f95393b;
    }

    /* renamed from: c */
    public final C27636n mo94076c() {
        return this.f95394c;
    }

    /* renamed from: d */
    public final C36346c mo94077d() {
        return this.f95392a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40143a)) {
            return false;
        }
        C40143a aVar = (C40143a) obj;
        return C41536l.m120484d(this.f95392a, aVar.f95392a) && C41536l.m120484d(this.f95393b, aVar.f95393b) && C41536l.m120484d(this.f95394c, aVar.f95394c) && C41536l.m120484d(this.f95395d, aVar.f95395d);
    }

    public int hashCode() {
        int hashCode = this.f95392a.hashCode() * 31;
        C36344a aVar = this.f95393b;
        int i = 0;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        C27636n nVar = this.f95394c;
        int hashCode3 = (hashCode2 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        String str = this.f95395d;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        C36346c cVar = this.f95392a;
        C36344a aVar = this.f95393b;
        C27636n nVar = this.f95394c;
        String str = this.f95395d;
        return "InsuranceDetails(insuranceType=" + cVar + ", fee=" + aVar + ", insSecCard=" + nVar + ", insuranceTypeValue=" + str + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40143a(C36346c cVar, C36344a aVar, C27636n nVar, String str) {
        super((DefaultConstructorMarker) null);
        C41536l.m120489i(cVar, "insuranceType");
        this.f95392a = cVar;
        this.f95393b = aVar;
        this.f95394c = nVar;
        this.f95395d = str;
    }
}
