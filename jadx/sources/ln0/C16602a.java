package ln0;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C41536l;

/* renamed from: ln0.a */
public final class C16602a {

    /* renamed from: a */
    private final List f46782a;

    /* renamed from: b */
    private final String f46783b;

    /* renamed from: c */
    private final Set f46784c;

    /* renamed from: d */
    private final boolean f46785d;

    public C16602a(List list, String str, Set set, boolean z) {
        C41536l.m120489i(list, "items");
        C41536l.m120489i(str, "note");
        C41536l.m120489i(set, "selectedIndices");
        this.f46782a = list;
        this.f46783b = str;
        this.f46784c = set;
        this.f46785d = z;
    }

    /* renamed from: a */
    public final List mo43750a() {
        return this.f46782a;
    }

    /* renamed from: b */
    public final String mo43751b() {
        return this.f46783b;
    }

    /* renamed from: c */
    public final Set mo43752c() {
        return this.f46784c;
    }

    /* renamed from: d */
    public final boolean mo43753d() {
        return this.f46785d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16602a)) {
            return false;
        }
        C16602a aVar = (C16602a) obj;
        return C41536l.m120484d(this.f46782a, aVar.f46782a) && C41536l.m120484d(this.f46783b, aVar.f46783b) && C41536l.m120484d(this.f46784c, aVar.f46784c) && this.f46785d == aVar.f46785d;
    }

    public int hashCode() {
        int hashCode = ((((this.f46782a.hashCode() * 31) + this.f46783b.hashCode()) * 31) + this.f46784c.hashCode()) * 31;
        boolean z = this.f46785d;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        List list = this.f46782a;
        String str = this.f46783b;
        Set set = this.f46784c;
        boolean z = this.f46785d;
        return "IncomePropertySourceUiState(items=" + list + ", note=" + str + ", selectedIndices=" + set + ", isButtonActive=" + z + ")";
    }
}
