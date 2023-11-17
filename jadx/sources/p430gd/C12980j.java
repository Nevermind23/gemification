package p430gd;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.view.SurfaceHolder;

/* renamed from: gd.j */
public class C12980j {

    /* renamed from: a */
    private SurfaceHolder f38286a;

    /* renamed from: b */
    private SurfaceTexture f38287b;

    public C12980j(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != null) {
            this.f38286a = surfaceHolder;
            return;
        }
        throw new IllegalArgumentException("surfaceHolder may not be null");
    }

    /* renamed from: a */
    public void mo33772a(Camera camera) {
        SurfaceHolder surfaceHolder = this.f38286a;
        if (surfaceHolder != null) {
            camera.setPreviewDisplay(surfaceHolder);
        } else {
            camera.setPreviewTexture(this.f38287b);
        }
    }

    public C12980j(SurfaceTexture surfaceTexture) {
        if (surfaceTexture != null) {
            this.f38287b = surfaceTexture;
            return;
        }
        throw new IllegalArgumentException("surfaceTexture may not be null");
    }
}
