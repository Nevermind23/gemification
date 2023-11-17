package p360be;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import com.github.mikephil.charting.utils.Utils;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import p360be.C10241a;
import p374ce.C10395a;
import p458id.C15605e;
import p458id.C15606f;
import p612td.C17928b;
import p612td.C17930d;
import p651wd.C18505e;

/* renamed from: be.c */
public class C10246c extends C10241a implements C10245b, C10254d {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f28470j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public SurfaceTexture f28471k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C18505e f28472l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final Set f28473m = new CopyOnWriteArraySet();

    /* renamed from: n */
    float f28474n = 1.0f;

    /* renamed from: o */
    float f28475o = 1.0f;

    /* renamed from: p */
    private View f28476p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C17928b f28477q;

    /* renamed from: be.c$a */
    class C10247a implements SurfaceHolder.Callback {

        /* renamed from: d */
        final /* synthetic */ GLSurfaceView f28478d;

        /* renamed from: e */
        final /* synthetic */ C10251d f28479e;

        /* renamed from: be.c$a$a */
        class C10248a implements Runnable {
            C10248a() {
            }

            public void run() {
                C10247a.this.f28479e.mo26840a();
            }
        }

        C10247a(GLSurfaceView gLSurfaceView, C10251d dVar) {
            this.f28478d = gLSurfaceView;
            this.f28479e = dVar;
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C10246c.this.mo26804g();
            this.f28478d.queueEvent(new C10248a());
            boolean unused = C10246c.this.f28470j = false;
        }
    }

    /* renamed from: be.c$b */
    class C10249b implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C10255e f28482d;

        C10249b(C10255e eVar) {
            this.f28482d = eVar;
        }

        public void run() {
            C10246c.this.f28473m.add(this.f28482d);
            if (C10246c.this.f28472l != null) {
                this.f28482d.mo26315d(C10246c.this.f28472l.mo46290b().mo43538e());
            }
            this.f28482d.mo26316f(C10246c.this.f28477q);
        }
    }

    /* renamed from: be.c$c */
    class C10250c implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C17928b f28484d;

        C10250c(C17928b bVar) {
            this.f28484d = bVar;
        }

        public void run() {
            if (C10246c.this.f28472l != null) {
                C10246c.this.f28472l.mo46293e(this.f28484d);
            }
            for (C10255e f : C10246c.this.f28473m) {
                f.mo26316f(this.f28484d);
            }
        }
    }

    /* renamed from: be.c$d */
    public class C10251d implements GLSurfaceView.Renderer {

        /* renamed from: be.c$d$a */
        class C10252a implements Runnable {

            /* renamed from: d */
            final /* synthetic */ int f28487d;

            C10252a(int i) {
                this.f28487d = i;
            }

            public void run() {
                for (C10255e d : C10246c.this.f28473m) {
                    d.mo26315d(this.f28487d);
                }
            }
        }

        /* renamed from: be.c$d$b */
        class C10253b implements SurfaceTexture.OnFrameAvailableListener {
            C10253b() {
            }

            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                ((GLSurfaceView) C10246c.this.mo26810m()).requestRender();
            }
        }

        public C10251d() {
        }

        /* renamed from: a */
        public void mo26840a() {
            if (C10246c.this.f28471k != null) {
                C10246c.this.f28471k.setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener) null);
                C10246c.this.f28471k.release();
                SurfaceTexture unused = C10246c.this.f28471k = null;
            }
            if (C10246c.this.f28472l != null) {
                C10246c.this.f28472l.mo46292d();
                C18505e unused2 = C10246c.this.f28472l = null;
            }
        }

        public void onDrawFrame(GL10 gl10) {
            if (C10246c.this.f28471k != null) {
                C10246c cVar = C10246c.this;
                if (cVar.f28465f > 0 && cVar.f28466g > 0) {
                    float[] c = cVar.f28472l.mo46291c();
                    C10246c.this.f28471k.updateTexImage();
                    C10246c.this.f28471k.getTransformMatrix(c);
                    if (C10246c.this.f28467h != 0) {
                        Matrix.translateM(c, 0, 0.5f, 0.5f, Utils.FLOAT_EPSILON);
                        Matrix.rotateM(c, 0, (float) C10246c.this.f28467h, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 1.0f);
                        Matrix.translateM(c, 0, -0.5f, -0.5f, Utils.FLOAT_EPSILON);
                    }
                    if (C10246c.this.mo26812o()) {
                        C10246c cVar2 = C10246c.this;
                        Matrix.translateM(c, 0, (1.0f - cVar2.f28474n) / 2.0f, (1.0f - cVar2.f28475o) / 2.0f, Utils.FLOAT_EPSILON);
                        C10246c cVar3 = C10246c.this;
                        Matrix.scaleM(c, 0, cVar3.f28474n, cVar3.f28475o, 1.0f);
                    }
                    C10246c.this.f28472l.mo46289a(C10246c.this.f28471k.getTimestamp() / 1000);
                    for (C10255e a : C10246c.this.f28473m) {
                        SurfaceTexture E = C10246c.this.f28471k;
                        C10246c cVar4 = C10246c.this;
                        a.mo26314a(E, cVar4.f28467h, cVar4.f28474n, cVar4.f28475o);
                    }
                }
            }
        }

        public void onSurfaceChanged(GL10 gl10, int i, int i2) {
            gl10.glViewport(0, 0, i, i2);
            C10246c.this.f28477q.mo45593e(i, i2);
            if (!C10246c.this.f28470j) {
                C10246c.this.mo26803f(i, i2);
                boolean unused = C10246c.this.f28470j = true;
                return;
            }
            C10246c cVar = C10246c.this;
            if (i != cVar.f28463d || i2 != cVar.f28464e) {
                cVar.mo26805h(i, i2);
            }
        }

        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            if (C10246c.this.f28477q == null) {
                C17928b unused = C10246c.this.f28477q = new C17930d();
            }
            C18505e unused2 = C10246c.this.f28472l = new C18505e();
            C10246c.this.f28472l.mo46293e(C10246c.this.f28477q);
            int e = C10246c.this.f28472l.mo46290b().mo43538e();
            SurfaceTexture unused3 = C10246c.this.f28471k = new SurfaceTexture(e);
            ((GLSurfaceView) C10246c.this.mo26810m()).queueEvent(new C10252a(e));
            C10246c.this.f28471k.setOnFrameAvailableListener(new C10253b());
        }
    }

    public C10246c(Context context, ViewGroup viewGroup) {
        super(context, viewGroup);
    }

    /* renamed from: H */
    public SurfaceTexture mo26806i() {
        return this.f28471k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public C10251d mo26830I() {
        return new C10251d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public GLSurfaceView mo26813p(Context context, ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(context).inflate(C15606f.cameraview_gl_view, viewGroup, false);
        GLSurfaceView gLSurfaceView = (GLSurfaceView) viewGroup2.findViewById(C15605e.gl_surface_view);
        C10251d I = mo26830I();
        gLSurfaceView.setEGLContextClientVersion(2);
        gLSurfaceView.setRenderer(I);
        gLSurfaceView.setRenderMode(0);
        gLSurfaceView.getHolder().addCallback(new C10247a(gLSurfaceView, I));
        viewGroup.addView(viewGroup2, 0);
        this.f28476p = viewGroup2;
        return gLSurfaceView;
    }

    /* renamed from: a */
    public void mo26827a(C17928b bVar) {
        this.f28477q = bVar;
        if (mo26811n()) {
            bVar.mo45593e(this.f28463d, this.f28464e);
        }
        ((GLSurfaceView) mo26810m()).queueEvent(new C10250c(bVar));
    }

    /* renamed from: b */
    public void mo26832b(C10255e eVar) {
        this.f28473m.remove(eVar);
    }

    /* renamed from: c */
    public void mo26833c(C10255e eVar) {
        ((GLSurfaceView) mo26810m()).queueEvent(new C10249b(eVar));
    }

    /* renamed from: d */
    public C17928b mo26828d() {
        return this.f28477q;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo26802e(C10241a.C10243b bVar) {
        int i;
        int i2;
        float f;
        float f2;
        boolean z;
        if (this.f28465f > 0 && this.f28466g > 0 && (i = this.f28463d) > 0 && (i2 = this.f28464e) > 0) {
            C10395a f3 = C10395a.m37800f(i, i2);
            C10395a f4 = C10395a.m37800f(this.f28465f, this.f28466g);
            if (f3.mo27056j() >= f4.mo27056j()) {
                f2 = f3.mo27056j() / f4.mo27056j();
                f = 1.0f;
            } else {
                f = f4.mo27056j() / f3.mo27056j();
                f2 = 1.0f;
            }
            if (f > 1.02f || f2 > 1.02f) {
                z = true;
            } else {
                z = false;
            }
            this.f28462c = z;
            this.f28474n = 1.0f / f;
            this.f28475o = 1.0f / f2;
            ((GLSurfaceView) mo26810m()).requestRender();
        }
        if (bVar != null) {
            bVar.mo26823a();
        }
    }

    /* renamed from: j */
    public Class mo26807j() {
        return SurfaceTexture.class;
    }

    /* renamed from: k */
    public View mo26808k() {
        return this.f28476p;
    }

    /* renamed from: q */
    public void mo26814q() {
        super.mo26814q();
        this.f28473m.clear();
    }

    /* renamed from: s */
    public void mo26816s() {
        super.mo26816s();
        ((GLSurfaceView) mo26810m()).onPause();
    }

    /* renamed from: t */
    public void mo26817t() {
        super.mo26817t();
        ((GLSurfaceView) mo26810m()).onResume();
    }

    /* renamed from: x */
    public boolean mo26821x() {
        return true;
    }
}
