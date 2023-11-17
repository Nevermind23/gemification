package p342j$.util.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import p342j$.util.Collection$EL;
import p342j$.util.List$EL;

/* renamed from: j$.util.stream.C2 */
final class C9526C2 extends C9727u2 {

    /* renamed from: d */
    private ArrayList f26177d;

    C9526C2(C9657g2 g2Var, Comparator comparator) {
        super(g2Var, comparator);
    }

    public final void accept(Object obj) {
        this.f26177d.add(obj);
    }

    /* renamed from: o */
    public final void mo25694o() {
        List$EL.sort(this.f26177d, this.f26495b);
        C9657g2 g2Var = this.f26360a;
        g2Var.mo25695p((long) this.f26177d.size());
        if (!this.f26496c) {
            ArrayList arrayList = this.f26177d;
            g2Var.getClass();
            Collection$EL.m34569a(arrayList, new C9624a(g2Var, 3));
        } else {
            Iterator it = this.f26177d.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (g2Var.mo25696r()) {
                    break;
                }
                g2Var.accept(next);
            }
        }
        g2Var.mo25694o();
        this.f26177d = null;
    }

    /* renamed from: p */
    public final void mo25695p(long j) {
        if (j < 2147483639) {
            this.f26177d = j >= 0 ? new ArrayList((int) j) : new ArrayList();
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }
}
