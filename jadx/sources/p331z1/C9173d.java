package p331z1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.airbnb.lottie.C2315d0;
import com.airbnb.lottie.C2320e0;
import com.airbnb.lottie.C2326h0;
import com.github.mikephil.charting.utils.Utils;
import p048d2.C5808j;
import p061e2.C6015c;
import p242s1.C8100a;
import p268u1.C8525a;
import p268u1.C8549q;

/* renamed from: z1.d */
public class C9173d extends C9169b {

    /* renamed from: D */
    private final Paint f25455D = new C8100a(3);

    /* renamed from: E */
    private final Rect f25456E = new Rect();

    /* renamed from: F */
    private final Rect f25457F = new Rect();

    /* renamed from: G */
    private final C2320e0 f25458G;

    /* renamed from: H */
    private C8525a f25459H;

    /* renamed from: I */
    private C8525a f25460I;

    C9173d(C2315d0 d0Var, C9174e eVar) {
        super(d0Var, eVar);
        this.f25458G = d0Var.mo7470M(eVar.mo24772m());
    }

    /* renamed from: P */
    private Bitmap m33874P() {
        Bitmap bitmap;
        C8525a aVar = this.f25460I;
        if (aVar != null && (bitmap = (Bitmap) aVar.mo23856h()) != null) {
            return bitmap;
        }
        Bitmap E = this.f25435p.mo7457E(this.f25436q.mo24772m());
        if (E != null) {
            return E;
        }
        C2320e0 e0Var = this.f25458G;
        if (e0Var != null) {
            return e0Var.mo7531a();
        }
        return null;
    }

    /* renamed from: c */
    public void mo23470c(Object obj, C6015c cVar) {
        super.mo23470c(obj, cVar);
        if (obj == C2326h0.f7277K) {
            if (cVar == null) {
                this.f25459H = null;
            } else {
                this.f25459H = new C8549q(cVar);
            }
        } else if (obj != C2326h0.f7280N) {
        } else {
            if (cVar == null) {
                this.f25460I = null;
            } else {
                this.f25460I = new C8549q(cVar);
            }
        }
    }

    /* renamed from: e */
    public void mo23471e(RectF rectF, Matrix matrix, boolean z) {
        super.mo23471e(rectF, matrix, z);
        if (this.f25458G != null) {
            float e = C5808j.m23377e();
            rectF.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, ((float) this.f25458G.mo7535e()) * e, ((float) this.f25458G.mo7533c()) * e);
            this.f25434o.mapRect(rectF);
        }
    }

    /* renamed from: t */
    public void mo24754t(Canvas canvas, Matrix matrix, int i) {
        Bitmap P = m33874P();
        if (P != null && !P.isRecycled() && this.f25458G != null) {
            float e = C5808j.m23377e();
            this.f25455D.setAlpha(i);
            C8525a aVar = this.f25459H;
            if (aVar != null) {
                this.f25455D.setColorFilter((ColorFilter) aVar.mo23856h());
            }
            canvas.save();
            canvas.concat(matrix);
            this.f25456E.set(0, 0, P.getWidth(), P.getHeight());
            if (this.f25435p.mo7472N()) {
                this.f25457F.set(0, 0, (int) (((float) this.f25458G.mo7535e()) * e), (int) (((float) this.f25458G.mo7533c()) * e));
            } else {
                this.f25457F.set(0, 0, (int) (((float) P.getWidth()) * e), (int) (((float) P.getHeight()) * e));
            }
            canvas.drawBitmap(P, this.f25456E, this.f25457F, this.f25455D);
            canvas.restore();
        }
    }
}
