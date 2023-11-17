package p255t1;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import com.airbnb.lottie.C2315d0;
import com.airbnb.lottie.C2326h0;
import p061e2.C6015c;
import p268u1.C8525a;
import p268u1.C8532b;
import p268u1.C8549q;
import p319y1.C9029r;
import p331z1.C9169b;

/* renamed from: t1.t */
public class C8330t extends C8307a {

    /* renamed from: r */
    private final C9169b f23691r;

    /* renamed from: s */
    private final String f23692s;

    /* renamed from: t */
    private final boolean f23693t;

    /* renamed from: u */
    private final C8525a f23694u;

    /* renamed from: v */
    private C8525a f23695v;

    public C8330t(C2315d0 d0Var, C9169b bVar, C9029r rVar) {
        super(d0Var, bVar, rVar.mo24500b().mo24510b(), rVar.mo24503e().mo24511b(), rVar.mo24505g(), rVar.mo24507i(), rVar.mo24508j(), rVar.mo24504f(), rVar.mo24502d());
        this.f23691r = bVar;
        this.f23692s = rVar.mo24506h();
        this.f23693t = rVar.mo24509k();
        C8525a a = rVar.mo24501c().mo24353a();
        this.f23694u = a;
        a.mo23850a(this);
        bVar.mo24753i(a);
    }

    /* renamed from: c */
    public void mo23470c(Object obj, C6015c cVar) {
        super.mo23470c(obj, cVar);
        if (obj == C2326h0.f7283b) {
            this.f23694u.mo23862n(cVar);
        } else if (obj == C2326h0.f7277K) {
            C8525a aVar = this.f23695v;
            if (aVar != null) {
                this.f23691r.mo24747H(aVar);
            }
            if (cVar == null) {
                this.f23695v = null;
                return;
            }
            C8549q qVar = new C8549q(cVar);
            this.f23695v = qVar;
            qVar.mo23850a(this);
            this.f23691r.mo24753i(this.f23694u);
        }
    }

    public String getName() {
        return this.f23692s;
    }

    /* renamed from: h */
    public void mo23473h(Canvas canvas, Matrix matrix, int i) {
        if (!this.f23693t) {
            this.f23560i.setColor(((C8532b) this.f23694u).mo23869p());
            C8525a aVar = this.f23695v;
            if (aVar != null) {
                this.f23560i.setColorFilter((ColorFilter) aVar.mo23856h());
            }
            super.mo23473h(canvas, matrix, i);
        }
    }
}
