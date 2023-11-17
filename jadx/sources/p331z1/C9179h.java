package p331z1;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C2315d0;
import com.airbnb.lottie.C2326h0;
import com.github.mikephil.charting.utils.Utils;
import p061e2.C6015c;
import p242s1.C8100a;
import p268u1.C8525a;
import p268u1.C8549q;

/* renamed from: z1.h */
public class C9179h extends C9169b {

    /* renamed from: D */
    private final RectF f25502D = new RectF();

    /* renamed from: E */
    private final Paint f25503E;

    /* renamed from: F */
    private final float[] f25504F;

    /* renamed from: G */
    private final Path f25505G;

    /* renamed from: H */
    private final C9174e f25506H;

    /* renamed from: I */
    private C8525a f25507I;

    C9179h(C2315d0 d0Var, C9174e eVar) {
        super(d0Var, eVar);
        C8100a aVar = new C8100a();
        this.f25503E = aVar;
        this.f25504F = new float[8];
        this.f25505G = new Path();
        this.f25506H = eVar;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(eVar.mo24774o());
    }

    /* renamed from: c */
    public void mo23470c(Object obj, C6015c cVar) {
        super.mo23470c(obj, cVar);
        if (obj != C2326h0.f7277K) {
            return;
        }
        if (cVar == null) {
            this.f25507I = null;
        } else {
            this.f25507I = new C8549q(cVar);
        }
    }

    /* renamed from: e */
    public void mo23471e(RectF rectF, Matrix matrix, boolean z) {
        super.mo23471e(rectF, matrix, z);
        this.f25502D.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) this.f25506H.mo24776q(), (float) this.f25506H.mo24775p());
        this.f25434o.mapRect(this.f25502D);
        rectF.set(this.f25502D);
    }

    /* renamed from: t */
    public void mo24754t(Canvas canvas, Matrix matrix, int i) {
        int i2;
        int alpha = Color.alpha(this.f25506H.mo24774o());
        if (alpha != 0) {
            if (this.f25443x.mo23910h() == null) {
                i2 = 100;
            } else {
                i2 = ((Integer) this.f25443x.mo23910h().mo23856h()).intValue();
            }
            int i3 = (int) ((((float) i) / 255.0f) * (((((float) alpha) / 255.0f) * ((float) i2)) / 100.0f) * 255.0f);
            this.f25503E.setAlpha(i3);
            C8525a aVar = this.f25507I;
            if (aVar != null) {
                this.f25503E.setColorFilter((ColorFilter) aVar.mo23856h());
            }
            if (i3 > 0) {
                float[] fArr = this.f25504F;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                fArr[2] = (float) this.f25506H.mo24776q();
                float[] fArr2 = this.f25504F;
                fArr2[3] = 0.0f;
                fArr2[4] = (float) this.f25506H.mo24776q();
                this.f25504F[5] = (float) this.f25506H.mo24775p();
                float[] fArr3 = this.f25504F;
                fArr3[6] = 0.0f;
                fArr3[7] = (float) this.f25506H.mo24775p();
                matrix.mapPoints(this.f25504F);
                this.f25505G.reset();
                Path path = this.f25505G;
                float[] fArr4 = this.f25504F;
                path.moveTo(fArr4[0], fArr4[1]);
                Path path2 = this.f25505G;
                float[] fArr5 = this.f25504F;
                path2.lineTo(fArr5[2], fArr5[3]);
                Path path3 = this.f25505G;
                float[] fArr6 = this.f25504F;
                path3.lineTo(fArr6[4], fArr6[5]);
                Path path4 = this.f25505G;
                float[] fArr7 = this.f25504F;
                path4.lineTo(fArr7[6], fArr7[7]);
                Path path5 = this.f25505G;
                float[] fArr8 = this.f25504F;
                path5.lineTo(fArr8[0], fArr8[1]);
                this.f25505G.close();
                canvas.drawPath(this.f25505G, this.f25503E);
            }
        }
    }
}
