package y20;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import w20.C29192a;

/* renamed from: y20.b */
public final class C29890b {

    /* renamed from: a */
    private final C29192a.C29194b f75620a;

    /* renamed from: b */
    private final List f75621b;

    /* renamed from: c */
    private final C29192a.C29197e f75622c;

    /* renamed from: d */
    private final List f75623d;

    /* renamed from: e */
    private final C29192a.C29193a f75624e;

    /* renamed from: f */
    private final C29889a f75625f;

    public C29890b(C29192a.C29194b bVar, List list, C29192a.C29197e eVar, List list2, C29192a.C29193a aVar, C29889a aVar2) {
        C41536l.m120489i(bVar, "progress");
        C41536l.m120489i(list, "operations");
        C41536l.m120489i(eVar, "header");
        C41536l.m120489i(list2, "receivers");
        C41536l.m120489i(aVar, "account");
        C41536l.m120489i(aVar2, "completeButtonState");
        this.f75620a = bVar;
        this.f75621b = list;
        this.f75622c = eVar;
        this.f75623d = list2;
        this.f75624e = aVar;
        this.f75625f = aVar2;
    }

    /* renamed from: a */
    public final C29192a.C29193a mo70172a() {
        return this.f75624e;
    }

    /* renamed from: b */
    public final C29889a mo70173b() {
        return this.f75625f;
    }

    /* renamed from: c */
    public final C29192a.C29197e mo70174c() {
        return this.f75622c;
    }

    /* renamed from: d */
    public final List mo70175d() {
        return this.f75621b;
    }

    /* renamed from: e */
    public final C29192a.C29194b mo70176e() {
        return this.f75620a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29890b)) {
            return false;
        }
        C29890b bVar = (C29890b) obj;
        return C41536l.m120484d(this.f75620a, bVar.f75620a) && C41536l.m120484d(this.f75621b, bVar.f75621b) && C41536l.m120484d(this.f75622c, bVar.f75622c) && C41536l.m120484d(this.f75623d, bVar.f75623d) && C41536l.m120484d(this.f75624e, bVar.f75624e) && C41536l.m120484d(this.f75625f, bVar.f75625f);
    }

    /* renamed from: f */
    public final List mo70178f() {
        return this.f75623d;
    }

    public int hashCode() {
        return (((((((((this.f75620a.hashCode() * 31) + this.f75621b.hashCode()) * 31) + this.f75622c.hashCode()) * 31) + this.f75623d.hashCode()) * 31) + this.f75624e.hashCode()) * 31) + this.f75625f.hashCode();
    }

    public String toString() {
        C29192a.C29194b bVar = this.f75620a;
        List list = this.f75621b;
        C29192a.C29197e eVar = this.f75622c;
        List list2 = this.f75623d;
        C29192a.C29193a aVar = this.f75624e;
        C29889a aVar2 = this.f75625f;
        return "MoneyRequestDetailsUiModel(progress=" + bVar + ", operations=" + list + ", header=" + eVar + ", receivers=" + list2 + ", account=" + aVar + ", completeButtonState=" + aVar2 + ")";
    }
}
