package p691zb;

import java.util.Objects;
import p677yb.C18872b;
import p677yb.C18873c;

/* renamed from: zb.b */
final class C18994b {

    /* renamed from: a */
    private final C18872b f53004a;

    /* renamed from: b */
    private final C18872b f53005b;

    /* renamed from: c */
    private final C18873c f53006c;

    C18994b(C18872b bVar, C18872b bVar2, C18873c cVar) {
        this.f53004a = bVar;
        this.f53005b = bVar2;
        this.f53006c = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C18873c mo47033a() {
        return this.f53006c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C18872b mo47034b() {
        return this.f53004a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C18872b mo47035c() {
        return this.f53005b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo47036d() {
        return this.f53005b == null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C18994b)) {
            return false;
        }
        C18994b bVar = (C18994b) obj;
        if (!Objects.equals(this.f53004a, bVar.f53004a) || !Objects.equals(this.f53005b, bVar.f53005b) || !Objects.equals(this.f53006c, bVar.f53006c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (Objects.hashCode(this.f53004a) ^ Objects.hashCode(this.f53005b)) ^ Objects.hashCode(this.f53006c);
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("[ ");
        sb.append(this.f53004a);
        sb.append(" , ");
        sb.append(this.f53005b);
        sb.append(" : ");
        C18873c cVar = this.f53006c;
        if (cVar == null) {
            obj = "null";
        } else {
            obj = Integer.valueOf(cVar.mo46855c());
        }
        sb.append(obj);
        sb.append(" ]");
        return sb.toString();
    }
}
