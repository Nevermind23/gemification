package p255t1;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.MaskFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.airbnb.lottie.C2311c;
import com.airbnb.lottie.C2315d0;
import com.airbnb.lottie.C2326h0;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;
import p048d2.C5807i;
import p048d2.C5808j;
import p061e2.C6015c;
import p242s1.C8100a;
import p268u1.C8525a;
import p268u1.C8533c;
import p268u1.C8535d;
import p268u1.C8537f;
import p268u1.C8549q;
import p294w1.C8738e;
import p307x1.C8936b;
import p307x1.C8938d;
import p319y1.C9033s;
import p331z1.C9169b;

/* renamed from: t1.a */
public abstract class C8307a implements C8525a.C8527b, C8319k, C8313e {

    /* renamed from: a */
    private final PathMeasure f23552a = new PathMeasure();

    /* renamed from: b */
    private final Path f23553b = new Path();

    /* renamed from: c */
    private final Path f23554c = new Path();

    /* renamed from: d */
    private final RectF f23555d = new RectF();

    /* renamed from: e */
    private final C2315d0 f23556e;

    /* renamed from: f */
    protected final C9169b f23557f;

    /* renamed from: g */
    private final List f23558g = new ArrayList();

    /* renamed from: h */
    private final float[] f23559h;

    /* renamed from: i */
    final Paint f23560i;

    /* renamed from: j */
    private final C8525a f23561j;

    /* renamed from: k */
    private final C8525a f23562k;

    /* renamed from: l */
    private final List f23563l;

    /* renamed from: m */
    private final C8525a f23564m;

    /* renamed from: n */
    private C8525a f23565n;

    /* renamed from: o */
    private C8525a f23566o;

    /* renamed from: p */
    float f23567p;

    /* renamed from: q */
    private C8533c f23568q;

    /* renamed from: t1.a$b */
    private static final class C8309b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final List f23569a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C8331u f23570b;

        private C8309b(C8331u uVar) {
            this.f23569a = new ArrayList();
            this.f23570b = uVar;
        }
    }

    C8307a(C2315d0 d0Var, C9169b bVar, Paint.Cap cap, Paint.Join join, float f, C8938d dVar, C8936b bVar2, List list, C8936b bVar3) {
        C8100a aVar = new C8100a(1);
        this.f23560i = aVar;
        this.f23567p = Utils.FLOAT_EPSILON;
        this.f23556e = d0Var;
        this.f23557f = bVar;
        aVar.setStyle(Paint.Style.STROKE);
        aVar.setStrokeCap(cap);
        aVar.setStrokeJoin(join);
        aVar.setStrokeMiter(f);
        this.f23562k = dVar.mo24353a();
        this.f23561j = bVar2.mo24353a();
        if (bVar3 == null) {
            this.f23564m = null;
        } else {
            this.f23564m = bVar3.mo24353a();
        }
        this.f23563l = new ArrayList(list.size());
        this.f23559h = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.f23563l.add(((C8936b) list.get(i)).mo24353a());
        }
        bVar.mo24753i(this.f23562k);
        bVar.mo24753i(this.f23561j);
        for (int i2 = 0; i2 < this.f23563l.size(); i2++) {
            bVar.mo24753i((C8525a) this.f23563l.get(i2));
        }
        C8525a aVar2 = this.f23564m;
        if (aVar2 != null) {
            bVar.mo24753i(aVar2);
        }
        this.f23562k.mo23850a(this);
        this.f23561j.mo23850a(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((C8525a) this.f23563l.get(i3)).mo23850a(this);
        }
        C8525a aVar3 = this.f23564m;
        if (aVar3 != null) {
            aVar3.mo23850a(this);
        }
        if (bVar.mo24755v() != null) {
            C8525a a = bVar.mo24755v().mo24415a().mo24353a();
            this.f23566o = a;
            a.mo23850a(this);
            bVar.mo24753i(this.f23566o);
        }
        if (bVar.mo24757x() != null) {
            this.f23568q = new C8533c(this, bVar, bVar.mo24757x());
        }
    }

    /* renamed from: g */
    private void m31181g(Matrix matrix) {
        float f;
        C2311c.m8884a("StrokeContent#applyDashPattern");
        if (this.f23563l.isEmpty()) {
            C2311c.m8885b("StrokeContent#applyDashPattern");
            return;
        }
        float g = C5808j.m23379g(matrix);
        for (int i = 0; i < this.f23563l.size(); i++) {
            this.f23559h[i] = ((Float) ((C8525a) this.f23563l.get(i)).mo23856h()).floatValue();
            if (i % 2 == 0) {
                float[] fArr = this.f23559h;
                if (fArr[i] < 1.0f) {
                    fArr[i] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f23559h;
                if (fArr2[i] < 0.1f) {
                    fArr2[i] = 0.1f;
                }
            }
            float[] fArr3 = this.f23559h;
            fArr3[i] = fArr3[i] * g;
        }
        C8525a aVar = this.f23564m;
        if (aVar == null) {
            f = Utils.FLOAT_EPSILON;
        } else {
            f = g * ((Float) aVar.mo23856h()).floatValue();
        }
        this.f23560i.setPathEffect(new DashPathEffect(this.f23559h, f));
        C2311c.m8885b("StrokeContent#applyDashPattern");
    }

    /* renamed from: i */
    private void m31182i(Canvas canvas, C8309b bVar, Matrix matrix) {
        float f;
        float f2;
        float f3;
        Canvas canvas2 = canvas;
        Matrix matrix2 = matrix;
        C2311c.m8884a("StrokeContent#applyTrimPath");
        if (bVar.f23570b == null) {
            C2311c.m8885b("StrokeContent#applyTrimPath");
            return;
        }
        this.f23553b.reset();
        for (int size = bVar.f23569a.size() - 1; size >= 0; size--) {
            this.f23553b.addPath(((C8322m) bVar.f23569a.get(size)).mo23480z(), matrix2);
        }
        float floatValue = ((Float) bVar.f23570b.mo23487i().mo23856h()).floatValue() / 100.0f;
        float floatValue2 = ((Float) bVar.f23570b.mo23485f().mo23856h()).floatValue() / 100.0f;
        float floatValue3 = ((Float) bVar.f23570b.mo23486g().mo23856h()).floatValue() / 360.0f;
        if (floatValue >= 0.01f || floatValue2 <= 0.99f) {
            this.f23552a.setPath(this.f23553b, false);
            float length = this.f23552a.getLength();
            while (this.f23552a.nextContour()) {
                length += this.f23552a.getLength();
            }
            float f4 = floatValue3 * length;
            float f5 = (floatValue * length) + f4;
            float min = Math.min((floatValue2 * length) + f4, (f5 + length) - 1.0f);
            float f6 = 0.0f;
            for (int size2 = bVar.f23569a.size() - 1; size2 >= 0; size2--) {
                this.f23554c.set(((C8322m) bVar.f23569a.get(size2)).mo23480z());
                this.f23554c.transform(matrix2);
                this.f23552a.setPath(this.f23554c, false);
                float length2 = this.f23552a.getLength();
                if (min > length) {
                    float f7 = min - length;
                    if (f7 < f6 + length2 && f6 < f7) {
                        if (f5 > length) {
                            f3 = (f5 - length) / length2;
                        } else {
                            f3 = 0.0f;
                        }
                        C5808j.m23373a(this.f23554c, f3, Math.min(f7 / length2, 1.0f), Utils.FLOAT_EPSILON);
                        canvas2.drawPath(this.f23554c, this.f23560i);
                        f6 += length2;
                    }
                }
                float f8 = f6 + length2;
                if (f8 >= f5 && f6 <= min) {
                    if (f8 > min || f5 >= f6) {
                        if (f5 < f6) {
                            f = 0.0f;
                        } else {
                            f = (f5 - f6) / length2;
                        }
                        if (min > f8) {
                            f2 = 1.0f;
                        } else {
                            f2 = (min - f6) / length2;
                        }
                        C5808j.m23373a(this.f23554c, f, f2, Utils.FLOAT_EPSILON);
                        canvas2.drawPath(this.f23554c, this.f23560i);
                    } else {
                        canvas2.drawPath(this.f23554c, this.f23560i);
                    }
                }
                f6 += length2;
            }
            C2311c.m8885b("StrokeContent#applyTrimPath");
            return;
        }
        canvas2.drawPath(this.f23553b, this.f23560i);
        C2311c.m8885b("StrokeContent#applyTrimPath");
    }

    /* renamed from: a */
    public void mo23468a() {
        this.f23556e.invalidateSelf();
    }

    /* renamed from: b */
    public void mo23469b(List list, List list2) {
        C8331u uVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            C8311c cVar = (C8311c) list.get(size);
            if (cVar instanceof C8331u) {
                C8331u uVar2 = (C8331u) cVar;
                if (uVar2.mo23488j() == C9033s.C9034a.INDIVIDUALLY) {
                    uVar = uVar2;
                }
            }
        }
        if (uVar != null) {
            uVar.mo23484c(this);
        }
        C8309b bVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            C8311c cVar2 = (C8311c) list2.get(size2);
            if (cVar2 instanceof C8331u) {
                C8331u uVar3 = (C8331u) cVar2;
                if (uVar3.mo23488j() == C9033s.C9034a.INDIVIDUALLY) {
                    if (bVar != null) {
                        this.f23558g.add(bVar);
                    }
                    bVar = new C8309b(uVar3);
                    uVar3.mo23484c(this);
                }
            }
            if (cVar2 instanceof C8322m) {
                if (bVar == null) {
                    bVar = new C8309b(uVar);
                }
                bVar.f23569a.add((C8322m) cVar2);
            }
        }
        if (bVar != null) {
            this.f23558g.add(bVar);
        }
    }

    /* renamed from: c */
    public void mo23470c(Object obj, C6015c cVar) {
        C8533c cVar2;
        C8533c cVar3;
        C8533c cVar4;
        C8533c cVar5;
        C8533c cVar6;
        if (obj == C2326h0.f7285d) {
            this.f23562k.mo23862n(cVar);
        } else if (obj == C2326h0.f7300s) {
            this.f23561j.mo23862n(cVar);
        } else if (obj == C2326h0.f7277K) {
            C8525a aVar = this.f23565n;
            if (aVar != null) {
                this.f23557f.mo24747H(aVar);
            }
            if (cVar == null) {
                this.f23565n = null;
                return;
            }
            C8549q qVar = new C8549q(cVar);
            this.f23565n = qVar;
            qVar.mo23850a(this);
            this.f23557f.mo24753i(this.f23565n);
        } else if (obj == C2326h0.f7291j) {
            C8525a aVar2 = this.f23566o;
            if (aVar2 != null) {
                aVar2.mo23862n(cVar);
                return;
            }
            C8549q qVar2 = new C8549q(cVar);
            this.f23566o = qVar2;
            qVar2.mo23850a(this);
            this.f23557f.mo24753i(this.f23566o);
        } else if (obj == C2326h0.f7286e && (cVar6 = this.f23568q) != null) {
            cVar6.mo23873c(cVar);
        } else if (obj == C2326h0.f7273G && (cVar5 = this.f23568q) != null) {
            cVar5.mo23876f(cVar);
        } else if (obj == C2326h0.f7274H && (cVar4 = this.f23568q) != null) {
            cVar4.mo23874d(cVar);
        } else if (obj == C2326h0.f7275I && (cVar3 = this.f23568q) != null) {
            cVar3.mo23875e(cVar);
        } else if (obj == C2326h0.f7276J && (cVar2 = this.f23568q) != null) {
            cVar2.mo23877g(cVar);
        }
    }

    /* renamed from: e */
    public void mo23471e(RectF rectF, Matrix matrix, boolean z) {
        C2311c.m8884a("StrokeContent#getBounds");
        this.f23553b.reset();
        for (int i = 0; i < this.f23558g.size(); i++) {
            C8309b bVar = (C8309b) this.f23558g.get(i);
            for (int i2 = 0; i2 < bVar.f23569a.size(); i2++) {
                this.f23553b.addPath(((C8322m) bVar.f23569a.get(i2)).mo23480z(), matrix);
            }
        }
        this.f23553b.computeBounds(this.f23555d, false);
        float p = ((C8535d) this.f23561j).mo23879p();
        RectF rectF2 = this.f23555d;
        float f = p / 2.0f;
        rectF2.set(rectF2.left - f, rectF2.top - f, rectF2.right + f, rectF2.bottom + f);
        rectF.set(this.f23555d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        C2311c.m8885b("StrokeContent#getBounds");
    }

    /* renamed from: f */
    public void mo23472f(C8738e eVar, int i, List list, C8738e eVar2) {
        C5807i.m23372k(eVar, i, list, eVar2, this);
    }

    /* renamed from: h */
    public void mo23473h(Canvas canvas, Matrix matrix, int i) {
        C2311c.m8884a("StrokeContent#draw");
        if (C5808j.m23380h(matrix)) {
            C2311c.m8885b("StrokeContent#draw");
            return;
        }
        this.f23560i.setAlpha(C5807i.m23364c((int) ((((((float) i) / 255.0f) * ((float) ((C8537f) this.f23562k).mo23883p())) / 100.0f) * 255.0f), 0, C11051p3.f31759c));
        this.f23560i.setStrokeWidth(((C8535d) this.f23561j).mo23879p() * C5808j.m23379g(matrix));
        if (this.f23560i.getStrokeWidth() <= Utils.FLOAT_EPSILON) {
            C2311c.m8885b("StrokeContent#draw");
            return;
        }
        m31181g(matrix);
        C8525a aVar = this.f23565n;
        if (aVar != null) {
            this.f23560i.setColorFilter((ColorFilter) aVar.mo23856h());
        }
        C8525a aVar2 = this.f23566o;
        if (aVar2 != null) {
            float floatValue = ((Float) aVar2.mo23856h()).floatValue();
            if (floatValue == Utils.FLOAT_EPSILON) {
                this.f23560i.setMaskFilter((MaskFilter) null);
            } else if (floatValue != this.f23567p) {
                this.f23560i.setMaskFilter(this.f23557f.mo24756w(floatValue));
            }
            this.f23567p = floatValue;
        }
        C8533c cVar = this.f23568q;
        if (cVar != null) {
            cVar.mo23872b(this.f23560i);
        }
        for (int i2 = 0; i2 < this.f23558g.size(); i2++) {
            C8309b bVar = (C8309b) this.f23558g.get(i2);
            if (bVar.f23570b != null) {
                m31182i(canvas, bVar, matrix);
            } else {
                C2311c.m8884a("StrokeContent#buildPath");
                this.f23553b.reset();
                for (int size = bVar.f23569a.size() - 1; size >= 0; size--) {
                    this.f23553b.addPath(((C8322m) bVar.f23569a.get(size)).mo23480z(), matrix);
                }
                C2311c.m8885b("StrokeContent#buildPath");
                C2311c.m8884a("StrokeContent#drawPath");
                canvas.drawPath(this.f23553b, this.f23560i);
                C2311c.m8885b("StrokeContent#drawPath");
            }
        }
        C2311c.m8885b("StrokeContent#draw");
    }
}
