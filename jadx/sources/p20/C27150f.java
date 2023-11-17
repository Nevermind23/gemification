package p20;

import a30.C19158c;
import androidx.recyclerview.widget.C1796h;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p20.C27152h;

/* renamed from: p20.f */
public final class C27150f extends C1796h.C1798b {

    /* renamed from: a */
    private final List f68142a;

    /* renamed from: b */
    private final List f68143b;

    public C27150f(List list, List list2) {
        C41536l.m120489i(list, "oldList");
        C41536l.m120489i(list2, "newList");
        this.f68142a = list;
        this.f68143b = list2;
    }

    /* renamed from: a */
    public boolean mo5907a(int i, int i2) {
        return ((C19158c) this.f68142a.get(i)).mo47374f() == ((C19158c) this.f68143b.get(i2)).mo47374f();
    }

    /* renamed from: b */
    public boolean mo5908b(int i, int i2) {
        return ((C19158c) this.f68142a.get(i)).mo47371d() == ((C19158c) this.f68143b.get(i2)).mo47371d();
    }

    /* renamed from: d */
    public int mo5910d() {
        return this.f68143b.size();
    }

    /* renamed from: e */
    public int mo5911e() {
        return this.f68142a.size();
    }

    /* renamed from: f */
    public C27152h.C27154b mo5909c(int i, int i2) {
        boolean f = ((C19158c) this.f68142a.get(i)).mo47374f();
        boolean f2 = ((C19158c) this.f68143b.get(i2)).mo47374f();
        if (f != f2) {
            return new C27152h.C27154b(Boolean.valueOf(f2), (Boolean) null, 2, (DefaultConstructorMarker) null);
        }
        return null;
    }
}
