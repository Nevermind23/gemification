package p430gd;

import android.graphics.Rect;
import android.hardware.Camera;
import android.util.Log;
import com.github.mikephil.charting.utils.Utils;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView;
import p430gd.C12978i;

/* renamed from: gd.c */
public abstract class C12967c {

    /* renamed from: a */
    private static final Pattern f38230a = Pattern.compile(";");

    /* renamed from: a */
    private static List m48910a(int i) {
        int i2 = -i;
        return Collections.singletonList(new Camera.Area(new Rect(i2, i2, i, i), 1));
    }

    /* renamed from: b */
    private static String m48911b(String str, Collection collection, String... strArr) {
        Log.i("CameraConfiguration", "Requesting " + str + " value from among: " + Arrays.toString(strArr));
        Log.i("CameraConfiguration", "Supported " + str + " values: " + collection);
        if (collection != null) {
            for (String str2 : strArr) {
                if (collection.contains(str2)) {
                    Log.i("CameraConfiguration", "Can set " + str + " to: " + str2);
                    return str2;
                }
            }
        }
        Log.i("CameraConfiguration", "No supported values match");
        return null;
    }

    /* renamed from: c */
    public static void m48912c(Camera.Parameters parameters) {
        if ("barcode".equals(parameters.getSceneMode())) {
            Log.i("CameraConfiguration", "Barcode scene mode already set");
            return;
        }
        String b = m48911b("scene mode", parameters.getSupportedSceneModes(), "barcode");
        if (b != null) {
            parameters.setSceneMode(b);
        }
    }

    /* renamed from: d */
    public static void m48913d(Camera.Parameters parameters, boolean z) {
        int minExposureCompensation = parameters.getMinExposureCompensation();
        int maxExposureCompensation = parameters.getMaxExposureCompensation();
        float exposureCompensationStep = parameters.getExposureCompensationStep();
        if (!(minExposureCompensation == 0 && maxExposureCompensation == 0)) {
            float f = Utils.FLOAT_EPSILON;
            if (exposureCompensationStep > Utils.FLOAT_EPSILON) {
                if (!z) {
                    f = 1.5f;
                }
                int round = Math.round(f / exposureCompensationStep);
                float f2 = exposureCompensationStep * ((float) round);
                int max = Math.max(Math.min(round, maxExposureCompensation), minExposureCompensation);
                if (parameters.getExposureCompensation() == max) {
                    Log.i("CameraConfiguration", "Exposure compensation already set to " + max + " / " + f2);
                    return;
                }
                Log.i("CameraConfiguration", "Setting exposure compensation to " + max + " / " + f2);
                parameters.setExposureCompensation(max);
                return;
            }
        }
        Log.i("CameraConfiguration", "Camera does not support exposure compensation");
    }

    /* renamed from: e */
    public static void m48914e(Camera.Parameters parameters) {
        m48915f(parameters, 10, 20);
    }

    /* renamed from: f */
    public static void m48915f(Camera.Parameters parameters, int i, int i2) {
        int[] iArr;
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        Log.i("CameraConfiguration", "Supported FPS ranges: " + m48923n(supportedPreviewFpsRange));
        if (supportedPreviewFpsRange != null && !supportedPreviewFpsRange.isEmpty()) {
            Iterator<int[]> it = supportedPreviewFpsRange.iterator();
            while (true) {
                if (!it.hasNext()) {
                    iArr = null;
                    break;
                }
                iArr = it.next();
                int i3 = iArr[0];
                int i4 = iArr[1];
                if (i3 >= i * 1000 && i4 <= i2 * 1000) {
                    break;
                }
            }
            if (iArr == null) {
                Log.i("CameraConfiguration", "No suitable FPS range?");
                return;
            }
            int[] iArr2 = new int[2];
            parameters.getPreviewFpsRange(iArr2);
            if (Arrays.equals(iArr2, iArr)) {
                Log.i("CameraConfiguration", "FPS range already set to " + Arrays.toString(iArr));
                return;
            }
            Log.i("CameraConfiguration", "Setting FPS range to " + Arrays.toString(iArr));
            parameters.setPreviewFpsRange(iArr[0], iArr[1]);
        }
    }

    /* renamed from: g */
    public static void m48916g(Camera.Parameters parameters, C12978i.C12979a aVar, boolean z) {
        String str;
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (z || aVar == C12978i.C12979a.AUTO) {
            str = m48911b("focus mode", supportedFocusModes, "auto");
        } else if (aVar == C12978i.C12979a.CONTINUOUS) {
            str = m48911b("focus mode", supportedFocusModes, "continuous-picture", "continuous-video", "auto");
        } else if (aVar == C12978i.C12979a.INFINITY) {
            str = m48911b("focus mode", supportedFocusModes, "infinity");
        } else if (aVar == C12978i.C12979a.MACRO) {
            str = m48911b("focus mode", supportedFocusModes, "macro");
        } else {
            str = null;
        }
        if (!z && str == null) {
            str = m48911b("focus mode", supportedFocusModes, "macro", "edof");
        }
        if (str == null) {
            return;
        }
        if (str.equals(parameters.getFocusMode())) {
            Log.i("CameraConfiguration", "Focus mode already set to " + str);
            return;
        }
        parameters.setFocusMode(str);
    }

    /* renamed from: h */
    public static void m48917h(Camera.Parameters parameters) {
        if (parameters.getMaxNumFocusAreas() > 0) {
            Log.i("CameraConfiguration", "Old focus areas: " + m48922m(parameters.getFocusAreas()));
            List a = m48910a(TextTypeView.SEPARATOR_FULL);
            Log.i("CameraConfiguration", "Setting focus area to : " + m48922m(a));
            parameters.setFocusAreas(a);
            return;
        }
        Log.i("CameraConfiguration", "Device does not support focus areas");
    }

    /* renamed from: i */
    public static void m48918i(Camera.Parameters parameters) {
        if ("negative".equals(parameters.getColorEffect())) {
            Log.i("CameraConfiguration", "Negative effect already set");
            return;
        }
        String b = m48911b("color effect", parameters.getSupportedColorEffects(), "negative");
        if (b != null) {
            parameters.setColorEffect(b);
        }
    }

    /* renamed from: j */
    public static void m48919j(Camera.Parameters parameters) {
        if (parameters.getMaxNumMeteringAreas() > 0) {
            Log.i("CameraConfiguration", "Old metering areas: " + parameters.getMeteringAreas());
            List a = m48910a(TextTypeView.SEPARATOR_FULL);
            Log.i("CameraConfiguration", "Setting metering area to : " + m48922m(a));
            parameters.setMeteringAreas(a);
            return;
        }
        Log.i("CameraConfiguration", "Device does not support metering areas");
    }

    /* renamed from: k */
    public static void m48920k(Camera.Parameters parameters, boolean z) {
        String str;
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        if (z) {
            str = m48911b("flash mode", supportedFlashModes, "torch", "on");
        } else {
            str = m48911b("flash mode", supportedFlashModes, "off");
        }
        if (str == null) {
            return;
        }
        if (str.equals(parameters.getFlashMode())) {
            Log.i("CameraConfiguration", "Flash mode already set to " + str);
            return;
        }
        Log.i("CameraConfiguration", "Setting flash mode to " + str);
        parameters.setFlashMode(str);
    }

    /* renamed from: l */
    public static void m48921l(Camera.Parameters parameters) {
        if (!parameters.isVideoStabilizationSupported()) {
            Log.i("CameraConfiguration", "This device does not support video stabilization");
        } else if (parameters.getVideoStabilization()) {
            Log.i("CameraConfiguration", "Video stabilization already enabled");
        } else {
            Log.i("CameraConfiguration", "Enabling video stabilization...");
            parameters.setVideoStabilization(true);
        }
    }

    /* renamed from: m */
    private static String m48922m(Iterable iterable) {
        if (iterable == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Camera.Area area = (Camera.Area) it.next();
            sb.append(area.rect);
            sb.append(':');
            sb.append(area.weight);
            sb.append(' ');
        }
        return sb.toString();
    }

    /* renamed from: n */
    private static String m48923n(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            sb.append(Arrays.toString((int[]) it.next()));
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(']');
        return sb.toString();
    }
}
