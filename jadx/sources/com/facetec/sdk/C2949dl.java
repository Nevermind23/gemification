package com.facetec.sdk;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Handler;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.facetec.sdk.C2831bd;
import com.facetec.sdk.FaceTecVocalGuidanceCustomization;
import java.util.HashMap;

/* renamed from: com.facetec.sdk.dl */
final class C2949dl {

    /* renamed from: a */
    private static Object f9967a = new Object();

    /* renamed from: b */
    static boolean f9968b = false;

    /* renamed from: c */
    static SharedPreferences f9969c = null;

    /* renamed from: d */
    private static MediaPlayer f9970d = null;

    /* renamed from: e */
    private static Handler f9971e = null;

    /* renamed from: f */
    private static MediaPlayer f9972f = null;

    /* renamed from: g */
    private static MediaPlayer f9973g = null;

    /* renamed from: h */
    private static MediaPlayer f9974h = null;

    /* renamed from: i */
    private static MediaPlayer f9975i = null;

    /* renamed from: j */
    private static MediaPlayer f9976j = null;

    /* renamed from: k */
    private static int f9977k = 0;

    /* renamed from: m */
    private static boolean f9978m = false;

    /* renamed from: n */
    private static TextToSpeech f9979n;

    /* renamed from: com.facetec.sdk.dl$5 */
    static /* synthetic */ class C29505 {

        /* renamed from: b */
        static final /* synthetic */ int[] f9980b;

        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|(3:31|32|34)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.facetec.sdk.dl$d[] r0 = com.facetec.sdk.C2949dl.C2951d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9980b = r0
                com.facetec.sdk.dl$d r1 = com.facetec.sdk.C2949dl.C2951d.GET_READY_PRESS_BUTTON_TAPPING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9980b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facetec.sdk.dl$d r1 = com.facetec.sdk.C2949dl.C2951d.GET_READY_PRESS_BUTTON_DELAYED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9980b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facetec.sdk.dl$d r1 = com.facetec.sdk.C2949dl.C2951d.RETRY_PRESS_BUTTON_TAPPING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f9980b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facetec.sdk.dl$d r1 = com.facetec.sdk.C2949dl.C2951d.GET_READY_FRAME_YOUR_FACE_TAPPING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f9980b     // Catch:{ NoSuchFieldError -> 0x003e }
                com.facetec.sdk.dl$d r1 = com.facetec.sdk.C2949dl.C2951d.GET_READY_FRAME_YOUR_FACE_AUTOMATIC     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f9980b     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.facetec.sdk.dl$d r1 = com.facetec.sdk.C2949dl.C2951d.FACE_CAPTURE_UNZOOMED_FRAME_YOUR_FACE_TAPPING     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f9980b     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.facetec.sdk.dl$d r1 = com.facetec.sdk.C2949dl.C2951d.FACE_CAPTURE_FRAME_YOUR_FACE_DELAYED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f9980b     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.facetec.sdk.dl$d r1 = com.facetec.sdk.C2949dl.C2951d.FACE_CAPTURE_ZOOMED_PLEASE_FRAME_YOUR_FACE_TAPPING     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f9980b     // Catch:{ NoSuchFieldError -> 0x006c }
                com.facetec.sdk.dl$d r1 = com.facetec.sdk.C2949dl.C2951d.FACE_CAPTURE_ZOOMED_MOVE_CLOSER_TAPPING     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f9980b     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.facetec.sdk.dl$d r1 = com.facetec.sdk.C2949dl.C2951d.FACE_CAPTURE_MOVE_CLOSER_AUTOMATIC     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f9980b     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.facetec.sdk.dl$d r1 = com.facetec.sdk.C2949dl.C2951d.FACE_CAPTURE_MOVE_CLOSER_DELAYED     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f9980b     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.facetec.sdk.dl$d r1 = com.facetec.sdk.C2949dl.C2951d.SUCCESS     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f9980b     // Catch:{ NoSuchFieldError -> 0x009c }
                com.facetec.sdk.dl$d r1 = com.facetec.sdk.C2949dl.C2951d.UPLOADING     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f9980b     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.facetec.sdk.dl$d r1 = com.facetec.sdk.C2949dl.C2951d.RETRY     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f9980b     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.facetec.sdk.dl$d r1 = com.facetec.sdk.C2949dl.C2951d.BLIND_USER_ASSIST_TAP_PROMPT     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f9980b     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.facetec.sdk.dl$d r1 = com.facetec.sdk.C2949dl.C2951d.BLIND_USER_ASSIST_FACESCAN_FEEDBACK     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2949dl.C29505.<clinit>():void");
        }
    }

    /* renamed from: com.facetec.sdk.dl$d */
    enum C2951d {
        GET_READY_PRESS_BUTTON_TAPPING("GET_READY_PRESS_BUTTON_TAPPING"),
        GET_READY_FRAME_YOUR_FACE_TAPPING("GET_READY_FRAME_YOUR_FACE_TAPPING"),
        GET_READY_PRESS_BUTTON_DELAYED("GET_READY_PRESS_BUTTON_DELAYED"),
        GET_READY_FRAME_YOUR_FACE_AUTOMATIC("GET_READY_FRAME_YOUR_FACE_AUTOMATIC"),
        RETRY_PRESS_BUTTON_TAPPING("RETRY_PRESS_BUTTON_TAPPING"),
        FACE_CAPTURE_UNZOOMED_FRAME_YOUR_FACE_TAPPING("FACE_CAPTURE_UNZOOMED_FRAME_YOUR_FACE_TAPPING"),
        FACE_CAPTURE_FRAME_YOUR_FACE_DELAYED("FACE_CAPTURE_FRAME_YOUR_FACE_DELAYED"),
        FACE_CAPTURE_ZOOMED_MOVE_CLOSER_TAPPING("FACE_CAPTURE_ZOOMED_MOVE_CLOSER_TAPPING"),
        FACE_CAPTURE_ZOOMED_PLEASE_FRAME_YOUR_FACE_TAPPING("FACE_CAPTURE_ZOOMED_PLEASE_FRAME_YOUR_FACE_TAPPING"),
        FACE_CAPTURE_MOVE_CLOSER_AUTOMATIC("FACE_CAPTURE_MOVE_CLOSER_AUTOMATIC"),
        FACE_CAPTURE_MOVE_CLOSER_DELAYED("FACE_CAPTURE_MOVE_CLOSER_DELAYED"),
        BLIND_USER_ASSIST_TAP_PROMPT("BLIND_USER_ASSIST_TAP_PROMPT"),
        BLIND_USER_ASSIST_FACESCAN_FEEDBACK("BLIND_USER_ASSIST_FACESCAN_FEEDBACK"),
        SUCCESS("SUCCESS"),
        UPLOADING("UPLOADING"),
        RETRY("RETRY");
        

        /* renamed from: q */
        final String f9998q;

        private C2951d(String str) {
            this.f9998q = str;
        }
    }

    C2949dl() {
    }

    /* renamed from: a */
    static boolean m12473a() {
        return f9978m;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m12479c(int i) {
    }

    /* renamed from: d */
    static void m12483d(Context context, C2951d dVar) {
        if (f9978m || (!C2780ai.f8828e && !m12486e() && !m12489h() && FaceTecSDK.f8630e.vocalGuidanceCustomization.mode != FaceTecVocalGuidanceCustomization.VocalGuidanceMode.NO_VOCAL_GUIDANCE)) {
            switch (C29505.f9980b[dVar.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    m12484d(f9972f);
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    m12484d(f9970d);
                    break;
                case 9:
                case 10:
                case 11:
                    m12484d(f9976j);
                    break;
                case 12:
                    m12484d(f9973g);
                    break;
                case 13:
                    m12484d(f9974h);
                    break;
                case 14:
                    m12484d(f9975i);
                    break;
                case 15:
                    m12472a(context.getString(C2747R.string.FaceTec_accessibility_tap_guidance));
                    break;
                case 16:
                    m12472a(context.getString(f9977k));
                    break;
            }
            C3555s.m13905d(context, dVar);
        }
    }

    /* renamed from: e */
    private static boolean m12486e() {
        return f9970d == null || f9976j == null || f9975i == null || f9974h == null || f9973g == null || f9972f == null;
    }

    /* renamed from: h */
    private static boolean m12489h() {
        if (f9970d.isPlaying() || f9976j.isPlaying() || f9975i.isPlaying() || f9974h.isPlaying() || f9973g.isPlaying() || f9972f.isPlaying()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static void m12470a(int i) {
        f9977k = i;
    }

    /* renamed from: b */
    private static MediaPlayer m12474b(Context context, int i) {
        if (i == -1) {
            return null;
        }
        return MediaPlayer.create(context, i);
    }

    /* renamed from: c */
    static void m12478c() {
        TextToSpeech textToSpeech = f9979n;
        if (textToSpeech != null && textToSpeech.isSpeaking()) {
            f9979n.stop();
        }
    }

    /* renamed from: e */
    static void m12485e(Context context) {
        C2831bd bdVar = (C2831bd) context;
        if (FaceTecSDK.f8630e.vocalGuidanceCustomization.mode != FaceTecVocalGuidanceCustomization.VocalGuidanceMode.NO_VOCAL_GUIDANCE) {
            bdVar.f9174y.setOnTouchListener(new C3667wi(bdVar, context));
        }
    }

    /* renamed from: a */
    static void m12472a(String str) {
        TextToSpeech textToSpeech = f9979n;
        if (textToSpeech != null) {
            textToSpeech.speak(str, 0, (HashMap) null);
        }
    }

    /* renamed from: b */
    static void m12475b() {
        MediaPlayer mediaPlayer = f9970d;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            f9970d = null;
        }
        MediaPlayer mediaPlayer2 = f9976j;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
            f9976j = null;
        }
        MediaPlayer mediaPlayer3 = f9975i;
        if (mediaPlayer3 != null) {
            mediaPlayer3.release();
            f9975i = null;
        }
        MediaPlayer mediaPlayer4 = f9972f;
        if (mediaPlayer4 != null) {
            mediaPlayer4.release();
            f9972f = null;
        }
        MediaPlayer mediaPlayer5 = f9974h;
        if (mediaPlayer5 != null) {
            mediaPlayer5.release();
            f9974h = null;
        }
        MediaPlayer mediaPlayer6 = f9973g;
        if (mediaPlayer6 != null) {
            mediaPlayer6.release();
            f9973g = null;
        }
        if (f9969c != null) {
            f9973g = null;
        }
    }

    /* renamed from: c */
    static void m12480c(Context context) {
        FaceTecVocalGuidanceCustomization faceTecVocalGuidanceCustomization = FaceTecSDK.f8630e.vocalGuidanceCustomization;
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            for (AccessibilityServiceInfo id : accessibilityManager.getEnabledAccessibilityServiceList(1)) {
                if (id.getId().contains("TalkBackService")) {
                    f9978m = true;
                }
            }
        }
        if (f9978m) {
            C2885cd.m11793Z();
            f9979n = new TextToSpeech(context, new C3688xi());
        }
        f9970d = m12474b(context, faceTecVocalGuidanceCustomization.pleaseFrameYourFaceInTheOvalSoundFile);
        f9976j = m12474b(context, faceTecVocalGuidanceCustomization.pleaseMoveCloserSoundFile);
        f9975i = m12474b(context, faceTecVocalGuidanceCustomization.pleaseRetrySoundFile);
        f9974h = m12474b(context, faceTecVocalGuidanceCustomization.uploadingSoundFile);
        f9973g = m12474b(context, faceTecVocalGuidanceCustomization.facescanSuccessfulSoundFile);
        f9972f = m12474b(context, faceTecVocalGuidanceCustomization.pleasePressTheButtonToStartSoundFile);
        if (m12486e()) {
            Log.i("FaceTecSDK", "WARNING: Vocal Guidance files were not provided.\nThese files can be set using FaceTecVocalGuidanceCustomization.\nDocumentation: https://dev.facetec.com/ui-customization#vocal-guidance\n");
            FaceTecSDK.f8630e.vocalGuidanceCustomization.mode = FaceTecVocalGuidanceCustomization.VocalGuidanceMode.NO_VOCAL_GUIDANCE;
        }
        SharedPreferences g = C2840bg.m11376g(context);
        f9969c = g;
        f9968b = g.getBoolean("facetecMoveCloserSoundHasBeenPlayed", false);
    }

    /* renamed from: a */
    static void m12471a(Context context) {
        f9971e = new Handler();
        C3709yi yiVar = new C3709yi(context);
        if (FaceTecSDK.f8630e.vocalGuidanceCustomization.mode == FaceTecVocalGuidanceCustomization.VocalGuidanceMode.FULL_VOCAL_GUIDANCE) {
            f9971e.postDelayed(yiVar, 4500);
        } else if (FaceTecSDK.f8630e.vocalGuidanceCustomization.mode == FaceTecVocalGuidanceCustomization.VocalGuidanceMode.MINIMAL_VOCAL_GUIDANCE) {
            f9971e.postDelayed(yiVar, 15000);
        }
    }

    /* renamed from: d */
    private static void m12484d(MediaPlayer mediaPlayer) {
        if (!m12473a()) {
            mediaPlayer.start();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m12482d(Context context) {
        if (C2885cd.m11836f() == C2884cc.ZOOM_FAR) {
            m12483d(context, C2951d.FACE_CAPTURE_FRAME_YOUR_FACE_DELAYED);
        }
    }

    /* renamed from: d */
    static void m12481d() {
        synchronized (f9967a) {
            Handler handler = f9971e;
            if (handler != null) {
                handler.removeCallbacksAndMessages((Object) null);
                f9971e = null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ boolean m12477b(C2831bd bdVar, Context context, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (bdVar.getFragmentManager().findFragmentByTag("PreEnroll") != null) {
                C2983e eVar = ((C2813ay) bdVar.getFragmentManager().findFragmentByTag("PreEnroll")).f9034c;
                if (eVar == null || C2855bq.f9342l) {
                    return true;
                }
                if (eVar.isEnabled()) {
                    m12483d(context, C2951d.GET_READY_PRESS_BUTTON_TAPPING);
                } else {
                    m12483d(context, C2951d.FACE_CAPTURE_UNZOOMED_FRAME_YOUR_FACE_TAPPING);
                }
            } else if (bdVar.getFragmentManager().findFragmentByTag("RetryZoom") != null) {
                C2813ay ayVar = (C2813ay) bdVar.getFragmentManager().findFragmentByTag("RetryZoom");
                C2983e eVar2 = ayVar.f9034c;
                if (eVar2 == null || C2905cn.f9674k) {
                    return true;
                }
                if (eVar2.isEnabled()) {
                    m12483d(context, C2951d.GET_READY_PRESS_BUTTON_TAPPING);
                } else if (((C2905cn) ayVar).f9677n == 1) {
                    m12483d(context, C2951d.FACE_CAPTURE_UNZOOMED_FRAME_YOUR_FACE_TAPPING);
                }
            } else if (bdVar.getFragmentManager().findFragmentByTag("Zoom") != null) {
                if (bdVar.f9166q != C2831bd.C2835e.FACESCAN_SESSION_STARTED) {
                    if (((C2799at) bdVar.getFragmentManager().findFragmentByTag("Zoom")).f8972d == C2895ch.FRAME_YOUR_FACE) {
                        m12483d(context, C2951d.FACE_CAPTURE_ZOOMED_PLEASE_FRAME_YOUR_FACE_TAPPING);
                    }
                } else if (C2885cd.m11836f() == C2884cc.ZOOM_CLOSE) {
                    if (C2885cd.m11858t() == C2865by.MOVE_FACE_CLOSER) {
                        m12483d(context, C2951d.FACE_CAPTURE_ZOOMED_MOVE_CLOSER_TAPPING);
                    } else if (C2885cd.m11858t() != C2865by.HOLD_STEADY) {
                        m12483d(context, C2951d.FACE_CAPTURE_ZOOMED_PLEASE_FRAME_YOUR_FACE_TAPPING);
                    }
                } else if (C2885cd.m11836f() == C2884cc.ZOOM_FAR && C2885cd.m11858t() != C2865by.HOLD_STEADY) {
                    m12483d(context, C2951d.FACE_CAPTURE_UNZOOMED_FRAME_YOUR_FACE_TAPPING);
                }
            }
        }
        return true;
    }
}
