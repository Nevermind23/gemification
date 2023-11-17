package ra1;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import androidx.core.content.C0767a;
import androidx.core.content.res.C0808h;
import ba1.C10195g0;
import ba1.C10211p;
import ba1.C10212q;
import ba1.C10214s;
import ba1.C10215t;
import com.facetec.sdk.FaceTecCancelButtonCustomization;
import com.facetec.sdk.FaceTecCustomization;
import com.facetec.sdk.FaceTecGuidanceCustomization;
import com.facetec.sdk.FaceTecSDK;
import com.facetec.sdk.FaceTecVocalGuidanceCustomization;
import com.salesforce.marketingcloud.storage.p385db.C11772k;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.sso_client.models.C35952m;
import p642vh.C18368l;

/* renamed from: ra1.p */
public final class C27981p {

    /* renamed from: a */
    public static final C27981p f71212a = new C27981p();

    /* renamed from: b */
    public static String f71213b = "dV0aZ05yftQTIVpX7QP523A8ZBxnCdGh";

    /* renamed from: c */
    private static String f71214c = "-----BEGIN PUBLIC KEY-----\nMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA5PxZ3DLj+zP6T6HFgzzk\nM77LdzP3fojBoLasw7EfzvLMnJNUlyRb5m8e5QyyJxI+wRjsALHvFgLzGwxM8ehz\nDqqBZed+f4w33GgQXFZOS4AOvyPbALgCYoLehigLAbbCNTkeY5RDcmmSI/sbp+s6\nmAiAKKvCdIqe17bltZ/rfEoL3gPKEfLXeN549LTj3XBp0hvG4loQ6eC1E1tRzSkf\nGJD4GIVvR+j12gXAaftj3ahfYxioBH7F7HQxzmWkwDyn3bqU54eaiB7f0ftsPpWM\nceUaqkL2DZUvgN0efEJjnWy5y1/Gkq5GGWCROI9XG/SwXJ30BbVUehTbVcD70+ZF\n8QIDAQAB\n-----END PUBLIC KEY-----";

    /* renamed from: d */
    private static String f71215d = "-----BEGIN PUBLIC KEY-----\nMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAm3IF0Dr7Jz8S5myY2iny\nlh7bKFeOXteVlkkmCIDKd7ZDE5yqeSLgEaxFMXZ0V2GYnOUNAmRosXnTCCixK9TQ\nks3PvIpzitwS4JfgrFlps1Q8fq5jc+R8z4IxxAECcGmgZQRB4RPEekrpOvoMXtxM\nBciJlHcDl+raiZcv5Apwi0krrafv3f3n1l1Px5U3ZYhTEL57NwoYhNg+XTvC796n\nWwG5HiHT+HPhxj7njRQrOpScEkk0wiR8gF9VOGii8s46Pba5t3sfmscskVrq62Bi\neUraiBdyXjpsn0txkUvfLlPgx/pLd6QENgKpC1vr+bHwHNZBKil8EQeOGlJiouH8\nzwIDAQAB\n-----END PUBLIC KEY-----";

    private C27981p() {
    }

    /* renamed from: a */
    public static final FaceTecCustomization m86372a(Context context) {
        C41536l.m120489i(context, "context");
        int d = C18368l.m62755d(context, C10211p.f28266e);
        if (d == 0) {
            d = C0767a.m2893c(context, C10212q.f28274i);
        }
        int d2 = C18368l.m62755d(context, C10211p.color_primary_tr_200);
        if (d2 == 0) {
            d2 = C0767a.m2893c(context, C10212q.color_primary_tr_200);
        }
        int d3 = C18368l.m62755d(context, C10211p.color_primary_solid_150);
        if (d3 == 0) {
            d3 = C0767a.m2893c(context, C10212q.color_primary_solid_150);
        }
        int c = C0767a.m2893c(context, C10212q.f28267a);
        int c2 = C0767a.m2893c(context, C10212q.f28276l);
        int c3 = C0767a.m2893c(context, C10212q.f28275k);
        FaceTecCustomization faceTecCustomization = new FaceTecCustomization();
        faceTecCustomization.getGuidanceCustomization().retryScreenSlideshowImages = new int[]{C10214s.img_facetec_ideal_image};
        faceTecCustomization.getOverlayCustomization().backgroundColor = c;
        faceTecCustomization.getGuidanceCustomization().backgroundColors = c;
        faceTecCustomization.getGuidanceCustomization().buttonTextNormalColor = c3;
        faceTecCustomization.getGuidanceCustomization().buttonBackgroundNormalColor = d;
        faceTecCustomization.getGuidanceCustomization().buttonTextHighlightColor = c3;
        faceTecCustomization.getGuidanceCustomization().buttonBackgroundHighlightColor = d;
        faceTecCustomization.getGuidanceCustomization().buttonTextDisabledColor = c3;
        faceTecCustomization.getGuidanceCustomization().buttonBackgroundDisabledColor = d3;
        faceTecCustomization.getGuidanceCustomization().buttonCornerRadius = 6;
        faceTecCustomization.getGuidanceCustomization().foregroundColor = c3;
        faceTecCustomization.getIdScanCustomization().selectionScreenBackgroundColors = c;
        faceTecCustomization.getIdScanCustomization().reviewScreenBackgroundColors = c;
        faceTecCustomization.getIdScanCustomization().captureScreenForegroundColor = c3;
        faceTecCustomization.getIdScanCustomization().reviewScreenForegroundColor = c3;
        faceTecCustomization.getIdScanCustomization().selectionScreenForegroundColor = c3;
        faceTecCustomization.getIdScanCustomization().buttonTextNormalColor = c3;
        faceTecCustomization.getIdScanCustomization().buttonBackgroundNormalColor = d;
        faceTecCustomization.getIdScanCustomization().buttonTextHighlightColor = c3;
        faceTecCustomization.getIdScanCustomization().buttonBackgroundHighlightColor = d;
        faceTecCustomization.getIdScanCustomization().buttonTextDisabledColor = c3;
        faceTecCustomization.getIdScanCustomization().buttonBackgroundDisabledColor = d3;
        faceTecCustomization.getIdScanCustomization().buttonCornerRadius = 6;
        faceTecCustomization.getIdScanCustomization().captureScreenTextBackgroundColor = c2;
        faceTecCustomization.getIdScanCustomization().captureScreenTextBackgroundBorderColor = c2;
        faceTecCustomization.getIdScanCustomization().captureScreenTextBackgroundBorderWidth = 0;
        faceTecCustomization.getIdScanCustomization().captureScreenTextBackgroundCornerRadius = 0;
        faceTecCustomization.getIdScanCustomization().reviewScreenTextBackgroundColor = c2;
        faceTecCustomization.getIdScanCustomization().reviewScreenTextBackgroundBorderColor = c2;
        faceTecCustomization.getIdScanCustomization().reviewScreenTextBackgroundBorderWidth = 0;
        faceTecCustomization.getIdScanCustomization().reviewScreenTextBackgroundCornerRadius = 0;
        faceTecCustomization.getIdScanCustomization().captureScreenBackgroundColor = c;
        faceTecCustomization.getResultScreenCustomization().backgroundColors = c;
        faceTecCustomization.getResultScreenCustomization().foregroundColor = c3;
        faceTecCustomization.getResultScreenCustomization().uploadProgressFillColor = d;
        faceTecCustomization.getFeedbackCustomization().backgroundColors = d2;
        faceTecCustomization.getFeedbackCustomization().textColor = c3;
        faceTecCustomization.getOvalCustomization().strokeColor = c;
        faceTecCustomization.getOvalCustomization().progressColor1 = c2;
        faceTecCustomization.getOvalCustomization().progressColor2 = c2;
        faceTecCustomization.getOvalCustomization().strokeWidth = 0;
        faceTecCustomization.getOvalCustomization().progressStrokeWidth = 0;
        faceTecCustomization.getGuidanceCustomization().readyScreenOvalFillColor = c2;
        faceTecCustomization.getGuidanceCustomization().retryScreenOvalStrokeColor = c2;
        faceTecCustomization.getCancelButtonCustomization().customImage = C10214s.ic_facetec_close;
        faceTecCustomization.getGuidanceCustomization().cameraPermissionsScreenImage = C10214s.facetec_camera_permission;
        faceTecCustomization.getIdScanCustomization().activeTorchButtonImage = C10214s.ic_facetec_flash;
        faceTecCustomization.getIdScanCustomization().inactiveTorchButtonImage = C10214s.ic_facetec_flash_off;
        faceTecCustomization.getResultScreenCustomization().customActivityIndicatorAnimation = C10214s.pseudo_fullscreen_animated_activity_indicator;
        faceTecCustomization.getResultScreenCustomization().customResultAnimationSuccess = C10214s.pseudo_fullscreen_animated_success;
        faceTecCustomization.getResultScreenCustomization().customResultAnimationUnsuccess = C10214s.pseudo_fullscreen_animated_unsuccess;
        faceTecCustomization.getResultScreenCustomization().customStaticResultAnimationSuccess = C10214s.pseudo_fullscreen_static_success_vector_drawable;
        faceTecCustomization.getResultScreenCustomization().customStaticResultAnimationUnsuccess = C10214s.pseudo_fullscreen_static_unsuccess_vector_drawable;
        FaceTecGuidanceCustomization guidanceCustomization = faceTecCustomization.getGuidanceCustomization();
        int i = C10215t.f28285a;
        guidanceCustomization.headerFont = C0808h.m3033h(context, i);
        faceTecCustomization.getGuidanceCustomization().subtextFont = C0808h.m3033h(context, i);
        faceTecCustomization.getGuidanceCustomization().readyScreenHeaderFont = C0808h.m3033h(context, i);
        faceTecCustomization.getGuidanceCustomization().readyScreenSubtextFont = C0808h.m3033h(context, i);
        faceTecCustomization.getGuidanceCustomization().retryScreenHeaderFont = C0808h.m3033h(context, i);
        faceTecCustomization.getGuidanceCustomization().retryScreenSubtextFont = C0808h.m3033h(context, i);
        faceTecCustomization.getIdScanCustomization().headerFont = C0808h.m3033h(context, i);
        faceTecCustomization.getIdScanCustomization().subtextFont = C0808h.m3033h(context, i);
        faceTecCustomization.getResultScreenCustomization().messageFont = C0808h.m3033h(context, i);
        faceTecCustomization.getFeedbackCustomization().textFont = C0808h.m3033h(context, i);
        faceTecCustomization.getGuidanceCustomization().buttonFont = C0808h.m3033h(context, i);
        faceTecCustomization.getIdScanCustomization().buttonFont = C0808h.m3033h(context, i);
        faceTecCustomization.getOverlayCustomization().showBrandingImage = false;
        faceTecCustomization.getOverlayCustomization().brandingImage = 0;
        faceTecCustomization.getGuidanceCustomization().buttonBorderColor = 0;
        faceTecCustomization.getGuidanceCustomization().buttonBorderWidth = 0;
        faceTecCustomization.getGuidanceCustomization().readyScreenTextBackgroundColor = c2;
        faceTecCustomization.getGuidanceCustomization().readyScreenTextBackgroundCornerRadius = 5;
        faceTecCustomization.getGuidanceCustomization().retryScreenImageBorderColor = c;
        faceTecCustomization.getGuidanceCustomization().retryScreenImageBorderWidth = 2;
        faceTecCustomization.getGuidanceCustomization().retryScreenImageCornerRadius = 10;
        faceTecCustomization.getGuidanceCustomization().retryScreenSlideshowInterval = 2000;
        faceTecCustomization.getGuidanceCustomization().enableRetryScreenSlideshowShuffle = true;
        faceTecCustomization.getIdScanCustomization().showSelectionScreenBrandingImage = false;
        faceTecCustomization.getIdScanCustomization().selectionScreenBrandingImage = 0;
        faceTecCustomization.getIdScanCustomization().captureScreenFocusMessageTextColor = c3;
        faceTecCustomization.getIdScanCustomization().buttonBorderColor = 0;
        faceTecCustomization.getIdScanCustomization().buttonBorderWidth = 0;
        faceTecCustomization.getIdScanCustomization().captureFrameStrokeColor = c;
        faceTecCustomization.getIdScanCustomization().captureFrameStrokeWidth = 2;
        faceTecCustomization.getIdScanCustomization().captureFrameCornerRadius = 12;
        faceTecCustomization.getResultScreenCustomization().activityIndicatorColor = c;
        faceTecCustomization.getResultScreenCustomization().customActivityIndicatorImage = 0;
        faceTecCustomization.getResultScreenCustomization().customActivityIndicatorRotationInterval = 800;
        faceTecCustomization.getResultScreenCustomization().resultAnimationBackgroundColor = c2;
        faceTecCustomization.getResultScreenCustomization().resultAnimationForegroundColor = c3;
        faceTecCustomization.getResultScreenCustomization().resultAnimationSuccessBackgroundImage = 0;
        faceTecCustomization.getResultScreenCustomization().resultAnimationUnsuccessBackgroundImage = 0;
        faceTecCustomization.getResultScreenCustomization().showUploadProgressBar = true;
        faceTecCustomization.getResultScreenCustomization().uploadProgressTrackColor = Color.parseColor("#332B2B2B");
        faceTecCustomization.getResultScreenCustomization().animationRelativeScale = 1.0f;
        faceTecCustomization.getFeedbackCustomization().cornerRadius = 5;
        faceTecCustomization.getFeedbackCustomization().elevation = 10;
        faceTecCustomization.getFrameCustomization().backgroundColor = c;
        faceTecCustomization.getFrameCustomization().borderColor = c;
        faceTecCustomization.getFrameCustomization().borderWidth = 0;
        faceTecCustomization.getFrameCustomization().cornerRadius = 0;
        faceTecCustomization.getFrameCustomization().elevation = 0;
        faceTecCustomization.getCancelButtonCustomization().setLocation(FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM);
        faceTecCustomization.getCancelButtonCustomization().setCustomLocation(new Rect(20, 30, 25, 25));
        faceTecCustomization.getGuidanceCustomization().readyScreenHeaderTextColor = c3;
        faceTecCustomization.getGuidanceCustomization().readyScreenSubtextTextColor = Color.parseColor("#565656");
        faceTecCustomization.getGuidanceCustomization().retryScreenHeaderTextColor = c3;
        faceTecCustomization.getGuidanceCustomization().retryScreenSubtextTextColor = Color.parseColor("#565656");
        int i2 = faceTecCustomization.getGuidanceCustomization().buttonBackgroundDisabledColor;
        faceTecCustomization.vocalGuidanceCustomization.mode = FaceTecVocalGuidanceCustomization.VocalGuidanceMode.NO_VOCAL_GUIDANCE;
        return faceTecCustomization;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m86373b(java.lang.String r1, p341ge.bog.sso_client.models.C35952m r2) {
        /*
            java.lang.String r0 = "key"
            kotlin.jvm.internal.C41536l.m120489i(r1, r0)
            java.lang.String r0 = "locale"
            kotlin.jvm.internal.C41536l.m120489i(r2, r0)
            ge.bog.sso_client.models.m r0 = p341ge.bog.sso_client.models.C35952m.EN
            if (r2 != r0) goto L_0x0010
            r2 = 1
            goto L_0x0011
        L_0x0010:
            r2 = 0
        L_0x0011:
            java.util.Map r0 = ra1.C27980o.m86369b()
            java.lang.Object r1 = r0.get(r1)
            he1.r r1 = (he1.C41232r) r1
            r0 = 0
            if (r2 == 0) goto L_0x0028
            if (r1 == 0) goto L_0x0035
            java.lang.Object r1 = r1.mo95694f()
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0035
        L_0x0028:
            if (r1 == 0) goto L_0x0031
            java.lang.Object r1 = r1.mo95691d()
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
        L_0x0031:
            if (r0 != 0) goto L_0x0035
            java.lang.String r0 = ""
        L_0x0035:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ra1.C27981p.m86373b(java.lang.String, ge.bog.sso_client.models.m):java.lang.String");
    }

    /* renamed from: c */
    public static final FaceTecCustomization m86374c(Context context) {
        C41536l.m120489i(context, "context");
        int c = C0767a.m2893c(context, C10212q.f28267a);
        int c2 = C0767a.m2893c(context, C10212q.f28275k);
        FaceTecCustomization a = m86372a(context);
        a.getGuidanceCustomization().readyScreenHeaderTextColor = c;
        a.getGuidanceCustomization().retryScreenHeaderTextColor = c;
        a.getResultScreenCustomization().foregroundColor = c;
        a.getIdScanCustomization().selectionScreenForegroundColor = c;
        a.getIdScanCustomization().captureScreenForegroundColor = c;
        a.getIdScanCustomization().reviewScreenForegroundColor = c;
        a.getOvalCustomization().strokeColor = c2;
        return a;
    }

    /* renamed from: d */
    public static final Map m86375d(C35952m mVar, C10195g0 g0Var) {
        boolean z;
        C41536l.m120489i(mVar, C11772k.C11773a.f34182n);
        if (mVar == C35952m.EN) {
            z = true;
        } else {
            z = false;
        }
        if (g0Var != null) {
            return f71212a.m86377f(g0Var);
        }
        if (z) {
            return C27980o.m86368a();
        }
        return C27980o.m86371d();
    }

    /* renamed from: e */
    public static final void m86376e(String str, Context context, FaceTecSDK.InitializeCallback initializeCallback) {
        C41536l.m120489i(str, "serverKey");
        C41536l.m120489i(context, "context");
        FaceTecSDK.initializeInProductionMode(context, str, f71213b, f71215d, initializeCallback);
    }

    /* renamed from: f */
    private final Map m86377f(C10195g0 g0Var) {
        Map c = C27980o.m86370c();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C41342q0.m119921f(c.size()));
        for (Map.Entry entry : c.entrySet()) {
            linkedHashMap.put(entry.getKey(), g0Var.mo26763a((String) entry.getValue(), new Object[0]));
        }
        return linkedHashMap;
    }
}
