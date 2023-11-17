package a10;

import androidx.recyclerview.widget.C1796h;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: a10.b */
public class C19149b extends C1796h.C1798b {

    /* renamed from: a */
    private final List f53332a;

    /* renamed from: b */
    private final List f53333b;

    public C19149b(List list, List list2) {
        C41536l.m120489i(list, "oldList");
        C41536l.m120489i(list2, "newList");
        this.f53332a = list;
        this.f53333b = list2;
    }

    /* renamed from: a */
    public boolean mo5907a(int i, int i2) {
        return C41536l.m120484d(this.f53332a.get(i), this.f53333b.get(i2));
    }

    /* renamed from: b */
    public boolean mo5908b(int i, int i2) {
        return C41536l.m120484d(((C19148a) this.f53332a.get(i)).mo47349a(), ((C19148a) this.f53333b.get(i2)).mo47349a());
    }

    /* renamed from: d */
    public int mo5910d() {
        return this.f53333b.size();
    }

    /* renamed from: e */
    public int mo5911e() {
        return this.f53332a.size();
    }
}
