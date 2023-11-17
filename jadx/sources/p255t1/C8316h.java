package p255t1;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.MaskFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.C2311c;
import com.airbnb.lottie.C2315d0;
import com.airbnb.lottie.C2325h;
import com.airbnb.lottie.C2326h0;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;
import p048d2.C5807i;
import p061e2.C6015c;
import p242s1.C8100a;
import p268u1.C8525a;
import p268u1.C8533c;
import p268u1.C8549q;
import p294w1.C8738e;
import p319y1.C9012d;
import p319y1.C9013e;
import p319y1.C9015g;
import p331z1.C9169b;

/* renamed from: t1.h */
public class C8316h implements C8313e, C8525a.C8527b, C8319k {

    /* renamed from: a */
    private final String f23604a;

    /* renamed from: b */
    private final boolean f23605b;

    /* renamed from: c */
    private final C9169b f23606c;

    /* renamed from: d */
    private final LongSparseArray f23607d = new LongSparseArray();

    /* renamed from: e */
    private final LongSparseArray f23608e = new LongSparseArray();

    /* renamed from: f */
    private final Path f23609f;

    /* renamed from: g */
    private final Paint f23610g;

    /* renamed from: h */
    private final RectF f23611h;

    /* renamed from: i */
    private final List f23612i;

    /* renamed from: j */
    private final C9015g f23613j;

    /* renamed from: k */
    private final C8525a f23614k;

    /* renamed from: l */
    private final C8525a f23615l;

    /* renamed from: m */
    private final C8525a f23616m;

    /* renamed from: n */
    private final C8525a f23617n;

    /* renamed from: o */
    private C8525a f23618o;

    /* renamed from: p */
    private C8549q f23619p;

    /* renamed from: q */
    private final C2315d0 f23620q;

    /* renamed from: r */
    private final int f23621r;

    /* renamed from: s */
    private C8525a f23622s;

    /* renamed from: t */
    float f23623t;

    /* renamed from: u */
    private C8533c f23624u;

    public C8316h(C2315d0 d0Var, C2325h hVar, C9169b bVar, C9013e eVar) {
        Path path = new Path();
        this.f23609f = path;
        this.f23610g = new C8100a(1);
        this.f23611h = new RectF();
        this.f23612i = new ArrayList();
        this.f23623t = Utils.FLOAT_EPSILON;
        this.f23606c = bVar;
        this.f23604a = eVar.mo24430f();
        this.f23605b = eVar.mo24433i();
        this.f23620q = d0Var;
        this.f23613j = eVar.mo24429e();
        path.setFillType(eVar.mo24427c());
        this.f23621r = (int) (hVar.mo7545d() / 32.0f);
        C8525a a = eVar.mo24428d().mo24353a();
        this.f23614k = a;
        a.mo23850a(this);
        bVar.mo24753i(a);
        C8525a a2 = eVar.mo24431g().mo24353a();
        this.f23615l = a2;
        a2.mo23850a(this);
        bVar.mo24753i(a2);
        C8525a a3 = eVar.mo24432h().mo24353a();
        this.f23616m = a3;
        a3.mo23850a(this);
        bVar.mo24753i(a3);
        C8525a a4 = eVar.mo24426b().mo24353a();
        this.f23617n = a4;
        a4.mo23850a(this);
        bVar.mo24753i(a4);
        if (bVar.mo24755v() != null) {
            C8525a a5 = bVar.mo24755v().mo24415a().mo24353a();
            this.f23622s = a5;
            a5.mo23850a(this);
            bVar.mo24753i(this.f23622s);
        }
        if (bVar.mo24757x() != null) {
            this.f23624u = new C8533c(this, bVar, bVar.mo24757x());
        }
    }

    /* renamed from: g */
    private int[] m31221g(int[] iArr) {
        C8549q qVar = this.f23619p;
        if (qVar != null) {
            Integer[] numArr = (Integer[]) qVar.mo23856h();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    /* renamed from: i */
    private int m31222i() {
        int i;
        int round = Math.round(this.f23616m.mo23855f() * ((float) this.f23621r));
        int round2 = Math.round(this.f23617n.mo23855f() * ((float) this.f23621r));
        int round3 = Math.round(this.f23614k.mo23855f() * ((float) this.f23621r));
        if (round != 0) {
            i = 527 * round;
        } else {
            i = 17;
        }
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        if (round3 != 0) {
            return i * 31 * round3;
        }
        return i;
    }

    /* renamed from: j */
    private LinearGradient m31223j() {
        long i = (long) m31222i();
        LinearGradient linearGradient = (LinearGradient) this.f23607d.get(i);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointF = (PointF) this.f23616m.mo23856h();
        PointF pointF2 = (PointF) this.f23617n.mo23856h();
        C9012d dVar = (C9012d) this.f23614k.mo23856h();
        LinearGradient linearGradient2 = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, m31221g(dVar.mo24422c()), dVar.mo24423d(), Shader.TileMode.CLAMP);
        this.f23607d.put(i, linearGradient2);
        return linearGradient2;
    }

    /* renamed from: k */
    private RadialGradient m31224k() {
        long i = (long) m31222i();
        RadialGradient radialGradient = (RadialGradient) this.f23608e.get(i);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointF = (PointF) this.f23616m.mo23856h();
        PointF pointF2 = (PointF) this.f23617n.mo23856h();
        C9012d dVar = (C9012d) this.f23614k.mo23856h();
        int[] g = m31221g(dVar.mo24422c());
        float[] d = dVar.mo24423d();
        float f = pointF.x;
        float f2 = pointF.y;
        float hypot = (float) Math.hypot((double) (pointF2.x - f), (double) (pointF2.y - f2));
        if (hypot <= Utils.FLOAT_EPSILON) {
            hypot = 0.001f;
        }
        RadialGradient radialGradient2 = new RadialGradient(f, f2, hypot, g, d, Shader.TileMode.CLAMP);
        this.f23608e.put(i, radialGradient2);
        return radialGradient2;
    }

    /* renamed from: a */
    public void mo23468a() {
        this.f23620q.invalidateSelf();
    }

    /* renamed from: b */
    public void mo23469b(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            C8311c cVar = (C8311c) list2.get(i);
            if (cVar instanceof C8322m) {
                this.f23612i.add((C8322m) cVar);
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
        if (obj == C2326h0.f7285d) {
            this.f23615l.mo23862n(cVar);
        } else if (obj == C2326h0.f7277K) {
            C8525a aVar = this.f23618o;
            if (aVar != null) {
                this.f23606c.mo24747H(aVar);
            }
            if (cVar == null) {
                this.f23618o = null;
                return;
            }
            C8549q qVar = new C8549q(cVar);
            this.f23618o = qVar;
            qVar.mo23850a(this);
            this.f23606c.mo24753i(this.f23618o);
        } else if (obj == C2326h0.f7278L) {
            C8549q qVar2 = this.f23619p;
            if (qVar2 != null) {
                this.f23606c.mo24747H(qVar2);
            }
            if (cVar == null) {
                this.f23619p = null;
                return;
            }
            this.f23607d.clear();
            this.f23608e.clear();
            C8549q qVar3 = new C8549q(cVar);
            this.f23619p = qVar3;
            qVar3.mo23850a(this);
            this.f23606c.mo24753i(this.f23619p);
        } else if (obj == C2326h0.f7291j) {
            C8525a aVar2 = this.f23622s;
            if (aVar2 != null) {
                aVar2.mo23862n(cVar);
                return;
            }
            C8549q qVar4 = new C8549q(cVar);
            this.f23622s = qVar4;
            qVar4.mo23850a(this);
            this.f23606c.mo24753i(this.f23622s);
        } else if (obj == C2326h0.f7286e && (cVar6 = this.f23624u) != null) {
            cVar6.mo23873c(cVar);
        } else if (obj == C2326h0.f7273G && (cVar5 = this.f23624u) != null) {
            cVar5.mo23876f(cVar);
        } else if (obj == C2326h0.f7274H && (cVar4 = this.f23624u) != null) {
            cVar4.mo23874d(cVar);
        } else if (obj == C2326h0.f7275I && (cVar3 = this.f23624u) != null) {
            cVar3.mo23875e(cVar);
        } else if (obj == C2326h0.f7276J && (cVar2 = this.f23624u) != null) {
            cVar2.mo23877g(cVar);
        }
    }

    /* renamed from: e */
    public void mo23471e(RectF rectF, Matrix matrix, boolean z) {
        this.f23609f.reset();
        for (int i = 0; i < this.f23612i.size(); i++) {
            this.f23609f.addPath(((C8322m) this.f23612i.get(i)).mo23480z(), matrix);
        }
        this.f23609f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    /* renamed from: f */
    public void mo23472f(C8738e eVar, int i, List list, C8738e eVar2) {
        C5807i.m23372k(eVar, i, list, eVar2, this);
    }

    public String getName() {
        return this.f23604a;
    }

    /* renamed from: h */
    public void mo23473h(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        if (!this.f23605b) {
            C2311c.m8884a("GradientFillContent#draw");
            this.f23609f.reset();
            for (int i2 = 0; i2 < this.f23612i.size(); i2++) {
                this.f23609f.addPath(((C8322m) this.f23612i.get(i2)).mo23480z(), matrix);
            }
            this.f23609f.computeBounds(this.f23611h, false);
            if (this.f23613j == C9015g.LINEAR) {
                shader = m31223j();
            } else {
                shader = m31224k();
            }
            shader.setLocalMatrix(matrix);
            this.f23610g.setShader(shader);
            C8525a aVar = this.f23618o;
            if (aVar != null) {
                this.f23610g.setColorFilter((ColorFilter) aVar.mo23856h());
            }
            C8525a aVar2 = this.f23622s;
            if (aVar2 != null) {
                float floatValue = ((Float) aVar2.mo23856h()).floatValue();
                if (floatValue == Utils.FLOAT_EPSILON) {
                    this.f23610g.setMaskFilter((MaskFilter) null);
                } else if (floatValue != this.f23623t) {
                    this.f23610g.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
                }
                this.f23623t = floatValue;
            }
            C8533c cVar = this.f23624u;
            if (cVar != null) {
                cVar.mo23872b(this.f23610g);
            }
            this.f23610g.setAlpha(C5807i.m23364c((int) ((((((float) i) / 255.0f) * ((float) ((Integer) this.f23615l.mo23856h()).intValue())) / 100.0f) * 255.0f), 0, C11051p3.f31759c));
            canvas.drawPath(this.f23609f, this.f23610g);
            C2311c.m8885b("GradientFillContent#draw");
        }
    }
}
