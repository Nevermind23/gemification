package dy0;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s31.C38421a;

/* renamed from: dy0.g */
public final class C31626g {

    /* renamed from: a */
    private List f78194a;

    /* renamed from: b */
    private C38421a f78195b;

    /* renamed from: c */
    private List f78196c;

    public C31626g(List list, C38421a aVar, List list2) {
        C41536l.m120489i(list, "savedValues");
        C41536l.m120489i(list2, "secondPageInfo");
        this.f78194a = list;
        this.f78195b = aVar;
        this.f78196c = list2;
    }

    /* renamed from: a */
    public final C38421a mo72057a() {
        return this.f78195b;
    }

    /* renamed from: b */
    public final List mo72058b() {
        return this.f78194a;
    }

    /* renamed from: c */
    public final List mo72059c() {
        return this.f78196c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31626g)) {
            return false;
        }
        C31626g gVar = (C31626g) obj;
        return C41536l.m120484d(this.f78194a, gVar.f78194a) && C41536l.m120484d(this.f78195b, gVar.f78195b) && C41536l.m120484d(this.f78196c, gVar.f78196c);
    }

    public int hashCode() {
        int hashCode = this.f78194a.hashCode() * 31;
        C38421a aVar = this.f78195b;
        return ((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.f78196c.hashCode();
    }

    public String toString() {
        List list = this.f78194a;
        C38421a aVar = this.f78195b;
        List list2 = this.f78196c;
        return "UpdatedConfigUiModel(savedValues=" + list + ", config=" + aVar + ", secondPageInfo=" + list2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C31626g(List list, C38421a aVar, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C41341q.m119907j() : list, (i & 2) != 0 ? null : aVar, (i & 4) != 0 ? C41341q.m119907j() : list2);
    }
}
