package ad0;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ad0.a */
public final class C19227a {

    /* renamed from: a */
    private final String f53449a;

    /* renamed from: b */
    private final String f53450b;

    /* renamed from: c */
    private final String f53451c;

    /* renamed from: d */
    private final String f53452d;

    public C19227a(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "key");
        C41536l.m120489i(str2, "segment");
        this.f53449a = str;
        this.f53450b = str2;
        this.f53451c = str3;
        this.f53452d = str4;
    }

    /* renamed from: b */
    public static /* synthetic */ C19227a m64666b(C19227a aVar, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aVar.f53449a;
        }
        if ((i & 2) != 0) {
            str2 = aVar.f53450b;
        }
        if ((i & 4) != 0) {
            str3 = aVar.f53451c;
        }
        if ((i & 8) != 0) {
            str4 = aVar.f53452d;
        }
        return aVar.mo47462a(str, str2, str3, str4);
    }

    /* renamed from: a */
    public final C19227a mo47462a(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "key");
        C41536l.m120489i(str2, "segment");
        return new C19227a(str, str2, str3, str4);
    }

    /* renamed from: c */
    public final String mo47463c() {
        return this.f53449a;
    }

    /* renamed from: d */
    public final String mo47464d() {
        return this.f53450b;
    }

    /* renamed from: e */
    public final String mo47465e() {
        return this.f53451c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19227a)) {
            return false;
        }
        C19227a aVar = (C19227a) obj;
        return C41536l.m120484d(this.f53449a, aVar.f53449a) && C41536l.m120484d(this.f53450b, aVar.f53450b) && C41536l.m120484d(this.f53451c, aVar.f53451c) && C41536l.m120484d(this.f53452d, aVar.f53452d);
    }

    /* renamed from: f */
    public final String mo47467f() {
        return this.f53452d;
    }

    public int hashCode() {
        int hashCode = ((this.f53449a.hashCode() * 31) + this.f53450b.hashCode()) * 31;
        String str = this.f53451c;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f53452d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.f53449a;
        String str2 = this.f53450b;
        String str3 = this.f53451c;
        String str4 = this.f53452d;
        return "DictionaryEntry(key=" + str + ", segment=" + str2 + ", valueEn=" + str3 + ", valueGe=" + str4 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C19227a(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
