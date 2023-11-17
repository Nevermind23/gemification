package p584rd;

import android.hardware.Camera;
import android.media.CamcorderProfile;
import java.util.List;
import p374ce.C10395a;
import p374ce.C10396b;
import p458id.C15603c;
import p472jd.C15749f;
import p472jd.C15750g;
import p472jd.C15752i;
import p472jd.C15754k;
import p472jd.C15757n;
import p528nd.C16914a;
import p651wd.C18500a;

/* renamed from: rd.a */
public class C17582a extends C15603c {
    public C17582a(Camera.Parameters parameters, int i, boolean z) {
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        C16914a a = C16914a.m59497a();
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int numberOfCameras = Camera.getNumberOfCameras();
        for (int i8 = 0; i8 < numberOfCameras; i8++) {
            Camera.getCameraInfo(i8, cameraInfo);
            C15749f g = a.mo44079g(cameraInfo.facing);
            if (g != null) {
                this.f44308b.add(g);
            }
        }
        List<String> supportedWhiteBalance = parameters.getSupportedWhiteBalance();
        if (supportedWhiteBalance != null) {
            for (String j : supportedWhiteBalance) {
                C15757n j2 = a.mo44082j(j);
                if (j2 != null) {
                    this.f44307a.add(j2);
                }
            }
        }
        this.f44309c.add(C15750g.OFF);
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        if (supportedFlashModes != null) {
            for (String h : supportedFlashModes) {
                C15750g h2 = a.mo44080h(h);
                if (h2 != null) {
                    this.f44309c.add(h2);
                }
            }
        }
        this.f44310d.add(C15752i.OFF);
        List<String> supportedSceneModes = parameters.getSupportedSceneModes();
        if (supportedSceneModes != null) {
            for (String i9 : supportedSceneModes) {
                C15752i i12 = a.mo44081i(i9);
                if (i12 != null) {
                    this.f44310d.add(i12);
                }
            }
        }
        this.f44317k = parameters.isZoomSupported();
        this.f44321o = parameters.getSupportedFocusModes().contains("auto");
        float exposureCompensationStep = parameters.getExposureCompensationStep();
        this.f44319m = ((float) parameters.getMinExposureCompensation()) * exposureCompensationStep;
        this.f44320n = ((float) parameters.getMaxExposureCompensation()) * exposureCompensationStep;
        if (parameters.getMinExposureCompensation() == 0 && parameters.getMaxExposureCompensation() == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f44318l = z2;
        for (Camera.Size next : parameters.getSupportedPictureSizes()) {
            if (z) {
                i6 = next.height;
            } else {
                i6 = next.width;
            }
            if (z) {
                i7 = next.width;
            } else {
                i7 = next.height;
            }
            this.f44311e.add(new C10396b(i6, i7));
            this.f44313g.add(C10395a.m37800f(i6, i7));
        }
        CamcorderProfile a2 = C18500a.m62986a(i, new C10396b(Integer.MAX_VALUE, Integer.MAX_VALUE));
        C10396b bVar = new C10396b(a2.videoFrameWidth, a2.videoFrameHeight);
        List<Camera.Size> supportedVideoSizes = parameters.getSupportedVideoSizes();
        if (supportedVideoSizes != null) {
            for (Camera.Size next2 : supportedVideoSizes) {
                if (next2.width <= bVar.mo27062e() && next2.height <= bVar.mo27060c()) {
                    if (z) {
                        i4 = next2.height;
                    } else {
                        i4 = next2.width;
                    }
                    if (z) {
                        i5 = next2.width;
                    } else {
                        i5 = next2.height;
                    }
                    this.f44312f.add(new C10396b(i4, i5));
                    this.f44314h.add(C10395a.m37800f(i4, i5));
                }
            }
        } else {
            for (Camera.Size next3 : parameters.getSupportedPreviewSizes()) {
                if (next3.width <= bVar.mo27062e() && next3.height <= bVar.mo27060c()) {
                    if (z) {
                        i2 = next3.height;
                    } else {
                        i2 = next3.width;
                    }
                    if (z) {
                        i3 = next3.width;
                    } else {
                        i3 = next3.height;
                    }
                    this.f44312f.add(new C10396b(i2, i3));
                    this.f44314h.add(C10395a.m37800f(i2, i3));
                }
            }
        }
        this.f44322p = Float.MAX_VALUE;
        this.f44323q = -3.4028235E38f;
        for (int[] next4 : parameters.getSupportedPreviewFpsRange()) {
            this.f44322p = Math.min(this.f44322p, ((float) next4[0]) / 1000.0f);
            this.f44323q = Math.max(this.f44323q, ((float) next4[1]) / 1000.0f);
        }
        this.f44315i.add(C15754k.JPEG);
        this.f44316j.add(17);
    }
}
