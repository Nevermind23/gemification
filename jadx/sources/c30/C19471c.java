package c30;

import androidx.recyclerview.widget.C1796h;
import d30.C19892c;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: c30.c */
public final class C19471c extends C1796h.C1798b {

    /* renamed from: a */
    private final List f53720a;

    /* renamed from: b */
    private final List f53721b;

    public C19471c(List list, List list2) {
        C41536l.m120489i(list, "oldList");
        C41536l.m120489i(list2, "newList");
        this.f53720a = list;
        this.f53721b = list2;
    }

    /* renamed from: f */
    private final boolean m65006f(C19892c cVar, C19892c cVar2) {
        return C41536l.m120484d(cVar, cVar2);
    }

    /* renamed from: a */
    public boolean mo5907a(int i, int i2) {
        return m65006f((C19892c) this.f53720a.get(i), (C19892c) this.f53721b.get(i2));
    }

    /* renamed from: b */
    public boolean mo5908b(int i, int i2) {
        return C41536l.m120484d(((C19892c) this.f53720a.get(i)).mo48242a(), ((C19892c) this.f53721b.get(i2)).mo48242a());
    }

    /* renamed from: c */
    public Object mo5909c(int i, int i2) {
        return this.f53721b.get(i2);
    }

    /* renamed from: d */
    public int mo5910d() {
        return this.f53721b.size();
    }

    /* renamed from: e */
    public int mo5911e() {
        return this.f53720a.size();
    }
}
