package p458id;

import android.content.Context;
import android.hardware.Camera;
import p472jd.C15749f;
import p528nd.C16914a;

/* renamed from: id.d */
public abstract class C15604d {

    /* renamed from: a */
    private static final C15600b f44324a = C15600b.m56349a(C15604d.class.getSimpleName());

    /* renamed from: a */
    public static boolean m56375a(Context context, C15749f fVar) {
        int b = C16914a.m59497a().mo44075b(fVar);
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int numberOfCameras = Camera.getNumberOfCameras();
        for (int i = 0; i < numberOfCameras; i++) {
            Camera.getCameraInfo(i, cameraInfo);
            if (cameraInfo.facing == b) {
                return true;
            }
        }
        return false;
    }
}
