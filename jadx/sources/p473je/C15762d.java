package p473je;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import kotlin.jvm.internal.C41536l;
import p403ee.C12427a;

/* renamed from: je.d */
public class C15762d extends C15759b {

    /* renamed from: g */
    private Surface f44720g;

    /* renamed from: h */
    private boolean f44721h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15762d(C12427a aVar, Surface surface, boolean z) {
        super(aVar, aVar.mo33039a(surface));
        C41536l.m120489i(aVar, "eglCore");
        C41536l.m120489i(surface, "surface");
        this.f44720g = surface;
        this.f44721h = z;
    }

    /* renamed from: g */
    public void mo43163g() {
        super.mo43163g();
        if (this.f44721h) {
            Surface surface = this.f44720g;
            if (surface != null) {
                surface.release();
            }
            this.f44720g = null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15762d(C12427a aVar, SurfaceTexture surfaceTexture) {
        super(aVar, aVar.mo33039a(surfaceTexture));
        C41536l.m120489i(aVar, "eglCore");
        C41536l.m120489i(surfaceTexture, "surfaceTexture");
    }
}
