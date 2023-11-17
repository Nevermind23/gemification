package com.facetec.sdk;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facetec.sdk.C2802au;
import com.facetec.sdk.C2949dl;
import com.facetec.sdk.C3147g;
import com.github.mikephil.charting.utils.Utils;
import com.guardsquare.dexguard.annotation.EncryptStrings;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

@EncryptStrings
/* renamed from: com.facetec.sdk.s */
final class C3555s {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: a */
    private static C2913cs f11475a = C2913cs.CAMERA_PERMISSION;

    /* renamed from: b */
    static boolean f11476b = false;

    /* renamed from: c */
    static String f11477c = C2790am.f8916m;

    /* renamed from: d */
    static int f11478d = 0;

    /* renamed from: e */
    static String f11479e = "";

    /* renamed from: f */
    private static int f11480f = 0;

    /* renamed from: g */
    private static long f11481g;

    /* renamed from: h */
    private static long f11482h = 0;

    /* renamed from: i */
    private static /* synthetic */ boolean f11483i = true;

    /* renamed from: j */
    private static char[] f11484j;

    /* renamed from: l */
    private static int f11485l;

    /* renamed from: com.facetec.sdk.s$3 */
    static /* synthetic */ class C35583 {

        /* renamed from: a */
        static final /* synthetic */ int[] f11487a;

        /* renamed from: c */
        static final /* synthetic */ int[] f11488c;

        /* renamed from: d */
        static final /* synthetic */ int[] f11489d;

        /* JADX WARNING: Can't wrap try/catch for region: R(101:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|(2:37|38)|39|41|42|43|44|45|46|(2:47|48)|49|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|(3:121|122|124)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(103:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|(2:37|38)|39|41|42|43|44|45|46|(2:47|48)|49|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|124) */
        /* JADX WARNING: Can't wrap try/catch for region: R(104:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|(2:37|38)|39|41|42|43|44|45|46|(2:47|48)|49|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|124) */
        /* JADX WARNING: Can't wrap try/catch for region: R(105:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|37|38|39|41|42|43|44|45|46|(2:47|48)|49|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|124) */
        /* JADX WARNING: Can't wrap try/catch for region: R(106:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|37|38|39|41|42|43|44|45|46|(2:47|48)|49|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|124) */
        /* JADX WARNING: Can't wrap try/catch for region: R(107:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|37|38|39|41|42|43|44|45|46|(2:47|48)|49|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|124) */
        /* JADX WARNING: Can't wrap try/catch for region: R(108:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|37|38|39|41|42|43|44|45|46|(2:47|48)|49|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|124) */
        /* JADX WARNING: Can't wrap try/catch for region: R(109:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|37|38|39|41|42|43|44|45|46|47|48|49|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|124) */
        /* JADX WARNING: Can't wrap try/catch for region: R(110:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|33|34|35|37|38|39|41|42|43|44|45|46|47|48|49|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|124) */
        /* JADX WARNING: Can't wrap try/catch for region: R(111:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|33|34|35|37|38|39|41|42|43|44|45|46|47|48|49|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|124) */
        /* JADX WARNING: Can't wrap try/catch for region: R(112:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|33|34|35|37|38|39|41|42|43|44|45|46|47|48|49|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|124) */
        /* JADX WARNING: Can't wrap try/catch for region: R(113:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|44|45|46|47|48|49|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|124) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:101:0x01c6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:103:0x01d2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:105:0x01de */
        /* JADX WARNING: Missing exception handler attribute for start block: B:107:0x01ea */
        /* JADX WARNING: Missing exception handler attribute for start block: B:109:0x01f6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:111:0x0202 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:113:0x020e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:115:0x021a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:117:0x0226 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:119:0x0232 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:121:0x023e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0089 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0093 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x009d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00b8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00c2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00d6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00e0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x00ea */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x00f4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x00fe */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0108 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x0112 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x011e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x012a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x0136 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x0142 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x014e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x015a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x0166 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x0172 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:89:0x017e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:91:0x018a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:93:0x0196 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x01a2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:97:0x01ae */
        /* JADX WARNING: Missing exception handler attribute for start block: B:99:0x01ba */
        static {
            /*
                com.facetec.sdk.cs[] r0 = com.facetec.sdk.C2913cs.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11487a = r0
                r1 = 1
                com.facetec.sdk.cs r2 = com.facetec.sdk.C2913cs.CAMERA_PERMISSION     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f11487a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facetec.sdk.cs r3 = com.facetec.sdk.C2913cs.INITIAL_FACE_SCAN_GET_READY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f11487a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facetec.sdk.cs r4 = com.facetec.sdk.C2913cs.FACE_SCAN_ZOOMED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f11487a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facetec.sdk.cs r5 = com.facetec.sdk.C2913cs.FACE_SCAN_UNZOOMED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f11487a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.facetec.sdk.cs r6 = com.facetec.sdk.C2913cs.RETRY_SIDE_BY_SIDE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = f11487a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.facetec.sdk.cs r7 = com.facetec.sdk.C2913cs.RETRY_GET_READY     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = f11487a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.facetec.sdk.cs r8 = com.facetec.sdk.C2913cs.RESULT_UPLOAD     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                r7 = 8
                int[] r8 = f11487a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.facetec.sdk.cs r9 = com.facetec.sdk.C2913cs.ID_SCAN_START     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                r8 = 9
                int[] r9 = f11487a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.facetec.sdk.cs r10 = com.facetec.sdk.C2913cs.NFC_START     // Catch:{ NoSuchFieldError -> 0x006c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r9[r10] = r8     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                r9 = 10
                int[] r10 = f11487a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.facetec.sdk.cs r11 = com.facetec.sdk.C2913cs.RESULT_OCR     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r11 = r11.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r10[r11] = r9     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                com.facetec.sdk.dm[] r10 = com.facetec.sdk.C2952dm.values()
                int r10 = r10.length
                int[] r10 = new int[r10]
                f11488c = r10
                com.facetec.sdk.dm r11 = com.facetec.sdk.C2952dm.Unknown     // Catch:{ NoSuchFieldError -> 0x0089 }
                int r11 = r11.ordinal()     // Catch:{ NoSuchFieldError -> 0x0089 }
                r10[r11] = r1     // Catch:{ NoSuchFieldError -> 0x0089 }
            L_0x0089:
                int[] r10 = f11488c     // Catch:{ NoSuchFieldError -> 0x0093 }
                com.facetec.sdk.dm r11 = com.facetec.sdk.C2952dm.InvalidMrzKey     // Catch:{ NoSuchFieldError -> 0x0093 }
                int r11 = r11.ordinal()     // Catch:{ NoSuchFieldError -> 0x0093 }
                r10[r11] = r0     // Catch:{ NoSuchFieldError -> 0x0093 }
            L_0x0093:
                int[] r10 = f11488c     // Catch:{ NoSuchFieldError -> 0x009d }
                com.facetec.sdk.dm r11 = com.facetec.sdk.C2952dm.ResponseError     // Catch:{ NoSuchFieldError -> 0x009d }
                int r11 = r11.ordinal()     // Catch:{ NoSuchFieldError -> 0x009d }
                r10[r11] = r2     // Catch:{ NoSuchFieldError -> 0x009d }
            L_0x009d:
                int[] r10 = f11488c     // Catch:{ NoSuchFieldError -> 0x00a7 }
                com.facetec.sdk.dm r11 = com.facetec.sdk.C2952dm.ConnectionError     // Catch:{ NoSuchFieldError -> 0x00a7 }
                int r11 = r11.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a7 }
                r10[r11] = r3     // Catch:{ NoSuchFieldError -> 0x00a7 }
            L_0x00a7:
                com.facetec.sdk.c[] r10 = com.facetec.sdk.C2867c.values()
                int r10 = r10.length
                int[] r10 = new int[r10]
                f11489d = r10
                com.facetec.sdk.c r11 = com.facetec.sdk.C2867c.FACESCAN_CALLBACK_CALLED     // Catch:{ NoSuchFieldError -> 0x00b8 }
                int r11 = r11.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b8 }
                r10[r11] = r1     // Catch:{ NoSuchFieldError -> 0x00b8 }
            L_0x00b8:
                int[] r1 = f11489d     // Catch:{ NoSuchFieldError -> 0x00c2 }
                com.facetec.sdk.c r10 = com.facetec.sdk.C2867c.ID_SCAN_CALLBACK_CALLED     // Catch:{ NoSuchFieldError -> 0x00c2 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c2 }
                r1[r10] = r0     // Catch:{ NoSuchFieldError -> 0x00c2 }
            L_0x00c2:
                int[] r0 = f11489d     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.facetec.sdk.c r1 = com.facetec.sdk.C2867c.DEVELOPER_USED_FACESCAN_CALLBACK     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = f11489d     // Catch:{ NoSuchFieldError -> 0x00d6 }
                com.facetec.sdk.c r1 = com.facetec.sdk.C2867c.DEVELOPER_USED_ID_SCAN_CALLBACK     // Catch:{ NoSuchFieldError -> 0x00d6 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d6 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x00d6 }
            L_0x00d6:
                int[] r0 = f11489d     // Catch:{ NoSuchFieldError -> 0x00e0 }
                com.facetec.sdk.c r1 = com.facetec.sdk.C2867c.DOCUMENT_TYPE_PRESSED     // Catch:{ NoSuchFieldError -> 0x00e0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e0 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x00e0 }
            L_0x00e0:
                int[] r0 = f11489d     // Catch:{ NoSuchFieldError -> 0x00ea }
                com.facetec.sdk.c r1 = com.facetec.sdk.C2867c.FULL_SESSION_START     // Catch:{ NoSuchFieldError -> 0x00ea }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ea }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x00ea }
            L_0x00ea:
                int[] r0 = f11489d     // Catch:{ NoSuchFieldError -> 0x00f4 }
                com.facetec.sdk.c r1 = com.facetec.sdk.C2867c.GET_READY_IM_READY_SHOWN_AND_READY     // Catch:{ NoSuchFieldError -> 0x00f4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f4 }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x00f4 }
            L_0x00f4:
                int[] r0 = f11489d     // Catch:{ NoSuchFieldError -> 0x00fe }
                com.facetec.sdk.c r1 = com.facetec.sdk.C2867c.GET_READY_IM_READY_PRESSED     // Catch:{ NoSuchFieldError -> 0x00fe }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fe }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x00fe }
            L_0x00fe:
                int[] r0 = f11489d     // Catch:{ NoSuchFieldError -> 0x0108 }
                com.facetec.sdk.c r1 = com.facetec.sdk.C2867c.GET_READY_IM_READY_SHOWN_AND_READY_RETRY     // Catch:{ NoSuchFieldError -> 0x0108 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0108 }
                r0[r1] = r8     // Catch:{ NoSuchFieldError -> 0x0108 }
            L_0x0108:
                int[] r0 = f11489d     // Catch:{ NoSuchFieldError -> 0x0112 }
                com.facetec.sdk.c r1 = com.facetec.sdk.C2867c.GET_READY_IM_READY_PRESSED_RETY     // Catch:{ NoSuchFieldError -> 0x0112 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0112 }
                r0[r1] = r9     // Catch:{ NoSuchFieldError -> 0x0112 }
            L_0x0112:
                int[] r0 = f11489d     // Catch:{ NoSuchFieldError -> 0x011e }
                com.facetec.sdk.c r1 = com.facetec.sdk.C2867c.CAMERA2_ERROR     // Catch:{ NoSuchFieldError -> 0x011e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x011e }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x011e }
            L_0x011e:
                int[] r0 = f11489d     // Catch:{ NoSuchFieldError -> 0x012a }
                com.facetec.sdk.c r1 = com.facetec.sdk.C2867c.NON_FATAL_ERROR     // Catch:{ NoSuchFieldError -> 0x012a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012a }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x012a }
            L_0x012a:
                int[] r0 = f11489d     // Catch:{ NoSuchFieldError -> 0x0136 }
                com.facetec.sdk.c r1 = com.facetec.sdk.C2867c.SEVERE_ERROR     // Catch:{ NoSuchFieldError -> 0x0136 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0136 }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0136 }
            L_0x0136:
                int[] r0 = f11489d     // Catch:{ NoSuchFieldError -> 0x0142 }
                com.facetec.sdk.c r1 = com.facetec.sdk.C2867c.VOCAL_GUIDANCE_STARTED     // Catch:{ NoSuchFieldError -> 0x0142 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0142 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0142 }
            L_0x0142:
                int[] r0 = f11489d     // Catch:{ NoSuchFieldError -> 0x014e }
                com.facetec.sdk.c r1 = com.facetec.sdk.C2867c.CAMERA_LEGACY_ERROR     // Catch:{ NoSuchFieldError -> 0x014e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x014e }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x014e }
            L_0x014e:
                int[] r0 = f11489d     // Catch:{ NoSuchFieldError -> 0x015a }
                com.facetec.sdk.c r1 = com.facetec.sdk.C2867c.CAMERA_ERROR     // Catch:{ NoSuchFieldError -> 0x015a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x015a }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x015a }
            L_0x015a:
                int[] r0 = f11489d     // Catch:{ NoSuchFieldError -> 0x0166 }
                com.facetec.sdk.c r1 = com.facetec.sdk.C2867c.NFC_ERROR     // Catch:{ NoSuchFieldError -> 0x0166 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0166 }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0166 }
            L_0x0166:
                int[] r0 = f11489d     // Catch:{ NoSuchFieldError -> 0x0172 }
                com.facetec.sdk.c r1 = com.facetec.sdk.C2867c.NFC_USER_MOVED_DEVICE     // Catch:{ NoSuchFieldError -> 0x0172 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0172 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0172 }
            L_0x0172:
                int[] r0 = f11489d     // Catch:{ NoSuchFieldError -> 0x017e }
                com.facetec.sdk.c r1 = com.facetec.sdk.C2867c.DEFINITELY_BUG_IF_SEEN     // Catch:{ NoSuchFieldError -> 0x017e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x017e }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x017e }
            L_0x017e:
                int[] r0 = f11489d     // Catch:{ NoSuchFieldError -> 0x018a }
                com.facetec.sdk.c r1 = com.facetec.sdk.C2867c.STARTPREVIEW_EXCEPTION     // Catch:{ NoSuchFieldError -> 0x018a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x018a }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x018a }
            L_0x018a:
                int[] r0 = f11489d     // Catch:{ NoSuchFieldError -> 0x0196 }
                com.facetec.sdk.c r1 = com.facetec.sdk.C2867c.UNEXPECTED_NULL     // Catch:{ NoSuchFieldError -> 0x0196 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0196 }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0196 }
            L_0x0196:
                int[] r0 = f11489d     // Catch:{ NoSuchFieldError -> 0x01a2 }
                com.facetec.sdk.c r1 = com.facetec.sdk.C2867c.EXIT_SCREEN_TYPE     // Catch:{ NoSuchFieldError -> 0x01a2 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01a2 }
                r2 = 22
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01a2 }
            L_0x01a2:
                int[] r0 = f11489d     // Catch:{ NoSuchFieldError -> 0x01ae }
                com.facetec.sdk.c r1 = com.facetec.sdk.C2867c.EXIT_SCREEN_ELAPSED_TIME     // Catch:{ NoSuchFieldError -> 0x01ae }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01ae }
                r2 = 23
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01ae }
            L_0x01ae:
                int[] r0 = f11489d     // Catch:{ NoSuchFieldError -> 0x01ba }
                com.facetec.sdk.c r1 = com.facetec.sdk.C2867c.SESSION_RESULT_UNEXPECTED_NULL     // Catch:{ NoSuchFieldError -> 0x01ba }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01ba }
                r2 = 24
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01ba }
            L_0x01ba:
                int[] r0 = f11489d     // Catch:{ NoSuchFieldError -> 0x01c6 }
                com.facetec.sdk.c r1 = com.facetec.sdk.C2867c.PHOENIX_HANDLER_UNEXPECTED_NULL     // Catch:{ NoSuchFieldError -> 0x01c6 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01c6 }
                r2 = 25
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01c6 }
            L_0x01c6:
                int[] r0 = f11489d     // Catch:{ NoSuchFieldError -> 0x01d2 }
                com.facetec.sdk.c r1 = com.facetec.sdk.C2867c.ROOT_DEVICE_DETECTED     // Catch:{ NoSuchFieldError -> 0x01d2 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01d2 }
                r2 = 26
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01d2 }
            L_0x01d2:
                int[] r0 = f11489d     // Catch:{ NoSuchFieldError -> 0x01de }
                com.facetec.sdk.c r1 = com.facetec.sdk.C2867c.DEVICE_SYSTEM_PROPERTY_ANNOTATION_ERROR     // Catch:{ NoSuchFieldError -> 0x01de }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01de }
                r2 = 27
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01de }
            L_0x01de:
                int[] r0 = f11489d     // Catch:{ NoSuchFieldError -> 0x01ea }
                com.facetec.sdk.c r1 = com.facetec.sdk.C2867c.CANCEL_BUTTON_RESOURCE_ID_ERROR     // Catch:{ NoSuchFieldError -> 0x01ea }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01ea }
                r2 = 28
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01ea }
            L_0x01ea:
                int[] r0 = f11489d     // Catch:{ NoSuchFieldError -> 0x01f6 }
                com.facetec.sdk.c r1 = com.facetec.sdk.C2867c.LOW_MEMORY_ERROR     // Catch:{ NoSuchFieldError -> 0x01f6 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01f6 }
                r2 = 29
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01f6 }
            L_0x01f6:
                int[] r0 = f11489d     // Catch:{ NoSuchFieldError -> 0x0202 }
                com.facetec.sdk.c r1 = com.facetec.sdk.C2867c.LOW_MEMORY_WARNING     // Catch:{ NoSuchFieldError -> 0x0202 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0202 }
                r2 = 30
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0202 }
            L_0x0202:
                int[] r0 = f11489d     // Catch:{ NoSuchFieldError -> 0x020e }
                com.facetec.sdk.c r1 = com.facetec.sdk.C2867c.CAMERA_ALREADY_CLOSED     // Catch:{ NoSuchFieldError -> 0x020e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x020e }
                r2 = 31
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x020e }
            L_0x020e:
                int[] r0 = f11489d     // Catch:{ NoSuchFieldError -> 0x021a }
                com.facetec.sdk.c r1 = com.facetec.sdk.C2867c.F2F_ERROR     // Catch:{ NoSuchFieldError -> 0x021a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x021a }
                r2 = 32
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x021a }
            L_0x021a:
                int[] r0 = f11489d     // Catch:{ NoSuchFieldError -> 0x0226 }
                com.facetec.sdk.c r1 = com.facetec.sdk.C2867c.IMAGE_DATA_UNEXPECTED_NULL     // Catch:{ NoSuchFieldError -> 0x0226 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0226 }
                r2 = 33
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0226 }
            L_0x0226:
                int[] r0 = f11489d     // Catch:{ NoSuchFieldError -> 0x0232 }
                com.facetec.sdk.c r1 = com.facetec.sdk.C2867c.ON_RESUME_ERROR     // Catch:{ NoSuchFieldError -> 0x0232 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0232 }
                r2 = 34
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0232 }
            L_0x0232:
                int[] r0 = f11489d     // Catch:{ NoSuchFieldError -> 0x023e }
                com.facetec.sdk.c r1 = com.facetec.sdk.C2867c.UNEXPECTED_EARLY_EXIT_FACESCAN     // Catch:{ NoSuchFieldError -> 0x023e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x023e }
                r2 = 35
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x023e }
            L_0x023e:
                int[] r0 = f11489d     // Catch:{ NoSuchFieldError -> 0x024a }
                com.facetec.sdk.c r1 = com.facetec.sdk.C2867c.UNEXPECTED_EARLY_EXIT_IDSCAN     // Catch:{ NoSuchFieldError -> 0x024a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x024a }
                r2 = 36
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x024a }
            L_0x024a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3555s.C35583.<clinit>():void");
        }
    }

    /* renamed from: com.facetec.sdk.s$a */
    static class C3560a {

        /* renamed from: a */
        String f11490a;

        /* renamed from: e */
        int f11491e;

        private C3560a() {
        }

        /* synthetic */ C3560a(byte b) {
            this();
        }
    }

    /* renamed from: com.facetec.sdk.s$b */
    static class C3561b extends C2802au.C2806c {

        /* renamed from: d */
        private final C3471o f11492d;

        /* renamed from: e */
        private final Context f11493e;

        C3561b(Context context, C3471o oVar) {
            this.f11493e = context.getApplicationContext();
            this.f11492d = oVar;
        }

        /* renamed from: d */
        public final void mo8865d() {
            C3555s.m13896c(this.f11493e);
        }

        /* renamed from: e */
        public final void mo8866e(boolean z) {
            C3471o oVar = this.f11492d;
            int i = oVar.f11331f + 1;
            oVar.f11331f = i;
            if (i < 3) {
                C3555s.m13900c(this.f11493e, z, oVar);
            } else if (!z) {
                C3555s.m13912e(this.f11493e, oVar);
            }
        }
    }

    /* renamed from: com.facetec.sdk.s$d */
    enum C3562d {
        USER_CANCELLED,
        USER_FAILED,
        USER_WAS_SUCCESSFUL,
        PRE_SESSION_PHASE_1_TIMEOUT,
        PRE_SESSION_PHASE_2_TIMEOUT,
        SESSION_TIMEOUT,
        SESSION_CONTEXT_SWITCH,
        WAYPOINT_UPLOAD
    }

    static {
        init$0();
        f11485l = 1;
        m13885a();
        Color.green(0);
        ExpandableListView.getPackedPositionForGroup(0);
        ExpandableListView.getPackedPositionChild(0);
        int i = f11480f + 113;
        f11485l = i % 128;
        int i2 = i % 2;
    }

    C3555s() {
    }

    /* renamed from: a */
    static void m13885a() {
        char[] cArr = new char[1266];
        ByteBuffer.wrap(">\u0018îKµNç}/¹ßç\\¼lë\u001dFÍýûªHZ\nÀ;[ëãH.x 2ðk PÄaj1Áàv¢rÛ\u0003fÓµãÎ´MD¦\u0014Ä%nõ£Çüé,º\\D\u0016½íH\u001d\u0016N­~l®\u001aß«\u000f?\u001dhªtÈ\bÄY\u0014\u0000dË´¯\u0001Õú%v\u001dFü¨ç\u001a7Í\u0007£P\u001f¡\u001cqC\u0001³ÑñàE°¹@î\u0013@#óõ@R¦Ûv\u0006uÖ:ç·MG>\u0014$Iô?U]e72^³ñþ\n.^\u001fåO\u001a¿\\ìÑÜ\u001f\f@}ý ?ðjPÒalEôåb53\u0004Tr¤7(dø\u0017óX°i\u00119àÉ±,ªÿz£\u000b.ÛÔë¤0ûàr@%q!cÑ\"²Lb/\u0013ÃZó+ \u0018ð`PÉan1Á×~¢rÁ\u0003VÓµãÙ´pD± \u001eð}PÈay1ßÁÄr¢rÛ\u0003zÓ©ãÌ´?D\u0014Ö%võªÁV\u0006fù6Ç\u0010¢§Ëx\u001f\b¼Øõé\u001f¹ÿIð\u001a\u0003*ºúû\u0006[Tk±<_\t^H.·þýÏXS\u0012Só#Ì\u0012wB³²íáVÑ¤\u0001îp[ )ð{ 2ðl¼ùl©\u001cYÌ\u000bý¥­`]\u0011\u000e¬>U 2ðaPÓaj1ÁÏv¢rÆ\u0003|Ó©ãâ´{Òy\u0002 rÔ¢#ÃÖ3`%PÔñ\u001c!åáP\u001a\u001c (ðuQ½íñ\u001d!O\u0010áíL=\u0005Mý¡¬\u001büè\f¡_\u0019oèöB&\u0003Vå¼SY\u001b)çù·È\u0018¥hì;X\u000búÛ¿ª\u001azJ±\u001d\u0010íÌ½º\u001a\\Ú,§ÿoÏ¼nl>Ú\u000eôÑn¡Ãq@$\u0010ÉàÒ³9SÀ\"iò(Ârel5\u0004~Ô<¤wNG$\u0017¸8h}\u0018ÈØùw©YÔ\nR:êÎsK½{×,bÉ<\u0019yi¹ÄGØ(Ù{jKêh:à\n]?­¦ \u0018ðnPÏan1Áq¢rÃ\u0003vÓçãØ´zD \u0014Å%~õ»V\u0001f¤6ÍÇC 8ðnPÂay1Áór¢rÂ\u0003zÓ´ãØ´vD¬\u0014Ù 2ðaPÓab1ÁÏQ¢rÌ\u0003vÓãÈ´~D­\u0014ð%~õ»áV\u0002fª6ÛÇ\u001a¾nÛ\u001e%Îwÿí¯)_w\fÌ<\u0014ìuÉM\u001f}{*ÎJÓ:-êÛå!{(Ä\u0018\u0013È|¹Ôi\u0015Yy\u000eÏþ\u001b®n )ðjPÕar1¬ÁÊs¢rí\u0003jÓãÂ´{D¦E!bå5Ý\u0004zT°¤Î÷kÇ¡\u0017Âfz¶«Ú )ðjPÒag1Áög¢rÀ\u0003rÓ£FÛæI6-\u0007Wx§\u0019ôÄs\u00144e 5ðiPôa1ÁÑc )ðjPÒag1ÁìT¢© =ðzPËaX1ÁÐd¢rÀ\u0003}Óãß´~D±\u0014ÃDa7äÚ4¨\u00053UÃ¥ö3Æï\u0016g\u001c·ÿÐ& çp¹A.ýá2T\u0002×R£ZóØÃ\u001cSlê¼£Ó<\u0003js£õnÂ2ÇanQ²ÂðA ¢\u0010ÊG{·ºççÖi\u0006ªvÀ¥\u0014®ÅÛ =ðnPÂaX1ÁÂy¢¸rÎ\u0003Ó«ãÉ´~D \u0014Ü%Xõ®ßV\u000bf®6Û\u0013BÃ\u0014³ùcR\u0010\u0002àò¹¡\u0010ÌA¼0?àÜÐ´\u0005wÄ'\u0016\rÆÞ¶ºewUô\u0005¯ôy¤û Kp;ÉëÚGÄz){\u0019Ü°`Ê\u0010'ÀUñÎ¡>Qg\u0002Î2\u0012âbáC\u0002sj$ÛÔ\u001aGµÉe\n\u0015`Æ´ö\u000e¦{W\u0007\u00127oè½\nm}½(ÍÇ\u001d,%|Òß0ïË?¸N\"à®ù\u001b\tàYh<¸ÞÈ\u001bD+ç{¾@Úùê5OEð¦¤B¬Ô|\f{Ü9í½qM&\u001e.Dþ=_Io\u00108ÈM/©yA\t<6õæ¬gF\u0003w­'V×'±´Pd\u0004\u0015¶Åaõ\u000f¢³RG\u0002\u00113°ãd\u0011@Ä ?ðjPÂag1ÁÓr¢rú\u0003`Ó¢ãÏ´VD\u0014ä%xõ®ÝV$fª6ÓÇ\u000fµ§Úx\f\b¸ 8ðnPÂay1ÁR¢rÝ\u0003|Óµ 5ð`Páaj1ÁÂ{¢¾rÝ\u0003aÓ¨ãÙøE(\u0007Xè¯¹\u0014é÷\u0019J\bzäª­Û\fï~?3OÃ®4þë\u000e]-mÌ½Ì.\u001c÷,{\u001fäÛê::èJP 8ðnPÂay1Áïr¢rÎ\u0003pÓ¾ãî´mD±\u0014Ø%iÃÈ\u0013cn³2Òn\"\u0016qAy0à 5ðiPâay1ÁÌe 5ðiPòax1ÁÑZ¢rÙ\u0003vÓ£ãï´zDµ\u0014Þ%xõª ?ðjPÎae1Á×r¢rÖ\u0003QÓ²ãÌ´VD¥\u0014ä%~õªÝ (ð{PÕa1¯ÁÑr¢rÆ\u0003vÓ°ãî´gD \u0014Ò%kõ»ÚV\bf¥È\u000e\u0018Ah¶¸ÿ[Ùº)àzCJ¾ëë};\u000bç\\S >ðwPÓaX1ÁÑr¢rÁ\u0003GÓ¾ãÛ´z >ðwPÓaX1ÁÑr¢rÁ\u0003VÓ«ãÊ´oD°\u0014Ò%õÚV\nf® (ðjPÔab1ÁÍE¢rÜ\u0003fÓ«ãß´JD­\u0014Ò%cõ¿ÖV\u0004f¿6ÚÇ\u0007§Îx\u0003\b¿ +ðgPÂae1ÁÛ_¢rÁ\u0003wÓ«ãÎ´mD\u0014Ù%~õ·ÃV\u0002f¨6ËÇ\u0006³§õx\u001a\b¿Øë :ðgPÃÀ\u0010Ù`0ÛO\u000b\u001a{ö«¹\u0019Ûñ\u000b¤{PÓv\u0003#sÅáY·)I =ð=Pâay1ÁÌe\u0001ÑÃ¡5qB@Ë\u0010*àc³ã4Sk\"Êò\u0016ÂoÝe\u00165s\u0004ÞÔ ¤gwªG\u0006 4ð}Tíô\u001a$S\u0015÷E\u0016µLæïÖ\u0012\u0006GwÚ§*UÀÿ06`~Qï*ñK\"­\u0012&BP³ã\bÓT\f|1¬JÍ7=}n^>g \u000eðaPßa{1ÁÀc¢rË\u0003VÓ¦ãÙ´sDº\u0014ò%cõ¦ÇV.f6ìÇ\u0000¶§Õx.\b½Øãé\u0019¹°Iê\u001a\u0013\u001dÓÍ½ym-\búØõ¨\tx<I²\u0019Qé\u0010º»HZ\u0001+°û=Ë\"±lx<\u0019\r¤Ý5­ ~ÓNw\u001e\nï¿ LP `ð.Á÷la72Ä\u0002rÒ=£ÀsC6\u0014äÙ /ð}PÂ =ðnPÔan {ð/Pa+1ÁÂd¢¬rÆ\u0003}Ó£ãÄ´hD\u0014Ø%xõºÀV]fë\u0017Ç·0g\"V\u0006}ö'¥}E\"4ä\u001eÔh`4°`ÀÁd´õ¬%íU\u0006l´ãä\u0019\u0014@GÙw8 >ðyPÉa1¶Áç +ðjPáaj1ÁÆC¢rÌ\u0003@Ó¢ãØ´lDª\u0014Ø%uõ÷7\u0003yò©µÙZ\t\u00058³hw\u000eË¯ûRAE\u0014áý1¼".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1266);
        f11484j = cArr;
        f11481g = 3463690314979864591L;
    }

    /* renamed from: c */
    static /* synthetic */ void m13900c(Context context, boolean z, C3471o oVar) {
        int i = f11480f + 49;
        f11485l = i % 128;
        char c = i % 2 == 0 ? (char) 12 : 16;
        m13913e(context, z, oVar);
        if (c == 12) {
            throw null;
        }
    }

    /* renamed from: e */
    static /* synthetic */ void m13912e(Context context, C3471o oVar) {
        int i = f11485l + 19;
        f11480f = i % 128;
        int i2 = i % 2;
        m13899c(context, oVar);
        int i3 = f11480f + 73;
        f11485l = i3 % 128;
        int i4 = i3 % 2;
    }

    static void init$0() {
        $$a = new byte[]{50, 0, 6, 122};
        $$b = 88;
    }

    /* renamed from: k */
    private static void m13918k(int i, char c, int i2, Object[] objArr) {
        char c2;
        Class<Object> cls;
        char c3;
        Throwable cause;
        int i3 = i2;
        C3170gl glVar = new C3170gl();
        long[] jArr = new long[i3];
        glVar.f10462e = 0;
        int i4 = $11 + 73;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (true) {
            int i6 = glVar.f10462e;
            if (i6 < i3) {
                c2 = 'M';
            } else {
                c2 = 14;
            }
            cls = Object.class;
            if (c2 == 14) {
                break;
            }
            try {
                Object[] objArr2 = {Integer.valueOf(f11484j[i + i6])};
                Map<Integer, Object> map = C2854bp.f9335p;
                Object obj = map.get(-862652166);
                if (obj == null) {
                    byte b = (byte) $$a[1];
                    byte b2 = (byte) b;
                    Object[] objArr3 = new Object[1];
                    m13919m(b, b2, (byte) (b2 | 9), objArr3);
                    obj = ((Class) C2854bp.m11559b((char) (25755 - (ViewConfiguration.getPressedStateDuration() >> 16)), 807 - (SystemClock.elapsedRealtime() > 0 ? 1 : (SystemClock.elapsedRealtime() == 0 ? 0 : -1)), 31 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)))).getMethod((String) objArr3[0], new Class[]{Integer.TYPE});
                    map.put(-862652166, obj);
                }
                long longValue = ((Long) ((Method) obj).invoke((Object) null, objArr2)).longValue();
                long j = (long) glVar.f10462e;
                long j2 = f11481g;
                try {
                    Object[] objArr4 = new Object[4];
                    objArr4[3] = Integer.valueOf(c);
                    objArr4[2] = Long.valueOf(j2);
                    objArr4[1] = Long.valueOf(j);
                    objArr4[0] = Long.valueOf(longValue);
                    Object obj2 = map.get(636543849);
                    if (obj2 == null) {
                        byte b3 = (byte) $$a[1];
                        byte b4 = (byte) b3;
                        Object[] objArr5 = new Object[1];
                        m13919m(b3, b4, (byte) (b4 + 2), objArr5);
                        Class cls2 = Long.TYPE;
                        obj2 = ((Class) C2854bp.m11559b((char) (63563 - (ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1))), 1193 - TextUtils.getCapsMode("", 0, 0), 22 - TextUtils.lastIndexOf("", '0', 0, 0))).getMethod((String) objArr5[0], new Class[]{cls2, cls2, cls2, Integer.TYPE});
                        map.put(636543849, obj2);
                    }
                    jArr[i6] = ((Long) ((Method) obj2).invoke((Object) null, objArr4)).longValue();
                    try {
                        Object[] objArr6 = new Object[2];
                        objArr6[1] = glVar;
                        objArr6[0] = glVar;
                        Object obj3 = map.get(1311658762);
                        if (obj3 == null) {
                            byte b5 = (byte) $$a[1];
                            byte b6 = (byte) b5;
                            Object[] objArr7 = new Object[1];
                            m13919m(b5, b6, (byte) b6, objArr7);
                            obj3 = ((Class) C2854bp.m11559b((char) (2499 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), (Process.myPid() >> 22) + 1113, 24 - TextUtils.getOffsetAfter("", 0))).getMethod((String) objArr7[0], new Class[]{cls, cls});
                            map.put(1311658762, obj3);
                        }
                        ((Method) obj3).invoke((Object) null, objArr6);
                        int i7 = $10 + 35;
                        $11 = i7 % 128;
                        int i8 = i7 % 2;
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
            } finally {
                Throwable cause2 = th.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
            }
        }
        char[] cArr = new char[i3];
        glVar.f10462e = 0;
        while (true) {
            int i9 = glVar.f10462e;
            if (i9 < i3) {
                c3 = 15;
            } else {
                c3 = '!';
            }
            if (c3 != 15) {
                objArr[0] = new String(cArr);
                return;
            }
            cArr[i9] = (char) ((int) jArr[i9]);
            try {
                Object[] objArr8 = new Object[2];
                objArr8[1] = glVar;
                objArr8[0] = glVar;
                Map<Integer, Object> map2 = C2854bp.f9335p;
                Object obj4 = map2.get(1311658762);
                if (obj4 == null) {
                    byte b7 = (byte) $$a[1];
                    byte b8 = (byte) b7;
                    Object[] objArr9 = new Object[1];
                    m13919m(b7, b8, (byte) b8, objArr9);
                    obj4 = ((Class) C2854bp.m11559b((char) (2499 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)) + 1112, 23 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)))).getMethod((String) objArr9[0], new Class[]{cls, cls});
                    map2.put(1311658762, obj4);
                }
                ((Method) obj4).invoke((Object) null, objArr8);
                int i12 = $10 + 31;
                $11 = i12 % 128;
                int i13 = i12 % 2;
            } catch (Throwable th2) {
                Throwable cause3 = th2.getCause();
                if (cause3 != null) {
                    throw cause3;
                }
                throw th2;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m13919m(byte r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = $$a
            int r8 = r8 * 4
            int r8 = r8 + 4
            int r7 = r7 * 3
            int r7 = r7 + 1
            int r9 = 116 - r9
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L_0x0015
            r3 = r9
            r4 = r2
            r9 = r7
            goto L_0x002e
        L_0x0015:
            r3 = r2
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r6
        L_0x001a:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L_0x0029
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L_0x0029:
            byte r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r6
        L_0x002e:
            int r3 = -r3
            int r7 = r7 + r3
            int r8 = r8 + 1
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3555s.m13919m(byte, byte, byte, java.lang.Object[]):void");
    }

    /* renamed from: a */
    static void m13887a(Context context, String str, ArrayList<String> arrayList, String str2, C3583t tVar, String str3) {
        int i = f11485l + 89;
        f11480f = i % 128;
        int i2 = i % 2;
        if (!m13894b()) {
            int i3 = f11485l + 79;
            f11480f = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        boolean z = true;
        Object[] objArr = new Object[1];
        m13918k(View.getDefaultSize(0, 0) + 321, (char) (38931 - (ViewConfiguration.getPressedStateDuration() >> 16)), 14 - (Process.myPid() >> 22), objArr);
        C2885cd.m11776I(((String) objArr[0]).intern(), 1);
        String v = C2885cd.m11862v(C2750a.m10679a());
        if (v.equals("")) {
            if (!(!str2.equals(""))) {
                int i5 = f11480f + 99;
                f11485l = i5 % 128;
                if (i5 % 2 == 0) {
                    z = false;
                }
                if (z) {
                    if (tVar == C3583t.FACE_SCAN) {
                        int i6 = f11480f + 119;
                        f11485l = i6 % 128;
                        int i7 = i6 % 2;
                        return;
                    }
                    m13913e(context.getApplicationContext(), false, new C3471o(v, tVar, m13890b(arrayList), str, str2, C2888cg.f9551c, C2888cg.f9550b, str3));
                }
                C3583t tVar2 = C3583t.FACE_SCAN;
                throw null;
            }
        } else {
            String str4 = str2;
        }
        C3583t tVar3 = tVar;
        m13913e(context.getApplicationContext(), false, new C3471o(v, tVar, m13890b(arrayList), str, str2, C2888cg.f9551c, C2888cg.f9550b, str3));
    }

    /* renamed from: b */
    private static String m13889b(C2867c cVar) {
        int i = f11485l + 97;
        f11480f = i % 128;
        if (i % 2 == 0) {
            int i2 = C35583.f11489d[cVar.ordinal()];
            if (i2 == 1) {
                Object[] objArr = new Object[1];
                m13918k(ViewConfiguration.getDoubleTapTimeout() >> 16, (char) ((TypedValue.complexToFraction(0, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON) > Utils.FLOAT_EPSILON ? 1 : (TypedValue.complexToFraction(0, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON) == Utils.FLOAT_EPSILON ? 0 : -1)) + 7717), ExpandableListView.getPackedPositionChild(0) + 22, objArr);
                String intern = ((String) objArr[0]).intern();
                int i3 = f11485l + 19;
                f11480f = i3 % 128;
                int i4 = i3 % 2;
                return intern;
            } else if (i2 == 2) {
                Object[] objArr2 = new Object[1];
                m13918k(21 - View.MeasureSpec.getSize(0), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), ImageFormat.getBitsPerPixel(0) + 20, objArr2);
                return ((String) objArr2[0]).intern();
            } else if (i2 == 3) {
                Object[] objArr3 = new Object[1];
                m13918k(41 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)), (char) (56531 - TextUtils.lastIndexOf("", '0', 0)), (Process.myPid() >> 22) + 16, objArr3);
                return ((String) objArr3[0]).intern();
            } else if (i2 == 4) {
                Object[] objArr4 = new Object[1];
                m13918k(56 - Color.red(0), (char) (View.resolveSize(0, 0) + 58475), Color.blue(0) + 14, objArr4);
                String intern2 = ((String) objArr4[0]).intern();
                int i5 = f11480f + 87;
                f11485l = i5 % 128;
                int i6 = i5 % 2;
                return intern2;
            } else if (i2 != 5) {
                return m13909e(cVar);
            } else {
                Object[] objArr5 = new Object[1];
                m13918k(KeyEvent.getDeadChar(0, 0) + 70, (char) (33059 - KeyEvent.normalizeMetaState(0)), AndroidCharacter.getMirror('0') - '$', objArr5);
                String intern3 = ((String) objArr5[0]).intern();
                int i7 = f11485l + 77;
                f11480f = i7 % 128;
                int i8 = i7 % 2;
                return intern3;
            }
        } else {
            int i9 = C35583.f11489d[cVar.ordinal()];
            throw null;
        }
    }

    /* renamed from: c */
    private static String m13895c(C2952dm dmVar) {
        int i = f11485l + 33;
        f11480f = i % 128;
        if ((i % 2 != 0 ? 'B' : '/') != 'B') {
            int i2 = C35583.f11488c[dmVar.ordinal()];
            if (i2 == 1) {
                Object[] objArr = new Object[1];
                m13918k(112 - (ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)), (char) (Process.getGidForName("") + 26107), (Process.myPid() >> 22) + 7, objArr);
                String intern = ((String) objArr[0]).intern();
                int i3 = f11480f + 99;
                f11485l = i3 % 128;
                int i4 = i3 % 2;
                return intern;
            } else if (i2 == 2) {
                Object[] objArr2 = new Object[1];
                m13918k((KeyEvent.getMaxKeyCode() >> 16) + 119, (char) (2166 - (ViewConfiguration.getTouchSlop() >> 8)), Color.blue(0) + 13, objArr2);
                return ((String) objArr2[0]).intern();
            } else if (i2 == 3) {
                Object[] objArr3 = new Object[1];
                m13918k((AudioTrack.getMinVolume() > Utils.FLOAT_EPSILON ? 1 : (AudioTrack.getMinVolume() == Utils.FLOAT_EPSILON ? 0 : -1)) + 132, (char) (TextUtils.getOffsetAfter("", 0) + 4338), 13 - (Process.myPid() >> 22), objArr3);
                return ((String) objArr3[0]).intern();
            } else if (i2 != 4) {
                return "";
            } else {
                Object[] objArr4 = new Object[1];
                m13918k(TextUtils.getCapsMode("", 0, 0) + 145, (char) (ViewConfiguration.getTouchSlop() >> 8), 15 - Gravity.getAbsoluteGravity(0, 0), objArr4);
                return ((String) objArr4[0]).intern();
            }
        } else {
            int i5 = C35583.f11488c[dmVar.ordinal()];
            throw null;
        }
    }

    /* renamed from: d */
    static void m13905d(Context context, C2949dl.C2951d dVar) {
        C2999ed edVar = new C2999ed();
        Object[] objArr = new Object[1];
        m13918k(ExpandableListView.getPackedPositionType(0) + 82, (char) (34546 - TextUtils.lastIndexOf("", '0', 0)), 14 - (ViewConfiguration.getTapTimeout() >> 16), objArr);
        edVar.mo9175e(((String) objArr[0]).intern(), dVar.f9998q);
        Object[] objArr2 = new Object[1];
        m13918k(95 - TextUtils.lastIndexOf("", '0', 0), (char) (32394 - Process.getGidForName("")), ((byte) KeyEvent.getModifierMetaStateMask()) + 12, objArr2);
        edVar.mo9175e(((String) objArr2[0]).intern(), FaceTecSDK.f8630e.vocalGuidanceCustomization.mode.toString());
        m13904d(context, C2867c.VOCAL_GUIDANCE_STARTED, (C3000ee) edVar);
        int i = f11485l + 61;
        f11480f = i % 128;
        if (i % 2 != 0) {
            int i2 = 13 / 0;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ void m13911e(Context context) {
        int i = f11485l + 111;
        f11480f = i % 128;
        if (i % 2 != 0) {
            throw null;
        } else if (f11483i || context != null) {
            Context applicationContext = context.getApplicationContext();
            C3471o a = m13883a(applicationContext);
            if ((a != null ? 'C' : '-') != '-') {
                m13913e(applicationContext, true, a);
                int i2 = f11485l + 53;
                f11480f = i2 % 128;
                int i3 = i2 % 2;
            }
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: d */
    static void m13906d(Context context, C3562d dVar) {
        double d;
        int i = f11480f + 93;
        f11485l = i % 128;
        int i2 = i % 2;
        if ((dVar != C3562d.USER_WAS_SUCCESSFUL ? '0' : '&') != '&') {
            int i3 = f11485l + 105;
            f11480f = i3 % 128;
            if ((i3 % 2 != 0 ? '$' : '@') != '$') {
                d = ((double) (System.currentTimeMillis() - f11482h)) / 1000.0d;
            } else {
                d = ((double) (System.currentTimeMillis() - f11482h)) - 1000.0d;
            }
            m13898c(context, C2867c.EXIT_SCREEN_TYPE, m13910e(f11475a));
            m13898c(context, C2867c.EXIT_SCREEN_ELAPSED_TIME, String.valueOf(d));
        }
    }

    /* renamed from: e */
    private static void m13913e(Context context, boolean z, C3471o oVar) {
        int i = f11485l + 19;
        f11480f = i % 128;
        if ((i % 2 != 0 ? '`' : 'S') == 'S') {
            m13914e((Runnable) new C3731zj(context.getApplicationContext(), context, oVar, z));
        } else {
            m13914e((Runnable) new C3731zj(context.getApplicationContext(), context, oVar, z));
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00f0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00f1  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m13897c(android.content.Context r19, com.facetec.sdk.C2784ak r20, boolean r21, com.facetec.sdk.C2848bl.C2850d r22, java.lang.String r23) {
        /*
            r1 = r19
            r0 = r20
            int r2 = f11480f
            int r2 = r2 + 27
            int r3 = r2 % 128
            f11485l = r3
            r3 = 2
            int r2 = r2 % r3
            if (r1 == 0) goto L_0x03a1
            boolean r2 = m13894b()
            if (r2 == 0) goto L_0x03a1
            if (r0 != 0) goto L_0x001a
            goto L_0x03a1
        L_0x001a:
            int r2 = r0.f8862b
            int r4 = r0.f8861a
            com.facetec.sdk.ed r5 = new com.facetec.sdk.ed
            r5.<init>()
            r6 = 1
            r7 = 0
            if (r21 == 0) goto L_0x0029
            r8 = r6
            goto L_0x002a
        L_0x0029:
            r8 = r7
        L_0x002a:
            r9 = 0
            r11 = 48
            java.lang.String r12 = ""
            r13 = 0
            if (r8 == 0) goto L_0x00af
            java.lang.Boolean r0 = com.facetec.sdk.C2780ai.m10766e((android.content.Context) r19)     // Catch:{ ah -> 0x003c }
            boolean r0 = r0.booleanValue()     // Catch:{ ah -> 0x003c }
            goto L_0x007b
        L_0x003c:
            r0 = move-exception
            r0.printStackTrace()
            com.facetec.sdk.c r8 = com.facetec.sdk.C2867c.CAMERA_ERROR
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            long r15 = android.widget.ExpandableListView.getPackedPositionForChild(r7, r7)
            int r15 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            int r15 = r15 + 161
            int r16 = android.os.Process.getGidForName(r12)
            int r9 = r16 + 1
            char r9 = (char) r9
            int r10 = android.text.TextUtils.lastIndexOf(r12, r11)
            int r10 = r10 + 39
            java.lang.Object[] r11 = new java.lang.Object[r6]
            m13918k(r15, r9, r10, r11)
            r9 = r11[r7]
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r9 = r9.intern()
            r14.append(r9)
            java.lang.String r0 = r0.toString()
            r14.append(r0)
            java.lang.String r0 = r14.toString()
            m13898c((android.content.Context) r1, (com.facetec.sdk.C2867c) r8, (java.lang.String) r0)
            r0 = r6
        L_0x007b:
            int r8 = android.os.Process.myTid()
            int r8 = r8 >> 22
            int r8 = r8 + 198
            r9 = 44595(0xae33, float:6.2491E-41)
            int r10 = android.view.MotionEvent.axisFromString(r12)
            int r9 = r9 - r10
            char r9 = (char) r9
            float r10 = android.media.AudioTrack.getMaxVolume()
            int r10 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            int r10 = 6 - r10
            java.lang.Object[] r11 = new java.lang.Object[r6]
            m13918k(r8, r9, r10, r11)
            r8 = r11[r7]
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r8 = r8.intern()
            byte[][] r0 = com.facetec.sdk.C2885cd.m11804ah(r0, r2, r4)
            int r9 = f11485l
            int r9 = r9 + 35
        L_0x00a9:
            int r10 = r9 % 128
            f11480f = r10
            int r9 = r9 % r3
            goto L_0x00ed
        L_0x00af:
            int r2 = r0.f8861a
            int r4 = r0.f8862b
            float r0 = android.graphics.PointF.length(r13, r13)
            int r0 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            int r0 = 203 - r0
            int r8 = android.view.View.combineMeasuredStates(r7, r7)
            int r8 = 29487 - r8
            char r8 = (char) r8
            int r9 = android.view.View.combineMeasuredStates(r7, r7)
            int r9 = r9 + 11
            java.lang.Object[] r10 = new java.lang.Object[r6]
            m13918k(r0, r8, r9, r10)
            r0 = r10[r7]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r8 = r0.intern()
            com.facetec.sdk.bl$d r0 = com.facetec.sdk.C2848bl.C2850d.FRONT
            r9 = r22
            if (r9 != r0) goto L_0x00dd
            r0 = r7
            goto L_0x00de
        L_0x00dd:
            r0 = r6
        L_0x00de:
            if (r0 == 0) goto L_0x00e9
            byte[][] r0 = com.facetec.sdk.C2885cd.m11854q()
            int r9 = f11485l
            int r9 = r9 + 49
            goto L_0x00a9
        L_0x00e9:
            byte[][] r0 = com.facetec.sdk.C2885cd.m11853p()
        L_0x00ed:
            int r9 = r0.length
            if (r9 != 0) goto L_0x00f1
            return
        L_0x00f1:
            boolean r9 = f11483i
            if (r9 != 0) goto L_0x0104
            r9 = r0[r7]
            int r9 = r9.length
            int r10 = r2 * r4
            int r10 = r10 << r3
            if (r9 != r10) goto L_0x00fe
            goto L_0x0104
        L_0x00fe:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x0104:
            int r9 = android.view.ViewConfiguration.getMaximumFlingVelocity()
            int r9 = r9 >> 16
            int r9 = r9 + 214
            float r10 = android.media.AudioTrack.getMaxVolume()
            int r10 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            int r10 = 1 - r10
            char r10 = (char) r10
            int r11 = android.view.View.resolveSize(r7, r7)
            int r11 = 2 - r11
            java.lang.Object[] r14 = new java.lang.Object[r6]
            m13918k(r9, r10, r11, r14)
            r9 = r14[r7]
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r9 = r9.intern()
            int r10 = android.graphics.Color.red(r7)
            int r10 = r10 + 216
            int r11 = android.text.TextUtils.indexOf(r12, r12, r7, r7)
            char r11 = (char) r11
            int r14 = android.view.ViewConfiguration.getFadingEdgeLength()
            int r14 = r14 >> 16
            int r14 = 2 - r14
            java.lang.Object[] r15 = new java.lang.Object[r6]
            m13918k(r10, r11, r14, r15)
            r10 = r15[r7]
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r10 = r10.intern()
            r5.mo9175e(r9, r10)
            float r9 = android.media.AudioTrack.getMaxVolume()
            int r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            int r9 = 219 - r9
            r10 = 40140(0x9ccc, float:5.6248E-41)
            r11 = 48
            int r14 = android.text.TextUtils.lastIndexOf(r12, r11, r7, r7)
            int r14 = r14 + r10
            char r10 = (char) r14
            char r14 = android.text.AndroidCharacter.getMirror(r11)
            int r14 = 57 - r14
            java.lang.Object[] r15 = new java.lang.Object[r6]
            m13918k(r9, r10, r14, r15)
            r9 = r15[r7]
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r9 = r9.intern()
            r5.mo9175e(r9, r8)
            char r8 = android.text.AndroidCharacter.getMirror(r11)
            int r8 = 275 - r8
            r9 = 0
            int r11 = android.widget.ExpandableListView.getPackedPositionType(r9)
            char r9 = (char) r11
            int r10 = android.view.View.resolveSize(r7, r7)
            int r10 = 14 - r10
            java.lang.Object[] r11 = new java.lang.Object[r6]
            m13918k(r8, r9, r10, r11)
            r8 = r11[r7]
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r8 = r8.intern()
            java.lang.String r9 = com.facetec.sdk.C2840bg.m11351b((android.content.Context) r19)
            r5.mo9175e(r8, r9)
            int r8 = android.view.KeyEvent.getDeadChar(r7, r7)
            int r8 = r8 + 241
            r9 = 62021(0xf245, float:8.691E-41)
            r10 = 48
            int r11 = android.text.TextUtils.indexOf(r12, r10, r7)
            int r9 = r9 - r11
            char r9 = (char) r9
            float r10 = android.graphics.PointF.length(r13, r13)
            int r10 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            int r10 = r10 + 12
            java.lang.Object[] r11 = new java.lang.Object[r6]
            m13918k(r8, r9, r10, r11)
            r8 = r11[r7]
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r8 = r8.intern()
            r9 = r23
            r5.mo9175e(r8, r9)
            com.facetec.sdk.ed r8 = new com.facetec.sdk.ed
            r8.<init>()
            float r9 = android.graphics.PointF.length(r13, r13)
            int r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            int r9 = r9 + 253
            int r10 = android.view.ViewConfiguration.getScrollBarFadeDuration()
            int r10 = r10 >> 16
            r11 = 49532(0xc17c, float:6.9409E-41)
            int r11 = r11 - r10
            char r10 = (char) r11
            int r11 = android.graphics.drawable.Drawable.resolveOpacity(r7, r7)
            int r11 = 1 - r11
            java.lang.Object[] r13 = new java.lang.Object[r6]
            m13918k(r9, r10, r11, r13)
            r9 = r13[r7]
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r9 = r9.intern()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
            r8.mo9174c((java.lang.String) r9, (java.lang.Number) r10)
            int r9 = android.view.ViewConfiguration.getJumpTapTimeout()
            int r9 = r9 >> 16
            int r9 = 254 - r9
            int r10 = android.view.KeyEvent.getModifierMetaStateMask()
            byte r10 = (byte) r10
            int r10 = r10 + 14896
            char r10 = (char) r10
            int r11 = android.view.ViewConfiguration.getKeyRepeatTimeout()
            int r11 = r11 >> 16
            int r11 = 1 - r11
            java.lang.Object[] r13 = new java.lang.Object[r6]
            m13918k(r9, r10, r11, r13)
            r9 = r13[r7]
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r9 = r9.intern()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            r8.mo9174c((java.lang.String) r9, (java.lang.Number) r10)
            int r9 = android.view.ViewConfiguration.getPressedStateDuration()
            int r9 = r9 >> 16
            int r9 = 255 - r9
            r10 = 48
            int r11 = android.text.TextUtils.indexOf(r12, r10, r7)
            int r10 = -1 - r11
            char r10 = (char) r10
            int r11 = android.view.ViewConfiguration.getTouchSlop()
            int r11 = r11 >> 8
            int r11 = 2 - r11
            java.lang.Object[] r13 = new java.lang.Object[r6]
            m13918k(r9, r10, r11, r13)
            r9 = r13[r7]
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r9 = r9.intern()
            r5.mo9173c((java.lang.String) r9, (com.facetec.sdk.C3000ee) r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r2, r4, r9)
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream
            r4.<init>()
            int r9 = r0.length
            r10 = r7
        L_0x025f:
            r11 = 3
            if (r10 >= r9) goto L_0x02c4
            r13 = r0[r10]
            java.nio.ByteBuffer r13 = java.nio.ByteBuffer.wrap(r13)
            r2.copyPixelsFromBuffer(r13)
            r4.reset()
            r13 = 100
            if (r21 == 0) goto L_0x029f
            int r14 = f11480f
            int r14 = r14 + 115
            int r15 = r14 % 128
            f11485l = r15
            int r14 = r14 % r3
            r15 = 32
            if (r14 != 0) goto L_0x0282
            r14 = 19
            goto L_0x0283
        L_0x0282:
            r14 = r15
        L_0x0283:
            if (r14 == r15) goto L_0x0292
            int r13 = com.facetec.sdk.C2780ai.f8832j
            float r13 = (float) r13
            android.graphics.Bitmap r13 = m13888b(r2, r13)
            android.graphics.Bitmap$CompressFormat r14 = android.graphics.Bitmap.CompressFormat.PNG
            r13.compress(r14, r11, r4)
            goto L_0x02a4
        L_0x0292:
            int r11 = com.facetec.sdk.C2780ai.f8832j
            float r11 = (float) r11
            android.graphics.Bitmap r11 = m13888b(r2, r11)
            android.graphics.Bitmap$CompressFormat r14 = android.graphics.Bitmap.CompressFormat.PNG
            r11.compress(r14, r13, r4)
            goto L_0x02a4
        L_0x029f:
            android.graphics.Bitmap$CompressFormat r11 = android.graphics.Bitmap.CompressFormat.PNG
            r2.compress(r11, r13, r4)
        L_0x02a4:
            byte[] r11 = r4.toByteArray()
            java.lang.String r11 = android.util.Base64.encodeToString(r11, r3)
            com.facetec.sdk.s$a r13 = new com.facetec.sdk.s$a
            r13.<init>(r7)
            long r14 = java.lang.System.currentTimeMillis()
            r17 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 / r17
            int r14 = (int) r14
            r13.f11491e = r14
            r13.f11490a = r11
            r8.add(r13)
            int r10 = r10 + 1
            goto L_0x025f
        L_0x02c4:
            com.facetec.sdk.dz r0 = new com.facetec.sdk.dz
            r0.<init>()
            java.util.Iterator r2 = r8.iterator()
        L_0x02cd:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x033c
            java.lang.Object r3 = r2.next()
            com.facetec.sdk.s$a r3 = (com.facetec.sdk.C3555s.C3560a) r3
            com.facetec.sdk.ed r4 = new com.facetec.sdk.ed
            r4.<init>()
            long r8 = android.view.ViewConfiguration.getGlobalActionKeyTimeout()
            r13 = 0
            int r8 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            int r8 = r8 + 256
            int r9 = android.view.ViewConfiguration.getPressedStateDuration()
            int r9 = r9 >> 16
            int r9 = 29071 - r9
            char r9 = (char) r9
            int r10 = android.graphics.drawable.Drawable.resolveOpacity(r7, r7)
            int r10 = 5 - r10
            java.lang.Object[] r13 = new java.lang.Object[r6]
            m13918k(r8, r9, r10, r13)
            r8 = r13[r7]
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r8 = r8.intern()
            java.lang.String r9 = r3.f11490a
            r4.mo9175e(r8, r9)
            r8 = 48
            int r9 = android.text.TextUtils.lastIndexOf(r12, r8, r7, r7)
            int r8 = 261 - r9
            r9 = 52579(0xcd63, float:7.3679E-41)
            r13 = 0
            int r10 = android.widget.ExpandableListView.getPackedPositionType(r13)
            int r10 = r10 + r9
            char r9 = (char) r10
            int r10 = android.graphics.Color.red(r7)
            int r10 = r10 + 9
            java.lang.Object[] r15 = new java.lang.Object[r6]
            m13918k(r8, r9, r10, r15)
            r8 = r15[r7]
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r8 = r8.intern()
            int r3 = r3.f11491e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.mo9174c((java.lang.String) r8, (java.lang.Number) r3)
            r0.mo9149e(r4)
            goto L_0x02cd
        L_0x033c:
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r7)
            int r2 = r2 + 271
            double r3 = android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(r7)
            r8 = 0
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            r4 = 54911(0xd67f, float:7.6947E-41)
            int r3 = r3 + r4
            char r3 = (char) r3
            r4 = 48
            int r4 = android.text.TextUtils.lastIndexOf(r12, r4, r7)
            int r11 = r11 - r4
            java.lang.Object[] r4 = new java.lang.Object[r6]
            m13918k(r2, r3, r11, r4)
            r2 = r4[r7]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.intern()
            r5.mo9173c((java.lang.String) r2, (com.facetec.sdk.C3000ee) r0)
            com.facetec.sdk.ju r0 = com.facetec.sdk.C2802au.m10957c(r19)
            int r2 = android.view.MotionEvent.axisFromString(r12)
            int r2 = r2 + 276
            r3 = 43360(0xa960, float:6.076E-41)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r7)
            int r3 = r3 - r4
            char r3 = (char) r3
            int r4 = android.graphics.drawable.Drawable.resolveOpacity(r7, r7)
            int r4 = r4 + 46
            java.lang.Object[] r6 = new java.lang.Object[r6]
            m13918k(r2, r3, r4, r6)
            r2 = r6[r7]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.intern()
            com.facetec.sdk.kb r1 = com.facetec.sdk.C3147g.m12933b((android.content.Context) r1, (java.lang.String) r2, (java.lang.Object) r5)     // Catch:{ e -> 0x039d }
            com.facetec.sdk.ji r0 = r0.mo9507b(r1)     // Catch:{ e -> 0x039d }
            com.facetec.sdk.s$1 r1 = new com.facetec.sdk.s$1     // Catch:{ e -> 0x039d }
            r1.<init>()     // Catch:{ e -> 0x039d }
            r0.mo9460b(r1)     // Catch:{ e -> 0x039d }
            return
        L_0x039d:
            r0 = move-exception
            r0.printStackTrace()
        L_0x03a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3555s.m13897c(android.content.Context, com.facetec.sdk.ak, boolean, com.facetec.sdk.bl$d, java.lang.String):void");
    }

    /* renamed from: e */
    private static void m13914e(final Runnable runnable) {
        C35572 r0 = new Thread() {
            public final void run() {
                setPriority(1);
                Process.setThreadPriority(19);
                runnable.run();
            }
        };
        r0.setPriority(1);
        r0.start();
        int i = f11480f + 23;
        f11485l = i % 128;
        int i2 = i % 2;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (f11483i == false) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        if ((!f11483i ? '_' : '(') != '_') goto L_0x002f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void m13886a(android.content.Context r3, com.facetec.sdk.C3471o r4) {
        /*
            int r0 = f11480f
            int r0 = r0 + 113
            int r1 = r0 % 128
            f11485l = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L_0x000f
            r0 = r1
            goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            if (r0 == 0) goto L_0x001f
            boolean r0 = f11483i
            r1 = 95
            if (r0 != 0) goto L_0x001a
            r0 = r1
            goto L_0x001c
        L_0x001a:
            r0 = 40
        L_0x001c:
            if (r0 == r1) goto L_0x0026
            goto L_0x002f
        L_0x001f:
            boolean r0 = f11483i
            r2 = 53
            int r2 = r2 / r1
            if (r0 != 0) goto L_0x002f
        L_0x0026:
            if (r3 == 0) goto L_0x0029
            goto L_0x002f
        L_0x0029:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>()
            throw r3
        L_0x002f:
            java.lang.String r0 = m13903d()
            java.io.File r1 = new java.io.File
            java.io.File r2 = r3.getCacheDir()
            r1.<init>(r2, r0)
            byte[] r4 = r4.mo9948d()     // Catch:{ Exception -> 0x0052 }
            byte[] r3 = m13915e((android.content.Context) r3, (java.lang.String) r0)     // Catch:{ Exception -> 0x0052 }
            com.facetec.sdk.C2843bh.m11406a((java.io.File) r1, (byte[]) r3, (byte[]) r4)     // Catch:{ Exception -> 0x0052 }
            int r3 = f11480f
            int r3 = r3 + 23
            int r4 = r3 % 128
            f11485l = r4
            int r3 = r3 % 2
            return
        L_0x0052:
            r3 = move-exception
            r3.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3555s.m13886a(android.content.Context, com.facetec.sdk.o):void");
    }

    /* renamed from: b */
    static void m13893b(Context context, C2952dm dmVar, String str) {
        C2867c cVar;
        if (dmVar != C2952dm.ConnectionError) {
            cVar = C2867c.NFC_ERROR;
        } else {
            int i = f11485l + 39;
            f11480f = i % 128;
            if (i % 2 == 0) {
                cVar = C2867c.NFC_USER_MOVED_DEVICE;
            } else {
                C2867c cVar2 = C2867c.FULL_SESSION_START;
                throw null;
            }
        }
        C2999ed edVar = new C2999ed();
        edVar.mo9175e(m13889b(cVar), m13895c(dmVar));
        Object[] objArr = new Object[1];
        m13918k((SystemClock.uptimeMillis() > 0 ? 1 : (SystemClock.uptimeMillis() == 0 ? 0 : -1)) + 106, (char) (TypedValue.complexToFloat(0) > Utils.FLOAT_EPSILON ? 1 : (TypedValue.complexToFloat(0) == Utils.FLOAT_EPSILON ? 0 : -1)), 4 - ImageFormat.getBitsPerPixel(0), objArr);
        edVar.mo9175e(((String) objArr[0]).intern(), str);
        m13904d(context, cVar, (C3000ee) edVar);
        int i2 = f11480f + 75;
        f11485l = i2 % 128;
        int i3 = i2 % 2;
    }

    /* renamed from: e */
    private static byte[] m13915e(Context context, String str) {
        byte[] e = C2750a.m10690e(context);
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        Object[] objArr = new Object[1];
        m13918k(View.MeasureSpec.makeMeasureSpec(0, 0) + 350, (char) (Color.rgb(0, 0, 0) + 16777216), (KeyEvent.getMaxKeyCode() >> 16) + 23, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(str);
        byte[] e2 = C2844bi.m11422e(e, sb.toString());
        int i = f11480f + 73;
        f11485l = i % 128;
        if (i % 2 == 0) {
            z = true;
        }
        if (!z) {
            return e2;
        }
        throw null;
    }

    /* renamed from: d */
    static void m13907d(Context context, Throwable th, C2867c cVar, String str, boolean z) {
        int i = f11485l + 115;
        f11480f = i % 128;
        if ((i % 2 != 0 ? '=' : 'C') != '=') {
            if ((th != null ? ':' : '!') == ':') {
                C3330l.m13346d(th);
                int i2 = f11480f + 21;
                f11485l = i2 % 128;
                int i3 = i2 % 2;
            }
            m13898c(context, cVar, str);
            if ((z ? 19 : '8') != 19) {
                m13898c(context, C2867c.UNEXPECTED_EARLY_EXIT_IDSCAN, str);
            } else {
                m13898c(context, C2867c.UNEXPECTED_EARLY_EXIT_FACESCAN, str);
            }
        } else {
            throw null;
        }
    }

    /* renamed from: e */
    private static String m13910e(C2913cs csVar) {
        int i = f11480f + 79;
        f11485l = i % 128;
        int i2 = i % 2;
        switch (C35583.f11487a[csVar.ordinal()]) {
            case 1:
                Object[] objArr = new Object[1];
                m13918k(373 - KeyEvent.getDeadChar(0, 0), (char) (TextUtils.indexOf("", '0', 0, 0) + 1), 15 - MotionEvent.axisFromString(""), objArr);
                return ((String) objArr[0]).intern();
            case 2:
                Object[] objArr2 = new Object[1];
                m13918k(390 - (AudioTrack.getMaxVolume() > Utils.FLOAT_EPSILON ? 1 : (AudioTrack.getMaxVolume() == Utils.FLOAT_EPSILON ? 0 : -1)), (char) Gravity.getAbsoluteGravity(0, 0), 23 - TextUtils.getTrimmedLength(""), objArr2);
                return ((String) objArr2[0]).intern();
            case 3:
                Object[] objArr3 = new Object[1];
                m13918k(411 - TextUtils.lastIndexOf("", '0', 0), (char) (40629 - (ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1))), (SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)) + 13, objArr3);
                return ((String) objArr3[0]).intern();
            case 4:
                Object[] objArr4 = new Object[1];
                m13918k((ViewConfiguration.getScrollDefaultDelay() >> 16) + 426, (char) (View.combineMeasuredStates(0, 0) + 47805), (ViewConfiguration.getWindowTouchSlop() >> 8) + 16, objArr4);
                String intern = ((String) objArr4[0]).intern();
                int i3 = f11485l + 105;
                f11480f = i3 % 128;
                int i4 = i3 % 2;
                return intern;
            case 5:
                Object[] objArr5 = new Object[1];
                m13918k(Color.alpha(0) + 442, (char) Drawable.resolveOpacity(0, 0), (AudioTrack.getMaxVolume() > Utils.FLOAT_EPSILON ? 1 : (AudioTrack.getMaxVolume() == Utils.FLOAT_EPSILON ? 0 : -1)) + 14, objArr5);
                return ((String) objArr5[0]).intern();
            case 6:
                Object[] objArr6 = new Object[1];
                m13918k(457 - View.getDefaultSize(0, 0), (char) (KeyEvent.normalizeMetaState(0) + 25864), (ViewConfiguration.getPressedStateDuration() >> 16) + 13, objArr6);
                return ((String) objArr6[0]).intern();
            case 7:
                Object[] objArr7 = new Object[1];
                m13918k(Gravity.getAbsoluteGravity(0, 0) + 470, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 12 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr7);
                return ((String) objArr7[0]).intern();
            case 8:
                Object[] objArr8 = new Object[1];
                m13918k(481 - TextUtils.indexOf("", '0', 0), (char) (Process.getGidForName("") + 26346), Color.green(0) + 11, objArr8);
                return ((String) objArr8[0]).intern();
            case 9:
                Object[] objArr9 = new Object[1];
                m13918k((TypedValue.complexToFloat(0) > Utils.FLOAT_EPSILON ? 1 : (TypedValue.complexToFloat(0) == Utils.FLOAT_EPSILON ? 0 : -1)) + 493, (char) (ImageFormat.getBitsPerPixel(0) + 1), TextUtils.indexOf("", "", 0, 0) + 8, objArr9);
                return ((String) objArr9[0]).intern();
            case 10:
                Object[] objArr10 = new Object[1];
                m13918k(501 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) TextUtils.indexOf("", "", 0, 0), 9 - ExpandableListView.getPackedPositionType(0), objArr10);
                return ((String) objArr10[0]).intern();
            default:
                return "";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0072 A[Catch:{ all -> 0x0097 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0074 A[Catch:{ all -> 0x0097 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0078 A[Catch:{ all -> 0x0097 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0079 A[Catch:{ all -> 0x0097 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized com.facetec.sdk.C3471o m13883a(android.content.Context r12) {
        /*
            java.lang.Class<com.facetec.sdk.s> r0 = com.facetec.sdk.C3555s.class
            monitor-enter(r0)
            int r1 = f11485l     // Catch:{ all -> 0x00a4 }
            int r1 = r1 + 121
            int r2 = r1 % 128
            f11480f = r2     // Catch:{ all -> 0x00a4 }
            int r1 = r1 % 2
            java.io.File r1 = r12.getCacheDir()     // Catch:{ all -> 0x00a4 }
            java.io.File[] r1 = r1.listFiles()     // Catch:{ all -> 0x00a4 }
            r2 = 0
            if (r1 == 0) goto L_0x006d
            int r3 = r1.length     // Catch:{ all -> 0x00a4 }
            r4 = 0
            r5 = r4
        L_0x001b:
            r6 = 20
            if (r5 >= r3) goto L_0x0021
            r7 = r6
            goto L_0x0023
        L_0x0021:
            r7 = 69
        L_0x0023:
            if (r7 == r6) goto L_0x0026
            goto L_0x006d
        L_0x0026:
            int r6 = f11485l     // Catch:{ all -> 0x00a4 }
            int r6 = r6 + 63
            int r7 = r6 % 128
            f11480f = r7     // Catch:{ all -> 0x00a4 }
            int r6 = r6 % 2
            r6 = r1[r5]     // Catch:{ all -> 0x00a4 }
            java.lang.String r7 = r6.getName()     // Catch:{ all -> 0x00a4 }
            int r8 = android.view.View.getDefaultSize(r4, r4)     // Catch:{ all -> 0x00a4 }
            int r8 = r8 + 335
            int r9 = android.view.KeyEvent.getDeadChar(r4, r4)     // Catch:{ all -> 0x00a4 }
            r10 = 59667(0xe913, float:8.3611E-41)
            int r10 = r10 - r9
            char r9 = (char) r10     // Catch:{ all -> 0x00a4 }
            int r10 = android.os.Process.myPid()     // Catch:{ all -> 0x00a4 }
            int r10 = r10 >> 22
            int r10 = 15 - r10
            r11 = 1
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch:{ all -> 0x00a4 }
            m13918k(r8, r9, r10, r11)     // Catch:{ all -> 0x00a4 }
            r8 = r11[r4]     // Catch:{ all -> 0x00a4 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x00a4 }
            java.lang.String r8 = r8.intern()     // Catch:{ all -> 0x00a4 }
            boolean r7 = r7.startsWith(r8)     // Catch:{ all -> 0x00a4 }
            r8 = 36
            if (r7 == 0) goto L_0x0066
            r7 = 64
            goto L_0x0067
        L_0x0066:
            r7 = r8
        L_0x0067:
            if (r7 == r8) goto L_0x006a
            goto L_0x006e
        L_0x006a:
            int r5 = r5 + 1
            goto L_0x001b
        L_0x006d:
            r6 = r2
        L_0x006e:
            r1 = 57
            if (r6 == 0) goto L_0x0074
            r3 = r1
            goto L_0x0076
        L_0x0074:
            r3 = 18
        L_0x0076:
            if (r3 == r1) goto L_0x0079
            goto L_0x009e
        L_0x0079:
            int r1 = f11480f     // Catch:{ all -> 0x00a4 }
            int r1 = r1 + 71
            int r3 = r1 % 128
            f11485l = r3     // Catch:{ all -> 0x00a4 }
            int r1 = r1 % 2
            java.lang.String r1 = r6.getName()     // Catch:{ Exception -> 0x0099 }
            byte[] r12 = m13915e((android.content.Context) r12, (java.lang.String) r1)     // Catch:{ Exception -> 0x0099 }
            byte[] r12 = com.facetec.sdk.C2843bh.m11412d(r6, r12)     // Catch:{ Exception -> 0x0099 }
            com.facetec.sdk.o r2 = com.facetec.sdk.C3471o.m13874a(r12)     // Catch:{ Exception -> 0x0099 }
        L_0x0093:
            r6.delete()     // Catch:{ all -> 0x00a4 }
            goto L_0x009e
        L_0x0097:
            r12 = move-exception
            goto L_0x00a0
        L_0x0099:
            r12 = move-exception
            r12.printStackTrace()     // Catch:{ all -> 0x0097 }
            goto L_0x0093
        L_0x009e:
            monitor-exit(r0)
            return r2
        L_0x00a0:
            r6.delete()     // Catch:{ all -> 0x00a4 }
            throw r12     // Catch:{ all -> 0x00a4 }
        L_0x00a4:
            r12 = move-exception
            monitor-exit(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3555s.m13883a(android.content.Context):com.facetec.sdk.o");
    }

    /* renamed from: b */
    private static Bitmap m13888b(Bitmap bitmap, float f) {
        Matrix matrix = new Matrix();
        matrix.postRotate(f);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        int i = f11485l + 65;
        f11480f = i % 128;
        if ((i % 2 != 0 ? 'A' : 'E') != 'A') {
            return createBitmap;
        }
        throw null;
    }

    /* renamed from: d */
    private static void m13904d(Context context, C2867c cVar, C3000ee eeVar) {
        int i = f11480f + 49;
        f11485l = i % 128;
        int i2 = i % 2;
        if ((context == null) || !m13894b()) {
            int i3 = f11485l + 99;
            f11480f = i3 % 128;
            if ((i3 % 2 != 0 ? '#' : 'N') == '#') {
                int i4 = 47 / 0;
                return;
            }
            return;
        }
        C2920cv.m12195c(new C3200hk(cVar, eeVar, context));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m13892b(Context context, Context context2, C3471o oVar, boolean z) {
        C2802au.m10961d(context).mo8864d(context2, oVar, z, new C3561b(context, oVar));
        int i = f11485l + 95;
        f11480f = i % 128;
        if (i % 2 != 0) {
            int i2 = 84 / 0;
        }
    }

    /* renamed from: b */
    static boolean m13894b() {
        int i = f11480f + 31;
        f11485l = i % 128;
        if ((i % 2 == 0 ? 25 : 'c') == 'c') {
            return C2750a.m10686c();
        }
        C2750a.m10686c();
        throw null;
    }

    /* renamed from: d */
    private static String m13903d() {
        String e = C2810ax.m11000e(22, 22);
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        m13918k((ViewConfiguration.getScrollDefaultDelay() >> 16) + 335, (char) (59666 - TextUtils.lastIndexOf("", '0', 0, 0)), 15 - (Process.myPid() >> 22), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(e);
        String obj = sb.toString();
        int i = f11485l + 81;
        f11480f = i % 128;
        int i2 = i % 2;
        return obj;
    }

    /* renamed from: b */
    private static ArrayList<String> m13890b(ArrayList<String> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        Iterator<String> it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int i = f11485l + 101;
            f11480f = i % 128;
            if (i % 2 != 0) {
                arrayList2.add(C2862bv.m11670a(it.next()));
                int i2 = 74 / 0;
            } else {
                arrayList2.add(C2862bv.m11670a(it.next()));
            }
        }
        int i3 = f11480f + 21;
        f11485l = i3 % 128;
        if (!(i3 % 2 != 0)) {
            int i4 = 44 / 0;
        }
        return arrayList2;
    }

    /* renamed from: e */
    private static String m13909e(C2867c cVar) {
        int i = f11485l + 61;
        f11480f = i % 128;
        int i2 = i % 2;
        switch (C35583.f11489d[cVar.ordinal()]) {
            case 1:
                Object[] objArr = new Object[1];
                m13918k(576 - ExpandableListView.getPackedPositionGroup(0), (char) TextUtils.getOffsetBefore("", 0), (AudioTrack.getMinVolume() > Utils.FLOAT_EPSILON ? 1 : (AudioTrack.getMinVolume() == Utils.FLOAT_EPSILON ? 0 : -1)) + 22, objArr);
                String intern = ((String) objArr[0]).intern();
                int i3 = f11480f + 53;
                f11485l = i3 % 128;
                int i4 = i3 % 2;
                return intern;
            case 2:
                Object[] objArr2 = new Object[1];
                m13918k(706 - (TypedValue.complexToFloat(0) > Utils.FLOAT_EPSILON ? 1 : (TypedValue.complexToFloat(0) == Utils.FLOAT_EPSILON ? 0 : -1)), (char) (5832 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1))), (ViewConfiguration.getTapTimeout() >> 16) + 20, objArr2);
                return ((String) objArr2[0]).intern();
            case 3:
                Object[] objArr3 = new Object[1];
                m13918k(658 - Color.red(0), (char) ((TypedValue.complexToFloat(0) > Utils.FLOAT_EPSILON ? 1 : (TypedValue.complexToFloat(0) == Utils.FLOAT_EPSILON ? 0 : -1)) + 19778), 29 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr3);
                return ((String) objArr3[0]).intern();
            case 4:
                Object[] objArr4 = new Object[1];
                m13918k(((byte) KeyEvent.getModifierMetaStateMask()) + 727, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 27 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr4);
                return ((String) objArr4[0]).intern();
            case 5:
                Object[] objArr5 = new Object[1];
                m13918k(TextUtils.indexOf("", "", 0) + 687, (char) ((TypedValue.complexToFloat(0) > Utils.FLOAT_EPSILON ? 1 : (TypedValue.complexToFloat(0) == Utils.FLOAT_EPSILON ? 0 : -1)) + 36075), Gravity.getAbsoluteGravity(0, 0) + 19, objArr5);
                return ((String) objArr5[0]).intern();
            case 6:
                Object[] objArr6 = new Object[1];
                m13918k((TypedValue.complexToFloat(0) > Utils.FLOAT_EPSILON ? 1 : (TypedValue.complexToFloat(0) == Utils.FLOAT_EPSILON ? 0 : -1)) + 510, (char) ((AudioTrack.getMaxVolume() > Utils.FLOAT_EPSILON ? 1 : (AudioTrack.getMaxVolume() == Utils.FLOAT_EPSILON ? 0 : -1)) - 1), KeyEvent.keyCodeFromString("") + 16, objArr6);
                return ((String) objArr6[0]).intern();
            case 7:
                Object[] objArr7 = new Object[1];
                m13918k((ViewConfiguration.getJumpTapTimeout() >> 16) + 526, (char) (25692 - TextUtils.lastIndexOf("", '0', 0, 0)), 28 - View.resolveSizeAndState(0, 0, 0), objArr7);
                return ((String) objArr7[0]).intern();
            case 8:
                Object[] objArr8 = new Object[1];
                m13918k(554 - Gravity.getAbsoluteGravity(0, 0), (char) (62208 - (ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1))), 21 - Process.getGidForName(""), objArr8);
                return ((String) objArr8[0]).intern();
            case 9:
                Object[] objArr9 = new Object[1];
                m13918k(598 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) ((PointF.length(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON) > Utils.FLOAT_EPSILON ? 1 : (PointF.length(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON) == Utils.FLOAT_EPSILON ? 0 : -1)) + 13182), (AudioTrack.getMaxVolume() > Utils.FLOAT_EPSILON ? 1 : (AudioTrack.getMaxVolume() == Utils.FLOAT_EPSILON ? 0 : -1)) + 32, objArr9);
                return ((String) objArr9[0]).intern();
            case 10:
                Object[] objArr10 = new Object[1];
                m13918k((ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)) + 631, (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 37024), (KeyEvent.getMaxKeyCode() >> 16) + 27, objArr10);
                String intern2 = ((String) objArr10[0]).intern();
                int i5 = f11480f + 75;
                f11485l = i5 % 128;
                int i6 = i5 % 2;
                return intern2;
            case 11:
                Object[] objArr11 = new Object[1];
                m13918k(753 - TextUtils.getOffsetBefore("", 0), (char) Color.blue(0), 12 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr11);
                return ((String) objArr11[0]).intern();
            case 12:
                Object[] objArr12 = new Object[1];
                m13918k((Process.myPid() >> 22) + 765, (char) TextUtils.getOffsetBefore("", 0), 14 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)), objArr12);
                return ((String) objArr12[0]).intern();
            case 13:
                Object[] objArr13 = new Object[1];
                m13918k(777 - TextUtils.indexOf("", '0', 0), (char) (55405 - TextUtils.getTrimmedLength("")), TextUtils.lastIndexOf("", '0') + 12, objArr13);
                return ((String) objArr13[0]).intern();
            case 14:
                Object[] objArr14 = new Object[1];
                m13918k((Process.myTid() >> 22) + 789, (char) (53074 - TextUtils.lastIndexOf("", '0', 0, 0)), 20 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr14);
                return ((String) objArr14[0]).intern();
            case 15:
                Object[] objArr15 = new Object[1];
                m13918k(Color.alpha(0) + 809, (char) (-1 - MotionEvent.axisFromString("")), 17 - Drawable.resolveOpacity(0, 0), objArr15);
                return ((String) objArr15[0]).intern();
            case 16:
                Object[] objArr16 = new Object[1];
                m13918k((ViewConfiguration.getWindowTouchSlop() >> 8) + 826, (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 58352), 11 - View.MeasureSpec.getSize(0), objArr16);
                return ((String) objArr16[0]).intern();
            case 17:
                Object[] objArr17 = new Object[1];
                m13918k(Gravity.getAbsoluteGravity(0, 0) + 837, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 8 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr17);
                return ((String) objArr17[0]).intern();
            case 18:
                Object[] objArr18 = new Object[1];
                m13918k((ViewConfiguration.getScrollBarSize() >> 8) + 845, (char) View.MeasureSpec.getSize(0), (ViewConfiguration.getScrollFriction() > Utils.FLOAT_EPSILON ? 1 : (ViewConfiguration.getScrollFriction() == Utils.FLOAT_EPSILON ? 0 : -1)) + 17, objArr18);
                return ((String) objArr18[0]).intern();
            case 19:
                Object[] objArr19 = new Object[1];
                m13918k((ViewConfiguration.getLongPressTimeout() >> 16) + 863, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 19, objArr19);
                return ((String) objArr19[0]).intern();
            case 20:
                Object[] objArr20 = new Object[1];
                m13918k((ViewConfiguration.getScrollFriction() > Utils.FLOAT_EPSILON ? 1 : (ViewConfiguration.getScrollFriction() == Utils.FLOAT_EPSILON ? 0 : -1)) + 881, (char) Color.alpha(0), 21 - Color.alpha(0), objArr20);
                return ((String) objArr20[0]).intern();
            case 21:
                Object[] objArr21 = new Object[1];
                m13918k(902 - TextUtils.lastIndexOf("", '0', 0), (char) (View.combineMeasuredStates(0, 0) + 59424), 15 - (ViewConfiguration.getScrollFriction() > Utils.FLOAT_EPSILON ? 1 : (ViewConfiguration.getScrollFriction() == Utils.FLOAT_EPSILON ? 0 : -1)), objArr21);
                return ((String) objArr21[0]).intern();
            case 22:
                Object[] objArr22 = new Object[1];
                m13918k(KeyEvent.normalizeMetaState(0) + 917, (char) KeyEvent.normalizeMetaState(0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 14, objArr22);
                return ((String) objArr22[0]).intern();
            case 23:
                Object[] objArr23 = new Object[1];
                m13918k(931 - ExpandableListView.getPackedPositionType(0), (char) TextUtils.getTrimmedLength(""), (SystemClock.currentThreadTimeMillis() > -1 ? 1 : (SystemClock.currentThreadTimeMillis() == -1 ? 0 : -1)) + 20, objArr23);
                return ((String) objArr23[0]).intern();
            case 24:
                Object[] objArr24 = new Object[1];
                m13918k(1000 - AndroidCharacter.getMirror('0'), (char) ExpandableListView.getPackedPositionType(0), 26 - TextUtils.lastIndexOf("", '0', 0), objArr24);
                return ((String) objArr24[0]).intern();
            case 25:
                Object[] objArr25 = new Object[1];
                m13918k(TextUtils.indexOf("", '0', 0) + 980, (char) View.resolveSize(0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 28, objArr25);
                return ((String) objArr25[0]).intern();
            case 26:
                Object[] objArr26 = new Object[1];
                m13918k(1055 - AndroidCharacter.getMirror('0'), (char) (AudioTrack.getMinVolume() > Utils.FLOAT_EPSILON ? 1 : (AudioTrack.getMinVolume() == Utils.FLOAT_EPSILON ? 0 : -1)), 5 - (ViewConfiguration.getScrollFriction() > Utils.FLOAT_EPSILON ? 1 : (ViewConfiguration.getScrollFriction() == Utils.FLOAT_EPSILON ? 0 : -1)), objArr26);
                return ((String) objArr26[0]).intern();
            case 27:
                Object[] objArr27 = new Object[1];
                m13918k(1011 - Drawable.resolveOpacity(0, 0), (char) (ExpandableListView.getPackedPositionChild(0) + 57511), TextUtils.getOffsetBefore("", 0) + 3, objArr27);
                return ((String) objArr27[0]).intern();
            case 28:
                Object[] objArr28 = new Object[1];
                m13918k(1014 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (64375 - Color.blue(0)), 5 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr28);
                return ((String) objArr28[0]).intern();
            case 29:
                Object[] objArr29 = new Object[1];
                m13918k(1018 - TextUtils.indexOf("", '0'), (char) (64454 - ((Process.getThreadPriority(0) + 20) >> 6)), 3 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr29);
                return ((String) objArr29[0]).intern();
            case 30:
                Object[] objArr30 = new Object[1];
                m13918k(1022 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (62272 - MotionEvent.axisFromString("")), TextUtils.lastIndexOf("", '0', 0, 0) + 4, objArr30);
                return ((String) objArr30[0]).intern();
            case 31:
                Object[] objArr31 = new Object[1];
                m13918k(1025 - View.combineMeasuredStates(0, 0), (char) (43481 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), TextUtils.lastIndexOf("", '0', 0) + 4, objArr31);
                return ((String) objArr31[0]).intern();
            case 32:
                Object[] objArr32 = new Object[1];
                m13918k((SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)) + 1027, (char) TextUtils.indexOf("", "", 0), 8 - TextUtils.indexOf("", ""), objArr32);
                return ((String) objArr32[0]).intern();
            case 33:
                Object[] objArr33 = new Object[1];
                m13918k(1035 - ImageFormat.getBitsPerPixel(0), (char) (TextUtils.getCapsMode("", 0, 0) + 8609), 20 - TextUtils.indexOf("", '0'), objArr33);
                return ((String) objArr33[0]).intern();
            case 34:
                Object[] objArr34 = new Object[1];
                m13918k(1057 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (KeyEvent.getMaxKeyCode() >> 16), TextUtils.indexOf("", "", 0) + 3, objArr34);
                String intern3 = ((String) objArr34[0]).intern();
                int i7 = f11480f + 99;
                f11485l = i7 % 128;
                if (!(i7 % 2 != 0)) {
                    int i8 = 3 / 0;
                }
                return intern3;
            case 35:
                Object[] objArr35 = new Object[1];
                m13918k(TextUtils.lastIndexOf("", '0', 0, 0) + 1061, (char) ((SystemClock.currentThreadTimeMillis() > -1 ? 1 : (SystemClock.currentThreadTimeMillis() == -1 ? 0 : -1)) + 29835), 34 - (ViewConfiguration.getTouchSlop() >> 8), objArr35);
                return ((String) objArr35[0]).intern();
            case 36:
                Object[] objArr36 = new Object[1];
                m13918k((ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)) + 1093, (char) (ViewConfiguration.getScrollBarSize() >> 8), (AudioTrack.getMinVolume() > Utils.FLOAT_EPSILON ? 1 : (AudioTrack.getMinVolume() == Utils.FLOAT_EPSILON ? 0 : -1)) + 32, objArr36);
                return ((String) objArr36[0]).intern();
            default:
                return "";
        }
    }

    /* renamed from: a */
    static String m13884a(Activity activity) {
        String str;
        String str2;
        Object obj;
        int i = f11485l + 21;
        int i2 = i % 128;
        f11480f = i2;
        if (i % 2 != 0) {
            int i3 = 86 / 0;
            if ((activity != null ? 11 : '7') != 11) {
                return "";
            }
        } else if (activity == null) {
            return "";
        }
        int i4 = i2 + 81;
        f11485l = i4 % 128;
        if (i4 % 2 != 0) {
            Fragment c = C2810ax.m10995c(activity);
            if (c != null) {
                int i5 = f11485l + 109;
                f11480f = i5 % 128;
                int i6 = i5 % 2;
                str = c.getTag();
            } else {
                Object[] objArr = new Object[1];
                m13918k((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1126, (char) (15845 - ImageFormat.getBitsPerPixel(0)), 4 - View.getDefaultSize(0, 0), objArr);
                str = ((String) objArr[0]).intern();
            }
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            m13918k((ViewConfiguration.getPressedStateDuration() >> 16) + 1130, (char) (10458 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (ViewConfiguration.getEdgeSlop() >> 16) + 39, objArr2);
            sb.append(((String) objArr2[0]).intern());
            if (activity.isFinishing()) {
                Object[] objArr3 = new Object[1];
                m13918k(1169 - View.MeasureSpec.getSize(0), (char) (1 - (SystemClock.elapsedRealtime() > 0 ? 1 : (SystemClock.elapsedRealtime() == 0 ? 0 : -1))), View.MeasureSpec.getMode(0) + 4, objArr3);
                str2 = ((String) objArr3[0]).intern();
            } else {
                Object[] objArr4 = new Object[1];
                m13918k(Process.getGidForName("") + 1174, (char) (TypedValue.complexToFloat(0) > Utils.FLOAT_EPSILON ? 1 : (TypedValue.complexToFloat(0) == Utils.FLOAT_EPSILON ? 0 : -1)), (TypedValue.complexToFraction(0, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON) > Utils.FLOAT_EPSILON ? 1 : (TypedValue.complexToFraction(0, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON) == Utils.FLOAT_EPSILON ? 0 : -1)) + 5, objArr4);
                str2 = ((String) objArr4[0]).intern();
                int i7 = f11480f + 17;
                f11485l = i7 % 128;
                int i8 = i7 % 2;
            }
            sb.append(str2);
            Object[] objArr5 = new Object[1];
            m13918k(1178 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (KeyEvent.getMaxKeyCode() >> 16), TextUtils.getCapsMode("", 0, 0) + 21, objArr5);
            sb.append(((String) objArr5[0]).intern());
            if (activity.hasWindowFocus()) {
                Object[] objArr6 = new Object[1];
                m13918k(1168 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)), (char) Color.alpha(0), 4 - TextUtils.indexOf("", "", 0), objArr6);
                obj = objArr6[0];
            } else {
                Object[] objArr7 = new Object[1];
                m13918k((ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)) + 1173, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 4 - ImageFormat.getBitsPerPixel(0), objArr7);
                obj = objArr7[0];
            }
            sb.append(((String) obj).intern());
            Object[] objArr8 = new Object[1];
            m13918k(View.MeasureSpec.makeMeasureSpec(0, 0) + 1199, (char) (14307 - TextUtils.getTrimmedLength("")), TextUtils.indexOf("", "", 0, 0) + 13, objArr8);
            sb.append(((String) objArr8[0]).intern());
            sb.append(str);
            Object[] objArr9 = new Object[1];
            m13918k((TypedValue.complexToFloat(0) > Utils.FLOAT_EPSILON ? 1 : (TypedValue.complexToFloat(0) == Utils.FLOAT_EPSILON ? 0 : -1)) + 1212, (char) (((Process.getThreadPriority(0) + 20) >> 6) + 16463), (AudioTrack.getMinVolume() > Utils.FLOAT_EPSILON ? 1 : (AudioTrack.getMinVolume() == Utils.FLOAT_EPSILON ? 0 : -1)) + 3, objArr9);
            sb.append(((String) objArr9[0]).intern());
            return sb.toString();
        }
        C2810ax.m10995c(activity);
        throw null;
    }

    /* renamed from: c */
    static void m13898c(Context context, C2867c cVar, String str) {
        C2999ed edVar;
        int i = f11485l + 101;
        f11480f = i % 128;
        int i2 = i % 2;
        if (str != null) {
            edVar = new C2999ed();
            edVar.mo9175e(m13889b(cVar), str);
            int i3 = f11480f + 47;
            f11485l = i3 % 128;
            int i4 = i3 % 2;
        } else {
            edVar = null;
        }
        m13904d(context, cVar, (C3000ee) edVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m13901c(C2867c cVar, C3000ee eeVar, Context context) {
        Object obj;
        C2999ed edVar = new C2999ed();
        Object[] objArr = new Object[1];
        m13918k((ViewConfiguration.getScrollDefaultDelay() >> 16) + 214, (char) (TextUtils.indexOf("", '0', 0) + 1), Drawable.resolveOpacity(0, 0) + 2, objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        m13918k(1215 - Color.red(0), (char) (17618 - AndroidCharacter.getMirror('0')), TextUtils.lastIndexOf("", '0') + 3, objArr2);
        edVar.mo9175e(intern, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        m13918k(1217 - View.MeasureSpec.getMode(0), (char) (Color.alpha(0) + 54663), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 9, objArr3);
        edVar.mo9175e(((String) objArr3[0]).intern(), f11479e);
        Object[] objArr4 = new Object[1];
        m13918k(TextUtils.getOffsetAfter("", 0) + 1226, (char) View.getDefaultSize(0, 0), 7 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr4);
        edVar.mo9175e(((String) objArr4[0]).intern(), UUID.randomUUID().toString());
        Object[] objArr5 = new Object[1];
        m13918k(1233 - TextUtils.indexOf("", ""), (char) Color.red(0), 19 - ExpandableListView.getPackedPositionGroup(0), objArr5);
        edVar.mo9175e(((String) objArr5[0]).intern(), C2888cg.f9551c);
        Object[] objArr6 = new Object[1];
        m13918k(-16775964 - Color.rgb(0, 0, 0), (char) (View.combineMeasuredStates(0, 0) + 5949), (ViewConfiguration.getEdgeSlop() >> 16) + 1, objArr6);
        edVar.mo9175e(((String) objArr6[0]).intern(), m13909e(cVar));
        Object[] objArr7 = new Object[1];
        m13918k(262 - TextUtils.indexOf("", "", 0), (char) (52579 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), View.resolveSize(0, 0) + 9, objArr7);
        edVar.mo9174c(((String) objArr7[0]).intern(), (Number) Integer.valueOf((int) (System.currentTimeMillis() / 1000)));
        Object[] objArr8 = new Object[1];
        m13918k(ExpandableListView.getPackedPositionChild(0) + 1254, (char) ((ViewConfiguration.getTapTimeout() >> 16) + 22988), (AudioTrack.getMaxVolume() > Utils.FLOAT_EPSILON ? 1 : (AudioTrack.getMaxVolume() == Utils.FLOAT_EPSILON ? 0 : -1)) + 8, objArr8);
        edVar.mo9174c(((String) objArr8[0]).intern(), (Number) Long.valueOf(System.currentTimeMillis()));
        if (eeVar != null) {
            int i = f11485l + 5;
            f11480f = i % 128;
            if (i % 2 == 0) {
                Object[] objArr9 = new Object[1];
                m13918k(1262 - Color.red(0), (char) ((AudioTrack.getMinVolume() > Utils.FLOAT_EPSILON ? 1 : (AudioTrack.getMinVolume() == Utils.FLOAT_EPSILON ? 0 : -1)) + 24954), (Process.getElapsedCpuTime() > 0 ? 1 : (Process.getElapsedCpuTime() == 0 ? 0 : -1)) + 3, objArr9);
                obj = objArr9[0];
            } else {
                Object[] objArr10 = new Object[1];
                m13918k(Color.red(0) + 10899, (char) (25060 >>> (AudioTrack.getMinVolume() > Utils.FLOAT_EPSILON ? 1 : (AudioTrack.getMinVolume() == Utils.FLOAT_EPSILON ? 0 : -1))), (Process.getElapsedCpuTime() > 0 ? 1 : (Process.getElapsedCpuTime() == 0 ? 0 : -1)) * 2, objArr10);
                obj = objArr10[0];
            }
            edVar.mo9173c(((String) obj).intern(), eeVar);
        }
        C3268ju c = C2802au.m10957c(context);
        Object[] objArr11 = new Object[1];
        m13918k(Color.red(0) + 275, (char) (43360 - TextUtils.indexOf("", "", 0, 0)), (ViewConfiguration.getPressedStateDuration() >> 16) + 46, objArr11);
        try {
            c.mo9507b(C3147g.m12933b(context, ((String) objArr11[0]).intern(), (Object) edVar)).mo9460b(new C3248jj() {
                /* renamed from: a */
                public final void mo8841a(C3295kc kcVar) {
                    kcVar.mo9605a();
                }

                /* renamed from: b */
                public final void mo8842b() {
                }
            });
            int i2 = f11485l + 79;
            f11480f = i2 % 128;
            int i3 = i2 % 2;
        } catch (C3147g.C3148e e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    static void m13896c(Context context) {
        int i = f11485l + 33;
        f11480f = i % 128;
        if (!(i % 2 == 0)) {
            C2920cv.m12196e(new C3222ik(context));
            int i2 = 22 / 0;
        } else {
            C2920cv.m12196e(new C3222ik(context));
        }
        int i3 = f11485l + 81;
        f11480f = i3 % 128;
        if ((i3 % 2 != 0 ? 'B' : 'A') != 'A') {
            int i4 = 60 / 0;
        }
    }

    /* renamed from: c */
    private static void m13899c(Context context, C3471o oVar) {
        int i = f11485l + 99;
        f11480f = i % 128;
        if (i % 2 == 0) {
            C2920cv.m12196e(new C3710yj(context, oVar));
            int i2 = f11480f + 39;
            f11485l = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        C2920cv.m12196e(new C3710yj(context, oVar));
        throw null;
    }

    /* renamed from: c */
    static void m13902c(C2913cs csVar) {
        int i = f11480f + 71;
        f11485l = i % 128;
        int i2 = i % 2;
        f11475a = csVar;
        f11482h = System.currentTimeMillis();
        int i3 = f11480f + 83;
        f11485l = i3 % 128;
        int i4 = i3 % 2;
    }
}
