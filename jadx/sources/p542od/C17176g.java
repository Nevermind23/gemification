package p542od;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p458id.C15600b;
import p486kd.C16401d;
import p500ld.C16546c;
import p500ld.C16547d;
import p500ld.C16549e;
import p500ld.C16550f;
import p556pd.C17339b;
import p570qd.C17489c;
import p679yd.C18879b;

/* renamed from: od.g */
public class C17176g extends C16547d {

    /* renamed from: j */
    private static final C15600b f48201j = C15600b.m56349a(C17176g.class.getSimpleName());

    /* renamed from: e */
    private List f48202e;

    /* renamed from: f */
    private C16550f f48203f;

    /* renamed from: g */
    private final C18879b f48204g;

    /* renamed from: h */
    private final C16401d f48205h;

    /* renamed from: i */
    private final boolean f48206i;

    public C17176g(C16401d dVar, C18879b bVar, boolean z) {
        this.f48204g = bVar;
        this.f48205h = dVar;
        this.f48206i = z;
    }

    /* renamed from: q */
    private void m60359q(C16546c cVar) {
        List arrayList = new ArrayList();
        if (this.f48204g != null) {
            C17339b bVar = new C17339b(this.f48205h.mo43490w(), this.f48205h.mo43460T().mo26809l(), this.f48205h.mo43467W(C17489c.VIEW), this.f48205h.mo43460T().mo26812o(), cVar.mo43381i(this), cVar.mo43383m(this));
            arrayList = this.f48204g.mo46875f(bVar).mo46874e(Integer.MAX_VALUE, bVar);
        }
        C17172c cVar2 = new C17172c(arrayList, this.f48206i);
        C17174e eVar = new C17174e(arrayList, this.f48206i);
        C17178i iVar = new C17178i(arrayList, this.f48206i);
        this.f48202e = Arrays.asList(new C17170a[]{cVar2, eVar, iVar});
        this.f48203f = C16549e.m58778c(cVar2, eVar, iVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo26303m(C16546c cVar) {
        C15600b bVar = f48201j;
        bVar.mo42880h("onStart:", "initializing.");
        m60359q(cVar);
        bVar.mo42880h("onStart:", "initialized.");
        super.mo26303m(cVar);
    }

    /* renamed from: p */
    public C16550f mo43696p() {
        return this.f48203f;
    }

    /* renamed from: r */
    public boolean mo44593r() {
        for (C17170a r : this.f48202e) {
            if (!r.mo44589r()) {
                f48201j.mo42878c("isSuccessful:", "returning false.");
                return false;
            }
        }
        f48201j.mo42878c("isSuccessful:", "returning true.");
        return true;
    }
}
