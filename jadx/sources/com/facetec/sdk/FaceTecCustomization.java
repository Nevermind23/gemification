package com.facetec.sdk;

import java.util.HashMap;
import java.util.Map;

public final class FaceTecCustomization {
    public static int activityThemeId;
    public static String overrideResultScreenSuccessMessage;

    /* renamed from: q */
    static HashMap<C2941dd, String> f8596q;

    /* renamed from: t */
    static HashMap<C2908cp, String> f8597t;

    /* renamed from: a */
    boolean f8598a;

    /* renamed from: b */
    boolean f8599b;

    /* renamed from: c */
    boolean f8600c;

    /* renamed from: d */
    boolean f8601d;

    /* renamed from: e */
    boolean f8602e;
    public int exitAnimationSuccessResourceID;
    public int exitAnimationUnsuccessResourceID;

    /* renamed from: f */
    FaceTecResultScreenCustomization f8603f;

    /* renamed from: g */
    FaceTecOCRConfirmationCustomization f8604g;

    /* renamed from: h */
    FaceTecIDScanCustomization f8605h;

    /* renamed from: i */
    FaceTecGuidanceCustomization f8606i;

    /* renamed from: j */
    FaceTecOverlayCustomization f8607j;

    /* renamed from: k */
    FaceTecFeedbackCustomization f8608k;

    /* renamed from: l */
    FaceTecInitialLoadingAnimationCustomization f8609l;

    /* renamed from: m */
    FaceTecOvalCustomization f8610m;

    /* renamed from: n */
    FaceTecFrameCustomization f8611n;

    /* renamed from: o */
    FaceTecCancelButtonCustomization f8612o;

    /* renamed from: p */
    Map<String, String> f8613p;

    /* renamed from: r */
    FaceTecExitAnimationStyle f8614r;

    /* renamed from: s */
    FaceTecExitAnimationStyle f8615s;
    public FaceTecSecurityWatermarkImage securityWatermarkImage;
    public FaceTecVocalGuidanceCustomization vocalGuidanceCustomization;
    @Deprecated

    /* renamed from: w */
    private FaceTecSessionTimerCustomization f8616w;

    public FaceTecCustomization(Map<String, String> map) {
        this.f8600c = true;
        this.f8601d = false;
        this.f8598a = false;
        this.f8599b = false;
        this.f8602e = false;
        this.f8611n = new FaceTecFrameCustomization();
        this.f8608k = new FaceTecFeedbackCustomization();
        this.f8610m = new FaceTecOvalCustomization();
        this.f8612o = new FaceTecCancelButtonCustomization();
        this.f8606i = new FaceTecGuidanceCustomization();
        this.f8603f = new FaceTecResultScreenCustomization();
        this.f8607j = new FaceTecOverlayCustomization();
        this.f8605h = new FaceTecIDScanCustomization();
        this.f8604g = new FaceTecOCRConfirmationCustomization();
        this.f8616w = new FaceTecSessionTimerCustomization();
        this.f8609l = new FaceTecInitialLoadingAnimationCustomization();
        this.f8614r = FaceTecExitAnimationStyle.RIPPLE_OUT;
        this.f8615s = FaceTecExitAnimationStyle.NONE;
        this.exitAnimationUnsuccessResourceID = -1;
        this.exitAnimationSuccessResourceID = -1;
        this.f8613p = map;
        this.securityWatermarkImage = FaceTecSecurityWatermarkImage.FACETEC_ZOOM;
        this.vocalGuidanceCustomization = new FaceTecVocalGuidanceCustomization();
    }

    public static void setIDScanResultScreenMessageOverrides(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        HashMap<C2908cp, String> hashMap = new HashMap<>();
        f8597t = hashMap;
        hashMap.put(C2908cp.IDSCAN_RETRY_FACE_DID_NOT_MATCH, str10);
        f8597t.put(C2908cp.IDSCAN_RETRY_ID_NOT_FULLY_VISIBLE, str11);
        f8597t.put(C2908cp.IDSCAN_RETRY_OCR_RESULTS_NOT_GOOD_ENOUGH, str12);
        f8597t.put(C2908cp.IDSCAN_RETRY_ID_TYPE_NOT_SUPPORTED, str13);
        f8597t.put(C2908cp.IDSCAN_SKIP_OR_ERROR_NFC, str14);
        f8597t.put(C2908cp.IDSCAN_SUCCESS_FRONT_SIDE, str);
        f8597t.put(C2908cp.IDSCAN_SUCCESS_FRONT_SIDE_BACK_NEXT, str2);
        f8597t.put(C2908cp.IDSCAN_SUCCESS_FRONT_SIDE_NFC_NEXT, str3);
        f8597t.put(C2908cp.IDSCAN_SUCCESS_BACK_SIDE, str4);
        f8597t.put(C2908cp.IDSCAN_SUCCESS_BACK_SIDE_NFC_NEXT, str5);
        f8597t.put(C2908cp.IDSCAN_SUCCESS_PASSPORT, str6);
        f8597t.put(C2908cp.IDSCAN_SUCCESS_PASSPORT_NFC_NEXT, str7);
        f8597t.put(C2908cp.IDSCAN_SUCCESS_USER_CONFIRMATION, str8);
        f8597t.put(C2908cp.IDSCAN_SUCCESS_NFC, str9);
    }

    public static void setIDScanUploadMessageOverrides(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20) {
        HashMap<C2941dd, String> hashMap = new HashMap<>();
        f8596q = hashMap;
        String str21 = str;
        hashMap.put(C2941dd.IDSCAN_FRONT_SIDE_UPLOAD_STARTED, str);
        String str22 = str2;
        f8596q.put(C2941dd.IDSCAN_FRONT_SIDE_STILL_UPLOADING, str2);
        String str23 = str3;
        f8596q.put(C2941dd.IDSCAN_FRONT_SIDE_UPLOAD_COMPLETE_AWAITING_RESPONSE, str3);
        String str24 = str4;
        f8596q.put(C2941dd.IDSCAN_FRONT_SIDE_UPLOAD_COMPLETE_AWAITING_PROCESSING, str4);
        String str25 = str5;
        f8596q.put(C2941dd.IDSCAN_BACK_SIDE_UPLOAD_STARTED, str5);
        String str26 = str6;
        f8596q.put(C2941dd.IDSCAN_BACK_SIDE_STILL_UPLOADING, str6);
        String str27 = str7;
        f8596q.put(C2941dd.IDSCAN_BACK_SIDE_UPLOAD_COMPLETE_AWAITING_RESPONSE, str7);
        String str28 = str8;
        f8596q.put(C2941dd.IDSCAN_BACK_SIDE_UPLOAD_COMPLETE_AWAITING_PROCESSING, str8);
        String str29 = str9;
        f8596q.put(C2941dd.IDSCAN_USER_CONFIRMED_INFO_UPLOAD_STARTED, str9);
        String str30 = str10;
        f8596q.put(C2941dd.IDSCAN_USER_CONFIRMED_INFO_STILL_UPLOADING, str10);
        String str31 = str11;
        f8596q.put(C2941dd.IDSCAN_USER_CONFIRMED_INFO_UPLOAD_COMPLETE_AWAITING_RESPONSE, str11);
        String str32 = str12;
        f8596q.put(C2941dd.IDSCAN_USER_CONFIRMED_INFO_UPLOAD_COMPLETE_AWAITING_PROCESSING, str12);
        String str33 = str13;
        f8596q.put(C2941dd.NFC_UPLOAD_STARTED, str13);
        f8596q.put(C2941dd.NFC_STILL_UPLOADING, str14);
        f8596q.put(C2941dd.NFC_UPLOAD_COMPLETE_AWAITING_RESPONSE, str15);
        f8596q.put(C2941dd.NFC_UPLOAD_COMPLETE_AWAITING_PROCESSING, str16);
        f8596q.put(C2941dd.SKIPPED_NFC_UPLOAD_STARTED, str17);
        f8596q.put(C2941dd.SKIPPED_NFC_STILL_UPLOADING, str18);
        f8596q.put(C2941dd.SKIPPED_NFC_UPLOAD_COMPLETE_AWAITING_RESPONSE, str19);
        f8596q.put(C2941dd.SKIPPED_NFC_UPLOAD_COMPLETE_AWAITING_PROCESSING, str20);
    }

    public final FaceTecCancelButtonCustomization getCancelButtonCustomization() {
        return this.f8612o;
    }

    public final FaceTecExitAnimationStyle getExitAnimationSuccessCustom() {
        return this.f8614r;
    }

    public final FaceTecExitAnimationStyle getExitAnimationUnsuccessCustom() {
        return this.f8615s;
    }

    public final FaceTecFeedbackCustomization getFeedbackCustomization() {
        return this.f8608k;
    }

    public final FaceTecFrameCustomization getFrameCustomization() {
        return this.f8611n;
    }

    public final FaceTecGuidanceCustomization getGuidanceCustomization() {
        return this.f8606i;
    }

    public final FaceTecIDScanCustomization getIdScanCustomization() {
        return this.f8605h;
    }

    public final FaceTecInitialLoadingAnimationCustomization getInitialLoadingAnimationCustomization() {
        return this.f8609l;
    }

    public final FaceTecOCRConfirmationCustomization getOcrConfirmationCustomization() {
        return this.f8604g;
    }

    public final FaceTecOvalCustomization getOvalCustomization() {
        return this.f8610m;
    }

    public final FaceTecOverlayCustomization getOverlayCustomization() {
        return this.f8607j;
    }

    public final FaceTecResultScreenCustomization getResultScreenCustomization() {
        return this.f8603f;
    }

    public final FaceTecSessionTimerCustomization getSessionTimerCustomization() {
        return this.f8616w;
    }

    public final void setCancelButtonCustomization(FaceTecCancelButtonCustomization faceTecCancelButtonCustomization) {
        if (faceTecCancelButtonCustomization == null) {
            faceTecCancelButtonCustomization = new FaceTecCancelButtonCustomization();
        }
        this.f8612o = faceTecCancelButtonCustomization;
    }

    public final void setExitAnimationSuccessCustom(FaceTecExitAnimationStyle faceTecExitAnimationStyle) {
        if (faceTecExitAnimationStyle == null) {
            faceTecExitAnimationStyle = FaceTecExitAnimationStyle.CIRCLE_FADE;
        }
        this.f8614r = faceTecExitAnimationStyle;
        FaceTecExitAnimationStyle faceTecExitAnimationStyle2 = FaceTecExitAnimationStyle.CIRCLE_FADE;
    }

    public final void setExitAnimationUnsuccessCustom(FaceTecExitAnimationStyle faceTecExitAnimationStyle) {
        if (faceTecExitAnimationStyle == null) {
            faceTecExitAnimationStyle = FaceTecExitAnimationStyle.CIRCLE_FADE;
        }
        this.f8615s = faceTecExitAnimationStyle;
        FaceTecExitAnimationStyle faceTecExitAnimationStyle2 = FaceTecExitAnimationStyle.CIRCLE_FADE;
    }

    public final void setFeedbackCustomization(FaceTecFeedbackCustomization faceTecFeedbackCustomization) {
        if (faceTecFeedbackCustomization == null) {
            faceTecFeedbackCustomization = new FaceTecFeedbackCustomization();
        }
        this.f8608k = faceTecFeedbackCustomization;
    }

    public final void setFrameCustomization(FaceTecFrameCustomization faceTecFrameCustomization) {
        if (faceTecFrameCustomization == null) {
            faceTecFrameCustomization = new FaceTecFrameCustomization();
        }
        this.f8611n = faceTecFrameCustomization;
    }

    public final void setGuidanceCustomization(FaceTecGuidanceCustomization faceTecGuidanceCustomization) {
        if (faceTecGuidanceCustomization == null) {
            faceTecGuidanceCustomization = new FaceTecGuidanceCustomization();
        }
        this.f8606i = faceTecGuidanceCustomization;
    }

    public final void setIdScanCustomization(FaceTecIDScanCustomization faceTecIDScanCustomization) {
        if (faceTecIDScanCustomization == null) {
            faceTecIDScanCustomization = new FaceTecIDScanCustomization();
        }
        this.f8605h = faceTecIDScanCustomization;
    }

    public final void setInitialLoadingAnimationCustomization(FaceTecInitialLoadingAnimationCustomization faceTecInitialLoadingAnimationCustomization) {
        if (faceTecInitialLoadingAnimationCustomization == null) {
            faceTecInitialLoadingAnimationCustomization = new FaceTecInitialLoadingAnimationCustomization();
        }
        this.f8609l = faceTecInitialLoadingAnimationCustomization;
    }

    public final void setOcrConfirmationCustomization(FaceTecOCRConfirmationCustomization faceTecOCRConfirmationCustomization) {
        if (faceTecOCRConfirmationCustomization == null) {
            faceTecOCRConfirmationCustomization = new FaceTecOCRConfirmationCustomization();
        }
        this.f8604g = faceTecOCRConfirmationCustomization;
    }

    public final void setOvalCustomization(FaceTecOvalCustomization faceTecOvalCustomization) {
        if (faceTecOvalCustomization == null) {
            faceTecOvalCustomization = new FaceTecOvalCustomization();
        }
        this.f8610m = faceTecOvalCustomization;
    }

    public final void setOverlayCustomization(FaceTecOverlayCustomization faceTecOverlayCustomization) {
        if (faceTecOverlayCustomization == null) {
            faceTecOverlayCustomization = new FaceTecOverlayCustomization();
        }
        this.f8607j = faceTecOverlayCustomization;
    }

    public final void setResultScreenCustomization(FaceTecResultScreenCustomization faceTecResultScreenCustomization) {
        if (faceTecResultScreenCustomization == null) {
            faceTecResultScreenCustomization = new FaceTecResultScreenCustomization();
        }
        this.f8603f = faceTecResultScreenCustomization;
    }

    public final void setSessionTimerCustomization(FaceTecSessionTimerCustomization faceTecSessionTimerCustomization) {
        if (faceTecSessionTimerCustomization == null) {
            faceTecSessionTimerCustomization = new FaceTecSessionTimerCustomization();
        }
        this.f8616w = faceTecSessionTimerCustomization;
    }

    public static void setIDScanResultScreenMessageOverrides(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        C2797ar.m10878a(String.format("FaceTec SDK Deprecated Method Warning:  The %s function with these arguments is deprecated, please use the updated overload in order to customize all available strings.", new Object[]{"setIDScanResultScreenMessageOverrides"}));
        HashMap<C2908cp, String> hashMap = new HashMap<>();
        f8597t = hashMap;
        hashMap.put(C2908cp.IDSCAN_RETRY_FACE_DID_NOT_MATCH, str8);
        f8597t.put(C2908cp.IDSCAN_RETRY_ID_NOT_FULLY_VISIBLE, str9);
        f8597t.put(C2908cp.IDSCAN_RETRY_OCR_RESULTS_NOT_GOOD_ENOUGH, str10);
        f8597t.put(C2908cp.IDSCAN_RETRY_ID_TYPE_NOT_SUPPORTED, str11);
        f8597t.put(C2908cp.IDSCAN_SKIP_OR_ERROR_NFC, str12);
        f8597t.put(C2908cp.IDSCAN_SUCCESS_FRONT_SIDE, str);
        f8597t.put(C2908cp.IDSCAN_SUCCESS_FRONT_SIDE_BACK_NEXT, str2);
        f8597t.put(C2908cp.IDSCAN_SUCCESS_FRONT_SIDE_NFC_NEXT, str3);
        f8597t.put(C2908cp.IDSCAN_SUCCESS_BACK_SIDE, str4);
        f8597t.put(C2908cp.IDSCAN_SUCCESS_BACK_SIDE_NFC_NEXT, str5);
        f8597t.put(C2908cp.IDSCAN_SUCCESS_USER_CONFIRMATION, str6);
        f8597t.put(C2908cp.IDSCAN_SUCCESS_NFC, str7);
    }

    @Deprecated
    public static void setIDScanUploadMessageOverrides(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        C2797ar.m10878a(String.format("FaceTec SDK Deprecated Method Warning:  The %s function with these arguments is deprecated, please use the updated overload in order to customize all available strings.", new Object[]{"setIDScanUploadMessageOverrides"}));
        HashMap<C2941dd, String> hashMap = new HashMap<>();
        f8596q = hashMap;
        String str17 = str;
        hashMap.put(C2941dd.IDSCAN_FRONT_SIDE_UPLOAD_STARTED, str);
        String str18 = str2;
        f8596q.put(C2941dd.IDSCAN_FRONT_SIDE_STILL_UPLOADING, str2);
        String str19 = str3;
        f8596q.put(C2941dd.IDSCAN_FRONT_SIDE_UPLOAD_COMPLETE_AWAITING_RESPONSE, str3);
        String str20 = str4;
        f8596q.put(C2941dd.IDSCAN_FRONT_SIDE_UPLOAD_COMPLETE_AWAITING_PROCESSING, str4);
        String str21 = str5;
        f8596q.put(C2941dd.IDSCAN_BACK_SIDE_UPLOAD_STARTED, str5);
        String str22 = str6;
        f8596q.put(C2941dd.IDSCAN_BACK_SIDE_STILL_UPLOADING, str6);
        String str23 = str7;
        f8596q.put(C2941dd.IDSCAN_BACK_SIDE_UPLOAD_COMPLETE_AWAITING_RESPONSE, str7);
        String str24 = str8;
        f8596q.put(C2941dd.IDSCAN_BACK_SIDE_UPLOAD_COMPLETE_AWAITING_PROCESSING, str8);
        String str25 = str9;
        f8596q.put(C2941dd.IDSCAN_USER_CONFIRMED_INFO_UPLOAD_STARTED, str9);
        String str26 = str10;
        f8596q.put(C2941dd.IDSCAN_USER_CONFIRMED_INFO_STILL_UPLOADING, str10);
        String str27 = str11;
        f8596q.put(C2941dd.IDSCAN_USER_CONFIRMED_INFO_UPLOAD_COMPLETE_AWAITING_RESPONSE, str11);
        String str28 = str12;
        f8596q.put(C2941dd.IDSCAN_USER_CONFIRMED_INFO_UPLOAD_COMPLETE_AWAITING_PROCESSING, str12);
        String str29 = str13;
        f8596q.put(C2941dd.NFC_UPLOAD_STARTED, str13);
        f8596q.put(C2941dd.NFC_STILL_UPLOADING, str14);
        f8596q.put(C2941dd.NFC_UPLOAD_COMPLETE_AWAITING_RESPONSE, str15);
        f8596q.put(C2941dd.NFC_UPLOAD_COMPLETE_AWAITING_PROCESSING, str16);
    }

    public FaceTecCustomization() {
        this(new HashMap());
    }

    public static void setIDScanResultScreenMessageOverrides(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        C2797ar.m10878a(String.format("FaceTec SDK Deprecated Method Warning:  The %s function with these arguments is deprecated, please use the updated overload in order to customize all available strings.", new Object[]{"setIDScanResultScreenMessageOverrides"}));
        HashMap<C2908cp, String> hashMap = new HashMap<>();
        f8597t = hashMap;
        hashMap.put(C2908cp.IDSCAN_RETRY_FACE_DID_NOT_MATCH, str6);
        f8597t.put(C2908cp.IDSCAN_RETRY_ID_NOT_FULLY_VISIBLE, str7);
        f8597t.put(C2908cp.IDSCAN_RETRY_OCR_RESULTS_NOT_GOOD_ENOUGH, str8);
        f8597t.put(C2908cp.IDSCAN_RETRY_ID_TYPE_NOT_SUPPORTED, str9);
        f8597t.put(C2908cp.IDSCAN_SKIP_OR_ERROR_NFC, str10);
        f8597t.put(C2908cp.IDSCAN_SUCCESS_FRONT_SIDE, str);
        f8597t.put(C2908cp.IDSCAN_SUCCESS_FRONT_SIDE_BACK_NEXT, str2);
        f8597t.put(C2908cp.IDSCAN_SUCCESS_BACK_SIDE, str3);
        f8597t.put(C2908cp.IDSCAN_SUCCESS_USER_CONFIRMATION, str4);
        f8597t.put(C2908cp.IDSCAN_SUCCESS_NFC, str5);
    }

    @Deprecated
    public static void setIDScanResultScreenMessageOverrides(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        C2797ar.m10878a(String.format("FaceTec SDK Deprecated Method Warning:  The %s function with these arguments is deprecated, please use the updated overload in order to customize all available strings.", new Object[]{"setIDScanResultScreenMessageOverrides"}));
        HashMap<C2908cp, String> hashMap = new HashMap<>();
        f8597t = hashMap;
        hashMap.put(C2908cp.IDSCAN_RETRY_FACE_DID_NOT_MATCH, str6);
        f8597t.put(C2908cp.IDSCAN_RETRY_ID_NOT_FULLY_VISIBLE, str7);
        f8597t.put(C2908cp.IDSCAN_RETRY_OCR_RESULTS_NOT_GOOD_ENOUGH, str8);
        f8597t.put(C2908cp.IDSCAN_SKIP_OR_ERROR_NFC, str9);
        f8597t.put(C2908cp.IDSCAN_SUCCESS_FRONT_SIDE, str);
        f8597t.put(C2908cp.IDSCAN_SUCCESS_FRONT_SIDE_BACK_NEXT, str2);
        f8597t.put(C2908cp.IDSCAN_SUCCESS_BACK_SIDE, str3);
        f8597t.put(C2908cp.IDSCAN_SUCCESS_USER_CONFIRMATION, str4);
        f8597t.put(C2908cp.IDSCAN_SUCCESS_NFC, str5);
    }

    @Deprecated
    public static void setIDScanResultScreenMessageOverrides(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C2797ar.m10878a(String.format("FaceTec SDK Deprecated Method Warning:  The %s function with these arguments is deprecated, please use the updated overload in order to customize all available strings.", new Object[]{"setIDScanResultScreenMessageOverrides"}));
        HashMap<C2908cp, String> hashMap = new HashMap<>();
        f8597t = hashMap;
        hashMap.put(C2908cp.IDSCAN_RETRY_FACE_DID_NOT_MATCH, str5);
        f8597t.put(C2908cp.IDSCAN_RETRY_ID_NOT_FULLY_VISIBLE, str6);
        f8597t.put(C2908cp.IDSCAN_RETRY_OCR_RESULTS_NOT_GOOD_ENOUGH, str7);
        f8597t.put(C2908cp.IDSCAN_SUCCESS_FRONT_SIDE, str);
        f8597t.put(C2908cp.IDSCAN_SUCCESS_FRONT_SIDE_BACK_NEXT, str2);
        f8597t.put(C2908cp.IDSCAN_SUCCESS_BACK_SIDE, str3);
        f8597t.put(C2908cp.IDSCAN_SUCCESS_USER_CONFIRMATION, str4);
    }
}
