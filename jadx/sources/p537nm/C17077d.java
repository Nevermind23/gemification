package p537nm;

import kotlin.jvm.internal.C41536l;

/* renamed from: nm.d */
public final class C17077d {

    /* renamed from: a */
    private final C17071b f47730a;

    /* renamed from: b */
    private final String f47731b;

    /* renamed from: c */
    private final String f47732c;

    public C17077d(C17071b bVar, String str, String str2) {
        C41536l.m120489i(bVar, "cardApplicationType");
        this.f47730a = bVar;
        this.f47731b = str;
        this.f47732c = str2;
    }

    /* renamed from: a */
    public final String mo44294a() {
        return this.f47732c;
    }

    /* renamed from: b */
    public final String mo44295b() {
        return this.f47731b;
    }

    /* renamed from: c */
    public final C17071b mo44296c() {
        return this.f47730a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17077d)) {
            return false;
        }
        C17077d dVar = (C17077d) obj;
        return this.f47730a == dVar.f47730a && C41536l.m120484d(this.f47731b, dVar.f47731b) && C41536l.m120484d(this.f47732c, dVar.f47732c);
    }

    public int hashCode() {
        int hashCode = this.f47730a.hashCode() * 31;
        String str = this.f47731b;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f47732c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        C17071b bVar = this.f47730a;
        String str = this.f47731b;
        String str2 = this.f47732c;
        return "CardApplicationTypeInfo(cardApplicationType=" + bVar + ", appTypeDictionaryKey=" + str + ", appDescDictionaryKey=" + str2 + ")";
    }
}
