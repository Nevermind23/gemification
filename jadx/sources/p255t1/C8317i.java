package p255t1;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.C2315d0;
import com.airbnb.lottie.C2326h0;
import p061e2.C6015c;
import p268u1.C8525a;
import p268u1.C8549q;
import p319y1.C9012d;
import p319y1.C9014f;
import p319y1.C9015g;
import p331z1.C9169b;

/* renamed from: t1.i */
public class C8317i extends C8307a {

    /* renamed from: A */
    private final C8525a f23625A;

    /* renamed from: B */
    private C8549q f23626B;

    /* renamed from: r */
    private final String f23627r;

    /* renamed from: s */
    private final boolean f23628s;

    /* renamed from: t */
    private final LongSparseArray f23629t = new LongSparseArray();

    /* renamed from: u */
    private final LongSparseArray f23630u = new LongSparseArray();

    /* renamed from: v */
    private final RectF f23631v = new RectF();

    /* renamed from: w */
    private final C9015g f23632w;

    /* renamed from: x */
    private final int f23633x;

    /* renamed from: y */
    private final C8525a f23634y;

    /* renamed from: z */
    private final C8525a f23635z;

    public C8317i(C2315d0 d0Var, C9169b bVar, C9014f fVar) {
        super(d0Var, bVar, fVar.mo24434b().mo24510b(), fVar.mo24439g().mo24511b(), fVar.mo24441i(), fVar.mo24443k(), fVar.mo24445m(), fVar.mo24440h(), fVar.mo24435c());
        this.f23627r = fVar.mo24442j();
        this.f23632w = fVar.mo24438f();
        this.f23628s = fVar.mo24446n();
        this.f23633x = (int) (d0Var.mo7461G().mo7545d() / 32.0f);
        C8525a a = fVar.mo24437e().mo24353a();
        this.f23634y = a;
        a.mo23850a(this);
        bVar.mo24753i(a);
        C8525a a2 = fVar.mo24444l().mo24353a();
        this.f23635z = a2;
        a2.mo23850a(this);
        bVar.mo24753i(a2);
        C8525a a3 = fVar.mo24436d().mo24353a();
        this.f23625A = a3;
        a3.mo23850a(this);
        bVar.mo24753i(a3);
    }

    /* renamed from: j */
    private int[] m31231j(int[] iArr) {
        C8549q qVar = this.f23626B;
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

    /* renamed from: k */
    private int m31232k() {
        int i;
        int round = Math.round(this.f23635z.mo23855f() * ((float) this.f23633x));
        int round2 = Math.round(this.f23625A.mo23855f() * ((float) this.f23633x));
        int round3 = Math.round(this.f23634y.mo23855f() * ((float) this.f23633x));
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

    /* renamed from: l */
    private LinearGradient m31233l() {
        long k = (long) m31232k();
        LinearGradient linearGradient = (LinearGradient) this.f23629t.get(k);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointF = (PointF) this.f23635z.mo23856h();
        PointF pointF2 = (PointF) this.f23625A.mo23856h();
        C9012d dVar = (C9012d) this.f23634y.mo23856h();
        LinearGradient linearGradient2 = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, m31231j(dVar.mo24422c()), dVar.mo24423d(), Shader.TileMode.CLAMP);
        this.f23629t.put(k, linearGradient2);
        return linearGradient2;
    }

    /* renamed from: m */
    private RadialGradient m31234m() {
        long k = (long) m31232k();
        RadialGradient radialGradient = (RadialGradient) this.f23630u.get(k);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointF = (PointF) this.f23635z.mo23856h();
        PointF pointF2 = (PointF) this.f23625A.mo23856h();
        C9012d dVar = (C9012d) this.f23634y.mo23856h();
        int[] j = m31231j(dVar.mo24422c());
        float[] d = dVar.mo24423d();
        float f = pointF.x;
        float f2 = pointF.y;
        RadialGradient radialGradient2 = new RadialGradient(f, f2, (float) Math.hypot((double) (pointF2.x - f), (double) (pointF2.y - f2)), j, d, Shader.TileMode.CLAMP);
        this.f23630u.put(k, radialGradient2);
        return radialGradient2;
    }

    /* renamed from: c */
    public void mo23470c(Object obj, C6015c cVar) {
        super.mo23470c(obj, cVar);
        if (obj == C2326h0.f7278L) {
            C8549q qVar = this.f23626B;
            if (qVar != null) {
                this.f23557f.mo24747H(qVar);
            }
            if (cVar == null) {
                this.f23626B = null;
                return;
            }
            C8549q qVar2 = new C8549q(cVar);
            this.f23626B = qVar2;
            qVar2.mo23850a(this);
            this.f23557f.mo24753i(this.f23626B);
        }
    }

    public String getName() {
        return this.f23627r;
    }

    /* renamed from: h */
    public void mo23473h(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        if (!this.f23628s) {
            mo23471e(this.f23631v, matrix, false);
            if (this.f23632w == C9015g.LINEAR) {
                shader = m31233l();
            } else {
                shader = m31234m();
            }
            shader.setLocalMatrix(matrix);
            this.f23560i.setShader(shader);
            super.mo23473h(canvas, matrix, i);
        }
    }
}
