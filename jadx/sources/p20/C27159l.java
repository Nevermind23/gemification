package p20;

import androidx.recyclerview.widget.C1796h;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: p20.l */
public final class C27159l extends C1796h.C1798b {

    /* renamed from: a */
    private final List f68159a;

    /* renamed from: b */
    private final List f68160b;

    public C27159l(List list, List list2) {
        C41536l.m120489i(list, "newReceivers");
        C41536l.m120489i(list2, "oldReceivers");
        this.f68159a = list;
        this.f68160b = list2;
    }

    /* renamed from: a */
    public boolean mo5907a(int i, int i2) {
        return C41536l.m120484d(this.f68159a.get(i2), this.f68160b.get(i));
    }

    /* renamed from: b */
    public boolean mo5908b(int i, int i2) {
        return C41536l.m120484d(this.f68159a.get(i2), this.f68160b.get(i));
    }

    /* renamed from: d */
    public int mo5910d() {
        return this.f68159a.size();
    }

    /* renamed from: e */
    public int mo5911e() {
        return this.f68160b.size();
    }
}
