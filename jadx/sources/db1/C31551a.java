package db1;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: db1.a */
public final class C31551a {

    /* renamed from: a */
    private final String f78108a;

    /* renamed from: b */
    private final String f78109b;

    /* renamed from: c */
    private final boolean f78110c;

    /* renamed from: d */
    private final boolean f78111d;

    public C31551a(String str, String str2, boolean z, boolean z2) {
        C41536l.m120489i(str, "id");
        C41536l.m120489i(str2, "contact");
        this.f78108a = str;
        this.f78109b = str2;
        this.f78110c = z;
        this.f78111d = z2;
    }

    /* renamed from: a */
    public final String mo71959a() {
        return this.f78109b;
    }

    /* renamed from: b */
    public final boolean mo71960b() {
        return this.f78111d;
    }

    /* renamed from: c */
    public final String mo71961c() {
        return this.f78108a;
    }

    /* renamed from: d */
    public final boolean mo71962d() {
        return this.f78110c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31551a)) {
            return false;
        }
        C31551a aVar = (C31551a) obj;
        return C41536l.m120484d(this.f78108a, aVar.f78108a) && C41536l.m120484d(this.f78109b, aVar.f78109b) && this.f78110c == aVar.f78110c && this.f78111d == aVar.f78111d;
    }

    public int hashCode() {
        int hashCode = ((this.f78108a.hashCode() * 31) + this.f78109b.hashCode()) * 31;
        boolean z = this.f78110c;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f78111d;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public String toString() {
        return "ContactInfo(id=" + this.f78108a + ", contact=" + this.f78109b + ", isFavorite=" + this.f78110c + ", editable=" + this.f78111d + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C31551a(String str, String str2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? true : z2);
    }
}
