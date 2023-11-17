package p057db;

import android.view.View;
import com.google.android.gms.maps.model.MarkerOptions;
import p057db.C5858a;
import p196o7.C7465c;
import p222q7.C7899d;

/* renamed from: db.b */
public class C5861b extends C5858a implements C7465c.C7470e, C7465c.C7472g, C7465c.C7473h, C7465c.C7466a, C7465c.C7471f {

    /* renamed from: db.b$a */
    public class C5862a extends C5858a.C5860b {
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C7465c.C7470e f18383c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public C7465c.C7471f f18384d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public C7465c.C7472g f18385e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public C7465c.C7473h f18386f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public C7465c.C7466a f18387g;

        public C5862a() {
            super();
        }

        /* renamed from: i */
        public C7899d mo19085i(MarkerOptions markerOptions) {
            C7899d b = C5861b.this.f18377a.mo21873b(markerOptions);
            super.mo19075a(b);
            return b;
        }

        /* renamed from: j */
        public void mo19086j(C7465c.C7470e eVar) {
            this.f18383c = eVar;
        }

        /* renamed from: k */
        public void mo19087k(C7465c.C7471f fVar) {
            this.f18384d = fVar;
        }

        /* renamed from: l */
        public void mo19088l(C7465c.C7472g gVar) {
            this.f18385e = gVar;
        }
    }

    public C5861b(C7465c cVar) {
        super(cVar);
    }

    /* renamed from: a */
    public void mo7336a(C7899d dVar) {
        C5862a aVar = (C5862a) this.f18379c.get(dVar);
        if (aVar != null && aVar.f18384d != null) {
            aVar.f18384d.mo7336a(dVar);
        }
    }

    /* renamed from: b */
    public boolean mo172b(C7899d dVar) {
        C5862a aVar = (C5862a) this.f18379c.get(dVar);
        if (aVar == null || aVar.f18385e == null) {
            return false;
        }
        return aVar.f18385e.mo172b(dVar);
    }

    /* renamed from: c */
    public void mo19078c(C7899d dVar) {
        C5862a aVar = (C5862a) this.f18379c.get(dVar);
        if (aVar != null && aVar.f18386f != null) {
            aVar.f18386f.mo19078c(dVar);
        }
    }

    /* renamed from: d */
    public void mo19079d(C7899d dVar) {
        C5862a aVar = (C5862a) this.f18379c.get(dVar);
        if (aVar != null && aVar.f18386f != null) {
            aVar.f18386f.mo19079d(dVar);
        }
    }

    /* renamed from: e */
    public View mo19080e(C7899d dVar) {
        C5862a aVar = (C5862a) this.f18379c.get(dVar);
        if (aVar == null || aVar.f18387g == null) {
            return null;
        }
        return aVar.f18387g.mo19080e(dVar);
    }

    /* renamed from: f */
    public void mo19081f(C7899d dVar) {
        C5862a aVar = (C5862a) this.f18379c.get(dVar);
        if (aVar != null && aVar.f18386f != null) {
            aVar.f18386f.mo19081f(dVar);
        }
    }

    /* renamed from: g */
    public View mo19082g(C7899d dVar) {
        C5862a aVar = (C5862a) this.f18379c.get(dVar);
        if (aVar == null || aVar.f18387g == null) {
            return null;
        }
        return aVar.f18387g.mo19082g(dVar);
    }

    /* renamed from: h */
    public void mo177h(C7899d dVar) {
        C5862a aVar = (C5862a) this.f18379c.get(dVar);
        if (aVar != null && aVar.f18383c != null) {
            aVar.f18383c.mo177h(dVar);
        }
    }

    /* renamed from: i */
    public /* bridge */ /* synthetic */ boolean mo19071i(Object obj) {
        return super.mo19071i(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo19073k() {
        C7465c cVar = this.f18377a;
        if (cVar != null) {
            cVar.mo21887p(this);
            this.f18377a.mo21888q(this);
            this.f18377a.mo21889r(this);
            this.f18377a.mo21890s(this);
            this.f18377a.mo21881j(this);
        }
    }

    /* renamed from: l */
    public C5862a mo19083l() {
        return new C5862a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo19072j(C7899d dVar) {
        dVar.mo22876e();
    }
}
