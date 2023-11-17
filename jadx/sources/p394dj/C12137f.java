package p394dj;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.Amount;

/* renamed from: dj.f */
public final class C12137f {

    /* renamed from: a */
    private final String f35653a;

    /* renamed from: b */
    private final Amount f35654b;

    /* renamed from: c */
    private final List f35655c;

    public C12137f(String str, Amount amount, List list) {
        C41536l.m120489i(amount, "totalAmount");
        this.f35653a = str;
        this.f35654b = amount;
        this.f35655c = list;
    }

    /* renamed from: a */
    public final List mo32354a() {
        return this.f35655c;
    }

    /* renamed from: b */
    public final String mo32355b() {
        return this.f35653a;
    }

    /* renamed from: c */
    public final Amount mo32356c() {
        return this.f35654b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12137f)) {
            return false;
        }
        C12137f fVar = (C12137f) obj;
        return C41536l.m120484d(this.f35653a, fVar.f35653a) && C41536l.m120484d(this.f35654b, fVar.f35654b) && C41536l.m120484d(this.f35655c, fVar.f35655c);
    }

    public int hashCode() {
        String str = this.f35653a;
        int i = 0;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.f35654b.hashCode()) * 31;
        List list = this.f35655c;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.f35653a;
        Amount amount = this.f35654b;
        List list = this.f35655c;
        return "ProductHeaderData(productName=" + str + ", totalAmount=" + amount + ", amounts=" + list + ")";
    }
}
