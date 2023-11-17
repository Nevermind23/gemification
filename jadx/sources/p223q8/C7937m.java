package p223q8;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;
import p210p8.C7762a;

/* renamed from: q8.m */
public class C7937m {

    /* renamed from: a */
    public float f22968a;

    /* renamed from: b */
    public float f22969b;

    /* renamed from: c */
    public float f22970c;

    /* renamed from: d */
    public float f22971d;

    /* renamed from: e */
    public float f22972e;

    /* renamed from: f */
    public float f22973f;

    /* renamed from: g */
    private final List f22974g = new ArrayList();

    /* renamed from: h */
    private final List f22975h = new ArrayList();

    /* renamed from: i */
    private boolean f22976i;

    /* renamed from: q8.m$a */
    class C7938a extends C7944g {

        /* renamed from: c */
        final /* synthetic */ List f22977c;

        /* renamed from: d */
        final /* synthetic */ Matrix f22978d;

        C7938a(List list, Matrix matrix) {
            this.f22977c = list;
            this.f22978d = matrix;
        }

        /* renamed from: a */
        public void mo23024a(Matrix matrix, C7762a aVar, int i, Canvas canvas) {
            for (C7944g a : this.f22977c) {
                a.mo23024a(this.f22978d, aVar, i, canvas);
            }
        }
    }

    /* renamed from: q8.m$b */
    static class C7939b extends C7944g {

        /* renamed from: c */
        private final C7941d f22980c;

        public C7939b(C7941d dVar) {
            this.f22980c = dVar;
        }

        /* renamed from: a */
        public void mo23024a(Matrix matrix, C7762a aVar, int i, Canvas canvas) {
            float h = this.f22980c.m30084m();
            float i2 = this.f22980c.m30085n();
            aVar.mo22520a(canvas, matrix, new RectF(this.f22980c.m30082k(), this.f22980c.m30086o(), this.f22980c.m30083l(), this.f22980c.m30081j()), i, h, i2);
        }
    }

    /* renamed from: q8.m$c */
    static class C7940c extends C7944g {

        /* renamed from: c */
        private final C7942e f22981c;

        /* renamed from: d */
        private final float f22982d;

        /* renamed from: e */
        private final float f22983e;

        public C7940c(C7942e eVar, float f, float f2) {
            this.f22981c = eVar;
            this.f22982d = f;
            this.f22983e = f2;
        }

        /* renamed from: a */
        public void mo23024a(Matrix matrix, C7762a aVar, int i, Canvas canvas) {
            RectF rectF = new RectF(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) Math.hypot((double) (this.f22981c.f22992c - this.f22983e), (double) (this.f22981c.f22991b - this.f22982d)), Utils.FLOAT_EPSILON);
            this.f22995a.set(matrix);
            this.f22995a.preTranslate(this.f22982d, this.f22983e);
            this.f22995a.preRotate(mo23025c());
            aVar.mo22521b(canvas, this.f22995a, rectF, i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public float mo23025c() {
            return (float) Math.toDegrees(Math.atan((double) ((this.f22981c.f22992c - this.f22983e) / (this.f22981c.f22991b - this.f22982d))));
        }
    }

    /* renamed from: q8.m$d */
    public static class C7941d extends C7943f {

        /* renamed from: h */
        private static final RectF f22984h = new RectF();

        /* renamed from: b */
        public float f22985b;

        /* renamed from: c */
        public float f22986c;

        /* renamed from: d */
        public float f22987d;

        /* renamed from: e */
        public float f22988e;

        /* renamed from: f */
        public float f22989f;

        /* renamed from: g */
        public float f22990g;

        public C7941d(float f, float f2, float f3, float f4) {
            m30088q(f);
            m30092u(f2);
            m30089r(f3);
            m30087p(f4);
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public float m30081j() {
            return this.f22988e;
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public float m30082k() {
            return this.f22985b;
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public float m30083l() {
            return this.f22987d;
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public float m30084m() {
            return this.f22989f;
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public float m30085n() {
            return this.f22990g;
        }

        /* access modifiers changed from: private */
        /* renamed from: o */
        public float m30086o() {
            return this.f22986c;
        }

        /* renamed from: p */
        private void m30087p(float f) {
            this.f22988e = f;
        }

        /* renamed from: q */
        private void m30088q(float f) {
            this.f22985b = f;
        }

        /* renamed from: r */
        private void m30089r(float f) {
            this.f22987d = f;
        }

        /* access modifiers changed from: private */
        /* renamed from: s */
        public void m30090s(float f) {
            this.f22989f = f;
        }

        /* access modifiers changed from: private */
        /* renamed from: t */
        public void m30091t(float f) {
            this.f22990g = f;
        }

        /* renamed from: u */
        private void m30092u(float f) {
            this.f22986c = f;
        }

        /* renamed from: a */
        public void mo23026a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f22993a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f22984h;
            rectF.set(m30082k(), m30086o(), m30083l(), m30081j());
            path.arcTo(rectF, m30084m(), m30085n(), false);
            path.transform(matrix);
        }
    }

    /* renamed from: q8.m$e */
    public static class C7942e extends C7943f {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public float f22991b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public float f22992c;

        /* renamed from: a */
        public void mo23026a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f22993a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f22991b, this.f22992c);
            path.transform(matrix);
        }
    }

    /* renamed from: q8.m$f */
    public static abstract class C7943f {

        /* renamed from: a */
        protected final Matrix f22993a = new Matrix();

        /* renamed from: a */
        public abstract void mo23026a(Matrix matrix, Path path);
    }

    /* renamed from: q8.m$g */
    static abstract class C7944g {

        /* renamed from: b */
        static final Matrix f22994b = new Matrix();

        /* renamed from: a */
        final Matrix f22995a = new Matrix();

        C7944g() {
        }

        /* renamed from: a */
        public abstract void mo23024a(Matrix matrix, C7762a aVar, int i, Canvas canvas);

        /* renamed from: b */
        public final void mo23027b(C7762a aVar, int i, Canvas canvas) {
            mo23024a(f22994b, aVar, i, canvas);
        }
    }

    public C7937m() {
        mo23022n(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
    }

    /* renamed from: b */
    private void m30048b(float f) {
        if (m30050g() != f) {
            float g = ((f - m30050g()) + 360.0f) % 360.0f;
            if (g <= 180.0f) {
                C7941d dVar = new C7941d(mo23017i(), mo23018j(), mo23017i(), mo23018j());
                dVar.m30090s(m30050g());
                dVar.m30091t(g);
                this.f22975h.add(new C7939b(dVar));
                m30052p(f);
            }
        }
    }

    /* renamed from: c */
    private void m30049c(C7944g gVar, float f, float f2) {
        m30048b(f);
        this.f22975h.add(gVar);
        m30052p(f2);
    }

    /* renamed from: g */
    private float m30050g() {
        return this.f22972e;
    }

    /* renamed from: h */
    private float m30051h() {
        return this.f22973f;
    }

    /* renamed from: p */
    private void m30052p(float f) {
        this.f22972e = f;
    }

    /* renamed from: q */
    private void m30053q(float f) {
        this.f22973f = f;
    }

    /* renamed from: r */
    private void m30054r(float f) {
        this.f22970c = f;
    }

    /* renamed from: s */
    private void m30055s(float f) {
        this.f22971d = f;
    }

    /* renamed from: t */
    private void m30056t(float f) {
        this.f22968a = f;
    }

    /* renamed from: u */
    private void m30057u(float f) {
        this.f22969b = f;
    }

    /* renamed from: a */
    public void mo23013a(float f, float f2, float f3, float f4, float f5, float f6) {
        boolean z;
        float f7;
        C7941d dVar = new C7941d(f, f2, f3, f4);
        dVar.m30090s(f5);
        dVar.m30091t(f6);
        this.f22974g.add(dVar);
        C7939b bVar = new C7939b(dVar);
        float f8 = f5 + f6;
        if (f6 < Utils.FLOAT_EPSILON) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f5 = (f5 + 180.0f) % 360.0f;
        }
        if (z) {
            f7 = (180.0f + f8) % 360.0f;
        } else {
            f7 = f8;
        }
        m30049c(bVar, f5, f7);
        double d = (double) f8;
        m30054r(((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))));
        m30055s(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))));
    }

    /* renamed from: d */
    public void mo23014d(Matrix matrix, Path path) {
        int size = this.f22974g.size();
        for (int i = 0; i < size; i++) {
            ((C7943f) this.f22974g.get(i)).mo23026a(matrix, path);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo23015e() {
        return this.f22976i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C7944g mo23016f(Matrix matrix) {
        m30048b(m30051h());
        return new C7938a(new ArrayList(this.f22975h), new Matrix(matrix));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public float mo23017i() {
        return this.f22970c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public float mo23018j() {
        return this.f22971d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public float mo23019k() {
        return this.f22968a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public float mo23020l() {
        return this.f22969b;
    }

    /* renamed from: m */
    public void mo23021m(float f, float f2) {
        C7942e eVar = new C7942e();
        float unused = eVar.f22991b = f;
        float unused2 = eVar.f22992c = f2;
        this.f22974g.add(eVar);
        C7940c cVar = new C7940c(eVar, mo23017i(), mo23018j());
        m30049c(cVar, cVar.mo23025c() + 270.0f, cVar.mo23025c() + 270.0f);
        m30054r(f);
        m30055s(f2);
    }

    /* renamed from: n */
    public void mo23022n(float f, float f2) {
        mo23023o(f, f2, 270.0f, Utils.FLOAT_EPSILON);
    }

    /* renamed from: o */
    public void mo23023o(float f, float f2, float f3, float f4) {
        m30056t(f);
        m30057u(f2);
        m30054r(f);
        m30055s(f2);
        m30052p(f3);
        m30053q((f3 + f4) % 360.0f);
        this.f22974g.clear();
        this.f22975h.clear();
        this.f22976i = false;
    }
}
