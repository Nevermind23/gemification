package p693zd;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;
import p374ce.C10396b;
import p458id.C15600b;
import p651wd.C18505e;
import p651wd.C18508g;
import p693zd.C19009a;

/* renamed from: zd.b */
public class C19011b {

    /* renamed from: g */
    private static final C15600b f53102g = C15600b.m56349a(C19011b.class.getSimpleName());

    /* renamed from: a */
    private C19009a f53103a;

    /* renamed from: b */
    private SurfaceTexture f53104b;

    /* renamed from: c */
    private Surface f53105c;

    /* renamed from: d */
    C18505e f53106d;

    /* renamed from: e */
    private C18508g f53107e;

    /* renamed from: f */
    private final Object f53108f = new Object();

    public C19011b(C19009a aVar, C10396b bVar) {
        this.f53103a = aVar;
        this.f53106d = new C18505e();
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f53106d.mo46290b().mo43538e());
        this.f53104b = surfaceTexture;
        surfaceTexture.setDefaultBufferSize(bVar.mo27062e(), bVar.mo27060c());
        this.f53105c = new Surface(this.f53104b);
        this.f53107e = new C18508g(this.f53106d.mo46290b().mo43538e());
    }

    /* renamed from: a */
    public void mo47160a(C19009a.C19010a aVar) {
        Canvas canvas;
        try {
            if (this.f53103a.getHardwareCanvasEnabled()) {
                canvas = this.f53105c.lockHardwareCanvas();
            } else {
                canvas = this.f53105c.lockCanvas((Rect) null);
            }
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f53103a.mo47157a(aVar, canvas);
            this.f53105c.unlockCanvasAndPost(canvas);
        } catch (Surface.OutOfResourcesException e) {
            f53102g.mo42880h("Got Surface.OutOfResourcesException while drawing video overlays", e);
        }
        synchronized (this.f53108f) {
            this.f53107e.mo46301a();
            this.f53104b.updateTexImage();
        }
        this.f53104b.getTransformMatrix(this.f53106d.mo46291c());
    }

    /* renamed from: b */
    public float[] mo47161b() {
        return this.f53106d.mo46291c();
    }

    /* renamed from: c */
    public void mo47162c() {
        C18508g gVar = this.f53107e;
        if (gVar != null) {
            gVar.mo46302c();
            this.f53107e = null;
        }
        SurfaceTexture surfaceTexture = this.f53104b;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f53104b = null;
        }
        Surface surface = this.f53105c;
        if (surface != null) {
            surface.release();
            this.f53105c = null;
        }
        C18505e eVar = this.f53106d;
        if (eVar != null) {
            eVar.mo46292d();
            this.f53106d = null;
        }
    }

    /* renamed from: d */
    public void mo47163d(long j) {
        GLES20.glDisable(2884);
        GLES20.glDisable(2929);
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        synchronized (this.f53108f) {
            this.f53106d.mo46289a(j);
        }
    }
}
