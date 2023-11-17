package p584rd;

import android.graphics.ImageFormat;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import com.github.mikephil.charting.utils.Utils;
import p374ce.C10395a;
import p374ce.C10396b;
import p458id.C15603c;
import p472jd.C15749f;
import p472jd.C15750g;
import p472jd.C15752i;
import p472jd.C15754k;
import p472jd.C15757n;
import p528nd.C16915b;
import p651wd.C18500a;

/* renamed from: rd.b */
public class C17583b extends C15603c {
    public C17583b(CameraManager cameraManager, String str, boolean z, int i) {
        C15749f g;
        C16915b a = C16915b.m59507a();
        CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
        for (String cameraCharacteristics2 : cameraManager.getCameraIdList()) {
            Integer num = (Integer) cameraManager.getCameraCharacteristics(cameraCharacteristics2).get(CameraCharacteristics.LENS_FACING);
            if (!(num == null || (g = a.mo44087g(num.intValue())) == null)) {
                this.f44308b.add(g);
            }
        }
        for (int j : (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES)) {
            C15757n j2 = a.mo44090j(j);
            if (j2 != null) {
                this.f44307a.add(j2);
            }
        }
        this.f44309c.add(C15750g.OFF);
        Boolean bool = (Boolean) cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        if (bool != null && bool.booleanValue()) {
            for (int h : (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES)) {
                this.f44309c.addAll(a.mo44088h(h));
            }
        }
        this.f44310d.add(C15752i.OFF);
        for (int i2 : (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_SCENE_MODES)) {
            C15752i i3 = a.mo44089i(i2);
            if (i3 != null) {
                this.f44310d.add(i3);
            }
        }
        Float f = (Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        boolean z2 = true;
        if (f != null) {
            this.f44317k = f.floatValue() > 1.0f;
        }
        Integer num2 = (Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        Integer num3 = (Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        Integer num4 = (Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
        this.f44321o = (num2 != null && num2.intValue() > 0) || (num3 != null && num3.intValue() > 0) || (num4 != null && num4.intValue() > 0);
        Range range = (Range) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
        Rational rational = (Rational) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);
        if (!(range == null || rational == null || rational.floatValue() == Utils.FLOAT_EPSILON)) {
            this.f44319m = ((float) ((Integer) range.getLower()).intValue()) / rational.floatValue();
            this.f44320n = ((float) ((Integer) range.getUpper()).intValue()) / rational.floatValue();
        }
        this.f44318l = (this.f44319m == Utils.FLOAT_EPSILON || this.f44320n == Utils.FLOAT_EPSILON) ? false : true;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap != null) {
            int[] outputFormats = streamConfigurationMap.getOutputFormats();
            int length = outputFormats.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    z2 = false;
                    break;
                } else if (outputFormats[i4] == i) {
                    break;
                } else {
                    i4++;
                }
            }
            if (z2) {
                for (Size size : streamConfigurationMap.getOutputSizes(i)) {
                    int height = z ? size.getHeight() : size.getWidth();
                    int width = z ? size.getWidth() : size.getHeight();
                    this.f44311e.add(new C10396b(height, width));
                    this.f44313g.add(C10395a.m37800f(height, width));
                }
                CamcorderProfile b = C18500a.m62987b(str, new C10396b(Integer.MAX_VALUE, Integer.MAX_VALUE));
                C10396b bVar = new C10396b(b.videoFrameWidth, b.videoFrameHeight);
                for (Size size2 : streamConfigurationMap.getOutputSizes(MediaRecorder.class)) {
                    if (size2.getWidth() <= bVar.mo27062e() && size2.getHeight() <= bVar.mo27060c()) {
                        int height2 = z ? size2.getHeight() : size2.getWidth();
                        int width2 = z ? size2.getWidth() : size2.getHeight();
                        this.f44312f.add(new C10396b(height2, width2));
                        this.f44314h.add(C10395a.m37800f(height2, width2));
                    }
                }
                Range[] rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                if (rangeArr != null) {
                    this.f44322p = Float.MAX_VALUE;
                    this.f44323q = -3.4028235E38f;
                    for (Range range2 : rangeArr) {
                        this.f44322p = Math.min(this.f44322p, (float) ((Integer) range2.getLower()).intValue());
                        this.f44323q = Math.max(this.f44323q, (float) ((Integer) range2.getUpper()).intValue());
                    }
                } else {
                    this.f44322p = Utils.FLOAT_EPSILON;
                    this.f44323q = Utils.FLOAT_EPSILON;
                }
                this.f44315i.add(C15754k.JPEG);
                int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                if (iArr != null) {
                    for (int i5 : iArr) {
                        if (i5 == 3) {
                            this.f44315i.add(C15754k.DNG);
                        }
                    }
                }
                this.f44316j.add(35);
                for (int i6 : streamConfigurationMap.getOutputFormats()) {
                    if (ImageFormat.getBitsPerPixel(i6) > 0) {
                        this.f44316j.add(Integer.valueOf(i6));
                    }
                }
                return;
            }
            throw new IllegalStateException("Picture format not supported: " + i);
        }
        throw new RuntimeException("StreamConfigurationMap is null. Should not happen.");
    }
}
