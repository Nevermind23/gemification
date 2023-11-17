package p389de;

import android.opengl.Matrix;
import com.github.mikephil.charting.utils.Utils;
import p389de.C12093j;
import p403ee.C12427a;
import p458id.C15600b;
import p473je.C15762d;
import p612td.C17928b;
import p651wd.C18505e;
import p651wd.C18513i;

/* renamed from: de.n */
public class C12103n extends C12107p {

    /* renamed from: C */
    private static final C15600b f35585C = C15600b.m56349a(C12103n.class.getSimpleName());

    /* renamed from: A */
    private C18513i f35586A = new C18513i(Integer.MAX_VALUE, new C12104a());

    /* renamed from: B */
    private long f35587B = Long.MIN_VALUE;

    /* renamed from: w */
    private int f35588w;

    /* renamed from: x */
    private C12427a f35589x;

    /* renamed from: y */
    private C15762d f35590y;

    /* renamed from: z */
    private C18505e f35591z;

    /* renamed from: de.n$a */
    class C12104a implements C18513i.C18514a {
        C12104a() {
        }

        /* renamed from: a */
        public C12105b create() {
            return new C12105b((C12104a) null);
        }
    }

    /* renamed from: de.n$b */
    public static class C12105b {

        /* renamed from: a */
        public long f35593a;

        /* renamed from: b */
        public long f35594b;

        /* renamed from: c */
        public float[] f35595c;

        /* synthetic */ C12105b(C12104a aVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public long m44409b() {
            return this.f35593a / 1000;
        }

        private C12105b() {
            this.f35595c = new float[16];
        }
    }

    public C12103n(C12102m mVar) {
        super(mVar.mo32281b());
    }

    /* renamed from: C */
    private void m44400C(C17928b bVar) {
        this.f35591z.mo46293e(bVar);
    }

    /* renamed from: D */
    private void m44401D(C12105b bVar) {
        boolean z;
        C12105b bVar2 = bVar;
        if (!mo32283A(bVar.m44409b())) {
            this.f35586A.mo46315f(bVar2);
            return;
        }
        if (this.f35606t == 1) {
            mo32256m(bVar2.f35594b);
        }
        if (this.f35587B == Long.MIN_VALUE) {
            this.f35587B = bVar.m44409b();
        }
        if (!mo32254k()) {
            if (bVar.m44409b() - this.f35587B > mo32252i()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                f35585C.mo42880h("onEvent -", "frameNumber:", Integer.valueOf(this.f35606t), "timestampUs:", Long.valueOf(bVar.m44409b()), "firstTimeUs:", Long.valueOf(this.f35587B), "- reached max length! deltaUs:", Long.valueOf(bVar.m44409b() - this.f35587B));
                mo32257n();
            }
        }
        C15600b bVar3 = f35585C;
        bVar3.mo42878c("onEvent -", "frameNumber:", Integer.valueOf(this.f35606t), "timestampUs:", Long.valueOf(bVar.m44409b()), "hasReachedMaxLength:", Boolean.valueOf(mo32254k()), "thread:", Thread.currentThread(), "- draining.");
        mo32250f(false);
        bVar3.mo42878c("onEvent -", "frameNumber:", Integer.valueOf(this.f35606t), "timestampUs:", Long.valueOf(bVar.m44409b()), "hasReachedMaxLength:", Boolean.valueOf(mo32254k()), "thread:", Thread.currentThread(), "- drawing.");
        float[] fArr = bVar2.f35595c;
        C12106o oVar = this.f35604r;
        float f = ((C12102m) oVar).f35582l;
        float f2 = ((C12102m) oVar).f35583m;
        Matrix.translateM(fArr, 0, (1.0f - f) / 2.0f, (1.0f - f2) / 2.0f, Utils.FLOAT_EPSILON);
        Matrix.scaleM(fArr, 0, f, f2, 1.0f);
        Matrix.translateM(fArr, 0, 0.5f, 0.5f, Utils.FLOAT_EPSILON);
        Matrix.rotateM(fArr, 0, (float) this.f35588w, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 1.0f);
        Matrix.translateM(fArr, 0, -0.5f, -0.5f, Utils.FLOAT_EPSILON);
        if (((C12102m) this.f35604r).mo32282c()) {
            C12106o oVar2 = this.f35604r;
            ((C12102m) oVar2).f35580j.mo47160a(((C12102m) oVar2).f35579i);
            Matrix.translateM(((C12102m) this.f35604r).f35580j.mo47161b(), 0, 0.5f, 0.5f, Utils.FLOAT_EPSILON);
            Matrix.rotateM(((C12102m) this.f35604r).f35580j.mo47161b(), 0, (float) ((C12102m) this.f35604r).f35581k, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 1.0f);
            Matrix.translateM(((C12102m) this.f35604r).f35580j.mo47161b(), 0, -0.5f, -0.5f, Utils.FLOAT_EPSILON);
        }
        bVar3.mo42878c("onEvent -", "frameNumber:", Integer.valueOf(this.f35606t), "timestampUs:", Long.valueOf(bVar.m44409b()), "hasReachedMaxLength:", Boolean.valueOf(mo32254k()), "thread:", Thread.currentThread(), "- gl rendering.");
        this.f35591z.mo46294f(fArr);
        this.f35591z.mo46289a(bVar.m44409b());
        if (((C12102m) this.f35604r).mo32282c()) {
            ((C12102m) this.f35604r).f35580j.mo47163d(bVar.m44409b());
        }
        this.f35590y.mo43164h(bVar2.f35593a);
        this.f35590y.mo43165k();
        this.f35586A.mo46315f(bVar2);
        bVar3.mo42878c("onEvent -", "frameNumber:", Integer.valueOf(this.f35606t), "timestampUs:", Long.valueOf(bVar.m44409b()), "hasReachedMaxLength:", Boolean.valueOf(mo32254k()), "thread:", Thread.currentThread(), "- gl rendered.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public boolean mo32283A(long j) {
        if (!super.mo32283A(j)) {
            f35585C.mo42878c("shouldRenderFrame - Dropping frame because of super()");
            return false;
        } else if (this.f35606t <= 10 || mo32253j("frame") <= 2) {
            return true;
        } else {
            f35585C.mo42878c("shouldRenderFrame - Dropping, we already have too many pending events:", Integer.valueOf(mo32253j("frame")));
            return false;
        }
    }

    /* renamed from: B */
    public C12105b mo32284B() {
        if (!this.f35586A.mo46314e()) {
            return (C12105b) this.f35586A.mo46313d();
        }
        throw new RuntimeException("Need more frames than this! Please increase the pool size.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo32258o(String str, Object obj) {
        str.hashCode();
        if (str.equals("filter")) {
            m44400C((C17928b) obj);
        } else if (str.equals("frame")) {
            m44401D((C12105b) obj);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo32233q(C12093j.C12094a aVar, long j) {
        C12106o oVar = this.f35604r;
        this.f35588w = ((C12102m) oVar).f35600e;
        ((C12102m) oVar).f35600e = 0;
        super.mo32233q(aVar, j);
        this.f35589x = new C12427a(((C12102m) this.f35604r).f35584n, 1);
        C15762d dVar = new C15762d(this.f35589x, this.f35605s, true);
        this.f35590y = dVar;
        dVar.mo43162f();
        this.f35591z = new C18505e(((C12102m) this.f35604r).f35578h);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo32236t() {
        super.mo32236t();
        this.f35586A.mo46311b();
        C15762d dVar = this.f35590y;
        if (dVar != null) {
            dVar.mo43163g();
            this.f35590y = null;
        }
        C18505e eVar = this.f35591z;
        if (eVar != null) {
            eVar.mo46292d();
            this.f35591z = null;
        }
        C12427a aVar = this.f35589x;
        if (aVar != null) {
            aVar.mo33036i();
            this.f35589x = null;
        }
    }
}
