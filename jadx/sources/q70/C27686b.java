package q70;

import kotlin.jvm.internal.C41536l;

/* renamed from: q70.b */
public final class C27686b {

    /* renamed from: a */
    private final C27685a f70799a;

    /* renamed from: b */
    private final String f70800b;

    public C27686b(C27685a aVar, String str) {
        this.f70799a = aVar;
        this.f70800b = str;
    }

    /* renamed from: a */
    public final C27685a mo67222a() {
        return this.f70799a;
    }

    /* renamed from: b */
    public final String mo67223b() {
        return this.f70800b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27686b)) {
            return false;
        }
        C27686b bVar = (C27686b) obj;
        return this.f70799a == bVar.f70799a && C41536l.m120484d(this.f70800b, bVar.f70800b);
    }

    public int hashCode() {
        C27685a aVar = this.f70799a;
        int i = 0;
        int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        String str = this.f70800b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        C27685a aVar = this.f70799a;
        String str = this.f70800b;
        return "ProductTypeModel(product=" + aVar + ", status=" + str + ")";
    }
}
