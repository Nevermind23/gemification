package com.facetec.sdk;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.os.Process;
import android.text.Html;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.content.C0767a;
import com.facetec.sdk.FaceTecSDK;
import com.github.mikephil.charting.utils.Utils;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.facetec.sdk.dc */
final class C2938dc {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: a */
    private static final C3050f<Float> f9838a = new C3050f<>();

    /* renamed from: b */
    private static final C3050f<Float> f9839b = new C3050f<>();

    /* renamed from: c */
    private static final C3050f<DisplayMetrics> f9840c = new C3050f<>();

    /* renamed from: d */
    private static final C3050f<Float> f9841d = new C3050f<>();

    /* renamed from: e */
    private static final C3050f<Resources> f9842e = new C3050f<>();

    /* renamed from: f */
    private static int f9843f = 0;

    /* renamed from: g */
    private static int f9844g;

    /* renamed from: i */
    private static long f9845i;

    /* renamed from: com.facetec.sdk.dc$2 */
    static /* synthetic */ class C29392 {

        /* renamed from: b */
        static final /* synthetic */ int[] f9846b;

        /* renamed from: c */
        static final /* synthetic */ int[] f9847c;

        /* renamed from: d */
        static final /* synthetic */ int[] f9848d;

        /* JADX WARNING: Can't wrap try/catch for region: R(58:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|71|72|(3:73|74|76)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(59:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|71|72|(3:73|74|76)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(60:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|71|72|(3:73|74|76)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(61:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|71|72|(3:73|74|76)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(63:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|71|72|(3:73|74|76)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(65:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|71|72|(3:73|74|76)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x007b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0085 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x008f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0099 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00a3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00ad */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00b7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00c3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00cf */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00db */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00e7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00f3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00ff */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x010b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0117 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x0123 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x0140 */
        static {
            /*
                com.facetec.sdk.bs[] r0 = com.facetec.sdk.C2857bs.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9847c = r0
                r1 = 1
                com.facetec.sdk.bs r2 = com.facetec.sdk.C2857bs.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f9847c     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facetec.sdk.bs r3 = com.facetec.sdk.C2857bs.STARTING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f9847c     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facetec.sdk.bs r4 = com.facetec.sdk.C2857bs.SCANNING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f9847c     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facetec.sdk.bs r5 = com.facetec.sdk.C2857bs.WEAK_CONNECTION     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f9847c     // Catch:{ NoSuchFieldError -> 0x003e }
                com.facetec.sdk.bs r6 = com.facetec.sdk.C2857bs.FINISHED_WITH_SUCCESS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = f9847c     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.facetec.sdk.bs r7 = com.facetec.sdk.C2857bs.FINISHED_WITH_ERROR     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = f9847c     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.facetec.sdk.bs r8 = com.facetec.sdk.C2857bs.SKIPPED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                r7 = 8
                int[] r8 = f9847c     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.facetec.sdk.bs r9 = com.facetec.sdk.C2857bs.DISABLED     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                com.facetec.sdk.cp[] r8 = com.facetec.sdk.C2908cp.values()
                int r8 = r8.length
                int[] r8 = new int[r8]
                f9848d = r8
                com.facetec.sdk.cp r9 = com.facetec.sdk.C2908cp.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0071 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0071 }
                r8[r9] = r1     // Catch:{ NoSuchFieldError -> 0x0071 }
            L_0x0071:
                int[] r8 = f9848d     // Catch:{ NoSuchFieldError -> 0x007b }
                com.facetec.sdk.cp r9 = com.facetec.sdk.C2908cp.IDSCAN_RETRY_FACE_DID_NOT_MATCH     // Catch:{ NoSuchFieldError -> 0x007b }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x007b }
                r8[r9] = r0     // Catch:{ NoSuchFieldError -> 0x007b }
            L_0x007b:
                int[] r8 = f9848d     // Catch:{ NoSuchFieldError -> 0x0085 }
                com.facetec.sdk.cp r9 = com.facetec.sdk.C2908cp.IDSCAN_RETRY_ID_NOT_FULLY_VISIBLE     // Catch:{ NoSuchFieldError -> 0x0085 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0085 }
                r8[r9] = r2     // Catch:{ NoSuchFieldError -> 0x0085 }
            L_0x0085:
                int[] r2 = f9848d     // Catch:{ NoSuchFieldError -> 0x008f }
                com.facetec.sdk.cp r8 = com.facetec.sdk.C2908cp.IDSCAN_RETRY_OCR_RESULTS_NOT_GOOD_ENOUGH     // Catch:{ NoSuchFieldError -> 0x008f }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r2[r8] = r3     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                int[] r2 = f9848d     // Catch:{ NoSuchFieldError -> 0x0099 }
                com.facetec.sdk.cp r3 = com.facetec.sdk.C2908cp.IDSCAN_RETRY_ID_TYPE_NOT_SUPPORTED     // Catch:{ NoSuchFieldError -> 0x0099 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0099 }
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0099 }
            L_0x0099:
                int[] r2 = f9848d     // Catch:{ NoSuchFieldError -> 0x00a3 }
                com.facetec.sdk.cp r3 = com.facetec.sdk.C2908cp.IDSCAN_RETRY_BARCODE_NOT_READ     // Catch:{ NoSuchFieldError -> 0x00a3 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a3 }
                r2[r3] = r5     // Catch:{ NoSuchFieldError -> 0x00a3 }
            L_0x00a3:
                int[] r2 = f9848d     // Catch:{ NoSuchFieldError -> 0x00ad }
                com.facetec.sdk.cp r3 = com.facetec.sdk.C2908cp.IDSCAN_RETRY_USER_CONFIRMATION     // Catch:{ NoSuchFieldError -> 0x00ad }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ad }
                r2[r3] = r6     // Catch:{ NoSuchFieldError -> 0x00ad }
            L_0x00ad:
                int[] r2 = f9848d     // Catch:{ NoSuchFieldError -> 0x00b7 }
                com.facetec.sdk.cp r3 = com.facetec.sdk.C2908cp.IDSCAN_SKIP_OR_ERROR_NFC     // Catch:{ NoSuchFieldError -> 0x00b7 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b7 }
                r2[r3] = r7     // Catch:{ NoSuchFieldError -> 0x00b7 }
            L_0x00b7:
                int[] r2 = f9848d     // Catch:{ NoSuchFieldError -> 0x00c3 }
                com.facetec.sdk.cp r3 = com.facetec.sdk.C2908cp.IDSCAN_SUCCESS_FRONT_SIDE     // Catch:{ NoSuchFieldError -> 0x00c3 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c3 }
                r4 = 9
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x00c3 }
            L_0x00c3:
                int[] r2 = f9848d     // Catch:{ NoSuchFieldError -> 0x00cf }
                com.facetec.sdk.cp r3 = com.facetec.sdk.C2908cp.IDSCAN_SUCCESS_FRONT_SIDE_BACK_NEXT     // Catch:{ NoSuchFieldError -> 0x00cf }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cf }
                r4 = 10
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x00cf }
            L_0x00cf:
                int[] r2 = f9848d     // Catch:{ NoSuchFieldError -> 0x00db }
                com.facetec.sdk.cp r3 = com.facetec.sdk.C2908cp.IDSCAN_SUCCESS_FRONT_SIDE_NFC_NEXT     // Catch:{ NoSuchFieldError -> 0x00db }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00db }
                r4 = 11
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x00db }
            L_0x00db:
                int[] r2 = f9848d     // Catch:{ NoSuchFieldError -> 0x00e7 }
                com.facetec.sdk.cp r3 = com.facetec.sdk.C2908cp.IDSCAN_SUCCESS_BACK_SIDE     // Catch:{ NoSuchFieldError -> 0x00e7 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e7 }
                r4 = 12
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x00e7 }
            L_0x00e7:
                int[] r2 = f9848d     // Catch:{ NoSuchFieldError -> 0x00f3 }
                com.facetec.sdk.cp r3 = com.facetec.sdk.C2908cp.IDSCAN_SUCCESS_BACK_SIDE_NFC_NEXT     // Catch:{ NoSuchFieldError -> 0x00f3 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f3 }
                r4 = 13
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x00f3 }
            L_0x00f3:
                int[] r2 = f9848d     // Catch:{ NoSuchFieldError -> 0x00ff }
                com.facetec.sdk.cp r3 = com.facetec.sdk.C2908cp.IDSCAN_SUCCESS_PASSPORT     // Catch:{ NoSuchFieldError -> 0x00ff }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ff }
                r4 = 14
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x00ff }
            L_0x00ff:
                int[] r2 = f9848d     // Catch:{ NoSuchFieldError -> 0x010b }
                com.facetec.sdk.cp r3 = com.facetec.sdk.C2908cp.IDSCAN_SUCCESS_PASSPORT_NFC_NEXT     // Catch:{ NoSuchFieldError -> 0x010b }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x010b }
                r4 = 15
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x010b }
            L_0x010b:
                int[] r2 = f9848d     // Catch:{ NoSuchFieldError -> 0x0117 }
                com.facetec.sdk.cp r3 = com.facetec.sdk.C2908cp.IDSCAN_SUCCESS_USER_CONFIRMATION     // Catch:{ NoSuchFieldError -> 0x0117 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0117 }
                r4 = 16
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0117 }
            L_0x0117:
                int[] r2 = f9848d     // Catch:{ NoSuchFieldError -> 0x0123 }
                com.facetec.sdk.cp r3 = com.facetec.sdk.C2908cp.IDSCAN_SUCCESS_NFC     // Catch:{ NoSuchFieldError -> 0x0123 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0123 }
                r4 = 17
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0123 }
            L_0x0123:
                int[] r2 = f9848d     // Catch:{ NoSuchFieldError -> 0x012f }
                com.facetec.sdk.cp r3 = com.facetec.sdk.C2908cp.IDSCAN_SUCCESS_ADDITIONAL_REVIEW     // Catch:{ NoSuchFieldError -> 0x012f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x012f }
                r4 = 18
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x012f }
            L_0x012f:
                com.facetec.sdk.dc$a[] r2 = com.facetec.sdk.C2938dc.C2940a.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f9846b = r2
                com.facetec.sdk.dc$a r3 = com.facetec.sdk.C2938dc.C2940a.RESOURCE     // Catch:{ NoSuchFieldError -> 0x0140 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0140 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0140 }
            L_0x0140:
                int[] r1 = f9846b     // Catch:{ NoSuchFieldError -> 0x014a }
                com.facetec.sdk.dc$a r2 = com.facetec.sdk.C2938dc.C2940a.COLOR     // Catch:{ NoSuchFieldError -> 0x014a }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x014a }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x014a }
            L_0x014a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2938dc.C29392.<clinit>():void");
        }
    }

    /* renamed from: com.facetec.sdk.dc$a */
    enum C2940a {
        COLOR,
        RESOURCE
    }

    static {
        init$0();
        f9844g = 1;
        m12365bt();
        int i = f9843f + 89;
        f9844g = i % 128;
        int i2 = i % 2;
    }

    C2938dc() {
    }

    /* renamed from: A */
    static int m12222A() {
        char c;
        int i = FaceTecSDK.f8630e.f8605h.buttonCornerRadius;
        if (i == -1) {
            c = '\'';
        } else {
            c = '7';
        }
        if (c != '\'') {
            int i2 = f9844g + 123;
            f9843f = i2 % 128;
            int i3 = i2 % 2;
        } else {
            int i4 = f9843f + 73;
            f9844g = i4 % 128;
            if (i4 % 2 == 0) {
                i = 40;
            } else {
                i = 8;
            }
        }
        return Math.round(((float) i) * m12372c());
    }

    /* renamed from: B */
    static int m12223B() {
        boolean z;
        int i = FaceTecSDK.f8630e.f8605h.reviewScreenTextBackgroundCornerRadius;
        if (i == -1) {
            z = true;
        } else {
            z = true;
        }
        if (z) {
            int i2 = f9843f + 21;
            int i3 = i2 % 128;
            f9844g = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 39;
            f9843f = i5 % 128;
            int i6 = i5 % 2;
            i = 6;
        }
        return Math.round(((float) i) * m12372c());
    }

    /* renamed from: C */
    static int m12224C() {
        boolean z;
        int i = f9844g + 47;
        f9843f = i % 128;
        int i2 = i % 2;
        int i3 = FaceTecSDK.f8630e.f8605h.captureScreenTextBackgroundCornerRadius;
        if (i3 == -1) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            i3 = 6;
        }
        int round = Math.round(((float) i3) * m12372c());
        int i4 = f9843f + 11;
        f9844g = i4 % 128;
        int i5 = i4 % 2;
        return round;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r0 != 'M') goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (r2 != false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        r0 = com.facetec.sdk.FaceTecSDK.f8630e.f8606i.buttonCornerRadius;
        r1 = f9843f + 67;
        f9844g = r1 % 128;
        r1 = r1 % 2;
     */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m12225D() {
        /*
            int r0 = f9844g
            r1 = 77
            int r0 = r0 + r1
            int r2 = r0 % 128
            f9843f = r2
            int r0 = r0 % 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0011
            r0 = r3
            goto L_0x0012
        L_0x0011:
            r0 = r2
        L_0x0012:
            r4 = -1
            if (r0 == 0) goto L_0x0024
            com.facetec.sdk.FaceTecCustomization r0 = com.facetec.sdk.FaceTecSDK.f8630e
            com.facetec.sdk.FaceTecGuidanceCustomization r0 = r0.f8606i
            int r0 = r0.buttonCornerRadius
            if (r0 != r4) goto L_0x0020
            r0 = 71
            goto L_0x0021
        L_0x0020:
            r0 = r1
        L_0x0021:
            if (r0 == r1) goto L_0x0036
            goto L_0x0033
        L_0x0024:
            com.facetec.sdk.FaceTecCustomization r0 = com.facetec.sdk.FaceTecSDK.f8630e
            com.facetec.sdk.FaceTecGuidanceCustomization r0 = r0.f8606i
            int r0 = r0.buttonCornerRadius
            r1 = 34
            int r1 = r1 / r3
            if (r0 != r4) goto L_0x0030
            goto L_0x0031
        L_0x0030:
            r2 = r3
        L_0x0031:
            if (r2 == 0) goto L_0x0036
        L_0x0033:
            r0 = 8
            goto L_0x0046
        L_0x0036:
            com.facetec.sdk.FaceTecCustomization r0 = com.facetec.sdk.FaceTecSDK.f8630e
            com.facetec.sdk.FaceTecGuidanceCustomization r0 = r0.f8606i
            int r0 = r0.buttonCornerRadius
            int r1 = f9843f
            int r1 = r1 + 67
            int r2 = r1 % 128
            f9844g = r2
            int r1 = r1 % 2
        L_0x0046:
            float r0 = (float) r0
            float r1 = m12372c()
            float r0 = r0 * r1
            int r0 = java.lang.Math.round(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2938dc.m12225D():int");
    }

    /* renamed from: E */
    static int m12226E() {
        boolean z;
        char c;
        int i = f9844g + 107;
        f9843f = i % 128;
        int i2 = i % 2;
        int i3 = FaceTecSDK.f8630e.f8604g.inputFieldCornerRadius;
        if (i3 == -1) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            int i4 = f9844g;
            int i5 = i4 + 41;
            f9843f = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 23;
            f9843f = i7 % 128;
            int i8 = i7 % 2;
            i3 = 3;
        }
        int round = Math.round(((float) i3) * m12372c());
        int i9 = f9844g + 91;
        f9843f = i9 % 128;
        if (i9 % 2 != 0) {
            c = '<';
        } else {
            c = 'C';
        }
        if (c == 'C') {
            return round;
        }
        throw null;
    }

    /* renamed from: F */
    static int m12227F() {
        boolean z;
        int i = f9843f + 43;
        f9844g = i % 128;
        int i2 = i % 2;
        int i3 = FaceTecSDK.f8630e.f8604g.buttonCornerRadius;
        if (i3 == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i4 = f9843f + 125;
            f9844g = i4 % 128;
            int i5 = i4 % 2;
            i3 = 8;
        }
        return Math.round(((float) i3) * m12372c());
    }

    /* renamed from: G */
    static int m12228G() {
        char c;
        int i = f9843f + 11;
        f9844g = i % 128;
        if (i % 2 != 0) {
            int i2 = FaceTecSDK.f8630e.f8605h.captureFrameCornerRadius;
            if (i2 == -1) {
                c = '<';
            } else {
                c = 10;
            }
            if (c != 10) {
                int i3 = f9843f + 9;
                f9844g = i3 % 128;
                int i4 = i3 % 2;
                i2 = 12;
            }
            int round = Math.round(((float) i2) * m12372c());
            int i5 = f9843f + 15;
            f9844g = i5 % 128;
            int i6 = i5 % 2;
            return round;
        }
        int i7 = FaceTecSDK.f8630e.f8605h.captureFrameCornerRadius;
        throw null;
    }

    /* renamed from: H */
    static Typeface m12229H() {
        boolean z;
        FaceTecGuidanceCustomization faceTecGuidanceCustomization = FaceTecSDK.f8630e.f8606i;
        Typeface typeface = faceTecGuidanceCustomization.readyScreenHeaderFont;
        if (typeface == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return typeface;
        }
        int i = f9844g + 9;
        int i2 = i % 128;
        f9843f = i2;
        int i3 = i % 2;
        Typeface typeface2 = faceTecGuidanceCustomization.headerFont;
        int i4 = i2 + 93;
        f9844g = i4 % 128;
        int i5 = i4 % 2;
        return typeface2;
    }

    /* renamed from: I */
    static Typeface m12230I() {
        boolean z;
        FaceTecGuidanceCustomization faceTecGuidanceCustomization = FaceTecSDK.f8630e.f8606i;
        Typeface typeface = faceTecGuidanceCustomization.readyScreenSubtextFont;
        boolean z2 = true;
        if (typeface == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return typeface;
        }
        int i = f9844g + 61;
        int i2 = i % 128;
        f9843f = i2;
        if (i % 2 != 0) {
            z2 = false;
        }
        if (z2) {
            Typeface typeface2 = faceTecGuidanceCustomization.subtextFont;
            int i3 = i2 + 35;
            f9844g = i3 % 128;
            int i4 = i3 % 2;
            return typeface2;
        }
        Typeface typeface3 = faceTecGuidanceCustomization.subtextFont;
        throw null;
    }

    /* renamed from: J */
    static int m12231J() {
        int i = f9843f + 19;
        f9844g = i % 128;
        int i2 = i % 2;
        int i3 = m12363br().f8603f.foregroundColor;
        int i4 = f9843f + 29;
        f9844g = i4 % 128;
        if ((i4 % 2 == 0 ? (char) 14 : 24) != 14) {
            return i3;
        }
        int i5 = 13 / 0;
        return i3;
    }

    /* renamed from: K */
    static int m12232K() {
        int i = f9843f + 107;
        f9844g = i % 128;
        if (!(i % 2 == 0)) {
            return m12394d(FaceTecSDK.f8630e.f8606i.backgroundColors);
        }
        int i2 = 37 / 0;
        return m12394d(FaceTecSDK.f8630e.f8606i.backgroundColors);
    }

    /* renamed from: L */
    static Typeface m12233L() {
        boolean z;
        FaceTecGuidanceCustomization faceTecGuidanceCustomization = FaceTecSDK.f8630e.f8606i;
        Typeface typeface = faceTecGuidanceCustomization.retryScreenHeaderFont;
        if (typeface == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i = f9843f + 37;
            f9844g = i % 128;
            int i2 = i % 2;
            typeface = faceTecGuidanceCustomization.headerFont;
        }
        int i3 = f9844g + 83;
        f9843f = i3 % 128;
        int i4 = i3 % 2;
        return typeface;
    }

    /* renamed from: M */
    static int m12234M() {
        int i = f9843f + 83;
        f9844g = i % 128;
        int i2 = i % 2;
        int i3 = m12363br().f8605h.additionalReviewScreenForegroundColor;
        int i4 = f9844g + 109;
        f9843f = i4 % 128;
        int i5 = i4 % 2;
        return i3;
    }

    /* renamed from: N */
    static Typeface m12235N() {
        char c;
        FaceTecGuidanceCustomization faceTecGuidanceCustomization = FaceTecSDK.f8630e.f8606i;
        Typeface typeface = faceTecGuidanceCustomization.retryScreenSubtextFont;
        if (typeface == null) {
            c = '7';
        } else {
            c = '`';
        }
        if (c != '7') {
            return typeface;
        }
        int i = f9843f;
        int i2 = i + 39;
        f9844g = i2 % 128;
        int i3 = i2 % 2;
        Typeface typeface2 = faceTecGuidanceCustomization.subtextFont;
        int i4 = i + 15;
        f9844g = i4 % 128;
        int i5 = i4 % 2;
        return typeface2;
    }

    /* renamed from: O */
    static int m12236O() {
        int i = f9844g + 119;
        f9843f = i % 128;
        int i2 = i % 2;
        int i3 = m12363br().f8606i.readyScreenTextBackgroundColor;
        int i4 = f9844g + 99;
        f9843f = i4 % 128;
        int i5 = i4 % 2;
        return i3;
    }

    /* renamed from: P */
    static int m12237P() {
        int i = f9843f + 67;
        f9844g = i % 128;
        if ((i % 2 == 0 ? 30 : 'O') != 30) {
            int i2 = m12363br().f8603f.activityIndicatorColor;
            int i3 = f9844g + 115;
            f9843f = i3 % 128;
            int i4 = i3 % 2;
            return i2;
        }
        int i5 = m12363br().f8603f.activityIndicatorColor;
        throw null;
    }

    /* renamed from: Q */
    static int m12238Q() {
        int i = f9843f + 11;
        f9844g = i % 128;
        if (i % 2 != 0) {
            return m12394d(FaceTecSDK.f8630e.f8607j.backgroundColor);
        }
        m12394d(FaceTecSDK.f8630e.f8607j.backgroundColor);
        throw null;
    }

    /* renamed from: R */
    static int m12239R() {
        int i = f9844g + 81;
        f9843f = i % 128;
        int i2 = i % 2;
        int i3 = m12363br().f8606i.buttonTextHighlightColor;
        int i4 = f9843f + 87;
        f9844g = i4 % 128;
        if ((i4 % 2 == 0 ? 'A' : 23) != 23) {
            int i5 = 95 / 0;
        }
        return i3;
    }

    /* renamed from: S */
    static int m12240S() {
        int i = f9843f + 113;
        f9844g = i % 128;
        int i2 = i % 2;
        int i3 = m12363br().f8606i.buttonTextNormalColor;
        int i4 = f9843f + 49;
        f9844g = i4 % 128;
        int i5 = i4 % 2;
        return i3;
    }

    /* renamed from: T */
    static int m12241T() {
        int i = f9843f + 105;
        f9844g = i % 128;
        if ((i % 2 == 0 ? 'C' : '\"') == '\"') {
            return m12363br().f8606i.buttonBackgroundDisabledColor;
        }
        int i2 = 39 / 0;
        return m12363br().f8606i.buttonBackgroundDisabledColor;
    }

    /* renamed from: U */
    static int m12242U() {
        int i = f9843f + 95;
        f9844g = i % 128;
        int i2 = i % 2;
        int i3 = m12363br().f8606i.buttonTextDisabledColor;
        int i4 = f9843f + 47;
        f9844g = i4 % 128;
        int i5 = i4 % 2;
        return i3;
    }

    /* renamed from: V */
    static int m12243V() {
        int i = f9844g + 3;
        f9843f = i % 128;
        int i2 = i % 2;
        int i3 = m12363br().f8606i.buttonBackgroundNormalColor;
        int i4 = f9844g + 27;
        f9843f = i4 % 128;
        int i5 = i4 % 2;
        return i3;
    }

    /* renamed from: W */
    static int m12244W() {
        int i = f9843f + 105;
        f9844g = i % 128;
        int i2 = i % 2;
        int i3 = m12363br().f8606i.buttonBorderColor;
        int i4 = f9843f + 115;
        f9844g = i4 % 128;
        int i5 = i4 % 2;
        return i3;
    }

    /* renamed from: X */
    static int m12245X() {
        int i = f9843f + 47;
        f9844g = i % 128;
        if ((i % 2 == 0 ? 10 : 'Q') == 'Q') {
            return m12363br().f8606i.buttonBackgroundHighlightColor;
        }
        int i2 = m12363br().f8606i.buttonBackgroundHighlightColor;
        throw null;
    }

    /* renamed from: Y */
    static int m12246Y() {
        int i = f9843f + 113;
        f9844g = i % 128;
        int i2 = i % 2;
        int i3 = m12363br().f8605h.buttonTextDisabledColor;
        int i4 = f9844g + 109;
        f9843f = i4 % 128;
        int i5 = i4 % 2;
        return i3;
    }

    /* renamed from: Z */
    static int m12247Z() {
        int i = f9844g + 45;
        f9843f = i % 128;
        int i2 = i % 2;
        int i3 = m12363br().f8605h.buttonBackgroundNormalColor;
        int i4 = f9844g + 51;
        f9843f = i4 % 128;
        if (!(i4 % 2 != 0)) {
            return i3;
        }
        throw null;
    }

    /* renamed from: a */
    static void m12251a() {
        int i = f9844g + 103;
        f9843f = i % 128;
        int i2 = i % 2;
        FaceTecCustomization faceTecCustomization = FaceTecSDK.f8630e;
        FaceTecOvalCustomization faceTecOvalCustomization = faceTecCustomization.f8610m;
        if (faceTecOvalCustomization.progressRadialOffset == -1 ? true : true) {
            faceTecOvalCustomization.progressRadialOffset = m12367bv();
            int i3 = f9844g + 5;
            f9843f = i3 % 128;
            int i4 = i3 % 2;
        }
        FaceTecSDK.f8630e = faceTecCustomization;
    }

    /* renamed from: aA */
    static int m12259aA() {
        int i = f9844g + 113;
        f9843f = i % 128;
        if (i % 2 == 0) {
            int i2 = m12363br().f8605h.reviewScreenTextBackgroundColor;
            int i3 = f9844g + 53;
            f9843f = i3 % 128;
            if ((i3 % 2 != 0 ? '!' : 9) == 9) {
                return i2;
            }
            throw null;
        }
        int i4 = m12363br().f8605h.reviewScreenTextBackgroundColor;
        throw null;
    }

    /* renamed from: aB */
    static int m12260aB() {
        int i = f9844g + 51;
        f9843f = i % 128;
        int i2 = i % 2;
        int i3 = m12363br().f8605h.captureScreenTextBackgroundColor;
        int i4 = f9843f + 23;
        f9844g = i4 % 128;
        int i5 = i4 % 2;
        return i3;
    }

    /* renamed from: aC */
    static int m12261aC() {
        char c;
        int i = f9843f + 123;
        f9844g = i % 128;
        if (i % 2 == 0) {
            int i2 = m12363br().f8607j.brandingImage;
            boolean z = false;
            int i3 = 12 / 0;
            if (i2 != 0) {
                z = true;
            }
            if (z) {
                return i2;
            }
        } else {
            int i4 = m12363br().f8607j.brandingImage;
            if (i4 == 0) {
                c = 11;
            } else {
                c = 26;
            }
            if (c != 11) {
                return i4;
            }
        }
        int i5 = FaceTecSDK.f8630e.f8607j.brandingImage;
        int i6 = f9844g + 63;
        f9843f = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    /* renamed from: aD */
    static int m12262aD() {
        char c;
        char c2;
        char c3;
        int i = f9843f + 3;
        f9844g = i % 128;
        if (i % 2 == 0) {
            c = 7;
        } else {
            c = 'G';
        }
        if (c != 7) {
            int i2 = m12363br().f8605h.selectionScreenBrandingImage;
            if (i2 == 0) {
                c3 = '0';
            } else {
                c3 = 5;
            }
            if (c3 == 5) {
                return i2;
            }
        } else {
            int i3 = m12363br().f8605h.selectionScreenBrandingImage;
            boolean z = false;
            int i4 = 81 / 0;
            if (i3 == 0) {
                z = true;
            }
            if (!z) {
                return i3;
            }
        }
        int i5 = f9843f + 61;
        f9844g = i5 % 128;
        if (i5 % 2 == 0) {
            c2 = 6;
        } else {
            c2 = 'E';
        }
        if (c2 != 6) {
            return FaceTecSDK.f8630e.f8605h.selectionScreenBrandingImage;
        }
        int i6 = FaceTecSDK.f8630e.f8605h.selectionScreenBrandingImage;
        throw null;
    }

    /* renamed from: aE */
    static int m12263aE() {
        char c;
        int i = f9844g + 13;
        f9843f = i % 128;
        int i2 = i % 2;
        int i3 = m12363br().f8605h.selectionScreenDocumentImage;
        if (i3 == 0) {
            c = 29;
        } else {
            c = '(';
        }
        if (c != 29) {
            return i3;
        }
        int i4 = FaceTecSDK.f8630e.f8605h.selectionScreenDocumentImage;
        int i5 = f9844g + 115;
        f9843f = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        if (r2 != '0') goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        if (r2 != 'O') goto L_0x003b;
     */
    /* renamed from: aF */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m12264aF() {
        /*
            int r0 = f9843f
            int r0 = r0 + 31
            int r1 = r0 % 128
            f9844g = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x0023
            com.facetec.sdk.FaceTecCustomization r0 = m12363br()
            com.facetec.sdk.FaceTecIDScanCustomization r0 = r0.f8605h
            int r0 = r0.activeTorchButtonImage
            r1 = 35
            int r1 = r1 / 0
            r1 = 79
            if (r0 != 0) goto L_0x001e
            r2 = r1
            goto L_0x0020
        L_0x001e:
            r2 = 34
        L_0x0020:
            if (r2 == r1) goto L_0x0035
            goto L_0x003b
        L_0x0023:
            com.facetec.sdk.FaceTecCustomization r0 = m12363br()
            com.facetec.sdk.FaceTecIDScanCustomization r0 = r0.f8605h
            int r0 = r0.activeTorchButtonImage
            r1 = 48
            if (r0 != 0) goto L_0x0032
            r2 = 17
            goto L_0x0033
        L_0x0032:
            r2 = r1
        L_0x0033:
            if (r2 == r1) goto L_0x003b
        L_0x0035:
            com.facetec.sdk.FaceTecCustomization r0 = com.facetec.sdk.FaceTecSDK.f8630e
            com.facetec.sdk.FaceTecIDScanCustomization r0 = r0.f8605h
            int r0 = r0.activeTorchButtonImage
        L_0x003b:
            int r1 = f9844g
            int r1 = r1 + 69
            int r2 = r1 % 128
            f9843f = r2
            int r1 = r1 % 2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2938dc.m12264aF():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        if (r2 != true) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        if (r0 == 0) goto L_0x0032;
     */
    /* renamed from: aG */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m12265aG() {
        /*
            int r0 = f9843f
            int r0 = r0 + 73
            int r1 = r0 % 128
            f9844g = r1
            int r0 = r0 % 2
            r1 = 76
            if (r0 != 0) goto L_0x0010
            r0 = r1
            goto L_0x0012
        L_0x0010:
            r0 = 55
        L_0x0012:
            if (r0 == r1) goto L_0x001f
            com.facetec.sdk.FaceTecCustomization r0 = m12363br()
            com.facetec.sdk.FaceTecIDScanCustomization r0 = r0.f8605h
            int r0 = r0.inactiveTorchButtonImage
            if (r0 != 0) goto L_0x0038
            goto L_0x0032
        L_0x001f:
            com.facetec.sdk.FaceTecCustomization r0 = m12363br()
            com.facetec.sdk.FaceTecIDScanCustomization r0 = r0.f8605h
            int r0 = r0.inactiveTorchButtonImage
            r1 = 55
            r2 = 0
            int r1 = r1 / r2
            r1 = 1
            if (r0 != 0) goto L_0x002f
            r2 = r1
        L_0x002f:
            if (r2 == r1) goto L_0x0032
            goto L_0x0038
        L_0x0032:
            com.facetec.sdk.FaceTecCustomization r0 = com.facetec.sdk.FaceTecSDK.f8630e
            com.facetec.sdk.FaceTecIDScanCustomization r0 = r0.f8605h
            int r0 = r0.inactiveTorchButtonImage
        L_0x0038:
            int r1 = f9844g
            int r1 = r1 + 25
            int r2 = r1 % 128
            f9843f = r2
            int r1 = r1 % 2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2938dc.m12265aG():int");
    }

    /* renamed from: aH */
    static int m12266aH() {
        char c;
        int i = f9843f + 55;
        f9844g = i % 128;
        int i2 = i % 2;
        int i3 = m12363br().f8612o.customImage;
        if (i3 == 0) {
            c = '5';
        } else {
            c = ';';
        }
        if (c == '5') {
            i3 = FaceTecSDK.f8630e.f8612o.customImage;
        }
        int i4 = f9843f + 41;
        f9844g = i4 % 128;
        int i5 = i4 % 2;
        return i3;
    }

    /* renamed from: aI */
    static int m12267aI() {
        char c;
        boolean z;
        int i = m12363br().f8604g.customStaticScrollIndicatorAnimation;
        if (i == 0) {
            c = 'c';
        } else {
            c = '6';
        }
        if (c == 'c') {
            int i2 = f9843f + 1;
            f9844g = i2 % 128;
            if (i2 % 2 == 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                i = FaceTecSDK.f8630e.f8604g.customStaticScrollIndicatorAnimation;
            } else {
                int i3 = FaceTecSDK.f8630e.f8604g.customStaticScrollIndicatorAnimation;
                throw null;
            }
        }
        int i4 = f9844g + 87;
        f9843f = i4 % 128;
        int i5 = i4 % 2;
        return i;
    }

    /* renamed from: aJ */
    static int m12268aJ() {
        boolean z;
        int i = m12363br().f8604g.customScrollIndicatorAnimation;
        boolean z2 = false;
        if (i == 0) {
            int i2 = f9843f + 27;
            f9844g = i2 % 128;
            if (i2 % 2 == 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                i = FaceTecSDK.f8630e.f8604g.customScrollIndicatorAnimation;
            } else {
                int i3 = FaceTecSDK.f8630e.f8604g.customScrollIndicatorAnimation;
                throw null;
            }
        }
        int i4 = f9844g + 67;
        f9843f = i4 % 128;
        if (i4 % 2 == 0) {
            z2 = true;
        }
        if (z2) {
            return i;
        }
        throw null;
    }

    /* renamed from: aK */
    static int m12269aK() {
        int i = f9844g + 51;
        f9843f = i % 128;
        char c = 2;
        if (i % 2 == 0) {
            c = '&';
        }
        int i2 = m12363br().f8609l.customAnimationImage;
        if (c == '&') {
            return m12406e(i2, FaceTecSDK.f8630e.f8609l.customAnimationImage);
        }
        m12406e(i2, FaceTecSDK.f8630e.f8609l.customAnimationImage);
        throw null;
    }

    /* renamed from: aL */
    static int m12270aL() {
        int i = f9843f + 17;
        f9844g = i % 128;
        int i2 = i % 2;
        int e = m12406e(m12363br().f8609l.customAnimation, FaceTecSDK.f8630e.f8609l.customAnimation);
        int i3 = f9844g + 23;
        f9843f = i3 % 128;
        int i4 = i3 % 2;
        return e;
    }

    /* renamed from: aM */
    static int m12271aM() {
        char c;
        boolean z;
        int i = m12363br().f8603f.resultAnimationSuccessBackgroundImage;
        if (i == 0) {
            c = ':';
        } else {
            c = 12;
        }
        if (c == ':') {
            int i2 = f9843f + 33;
            f9844g = i2 % 128;
            if (i2 % 2 == 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                i = FaceTecSDK.f8630e.f8603f.resultAnimationSuccessBackgroundImage;
            } else {
                int i3 = FaceTecSDK.f8630e.f8603f.resultAnimationSuccessBackgroundImage;
                throw null;
            }
        }
        int i4 = f9843f + 39;
        f9844g = i4 % 128;
        int i5 = i4 % 2;
        return i;
    }

    /* renamed from: aN */
    static int m12272aN() {
        boolean z;
        char c;
        int i = f9843f + 63;
        f9844g = i % 128;
        if (i % 2 == 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            int i2 = m12363br().f8603f.resultAnimationUnsuccessBackgroundImage;
            if (i2 == 0) {
                c = 'T';
            } else {
                c = '7';
            }
            if (c == 'T') {
                i2 = FaceTecSDK.f8630e.f8603f.resultAnimationUnsuccessBackgroundImage;
            }
            int i3 = f9844g + 83;
            f9843f = i3 % 128;
            if (i3 % 2 == 0) {
                return i2;
            }
            throw null;
        }
        int i4 = m12363br().f8603f.resultAnimationUnsuccessBackgroundImage;
        throw null;
    }

    /* renamed from: aO */
    static int m12273aO() {
        char c;
        boolean z;
        int i = m12363br().f8606i.retryScreenIdealImage;
        if (i == 0) {
            c = '#';
        } else {
            c = '7';
        }
        if (c == '#') {
            int i2 = f9843f + 45;
            f9844g = i2 % 128;
            int i3 = i2 % 2;
            i = FaceTecSDK.f8630e.f8606i.retryScreenIdealImage;
        }
        if (i == 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return i;
        }
        int i4 = f9844g + 3;
        f9843f = i4 % 128;
        int i5 = i4 % 2;
        return C2747R.C2748drawable.facetec_ideal_pose_image;
    }

    /* renamed from: aP */
    static int[] m12274aP() {
        char c;
        boolean z;
        int[] iArr = m12363br().f8606i.retryScreenSlideshowImages;
        if (iArr.length == 0) {
            c = '8';
        } else {
            c = 'V';
        }
        if (c != 'V') {
            int i = f9844g + 69;
            f9843f = i % 128;
            if (i % 2 != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                iArr = FaceTecSDK.f8630e.f8606i.retryScreenSlideshowImages;
            } else {
                int[] iArr2 = FaceTecSDK.f8630e.f8606i.retryScreenSlideshowImages;
                throw null;
            }
        }
        int i2 = f9843f + 113;
        f9844g = i2 % 128;
        int i3 = i2 % 2;
        return iArr;
    }

    /* renamed from: aQ */
    static int m12275aQ() {
        boolean z;
        int i = f9844g + 35;
        f9843f = i % 128;
        int i2 = i % 2;
        int i3 = m12363br().f8603f.customActivityIndicatorImage;
        boolean z2 = false;
        if (i3 == 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            int i4 = f9843f + 123;
            f9844g = i4 % 128;
            if (i4 % 2 != 0) {
                z2 = true;
            }
            i3 = FaceTecSDK.f8630e.f8603f.customActivityIndicatorImage;
            if (z2) {
                int i5 = f9843f + 107;
                f9844g = i5 % 128;
                int i6 = i5 % 2;
            } else {
                throw null;
            }
        }
        return i3;
    }

    /* renamed from: aR */
    static int m12276aR() {
        int i = f9844g + 43;
        f9843f = i % 128;
        int i2 = i % 2;
        int i3 = m12363br().f8605h.additionalReviewScreenAnimation;
        int i4 = f9844g + 121;
        f9843f = i4 % 128;
        int i5 = i4 % 2;
        return i3;
    }

    /* renamed from: aS */
    static int m12277aS() {
        int i = f9844g + 43;
        f9843f = i % 128;
        if (i % 2 != 0) {
            return 9905;
        }
        return C11051p3.f31759c;
    }

    /* renamed from: aT */
    static int m12278aT() {
        int i = f9844g + 73;
        f9843f = i % 128;
        int i2 = i % 2;
        int i3 = m12363br().f8605h.additionalReviewScreenStaticAnimation;
        int i4 = f9844g + 85;
        f9843f = i4 % 128;
        if ((i4 % 2 != 0 ? ',' : '+') == '+') {
            return i3;
        }
        throw null;
    }

    /* renamed from: aU */
    static int m12279aU() {
        boolean z;
        boolean z2;
        int i = f9844g + 77;
        f9843f = i % 128;
        int i2 = i % 2;
        int i3 = FaceTecSDK.f8630e.f8606i.cameraPermissionsScreenImage;
        if (i3 == 0) {
            z = true;
        } else {
            z = true;
        }
        if (!z) {
            return i3;
        }
        int i4 = f9843f + 21;
        f9844g = i4 % 128;
        if (i4 % 2 == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return C2747R.C2748drawable.facetec_camera;
        }
        throw null;
    }

    /* renamed from: aV */
    static int m12280aV() {
        char c;
        boolean z;
        int i = f9843f + 3;
        f9844g = i % 128;
        if (i % 2 == 0) {
            c = 'X';
        } else {
            c = 'c';
        }
        if (c == 'c') {
            int i2 = m12363br().f8605h.additionalReviewScreenImage;
            if (i2 == 0) {
                i2 = C2747R.C2748drawable.facetec_review;
            }
            int i3 = f9844g + 81;
            f9843f = i3 % 128;
            if (i3 % 2 != 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return i2;
            }
            throw null;
        }
        int i4 = m12363br().f8605h.additionalReviewScreenImage;
        throw null;
    }

    /* renamed from: aW */
    static int m12281aW() {
        int i = f9843f + 3;
        f9844g = i % 128;
        if ((i % 2 == 0 ? 'L' : 'N') != 'L') {
            return m12363br().f8605h.customNFCSkipOrErrorAnimation;
        }
        int i2 = m12363br().f8605h.customNFCSkipOrErrorAnimation;
        throw null;
    }

    /* renamed from: aX */
    static int m12282aX() {
        int i = f9843f + 21;
        f9844g = i % 128;
        int i2 = i % 2;
        int i3 = m12363br().f8605h.customNFCCardScanningAnimation;
        int i4 = f9843f + 117;
        f9844g = i4 % 128;
        int i5 = i4 % 2;
        return i3;
    }

    /* renamed from: aY */
    static int m12283aY() {
        int i = f9844g + 69;
        f9843f = i % 128;
        int i2 = i % 2;
        int i3 = m12363br().f8605h.customNFCStartingAnimation;
        int i4 = f9844g + 107;
        f9843f = i4 % 128;
        int i5 = i4 % 2;
        return i3;
    }

    /* renamed from: aZ */
    static int m12284aZ() {
        int i = f9844g + 3;
        f9843f = i % 128;
        if (i % 2 == 0) {
            return m12363br().f8605h.customNFCScanningAnimation;
        }
        int i2 = 32 / 0;
        return m12363br().f8605h.customNFCScanningAnimation;
    }

    /* renamed from: aa */
    static int m12285aa() {
        int i = f9843f + 17;
        f9844g = i % 128;
        int i2 = i % 2;
        int i3 = m12363br().f8605h.buttonTextHighlightColor;
        int i4 = f9844g + 95;
        f9843f = i4 % 128;
        if (!(i4 % 2 != 0)) {
            return i3;
        }
        int i5 = 77 / 0;
        return i3;
    }

    /* renamed from: ab */
    static int m12286ab() {
        int i = f9844g + 57;
        f9843f = i % 128;
        int i2 = i % 2;
        int i3 = m12363br().f8605h.buttonTextNormalColor;
        int i4 = f9843f + 27;
        f9844g = i4 % 128;
        if (!(i4 % 2 != 0)) {
            int i5 = 98 / 0;
        }
        return i3;
    }

    /* renamed from: ac */
    static int m12287ac() {
        int i = f9844g + 111;
        f9843f = i % 128;
        int i2 = i % 2;
        int i3 = m12363br().f8605h.buttonBackgroundHighlightColor;
        int i4 = f9844g + 35;
        f9843f = i4 % 128;
        int i5 = i4 % 2;
        return i3;
    }

    /* renamed from: ad */
    static int m12288ad() {
        int i = f9843f + 17;
        f9844g = i % 128;
        if ((i % 2 == 0 ? (char) 4 : 30) == 30) {
            return m12363br().f8604g.buttonTextNormalColor;
        }
        int i2 = m12363br().f8604g.buttonTextNormalColor;
        throw null;
    }

    /* renamed from: ae */
    static int m12289ae() {
        int i = f9843f + 109;
        f9844g = i % 128;
        int i2 = i % 2;
        int i3 = m12363br().f8605h.buttonBorderColor;
        int i4 = f9844g + 51;
        f9843f = i4 % 128;
        int i5 = i4 % 2;
        return i3;
    }

    /* renamed from: af */
    static int m12290af() {
        int i;
        int i2 = f9843f + 31;
        f9844g = i2 % 128;
        if ((i2 % 2 == 0 ? ':' : '4') != '4') {
            i = m12363br().f8604g.buttonTextDisabledColor;
            int i3 = 36 / 0;
        } else {
            i = m12363br().f8604g.buttonTextDisabledColor;
        }
        int i4 = f9843f + 27;
        f9844g = i4 % 128;
        int i5 = i4 % 2;
        return i;
    }

    /* renamed from: ag */
    static int m12291ag() {
        int i = f9844g + 101;
        f9843f = i % 128;
        if ((i % 2 != 0 ? 25 : '4') == '4') {
            return m12363br().f8605h.buttonBackgroundDisabledColor;
        }
        int i2 = 28 / 0;
        return m12363br().f8605h.buttonBackgroundDisabledColor;
    }

    /* renamed from: ah */
    static int m12292ah() {
        int i = f9844g + 91;
        f9843f = i % 128;
        int i2 = i % 2;
        int i3 = m12363br().f8604g.buttonTextHighlightColor;
        int i4 = f9843f + 5;
        f9844g = i4 % 128;
        int i5 = i4 % 2;
        return i3;
    }

    /* renamed from: ai */
    static int m12293ai() {
        int i = f9844g + 105;
        f9843f = i % 128;
        if ((i % 2 != 0 ? 'K' : ';') == ';') {
            int i2 = m12363br().f8604g.buttonBackgroundHighlightColor;
            int i3 = f9844g + 39;
            f9843f = i3 % 128;
            int i4 = i3 % 2;
            return i2;
        }
        int i5 = m12363br().f8604g.buttonBackgroundHighlightColor;
        throw null;
    }

    /* renamed from: aj */
    static int m12294aj() {
        int i = f9843f + 29;
        f9844g = i % 128;
        int i2 = i % 2;
        int i3 = m12363br().f8604g.buttonBackgroundDisabledColor;
        int i4 = f9843f + 37;
        f9844g = i4 % 128;
        int i5 = i4 % 2;
        return i3;
    }

    /* renamed from: ak */
    static int m12295ak() {
        int i = f9844g + 65;
        f9843f = i % 128;
        int i2 = i % 2;
        int i3 = m12363br().f8604g.buttonBorderColor;
        int i4 = f9843f + 1;
        f9844g = i4 % 128;
        if ((i4 % 2 == 0 ? 'G' : ')') != ')') {
            int i5 = 10 / 0;
        }
        return i3;
    }

    /* renamed from: al */
    static int m12296al() {
        int i = f9843f + 79;
        f9844g = i % 128;
        int i2 = i % 2;
        int i3 = m12363br().f8604g.buttonBackgroundNormalColor;
        int i4 = f9844g + 61;
        f9843f = i4 % 128;
        if (!(i4 % 2 != 0)) {
            return i3;
        }
        throw null;
    }

    /* renamed from: am */
    static int m12297am() {
        int i;
        int i2 = f9844g + 13;
        f9843f = i2 % 128;
        if ((i2 % 2 != 0 ? '*' : 'J') != 'J') {
            i = m12363br().f8604g.mainHeaderDividerLineColor;
            int i3 = 96 / 0;
        } else {
            i = m12363br().f8604g.mainHeaderDividerLineColor;
        }
        int i4 = f9843f + 35;
        f9844g = i4 % 128;
        int i5 = i4 % 2;
        return i;
    }

    /* renamed from: an */
    static int m12298an() {
        int i = f9844g + 83;
        f9843f = i % 128;
        int i2 = i % 2;
        int i3 = m12363br().f8604g.fieldLabelTextColor;
        int i4 = f9843f + 11;
        f9844g = i4 % 128;
        if (!(i4 % 2 == 0)) {
            return i3;
        }
        throw null;
    }

    /* renamed from: ao */
    static int m12299ao() {
        boolean z;
        int i = f9843f + 27;
        f9844g = i % 128;
        int i2 = i % 2;
        int i3 = m12363br().f8604g.inputFieldTextColor;
        if (i3 == 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            i3 = m12341bV();
        }
        int i4 = f9843f + 67;
        f9844g = i4 % 128;
        int i5 = i4 % 2;
        return i3;
    }

    /* renamed from: ap */
    static int m12300ap() {
        int i = f9843f + 19;
        f9844g = i % 128;
        int i2 = i % 2;
        int i3 = m12363br().f8604g.inputFieldBackgroundColor;
        int i4 = f9843f + 93;
        f9844g = i4 % 128;
        if (!(i4 % 2 == 0)) {
            return i3;
        }
        throw null;
    }

    /* renamed from: aq */
    static int m12301aq() {
        int i;
        int i2 = f9844g + 41;
        f9843f = i2 % 128;
        if (i2 % 2 == 0) {
            i = m12363br().f8604g.sectionHeaderTextColor;
        } else {
            i = m12363br().f8604g.sectionHeaderTextColor;
            int i3 = 78 / 0;
        }
        int i4 = f9843f + 103;
        f9844g = i4 % 128;
        int i5 = i4 % 2;
        return i;
    }

    /* renamed from: ar */
    static int m12302ar() {
        int i = f9844g + 11;
        f9843f = i % 128;
        if (!(i % 2 != 0)) {
            return m12363br().f8604g.mainHeaderTextColor;
        }
        int i2 = 54 / 0;
        return m12363br().f8604g.mainHeaderTextColor;
    }

    /* renamed from: as */
    static int m12303as() {
        int i = f9843f + 105;
        f9844g = i % 128;
        int i2 = i % 2;
        int i3 = m12363br().f8604g.inputFieldBorderColor;
        int i4 = f9844g + 51;
        f9843f = i4 % 128;
        if ((i4 % 2 != 0 ? 'P' : '%') == '%') {
            return i3;
        }
        throw null;
    }

    /* renamed from: at */
    static int m12304at() {
        int i = f9844g + 59;
        f9843f = i % 128;
        int i2 = i % 2;
        int i3 = m12363br().f8604g.scrollIndicatorBackgroundNormalColor;
        int i4 = f9844g + 101;
        f9843f = i4 % 128;
        if (i4 % 2 == 0) {
            return i3;
        }
        throw null;
    }

    /* renamed from: au */
    static int m12305au() {
        int i = f9843f + 27;
        f9844g = i % 128;
        if ((i % 2 == 0 ? 16 : 'Y') != 16) {
            return m12363br().f8604g.scrollIndicatorBorderColor;
        }
        int i2 = 62 / 0;
        return m12363br().f8604g.scrollIndicatorBorderColor;
    }

    /* renamed from: av */
    static int m12306av() {
        int i = f9843f + 91;
        f9844g = i % 128;
        if (i % 2 != 0) {
            return m12363br().f8604g.scrollIndicatorBackgroundHighlightColor;
        }
        int i2 = m12363br().f8604g.scrollIndicatorBackgroundHighlightColor;
        throw null;
    }

    /* renamed from: aw */
    static int m12307aw() {
        int i = f9843f + 41;
        f9844g = i % 128;
        int i2 = i % 2;
        int i3 = m12363br().f8604g.scrollIndicatorForegroundNormalColor;
        int i4 = f9844g + 59;
        f9843f = i4 % 128;
        if (!(i4 % 2 != 0)) {
            return i3;
        }
        throw null;
    }

    /* renamed from: ax */
    static int m12308ax() {
        int i = f9844g + 49;
        f9843f = i % 128;
        if ((i % 2 != 0 ? 'Q' : '*') != 'Q') {
            return m12363br().f8605h.captureScreenTextBackgroundBorderColor;
        }
        int i2 = m12363br().f8605h.captureScreenTextBackgroundBorderColor;
        throw null;
    }

    /* renamed from: ay */
    static int m12309ay() {
        int i = f9844g + 119;
        f9843f = i % 128;
        if (i % 2 == 0) {
            return m12363br().f8604g.scrollIndicatorForegroundHighlightColor;
        }
        int i2 = m12363br().f8604g.scrollIndicatorForegroundHighlightColor;
        throw null;
    }

    /* renamed from: az */
    static int m12310az() {
        int i = f9843f + 33;
        f9844g = i % 128;
        if (i % 2 != 0) {
            return m12363br().f8605h.reviewScreenTextBackgroundBorderColor;
        }
        int i2 = m12363br().f8605h.reviewScreenTextBackgroundBorderColor;
        throw null;
    }

    /* renamed from: b */
    static synchronized float m12311b() {
        float floatValue;
        synchronized (C2938dc.class) {
            int i = f9843f + 51;
            f9844g = i % 128;
            if ((i % 2 == 0 ? 25 : 'b') == 'b') {
                floatValue = f9839b.mo9264d(new C3581si()).floatValue();
            } else {
                f9839b.mo9264d(new C3581si()).floatValue();
                throw null;
            }
        }
        return floatValue;
    }

    /* renamed from: bA */
    private static int m12320bA() {
        int i = f9843f + 77;
        f9844g = i % 128;
        int i2 = i % 2;
        int i3 = m12363br().f8606i.foregroundColor;
        int i4 = f9844g + 45;
        f9843f = i4 % 128;
        if (!(i4 % 2 != 0)) {
            return i3;
        }
        throw null;
    }

    /* renamed from: bB */
    private static int m12321bB() {
        int i = f9844g + 81;
        f9843f = i % 128;
        int i2 = i % 2;
        int i3 = m12363br().f8606i.readyScreenHeaderTextColor;
        int i4 = f9843f + 33;
        f9844g = i4 % 128;
        if (!(i4 % 2 == 0)) {
            return i3;
        }
        int i5 = 70 / 0;
        return i3;
    }

    /* renamed from: bC */
    private static int m12322bC() {
        int i = f9844g + 19;
        f9843f = i % 128;
        boolean z = true;
        if (!(i % 2 != 0)) {
            int i2 = m12363br().f8606i.retryScreenSubtextTextColor;
            int i3 = f9844g + 37;
            f9843f = i3 % 128;
            if (i3 % 2 != 0) {
                z = true;
            }
            if (!z) {
                return i2;
            }
            throw null;
        }
        int i4 = m12363br().f8606i.retryScreenSubtextTextColor;
        throw null;
    }

    /* renamed from: bD */
    private static int m12323bD() {
        int i = f9843f + 37;
        f9844g = i % 128;
        int i2 = i % 2;
        int i3 = m12363br().f8606i.retryScreenHeaderTextColor;
        int i4 = f9843f + 35;
        f9844g = i4 % 128;
        if (i4 % 2 != 0) {
            return i3;
        }
        throw null;
    }

    /* renamed from: bE */
    private static int m12324bE() {
        int i = f9844g + 123;
        f9843f = i % 128;
        if ((i % 2 != 0 ? 23 : 'Z') != 23) {
            return m12363br().f8606i.readyScreenSubtextTextColor;
        }
        int i2 = m12363br().f8606i.readyScreenSubtextTextColor;
        throw null;
    }

    /* renamed from: bF */
    private static int m12325bF() {
        int i = f9844g + 95;
        f9843f = i % 128;
        int i2 = i % 2;
        int i3 = m12363br().f8610m.strokeColor;
        int i4 = f9843f + 51;
        f9844g = i4 % 128;
        int i5 = i4 % 2;
        return i3;
    }

    /* renamed from: bG */
    private static int m12326bG() {
        int i = f9843f + 43;
        f9844g = i % 128;
        if ((i % 2 == 0 ? 'I' : 7) == 7) {
            return m12363br().f8611n.borderColor;
        }
        int i2 = m12363br().f8611n.borderColor;
        throw null;
    }

    /* renamed from: bH */
    private static int m12327bH() {
        int i = f9844g + 97;
        f9843f = i % 128;
        if (i % 2 == 0) {
            int d = m12394d(FaceTecSDK.f8630e.f8611n.backgroundColor);
            int i2 = f9843f + 59;
            f9844g = i2 % 128;
            int i3 = i2 % 2;
            return d;
        }
        m12394d(FaceTecSDK.f8630e.f8611n.backgroundColor);
        throw null;
    }

    /* renamed from: bI */
    private static int m12328bI() {
        int i = f9843f + 3;
        f9844g = i % 128;
        int i2 = i % 2;
        int i3 = m12363br().f8609l.defaultAnimationBackgroundColor;
        int i4 = f9843f + 1;
        f9844g = i4 % 128;
        int i5 = i4 % 2;
        return i3;
    }

    /* renamed from: bJ */
    private static int m12329bJ() {
        int i = f9844g + 79;
        f9843f = i % 128;
        if (i % 2 == 0) {
            int i2 = m12363br().f8606i.readyScreenOvalFillColor;
            int i3 = f9843f + 11;
            f9844g = i3 % 128;
            int i4 = i3 % 2;
            return i2;
        }
        int i5 = m12363br().f8606i.readyScreenOvalFillColor;
        throw null;
    }

    /* renamed from: bK */
    private static int m12330bK() {
        int i = f9844g + 87;
        f9843f = i % 128;
        int i2 = i % 2;
        int i3 = m12363br().f8603f.uploadProgressFillColor;
        int i4 = f9844g + 55;
        f9843f = i4 % 128;
        if (!(i4 % 2 != 0)) {
            return i3;
        }
        throw null;
    }

    /* renamed from: bL */
    private static int m12331bL() {
        int i = f9843f + 111;
        f9844g = i % 128;
        if (!(i % 2 == 0)) {
            int i2 = m12363br().f8603f.uploadProgressTrackColor;
            int i3 = f9843f + 125;
            f9844g = i3 % 128;
            int i4 = i3 % 2;
            return i2;
        }
        int i5 = m12363br().f8603f.uploadProgressTrackColor;
        throw null;
    }

    /* renamed from: bM */
    private static int m12332bM() {
        int i = f9843f + 15;
        f9844g = i % 128;
        int i2 = i % 2;
        int i3 = m12363br().f8609l.defaultAnimationForegroundColor;
        int i4 = f9843f + 91;
        f9844g = i4 % 128;
        int i5 = i4 % 2;
        return i3;
    }

    /* renamed from: bN */
    private static int m12333bN() {
        int i = f9844g + 13;
        f9843f = i % 128;
        int i2 = i % 2;
        int i3 = m12363br().f8603f.resultAnimationBackgroundColor;
        int i4 = f9843f + 19;
        f9844g = i4 % 128;
        if ((i4 % 2 == 0 ? (char) 24 : 4) == 4) {
            return i3;
        }
        throw null;
    }

    /* renamed from: bO */
    private static int m12334bO() {
        int i = f9843f + 35;
        f9844g = i % 128;
        if ((i % 2 == 0 ? '+' : 16) != '+') {
            int i2 = m12363br().f8603f.resultAnimationForegroundColor;
            int i3 = f9843f + 15;
            f9844g = i3 % 128;
            int i4 = i3 % 2;
            return i2;
        }
        int i5 = m12363br().f8603f.resultAnimationForegroundColor;
        throw null;
    }

    /* renamed from: bP */
    private static int m12335bP() {
        int i = f9843f + 49;
        f9844g = i % 128;
        if (!(i % 2 == 0)) {
            int i2 = m12363br().f8606i.retryScreenImageBorderColor;
            int i3 = f9843f + 5;
            f9844g = i3 % 128;
            int i4 = i3 % 2;
            return i2;
        }
        int i5 = m12363br().f8606i.retryScreenImageBorderColor;
        throw null;
    }

    /* renamed from: bQ */
    private static int m12336bQ() {
        int i = f9844g + 71;
        f9843f = i % 128;
        if ((i % 2 != 0 ? 'C' : 'B') == 'B') {
            int d = m12394d(FaceTecSDK.f8630e.f8604g.backgroundColors);
            int i2 = f9844g + 103;
            f9843f = i2 % 128;
            int i3 = i2 % 2;
            return d;
        }
        m12394d(FaceTecSDK.f8630e.f8604g.backgroundColors);
        throw null;
    }

    /* renamed from: bR */
    private static int m12337bR() {
        int i = f9844g + 69;
        f9843f = i % 128;
        int i2 = i % 2;
        int i3 = m12363br().f8608k.textColor;
        int i4 = f9844g + 119;
        f9843f = i4 % 128;
        int i5 = i4 % 2;
        return i3;
    }

    /* renamed from: bS */
    private static int m12338bS() {
        int i;
        int i2 = f9843f + 103;
        f9844g = i2 % 128;
        if (!(i2 % 2 != 0)) {
            i = m12363br().f8608k.backgroundColors;
            int i3 = 19 / 0;
        } else {
            i = m12363br().f8608k.backgroundColors;
        }
        int i4 = f9843f + 47;
        f9844g = i4 % 128;
        if (!(i4 % 2 == 0)) {
            return i;
        }
        int i5 = 23 / 0;
        return i;
    }

    /* renamed from: bT */
    private static int m12339bT() {
        int i = f9843f + 43;
        f9844g = i % 128;
        if ((i % 2 == 0 ? (char) 28 : 20) != 28) {
            return m12363br().f8606i.retryScreenOvalStrokeColor;
        }
        int i2 = m12363br().f8606i.retryScreenOvalStrokeColor;
        throw null;
    }

    /* renamed from: bU */
    private static int m12340bU() {
        int i = f9844g + 123;
        f9843f = i % 128;
        if ((i % 2 != 0 ? 'P' : 6) == 6) {
            return m12363br().f8605h.selectionScreenForegroundColor;
        }
        int i2 = m12363br().f8605h.selectionScreenForegroundColor;
        throw null;
    }

    /* renamed from: bV */
    private static int m12341bV() {
        int i = f9843f + 55;
        f9844g = i % 128;
        int i2 = i % 2;
        int i3 = m12363br().f8604g.fieldValueTextColor;
        int i4 = f9843f + 103;
        f9844g = i4 % 128;
        if (i4 % 2 != 0) {
            return i3;
        }
        throw null;
    }

    /* renamed from: bW */
    private static int m12342bW() {
        int i = f9844g + 49;
        f9843f = i % 128;
        int i2 = i % 2;
        int i3 = m12363br().f8605h.captureScreenForegroundColor;
        int i4 = f9844g + 53;
        f9843f = i4 % 128;
        int i5 = i4 % 2;
        return i3;
    }

    /* renamed from: bX */
    private static int m12343bX() {
        int i = f9843f + 79;
        f9844g = i % 128;
        if ((i % 2 == 0 ? '=' : 'Z') != '=') {
            return m12363br().f8605h.reviewScreenForegroundColor;
        }
        int i2 = m12363br().f8605h.reviewScreenForegroundColor;
        throw null;
    }

    /* renamed from: bY */
    private static int m12344bY() {
        int i = f9844g + 117;
        f9843f = i % 128;
        if (!(i % 2 != 0)) {
            return m12394d(FaceTecSDK.f8630e.f8605h.selectionScreenBackgroundColors);
        }
        int i2 = 8 / 0;
        return m12394d(FaceTecSDK.f8630e.f8605h.selectionScreenBackgroundColors);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        if (r5 != true) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        if (r5 != false) goto L_0x0047;
     */
    /* renamed from: bZ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m12345bZ() {
        /*
            int r0 = f9844g
            int r0 = r0 + 125
            int r1 = r0 % 128
            f9843f = r1
            int r0 = r0 % 2
            r1 = 20
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0020
            java.lang.String r0 = m12438l((boolean) r3)
            java.lang.String r4 = m12417f((boolean) r3)
            if (r0 == 0) goto L_0x001c
            r5 = r2
            goto L_0x001d
        L_0x001c:
            r5 = r3
        L_0x001d:
            if (r5 == 0) goto L_0x002f
            goto L_0x0047
        L_0x0020:
            java.lang.String r0 = m12438l((boolean) r2)
            java.lang.String r4 = m12417f((boolean) r2)
            if (r0 == 0) goto L_0x002c
            r5 = r2
            goto L_0x002d
        L_0x002c:
            r5 = r3
        L_0x002d:
            if (r5 == r3) goto L_0x0047
        L_0x002f:
            int r5 = f9844g
            int r5 = r5 + 21
            int r6 = r5 % 128
            f9843f = r6
            int r5 = r5 % 2
            int r0 = r0.length()
            if (r0 <= r1) goto L_0x0040
            r2 = r3
        L_0x0040:
            if (r2 == 0) goto L_0x0047
            java.lang.String r0 = "Retry Screen Your Image Label"
            m12414e((java.lang.String) r0)
        L_0x0047:
            r0 = 45
            if (r4 == 0) goto L_0x004e
            r2 = 28
            goto L_0x004f
        L_0x004e:
            r2 = r0
        L_0x004f:
            if (r2 == r0) goto L_0x0064
            int r0 = r4.length()
            r2 = 87
            if (r0 <= r1) goto L_0x005c
            r0 = 58
            goto L_0x005d
        L_0x005c:
            r0 = r2
        L_0x005d:
            if (r0 == r2) goto L_0x0064
            java.lang.String r0 = "Retry Screen Ideal Image Label"
            m12414e((java.lang.String) r0)
        L_0x0064:
            int r0 = f9844g
            int r0 = r0 + 47
            int r1 = r0 % 128
            f9843f = r1
            int r0 = r0 % 2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2938dc.m12345bZ():void");
    }

    /* renamed from: ba */
    static int m12346ba() {
        int i = f9844g + 101;
        f9843f = i % 128;
        int i2 = i % 2;
        int i3 = m12363br().f8605h.customNFCCardStartingAnimation;
        int i4 = f9844g + 21;
        f9843f = i4 % 128;
        if ((i4 % 2 != 0 ? 22 : ')') != ')') {
            int i5 = 40 / 0;
        }
        return i3;
    }

    /* renamed from: bb */
    static int m12347bb() {
        int i = f9843f + 11;
        f9844g = i % 128;
        if (!(i % 2 == 0)) {
            return m12363br().f8605h.customStaticNFCStartingAnimation;
        }
        int i2 = m12363br().f8605h.customStaticNFCStartingAnimation;
        throw null;
    }

    /* renamed from: bc */
    static int m12348bc() {
        int i = f9844g + 41;
        f9843f = i % 128;
        if ((i % 2 != 0 ? '3' : '>') == '>') {
            int i2 = m12363br().f8605h.customStaticNFCScanningAnimation;
            int i3 = f9844g + 37;
            f9843f = i3 % 128;
            if (!(i3 % 2 == 0)) {
                int i4 = 29 / 0;
            }
            return i2;
        }
        int i5 = m12363br().f8605h.customStaticNFCScanningAnimation;
        throw null;
    }

    /* renamed from: bd */
    static int m12349bd() {
        int i = f9843f + 65;
        f9844g = i % 128;
        if ((i % 2 == 0 ? 6 : '&') == '&') {
            return m12363br().f8603f.customResultAnimationSuccess;
        }
        int i2 = m12363br().f8603f.customResultAnimationSuccess;
        throw null;
    }

    /* renamed from: be */
    static int m12350be() {
        int i = f9843f + 5;
        f9844g = i % 128;
        int i2 = i % 2;
        int i3 = m12363br().f8603f.customActivityIndicatorAnimation;
        int i4 = f9844g + 7;
        f9843f = i4 % 128;
        if ((i4 % 2 != 0 ? 'M' : 2) == 2) {
            return i3;
        }
        throw null;
    }

    /* renamed from: bf */
    static int m12351bf() {
        int i = f9844g + 69;
        f9843f = i % 128;
        if (i % 2 == 0) {
            int i2 = m12363br().f8605h.customStaticNFCSkipOrErrorAnimation;
            int i3 = f9844g + 101;
            f9843f = i3 % 128;
            int i4 = i3 % 2;
            return i2;
        }
        int i5 = m12363br().f8605h.customStaticNFCSkipOrErrorAnimation;
        throw null;
    }

    /* renamed from: bg */
    static int m12352bg() {
        int i = f9844g + 5;
        f9843f = i % 128;
        int i2 = i % 2;
        int i3 = m12363br().f8603f.customStaticResultAnimationSuccess;
        int i4 = f9843f + 37;
        f9844g = i4 % 128;
        if ((i4 % 2 == 0 ? (char) 12 : 22) == 22) {
            return i3;
        }
        throw null;
    }

    /* renamed from: bh */
    static int m12353bh() {
        int i = f9843f + 95;
        f9844g = i % 128;
        int i2 = i % 2;
        int i3 = m12363br().f8603f.customResultAnimationUnsuccess;
        int i4 = f9843f + 87;
        f9844g = i4 % 128;
        int i5 = i4 % 2;
        return i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        if ((com.facetec.sdk.FaceTecSDK.f8630e.f8612o.f8592a != com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.DISABLED) != false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        if ((com.facetec.sdk.FaceTecSDK.f8630e.f8612o.f8592a != com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.DISABLED ? '^' : 22) != '^') goto L_0x004d;
     */
    /* renamed from: bi */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m12354bi() {
        /*
            int r0 = f9843f
            int r0 = r0 + 25
            int r1 = r0 % 128
            f9844g = r1
            int r0 = r0 % 2
            r1 = 51
            if (r0 != 0) goto L_0x0010
            r0 = r1
            goto L_0x0012
        L_0x0010:
            r0 = 85
        L_0x0012:
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L_0x0026
            com.facetec.sdk.FaceTecCustomization r0 = com.facetec.sdk.FaceTecSDK.f8630e
            com.facetec.sdk.FaceTecCancelButtonCustomization r0 = r0.f8612o
            com.facetec.sdk.FaceTecCancelButtonCustomization$ButtonLocation r0 = r0.f8592a
            com.facetec.sdk.FaceTecCancelButtonCustomization$ButtonLocation r1 = com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.DISABLED
            if (r0 == r1) goto L_0x0022
            r0 = r2
            goto L_0x0023
        L_0x0022:
            r0 = r3
        L_0x0023:
            if (r0 == 0) goto L_0x004d
            goto L_0x003b
        L_0x0026:
            com.facetec.sdk.FaceTecCustomization r0 = com.facetec.sdk.FaceTecSDK.f8630e
            com.facetec.sdk.FaceTecCancelButtonCustomization r0 = r0.f8612o
            com.facetec.sdk.FaceTecCancelButtonCustomization$ButtonLocation r0 = r0.f8592a
            com.facetec.sdk.FaceTecCancelButtonCustomization$ButtonLocation r1 = com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.DISABLED
            r4 = 7
            int r4 = r4 / r3
            r4 = 94
            if (r0 == r1) goto L_0x0036
            r0 = r4
            goto L_0x0038
        L_0x0036:
            r0 = 22
        L_0x0038:
            if (r0 == r4) goto L_0x003b
            goto L_0x004d
        L_0x003b:
            com.facetec.sdk.FaceTecCustomization r0 = com.facetec.sdk.FaceTecSDK.f8630e
            com.facetec.sdk.FaceTecCancelButtonCustomization r0 = r0.f8612o
            com.facetec.sdk.FaceTecCancelButtonCustomization$ButtonLocation r0 = r0.f8592a
            com.facetec.sdk.FaceTecCancelButtonCustomization$ButtonLocation r1 = com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM
            r4 = 87
            if (r0 == r1) goto L_0x0049
            r0 = r4
            goto L_0x004b
        L_0x0049:
            r0 = 43
        L_0x004b:
            if (r0 == r4) goto L_0x004e
        L_0x004d:
            return r3
        L_0x004e:
            int r0 = f9844g
            int r0 = r0 + 39
            int r1 = r0 % 128
            f9843f = r1
            int r0 = r0 % 2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2938dc.m12354bi():boolean");
    }

    /* renamed from: bj */
    static float m12355bj() {
        int i = f9844g + 107;
        f9843f = i % 128;
        int i2 = i % 2;
        float min = Math.min(Math.max(FaceTecSDK.f8630e.f8603f.animationRelativeScale, 0.5f), 2.0f);
        int i3 = f9843f + 75;
        f9844g = i3 % 128;
        int i4 = i3 % 2;
        return min;
    }

    /* renamed from: bk */
    static int m12356bk() {
        int i = f9843f + 39;
        f9844g = i % 128;
        if ((i % 2 == 0 ? '`' : '>') != '`') {
            return m12363br().f8603f.customStaticResultAnimationUnsuccess;
        }
        int i2 = m12363br().f8603f.customStaticResultAnimationUnsuccess;
        throw null;
    }

    /* renamed from: bl */
    static void m12357bl() {
        char c;
        boolean z;
        String b = m12314b(false);
        String c2 = m12378c(false);
        if (b.length() > 50) {
            c = 26;
        } else {
            c = '<';
        }
        if (c == 26) {
            int i = f9843f + 55;
            f9844g = i % 128;
            if (i % 2 == 0) {
                z = true;
            } else {
                z = true;
            }
            m12414e("Ready Screen Subtext Line 1");
            if (z) {
                throw null;
            }
        }
        if (c2.length() > 50) {
            int i2 = f9844g + 29;
            f9843f = i2 % 128;
            int i3 = i2 % 2;
            m12414e("Ready Screen Subtext Line 2");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
        if (r0.length() <= 20) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
        if (r2 == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        m12384c("Retry Screen Header");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        if (r0.length() > 15) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        if (r4 != false) goto L_0x002e;
     */
    /* renamed from: bm */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m12358bm() {
        /*
            int r0 = f9843f
            int r0 = r0 + 27
            int r1 = r0 % 128
            f9844g = r1
            int r0 = r0 % 2
            java.lang.String r1 = "Retry Screen Header"
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x001d
            java.lang.String r0 = m12250a((boolean) r2)
            int r4 = r0.length()
            r5 = 15
            if (r4 <= r5) goto L_0x0040
            goto L_0x002e
        L_0x001d:
            java.lang.String r0 = m12250a((boolean) r3)
            int r4 = r0.length()
            r5 = 30
            if (r4 <= r5) goto L_0x002b
            r4 = r2
            goto L_0x002c
        L_0x002b:
            r4 = r3
        L_0x002c:
            if (r4 == 0) goto L_0x0040
        L_0x002e:
            m12414e((java.lang.String) r1)
            int r0 = f9843f
            int r0 = r0 + 117
            int r1 = r0 % 128
            f9844g = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L_0x003e
            return
        L_0x003e:
            r0 = 0
            throw r0
        L_0x0040:
            int r0 = r0.length()
            r4 = 20
            if (r0 <= r4) goto L_0x0049
            r2 = r3
        L_0x0049:
            if (r2 == 0) goto L_0x004c
            goto L_0x004f
        L_0x004c:
            m12384c((java.lang.String) r1)
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2938dc.m12358bm():void");
    }

    /* renamed from: bn */
    static void m12359bn() {
        char c;
        int i = f9844g + 53;
        f9843f = i % 128;
        if (i % 2 != 0) {
            c = 27;
        } else {
            c = 21;
        }
        if (c != 27) {
            m12361bp();
            m12357bl();
            m12358bm();
            m12360bo();
            m12388cc();
            m12345bZ();
            return;
        }
        m12361bp();
        m12357bl();
        m12358bm();
        m12360bo();
        m12388cc();
        m12345bZ();
        throw null;
    }

    /* renamed from: bo */
    static void m12360bo() {
        char c;
        int i = f9844g + 49;
        f9843f = i % 128;
        int i2 = i % 2;
        boolean z = false;
        if (m12428i(false).length() > 40) {
            z = true;
        }
        if (z) {
            int i3 = f9843f + 69;
            f9844g = i3 % 128;
            if (i3 % 2 == 0) {
                c = 27;
            } else {
                c = 15;
            }
            m12414e("Retry Screen Sub-Header Message");
            if (c != 15) {
                throw null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        if (r0 != true) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
        if (r0.length() > 30) goto L_0x0034;
     */
    /* renamed from: bp */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m12361bp() {
        /*
            int r0 = f9844g
            int r0 = r0 + 5
            int r1 = r0 % 128
            f9843f = r1
            int r0 = r0 % 2
            r1 = 30
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0026
            java.lang.String r0 = m12410e((boolean) r3)
            java.lang.String r4 = m12398d((boolean) r3)
            int r0 = r0.length()
            r5 = 114(0x72, float:1.6E-43)
            if (r0 <= r5) goto L_0x0022
            r0 = r3
            goto L_0x0023
        L_0x0022:
            r0 = r2
        L_0x0023:
            if (r0 == r2) goto L_0x0043
            goto L_0x0034
        L_0x0026:
            java.lang.String r0 = m12410e((boolean) r3)
            java.lang.String r4 = m12398d((boolean) r3)
            int r0 = r0.length()
            if (r0 <= r1) goto L_0x0043
        L_0x0034:
            int r0 = f9843f
            int r0 = r0 + 117
            int r5 = r0 % 128
            f9844g = r5
            int r0 = r0 % 2
            java.lang.String r0 = "Ready Screen Header Line 1"
            m12414e((java.lang.String) r0)
        L_0x0043:
            int r0 = r4.length()
            if (r0 <= r1) goto L_0x004a
            goto L_0x004b
        L_0x004a:
            r2 = r3
        L_0x004b:
            if (r2 == 0) goto L_0x0052
            java.lang.String r0 = "Ready Screen Header Line 2"
            m12414e((java.lang.String) r0)
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2938dc.m12361bp():void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        return ((float) r0.f8862b) / ((float) r0.f8861a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r0 == null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        if (r0 == null) goto L_0x0022;
     */
    /* renamed from: bq */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static float m12362bq() {
        /*
            int r0 = f9844g
            int r0 = r0 + 91
            int r1 = r0 % 128
            f9843f = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L_0x000f
            r0 = r1
            goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            if (r0 == 0) goto L_0x0019
            com.facetec.sdk.ak r0 = com.facetec.sdk.C2780ai.m10763c()
            if (r0 != 0) goto L_0x0045
            goto L_0x0022
        L_0x0019:
            com.facetec.sdk.ak r0 = com.facetec.sdk.C2780ai.m10763c()
            r2 = 40
            int r2 = r2 / r1
            if (r0 != 0) goto L_0x0045
        L_0x0022:
            int r0 = f9844g
            int r0 = r0 + 75
            int r2 = r0 % 128
            f9843f = r2
            int r0 = r0 % 2
            int r2 = r2 + 97
            int r0 = r2 % 128
            f9844g = r0
            int r2 = r2 % 2
            r0 = 14
            if (r2 != 0) goto L_0x003b
            r2 = 89
            goto L_0x003c
        L_0x003b:
            r2 = r0
        L_0x003c:
            r3 = 1071877689(0x3fe38e39, float:1.7777778)
            if (r2 == r0) goto L_0x0044
            r0 = 84
            int r0 = r0 / r1
        L_0x0044:
            return r3
        L_0x0045:
            int r1 = r0.f8862b
            float r1 = (float) r1
            int r0 = r0.f8861a
            float r0 = (float) r0
            float r1 = r1 / r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2938dc.m12362bq():float");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0046, code lost:
        if (com.facetec.sdk.FaceTecSDK.m10652e() == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0048, code lost:
        r0 = '5';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004a, code lost:
        r0 = 26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004c, code lost:
        if (r0 == '5') goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0050, code lost:
        return com.facetec.sdk.FaceTecSDK.f8630e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0051, code lost:
        r0 = f9844g + 95;
        f9843f = r0 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005b, code lost:
        if ((r0 % 2) != 0) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005f, code lost:
        return com.facetec.sdk.FaceTecSDK.f8627b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0060, code lost:
        r0 = com.facetec.sdk.FaceTecSDK.REQUEST_CODE_SESSION;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0062, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
        if (com.facetec.sdk.FaceTecSDK.m10647a() != false) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if (com.facetec.sdk.FaceTecSDK.m10647a() != false) goto L_0x0026;
     */
    /* renamed from: br */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.facetec.sdk.FaceTecCustomization m12363br() {
        /*
            int r0 = f9843f
            int r0 = r0 + 57
            int r1 = r0 % 128
            f9844g = r1
            int r0 = r0 % 2
            r1 = 47
            if (r0 != 0) goto L_0x0011
            r0 = 43
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            r2 = 0
            if (r0 == r1) goto L_0x0020
            boolean r0 = com.facetec.sdk.FaceTecSDK.m10647a()
            r1 = 77
            int r1 = r1 / 0
            if (r0 == 0) goto L_0x0040
            goto L_0x0026
        L_0x0020:
            boolean r0 = com.facetec.sdk.FaceTecSDK.m10647a()
            if (r0 == 0) goto L_0x0040
        L_0x0026:
            int r0 = f9843f
            int r0 = r0 + 87
            int r1 = r0 % 128
            f9844g = r1
            int r0 = r0 % 2
            r1 = 64
            if (r0 != 0) goto L_0x0036
            r0 = r1
            goto L_0x0038
        L_0x0036:
            r0 = 29
        L_0x0038:
            if (r0 == r1) goto L_0x003d
            com.facetec.sdk.FaceTecCustomization r0 = com.facetec.sdk.FaceTecSDK.f8629d
            return r0
        L_0x003d:
            int r0 = com.facetec.sdk.FaceTecSDK.REQUEST_CODE_SESSION
            throw r2
        L_0x0040:
            boolean r0 = com.facetec.sdk.FaceTecSDK.m10652e()
            r1 = 53
            if (r0 == 0) goto L_0x004a
            r0 = r1
            goto L_0x004c
        L_0x004a:
            r0 = 26
        L_0x004c:
            if (r0 == r1) goto L_0x0051
            com.facetec.sdk.FaceTecCustomization r0 = com.facetec.sdk.FaceTecSDK.f8630e
            return r0
        L_0x0051:
            int r0 = f9844g
            int r0 = r0 + 95
            int r1 = r0 % 128
            f9843f = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x0060
            com.facetec.sdk.FaceTecCustomization r0 = com.facetec.sdk.FaceTecSDK.f8627b
            return r0
        L_0x0060:
            int r0 = com.facetec.sdk.FaceTecSDK.REQUEST_CODE_SESSION
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2938dc.m12363br():com.facetec.sdk.FaceTecCustomization");
    }

    /* access modifiers changed from: private */
    /* renamed from: bs */
    public static float m12364bs() {
        char c;
        float f;
        int i = f9843f + 87;
        f9844g = i % 128;
        if (i % 2 == 0) {
            c = '4';
        } else {
            c = '[';
        }
        if (c != '[') {
            f = (((float) m12366bu().widthPixels) + C2810ax.m10988b(21355)) - (m12311b() * 1.7777778f);
        } else {
            f = (((float) m12366bu().widthPixels) / C2810ax.m10988b(340)) * (m12311b() / 1.7777778f);
        }
        int i2 = f9844g + 99;
        f9843f = i2 % 128;
        int i3 = i2 % 2;
        return f;
    }

    /* renamed from: bt */
    static void m12365bt() {
        f9845i = -1227064895110260898L;
    }

    /* renamed from: bu */
    private static DisplayMetrics m12366bu() {
        int i = f9844g + 39;
        f9843f = i % 128;
        int i2 = i % 2;
        DisplayMetrics d = f9840c.mo9264d(new C3646vi());
        int i3 = f9843f + 23;
        f9844g = i3 % 128;
        if ((i3 % 2 == 0 ? 'S' : '_') != 'S') {
            return d;
        }
        throw null;
    }

    /* renamed from: bv */
    private static int m12367bv() {
        char c;
        int i = f9843f + 1;
        f9844g = i % 128;
        int i2 = i % 2;
        int y = m12462y() + m12455u();
        int i3 = f9843f + 71;
        f9844g = i3 % 128;
        if (i3 % 2 == 0) {
            c = 'K';
        } else {
            c = 'C';
        }
        if (c != 'C') {
            int i4 = 45 / 0;
        }
        return y;
    }

    /* renamed from: bw */
    private static int m12368bw() {
        char c;
        int i = FaceTecSDK.f8630e.f8608k.cornerRadius;
        if (i == -1) {
            c = '+';
        } else {
            c = ' ';
        }
        if (c == '+') {
            int i2 = f9843f;
            int i3 = i2 + 55;
            f9844g = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 63;
            f9844g = i5 % 128;
            int i6 = i5 % 2;
            i = 3;
        }
        return Math.round(((float) i) * m12372c());
    }

    /* access modifiers changed from: private */
    /* renamed from: bx */
    public static float m12369bx() {
        char c;
        float f;
        int i;
        boolean z;
        char c2;
        DisplayMetrics bu = m12366bu();
        float f2 = (float) bu.widthPixels;
        float f3 = (float) bu.heightPixels;
        if (((double) m12311b()) < 1.4d) {
            c = 20;
        } else {
            c = 'H';
        }
        if (c != 'H') {
            int i2 = f9844g + 23;
            f9843f = i2 % 128;
            int i3 = i2 % 2;
            f = 0.94f;
        } else {
            f = 0.88f;
        }
        float f4 = f2 * f;
        float f5 = bu.density * 340.0f;
        if (f4 > f5) {
            f = f5 / f2;
            f4 = f5;
        }
        Resources system = Resources.getSystem();
        Object[] objArr = new Object[1];
        m12390ce("쳔첵⒌랏ṇ?鿣ꌧೋ", (PointF.length(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON) > Utils.FLOAT_EPSILON ? 1 : (PointF.length(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON) == Utils.FLOAT_EPSILON ? 0 : -1)), objArr);
        int i4 = 0;
        int identifier = system.getIdentifier("status_bar_height", "dimen", ((String) objArr[0]).intern());
        if (identifier > 0) {
            int i5 = f9843f + 3;
            f9844g = i5 % 128;
            if (i5 % 2 == 0) {
                c2 = 14;
            } else {
                c2 = 'D';
            }
            if (c2 == 'D') {
                i = Resources.getSystem().getDimensionPixelSize(identifier);
            } else {
                Resources.getSystem().getDimensionPixelSize(identifier);
                throw null;
            }
        } else {
            i = 0;
        }
        Resources system2 = Resources.getSystem();
        Object[] objArr2 = new Object[1];
        m12390ce("쳔첵⒌랏ṇ?鿣ꌧೋ", ViewConfiguration.getFadingEdgeLength() >> 16, objArr2);
        int identifier2 = system2.getIdentifier("navigation_bar_height", "dimen", ((String) objArr2[0]).intern());
        if (identifier2 > 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            int i6 = f9843f + 105;
            f9844g = i6 % 128;
            if (i6 % 2 != 0) {
                i4 = Resources.getSystem().getDimensionPixelSize(identifier2);
            } else {
                Resources.getSystem().getDimensionPixelSize(identifier2);
                throw null;
            }
        }
        float f6 = (((f3 - ((bu.density * 10.0f) * 3.0f)) - 10.0f) - ((float) i4)) - ((float) i);
        if (m12311b() * f4 <= f6) {
            return f;
        }
        float b = f6 / (m12311b() * f2);
        int i7 = f9843f + 87;
        f9844g = i7 % 128;
        int i8 = i7 % 2;
        return b;
    }

    /* renamed from: by */
    private static int m12370by() {
        int i = f9844g + 97;
        f9843f = i % 128;
        int i2 = i % 2;
        int d = m12394d(FaceTecSDK.f8630e.f8603f.backgroundColors);
        int i3 = f9843f + 91;
        f9844g = i3 % 128;
        if ((i3 % 2 == 0 ? 'X' : '/') != '/') {
            int i4 = 16 / 0;
        }
        return d;
    }

    /* renamed from: bz */
    private static int m12371bz() {
        int i = f9843f + 103;
        f9844g = i % 128;
        if ((i % 2 == 0 ? '*' : 16) == 16) {
            return m12394d(FaceTecSDK.f8630e.f8605h.additionalReviewScreenBackgroundColors);
        }
        m12394d(FaceTecSDK.f8630e.f8605h.additionalReviewScreenBackgroundColors);
        throw null;
    }

    /* renamed from: c */
    static synchronized float m12372c() {
        float floatValue;
        synchronized (C2938dc.class) {
            int i = f9843f + 13;
            f9844g = i % 128;
            int i2 = i % 2;
            floatValue = f9838a.mo9264d(new C3623ui()).floatValue();
            int i3 = f9844g + 51;
            f9843f = i3 % 128;
            if (!(i3 % 2 == 0)) {
                throw null;
            }
        }
        return floatValue;
    }

    /* renamed from: ca */
    private static int m12386ca() {
        int i = f9844g + 79;
        f9843f = i % 128;
        int i2 = i % 2;
        int d = m12394d(FaceTecSDK.f8630e.f8605h.captureScreenBackgroundColor);
        int i3 = f9844g + 105;
        f9843f = i3 % 128;
        int i4 = i3 % 2;
        return d;
    }

    /* renamed from: cb */
    private static int m12387cb() {
        int i = f9844g + 17;
        f9843f = i % 128;
        int i2 = i % 2;
        int i3 = m12363br().f8605h.captureScreenFocusMessageTextColor;
        int i4 = f9843f + 69;
        f9844g = i4 % 128;
        int i5 = i4 % 2;
        return i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        if (r2 != null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002b, code lost:
        if (r2 != null) goto L_0x002d;
     */
    /* renamed from: cc */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m12388cc() {
        /*
            int r0 = f9844g
            int r0 = r0 + 51
            int r1 = r0 % 128
            f9843f = r1
            int r0 = r0 % 2
            r1 = 40
            if (r0 == 0) goto L_0x001e
            r0 = 1
            java.lang.String r2 = m12423h((boolean) r0)
            java.lang.String r3 = m12420g((boolean) r0)
            java.lang.String r0 = m12433j((boolean) r0)
            if (r2 == 0) goto L_0x0038
            goto L_0x002d
        L_0x001e:
            r0 = 0
            java.lang.String r2 = m12423h((boolean) r0)
            java.lang.String r3 = m12420g((boolean) r0)
            java.lang.String r0 = m12433j((boolean) r0)
            if (r2 == 0) goto L_0x0038
        L_0x002d:
            int r2 = r2.length()
            if (r2 <= r1) goto L_0x0038
            java.lang.String r2 = "Retry Screen Instruction Message 1"
            m12414e((java.lang.String) r2)
        L_0x0038:
            if (r3 == 0) goto L_0x004d
            int r2 = r3.length()
            r3 = 77
            if (r2 <= r1) goto L_0x0045
            r2 = 94
            goto L_0x0046
        L_0x0045:
            r2 = r3
        L_0x0046:
            if (r2 == r3) goto L_0x004d
            java.lang.String r2 = "Retry Screen Instruction Message 2"
            m12414e((java.lang.String) r2)
        L_0x004d:
            if (r0 == 0) goto L_0x0064
            int r0 = r0.length()
            if (r0 <= r1) goto L_0x0064
            java.lang.String r0 = "Retry Screen Instruction Message 3"
            m12414e((java.lang.String) r0)
            int r0 = f9843f
            int r0 = r0 + 115
            int r1 = r0 % 128
            f9844g = r1
            int r0 = r0 % 2
        L_0x0064:
            int r0 = f9844g
            int r0 = r0 + 39
            int r1 = r0 % 128
            f9843f = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x0071
            return
        L_0x0071:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2938dc.m12388cc():void");
    }

    /* renamed from: cd */
    private static int m12389cd() {
        int i = f9843f + 89;
        f9844g = i % 128;
        if ((i % 2 == 0 ? 'T' : 'Q') != 'T') {
            int i2 = m12363br().f8605h.captureFrameStrokeColor;
            int i3 = f9843f + 115;
            f9844g = i3 % 128;
            if (!(i3 % 2 == 0)) {
                return i2;
            }
            int i4 = 36 / 0;
            return i2;
        }
        int i5 = m12363br().f8605h.captureFrameStrokeColor;
        throw null;
    }

    /* renamed from: ce */
    private static void m12390ce(String str, int i, Object[] objArr) {
        boolean z;
        Object obj;
        char c;
        Throwable cause;
        Class<Object> cls = Object.class;
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i2 = $10 + 97;
            $11 = i2 % 128;
            int i3 = i2 % 2;
            obj = str.toCharArray();
        } else {
            obj = str;
        }
        C3169gk gkVar = new C3169gk();
        char[] b = C3169gk.m12973b(f9845i ^ 1486537209939166088L, (char[]) obj, i);
        int i4 = 4;
        gkVar.f10460a = 4;
        int i5 = $10 + 39;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (true) {
            int i7 = gkVar.f10460a;
            if (i7 < b.length) {
                c = 28;
            } else {
                c = 9;
            }
            if (c != 28) {
                objArr[0] = new String(b, i4, b.length - i4);
                return;
            }
            int i8 = i7 - 4;
            gkVar.f10461b = i8;
            long j = (long) (b[i7] ^ b[i7 % 4]);
            long j2 = (long) i8;
            try {
                Object[] objArr2 = new Object[3];
                objArr2[2] = Long.valueOf(f9845i);
                objArr2[1] = Long.valueOf(j2);
                objArr2[0] = Long.valueOf(j);
                Map<Integer, Object> map = C2854bp.f9335p;
                Object obj2 = map.get(-1479914154);
                if (obj2 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) b2;
                    Object[] objArr3 = new Object[1];
                    m12392cg(b2, b3, (byte) b3, objArr3);
                    Class cls2 = Long.TYPE;
                    obj2 = ((Class) C2854bp.m11559b((char) ((Process.getElapsedCpuTime() > 0 ? 1 : (Process.getElapsedCpuTime() == 0 ? 0 : -1)) - 1), 1264 - (ViewConfiguration.getEdgeSlop() >> 16), 24 - (ViewConfiguration.getPressedStateDuration() >> 16))).getMethod((String) objArr3[0], new Class[]{cls2, cls2, cls2});
                    map.put(-1479914154, obj2);
                }
                b[i7] = ((Character) ((Method) obj2).invoke((Object) null, objArr2)).charValue();
                try {
                    Object[] objArr4 = new Object[2];
                    objArr4[1] = gkVar;
                    objArr4[0] = gkVar;
                    Object obj3 = map.get(-369845900);
                    if (obj3 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) b4;
                        Object[] objArr5 = new Object[1];
                        m12392cg(b4, b5, (byte) (b5 + 1), objArr5);
                        obj3 = ((Class) C2854bp.m11559b((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 15364), 1430 - Color.blue(0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)) + 23)).getMethod((String) objArr5[0], new Class[]{cls, cls});
                        map.put(-369845900, obj3);
                    }
                    ((Method) obj3).invoke((Object) null, objArr4);
                    i4 = 4;
                } catch (Throwable th) {
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } finally {
                cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: cf */
    public static /* synthetic */ Object m12391cf() {
        int i = f9844g + 63;
        f9843f = i % 128;
        int i2 = i % 2;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        int i3 = f9843f + 15;
        f9844g = i3 % 128;
        int i4 = i3 % 2;
        return displayMetrics;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* renamed from: cg */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m12392cg(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 3
            int r6 = 3 - r6
            int r8 = r8 * 4
            int r8 = 121 - r8
            byte[] r0 = $$a
            int r7 = r7 * 3
            int r7 = 1 - r7
            byte[] r1 = new byte[r7]
            int r7 = r7 + -1
            r2 = 0
            if (r0 != 0) goto L_0x001d
            r8 = r7
            r3 = r1
            r4 = r2
            r7 = r6
            r1 = r0
            r0 = r9
            r9 = r8
            goto L_0x0039
        L_0x001d:
            r3 = r2
        L_0x001e:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L_0x002b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L_0x002b:
            int r3 = r3 + 1
            int r6 = r6 + 1
            byte r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L_0x0039:
            int r8 = r8 + r6
            r6 = r7
            r7 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2938dc.m12392cg(byte, byte, byte, java.lang.Object[]):void");
    }

    /* renamed from: d */
    static int m12393d() {
        int i = f9843f + 61;
        f9844g = i % 128;
        int i2 = i % 2;
        int round = Math.round(C2810ax.m10988b(15) * m12372c() * m12404e());
        int i3 = f9844g + 25;
        f9843f = i3 % 128;
        if ((i3 % 2 != 0 ? 'C' : '6') != 'C') {
            return round;
        }
        int i4 = 22 / 0;
        return round;
    }

    /* renamed from: e */
    static synchronized float m12404e() {
        float floatValue;
        synchronized (C2938dc.class) {
            int i = f9843f + 41;
            f9844g = i % 128;
            int i2 = i % 2;
            floatValue = f9841d.mo9264d(new C3553ri()).floatValue();
            int i3 = f9843f + 73;
            f9844g = i3 % 128;
            int i4 = i3 % 2;
        }
        return floatValue;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0041, code lost:
        if (com.facetec.sdk.C2923cy.m12206b(com.facetec.sdk.C2747R.string.FaceTec_idscan_type_selection_header).length() > 36) goto L_0x0043;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0060 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0061  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m12415f() {
        /*
            int r0 = f9843f
            int r0 = r0 + 97
            int r1 = r0 % 128
            f9844g = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L_0x002c
            float r0 = m12372c()
            float r2 = m12404e()
            float r0 = r0 / r2
            int r2 = com.facetec.sdk.C2747R.string.FaceTec_idscan_type_selection_header
            java.lang.String r2 = com.facetec.sdk.C2923cy.m12206b(r2)
            int r2 = r2.length()
            r3 = 69
            r4 = 1
            if (r2 <= r3) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            r1 = r4
        L_0x0027:
            if (r1 == r4) goto L_0x002a
            goto L_0x0043
        L_0x002a:
            r1 = r4
            goto L_0x0044
        L_0x002c:
            float r0 = m12372c()
            float r2 = m12404e()
            float r0 = r0 * r2
            int r2 = com.facetec.sdk.C2747R.string.FaceTec_idscan_type_selection_header
            java.lang.String r2 = com.facetec.sdk.C2923cy.m12206b(r2)
            int r2 = r2.length()
            r3 = 36
            if (r2 <= r3) goto L_0x0044
        L_0x0043:
            r1 = -4
        L_0x0044:
            int r1 = r1 + 28
            float r1 = (float) r1
            float r1 = r1 * r0
            int r0 = java.lang.Math.round(r1)
            int r1 = f9844g
            int r1 = r1 + 95
            int r2 = r1 % 128
            f9843f = r2
            int r1 = r1 % 2
            r2 = 14
            if (r1 == 0) goto L_0x005c
            r1 = r2
            goto L_0x005e
        L_0x005c:
            r1 = 93
        L_0x005e:
            if (r1 == r2) goto L_0x0061
            return r0
        L_0x0061:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2938dc.m12415f():int");
    }

    /* renamed from: g */
    static int m12418g() {
        int i = f9844g;
        int i2 = i + 91;
        f9843f = i2 % 128;
        boolean z = true;
        if (!(i2 % 2 == 0)) {
            int i3 = 17 / 0;
        }
        int i4 = i + 59;
        f9843f = i4 % 128;
        if (i4 % 2 == 0) {
            z = false;
        }
        if (!z) {
            return -1;
        }
        throw null;
    }

    /* renamed from: h */
    static int m12421h() {
        int i = f9843f + 107;
        int i2 = i % 128;
        f9844g = i2;
        int i3 = i % 2;
        int i4 = i2 + 57;
        f9843f = i4 % 128;
        int i5 = i4 % 2;
        return 10;
    }

    /* renamed from: i */
    static FaceTecSize m12427i() {
        FaceTecSize faceTecSize = new FaceTecSize(Math.round(C2810ax.m10994c(m12366bu().widthPixels) - (m12372c() * 20.0f)), Math.round(m12372c() * 60.0f));
        int i = f9844g + 81;
        f9843f = i % 128;
        int i2 = i % 2;
        return faceTecSize;
    }

    static void init$0() {
        $$a = new byte[]{4, 113, 105, 104};
        $$b = 101;
    }

    /* renamed from: j */
    static int m12431j() {
        int i = f9843f + 31;
        f9844g = i % 128;
        int i2 = i % 2;
        int i3 = FaceTecSDK.f8630e.f8611n.borderWidth;
        if (i3 == -1) {
            i3 = 2;
        }
        int i4 = 1;
        if ((i3 == 0 ? '&' : '/') == '&') {
            int i5 = f9844g + 117;
            f9843f = i5 % 128;
            int i6 = i5 % 2;
            i4 = 0;
        }
        return Math.max(i4, Math.round(((float) i3) * m12372c()));
    }

    /* renamed from: k */
    static int m12434k() {
        int i = FaceTecSDK.f8630e.f8606i.buttonBorderWidth;
        int i2 = 1;
        if (i == -1) {
            int i3 = f9844g + 123;
            f9843f = i3 % 128;
            i = i3 % 2 == 0 ? 0 : 1;
        } else {
            int i4 = f9843f + 49;
            f9844g = i4 % 128;
            int i5 = i4 % 2;
        }
        if (i == 0) {
            int i6 = f9843f + 41;
            f9844g = i6 % 128;
            int i7 = i6 % 2;
            i2 = 0;
        }
        return Math.max(i2, Math.round(((float) i) * m12372c()));
    }

    /* renamed from: l */
    static int m12436l() {
        int i = FaceTecSDK.f8630e.f8606i.retryScreenImageBorderWidth;
        int i2 = 0;
        if (i == -1) {
            int i3 = f9844g + 55;
            f9843f = i3 % 128;
            int i4 = i3 % 2;
            i = 1;
        } else {
            int i5 = f9843f + 93;
            f9844g = i5 % 128;
            int i6 = i5 % 2;
        }
        if (i == 0) {
            int i7 = f9844g + 5;
            f9843f = i7 % 128;
            int i8 = i7 % 2;
        } else {
            i2 = 1;
        }
        return Math.max(i2, Math.round(((float) i) * m12372c()));
    }

    /* renamed from: m */
    static int m12439m() {
        int i;
        int i2 = f9844g + 71;
        f9843f = i2 % 128;
        int i3 = i2 % 2;
        int i4 = FaceTecSDK.f8630e.f8604g.mainHeaderDividerLineWidth;
        if (i4 == -1) {
            i4 = 2;
        }
        if ((i4 == 0 ? '=' : 'Y') != '=') {
            int i5 = f9843f + 115;
            f9844g = i5 % 128;
            int i6 = i5 % 2;
            i = 1;
        } else {
            i = 0;
        }
        return Math.max(i, Math.round(((float) i4) * m12372c()));
    }

    /* renamed from: n */
    static int m12441n() {
        int i = f9843f + 125;
        f9844g = i % 128;
        int i2 = i % 2;
        int i3 = FaceTecSDK.f8630e.f8605h.buttonBorderWidth;
        int i4 = 0;
        if (i3 == -1) {
            int i5 = f9844g;
            int i6 = i5 + 109;
            f9843f = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 31;
            f9843f = i8 % 128;
            int i9 = i8 % 2;
            i3 = 0;
        }
        if ((i3 == 0 ? '\'' : '\"') != '\"') {
            int i12 = f9844g + 11;
            f9843f = i12 % 128;
            int i13 = i12 % 2;
        } else {
            i4 = 1;
        }
        return Math.max(i4, Math.round(((float) i3) * m12372c()));
    }

    /* renamed from: o */
    static int m12443o() {
        int i = FaceTecSDK.f8630e.f8604g.buttonBorderWidth;
        int i2 = 1;
        if (!(i == -1)) {
            int i3 = f9843f + 11;
            f9844g = i3 % 128;
            int i4 = i3 % 2;
        } else {
            int i5 = f9844g + 123;
            f9843f = i5 % 128;
            int i6 = i5 % 2;
            i = 0;
        }
        if ((i == 0 ? '4' : 'R') == '4') {
            i2 = 0;
        }
        int max = Math.max(i2, Math.round(((float) i) * m12372c()));
        int i7 = f9843f + 111;
        f9844g = i7 % 128;
        int i8 = i7 % 2;
        return max;
    }

    /* renamed from: p */
    static int m12445p() {
        int i = f9844g + 49;
        f9843f = i % 128;
        if ((i % 2 != 0 ? 'F' : 'A') != 'F') {
            int i2 = FaceTecSDK.f8630e.f8604g.inputFieldBorderWidth;
            int i3 = 1;
            if ((i2 == -1 ? 15 : 'Y') != 'Y') {
                i2 = 1;
            } else {
                int i4 = f9844g + 69;
                f9843f = i4 % 128;
                int i5 = i4 % 2;
            }
            if (i2 == 0) {
                int i6 = f9844g + 111;
                f9843f = i6 % 128;
                int i7 = i6 % 2;
                i3 = 0;
            }
            int max = Math.max(i3, Math.round(((float) i2) * m12372c()));
            int i8 = f9843f + 93;
            f9844g = i8 % 128;
            int i9 = i8 % 2;
            return max;
        }
        int i12 = FaceTecSDK.f8630e.f8604g.inputFieldBorderWidth;
        throw null;
    }

    /* renamed from: q */
    static int m12447q() {
        int i = f9843f + 107;
        f9844g = i % 128;
        int i2 = i % 2;
        int i3 = FaceTecSDK.f8630e.f8605h.captureFrameStrokeWidth;
        if (i3 == -1) {
            i3 = 2;
        }
        int i4 = 0;
        if (i3 != 0) {
            int i5 = f9843f + 77;
            f9844g = i5 % 128;
            int i6 = i5 % 2;
            i4 = 1;
        } else {
            int i7 = f9844g + 67;
            f9843f = i7 % 128;
            int i8 = i7 % 2;
        }
        return Math.max(i4, Math.round(((float) i3) * m12372c()));
    }

    /* renamed from: r */
    static int m12449r() {
        int i = FaceTecSDK.f8630e.f8605h.captureScreenTextBackgroundBorderWidth;
        int i2 = 0;
        if ((i == -1 ? 29 : '<') != 29) {
            int i3 = f9843f + 49;
            f9844g = i3 % 128;
            int i4 = i3 % 2;
        } else {
            int i5 = f9843f + 15;
            f9844g = i5 % 128;
            int i6 = i5 % 2;
            i = 0;
        }
        if (!(i == 0)) {
            i2 = 1;
        }
        return Math.max(i2, Math.round(((float) i) * m12372c()));
    }

    /* renamed from: s */
    static int m12451s() {
        int i = f9843f + 117;
        f9844g = i % 128;
        int i2 = i % 2;
        int i3 = FaceTecSDK.f8630e.f8604g.scrollIndicatorBorderWidth;
        int i4 = 0;
        if (!(i3 != -1)) {
            i3 = 0;
        } else {
            int i5 = f9844g + 5;
            f9843f = i5 % 128;
            int i6 = i5 % 2;
        }
        if ((i3 == 0 ? '\"' : '1') == '1') {
            i4 = 1;
        }
        return Math.max(i4, Math.round(((float) i3) * m12372c()));
    }

    /* renamed from: t */
    static int m12453t() {
        int i = f9844g + 121;
        f9843f = i % 128;
        int i2 = i % 2;
        int i3 = FaceTecSDK.f8630e.f8605h.reviewScreenTextBackgroundBorderWidth;
        int i4 = 1;
        if ((i3 == -1 ? ')' : 'I') != 'I') {
            int i5 = f9844g + 119;
            f9843f = i5 % 128;
            int i6 = i5 % 2;
            i3 = 0;
        }
        if ((i3 == 0 ? (char) 14 : 9) == 14) {
            i4 = 0;
        }
        int max = Math.max(i4, Math.round(((float) i3) * m12372c()));
        int i7 = f9844g + 67;
        f9843f = i7 % 128;
        int i8 = i7 % 2;
        return max;
    }

    /* renamed from: u */
    static int m12455u() {
        char c;
        int i;
        int i2 = f9843f + 67;
        f9844g = i2 % 128;
        int i3 = i2 % 2;
        int i4 = FaceTecSDK.f8630e.f8610m.progressStrokeWidth;
        if (i4 == -1) {
            c = '4';
        } else {
            c = '1';
        }
        if (c != '1') {
            int i5 = f9843f + 63;
            f9844g = i5 % 128;
            int i6 = i5 % 2;
            i4 = 6;
        }
        if (i4 == 0) {
            int i7 = f9844g + 53;
            f9843f = i7 % 128;
            int i8 = i7 % 2;
            i = 0;
        } else {
            i = 1;
        }
        int max = Math.max(i, Math.round(((float) i4) * m12372c()));
        int i9 = f9844g + 123;
        f9843f = i9 % 128;
        int i12 = i9 % 2;
        return max;
    }

    /* renamed from: v */
    private static Resources m12457v(Context context) {
        int i = f9843f + 93;
        f9844g = i % 128;
        int i2 = i % 2;
        C3050f<Resources> fVar = f9842e;
        Objects.requireNonNull(context);
        Resources d = fVar.mo9264d(new C3602ti(context));
        int i3 = f9843f + 9;
        f9844g = i3 % 128;
        if ((i3 % 2 == 0 ? 11 : 'D') != 11) {
            return d;
        }
        throw null;
    }

    /* renamed from: w */
    static int m12458w() {
        int i = FaceTecSDK.f8630e.f8606i.readyScreenTextBackgroundCornerRadius;
        if (!(i == -1)) {
            int i2 = f9843f + 19;
            f9844g = i2 % 128;
            int i3 = i2 % 2;
        } else {
            i = 6;
        }
        int round = Math.round(((float) i) * m12372c());
        int i4 = f9843f + 89;
        f9844g = i4 % 128;
        int i5 = i4 % 2;
        return round;
    }

    /* renamed from: x */
    static int m12460x() {
        int i = FaceTecSDK.f8630e.f8604g.scrollIndicatorCornerRadius;
        boolean z = false;
        if (!(i != -1)) {
            i = -1;
        }
        if (i == -1) {
            z = true;
        }
        if (z) {
            int i2 = f9844g + 101;
            f9843f = i2 % 128;
            int i3 = i2 % 2;
            return i;
        }
        int round = Math.round(((float) i) * m12372c());
        int i4 = f9844g + 69;
        f9843f = i4 % 128;
        int i5 = i4 % 2;
        return round;
    }

    /* renamed from: y */
    static int m12462y() {
        boolean z;
        boolean z2;
        int i = f9844g + 7;
        f9843f = i % 128;
        int i2 = 1;
        if (i % 2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            int i3 = FaceTecSDK.f8630e.f8610m.strokeWidth;
            if (i3 == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                i3 = 6;
            } else {
                int i4 = f9844g + 73;
                f9843f = i4 % 128;
                int i5 = i4 % 2;
            }
            if (i3 == 0) {
                i2 = 0;
            }
            return Math.max(i2, Math.round(((float) i3) * m12372c()));
        }
        int i6 = FaceTecSDK.f8630e.f8610m.strokeWidth;
        throw null;
    }

    /* renamed from: z */
    static int m12463z() {
        int i = f9844g + 87;
        f9843f = i % 128;
        int i2 = i % 2;
        int i3 = FaceTecSDK.f8630e.f8606i.retryScreenImageCornerRadius;
        if (i3 == -1) {
            int i4 = f9843f + 125;
            f9844g = i4 % 128;
            if (i4 % 2 == 0) {
                i3 = 34;
            } else {
                i3 = 10;
            }
        }
        return Math.round(((float) i3) * m12372c());
    }

    /* renamed from: b */
    static int m12313b(Context context) {
        int i = f9844g + 117;
        f9843f = i % 128;
        int i2 = i % 2;
        int e = m12408e(context, m12386ca());
        int i3 = f9844g + 7;
        f9843f = i3 % 128;
        if ((i3 % 2 != 0 ? 'D' : '\"') != 'D') {
            return e;
        }
        throw null;
    }

    /* renamed from: c */
    static FaceTecCustomization m12376c(FaceTecCustomization faceTecCustomization) {
        Typeface typeface = Typeface.DEFAULT_BOLD;
        Typeface typeface2 = Typeface.DEFAULT;
        FaceTecFeedbackCustomization faceTecFeedbackCustomization = faceTecCustomization.f8608k;
        boolean z = false;
        if (!(faceTecFeedbackCustomization.textFont != null)) {
            faceTecFeedbackCustomization.textFont = typeface2;
        }
        FaceTecGuidanceCustomization faceTecGuidanceCustomization = faceTecCustomization.f8606i;
        if (faceTecGuidanceCustomization.headerFont == null) {
            faceTecGuidanceCustomization.headerFont = typeface;
        }
        if (faceTecGuidanceCustomization.subtextFont == null) {
            faceTecGuidanceCustomization.subtextFont = typeface2;
        }
        if (faceTecGuidanceCustomization.buttonFont == null) {
            int i = f9843f + 103;
            f9844g = i % 128;
            if ((i % 2 == 0 ? '-' : '!') == '!') {
                faceTecGuidanceCustomization.buttonFont = typeface2;
            } else {
                faceTecGuidanceCustomization.buttonFont = typeface2;
                throw null;
            }
        }
        FaceTecResultScreenCustomization faceTecResultScreenCustomization = faceTecCustomization.f8603f;
        if ((faceTecResultScreenCustomization.messageFont == null ? '\"' : 24) == '\"') {
            faceTecResultScreenCustomization.messageFont = typeface2;
        }
        FaceTecIDScanCustomization faceTecIDScanCustomization = faceTecCustomization.f8605h;
        if (faceTecIDScanCustomization.headerFont == null) {
            int i2 = f9843f + 123;
            int i3 = i2 % 128;
            f9844g = i3;
            if (i2 % 2 != 0) {
                faceTecIDScanCustomization.headerFont = typeface;
                int i4 = i3 + 35;
                f9843f = i4 % 128;
                int i5 = i4 % 2;
            } else {
                faceTecIDScanCustomization.headerFont = typeface;
                throw null;
            }
        }
        if (faceTecIDScanCustomization.subtextFont == null) {
            int i6 = f9844g + 71;
            f9843f = i6 % 128;
            int i7 = i6 % 2;
            faceTecIDScanCustomization.subtextFont = typeface2;
        }
        if (faceTecIDScanCustomization.buttonFont == null) {
            int i8 = f9844g + 89;
            f9843f = i8 % 128;
            int i9 = i8 % 2;
            faceTecIDScanCustomization.buttonFont = typeface2;
        }
        if (!(faceTecIDScanCustomization.captureScreenFocusMessageFont != null)) {
            faceTecIDScanCustomization.captureScreenFocusMessageFont = typeface2;
        }
        FaceTecOCRConfirmationCustomization faceTecOCRConfirmationCustomization = faceTecCustomization.f8604g;
        if (faceTecOCRConfirmationCustomization.buttonFont == null) {
            faceTecOCRConfirmationCustomization.buttonFont = typeface2;
        }
        if (faceTecOCRConfirmationCustomization.mainHeaderFont == null) {
            faceTecOCRConfirmationCustomization.mainHeaderFont = typeface;
            int i12 = f9844g + 51;
            f9843f = i12 % 128;
            int i13 = i12 % 2;
        }
        if (faceTecOCRConfirmationCustomization.sectionHeaderFont == null) {
            faceTecOCRConfirmationCustomization.sectionHeaderFont = typeface;
        }
        if (faceTecOCRConfirmationCustomization.fieldLabelFont == null) {
            faceTecOCRConfirmationCustomization.fieldLabelFont = typeface2;
        }
        if (!(faceTecOCRConfirmationCustomization.fieldValueFont != null)) {
            faceTecOCRConfirmationCustomization.fieldValueFont = typeface2;
        }
        if (faceTecOCRConfirmationCustomization.inputFieldFont == null) {
            faceTecOCRConfirmationCustomization.inputFieldFont = faceTecOCRConfirmationCustomization.fieldValueFont;
        }
        if (faceTecOCRConfirmationCustomization.inputFieldPlaceholderFont != null) {
            z = true;
        }
        if (!z) {
            faceTecOCRConfirmationCustomization.inputFieldPlaceholderFont = faceTecOCRConfirmationCustomization.inputFieldFont;
        }
        if (faceTecOCRConfirmationCustomization.scrollIndicatorFont == null) {
            faceTecOCRConfirmationCustomization.scrollIndicatorFont = typeface2;
        }
        return faceTecCustomization;
    }

    /* renamed from: e */
    static int m12408e(Context context, int i) {
        int i2 = f9843f + 105;
        f9844g = i2 % 128;
        if ((i2 % 2 == 0 ? '\'' : '.') != '.') {
            int i3 = C29392.f9846b[m12396d(context, i).ordinal()];
            throw null;
        } else if (C29392.f9846b[m12396d(context, i).ordinal()] != 1) {
            int i4 = f9843f + 85;
            f9844g = i4 % 128;
            if ((i4 % 2 == 0 ? '8' : 15) != '8') {
                return i;
            }
            throw null;
        } else {
            try {
                return C0767a.m2893c(context, i);
            } catch (Throwable unused) {
                return i;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        if ((r0 != 0) != true) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (r0 == 0) goto L_0x0031;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m12419g(android.content.Context r5) {
        /*
            int r0 = f9844g
            int r0 = r0 + 51
            int r1 = r0 % 128
            f9843f = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0010
            r0 = r1
            goto L_0x0011
        L_0x0010:
            r0 = r2
        L_0x0011:
            r3 = 0
            if (r0 == r2) goto L_0x0022
            int r0 = m12324bE()
            int r0 = m12408e((android.content.Context) r5, (int) r0)
            r4 = 58
            int r4 = r4 / r1
            if (r0 != 0) goto L_0x0049
            goto L_0x0031
        L_0x0022:
            int r0 = m12324bE()
            int r0 = m12408e((android.content.Context) r5, (int) r0)
            if (r0 != 0) goto L_0x002e
            r4 = r1
            goto L_0x002f
        L_0x002e:
            r4 = r2
        L_0x002f:
            if (r4 == r2) goto L_0x0049
        L_0x0031:
            int r0 = f9844g
            int r0 = r0 + 79
            int r4 = r0 % 128
            f9843f = r4
            int r0 = r0 % 2
            if (r0 == 0) goto L_0x003e
            r1 = r2
        L_0x003e:
            if (r1 != 0) goto L_0x0045
            int r0 = m12459w(r5)
            goto L_0x0049
        L_0x0045:
            m12459w(r5)
            throw r3
        L_0x0049:
            int r5 = f9844g
            int r5 = r5 + 57
            int r1 = r5 % 128
            f9843f = r1
            int r5 = r5 % 2
            if (r5 != 0) goto L_0x0056
            return r0
        L_0x0056:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2938dc.m12419g(android.content.Context):int");
    }

    /* renamed from: h */
    static int m12422h(Context context) {
        int i = f9843f + 93;
        f9844g = i % 128;
        if (i % 2 != 0) {
            int e = m12408e(context, m12321bB());
            if (!(e == 0)) {
                return e;
            }
            int w = m12459w(context);
            int i2 = f9843f + 51;
            f9844g = i2 % 128;
            int i3 = i2 % 2;
            return w;
        }
        m12408e(context, m12321bB());
        throw null;
    }

    /* renamed from: v */
    static int m12456v() {
        int i = FaceTecSDK.f8630e.f8611n.cornerRadius;
        if (i == -1) {
            int i2 = f9843f + 109;
            f9844g = i2 % 128;
            int i3 = i2 % 2;
            i = 20;
        }
        int round = Math.round(((float) i) * m12372c());
        int i4 = f9843f + 13;
        f9844g = i4 % 128;
        if (!(i4 % 2 == 0)) {
            return round;
        }
        int i5 = 27 / 0;
        return round;
    }

    /* renamed from: b */
    static void m12316b(View view) {
        int i;
        int i2 = f9843f + 97;
        f9844g = i2 % 128;
        if ((i2 % 2 == 0 ? 'D' : 6) != 6) {
            i = m12327bH();
            int i3 = C29392.f9846b[m12396d(view.getContext(), i).ordinal()];
            int i4 = 43 / 0;
            if (i3 != 1) {
                if (i3 != 2) {
                    return;
                }
            }
            view.setBackgroundResource(i);
            int i5 = f9843f + 99;
            f9844g = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        i = m12327bH();
        int i7 = C29392.f9846b[m12396d(view.getContext(), i).ordinal()];
        if (i7 != 1) {
            if (i7 != 2) {
                return;
            }
        }
        view.setBackgroundResource(i);
        int i52 = f9843f + 99;
        f9844g = i52 % 128;
        int i62 = i52 % 2;
        return;
        view.setBackgroundColor(i);
        int i8 = f9844g + 63;
        f9843f = i8 % 128;
        int i9 = i8 % 2;
    }

    /* renamed from: k */
    static int m12435k(Context context) {
        int i = f9843f + 123;
        f9844g = i % 128;
        int i2 = i % 2;
        int b = m12312b(m12408e(context, m12327bH()), (int) C11051p3.f31759c);
        int i3 = f9843f + 83;
        f9844g = i3 % 128;
        int i4 = i3 % 2;
        return b;
    }

    /* renamed from: l */
    static int m12437l(Context context) {
        int i = f9843f + 69;
        f9844g = i % 128;
        if ((i % 2 == 0 ? 'N' : 'P') != 'N') {
            return m12408e(context, m12334bO());
        }
        int i2 = 49 / 0;
        return m12408e(context, m12334bO());
    }

    /* renamed from: o */
    static int m12444o(Context context) {
        int i = f9844g + 3;
        f9843f = i % 128;
        int i2 = i % 2;
        int b = m12312b(m12408e(context, m12325bF()), (int) C11051p3.f31759c);
        int i3 = f9844g + 115;
        f9843f = i3 % 128;
        if ((i3 % 2 != 0 ? '[' : ',') == ',') {
            return b;
        }
        throw null;
    }

    /* renamed from: r */
    static int m12450r(Context context) {
        int i = f9843f + 65;
        f9844g = i % 128;
        int i2 = i % 2;
        int e = m12408e(context, m12332bM());
        int i3 = f9844g + 51;
        f9843f = i3 % 128;
        if ((i3 % 2 != 0 ? 27 : 'J') == 'J') {
            return e;
        }
        throw null;
    }

    /* renamed from: w */
    private static int m12459w(Context context) {
        int i = f9843f + 49;
        f9844g = i % 128;
        int i2 = i % 2;
        int e = m12408e(context, m12320bA());
        int i3 = f9844g + 95;
        f9843f = i3 % 128;
        if ((i3 % 2 != 0 ? 'S' : '9') != 'S') {
            return e;
        }
        throw null;
    }

    /* JADX WARNING: type inference failed for: r5v13, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.graphics.drawable.GradientDrawable m12461x(android.content.Context r5) {
        /*
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            int r1 = m12338bS()
            int[] r2 = com.facetec.sdk.C2938dc.C29392.f9846b
            com.facetec.sdk.dc$a r3 = m12396d((android.content.Context) r5, (int) r1)
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 1
            r4 = 2
            if (r2 == r3) goto L_0x0020
            if (r2 == r4) goto L_0x001c
            goto L_0x003b
        L_0x001c:
            r0.setColor(r1)
            goto L_0x003b
        L_0x0020:
            android.graphics.drawable.Drawable r2 = androidx.core.content.C0767a.m2895e(r5, r1)
            boolean r2 = r2 instanceof android.graphics.drawable.GradientDrawable
            if (r2 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r3 = 0
        L_0x002a:
            if (r3 == 0) goto L_0x0034
            android.graphics.drawable.Drawable r5 = androidx.core.content.C0767a.m2895e(r5, r1)
            r0 = r5
            android.graphics.drawable.GradientDrawable r0 = (android.graphics.drawable.GradientDrawable) r0
            goto L_0x003b
        L_0x0034:
            int r5 = androidx.core.content.C0767a.m2893c(r5, r1)
            r0.setColor(r5)
        L_0x003b:
            if (r0 == 0) goto L_0x0058
            int r5 = m12368bw()
            float r5 = (float) r5
            float r1 = m12404e()
            float r5 = r5 * r1
            int r5 = (int) r5
            float r5 = com.facetec.sdk.C2810ax.m10988b((int) r5)
            r0.setCornerRadius(r5)
            int r5 = f9843f
            int r5 = r5 + 63
            int r1 = r5 % 128
            f9844g = r1
            int r5 = r5 % r4
        L_0x0058:
            int r5 = f9843f
            int r5 = r5 + 95
            int r1 = r5 % 128
            f9844g = r1
            int r5 = r5 % r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2938dc.m12461x(android.content.Context):android.graphics.drawable.GradientDrawable");
    }

    /* renamed from: d */
    private static C2940a m12396d(Context context, int i) {
        int i2 = f9843f + 103;
        f9844g = i2 % 128;
        int i3 = i2 % 2;
        long j = ((long) i) & 4294967295L;
        if ((j != 0 ? 'G' : 'H') == 'G') {
            if ((j > 16777215 ? '$' : '@') == '@') {
                try {
                    m12457v(context).getValue(i, new TypedValue(), true);
                    C2940a aVar = C2940a.RESOURCE;
                    int i4 = f9843f + 55;
                    f9844g = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 8 / 0;
                    }
                    return aVar;
                } catch (Exception unused) {
                    return C2940a.COLOR;
                }
            }
        }
        return C2940a.COLOR;
    }

    /* renamed from: i */
    static int m12426i(Context context) {
        int i = f9843f + 117;
        f9844g = i % 128;
        int i2 = i % 2;
        int e = m12408e(context, m12326bG());
        int i3 = f9844g + 115;
        f9843f = i3 % 128;
        if ((i3 % 2 != 0 ? '[' : 'V') != 'V') {
            int i4 = 47 / 0;
        }
        return e;
    }

    /* renamed from: j */
    static int m12432j(Context context) {
        int i = f9844g + 23;
        f9843f = i % 128;
        int i2 = i % 2;
        int e = m12408e(context, m12323bD());
        if (e == 0 ? true : true) {
            e = m12459w(context);
            int i3 = f9844g + 115;
            f9843f = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = f9844g + 1;
        f9843f = i5 % 128;
        if ((i5 % 2 != 0 ? (char) 18 : 27) == 27) {
            return e;
        }
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        if (com.facetec.sdk.FaceTecSDK.f8630e.f8598a == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (com.facetec.sdk.FaceTecSDK.f8630e.f8598a == false) goto L_0x003a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String m12438l(boolean r4) {
        /*
            int r0 = f9844g
            int r0 = r0 + 77
            int r1 = r0 % 128
            f9843f = r1
            int r0 = r0 % 2
            r1 = 4
            if (r0 == 0) goto L_0x0010
            r0 = 42
            goto L_0x0011
        L_0x0010:
            r0 = r1
        L_0x0011:
            if (r0 != r1) goto L_0x0054
            int r0 = com.facetec.sdk.C2747R.string.FaceTec_retry_your_image_label
            java.lang.String r0 = com.facetec.sdk.C2923cy.m12206b(r0)
            r1 = 20
            r2 = 0
            if (r4 == 0) goto L_0x0042
            int r4 = f9843f
            int r4 = r4 + 3
            int r3 = r4 % 128
            f9844g = r3
            int r4 = r4 % 2
            if (r4 != 0) goto L_0x0034
            com.facetec.sdk.FaceTecCustomization r4 = com.facetec.sdk.FaceTecSDK.f8630e
            boolean r4 = r4.f8598a
            r3 = 42
            int r3 = r3 / r2
            if (r4 != 0) goto L_0x0042
            goto L_0x003a
        L_0x0034:
            com.facetec.sdk.FaceTecCustomization r4 = com.facetec.sdk.FaceTecSDK.f8630e
            boolean r4 = r4.f8598a
            if (r4 != 0) goto L_0x0042
        L_0x003a:
            int r4 = r0.length()
            if (r4 <= r1) goto L_0x0042
            r4 = 1
            goto L_0x0043
        L_0x0042:
            r4 = r2
        L_0x0043:
            if (r4 == 0) goto L_0x0053
            int r4 = f9844g
            int r4 = r4 + 73
            int r3 = r4 % 128
            f9843f = r3
            int r4 = r4 % 2
            java.lang.String r0 = r0.substring(r2, r1)
        L_0x0053:
            return r0
        L_0x0054:
            int r4 = com.facetec.sdk.C2747R.string.FaceTec_retry_your_image_label
            com.facetec.sdk.C2923cy.m12206b(r4)
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2938dc.m12438l(boolean):java.lang.String");
    }

    /* renamed from: m */
    static int m12440m(Context context) {
        int i = f9843f + 9;
        f9844g = i % 128;
        int i2 = i % 2;
        int e = m12408e(context, m12329bJ());
        int i3 = f9844g + 85;
        f9843f = i3 % 128;
        if ((i3 % 2 != 0 ? '^' : '2') != '^') {
            return e;
        }
        throw null;
    }

    /* renamed from: n */
    static int m12442n(Context context) {
        int i;
        int i2 = f9844g + 83;
        f9843f = i2 % 128;
        boolean z = true;
        if (i2 % 2 != 0) {
            i = m12408e(context, m12333bN());
            int i3 = 40 / 0;
        } else {
            i = m12408e(context, m12333bN());
        }
        int i4 = f9843f + 55;
        f9844g = i4 % 128;
        if (i4 % 2 != 0) {
            z = false;
        }
        if (z) {
            int i5 = 65 / 0;
        }
        return i;
    }

    /* renamed from: q */
    static Drawable m12448q(Context context) {
        int K = m12232K();
        boolean z = true;
        if (C29392.f9846b[m12396d(context, K).ordinal()] == 1) {
            if (C0767a.m2895e(context, K) != null) {
                Drawable mutate = C0767a.m2895e(context, K).mutate();
                if (mutate instanceof ShapeDrawable) {
                    ((ShapeDrawable) mutate).getPaint().setAlpha(C11051p3.f31759c);
                    return mutate;
                }
                if (mutate instanceof GradientDrawable) {
                    z = false;
                }
                if (!z) {
                    return m12375c(context, (GradientDrawable) mutate);
                }
                if (mutate instanceof ColorDrawable) {
                    int i = f9844g + 93;
                    f9843f = i % 128;
                    if (i % 2 != 0) {
                        mutate.setAlpha(31894);
                        return mutate;
                    }
                    mutate.setAlpha(C11051p3.f31759c);
                    return mutate;
                }
                int i2 = f9844g + 83;
                f9843f = i2 % 128;
                int i3 = i2 % 2;
            } else {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(m12312b(C0767a.m2893c(context, K), (int) C11051p3.f31759c));
                return gradientDrawable;
            }
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(m12312b(K, (int) C11051p3.f31759c));
        return gradientDrawable2;
    }

    /* renamed from: s */
    static int m12452s(Context context) {
        int i = f9844g + 113;
        f9843f = i % 128;
        if (!(i % 2 != 0)) {
            return m12408e(context, m12335bP());
        }
        int i2 = 86 / 0;
        return m12408e(context, m12335bP());
    }

    /* renamed from: t */
    static int m12454t(Context context) {
        int i = f9844g + 107;
        f9843f = i % 128;
        if ((i % 2 != 0 ? 14 : 'W') != 14) {
            return m12408e(context, m12339bT());
        }
        int i2 = 36 / 0;
        return m12408e(context, m12339bT());
    }

    /* renamed from: i */
    static void m12429i(View view) {
        int i = f9843f + 79;
        f9844g = i % 128;
        int i2 = i % 2;
        m12255a(view, m12344bY());
        int i3 = f9844g + 53;
        f9843f = i3 % 128;
        if ((i3 % 2 != 0 ? '>' : '1') == '>') {
            throw null;
        }
    }

    /* renamed from: p */
    static int m12446p(Context context) {
        int i = f9844g + 75;
        f9843f = i % 128;
        int i2 = i % 2;
        int e = m12408e(context, m12328bI());
        int i3 = f9844g + 103;
        f9843f = i3 % 128;
        int i4 = i3 % 2;
        return e;
    }

    /* renamed from: a */
    static int m12248a(Context context) {
        int i = f9843f + 105;
        f9844g = i % 128;
        int i2 = i % 2;
        int e = m12408e(context, m12389cd());
        int i3 = f9843f + 87;
        f9844g = i3 % 128;
        if (!(i3 % 2 == 0)) {
            return e;
        }
        throw null;
    }

    /* renamed from: i */
    static void m12430i(TextView textView) {
        int i = f9844g + 15;
        f9843f = i % 128;
        int i2 = i % 2;
        m12257a(textView, m12387cb());
        int i3 = f9844g + 117;
        f9843f = i3 % 128;
        int i4 = i3 % 2;
    }

    /* renamed from: a */
    static void m12254a(View view) {
        int bz = m12371bz();
        int i = C29392.f9846b[m12396d(view.getContext(), bz).ordinal()];
        boolean z = true;
        if (i == 1) {
            view.setBackgroundResource(bz);
            int i2 = f9843f + 29;
            f9844g = i2 % 128;
            int i3 = i2 % 2;
        } else if (i != 2) {
            view.setBackgroundColor(0);
            int i4 = f9843f + 11;
            f9844g = i4 % 128;
            if (i4 % 2 != 0) {
                z = false;
            }
            if (z) {
                throw null;
            }
        } else {
            view.setBackgroundColor(bz);
        }
    }

    /* renamed from: e */
    private static int m12406e(int i, int i2) {
        int i3 = f9843f + 37;
        int i4 = i3 % 128;
        f9844g = i4;
        if (i3 % 2 != 0) {
            if ((i != 0 ? 'Q' : '<') != 'Q') {
                return i2;
            }
            int i5 = i4 + 101;
            f9843f = i5 % 128;
            int i6 = i5 % 2;
            return i;
        }
        throw null;
    }

    /* renamed from: h */
    static void m12424h(View view) {
        int i = f9844g + 39;
        f9843f = i % 128;
        int i2 = i % 2;
        m12255a(view, m12370by());
        int i3 = f9844g + 25;
        f9843f = i3 % 128;
        if (!(i3 % 2 == 0)) {
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        if (r0.length() > 40) goto L_0x0042;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String m12433j(boolean r4) {
        /*
            int r0 = f9843f
            int r0 = r0 + 53
            int r1 = r0 % 128
            f9844g = r1
            int r0 = r0 % 2
            int r0 = com.facetec.sdk.C2747R.string.FaceTec_retry_instruction_message_3
            java.lang.String r0 = com.facetec.sdk.C2923cy.m12206b(r0)
            r1 = 40
            r2 = 0
            if (r4 == 0) goto L_0x0041
            int r4 = f9843f
            int r4 = r4 + 67
            int r3 = r4 % 128
            f9844g = r3
            int r4 = r4 % 2
            r3 = 77
            if (r4 != 0) goto L_0x0025
            r4 = r1
            goto L_0x0026
        L_0x0025:
            r4 = r3
        L_0x0026:
            if (r4 != r3) goto L_0x003b
            com.facetec.sdk.FaceTecCustomization r4 = com.facetec.sdk.FaceTecSDK.f8630e
            boolean r4 = r4.f8598a
            r3 = 1
            if (r4 != 0) goto L_0x0031
            r4 = r3
            goto L_0x0032
        L_0x0031:
            r4 = r2
        L_0x0032:
            if (r4 == 0) goto L_0x0041
            int r4 = r0.length()
            if (r4 <= r1) goto L_0x0041
            goto L_0x0042
        L_0x003b:
            com.facetec.sdk.FaceTecCustomization r4 = com.facetec.sdk.FaceTecSDK.f8630e
            boolean r4 = r4.f8598a
            r4 = 0
            throw r4
        L_0x0041:
            r3 = r2
        L_0x0042:
            if (r3 == 0) goto L_0x0052
            int r4 = f9843f
            int r4 = r4 + 15
            int r3 = r4 % 128
            f9844g = r3
            int r4 = r4 % 2
            java.lang.String r0 = r0.substring(r2, r1)
        L_0x0052:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2938dc.m12433j(boolean):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        if ((r0 != 0) != true) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        if (r0 == 0) goto L_0x0033;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m12407e(android.content.Context r4) {
        /*
            int r0 = f9844g
            int r0 = r0 + 63
            int r1 = r0 % 128
            f9843f = r1
            int r0 = r0 % 2
            r1 = 14
            if (r0 == 0) goto L_0x0011
            r0 = 93
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L_0x0024
            com.facetec.sdk.FaceTecCustomization r0 = m12363br()
            com.facetec.sdk.FaceTecIDScanCustomization r0 = r0.f8605h
            int r0 = r0.faceMatchToIDBrandingImage
            r1 = 45
            int r1 = r1 / r2
            if (r0 != 0) goto L_0x0043
            goto L_0x0033
        L_0x0024:
            com.facetec.sdk.FaceTecCustomization r0 = m12363br()
            com.facetec.sdk.FaceTecIDScanCustomization r0 = r0.f8605h
            int r0 = r0.faceMatchToIDBrandingImage
            if (r0 != 0) goto L_0x0030
            r1 = r2
            goto L_0x0031
        L_0x0030:
            r1 = r3
        L_0x0031:
            if (r1 == r3) goto L_0x0043
        L_0x0033:
            int r0 = f9843f
            int r0 = r0 + 101
            int r1 = r0 % 128
            f9844g = r1
            int r0 = r0 % 2
            com.facetec.sdk.FaceTecCustomization r0 = com.facetec.sdk.FaceTecSDK.f8630e
            com.facetec.sdk.FaceTecIDScanCustomization r0 = r0.f8605h
            int r0 = r0.faceMatchToIDBrandingImage
        L_0x0043:
            if (r0 != 0) goto L_0x0046
            r2 = r3
        L_0x0046:
            if (r2 == r3) goto L_0x0049
            goto L_0x0059
        L_0x0049:
            android.content.res.Resources r0 = r4.getResources()
            java.lang.String r1 = "drawable"
            java.lang.String r4 = r4.getPackageName()
            java.lang.String r2 = "facetec_face_match_to_id_branding_logo"
            int r0 = r0.getIdentifier(r2, r1, r4)
        L_0x0059:
            if (r0 != 0) goto L_0x005d
            int r0 = com.facetec.sdk.C2747R.C2748drawable.facetec_internal_id_scan_watermark
        L_0x005d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2938dc.m12407e(android.content.Context):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        if ((r0.length() > 40) != true) goto L_0x002c;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String m12420g(boolean r5) {
        /*
            int r0 = com.facetec.sdk.C2747R.string.FaceTec_retry_instruction_message_2
            java.lang.String r0 = com.facetec.sdk.C2923cy.m12206b(r0)
            r1 = 1
            r2 = 0
            if (r5 == 0) goto L_0x000c
            r5 = r1
            goto L_0x000d
        L_0x000c:
            r5 = r2
        L_0x000d:
            r3 = 40
            if (r5 == 0) goto L_0x002c
            com.facetec.sdk.FaceTecCustomization r5 = com.facetec.sdk.FaceTecSDK.f8630e
            boolean r5 = r5.f8598a
            if (r5 != 0) goto L_0x002c
            int r5 = f9843f
            int r5 = r5 + 93
            int r4 = r5 % 128
            f9844g = r4
            int r5 = r5 % 2
            int r5 = r0.length()
            if (r5 <= r3) goto L_0x0029
            r5 = r1
            goto L_0x002a
        L_0x0029:
            r5 = r2
        L_0x002a:
            if (r5 == r1) goto L_0x002d
        L_0x002c:
            r1 = r2
        L_0x002d:
            if (r1 == 0) goto L_0x004e
            int r5 = f9843f
            int r5 = r5 + 17
            int r1 = r5 % 128
            f9844g = r1
            int r5 = r5 % 2
            r1 = 70
            if (r5 != 0) goto L_0x003f
            r5 = r1
            goto L_0x0041
        L_0x003f:
            r5 = 23
        L_0x0041:
            if (r5 == r1) goto L_0x0048
            java.lang.String r0 = r0.substring(r2, r3)
            goto L_0x004e
        L_0x0048:
            r5 = 126(0x7e, float:1.77E-43)
            java.lang.String r0 = r0.substring(r2, r5)
        L_0x004e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2938dc.m12420g(boolean):java.lang.String");
    }

    /* renamed from: h */
    static void m12425h(TextView textView) {
        int i = f9843f + 69;
        f9844g = i % 128;
        int i2 = i % 2;
        m12257a(textView, m12342bW());
        int i3 = f9843f + 117;
        f9844g = i3 % 128;
        if ((i3 % 2 == 0 ? 'Y' : '.') == 'Y') {
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String m12428i(boolean r5) {
        /*
            com.facetec.sdk.FaceTecCustomization r0 = com.facetec.sdk.FaceTecSDK.f8630e
            com.facetec.sdk.FaceTecGuidanceCustomization r0 = r0.f8606i
            java.lang.String r0 = r0.retryScreenSubtextAttributedString
            boolean r1 = r0.isEmpty()
            r2 = 1
            if (r1 == 0) goto L_0x0026
            int r0 = f9843f
            int r0 = r0 + r2
            int r1 = r0 % 128
            f9844g = r1
            int r0 = r0 % 2
            int r0 = com.facetec.sdk.C2747R.string.FaceTec_retry_subheader_message
            java.lang.String r0 = com.facetec.sdk.C2923cy.m12206b(r0)
            int r1 = f9843f
            int r1 = r1 + 55
            int r3 = r1 % 128
            f9844g = r3
            int r1 = r1 % 2
        L_0x0026:
            r1 = 40
            r3 = 0
            if (r5 == 0) goto L_0x004f
            com.facetec.sdk.FaceTecCustomization r5 = com.facetec.sdk.FaceTecSDK.f8630e
            boolean r5 = r5.f8598a
            if (r5 != 0) goto L_0x0033
            r5 = r2
            goto L_0x0034
        L_0x0033:
            r5 = r3
        L_0x0034:
            if (r5 == 0) goto L_0x004f
            int r5 = r0.length()
            r4 = 29
            if (r5 <= r1) goto L_0x0041
            r5 = 42
            goto L_0x0042
        L_0x0041:
            r5 = r4
        L_0x0042:
            if (r5 == r4) goto L_0x004f
            int r5 = f9844g
            int r5 = r5 + 67
            int r4 = r5 % 128
            f9843f = r4
            int r5 = r5 % 2
            goto L_0x0050
        L_0x004f:
            r2 = r3
        L_0x0050:
            if (r2 == 0) goto L_0x0056
            java.lang.String r0 = r0.substring(r3, r1)
        L_0x0056:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2938dc.m12428i(boolean):java.lang.String");
    }

    /* renamed from: d */
    private static int m12394d(int i) {
        if ((FaceTecSDK.f8628c == FaceTecSDK.C2744a.LOW_LIGHT ? 15 : ']') != 15) {
            if ((FaceTecSDK.f8628c == FaceTecSDK.C2744a.BRIGHT_LIGHT ? '.' : 'S') != '.') {
                return i;
            }
            int i2 = f9844g + 25;
            f9843f = i2 % 128;
            int i3 = i2 % 2;
            return -16777216;
        }
        int i4 = f9844g + 29;
        f9843f = i4 % 128;
        if ((i4 % 2 != 0 ? 'U' : '*') == '*') {
            return -1;
        }
        throw null;
    }

    /* renamed from: f */
    static int m12416f(Context context) {
        int e = m12408e(context, m12322bC());
        if ((e == 0 ? 2 : ']') == 2) {
            int i = f9843f + 35;
            f9844g = i % 128;
            if (i % 2 != 0) {
                e = m12459w(context);
                int i2 = f9844g + 19;
                f9843f = i2 % 128;
                int i3 = i2 % 2;
            } else {
                m12459w(context);
                throw null;
            }
        }
        int i4 = f9844g + 115;
        f9843f = i4 % 128;
        int i5 = i4 % 2;
        return e;
    }

    /* renamed from: b */
    static void m12317b(TextView textView) {
        int i = f9843f + 39;
        f9844g = i % 128;
        int i2 = i % 2;
        m12257a(textView, m12231J());
        int i3 = f9844g + 65;
        f9843f = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        if ((!com.facetec.sdk.FaceTecSDK.f8630e.f8598a) != true) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (com.facetec.sdk.FaceTecSDK.f8630e.f8598a == false) goto L_0x0036;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String m12423h(boolean r5) {
        /*
            int r0 = com.facetec.sdk.C2747R.string.FaceTec_retry_instruction_message_1
            java.lang.String r0 = com.facetec.sdk.C2923cy.m12206b(r0)
            r1 = 40
            r2 = 1
            r3 = 0
            if (r5 == 0) goto L_0x0050
            int r5 = f9843f
            int r5 = r5 + 117
            int r4 = r5 % 128
            f9844g = r4
            int r5 = r5 % 2
            r4 = 24
            if (r5 != 0) goto L_0x001c
            r5 = r4
            goto L_0x001e
        L_0x001c:
            r5 = 80
        L_0x001e:
            if (r5 == r4) goto L_0x0027
            com.facetec.sdk.FaceTecCustomization r5 = com.facetec.sdk.FaceTecSDK.f8630e
            boolean r5 = r5.f8598a
            if (r5 != 0) goto L_0x0050
            goto L_0x0036
        L_0x0027:
            com.facetec.sdk.FaceTecCustomization r5 = com.facetec.sdk.FaceTecSDK.f8630e
            boolean r5 = r5.f8598a
            r4 = 57
            int r4 = r4 / r3
            if (r5 != 0) goto L_0x0032
            r5 = r2
            goto L_0x0033
        L_0x0032:
            r5 = r3
        L_0x0033:
            if (r5 == r2) goto L_0x0036
            goto L_0x0050
        L_0x0036:
            int r5 = r0.length()
            r4 = 57
            if (r5 <= r1) goto L_0x0041
            r5 = 17
            goto L_0x0042
        L_0x0041:
            r5 = r4
        L_0x0042:
            if (r5 == r4) goto L_0x0050
            int r5 = f9844g
            int r5 = r5 + 67
            int r4 = r5 % 128
            f9843f = r4
            int r5 = r5 % 2
            r5 = r2
            goto L_0x0051
        L_0x0050:
            r5 = r3
        L_0x0051:
            if (r5 == 0) goto L_0x0054
            goto L_0x0055
        L_0x0054:
            r2 = r3
        L_0x0055:
            if (r2 == 0) goto L_0x005b
            java.lang.String r0 = r0.substring(r3, r1)
        L_0x005b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2938dc.m12423h(boolean):java.lang.String");
    }

    /* renamed from: a */
    private static int m12249a(Context context, int[] iArr) {
        int i;
        if ((iArr != null ? 'S' : 'J') != 'S') {
            return C11051p3.f31759c;
        }
        int i2 = f9844g + 75;
        f9843f = i2 % 128;
        int i3 = i2 % 2;
        int length = iArr.length;
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i4 >= length) {
                break;
            }
            int i6 = f9844g + 91;
            f9843f = i6 % 128;
            int i7 = i6 % 2;
            int i8 = iArr[i4];
            int i9 = C29392.f9846b[m12396d(context, i8).ordinal()];
            if (i9 == 1) {
                i = C0767a.m2893c(context, i8) >> 24;
            } else if (i9 != 2) {
                i4++;
            } else {
                i = i8 >> 24;
            }
            i5 += i & C11051p3.f31759c;
            i4++;
        }
        int length2 = i5 / iArr.length;
        int i12 = f9843f + 87;
        f9844g = i12 % 128;
        if (i12 % 2 == 0) {
            z = true;
        }
        if (!z) {
            return length2;
        }
        throw null;
    }

    /* renamed from: b */
    static void m12315b(Context context, TextView textView, Drawable drawable, int i) {
        int i2 = C29392.f9846b[m12396d(textView.getContext(), i).ordinal()];
        boolean z = false;
        if (i2 == 1) {
            if (!(drawable instanceof ShapeDrawable)) {
                if (drawable instanceof GradientDrawable) {
                    z = true;
                }
                if (z) {
                    ((GradientDrawable) drawable).setColor(C0767a.m2893c(context, i));
                } else if (drawable instanceof ColorDrawable) {
                    int i3 = f9843f + 91;
                    f9844g = i3 % 128;
                    int i4 = i3 % 2;
                    ((ColorDrawable) drawable).setColor(C0767a.m2893c(context, i));
                }
            } else {
                ((ShapeDrawable) drawable).getPaint().setColor(C0767a.m2893c(context, i));
                int i5 = f9844g + 75;
                f9843f = i5 % 128;
                int i6 = i5 % 2;
            }
        } else if (i2 == 2) {
            if (drawable instanceof ShapeDrawable) {
                ((ShapeDrawable) drawable).getPaint().setColor(i);
                return;
            }
            if (!(drawable instanceof GradientDrawable)) {
                if (!(drawable instanceof ColorDrawable)) {
                    z = true;
                }
                if (!z) {
                    ((ColorDrawable) drawable).setColor(i);
                    return;
                }
                return;
            }
            int i7 = f9844g + 37;
            f9843f = i7 % 128;
            char c = i7 % 2 != 0 ? '/' : 12;
            ((GradientDrawable) drawable).setColor(i);
            if (c != 12) {
                int i8 = 41 / 0;
            }
        }
    }

    /* renamed from: d */
    static int m12395d(Context context) {
        int i;
        int i2 = f9844g + 15;
        f9843f = i2 % 128;
        int i3 = i2 % 2;
        boolean z = true;
        if (FaceTecSDK.f8630e.f8599b) {
            i = m12363br().f8605h.standaloneIDScanWatermark;
            if (!(i != 0)) {
                i = FaceTecSDK.f8630e.f8605h.standaloneIDScanWatermark;
            }
            if (i == 0) {
                int i4 = f9843f + 57;
                f9844g = i4 % 128;
                int i5 = i4 % 2;
                i = context.getResources().getIdentifier("facetec_standalone_id_scan_watermark", "drawable", context.getPackageName());
            }
        } else {
            i = 0;
        }
        if (i == 0) {
            int i6 = f9843f + 23;
            f9844g = i6 % 128;
            if (i6 % 2 != 0) {
                z = false;
            }
            i = C2747R.C2748drawable.facetec_internal_id_scan_watermark;
            if (z) {
                int i7 = 7 / 0;
            }
        }
        int i8 = f9844g + 125;
        f9843f = i8 % 128;
        int i9 = i8 % 2;
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String m12417f(boolean r5) {
        /*
            int r0 = com.facetec.sdk.C2747R.string.FaceTec_retry_ideal_image_label
            java.lang.String r0 = com.facetec.sdk.C2923cy.m12206b(r0)
            r1 = 20
            r2 = 1
            r3 = 0
            if (r5 == 0) goto L_0x0037
            int r5 = f9844g
            int r5 = r5 + 39
            int r4 = r5 % 128
            f9843f = r4
            int r5 = r5 % 2
            com.facetec.sdk.FaceTecCustomization r5 = com.facetec.sdk.FaceTecSDK.f8630e
            boolean r5 = r5.f8598a
            r4 = 40
            if (r5 != 0) goto L_0x0020
            r5 = r4
            goto L_0x0022
        L_0x0020:
            r5 = 15
        L_0x0022:
            if (r5 == r4) goto L_0x0025
            goto L_0x0037
        L_0x0025:
            int r5 = f9844g
            int r5 = r5 + 3
            int r4 = r5 % 128
            f9843f = r4
            int r5 = r5 % 2
            int r5 = r0.length()
            if (r5 <= r1) goto L_0x0037
            r5 = r2
            goto L_0x0038
        L_0x0037:
            r5 = r3
        L_0x0038:
            if (r5 == 0) goto L_0x003b
            r2 = r3
        L_0x003b:
            if (r2 == 0) goto L_0x003e
            goto L_0x0042
        L_0x003e:
            java.lang.String r0 = r0.substring(r3, r1)
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2938dc.m12417f(boolean):java.lang.String");
    }

    /* renamed from: e */
    static void m12413e(TextView textView) {
        int i = f9843f + 31;
        f9844g = i % 128;
        if ((i % 2 == 0 ? '_' : '8') != '_') {
            textView.getContext();
            m12257a(textView, m12320bA());
            return;
        }
        textView.getContext();
        m12257a(textView, m12320bA());
        int i2 = 68 / 0;
    }

    /* renamed from: a */
    private static void m12255a(View view, int i) {
        int i2 = C29392.f9846b[m12396d(view.getContext(), i).ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                view.setBackgroundColor(m12312b(i, (int) C11051p3.f31759c));
            }
        } else if (C0767a.m2895e(view.getContext(), i) != null) {
            int i3 = f9843f + 93;
            f9844g = i3 % 128;
            int i4 = i3 % 2;
            Drawable mutate = C0767a.m2895e(view.getContext(), i).mutate();
            char c = '?';
            if ((mutate instanceof ShapeDrawable ? 'M' : '?') != '?') {
                int i5 = f9844g + 27;
                f9843f = i5 % 128;
                if (i5 % 2 != 0) {
                    c = ':';
                }
                Paint paint = ((ShapeDrawable) mutate).getPaint();
                if (c != ':') {
                    paint.setAlpha(C11051p3.f31759c);
                } else {
                    paint.setAlpha(8256);
                }
            } else if (mutate instanceof GradientDrawable) {
                mutate = m12375c(view.getContext(), (GradientDrawable) mutate);
            } else {
                if (!(!(mutate instanceof ColorDrawable))) {
                    mutate.setAlpha(C11051p3.f31759c);
                }
            }
            view.setBackground(mutate);
        } else {
            view.setBackgroundColor(m12312b(C0767a.m2893c(view.getContext(), i), (int) C11051p3.f31759c));
        }
    }

    /* renamed from: d */
    static void m12400d(View view) {
        int Q = m12238Q();
        int i = C29392.f9846b[m12396d(view.getContext(), Q).ordinal()];
        if (i == 1) {
            view.setBackgroundColor(C0767a.m2893c(view.getContext(), Q));
            int i2 = f9843f + 119;
            f9844g = i2 % 128;
            if ((i2 % 2 == 0 ? 5 : 'X') != 'X') {
                throw null;
            }
        } else if (i != 2) {
            view.setBackgroundColor(0);
        } else {
            view.setBackgroundColor(Q);
            int i3 = f9844g + 113;
            f9843f = i3 % 128;
            if ((i3 % 2 != 0 ? 7 : ':') == 7) {
                throw null;
            }
        }
    }

    /* renamed from: e */
    static void m12412e(View view) {
        int i = f9843f + 25;
        f9844g = i % 128;
        if (i % 2 != 0) {
            int K = m12232K();
            int i2 = C29392.f9846b[m12396d(view.getContext(), K).ordinal()];
            boolean z = true;
            if (i2 == 1) {
                view.setBackgroundResource(K);
            } else if (i2 != 2) {
                view.setBackgroundColor(0);
                int i3 = f9844g + 59;
                f9843f = i3 % 128;
                if ((i3 % 2 != 0 ? 12 : '(') != '(') {
                    throw null;
                }
            } else {
                view.setBackgroundColor(K);
                int i4 = f9843f + 33;
                f9844g = i4 % 128;
                if (i4 % 2 != 0) {
                    z = false;
                }
                if (z) {
                    int i5 = 16 / 0;
                }
            }
        } else {
            int i6 = C29392.f9846b[m12396d(view.getContext(), m12232K()).ordinal()];
            throw null;
        }
    }

    /* renamed from: b */
    static int m12312b(int i, int i2) {
        int i3 = f9844g + 43;
        f9843f = i3 % 128;
        if (!(i3 % 2 != 0)) {
            int argb = Color.argb(i2, Color.red(i), Color.green(i), Color.blue(i));
            int i4 = f9843f + 43;
            f9844g = i4 % 128;
            if (!(i4 % 2 != 0)) {
                int i5 = 92 / 0;
            }
            return argb;
        }
        Color.argb(i2, Color.red(i), Color.green(i), Color.blue(i));
        throw null;
    }

    /* renamed from: d */
    static void m12402d(TextView textView) {
        int i = f9843f + 101;
        f9844g = i % 128;
        int i2 = i % 2;
        m12257a(textView, m12343bX());
        int i3 = f9844g + 83;
        f9843f = i3 % 128;
        if (!(i3 % 2 == 0)) {
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        if ((r6 instanceof android.graphics.drawable.ColorDrawable) == false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        r1 = 17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        r1 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        if (r1 == 3) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        r2 = r2 + 53;
        f9843f = r2 % 128;
        r2 = r2 % 2;
        ((android.graphics.drawable.ColorDrawable) r6).setColor(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0040, code lost:
        if ((r6 instanceof android.graphics.drawable.ShapeDrawable) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
        if (r3 == false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0046, code lost:
        r0 = r0 + 69;
        f9844g = r0 % 128;
        r0 = r0 % 2;
        ((android.graphics.drawable.ShapeDrawable) r6).getPaint().setColor(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if ((r6 instanceof android.graphics.drawable.GradientDrawable) != false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if ((r6 instanceof android.graphics.drawable.GradientDrawable) != false) goto L_0x001f;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m12411e(android.graphics.drawable.Drawable r6, int r7) {
        /*
            int r0 = f9843f
            int r1 = r0 + 17
            int r2 = r1 % 128
            f9844g = r2
            int r1 = r1 % 2
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L_0x0016
            boolean r1 = r6 instanceof android.graphics.drawable.GradientDrawable
            r5 = 77
            int r5 = r5 / r4
            if (r1 == 0) goto L_0x0025
            goto L_0x001f
        L_0x0016:
            boolean r1 = r6 instanceof android.graphics.drawable.GradientDrawable
            if (r1 == 0) goto L_0x001c
            r1 = r3
            goto L_0x001d
        L_0x001c:
            r1 = r4
        L_0x001d:
            if (r1 == 0) goto L_0x0025
        L_0x001f:
            android.graphics.drawable.GradientDrawable r6 = (android.graphics.drawable.GradientDrawable) r6
            r6.setColor(r7)
            return
        L_0x0025:
            boolean r1 = r6 instanceof android.graphics.drawable.ColorDrawable
            r5 = 3
            if (r1 == 0) goto L_0x002d
            r1 = 17
            goto L_0x002e
        L_0x002d:
            r1 = r5
        L_0x002e:
            if (r1 == r5) goto L_0x003e
            int r2 = r2 + 53
            int r0 = r2 % 128
            f9843f = r0
            int r2 = r2 % 2
            android.graphics.drawable.ColorDrawable r6 = (android.graphics.drawable.ColorDrawable) r6
            r6.setColor(r7)
            return
        L_0x003e:
            boolean r1 = r6 instanceof android.graphics.drawable.ShapeDrawable
            if (r1 == 0) goto L_0x0043
            r3 = r4
        L_0x0043:
            if (r3 == 0) goto L_0x0046
            goto L_0x0057
        L_0x0046:
            int r0 = r0 + 69
            int r1 = r0 % 128
            f9844g = r1
            int r0 = r0 % 2
            android.graphics.drawable.ShapeDrawable r6 = (android.graphics.drawable.ShapeDrawable) r6
            android.graphics.Paint r6 = r6.getPaint()
            r6.setColor(r7)
        L_0x0057:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2938dc.m12411e(android.graphics.drawable.Drawable, int):void");
    }

    /* renamed from: a */
    static void m12256a(TextView textView) {
        int i = f9844g + 57;
        f9843f = i % 128;
        int i2 = i % 2;
        m12257a(textView, m12337bR());
        int i3 = f9844g + 97;
        f9843f = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m12399d(android.content.Context r4, android.widget.TextView r5, android.graphics.drawable.Drawable r6, int r7, int r8, double r9) {
        /*
            int r0 = f9843f
            int r0 = r0 + 87
            int r1 = r0 % 128
            f9844g = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x0010
            r0 = r2
            goto L_0x0011
        L_0x0010:
            r0 = r3
        L_0x0011:
            if (r0 == 0) goto L_0x0028
            int[] r0 = com.facetec.sdk.C2938dc.C29392.f9846b
            android.content.Context r5 = r5.getContext()
            com.facetec.sdk.dc$a r5 = m12396d((android.content.Context) r5, (int) r7)
            int r5 = r5.ordinal()
            r5 = r0[r5]
            if (r5 == r3) goto L_0x0056
            if (r5 == r1) goto L_0x003f
            goto L_0x005e
        L_0x0028:
            int[] r0 = com.facetec.sdk.C2938dc.C29392.f9846b
            android.content.Context r5 = r5.getContext()
            com.facetec.sdk.dc$a r5 = m12396d((android.content.Context) r5, (int) r7)
            int r5 = r5.ordinal()
            r5 = r0[r5]
            r0 = 2
            int r0 = r0 / r2
            if (r5 == r3) goto L_0x0056
            if (r5 == r1) goto L_0x003f
            goto L_0x005e
        L_0x003f:
            boolean r4 = r6 instanceof android.graphics.drawable.GradientDrawable
            if (r4 == 0) goto L_0x005e
            int r4 = f9843f
            int r4 = r4 + 77
            int r5 = r4 % 128
            f9844g = r5
            int r4 = r4 % r1
            android.graphics.drawable.GradientDrawable r6 = (android.graphics.drawable.GradientDrawable) r6
            r6.setStroke(r8, r7)
            float r4 = (float) r9
            r6.setCornerRadius(r4)
            goto L_0x005e
        L_0x0056:
            boolean r5 = r6 instanceof android.graphics.drawable.GradientDrawable
            if (r5 == 0) goto L_0x005b
            goto L_0x005c
        L_0x005b:
            r2 = r3
        L_0x005c:
            if (r2 == 0) goto L_0x005f
        L_0x005e:
            return
        L_0x005f:
            android.graphics.drawable.GradientDrawable r6 = (android.graphics.drawable.GradientDrawable) r6
            int r4 = androidx.core.content.C0767a.m2893c(r4, r7)
            r6.setStroke(r8, r4)
            float r4 = (float) r9
            r6.setCornerRadius(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2938dc.m12399d(android.content.Context, android.widget.TextView, android.graphics.drawable.Drawable, int, int, double):void");
    }

    /* renamed from: a */
    static void m12257a(TextView textView, int i) {
        int i2 = f9843f + 107;
        f9844g = i2 % 128;
        if ((i2 % 2 == 0 ? '\'' : 'I') == 'I') {
            int i3 = C29392.f9846b[m12396d(textView.getContext(), i).ordinal()];
            if (i3 == 1) {
                textView.setTextColor(C0767a.m2893c(textView.getContext(), i));
                int i4 = f9843f + 107;
                f9844g = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
            } else if (i3 == 2) {
                textView.setTextColor(i);
            }
        } else {
            int i5 = C29392.f9846b[m12396d(textView.getContext(), i).ordinal()];
            throw null;
        }
    }

    /* renamed from: b */
    static void m12318b(TextView textView, String str) {
        int i = f9844g + 39;
        f9843f = i % 128;
        int i2 = i % 2;
        String replace = str.replace("\n", "<br/>");
        if ((Build.VERSION.SDK_INT >= 24 ? '4' : '1') != '4') {
            textView.setText(Html.fromHtml(replace));
            int i3 = f9843f + 7;
            f9844g = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        int i4 = f9843f + 57;
        f9844g = i4 % 128;
        textView.setText(i4 % 2 == 0 ? Html.fromHtml(replace, 74) : Html.fromHtml(replace, 63));
    }

    /* renamed from: e */
    static int m12405e(int i, float f) {
        int i2 = f9843f + 105;
        f9844g = i2 % 128;
        int argb = Color.argb(Math.round((i2 % 2 == 0 ? 21 : 'W') != 21 ? ((float) Color.alpha(i)) * f : ((float) Color.alpha(i)) % f), Color.red(i), Color.green(i), Color.blue(i));
        int i3 = f9843f + 11;
        f9844g = i3 % 128;
        int i4 = i3 % 2;
        return argb;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        ((android.graphics.drawable.ShapeDrawable) r3).getPaint().setColor(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if ((r3 instanceof android.graphics.drawable.ShapeDrawable) != false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if ((r3 instanceof android.graphics.drawable.ShapeDrawable ? 'c' : '=') != 'c') goto L_0x0021;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m12253a(android.graphics.drawable.Drawable r3, int r4) {
        /*
            int r0 = f9844g
            int r1 = r0 + 25
            int r2 = r1 % 128
            f9843f = r2
            int r1 = r1 % 2
            if (r1 == 0) goto L_0x0015
            boolean r1 = r3 instanceof android.graphics.drawable.ShapeDrawable
            r2 = 59
            int r2 = r2 / 0
            if (r1 == 0) goto L_0x0021
            goto L_0x0045
        L_0x0015:
            boolean r1 = r3 instanceof android.graphics.drawable.ShapeDrawable
            r2 = 99
            if (r1 == 0) goto L_0x001d
            r1 = r2
            goto L_0x001f
        L_0x001d:
            r1 = 61
        L_0x001f:
            if (r1 == r2) goto L_0x0045
        L_0x0021:
            boolean r1 = r3 instanceof android.graphics.drawable.GradientDrawable
            r2 = 69
            if (r1 == 0) goto L_0x002a
            r1 = 82
            goto L_0x002b
        L_0x002a:
            r1 = r2
        L_0x002b:
            if (r1 == r2) goto L_0x0033
            android.graphics.drawable.GradientDrawable r3 = (android.graphics.drawable.GradientDrawable) r3
            r3.setColor(r4)
            return
        L_0x0033:
            boolean r1 = r3 instanceof android.graphics.drawable.ColorDrawable
            if (r1 == 0) goto L_0x0044
            int r0 = r0 + 17
            int r1 = r0 % 128
            f9843f = r1
            int r0 = r0 % 2
            android.graphics.drawable.ColorDrawable r3 = (android.graphics.drawable.ColorDrawable) r3
            r3.setColor(r4)
        L_0x0044:
            return
        L_0x0045:
            android.graphics.drawable.ShapeDrawable r3 = (android.graphics.drawable.ShapeDrawable) r3
            android.graphics.Paint r3 = r3.getPaint()
            r3.setColor(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2938dc.m12253a(android.graphics.drawable.Drawable, int):void");
    }

    /* renamed from: d */
    static void m12401d(Button button, int i) {
        int i2 = f9843f + 9;
        f9844g = i2 % 128;
        int i3 = i2 % 2;
        button.setTextColor(i);
        int i4 = f9843f + 3;
        f9844g = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003a, code lost:
        if ((r0.contains("\n") ? 'G' : '?') != '?') goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0044, code lost:
        if (r0.contains("\n") != false) goto L_0x0046;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String m12314b(boolean r6) {
        /*
            int r0 = f9844g
            r1 = 83
            int r0 = r0 + r1
            int r2 = r0 % 128
            f9843f = r2
            int r0 = r0 % 2
            com.facetec.sdk.FaceTecCustomization r0 = com.facetec.sdk.FaceTecSDK.f8630e
            com.facetec.sdk.FaceTecGuidanceCustomization r0 = r0.f8606i
            java.lang.String r0 = r0.readyScreenSubtextAttributedString
            boolean r2 = r0.isEmpty()
            java.lang.String r3 = "\n"
            r4 = 0
            if (r2 != 0) goto L_0x004e
            int r2 = f9843f
            int r2 = r2 + 95
            int r5 = r2 % 128
            f9844g = r5
            int r2 = r2 % 2
            r5 = 21
            if (r2 != 0) goto L_0x002a
            r2 = r5
            goto L_0x002c
        L_0x002a:
            r2 = 54
        L_0x002c:
            if (r2 == r5) goto L_0x003d
            boolean r2 = r0.contains(r3)
            r5 = 63
            if (r2 == 0) goto L_0x0039
            r2 = 71
            goto L_0x003a
        L_0x0039:
            r2 = r5
        L_0x003a:
            if (r2 == r5) goto L_0x004e
            goto L_0x0046
        L_0x003d:
            boolean r2 = r0.contains(r3)
            r5 = 30
            int r5 = r5 / r4
            if (r2 == 0) goto L_0x004e
        L_0x0046:
            int r2 = r0.indexOf(r3)
            java.lang.String r0 = r0.substring(r4, r2)
        L_0x004e:
            boolean r2 = r0.isEmpty()
            r5 = 32
            if (r2 == 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            r1 = r5
        L_0x0058:
            if (r1 == r5) goto L_0x0082
            int r0 = f9843f
            int r0 = r0 + 11
            int r1 = r0 % 128
            f9844g = r1
            int r0 = r0 % 2
            int r0 = com.facetec.sdk.C2747R.string.FaceTec_instructions_message_ready_1
            java.lang.String r0 = com.facetec.sdk.C2923cy.m12206b(r0)
            boolean r1 = r0.contains(r3)
            if (r1 == 0) goto L_0x0082
            int r1 = r0.indexOf(r3)
            java.lang.String r0 = r0.substring(r4, r1)
            int r1 = f9843f
            int r1 = r1 + 81
            int r2 = r1 % 128
            f9844g = r2
            int r1 = r1 % 2
        L_0x0082:
            r1 = 1
            if (r6 == 0) goto L_0x0087
            r6 = r4
            goto L_0x0088
        L_0x0087:
            r6 = r1
        L_0x0088:
            r2 = 50
            if (r6 == r1) goto L_0x00a4
            com.facetec.sdk.FaceTecCustomization r6 = com.facetec.sdk.FaceTecSDK.f8630e
            boolean r6 = r6.f8598a
            if (r6 != 0) goto L_0x00a4
            int r6 = r0.length()
            if (r6 <= r2) goto L_0x00a4
            int r6 = f9844g
            int r6 = r6 + 31
            int r3 = r6 % 128
            f9843f = r3
            int r6 = r6 % 2
            r6 = r1
            goto L_0x00a5
        L_0x00a4:
            r6 = r4
        L_0x00a5:
            if (r6 == 0) goto L_0x00a8
            r1 = r4
        L_0x00a8:
            if (r1 == 0) goto L_0x00ab
            goto L_0x00b9
        L_0x00ab:
            int r6 = f9843f
            int r6 = r6 + 69
            int r1 = r6 % 128
            f9844g = r1
            int r6 = r6 % 2
            java.lang.String r0 = r0.substring(r4, r2)
        L_0x00b9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2938dc.m12314b(boolean):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008e, code lost:
        if ((!com.facetec.sdk.FaceTecSDK.f8630e.f8598a ? '$' : 22) != '$') goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0095, code lost:
        if (com.facetec.sdk.FaceTecSDK.f8630e.f8598a == false) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a0, code lost:
        if ((r0.length() > 30) != false) goto L_0x00a4;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String m12398d(boolean r6) {
        /*
            com.facetec.sdk.FaceTecCustomization r0 = com.facetec.sdk.FaceTecSDK.f8630e
            com.facetec.sdk.FaceTecGuidanceCustomization r0 = r0.f8606i
            java.lang.String r0 = r0.readyScreenHeaderAttributedString
            boolean r1 = r0.isEmpty()
            java.lang.String r2 = "\n"
            r3 = 1
            if (r1 != 0) goto L_0x0032
            int r1 = f9843f
            int r1 = r1 + 63
            int r4 = r1 % 128
            f9844g = r4
            int r1 = r1 % 2
            boolean r1 = r0.contains(r2)
            if (r1 == 0) goto L_0x0032
            int r1 = f9843f
            int r1 = r1 + 43
            int r4 = r1 % 128
            f9844g = r4
            int r1 = r1 % 2
            int r1 = r0.indexOf(r2)
            int r1 = r1 + r3
            java.lang.String r0 = r0.substring(r1)
        L_0x0032:
            boolean r1 = r0.isEmpty()
            r4 = 0
            if (r1 == 0) goto L_0x003b
            r1 = r3
            goto L_0x003c
        L_0x003b:
            r1 = r4
        L_0x003c:
            if (r1 == 0) goto L_0x0067
            int r0 = f9844g
            int r0 = r0 + 73
            int r1 = r0 % 128
            f9843f = r1
            int r0 = r0 % 2
            int r0 = com.facetec.sdk.C2747R.string.FaceTec_instructions_header_ready_2
            java.lang.String r0 = com.facetec.sdk.C2923cy.m12206b(r0)
            boolean r1 = r0.contains(r2)
            if (r1 == 0) goto L_0x0067
            int r1 = f9844g
            int r1 = r1 + 125
            int r5 = r1 % 128
            f9843f = r5
            int r1 = r1 % 2
            int r1 = r0.indexOf(r2)
            int r1 = r1 + r3
            java.lang.String r0 = r0.substring(r1)
        L_0x0067:
            r1 = 64
            if (r6 == 0) goto L_0x006e
            r6 = 93
            goto L_0x006f
        L_0x006e:
            r6 = r1
        L_0x006f:
            r2 = 30
            if (r6 == r1) goto L_0x00a3
            int r6 = f9844g
            int r6 = r6 + 59
            int r1 = r6 % 128
            f9843f = r1
            int r6 = r6 % 2
            if (r6 == 0) goto L_0x0091
            com.facetec.sdk.FaceTecCustomization r6 = com.facetec.sdk.FaceTecSDK.f8630e
            boolean r6 = r6.f8598a
            r1 = 45
            int r1 = r1 / r4
            r1 = 36
            if (r6 != 0) goto L_0x008c
            r6 = r1
            goto L_0x008e
        L_0x008c:
            r6 = 22
        L_0x008e:
            if (r6 == r1) goto L_0x0097
            goto L_0x00a3
        L_0x0091:
            com.facetec.sdk.FaceTecCustomization r6 = com.facetec.sdk.FaceTecSDK.f8630e
            boolean r6 = r6.f8598a
            if (r6 != 0) goto L_0x00a3
        L_0x0097:
            int r6 = r0.length()
            if (r6 <= r2) goto L_0x009f
            r6 = r3
            goto L_0x00a0
        L_0x009f:
            r6 = r4
        L_0x00a0:
            if (r6 == 0) goto L_0x00a3
            goto L_0x00a4
        L_0x00a3:
            r3 = r4
        L_0x00a4:
            if (r3 == 0) goto L_0x00aa
            java.lang.String r0 = r0.substring(r4, r2)
        L_0x00aa:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2938dc.m12398d(boolean):java.lang.String");
    }

    /* renamed from: c */
    static int m12373c(Context context) {
        int i;
        int i2;
        int i3 = f9844g + 113;
        f9843f = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = m12363br().f8604g.inputFieldPlaceholderTextColor;
            if (!(i4 == 0)) {
                return i4;
            }
            int i5 = f9844g + 111;
            f9843f = i5 % 128;
            if ((i5 % 2 != 0 ? '(' : ';') != '(') {
                i = m12408e(context, m12299ao());
                i2 = 102;
            } else {
                i = m12408e(context, m12299ao());
                i2 = 13;
            }
            return m12312b(i, i2);
        }
        int i6 = m12363br().f8604g.inputFieldPlaceholderTextColor;
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0067, code lost:
        if (com.facetec.sdk.FaceTecSDK.f8630e.f8598a == false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006e, code lost:
        if (com.facetec.sdk.FaceTecSDK.f8630e.f8598a == false) goto L_0x0070;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String m12410e(boolean r7) {
        /*
            com.facetec.sdk.FaceTecCustomization r0 = com.facetec.sdk.FaceTecSDK.f8630e
            com.facetec.sdk.FaceTecGuidanceCustomization r0 = r0.f8606i
            java.lang.String r0 = r0.readyScreenHeaderAttributedString
            boolean r1 = r0.isEmpty()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0010
            r1 = r3
            goto L_0x0011
        L_0x0010:
            r1 = r2
        L_0x0011:
            r4 = 5
            java.lang.String r5 = "\n"
            if (r1 == 0) goto L_0x0017
            goto L_0x002e
        L_0x0017:
            boolean r1 = r0.contains(r5)
            if (r1 == 0) goto L_0x002e
            int r1 = f9844g
            int r1 = r1 + r4
            int r6 = r1 % 128
            f9843f = r6
            int r1 = r1 % 2
            int r1 = r0.indexOf(r5)
            java.lang.String r0 = r0.substring(r3, r1)
        L_0x002e:
            boolean r1 = r0.isEmpty()
            r6 = 35
            if (r1 == 0) goto L_0x0039
            r1 = 97
            goto L_0x003a
        L_0x0039:
            r1 = r6
        L_0x003a:
            if (r1 == r6) goto L_0x0050
            int r0 = com.facetec.sdk.C2747R.string.FaceTec_instructions_header_ready_1
            java.lang.String r0 = com.facetec.sdk.C2923cy.m12206b(r0)
            boolean r1 = r0.contains(r5)
            if (r1 == 0) goto L_0x0050
            int r1 = r0.indexOf(r5)
            java.lang.String r0 = r0.substring(r3, r1)
        L_0x0050:
            r1 = 30
            if (r7 == 0) goto L_0x0088
            int r7 = f9843f
            int r7 = r7 + 25
            int r5 = r7 % 128
            f9844g = r5
            int r7 = r7 % 2
            if (r7 != 0) goto L_0x006a
            com.facetec.sdk.FaceTecCustomization r7 = com.facetec.sdk.FaceTecSDK.f8630e
            boolean r7 = r7.f8598a
            r5 = 11
            int r5 = r5 / r3
            if (r7 != 0) goto L_0x0088
            goto L_0x0070
        L_0x006a:
            com.facetec.sdk.FaceTecCustomization r7 = com.facetec.sdk.FaceTecSDK.f8630e
            boolean r7 = r7.f8598a
            if (r7 != 0) goto L_0x0088
        L_0x0070:
            int r7 = f9844g
            int r7 = r7 + 95
            int r5 = r7 % 128
            f9843f = r5
            int r7 = r7 % 2
            int r7 = r0.length()
            r5 = 92
            if (r7 <= r1) goto L_0x0083
            goto L_0x0084
        L_0x0083:
            r4 = r5
        L_0x0084:
            if (r4 == r5) goto L_0x0088
            r7 = r2
            goto L_0x0089
        L_0x0088:
            r7 = r3
        L_0x0089:
            if (r7 == 0) goto L_0x008d
            r7 = r2
            goto L_0x008e
        L_0x008d:
            r7 = r3
        L_0x008e:
            if (r7 == r2) goto L_0x0091
            goto L_0x0095
        L_0x0091:
            java.lang.String r0 = r0.substring(r3, r1)
        L_0x0095:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2938dc.m12410e(boolean):java.lang.String");
    }

    /* renamed from: a */
    static void m12252a(Context context, Drawable drawable, int i) {
        int i2 = C29392.f9846b[m12396d(context, i).ordinal()];
        if (i2 == 1) {
            if ((drawable instanceof GradientDrawable ? '.' : 'I') == '.') {
                int i3 = f9844g + 19;
                f9843f = i3 % 128;
                char c = i3 % 2 != 0 ? 'B' : 19;
                ((GradientDrawable) drawable).setColor(C0767a.m2893c(context, i));
                if (c != 19) {
                    int i4 = 83 / 0;
                }
                int i5 = f9843f + 7;
                f9844g = i5 % 128;
                int i6 = i5 % 2;
            }
        } else if (i2 == 2 && (drawable instanceof GradientDrawable)) {
            ((GradientDrawable) drawable).setColor(i);
        }
    }

    /* renamed from: c */
    static void m12380c(View view) {
        int i = f9843f + 109;
        f9844g = i % 128;
        int i2 = i % 2;
        int bQ = m12336bQ();
        int i3 = C29392.f9846b[m12396d(view.getContext(), bQ).ordinal()];
        if (i3 == 1) {
            view.setBackgroundResource(bQ);
        } else if (i3 != 2) {
            view.setBackgroundColor(0);
            int i4 = f9844g + 87;
            f9843f = i4 % 128;
            int i5 = i4 % 2;
        } else {
            view.setBackgroundColor(bQ);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0041, code lost:
        if (r0.length() > 2) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
        if ((r0.length() <= 30) != true) goto L_0x004f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String m12250a(boolean r7) {
        /*
            com.facetec.sdk.FaceTecCustomization r0 = com.facetec.sdk.FaceTecSDK.f8630e
            com.facetec.sdk.FaceTecGuidanceCustomization r0 = r0.f8606i
            java.lang.String r0 = r0.retryScreenHeaderAttributedString
            boolean r1 = r0.isEmpty()
            r2 = 8
            r3 = 13
            if (r1 == 0) goto L_0x0012
            r1 = r2
            goto L_0x0013
        L_0x0012:
            r1 = r3
        L_0x0013:
            r4 = 2
            if (r1 == r2) goto L_0x0017
            goto L_0x0026
        L_0x0017:
            int r0 = f9844g
            int r0 = r0 + 57
            int r1 = r0 % 128
            f9843f = r1
            int r0 = r0 % r4
            int r0 = com.facetec.sdk.C2747R.string.FaceTec_retry_header
            java.lang.String r0 = com.facetec.sdk.C2923cy.m12206b(r0)
        L_0x0026:
            r1 = 30
            r2 = 0
            r5 = 1
            if (r7 == 0) goto L_0x0051
            com.facetec.sdk.FaceTecCustomization r7 = com.facetec.sdk.FaceTecSDK.f8630e
            boolean r7 = r7.f8598a
            if (r7 != 0) goto L_0x0051
            int r7 = f9843f
            int r7 = r7 + 81
            int r6 = r7 % 128
            f9844g = r6
            int r7 = r7 % r4
            if (r7 != 0) goto L_0x0044
            int r7 = r0.length()
            if (r7 <= r4) goto L_0x0051
            goto L_0x004f
        L_0x0044:
            int r7 = r0.length()
            if (r7 <= r1) goto L_0x004c
            r7 = r2
            goto L_0x004d
        L_0x004c:
            r7 = r5
        L_0x004d:
            if (r7 == r5) goto L_0x0051
        L_0x004f:
            r7 = r5
            goto L_0x0052
        L_0x0051:
            r7 = r2
        L_0x0052:
            if (r7 == 0) goto L_0x0071
            int r7 = f9843f
            int r7 = r7 + 65
            int r6 = r7 % 128
            f9844g = r6
            int r7 = r7 % r4
            r4 = 85
            if (r7 != 0) goto L_0x0062
            r3 = r4
        L_0x0062:
            if (r3 == r4) goto L_0x006a
            java.lang.String r7 = r0.substring(r2, r1)
        L_0x0068:
            r0 = r7
            goto L_0x0071
        L_0x006a:
            r7 = 115(0x73, float:1.61E-43)
            java.lang.String r7 = r0.substring(r5, r7)
            goto L_0x0068
        L_0x0071:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2938dc.m12250a(boolean):java.lang.String");
    }

    /* renamed from: c */
    private static GradientDrawable m12375c(Context context, GradientDrawable gradientDrawable) {
        if ((Build.VERSION.SDK_INT >= 24 ? 'M' : 'A') != 'M') {
            gradientDrawable.setColor(m12312b(m12435k(context), (int) C11051p3.f31759c));
            int i = f9844g + 115;
            f9843f = i % 128;
            int i2 = i % 2;
        } else {
            int i3 = f9843f + 55;
            f9844g = i3 % 128;
            if (i3 % 2 != 0) {
                int[] a = gradientDrawable.getColors();
                if ((a != null ? (char) 30 : 16) != 16) {
                    int i4 = 0;
                    while (true) {
                        if ((i4 < a.length ? 'X' : 'R') == 'R') {
                            break;
                        }
                        int i5 = C29392.f9846b[m12396d(context, a[i4]).ordinal()];
                        if (i5 == 1) {
                            a[i4] = m12312b(C0767a.m2893c(context, a[i4]), (int) C11051p3.f31759c);
                        } else if (i5 == 2) {
                            a[i4] = m12312b(a[i4], (int) C11051p3.f31759c);
                        }
                        i4++;
                    }
                }
                gradientDrawable.setColors(a);
            } else {
                int[] unused = gradientDrawable.getColors();
                throw null;
            }
        }
        return gradientDrawable;
    }

    /* renamed from: d */
    static String m12397d(C2857bs bsVar, boolean z) {
        int i;
        String str = null;
        switch (C29392.f9847c[bsVar.ordinal()]) {
            case 1:
                str = "";
                break;
            case 2:
                if (!z) {
                    str = C2923cy.m12206b(C2747R.string.FaceTec_idscan_nfc_status_starting_message);
                    i = f9843f + 65;
                } else {
                    int i2 = f9843f + 81;
                    f9844g = i2 % 128;
                    if (i2 % 2 != 0) {
                        str = C2923cy.m12206b(C2747R.string.FaceTec_idscan_nfc_card_status_starting_message);
                        i = f9843f + 113;
                    } else {
                        C2923cy.m12206b(C2747R.string.FaceTec_idscan_nfc_card_status_starting_message);
                        throw null;
                    }
                }
                f9844g = i % 128;
                int i3 = i % 2;
                break;
            case 3:
                str = C2923cy.m12206b(C2747R.string.FaceTec_idscan_nfc_status_scanning_message);
                break;
            case 4:
                str = C2923cy.m12206b(C2747R.string.FaceTec_idscan_nfc_status_weak_connection_message);
                break;
            case 5:
                str = C2923cy.m12206b(C2747R.string.FaceTec_idscan_nfc_status_finished_with_success_message);
                break;
            case 6:
                if ((z ? 'U' : '^') == 'U') {
                    str = C2923cy.m12206b(C2747R.string.FaceTec_idscan_nfc_card_status_finished_with_error_message);
                    break;
                } else {
                    str = C2923cy.m12206b(C2747R.string.FaceTec_idscan_nfc_status_finished_with_error_message);
                    break;
                }
            case 7:
                str = C2923cy.m12206b(C2747R.string.FaceTec_idscan_nfc_status_skipped_message);
                break;
            case 8:
                str = C2923cy.m12206b(C2747R.string.FaceTec_idscan_nfc_status_disabled_message);
                break;
        }
        int i4 = f9843f + 83;
        f9844g = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 67 / 0;
        }
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return com.facetec.sdk.C2923cy.m12206b(com.facetec.sdk.C2747R.string.FaceTec_result_idscan_unsuccess_message);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return com.facetec.sdk.C2923cy.m12206b(com.facetec.sdk.C2747R.string.FaceTec_result_idscan_success_nfc_message);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return com.facetec.sdk.C2923cy.m12206b(com.facetec.sdk.C2747R.string.FaceTec_result_idscan_success_user_confirmation_message);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return com.facetec.sdk.C2923cy.m12206b(com.facetec.sdk.C2747R.string.FaceTec_result_idscan_success_passport_nfc_next_message);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        return com.facetec.sdk.C2923cy.m12206b(com.facetec.sdk.C2747R.string.FaceTec_result_idscan_success_passport_message);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return com.facetec.sdk.C2923cy.m12206b(com.facetec.sdk.C2747R.string.FaceTec_result_idscan_success_back_side_nfc_next_message);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return com.facetec.sdk.C2923cy.m12206b(com.facetec.sdk.C2747R.string.FaceTec_result_idscan_success_back_side_message);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return com.facetec.sdk.C2923cy.m12206b(com.facetec.sdk.C2747R.string.FaceTec_result_idscan_success_front_side_nfc_next_message);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return com.facetec.sdk.C2923cy.m12206b(com.facetec.sdk.C2747R.string.FaceTec_result_idscan_success_front_side_back_next_message);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return com.facetec.sdk.C2923cy.m12206b(com.facetec.sdk.C2747R.string.FaceTec_result_idscan_success_front_side_message);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return com.facetec.sdk.C2923cy.m12206b(com.facetec.sdk.C2747R.string.FaceTec_result_idscan_skip_or_error_nfc_message);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        return com.facetec.sdk.C2923cy.m12206b(com.facetec.sdk.C2747R.string.FaceTec_result_idscan_retry_barcode_not_read_message);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        return com.facetec.sdk.C2923cy.m12206b(com.facetec.sdk.C2747R.string.FaceTec_result_idscan_retry_id_type_not_supported_message);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        return com.facetec.sdk.C2923cy.m12206b(com.facetec.sdk.C2747R.string.FaceTec_result_idscan_retry_ocr_results_not_good_enough_message);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        return com.facetec.sdk.C2923cy.m12206b(com.facetec.sdk.C2747R.string.FaceTec_result_idscan_retry_id_not_fully_visible_message);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        return com.facetec.sdk.C2923cy.m12206b(com.facetec.sdk.C2747R.string.FaceTec_result_idscan_retry_face_did_not_match_message);
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String m12409e(com.facetec.sdk.C2908cp r5) {
        /*
            int r0 = f9844g
            int r0 = r0 + 69
            int r1 = r0 % 128
            f9843f = r1
            int r0 = r0 % 2
            r1 = 52
            if (r0 == 0) goto L_0x0011
            r0 = 8
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            r2 = 0
            if (r0 != r1) goto L_0x00d5
            java.util.HashMap<com.facetec.sdk.cp, java.lang.String> r0 = com.facetec.sdk.FaceTecCustomization.f8597t
            r1 = 0
            r3 = 1
            if (r0 == 0) goto L_0x001d
            r4 = r1
            goto L_0x001e
        L_0x001d:
            r4 = r3
        L_0x001e:
            if (r4 == r3) goto L_0x0027
            java.lang.Object r0 = r0.get(r5)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
        L_0x0027:
            r0 = 41
            if (r2 != 0) goto L_0x002d
            r3 = r0
            goto L_0x002f
        L_0x002d:
            r3 = 91
        L_0x002f:
            if (r3 == r0) goto L_0x0033
            goto L_0x00d4
        L_0x0033:
            int r0 = f9843f
            int r0 = r0 + 89
            int r3 = r0 % 128
            f9844g = r3
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x004f
            int[] r0 = com.facetec.sdk.C2938dc.C29392.f9848d
            int r5 = r5.ordinal()
            r5 = r0[r5]
            r0 = 34
            int r0 = r0 / r1
            switch(r5) {
                case 1: goto L_0x00ce;
                case 2: goto L_0x00c7;
                case 3: goto L_0x00c0;
                case 4: goto L_0x00b9;
                case 5: goto L_0x00b2;
                case 6: goto L_0x00ab;
                case 7: goto L_0x00d4;
                case 8: goto L_0x00a4;
                case 9: goto L_0x009d;
                case 10: goto L_0x0096;
                case 11: goto L_0x008f;
                case 12: goto L_0x0088;
                case 13: goto L_0x0081;
                case 14: goto L_0x007a;
                case 15: goto L_0x0073;
                case 16: goto L_0x006c;
                case 17: goto L_0x0064;
                case 18: goto L_0x005c;
                default: goto L_0x004d;
            }
        L_0x004d:
            goto L_0x00d4
        L_0x004f:
            int[] r0 = com.facetec.sdk.C2938dc.C29392.f9848d
            int r5 = r5.ordinal()
            r5 = r0[r5]
            switch(r5) {
                case 1: goto L_0x00ce;
                case 2: goto L_0x00c7;
                case 3: goto L_0x00c0;
                case 4: goto L_0x00b9;
                case 5: goto L_0x00b2;
                case 6: goto L_0x00ab;
                case 7: goto L_0x00d4;
                case 8: goto L_0x00a4;
                case 9: goto L_0x009d;
                case 10: goto L_0x0096;
                case 11: goto L_0x008f;
                case 12: goto L_0x0088;
                case 13: goto L_0x0081;
                case 14: goto L_0x007a;
                case 15: goto L_0x0073;
                case 16: goto L_0x006c;
                case 17: goto L_0x0064;
                case 18: goto L_0x005c;
                default: goto L_0x005a;
            }
        L_0x005a:
            goto L_0x00d4
        L_0x005c:
            int r5 = com.facetec.sdk.C2747R.string.FaceTec_result_idscan_success_additional_review_message
            java.lang.String r2 = com.facetec.sdk.C2923cy.m12206b(r5)
            goto L_0x00d4
        L_0x0064:
            int r5 = com.facetec.sdk.C2747R.string.FaceTec_result_idscan_success_nfc_message
            java.lang.String r2 = com.facetec.sdk.C2923cy.m12206b(r5)
            goto L_0x00d4
        L_0x006c:
            int r5 = com.facetec.sdk.C2747R.string.FaceTec_result_idscan_success_user_confirmation_message
            java.lang.String r2 = com.facetec.sdk.C2923cy.m12206b(r5)
            goto L_0x00d4
        L_0x0073:
            int r5 = com.facetec.sdk.C2747R.string.FaceTec_result_idscan_success_passport_nfc_next_message
            java.lang.String r2 = com.facetec.sdk.C2923cy.m12206b(r5)
            goto L_0x00d4
        L_0x007a:
            int r5 = com.facetec.sdk.C2747R.string.FaceTec_result_idscan_success_passport_message
            java.lang.String r2 = com.facetec.sdk.C2923cy.m12206b(r5)
            goto L_0x00d4
        L_0x0081:
            int r5 = com.facetec.sdk.C2747R.string.FaceTec_result_idscan_success_back_side_nfc_next_message
            java.lang.String r2 = com.facetec.sdk.C2923cy.m12206b(r5)
            goto L_0x00d4
        L_0x0088:
            int r5 = com.facetec.sdk.C2747R.string.FaceTec_result_idscan_success_back_side_message
            java.lang.String r2 = com.facetec.sdk.C2923cy.m12206b(r5)
            goto L_0x00d4
        L_0x008f:
            int r5 = com.facetec.sdk.C2747R.string.FaceTec_result_idscan_success_front_side_nfc_next_message
            java.lang.String r2 = com.facetec.sdk.C2923cy.m12206b(r5)
            goto L_0x00d4
        L_0x0096:
            int r5 = com.facetec.sdk.C2747R.string.FaceTec_result_idscan_success_front_side_back_next_message
            java.lang.String r2 = com.facetec.sdk.C2923cy.m12206b(r5)
            goto L_0x00d4
        L_0x009d:
            int r5 = com.facetec.sdk.C2747R.string.FaceTec_result_idscan_success_front_side_message
            java.lang.String r2 = com.facetec.sdk.C2923cy.m12206b(r5)
            goto L_0x00d4
        L_0x00a4:
            int r5 = com.facetec.sdk.C2747R.string.FaceTec_result_idscan_skip_or_error_nfc_message
            java.lang.String r2 = com.facetec.sdk.C2923cy.m12206b(r5)
            goto L_0x00d4
        L_0x00ab:
            int r5 = com.facetec.sdk.C2747R.string.FaceTec_result_idscan_retry_barcode_not_read_message
            java.lang.String r2 = com.facetec.sdk.C2923cy.m12206b(r5)
            goto L_0x00d4
        L_0x00b2:
            int r5 = com.facetec.sdk.C2747R.string.FaceTec_result_idscan_retry_id_type_not_supported_message
            java.lang.String r2 = com.facetec.sdk.C2923cy.m12206b(r5)
            goto L_0x00d4
        L_0x00b9:
            int r5 = com.facetec.sdk.C2747R.string.FaceTec_result_idscan_retry_ocr_results_not_good_enough_message
            java.lang.String r2 = com.facetec.sdk.C2923cy.m12206b(r5)
            goto L_0x00d4
        L_0x00c0:
            int r5 = com.facetec.sdk.C2747R.string.FaceTec_result_idscan_retry_id_not_fully_visible_message
            java.lang.String r2 = com.facetec.sdk.C2923cy.m12206b(r5)
            goto L_0x00d4
        L_0x00c7:
            int r5 = com.facetec.sdk.C2747R.string.FaceTec_result_idscan_retry_face_did_not_match_message
            java.lang.String r2 = com.facetec.sdk.C2923cy.m12206b(r5)
            goto L_0x00d4
        L_0x00ce:
            int r5 = com.facetec.sdk.C2747R.string.FaceTec_result_idscan_unsuccess_message
            java.lang.String r2 = com.facetec.sdk.C2923cy.m12206b(r5)
        L_0x00d4:
            return r2
        L_0x00d5:
            java.lang.String r5 = com.facetec.sdk.FaceTecCustomization.overrideResultScreenSuccessMessage
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2938dc.m12409e(com.facetec.sdk.cp):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0053, code lost:
        if (r1 != true) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005a, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 81) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0067, code lost:
        r6 = m12435k(r6);
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m12374c(android.content.Context r6, int r7) {
        /*
            int[] r0 = com.facetec.sdk.C2938dc.C29392.f9846b
            com.facetec.sdk.dc$a r1 = m12396d((android.content.Context) r6, (int) r7)
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 24
            r3 = 1
            r4 = 255(0xff, float:3.57E-43)
            if (r0 == r3) goto L_0x001b
            if (r0 == r1) goto L_0x0017
            return r4
        L_0x0017:
            int r6 = r7 >> 24
            r6 = r6 & r4
            return r6
        L_0x001b:
            android.graphics.drawable.Drawable r0 = androidx.core.content.C0767a.m2895e(r6, r7)
            if (r0 == 0) goto L_0x0075
            boolean r7 = r0 instanceof android.graphics.drawable.ShapeDrawable
            if (r7 == 0) goto L_0x0039
            int r6 = f9843f
            int r6 = r6 + 65
            int r7 = r6 % 128
            f9844g = r7
            int r6 = r6 % r1
            android.graphics.drawable.ShapeDrawable r0 = (android.graphics.drawable.ShapeDrawable) r0
            android.graphics.Paint r6 = r0.getPaint()
            int r4 = r6.getAlpha()
            goto L_0x007b
        L_0x0039:
            boolean r7 = r0 instanceof android.graphics.drawable.GradientDrawable
            if (r7 == 0) goto L_0x006c
            int r7 = f9844g
            int r7 = r7 + 125
            int r5 = r7 % 128
            f9843f = r5
            int r7 = r7 % r1
            r1 = 0
            if (r7 == 0) goto L_0x004b
            r7 = r1
            goto L_0x004c
        L_0x004b:
            r7 = r3
        L_0x004c:
            if (r7 == 0) goto L_0x0056
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 < r2) goto L_0x0053
            r1 = r3
        L_0x0053:
            if (r1 == r3) goto L_0x005c
            goto L_0x0067
        L_0x0056:
            int r7 = android.os.Build.VERSION.SDK_INT
            r1 = 81
            if (r7 < r1) goto L_0x0067
        L_0x005c:
            android.graphics.drawable.GradientDrawable r0 = (android.graphics.drawable.GradientDrawable) r0
            int[] r7 = r0.getColors()
            int r4 = m12249a((android.content.Context) r6, (int[]) r7)
            goto L_0x007b
        L_0x0067:
            int r6 = m12435k(r6)
            goto L_0x0079
        L_0x006c:
            boolean r6 = r0 instanceof android.graphics.drawable.ColorDrawable
            if (r6 == 0) goto L_0x007b
            int r4 = r0.getAlpha()
            goto L_0x007b
        L_0x0075:
            int r6 = androidx.core.content.C0767a.m2893c(r6, r7)
        L_0x0079:
            int r6 = r6 >> r2
            r4 = r4 & r6
        L_0x007b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2938dc.m12374c(android.content.Context, int):int");
    }

    /* renamed from: c */
    static void m12381c(ProgressBar progressBar, Drawable drawable) {
        int bL = m12331bL();
        int i = C29392.f9846b[m12396d(progressBar.getContext(), bL).ordinal()];
        boolean z = false;
        if (i != 1) {
            if (i == 2) {
                ((GradientDrawable) drawable).setColor(bL);
            }
            int i2 = f9844g + 43;
            f9843f = i2 % 128;
            if (i2 % 2 != 0) {
                z = true;
            }
            if (z) {
                throw null;
            }
            return;
        }
        ((GradientDrawable) drawable).setColor(C0767a.m2893c(progressBar.getContext(), bL));
        int i3 = f9843f + 101;
        f9844g = i3 % 128;
        if (i3 % 2 == 0) {
            z = true;
        }
        if (z) {
            throw null;
        }
    }

    /* renamed from: e */
    private static void m12414e(String str) {
        int i = f9844g + 73;
        f9843f = i % 128;
        int i2 = i % 2;
        C2797ar.m10878a(String.format(Locale.getDefault(), "FaceTec SDK Text Customization Alert: Your text is too long for the %s text element to render correctly on a significant portion of supported devices. Please update this text string to short, concise text, based on our default text element for optimal User Experience and Success Rates. If you continue with too many characters, the FaceTec SDK will not show the excess characters, and this will likely impact User Experience and Success Rates. These character limitations must be in place to ensure compatibility with the 1,000,000+ Device/Model/Platform/Version/Screen Size/Camera Res combinations that FaceTec supports.", new Object[]{str}));
        int i3 = f9843f + 65;
        f9844g = i3 % 128;
        if ((i3 % 2 == 0 ? '[' : 8) == '[') {
            throw null;
        }
    }

    /* renamed from: c */
    static void m12382c(ProgressBar progressBar, Drawable drawable, Drawable drawable2) {
        int i = f9843f + 81;
        f9844g = i % 128;
        int i2 = i % 2;
        int bK = m12330bK();
        int i3 = C29392.f9846b[m12396d(progressBar.getContext(), bK).ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                ((GradientDrawable) drawable).setColor(bK);
                ((GradientDrawable) drawable2).setColor(m12405e(bK, 0.5f));
            }
            int i4 = f9843f + 85;
            f9844g = i4 % 128;
            if ((i4 % 2 == 0 ? '+' : '$') != '$') {
                throw null;
            }
            return;
        }
        ((GradientDrawable) drawable).setColor(C0767a.m2893c(progressBar.getContext(), bK));
        ((GradientDrawable) drawable2).setColor(m12405e(C0767a.m2893c(progressBar.getContext(), bK), 0.5f));
    }

    /* renamed from: c */
    static void m12383c(TextView textView) {
        int i = f9844g + 3;
        f9843f = i % 128;
        if (!(i % 2 != 0)) {
            m12257a(textView, m12340bU());
        } else {
            m12257a(textView, m12340bU());
            throw null;
        }
    }

    /* renamed from: c */
    static void m12379c(Drawable drawable, int i, int i2, double d) {
        int i3 = f9843f + 69;
        f9844g = i3 % 128;
        int i4 = i3 % 2;
        if ((drawable instanceof GradientDrawable ? 'T' : ':') != ':') {
            GradientDrawable gradientDrawable = (GradientDrawable) drawable;
            gradientDrawable.setStroke(i2, i);
            gradientDrawable.setCornerRadius((float) d);
        }
        int i5 = f9844g + 37;
        f9843f = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String m12378c(boolean r5) {
        /*
            com.facetec.sdk.FaceTecCustomization r0 = com.facetec.sdk.FaceTecSDK.f8630e
            com.facetec.sdk.FaceTecGuidanceCustomization r0 = r0.f8606i
            java.lang.String r0 = r0.readyScreenSubtextAttributedString
            boolean r1 = r0.isEmpty()
            java.lang.String r2 = "\n"
            r3 = 1
            if (r1 != 0) goto L_0x0028
            boolean r1 = r0.contains(r2)
            if (r1 == 0) goto L_0x0028
            int r1 = r0.indexOf(r2)
            int r1 = r1 + r3
            java.lang.String r0 = r0.substring(r1)
            int r1 = f9844g
            int r1 = r1 + 59
            int r4 = r1 % 128
            f9843f = r4
            int r1 = r1 % 2
        L_0x0028:
            boolean r1 = r0.isEmpty()
            r4 = 0
            if (r1 == 0) goto L_0x004a
            int r0 = com.facetec.sdk.C2747R.string.FaceTec_instructions_message_ready_2
            java.lang.String r0 = com.facetec.sdk.C2923cy.m12206b(r0)
            boolean r1 = r0.contains(r2)
            if (r1 == 0) goto L_0x003d
            r1 = r4
            goto L_0x003e
        L_0x003d:
            r1 = r3
        L_0x003e:
            if (r1 == 0) goto L_0x0041
            goto L_0x004a
        L_0x0041:
            int r1 = r0.indexOf(r2)
            int r1 = r1 + r3
            java.lang.String r0 = r0.substring(r1)
        L_0x004a:
            if (r5 == 0) goto L_0x004e
            r5 = r3
            goto L_0x004f
        L_0x004e:
            r5 = r4
        L_0x004f:
            r1 = 50
            if (r5 == r3) goto L_0x0054
            goto L_0x007d
        L_0x0054:
            com.facetec.sdk.FaceTecCustomization r5 = com.facetec.sdk.FaceTecSDK.f8630e
            boolean r5 = r5.f8598a
            if (r5 != 0) goto L_0x007d
            int r5 = f9843f
            int r5 = r5 + 55
            int r2 = r5 % 128
            f9844g = r2
            int r5 = r5 % 2
            int r5 = r0.length()
            r2 = 22
            if (r5 <= r1) goto L_0x006f
            r5 = 69
            goto L_0x0070
        L_0x006f:
            r5 = r2
        L_0x0070:
            if (r5 == r2) goto L_0x007d
            int r5 = f9844g
            int r5 = r5 + 117
            int r2 = r5 % 128
            f9843f = r2
            int r5 = r5 % 2
            goto L_0x007e
        L_0x007d:
            r3 = r4
        L_0x007e:
            if (r3 == 0) goto L_0x0084
            java.lang.String r0 = r0.substring(r4, r1)
        L_0x0084:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2938dc.m12378c(boolean):java.lang.String");
    }

    /* renamed from: c */
    static String m12377c(C2941dd ddVar) {
        int i = f9844g + 107;
        f9843f = i % 128;
        if (!(i % 2 != 0)) {
            HashMap<C2941dd, String> hashMap = FaceTecCustomization.f8596q;
            if (hashMap == null) {
                return null;
            }
            String str = hashMap.get(ddVar);
            int i2 = f9843f + 67;
            f9844g = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
        String str2 = FaceTecCustomization.overrideResultScreenSuccessMessage;
        throw null;
    }

    /* renamed from: c */
    private static void m12384c(String str) {
        String format;
        int i = f9843f + 107;
        f9844g = i % 128;
        if (!(i % 2 != 0)) {
            Locale locale = Locale.getDefault();
            Object[] objArr = new Object[5];
            objArr[0] = str;
            objArr[0] = 76;
            objArr[5] = 45;
            format = String.format(locale, "Your %s text has been configured to use more than %d characters.  %d or less characters is recommended for this text in order to render well on all devices and OS versions.", objArr);
        } else {
            format = String.format(Locale.getDefault(), "Your %s text has been configured to use more than %d characters.  %d or less characters is recommended for this text in order to render well on all devices and OS versions.", new Object[]{str, 20, 20});
        }
        C2797ar.m10878a(format);
    }
}
