package px0;

import cx0.C31456c;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.shared.helper.StringSource;

/* renamed from: px0.e */
public final class C38035e {

    /* renamed from: a */
    private final C31456c f91374a;

    /* renamed from: b */
    private final StringSource f91375b;

    /* renamed from: c */
    private final List f91376c;

    /* renamed from: d */
    private final String f91377d;

    /* renamed from: e */
    private int f91378e;

    public C38035e(C31456c cVar, StringSource stringSource, List list, String str, int i) {
        C41536l.m120489i(cVar, "node");
        C41536l.m120489i(stringSource, "header");
        C41536l.m120489i(list, "data");
        C41536l.m120489i(str, "searchString");
        this.f91374a = cVar;
        this.f91375b = stringSource;
        this.f91376c = list;
        this.f91377d = str;
        this.f91378e = i;
    }

    /* renamed from: a */
    public final List mo91408a() {
        return this.f91376c;
    }

    /* renamed from: b */
    public final C31456c mo91409b() {
        return this.f91374a;
    }

    /* renamed from: c */
    public final int mo91410c() {
        return this.f91378e;
    }

    /* renamed from: d */
    public final String mo91411d() {
        return this.f91377d;
    }

    /* renamed from: e */
    public final void mo91412e(int i) {
        this.f91378e = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38035e)) {
            return false;
        }
        C38035e eVar = (C38035e) obj;
        return C41536l.m120484d(this.f91374a, eVar.f91374a) && C41536l.m120484d(this.f91375b, eVar.f91375b) && C41536l.m120484d(this.f91376c, eVar.f91376c) && C41536l.m120484d(this.f91377d, eVar.f91377d) && this.f91378e == eVar.f91378e;
    }

    public int hashCode() {
        return (((((((this.f91374a.hashCode() * 31) + this.f91375b.hashCode()) * 31) + this.f91376c.hashCode()) * 31) + this.f91377d.hashCode()) * 31) + this.f91378e;
    }

    public String toString() {
        C31456c cVar = this.f91374a;
        StringSource stringSource = this.f91375b;
        List list = this.f91376c;
        String str = this.f91377d;
        int i = this.f91378e;
        return "CategoriesUiState(node=" + cVar + ", header=" + stringSource + ", data=" + list + ", searchString=" + str + ", scrollY=" + i + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C38035e(C31456c cVar, StringSource stringSource, List list, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, stringSource, list, (i2 & 8) != 0 ? "" : str, (i2 & 16) != 0 ? 0 : i);
    }
}
