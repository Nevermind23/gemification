package p255t1;

import java.util.ArrayList;
import java.util.List;
import p268u1.C8525a;
import p319y1.C9033s;
import p331z1.C9169b;

/* renamed from: t1.u */
public class C8331u implements C8311c, C8525a.C8527b {

    /* renamed from: a */
    private final String f23696a;

    /* renamed from: b */
    private final boolean f23697b;

    /* renamed from: c */
    private final List f23698c = new ArrayList();

    /* renamed from: d */
    private final C9033s.C9034a f23699d;

    /* renamed from: e */
    private final C8525a f23700e;

    /* renamed from: f */
    private final C8525a f23701f;

    /* renamed from: g */
    private final C8525a f23702g;

    public C8331u(C9169b bVar, C9033s sVar) {
        this.f23696a = sVar.mo24513c();
        this.f23697b = sVar.mo24517g();
        this.f23699d = sVar.mo24516f();
        C8525a a = sVar.mo24515e().mo24353a();
        this.f23700e = a;
        C8525a a2 = sVar.mo24512b().mo24353a();
        this.f23701f = a2;
        C8525a a3 = sVar.mo24514d().mo24353a();
        this.f23702g = a3;
        bVar.mo24753i(a);
        bVar.mo24753i(a2);
        bVar.mo24753i(a3);
        a.mo23850a(this);
        a2.mo23850a(this);
        a3.mo23850a(this);
    }

    /* renamed from: a */
    public void mo23468a() {
        for (int i = 0; i < this.f23698c.size(); i++) {
            ((C8525a.C8527b) this.f23698c.get(i)).mo23468a();
        }
    }

    /* renamed from: b */
    public void mo23469b(List list, List list2) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo23484c(C8525a.C8527b bVar) {
        this.f23698c.add(bVar);
    }

    /* renamed from: f */
    public C8525a mo23485f() {
        return this.f23701f;
    }

    /* renamed from: g */
    public C8525a mo23486g() {
        return this.f23702g;
    }

    /* renamed from: i */
    public C8525a mo23487i() {
        return this.f23700e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C9033s.C9034a mo23488j() {
        return this.f23699d;
    }

    /* renamed from: k */
    public boolean mo23489k() {
        return this.f23697b;
    }
}
