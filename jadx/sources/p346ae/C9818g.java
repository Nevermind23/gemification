package p346ae;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.Matrix;
import com.github.mikephil.charting.utils.Utils;
import com.otaliastudios.cameraview.C11278a;
import p346ae.C9809d;
import p360be.C10254d;
import p360be.C10255e;
import p374ce.C10395a;
import p374ce.C10396b;
import p403ee.C12427a;
import p473je.C15762d;
import p612td.C17928b;
import p651wd.C18502b;
import p651wd.C18505e;
import p651wd.C18516k;
import p693zd.C19009a;
import p693zd.C19011b;

/* renamed from: ae.g */
public class C9818g extends C9821h {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C10254d f26655h;

    /* renamed from: i */
    private C10395a f26656i;

    /* renamed from: j */
    private C19009a f26657j;

    /* renamed from: k */
    private boolean f26658k;

    /* renamed from: l */
    private C19011b f26659l;

    /* renamed from: m */
    private C18505e f26660m;

    /* renamed from: ae.g$a */
    class C9819a implements C10255e {
        C9819a() {
        }

        /* renamed from: a */
        public void mo26314a(SurfaceTexture surfaceTexture, int i, float f, float f2) {
            C9818g.this.f26655h.mo26832b(this);
            C9818g.this.mo26311f(surfaceTexture, i, f, f2);
        }

        /* renamed from: d */
        public void mo26315d(int i) {
            C9818g.this.mo26312g(i);
        }

        /* renamed from: f */
        public void mo26316f(C17928b bVar) {
            C9818g.this.mo26310e(bVar);
        }
    }

    /* renamed from: ae.g$b */
    class C9820b implements Runnable {

        /* renamed from: d */
        final /* synthetic */ SurfaceTexture f26662d;

        /* renamed from: e */
        final /* synthetic */ int f26663e;

        /* renamed from: f */
        final /* synthetic */ float f26664f;

        /* renamed from: g */
        final /* synthetic */ float f26665g;

        /* renamed from: h */
        final /* synthetic */ EGLContext f26666h;

        C9820b(SurfaceTexture surfaceTexture, int i, float f, float f2, EGLContext eGLContext) {
            this.f26662d = surfaceTexture;
            this.f26663e = i;
            this.f26664f = f;
            this.f26665g = f2;
            this.f26666h = eGLContext;
        }

        public void run() {
            C9818g.this.mo26313h(this.f26662d, this.f26663e, this.f26664f, this.f26665g, this.f26666h);
        }
    }

    public C9818g(C11278a.C11279a aVar, C9809d.C9810a aVar2, C10254d dVar, C10395a aVar3, C19009a aVar4) {
        super(aVar, aVar2);
        boolean z;
        this.f26655h = dVar;
        this.f26656i = aVar3;
        this.f26657j = aVar4;
        if (aVar4 == null || !aVar4.mo47158b(C19009a.C19010a.PICTURE_SNAPSHOT)) {
            z = false;
        } else {
            z = true;
        }
        this.f26658k = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo26296b() {
        this.f26656i = null;
        super.mo26296b();
    }

    /* renamed from: c */
    public void mo26297c() {
        this.f26655h.mo26833c(new C9819a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo26310e(C17928b bVar) {
        this.f26660m.mo46293e(bVar.mo45590a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo26311f(SurfaceTexture surfaceTexture, int i, float f, float f2) {
        C18516k.m63023b(new C9820b(surfaceTexture, i, f, f2, EGL14.eglGetCurrentContext()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo26312g(int i) {
        this.f26660m = new C18505e(i);
        Rect a = C18502b.m62989a(this.f26634d.f32747d, this.f26656i);
        this.f26634d.f32747d = new C10396b(a.width(), a.height());
        if (this.f26658k) {
            this.f26659l = new C19011b(this.f26657j, this.f26634d.f32747d);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo26313h(SurfaceTexture surfaceTexture, int i, float f, float f2, EGLContext eGLContext) {
        float f3 = f;
        float f4 = f2;
        SurfaceTexture surfaceTexture2 = new SurfaceTexture(9999);
        surfaceTexture2.setDefaultBufferSize(this.f26634d.f32747d.mo27062e(), this.f26634d.f32747d.mo27060c());
        C12427a aVar = new C12427a(eGLContext, 1);
        C15762d dVar = new C15762d(aVar, surfaceTexture2);
        dVar.mo43162f();
        float[] c = this.f26660m.mo46291c();
        surfaceTexture.getTransformMatrix(c);
        Matrix.translateM(c, 0, (1.0f - f3) / 2.0f, (1.0f - f4) / 2.0f, Utils.FLOAT_EPSILON);
        Matrix.scaleM(c, 0, f3, f4, 1.0f);
        Matrix.translateM(c, 0, 0.5f, 0.5f, Utils.FLOAT_EPSILON);
        Matrix.rotateM(c, 0, (float) (i + this.f26634d.f32746c), Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 1.0f);
        Matrix.scaleM(c, 0, 1.0f, -1.0f, 1.0f);
        Matrix.translateM(c, 0, -0.5f, -0.5f, Utils.FLOAT_EPSILON);
        if (this.f26658k) {
            this.f26659l.mo47160a(C19009a.C19010a.PICTURE_SNAPSHOT);
            Matrix.translateM(this.f26659l.mo47161b(), 0, 0.5f, 0.5f, Utils.FLOAT_EPSILON);
            Matrix.rotateM(this.f26659l.mo47161b(), 0, (float) this.f26634d.f32746c, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 1.0f);
            Matrix.scaleM(this.f26659l.mo47161b(), 0, 1.0f, -1.0f, 1.0f);
            Matrix.translateM(this.f26659l.mo47161b(), 0, -0.5f, -0.5f, Utils.FLOAT_EPSILON);
        }
        this.f26634d.f32746c = 0;
        long timestamp = surfaceTexture.getTimestamp() / 1000;
        C9821h.f26668g.mo42878c("takeFrame:", "timestampUs:", Long.valueOf(timestamp));
        this.f26660m.mo46289a(timestamp);
        if (this.f26658k) {
            this.f26659l.mo47163d(timestamp);
        }
        this.f26634d.f32749f = dVar.mo43166i(Bitmap.CompressFormat.JPEG);
        dVar.mo43163g();
        this.f26660m.mo46292d();
        surfaceTexture2.release();
        if (this.f26658k) {
            this.f26659l.mo47162c();
        }
        aVar.mo33036i();
        mo26296b();
    }
}
