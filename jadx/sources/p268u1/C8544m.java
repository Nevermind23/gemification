package p268u1;

import android.graphics.Path;
import java.util.List;
import p048d2.C5807i;
import p061e2.C6013a;
import p255t1.C8329s;
import p319y1.C9025n;

/* renamed from: u1.m */
public class C8544m extends C8525a {

    /* renamed from: i */
    private final C9025n f24262i = new C9025n();

    /* renamed from: j */
    private final Path f24263j = new Path();

    /* renamed from: k */
    private List f24264k;

    public C8544m(List list) {
        super(list);
    }

    /* renamed from: p */
    public Path mo23857i(C6013a aVar, float f) {
        this.f24262i.mo24481c((C9025n) aVar.f18759b, (C9025n) aVar.f18760c, f);
        C9025n nVar = this.f24262i;
        List list = this.f24264k;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                nVar = ((C8329s) this.f24264k.get(size)).mo23482d(nVar);
            }
        }
        C5807i.m23369h(nVar, this.f24263j);
        return this.f24263j;
    }

    /* renamed from: q */
    public void mo23896q(List list) {
        this.f24264k = list;
    }
}
