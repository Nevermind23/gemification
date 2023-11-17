package p255t1;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.MaskFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C2311c;
import com.airbnb.lottie.C2315d0;
import com.airbnb.lottie.C2326h0;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;
import p048d2.C5807i;
import p061e2.C6015c;
import p242s1.C8100a;
import p268u1.C8525a;
import p268u1.C8532b;
import p268u1.C8533c;
import p268u1.C8549q;
import p294w1.C8738e;
import p319y1.C9026o;
import p331z1.C9169b;

/* renamed from: t1.g */
public class C8315g implements C8313e, C8525a.C8527b, C8319k {

    /* renamed from: a */
    private final Path f23591a;

    /* renamed from: b */
    private final Paint f23592b = new C8100a(1);

    /* renamed from: c */
    private final C9169b f23593c;

    /* renamed from: d */
    private final String f23594d;

    /* renamed from: e */
    private final boolean f23595e;

    /* renamed from: f */
    private final List f23596f = new ArrayList();

    /* renamed from: g */
    private final C8525a f23597g;

    /* renamed from: h */
    private final C8525a f23598h;

    /* renamed from: i */
    private C8525a f23599i;

    /* renamed from: j */
    private final C2315d0 f23600j;

    /* renamed from: k */
    private C8525a f23601k;

    /* renamed from: l */
    float f23602l;

    /* renamed from: m */
    private C8533c f23603m;

    public C8315g(C2315d0 d0Var, C9169b bVar, C9026o oVar) {
        Path path = new Path();
        this.f23591a = path;
        this.f23593c = bVar;
        this.f23594d = oVar.mo24488d();
        this.f23595e = oVar.mo24490f();
        this.f23600j = d0Var;
        if (bVar.mo24755v() != null) {
            C8525a a = bVar.mo24755v().mo24415a().mo24353a();
            this.f23601k = a;
            a.mo23850a(this);
            bVar.mo24753i(this.f23601k);
        }
        if (bVar.mo24757x() != null) {
            this.f23603m = new C8533c(this, bVar, bVar.mo24757x());
        }
        if (oVar.mo24486b() == null || oVar.mo24489e() == null) {
            this.f23597g = null;
            this.f23598h = null;
            return;
        }
        path.setFillType(oVar.mo24487c());
        C8525a a2 = oVar.mo24486b().mo24353a();
        this.f23597g = a2;
        a2.mo23850a(this);
        bVar.mo24753i(a2);
        C8525a a3 = oVar.mo24489e().mo24353a();
        this.f23598h = a3;
        a3.mo23850a(this);
        bVar.mo24753i(a3);
    }

    /* renamed from: a */
    public void mo23468a() {
        this.f23600j.invalidateSelf();
    }

    /* renamed from: b */
    public void mo23469b(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            C8311c cVar = (C8311c) list2.get(i);
            if (cVar instanceof C8322m) {
                this.f23596f.add((C8322m) cVar);
            }
        }
    }

    /* renamed from: c */
    public void mo23470c(Object obj, C6015c cVar) {
        C8533c cVar2;
        C8533c cVar3;
        C8533c cVar4;
        C8533c cVar5;
        C8533c cVar6;
        if (obj == C2326h0.f7282a) {
            this.f23597g.mo23862n(cVar);
        } else if (obj == C2326h0.f7285d) {
            this.f23598h.mo23862n(cVar);
        } else if (obj == C2326h0.f7277K) {
            C8525a aVar = this.f23599i;
            if (aVar != null) {
                this.f23593c.mo24747H(aVar);
            }
            if (cVar == null) {
                this.f23599i = null;
                return;
            }
            C8549q qVar = new C8549q(cVar);
            this.f23599i = qVar;
            qVar.mo23850a(this);
            this.f23593c.mo24753i(this.f23599i);
        } else if (obj == C2326h0.f7291j) {
            C8525a aVar2 = this.f23601k;
            if (aVar2 != null) {
                aVar2.mo23862n(cVar);
                return;
            }
            C8549q qVar2 = new C8549q(cVar);
            this.f23601k = qVar2;
            qVar2.mo23850a(this);
            this.f23593c.mo24753i(this.f23601k);
        } else if (obj == C2326h0.f7286e && (cVar6 = this.f23603m) != null) {
            cVar6.mo23873c(cVar);
        } else if (obj == C2326h0.f7273G && (cVar5 = this.f23603m) != null) {
            cVar5.mo23876f(cVar);
        } else if (obj == C2326h0.f7274H && (cVar4 = this.f23603m) != null) {
            cVar4.mo23874d(cVar);
        } else if (obj == C2326h0.f7275I && (cVar3 = this.f23603m) != null) {
            cVar3.mo23875e(cVar);
        } else if (obj == C2326h0.f7276J && (cVar2 = this.f23603m) != null) {
            cVar2.mo23877g(cVar);
        }
    }

    /* renamed from: e */
    public void mo23471e(RectF rectF, Matrix matrix, boolean z) {
        this.f23591a.reset();
        for (int i = 0; i < this.f23596f.size(); i++) {
            this.f23591a.addPath(((C8322m) this.f23596f.get(i)).mo23480z(), matrix);
        }
        this.f23591a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    /* renamed from: f */
    public void mo23472f(C8738e eVar, int i, List list, C8738e eVar2) {
        C5807i.m23372k(eVar, i, list, eVar2, this);
    }

    public String getName() {
        return this.f23594d;
    }

    /* renamed from: h */
    public void mo23473h(Canvas canvas, Matrix matrix, int i) {
        if (!this.f23595e) {
            C2311c.m8884a("FillContent#draw");
            this.f23592b.setColor((C5807i.m23364c((int) ((((((float) i) / 255.0f) * ((float) ((Integer) this.f23598h.mo23856h()).intValue())) / 100.0f) * 255.0f), 0, C11051p3.f31759c) << 24) | (((C8532b) this.f23597g).mo23869p() & 16777215));
            C8525a aVar = this.f23599i;
            if (aVar != null) {
                this.f23592b.setColorFilter((ColorFilter) aVar.mo23856h());
            }
            C8525a aVar2 = this.f23601k;
            if (aVar2 != null) {
                float floatValue = ((Float) aVar2.mo23856h()).floatValue();
                if (floatValue == Utils.FLOAT_EPSILON) {
                    this.f23592b.setMaskFilter((MaskFilter) null);
                } else if (floatValue != this.f23602l) {
                    this.f23592b.setMaskFilter(this.f23593c.mo24756w(floatValue));
                }
                this.f23602l = floatValue;
            }
            C8533c cVar = this.f23603m;
            if (cVar != null) {
                cVar.mo23872b(this.f23592b);
            }
            this.f23591a.reset();
            for (int i2 = 0; i2 < this.f23596f.size(); i2++) {
                this.f23591a.addPath(((C8322m) this.f23596f.get(i2)).mo23480z(), matrix);
            }
            canvas.drawPath(this.f23591a, this.f23592b);
            C2311c.m8885b("FillContent#draw");
        }
    }
}
