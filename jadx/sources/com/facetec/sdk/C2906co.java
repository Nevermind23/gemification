package com.facetec.sdk;

import android.animation.Animator;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facetec.sdk.C2949dl;
import com.facetec.sdk.FaceTecVocalGuidanceCustomization;
import com.github.mikephil.charting.utils.Utils;
import p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView;

/* renamed from: com.facetec.sdk.co */
class C2906co extends LinearLayout {

    /* renamed from: a */
    C2865by f9681a = C2865by.FACE_NOT_FOUND;

    /* renamed from: b */
    View f9682b;

    /* renamed from: c */
    TextView f9683c;

    /* renamed from: d */
    int f9684d = 0;

    /* renamed from: e */
    C2895ch f9685e = C2895ch.FRAME_YOUR_FACE;

    /* renamed from: f */
    final C2816b f9686f = new C3551rg(this);

    /* renamed from: g */
    boolean f9687g = false;

    /* renamed from: h */
    Animator f9688h;

    /* renamed from: i */
    Handler f9689i;

    /* renamed from: j */
    Animator f9690j;

    /* renamed from: m */
    private Animation f9691m;

    /* renamed from: n */
    private final int f9692n = TextTypeView.SEPARATOR_FULL;

    /* renamed from: com.facetec.sdk.co$4 */
    static /* synthetic */ class C29074 {

        /* renamed from: a */
        static final /* synthetic */ int[] f9693a;

        /* renamed from: d */
        static final /* synthetic */ int[] f9694d;

        /* JADX WARNING: Can't wrap try/catch for region: R(59:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|(2:37|38)|39|(2:41|42)|43|45|46|47|48|49|50|51|52|53|54|(2:55|56)|57|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|(3:81|82|84)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(60:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|(2:37|38)|39|41|42|43|45|46|47|48|49|50|51|52|53|54|(2:55|56)|57|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|(3:81|82|84)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(61:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|(2:37|38)|39|41|42|43|45|46|47|48|49|50|51|52|53|54|(2:55|56)|57|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|(3:81|82|84)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(62:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|37|38|39|41|42|43|45|46|47|48|49|50|51|52|53|54|(2:55|56)|57|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|(3:81|82|84)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(63:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|37|38|39|41|42|43|45|46|47|48|49|50|51|52|53|54|(2:55|56)|57|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|(3:81|82|84)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(65:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|37|38|39|41|42|43|45|46|47|48|49|50|51|52|53|54|(2:55|56)|57|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|(3:81|82|84)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(67:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|33|34|35|37|38|39|41|42|43|45|46|47|48|49|50|51|52|53|54|(2:55|56)|57|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|(3:81|82|84)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(69:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|45|46|47|48|49|50|51|52|53|54|(2:55|56)|57|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|(3:81|82|84)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00dd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x00e7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x00f1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x00fb */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0105 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x010f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x0119 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x0123 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x012d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x0137 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x0141 */
        static {
            /*
                com.facetec.sdk.by[] r0 = com.facetec.sdk.C2865by.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9694d = r0
                r1 = 1
                com.facetec.sdk.by r2 = com.facetec.sdk.C2865by.HOLD_STEADY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f9694d     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facetec.sdk.by r3 = com.facetec.sdk.C2865by.FACE_NOT_FOUND     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f9694d     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facetec.sdk.by r4 = com.facetec.sdk.C2865by.MOVE_FACE_CLOSER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f9694d     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facetec.sdk.by r5 = com.facetec.sdk.C2865by.MOVE_FACE_EVEN_CLOSER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f9694d     // Catch:{ NoSuchFieldError -> 0x003e }
                com.facetec.sdk.by r6 = com.facetec.sdk.C2865by.MOVE_FACE_FURTHER_AWAY     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = f9694d     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.facetec.sdk.by r7 = com.facetec.sdk.C2865by.MOVE_FACE_AWAY_A_LITTLE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = f9694d     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.facetec.sdk.by r8 = com.facetec.sdk.C2865by.FACE_CENTERED_TOO_FAR_TOP     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                r7 = 8
                int[] r8 = f9694d     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.facetec.sdk.by r9 = com.facetec.sdk.C2865by.FACE_CENTERED_TOO_FAR_BOTTOM     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                r8 = 9
                int[] r9 = f9694d     // Catch:{ NoSuchFieldError -> 0x006c }
                com.facetec.sdk.by r10 = com.facetec.sdk.C2865by.FACE_CENTERED_TOO_FAR_LEFT     // Catch:{ NoSuchFieldError -> 0x006c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r9[r10] = r8     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                r9 = 10
                int[] r10 = f9694d     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.facetec.sdk.by r11 = com.facetec.sdk.C2865by.FACE_CENTERED_TOO_FAR_RIGHT     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r11 = r11.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r10[r11] = r9     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                r10 = 11
                int[] r11 = f9694d     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.facetec.sdk.by r12 = com.facetec.sdk.C2865by.FACE_ROTATED_TOO_FAR_LEFT     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r12 = r12.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r11[r12] = r10     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                r11 = 12
                int[] r12 = f9694d     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.facetec.sdk.by r13 = com.facetec.sdk.C2865by.FACE_ROTATED_TOO_FAR_RIGHT     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r13 = r13.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r12[r13] = r11     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r12 = f9694d     // Catch:{ NoSuchFieldError -> 0x009c }
                com.facetec.sdk.by r13 = com.facetec.sdk.C2865by.MOVE_PHONE_TO_EYE_LEVEL     // Catch:{ NoSuchFieldError -> 0x009c }
                int r13 = r13.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r14 = 13
                r12[r13] = r14     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r12 = f9694d     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.facetec.sdk.by r13 = com.facetec.sdk.C2865by.FACE_LOOKING_TOO_FAR_LEFT     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r13 = r13.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r14 = 14
                r12[r13] = r14     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r12 = f9694d     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.facetec.sdk.by r13 = com.facetec.sdk.C2865by.FACE_LOOKING_TOO_FAR_RIGHT     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r13 = r13.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r14 = 15
                r12[r13] = r14     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r12 = f9694d     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.facetec.sdk.by r13 = com.facetec.sdk.C2865by.FACE_NOT_LOOKING_STRAIGHT_AHEAD     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r13 = r13.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r14 = 16
                r12[r13] = r14     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r12 = f9694d     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.facetec.sdk.by r13 = com.facetec.sdk.C2865by.USE_EVEN_LIGHTING     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r13 = r13.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r14 = 17
                r12[r13] = r14     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                com.facetec.sdk.ch[] r12 = com.facetec.sdk.C2895ch.values()
                int r12 = r12.length
                int[] r12 = new int[r12]
                f9693a = r12
                com.facetec.sdk.ch r13 = com.facetec.sdk.C2895ch.NONE     // Catch:{ NoSuchFieldError -> 0x00dd }
                int r13 = r13.ordinal()     // Catch:{ NoSuchFieldError -> 0x00dd }
                r12[r13] = r1     // Catch:{ NoSuchFieldError -> 0x00dd }
            L_0x00dd:
                int[] r1 = f9693a     // Catch:{ NoSuchFieldError -> 0x00e7 }
                com.facetec.sdk.ch r12 = com.facetec.sdk.C2895ch.FRAME_YOUR_FACE     // Catch:{ NoSuchFieldError -> 0x00e7 }
                int r12 = r12.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e7 }
                r1[r12] = r0     // Catch:{ NoSuchFieldError -> 0x00e7 }
            L_0x00e7:
                int[] r0 = f9693a     // Catch:{ NoSuchFieldError -> 0x00f1 }
                com.facetec.sdk.ch r1 = com.facetec.sdk.C2895ch.WEARING_SUNGLASSES     // Catch:{ NoSuchFieldError -> 0x00f1 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f1 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f1 }
            L_0x00f1:
                int[] r0 = f9693a     // Catch:{ NoSuchFieldError -> 0x00fb }
                com.facetec.sdk.ch r1 = com.facetec.sdk.C2895ch.BAD_POSE     // Catch:{ NoSuchFieldError -> 0x00fb }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fb }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x00fb }
            L_0x00fb:
                int[] r0 = f9693a     // Catch:{ NoSuchFieldError -> 0x0105 }
                com.facetec.sdk.ch r1 = com.facetec.sdk.C2895ch.TOO_BRIGHT     // Catch:{ NoSuchFieldError -> 0x0105 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0105 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0105 }
            L_0x0105:
                int[] r0 = f9693a     // Catch:{ NoSuchFieldError -> 0x010f }
                com.facetec.sdk.ch r1 = com.facetec.sdk.C2895ch.TOO_DARK     // Catch:{ NoSuchFieldError -> 0x010f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x010f }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x010f }
            L_0x010f:
                int[] r0 = f9693a     // Catch:{ NoSuchFieldError -> 0x0119 }
                com.facetec.sdk.ch r1 = com.facetec.sdk.C2895ch.MAKING_FACE     // Catch:{ NoSuchFieldError -> 0x0119 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0119 }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x0119 }
            L_0x0119:
                int[] r0 = f9693a     // Catch:{ NoSuchFieldError -> 0x0123 }
                com.facetec.sdk.ch r1 = com.facetec.sdk.C2895ch.HOLD_STEADY_3     // Catch:{ NoSuchFieldError -> 0x0123 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0123 }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x0123 }
            L_0x0123:
                int[] r0 = f9693a     // Catch:{ NoSuchFieldError -> 0x012d }
                com.facetec.sdk.ch r1 = com.facetec.sdk.C2895ch.HOLD_STEADY_2     // Catch:{ NoSuchFieldError -> 0x012d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012d }
                r0[r1] = r8     // Catch:{ NoSuchFieldError -> 0x012d }
            L_0x012d:
                int[] r0 = f9693a     // Catch:{ NoSuchFieldError -> 0x0137 }
                com.facetec.sdk.ch r1 = com.facetec.sdk.C2895ch.HOLD_STEADY_1     // Catch:{ NoSuchFieldError -> 0x0137 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0137 }
                r0[r1] = r9     // Catch:{ NoSuchFieldError -> 0x0137 }
            L_0x0137:
                int[] r0 = f9693a     // Catch:{ NoSuchFieldError -> 0x0141 }
                com.facetec.sdk.ch r1 = com.facetec.sdk.C2895ch.MOVE_CLOSER     // Catch:{ NoSuchFieldError -> 0x0141 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0141 }
                r0[r1] = r10     // Catch:{ NoSuchFieldError -> 0x0141 }
            L_0x0141:
                int[] r0 = f9693a     // Catch:{ NoSuchFieldError -> 0x014b }
                com.facetec.sdk.ch r1 = com.facetec.sdk.C2895ch.MOVE_AWAY     // Catch:{ NoSuchFieldError -> 0x014b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x014b }
                r0[r1] = r11     // Catch:{ NoSuchFieldError -> 0x014b }
            L_0x014b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2906co.C29074.<clinit>():void");
        }
    }

    public C2906co(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m12127e() {
        if (!C2949dl.f9968b && this.f9684d == C2747R.string.FaceTec_feedback_move_phone_closer) {
            C2949dl.m12483d(getContext(), C2949dl.C2951d.FACE_CAPTURE_MOVE_CLOSER_DELAYED);
        }
    }

    /* renamed from: a */
    static int m12118a(C2895ch chVar) {
        switch (C29074.f9693a[chVar.ordinal()]) {
            case 1:
                return C2747R.string.FaceTec_presession_frame_your_face;
            case 2:
                return C2747R.string.FaceTec_presession_frame_your_face;
            case 3:
                return C2747R.string.FaceTec_presession_remove_dark_glasses;
            case 4:
                return C2747R.string.FaceTec_presession_position_face_straight_in_oval;
            case 5:
                return C2747R.string.FaceTec_presession_conditions_too_bright;
            case 6:
                return C2747R.string.FaceTec_presession_brighten_your_environment;
            case 7:
                return C2747R.string.FaceTec_presession_neutral_expression;
            case 8:
                return C2747R.string.FaceTec_presession_hold_steady_3;
            case 9:
                return C2747R.string.FaceTec_presession_hold_steady_2;
            case 10:
                return C2747R.string.FaceTec_presession_hold_steady_1;
            case 11:
                return C2747R.string.FaceTec_feedback_move_phone_closer;
            case 12:
                return C2747R.string.FaceTec_feedback_move_phone_away;
            default:
                return C2747R.string.FaceTec_presession_frame_your_face;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m12125d(Animator animator) {
        C2923cy.m12209e(this.f9683c, this.f9684d);
        Animation animation = this.f9691m;
        if (animation != null) {
            animation.cancel();
            this.f9691m = null;
            this.f9683c.setScaleX(1.0f);
            this.f9683c.setScaleY(1.0f);
        }
        this.f9688h.start();
    }

    /* renamed from: b */
    public final void mo9046b() {
        postDelayed(new C3509pg(this, 500), 50);
    }

    /* renamed from: c */
    public final void mo9047c() {
        if (this.f9684d == C2747R.string.FaceTec_feedback_move_phone_closer) {
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.15f, 1.0f, 1.15f, 1, 0.5f, 1, 0.5f);
            this.f9691m = scaleAnimation;
            scaleAnimation.setDuration(800);
            this.f9691m.setRepeatMode(2);
            this.f9691m.setRepeatCount(-1);
            this.f9683c.startAnimation(this.f9691m);
            if (FaceTecSDK.f8630e.vocalGuidanceCustomization.mode != FaceTecVocalGuidanceCustomization.VocalGuidanceMode.FULL_VOCAL_GUIDANCE && FaceTecSDK.f8630e.vocalGuidanceCustomization.mode != FaceTecVocalGuidanceCustomization.VocalGuidanceMode.NO_VOCAL_GUIDANCE) {
                Handler handler = new Handler();
                this.f9689i = handler;
                handler.postDelayed(new C3579sg(this), 1000);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m12121b(int i) {
        float y = getY();
        setVisibility(0);
        setAlpha(Utils.FLOAT_EPSILON);
        setY(y - ((float) (this.f9682b.getHeight() / 2)));
        animate().setDuration((long) i).alpha(1.0f).y(y).setListener((Animator.AnimatorListener) null).start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo9048e(int i) {
        if (!this.f9687g && i != this.f9684d) {
            this.f9684d = i;
            this.f9687g = true;
            C2949dl.m12470a(i);
            this.f9690j.start();
            postDelayed(new C3530qg(this), 800);
        }
    }

    /* renamed from: b */
    static int m12120b(C2865by byVar) {
        boolean a = C2949dl.m12473a();
        switch (C29074.f9694d[byVar.ordinal()]) {
            case 1:
                return C2747R.string.FaceTec_feedback_hold_steady;
            case 2:
                return a ? C2747R.string.FaceTec_accessibility_feedback_face_not_on_camera : C2747R.string.FaceTec_feedback_face_not_found;
            case 3:
                return a ? C2747R.string.FaceTec_accessibility_feedback_move_phone_closer : C2747R.string.FaceTec_feedback_move_phone_closer;
            case 4:
                return a ? C2747R.string.FaceTec_accessibility_feedback_move_phone_closer : C2747R.string.FaceTec_feedback_move_phone_closer;
            case 5:
                return a ? C2747R.string.FaceTec_accessibility_feedback_move_phone_away : C2747R.string.FaceTec_feedback_move_phone_away;
            case 6:
                return a ? C2747R.string.FaceTec_accessibility_feedback_move_phone_away : C2747R.string.FaceTec_feedback_move_phone_away;
            case 7:
                return a ? C2747R.string.FaceTec_accessibility_feedback_face_too_high : C2747R.string.FaceTec_feedback_center_face;
            case 8:
                return a ? C2747R.string.FaceTec_accessibility_feedback_face_too_low : C2747R.string.FaceTec_feedback_center_face;
            case 9:
                return a ? C2747R.string.FaceTec_accessibility_feedback_face_too_far_left : C2747R.string.FaceTec_feedback_center_face;
            case 10:
                return a ? C2747R.string.FaceTec_accessibility_feedback_face_too_far_right : C2747R.string.FaceTec_feedback_center_face;
            case 11:
                return a ? C2747R.string.FaceTec_accessibility_feedback_face_rotated_too_far_left : C2747R.string.FaceTec_feedback_face_not_upright;
            case 12:
                return a ? C2747R.string.FaceTec_accessibility_feedback_face_rotated_too_far_right : C2747R.string.FaceTec_feedback_face_not_upright;
            case 13:
                return a ? C2747R.string.FaceTec_accessibility_feedback_hold_device_to_eye_level : C2747R.string.FaceTec_feedback_move_phone_to_eye_level;
            case 14:
                return a ? C2747R.string.FaceTec_accessibility_feedback_face_pointing_too_far_left : C2747R.string.FaceTec_feedback_face_not_looking_straight_ahead;
            case 15:
                return a ? C2747R.string.FaceTec_accessibility_feedback_face_pointing_too_far_right : C2747R.string.FaceTec_feedback_face_not_looking_straight_ahead;
            case 16:
                return C2747R.string.FaceTec_feedback_face_not_looking_straight_ahead;
            case 17:
                return C2747R.string.FaceTec_feedback_use_even_lighting;
            default:
                return C2747R.string.FaceTec_feedback_face_not_found;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m12124d() {
        this.f9687g = false;
    }
}
