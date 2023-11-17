package p319y1;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import p048d2.C5804f;
import p048d2.C5807i;
import p294w1.C8733a;

/* renamed from: y1.n */
public class C9025n {

    /* renamed from: a */
    private final List f25120a;

    /* renamed from: b */
    private PointF f25121b;

    /* renamed from: c */
    private boolean f25122c;

    public C9025n(PointF pointF, boolean z, List list) {
        this.f25121b = pointF;
        this.f25122c = z;
        this.f25120a = new ArrayList(list);
    }

    /* renamed from: a */
    public List mo24479a() {
        return this.f25120a;
    }

    /* renamed from: b */
    public PointF mo24480b() {
        return this.f25121b;
    }

    /* renamed from: c */
    public void mo24481c(C9025n nVar, C9025n nVar2, float f) {
        boolean z;
        if (this.f25121b == null) {
            this.f25121b = new PointF();
        }
        if (nVar.mo24482d() || nVar2.mo24482d()) {
            z = true;
        } else {
            z = false;
        }
        this.f25122c = z;
        if (nVar.mo24479a().size() != nVar2.mo24479a().size()) {
            C5804f.m23334c("Curves must have the same number of control points. Shape 1: " + nVar.mo24479a().size() + "\tShape 2: " + nVar2.mo24479a().size());
        }
        int min = Math.min(nVar.mo24479a().size(), nVar2.mo24479a().size());
        if (this.f25120a.size() < min) {
            for (int size = this.f25120a.size(); size < min; size++) {
                this.f25120a.add(new C8733a());
            }
        } else if (this.f25120a.size() > min) {
            for (int size2 = this.f25120a.size() - 1; size2 >= min; size2--) {
                List list = this.f25120a;
                list.remove(list.size() - 1);
            }
        }
        PointF b = nVar.mo24480b();
        PointF b2 = nVar2.mo24480b();
        mo24484f(C5807i.m23370i(b.x, b2.x, f), C5807i.m23370i(b.y, b2.y, f));
        for (int size3 = this.f25120a.size() - 1; size3 >= 0; size3--) {
            C8733a aVar = (C8733a) nVar.mo24479a().get(size3);
            C8733a aVar2 = (C8733a) nVar2.mo24479a().get(size3);
            PointF a = aVar.mo24118a();
            PointF b3 = aVar.mo24119b();
            PointF c = aVar.mo24120c();
            PointF a2 = aVar2.mo24118a();
            PointF b4 = aVar2.mo24119b();
            PointF c2 = aVar2.mo24120c();
            ((C8733a) this.f25120a.get(size3)).mo24121d(C5807i.m23370i(a.x, a2.x, f), C5807i.m23370i(a.y, a2.y, f));
            ((C8733a) this.f25120a.get(size3)).mo24122e(C5807i.m23370i(b3.x, b4.x, f), C5807i.m23370i(b3.y, b4.y, f));
            ((C8733a) this.f25120a.get(size3)).mo24123f(C5807i.m23370i(c.x, c2.x, f), C5807i.m23370i(c.y, c2.y, f));
        }
    }

    /* renamed from: d */
    public boolean mo24482d() {
        return this.f25122c;
    }

    /* renamed from: e */
    public void mo24483e(boolean z) {
        this.f25122c = z;
    }

    /* renamed from: f */
    public void mo24484f(float f, float f2) {
        if (this.f25121b == null) {
            this.f25121b = new PointF();
        }
        this.f25121b.set(f, f2);
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f25120a.size() + "closed=" + this.f25122c + '}';
    }

    public C9025n() {
        this.f25120a = new ArrayList();
    }
}
