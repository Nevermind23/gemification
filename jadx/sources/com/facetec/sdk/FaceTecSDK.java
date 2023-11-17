package com.facetec.sdk;

import android.content.Context;
import java.util.Map;
import org.json.JSONObject;

public final class FaceTecSDK {
    public static final String EXTRA_ID_SCAN_RESULTS = "facetecsdk.signup.idScanResult";
    public static final String EXTRA_SESSION_RESULTS = "facetecsdk.signup.sessionResult";
    public static final int REQUEST_CODE_SESSION = 1002;

    /* renamed from: b */
    static FaceTecCustomization f8627b = null;

    /* renamed from: c */
    static C2744a f8628c = C2744a.NORMAL;

    /* renamed from: d */
    static FaceTecCustomization f8629d = null;

    /* renamed from: e */
    static FaceTecCustomization f8630e = new FaceTecCustomization();
    private static final boolean isMinimalLibrary = C2840bg.m11373e();

    /* renamed from: com.facetec.sdk.FaceTecSDK$2 */
    static /* synthetic */ class C27432 {

        /* renamed from: d */
        static final /* synthetic */ int[] f8631d;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.facetec.sdk.de[] r0 = com.facetec.sdk.C2942de.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8631d = r0
                com.facetec.sdk.de r1 = com.facetec.sdk.C2942de.CLICKABLE_READY_SCREEN_SUBTEXT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8631d     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facetec.sdk.de r1 = com.facetec.sdk.C2942de.DEV_MODE_TAG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8631d     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facetec.sdk.de r1 = com.facetec.sdk.C2942de.UNCONSTRAINED_GUIDANCE_STRING_LENGTHS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f8631d     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facetec.sdk.de r1 = com.facetec.sdk.C2942de.STANDALONE_IDSCAN_WATERMARK_CUSTOMIZATION     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f8631d     // Catch:{ NoSuchFieldError -> 0x003e }
                com.facetec.sdk.de r1 = com.facetec.sdk.C2942de.ENABLE_SCREEN_CAPTURING     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.FaceTecSDK.C27432.<clinit>():void");
        }
    }

    public enum CameraPermissionStatus {
        GRANTED("Authorized"),
        NOT_YET_REQUESTED("Not Yet Requested"),
        DENIED("Denied");
        

        /* renamed from: a */
        private final String f8633a;

        private CameraPermissionStatus(String str) {
            this.f8633a = str;
        }

        public final String toString() {
            return this.f8633a;
        }
    }

    public static abstract class InitializeCallback {
        public abstract void onCompletion(boolean z);
    }

    /* renamed from: com.facetec.sdk.FaceTecSDK$a */
    enum C2744a {
        NORMAL,
        LOW_LIGHT,
        BRIGHT_LIGHT
    }

    private FaceTecSDK() {
    }

    /* renamed from: a */
    static boolean m10647a() {
        return f8628c == C2744a.LOW_LIGHT && f8629d != null;
    }

    /* renamed from: b */
    private static boolean m10649b(int i) {
        boolean z;
        if ((i < 0 || i > 20) && i != -1) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            C2797ar.m10878a("An error occurred while setting FaceTecCustomization due to a border width value set outside allowed range. Reverting border width value to default.");
        }
        return z;
    }

    /* renamed from: c */
    private static boolean m10650c(int i) {
        boolean z;
        if ((i < 0 || i > 40) && i != -1) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            C2797ar.m10878a("An error occurred while setting FaceTecCustomization due to a corner radius value set outside allowed range. Reverting corner radius value to default.");
        }
        return z;
    }

    public static void configureOCRLocalization(JSONObject jSONObject) {
        C2840bg.m11356b(jSONObject);
    }

    public static String createFaceTecAPIUserAgentString(String str) {
        return C2840bg.m11370e(str);
    }

    /* renamed from: d */
    private static boolean m10651d(int i) {
        boolean z;
        if ((i < 2 || i > 20) && i != -1) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            C2797ar.m10878a("An error occurred while setting FaceTecCustomization due to a stroke width value set outside allowed range. Reverting stroke width value to default.");
        }
        return z;
    }

    /* renamed from: e */
    static boolean m10652e() {
        return f8628c == C2744a.BRIGHT_LIGHT && f8627b != null;
    }

    public static CameraPermissionStatus getCameraPermissionStatus(Context context) {
        return C2840bg.m11369e(context);
    }

    public static Long getLockoutEndTime(Context context) {
        return C2840bg.m11358c(context);
    }

    public static FaceTecSDKStatus getStatus(Context context) {
        return C2840bg.m11366d(context);
    }

    public static void initializeInDevelopmentMode(Context context, String str, String str2, InitializeCallback initializeCallback) {
        C2840bg.m11367d(context, str, str2, initializeCallback);
    }

    public static void initializeInProductionMode(Context context, String str, String str2, String str3, InitializeCallback initializeCallback) {
        C2840bg.m11354b(context, str, str2, str3, initializeCallback);
    }

    public static boolean isLockedOut(Context context) {
        return C2840bg.m11349a(context);
    }

    public static void preload(Context context) {
        C2840bg.m11355b(context, false);
    }

    public static void setAuditTrailType(FaceTecAuditTrailType faceTecAuditTrailType) {
        C2840bg.m11362c(faceTecAuditTrailType);
    }

    public static void setCustomization(FaceTecCustomization faceTecCustomization) {
        if (faceTecCustomization != null) {
            for (int i = 0; i < C2937db.f9837d.length(); i++) {
                try {
                    JSONObject jSONObject = C2937db.f9837d.getJSONObject(i);
                    String string = jSONObject.getString("overrideKey");
                    C2942de deVar = (C2942de) jSONObject.get("type");
                    if (faceTecCustomization.f8613p.get(string) != null && faceTecCustomization.f8613p.get(string).equals(jSONObject.getString("overrideValue"))) {
                        int i2 = C27432.f8631d[deVar.ordinal()];
                        if (i2 == 1) {
                            faceTecCustomization.f8601d = true;
                        } else if (i2 == 2) {
                            faceTecCustomization.f8600c = false;
                        } else if (i2 == 3) {
                            faceTecCustomization.f8598a = true;
                        } else if (i2 == 4) {
                            faceTecCustomization.f8599b = true;
                        } else if (i2 == 5) {
                            faceTecCustomization.f8602e = true;
                            C2937db.m12221d(deVar);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            if (!m10649b(faceTecCustomization.f8606i.buttonBorderWidth)) {
                faceTecCustomization.f8606i.buttonBorderWidth = -1;
            }
            if (!m10649b(faceTecCustomization.f8605h.buttonBorderWidth)) {
                faceTecCustomization.f8605h.buttonBorderWidth = -1;
            }
            if (!m10649b(faceTecCustomization.f8611n.borderWidth)) {
                faceTecCustomization.f8611n.borderWidth = -1;
            }
            if (!m10649b(faceTecCustomization.f8605h.captureScreenTextBackgroundBorderWidth)) {
                faceTecCustomization.f8605h.captureScreenTextBackgroundBorderWidth = -1;
            }
            if (!m10649b(faceTecCustomization.f8605h.reviewScreenTextBackgroundBorderWidth)) {
                faceTecCustomization.f8605h.reviewScreenTextBackgroundBorderWidth = -1;
            }
            if (!m10649b(faceTecCustomization.f8606i.retryScreenImageBorderWidth)) {
                faceTecCustomization.f8606i.retryScreenImageBorderWidth = -1;
            }
            if (!m10649b(faceTecCustomization.f8604g.mainHeaderDividerLineWidth)) {
                faceTecCustomization.f8604g.mainHeaderDividerLineWidth = -1;
            }
            if (!m10649b(faceTecCustomization.f8604g.inputFieldBorderWidth)) {
                faceTecCustomization.f8604g.inputFieldBorderWidth = -1;
            }
            if (!m10653e(faceTecCustomization.f8611n.cornerRadius)) {
                faceTecCustomization.f8611n.cornerRadius = -1;
            }
            if (!m10650c(faceTecCustomization.f8608k.cornerRadius)) {
                faceTecCustomization.f8608k.cornerRadius = -1;
            }
            if (!m10650c(faceTecCustomization.f8606i.buttonCornerRadius)) {
                faceTecCustomization.f8606i.buttonCornerRadius = -1;
            }
            if (!m10650c(faceTecCustomization.f8605h.buttonCornerRadius)) {
                faceTecCustomization.f8605h.buttonCornerRadius = -1;
            }
            if (!m10650c(faceTecCustomization.f8605h.captureScreenTextBackgroundCornerRadius)) {
                faceTecCustomization.f8605h.captureScreenTextBackgroundCornerRadius = -1;
            }
            if (!m10650c(faceTecCustomization.f8605h.reviewScreenTextBackgroundCornerRadius)) {
                faceTecCustomization.f8605h.reviewScreenTextBackgroundCornerRadius = -1;
            }
            if (!m10650c(faceTecCustomization.f8606i.readyScreenTextBackgroundCornerRadius)) {
                faceTecCustomization.f8606i.readyScreenTextBackgroundCornerRadius = -1;
            }
            if (!m10650c(faceTecCustomization.f8606i.retryScreenImageCornerRadius)) {
                faceTecCustomization.f8606i.retryScreenImageCornerRadius = -1;
            }
            if (!m10650c(faceTecCustomization.f8604g.inputFieldCornerRadius)) {
                faceTecCustomization.f8604g.inputFieldCornerRadius = -1;
            }
            if (!m10651d(faceTecCustomization.f8610m.strokeWidth)) {
                faceTecCustomization.f8610m.strokeWidth = -1;
            }
            if (!m10651d(faceTecCustomization.f8610m.progressStrokeWidth)) {
                faceTecCustomization.f8610m.progressStrokeWidth = -1;
            }
            if (!m10648a(faceTecCustomization.f8610m.progressRadialOffset)) {
                faceTecCustomization.f8610m.progressRadialOffset = -1;
            }
            String str = faceTecCustomization.f8606i.retryScreenHeaderAttributedString;
            if (str != null && !str.isEmpty()) {
                C2938dc.m12358bm();
            }
            String str2 = faceTecCustomization.f8606i.retryScreenSubtextAttributedString;
            if (str2 != null && !str2.isEmpty()) {
                C2938dc.m12360bo();
            }
            String str3 = faceTecCustomization.f8606i.readyScreenHeaderAttributedString;
            if (str3 != null && !str3.isEmpty()) {
                C2938dc.m12361bp();
            }
            String str4 = faceTecCustomization.f8606i.readyScreenSubtextAttributedString;
            if (str4 != null && !str4.isEmpty()) {
                C2938dc.m12357bl();
            }
            C2827ba.m11056c();
            f8630e = faceTecCustomization;
        }
    }

    public static void setDynamicDimmingCustomization(FaceTecCustomization faceTecCustomization) {
        f8627b = faceTecCustomization;
    }

    public static void setDynamicStrings(Map<Integer, String> map) {
        C2923cy.m12207c(map);
    }

    public static void setLowLightCustomization(FaceTecCustomization faceTecCustomization) {
        f8629d = faceTecCustomization;
    }

    public static void setMaxAuditTrailImages(FaceTecAuditTrailImagesToReturn faceTecAuditTrailImagesToReturn) {
        C2840bg.f9203d = faceTecAuditTrailImagesToReturn;
    }

    public static void unload() {
        C2840bg.m11348a();
    }

    public static String version() {
        return "9.6.41";
    }

    /* renamed from: a */
    private static boolean m10648a(int i) {
        boolean z = (i >= 2 && i <= 20) || i == -1;
        if (!z) {
            C2797ar.m10878a("An error occurred while setting FaceTecCustomization due to a radial offset value set outside allowed range. Reverting radial offset value to default.");
        }
        return z;
    }

    /* renamed from: e */
    private static boolean m10653e(int i) {
        boolean z = (i >= 0 && i <= 30) || i == -1;
        if (!z) {
            C2797ar.m10878a("An error occurred while setting FaceTecCustomization due to a corner radius value set outside allowed range. Reverting corner radius value to default.");
        }
        return z;
    }
}
