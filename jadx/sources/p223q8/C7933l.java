package p223q8;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: q8.l */
public class C7933l {

    /* renamed from: a */
    private final C7937m[] f22950a = new C7937m[4];

    /* renamed from: b */
    private final Matrix[] f22951b = new Matrix[4];

    /* renamed from: c */
    private final Matrix[] f22952c = new Matrix[4];

    /* renamed from: d */
    private final PointF f22953d = new PointF();

    /* renamed from: e */
    private final Path f22954e = new Path();

    /* renamed from: f */
    private final Path f22955f = new Path();

    /* renamed from: g */
    private final C7937m f22956g = new C7937m();

    /* renamed from: h */
    private final float[] f22957h = new float[2];

    /* renamed from: i */
    private final float[] f22958i = new float[2];

    /* renamed from: j */
    private final Path f22959j = new Path();

    /* renamed from: k */
    private final Path f22960k = new Path();

    /* renamed from: l */
    private boolean f22961l = true;

    /* renamed from: q8.l$a */
    private static class C7934a {

        /* renamed from: a */
        static final C7933l f22962a = new C7933l();
    }

    /* renamed from: q8.l$b */
    public interface C7935b {
        /* renamed from: a */
        void mo22968a(C7937m mVar, Matrix matrix, int i);

        /* renamed from: b */
        void mo22969b(C7937m mVar, Matrix matrix, int i);
    }

    /* renamed from: q8.l$c */
    static final class C7936c {

        /* renamed from: a */
        public final C7929k f22963a;

        /* renamed from: b */
        public final Path f22964b;

        /* renamed from: c */
        public final RectF f22965c;

        /* renamed from: d */
        public final C7935b f22966d;

        /* renamed from: e */
        public final float f22967e;

        C7936c(C7929k kVar, float f, RectF rectF, C7935b bVar, Path path) {
            this.f22966d = bVar;
            this.f22963a = kVar;
            this.f22967e = f;
            this.f22965c = rectF;
            this.f22964b = path;
        }
    }

    public C7933l() {
        for (int i = 0; i < 4; i++) {
            this.f22950a[i] = new C7937m();
            this.f22951b[i] = new Matrix();
            this.f22952c[i] = new Matrix();
        }
    }

    /* renamed from: a */
    private float m30032a(int i) {
        return (float) ((i + 1) * 90);
    }

    /* renamed from: b */
    private void m30033b(C7936c cVar, int i) {
        this.f22957h[0] = this.f22950a[i].mo23019k();
        this.f22957h[1] = this.f22950a[i].mo23020l();
        this.f22951b[i].mapPoints(this.f22957h);
        if (i == 0) {
            Path path = cVar.f22964b;
            float[] fArr = this.f22957h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.f22964b;
            float[] fArr2 = this.f22957h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f22950a[i].mo23014d(this.f22951b[i], cVar.f22964b);
        C7935b bVar = cVar.f22966d;
        if (bVar != null) {
            bVar.mo22968a(this.f22950a[i], this.f22951b[i], i);
        }
    }

    /* renamed from: c */
    private void m30034c(C7936c cVar, int i) {
        int i2 = (i + 1) % 4;
        this.f22957h[0] = this.f22950a[i].mo23017i();
        this.f22957h[1] = this.f22950a[i].mo23018j();
        this.f22951b[i].mapPoints(this.f22957h);
        this.f22958i[0] = this.f22950a[i2].mo23019k();
        this.f22958i[1] = this.f22950a[i2].mo23020l();
        this.f22951b[i2].mapPoints(this.f22958i);
        float[] fArr = this.f22957h;
        float f = fArr[0];
        float[] fArr2 = this.f22958i;
        float max = Math.max(((float) Math.hypot((double) (f - fArr2[0]), (double) (fArr[1] - fArr2[1]))) - 0.001f, Utils.FLOAT_EPSILON);
        float i3 = m30038i(cVar.f22965c, i);
        this.f22956g.mo23022n(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
        C7921f j = m30039j(i, cVar.f22963a);
        j.mo22925b(max, i3, cVar.f22967e, this.f22956g);
        this.f22959j.reset();
        this.f22956g.mo23014d(this.f22952c[i], this.f22959j);
        if (!this.f22961l || (!j.mo22924a() && !m30041l(this.f22959j, i) && !m30041l(this.f22959j, i2))) {
            this.f22956g.mo23014d(this.f22952c[i], cVar.f22964b);
        } else {
            Path path = this.f22959j;
            path.op(path, this.f22955f, Path.Op.DIFFERENCE);
            this.f22957h[0] = this.f22956g.mo23019k();
            this.f22957h[1] = this.f22956g.mo23020l();
            this.f22952c[i].mapPoints(this.f22957h);
            Path path2 = this.f22954e;
            float[] fArr3 = this.f22957h;
            path2.moveTo(fArr3[0], fArr3[1]);
            this.f22956g.mo23014d(this.f22952c[i], this.f22954e);
        }
        C7935b bVar = cVar.f22966d;
        if (bVar != null) {
            bVar.mo22969b(this.f22956g, this.f22952c[i], i);
        }
    }

    /* renamed from: f */
    private void m30035f(int i, RectF rectF, PointF pointF) {
        if (i == 1) {
            pointF.set(rectF.right, rectF.bottom);
        } else if (i == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    /* renamed from: g */
    private C7918c m30036g(int i, C7929k kVar) {
        if (i == 1) {
            return kVar.mo22979l();
        }
        if (i == 2) {
            return kVar.mo22977j();
        }
        if (i != 3) {
            return kVar.mo22986t();
        }
        return kVar.mo22984r();
    }

    /* renamed from: h */
    private C7919d m30037h(int i, C7929k kVar) {
        if (i == 1) {
            return kVar.mo22978k();
        }
        if (i == 2) {
            return kVar.mo22976i();
        }
        if (i != 3) {
            return kVar.mo22985s();
        }
        return kVar.mo22983q();
    }

    /* renamed from: i */
    private float m30038i(RectF rectF, int i) {
        float[] fArr = this.f22957h;
        C7937m mVar = this.f22950a[i];
        fArr[0] = mVar.f22970c;
        fArr[1] = mVar.f22971d;
        this.f22951b[i].mapPoints(fArr);
        if (i == 1 || i == 3) {
            return Math.abs(rectF.centerX() - this.f22957h[0]);
        }
        return Math.abs(rectF.centerY() - this.f22957h[1]);
    }

    /* renamed from: j */
    private C7921f m30039j(int i, C7929k kVar) {
        if (i == 1) {
            return kVar.mo22975h();
        }
        if (i == 2) {
            return kVar.mo22980n();
        }
        if (i != 3) {
            return kVar.mo22981o();
        }
        return kVar.mo22982p();
    }

    /* renamed from: k */
    public static C7933l m30040k() {
        return C7934a.f22962a;
    }

    /* renamed from: l */
    private boolean m30041l(Path path, int i) {
        this.f22960k.reset();
        this.f22950a[i].mo23014d(this.f22951b[i], this.f22960k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f22960k.computeBounds(rectF, true);
        path.op(this.f22960k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty()) {
            return true;
        }
        if (rectF.width() <= 1.0f || rectF.height() <= 1.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    private void m30042m(C7936c cVar, int i) {
        m30037h(i, cVar.f22963a).mo22923b(this.f22950a[i], 90.0f, cVar.f22967e, cVar.f22965c, m30036g(i, cVar.f22963a));
        float a = m30032a(i);
        this.f22951b[i].reset();
        m30035f(i, cVar.f22965c, this.f22953d);
        Matrix matrix = this.f22951b[i];
        PointF pointF = this.f22953d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f22951b[i].preRotate(a);
    }

    /* renamed from: n */
    private void m30043n(int i) {
        this.f22957h[0] = this.f22950a[i].mo23017i();
        this.f22957h[1] = this.f22950a[i].mo23018j();
        this.f22951b[i].mapPoints(this.f22957h);
        float a = m30032a(i);
        this.f22952c[i].reset();
        Matrix matrix = this.f22952c[i];
        float[] fArr = this.f22957h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f22952c[i].preRotate(a);
    }

    /* renamed from: d */
    public void mo23011d(C7929k kVar, float f, RectF rectF, Path path) {
        mo23012e(kVar, f, rectF, (C7935b) null, path);
    }

    /* renamed from: e */
    public void mo23012e(C7929k kVar, float f, RectF rectF, C7935b bVar, Path path) {
        path.rewind();
        this.f22954e.rewind();
        this.f22955f.rewind();
        this.f22955f.addRect(rectF, Path.Direction.CW);
        C7936c cVar = new C7936c(kVar, f, rectF, bVar, path);
        for (int i = 0; i < 4; i++) {
            m30042m(cVar, i);
            m30043n(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            m30033b(cVar, i2);
            m30034c(cVar, i2);
        }
        path.close();
        this.f22954e.close();
        if (!this.f22954e.isEmpty()) {
            path.op(this.f22954e, Path.Op.UNION);
        }
    }
}
