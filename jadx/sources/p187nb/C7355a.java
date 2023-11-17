package p187nb;

import android.hardware.Camera;
import android.util.Log;

/* renamed from: nb.a */
public abstract class C7355a {

    /* renamed from: a */
    private static final String f21563a = "nb.a";

    /* renamed from: a */
    public static int m28042a(int i) {
        boolean z;
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            Log.w(f21563a, "No cameras!");
            return -1;
        }
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i = 0;
            while (i < numberOfCameras) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i, cameraInfo);
                if (cameraInfo.facing == 0) {
                    break;
                }
                i++;
            }
        }
        if (i < numberOfCameras) {
            return i;
        }
        if (z) {
            return -1;
        }
        return 0;
    }

    /* renamed from: b */
    public static Camera m28043b(int i) {
        int a = m28042a(i);
        if (a == -1) {
            return null;
        }
        return Camera.open(a);
    }
}
