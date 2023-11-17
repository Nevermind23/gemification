package p218q3;

import p089g4.C6219h;
import p166m3.C7083e;
import p192o3.C7430c;
import p218q3.C7877h;

/* renamed from: q3.g */
public class C7876g extends C6219h implements C7877h {

    /* renamed from: e */
    private C7877h.C7878a f22821e;

    public C7876g(long j) {
        super(j);
    }

    /* renamed from: a */
    public void mo22841a(int i) {
        if (i >= 40) {
            mo19815b();
        } else if (i >= 20 || i == 15) {
            mo19822m(mo19817h() / 2);
        }
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ C7430c mo22842c(C7083e eVar) {
        return (C7430c) super.mo19821l(eVar);
    }

    /* renamed from: d */
    public /* bridge */ /* synthetic */ C7430c mo22843d(C7083e eVar, C7430c cVar) {
        return (C7430c) super.mo19820k(eVar, cVar);
    }

    /* renamed from: e */
    public void mo22844e(C7877h.C7878a aVar) {
        this.f22821e = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public int mo19818i(C7430c cVar) {
        if (cVar == null) {
            return super.mo19818i((Object) null);
        }
        return cVar.mo7941a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo19819j(C7083e eVar, C7430c cVar) {
        C7877h.C7878a aVar = this.f22821e;
        if (aVar != null && cVar != null) {
            aVar.mo7903b(cVar);
        }
    }
}
