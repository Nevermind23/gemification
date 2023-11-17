package o51;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import n51.C37357c;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.chips.ChipGroup;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p90.C27272c8;

/* renamed from: o51.e */
public final class C37648e implements C6201a {

    /* renamed from: A */
    public final Input f90442A;

    /* renamed from: B */
    public final Input f90443B;

    /* renamed from: C */
    public final LoadingView f90444C;

    /* renamed from: D */
    public final Input f90445D;

    /* renamed from: E */
    public final SwipeRefreshLayout f90446E;

    /* renamed from: F */
    public final TextView f90447F;

    /* renamed from: G */
    public final C27272c8 f90448G;

    /* renamed from: H */
    public final TextView f90449H;

    /* renamed from: d */
    private final LinearLayout f90450d;

    /* renamed from: e */
    public final Input f90451e;

    /* renamed from: f */
    public final Button f90452f;

    /* renamed from: g */
    public final Button f90453g;

    /* renamed from: h */
    public final LinearLayout f90454h;

    /* renamed from: i */
    public final Button f90455i;

    /* renamed from: j */
    public final LayerView f90456j;

    /* renamed from: k */
    public final Input f90457k;

    /* renamed from: l */
    public final Input f90458l;

    /* renamed from: m */
    public final LinearLayout f90459m;

    /* renamed from: n */
    public final LayerView f90460n;

    /* renamed from: o */
    public final AppCompatImageView f90461o;

    /* renamed from: p */
    public final AppCompatTextView f90462p;

    /* renamed from: q */
    public final RelativeLayout f90463q;

    /* renamed from: r */
    public final ChipGroup f90464r;

    /* renamed from: s */
    public final TextView f90465s;

    /* renamed from: t */
    public final Input f90466t;

    /* renamed from: u */
    public final View f90467u;

    /* renamed from: v */
    public final StateView f90468v;

    /* renamed from: w */
    public final Input f90469w;

    /* renamed from: x */
    public final ChipGroup f90470x;

    /* renamed from: y */
    public final LayerView f90471y;

    /* renamed from: z */
    public final AppCompatTextView f90472z;

    private C37648e(LinearLayout linearLayout, Input input, Button button, Button button2, LinearLayout linearLayout2, Button button3, LayerView layerView, Input input2, Input input3, LinearLayout linearLayout3, LayerView layerView2, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, RelativeLayout relativeLayout, ChipGroup chipGroup, TextView textView, Input input4, View view, StateView stateView, Input input5, ChipGroup chipGroup2, LayerView layerView3, AppCompatTextView appCompatTextView2, Input input6, Input input7, LoadingView loadingView, Input input8, SwipeRefreshLayout swipeRefreshLayout, TextView textView2, C27272c8 c8Var, TextView textView3) {
        this.f90450d = linearLayout;
        this.f90451e = input;
        this.f90452f = button;
        this.f90453g = button2;
        this.f90454h = linearLayout2;
        this.f90455i = button3;
        this.f90456j = layerView;
        this.f90457k = input2;
        this.f90458l = input3;
        this.f90459m = linearLayout3;
        this.f90460n = layerView2;
        this.f90461o = appCompatImageView;
        this.f90462p = appCompatTextView;
        this.f90463q = relativeLayout;
        this.f90464r = chipGroup;
        this.f90465s = textView;
        this.f90466t = input4;
        this.f90467u = view;
        this.f90468v = stateView;
        this.f90469w = input5;
        this.f90470x = chipGroup2;
        this.f90471y = layerView3;
        this.f90472z = appCompatTextView2;
        this.f90442A = input6;
        this.f90443B = input7;
        this.f90444C = loadingView;
        this.f90445D = input8;
        this.f90446E = swipeRefreshLayout;
        this.f90447F = textView2;
        this.f90448G = c8Var;
        this.f90449H = textView3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b7, code lost:
        r1 = n51.C37356b.f89819R;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0143, code lost:
        r1 = n51.C37356b.f89814D0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static o51.C37648e m110684a(android.view.View r35) {
        /*
            r0 = r35
            int r1 = n51.C37356b.account
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r5 = r2
            ge.bog.designsystem.components.input.Input r5 = (p341ge.bog.designsystem.components.input.Input) r5
            if (r5 == 0) goto L_0x0165
            int r1 = n51.C37356b.button_add_key_word
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r6 = r2
            ge.bog.designsystem.components.buttons.Button r6 = (p341ge.bog.designsystem.components.buttons.Button) r6
            if (r6 == 0) goto L_0x0165
            int r1 = n51.C37356b.button_clear
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r7 = r2
            ge.bog.designsystem.components.buttons.Button r7 = (p341ge.bog.designsystem.components.buttons.Button) r7
            if (r7 == 0) goto L_0x0165
            int r1 = n51.C37356b.button_clear_all_key_words
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r8 = r2
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            if (r8 == 0) goto L_0x0165
            int r1 = n51.C37356b.button_filter
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r9 = r2
            ge.bog.designsystem.components.buttons.Button r9 = (p341ge.bog.designsystem.components.buttons.Button) r9
            if (r9 == 0) goto L_0x0165
            int r1 = n51.C37356b.f89825j
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r10 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r10 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r10
            if (r10 == 0) goto L_0x0165
            int r1 = n51.C37356b.card
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r11 = r2
            ge.bog.designsystem.components.input.Input r11 = (p341ge.bog.designsystem.components.input.Input) r11
            if (r11 == 0) goto L_0x0165
            int r1 = n51.C37356b.f89834q
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r12 = r2
            ge.bog.designsystem.components.input.Input r12 = (p341ge.bog.designsystem.components.input.Input) r12
            if (r12 == 0) goto L_0x0165
            int r1 = n51.C37356b.f89835s
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r13 = r2
            android.widget.LinearLayout r13 = (android.widget.LinearLayout) r13
            if (r13 == 0) goto L_0x0165
            int r1 = n51.C37356b.ccy_layer_view
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r14 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r14 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r14
            if (r14 == 0) goto L_0x0165
            int r1 = n51.C37356b.clear_all_img
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r15 = r2
            androidx.appcompat.widget.AppCompatImageView r15 = (androidx.appcompat.widget.AppCompatImageView) r15
            if (r15 == 0) goto L_0x0165
            int r1 = n51.C37356b.clear_all_title
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r16 = r2
            androidx.appcompat.widget.AppCompatTextView r16 = (androidx.appcompat.widget.AppCompatTextView) r16
            if (r16 == 0) goto L_0x0165
            int r1 = n51.C37356b.f89812C
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r17 = r2
            android.widget.RelativeLayout r17 = (android.widget.RelativeLayout) r17
            if (r17 == 0) goto L_0x0165
            int r1 = n51.C37356b.date_chips
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r18 = r2
            ge.bog.designsystem.components.chips.ChipGroup r18 = (p341ge.bog.designsystem.components.chips.ChipGroup) r18
            if (r18 == 0) goto L_0x0165
            int r1 = n51.C37356b.detailedFilterTitle
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r19 = r2
            android.widget.TextView r19 = (android.widget.TextView) r19
            if (r19 == 0) goto L_0x0165
            int r1 = n51.C37356b.end_selector
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r20 = r2
            ge.bog.designsystem.components.input.Input r20 = (p341ge.bog.designsystem.components.input.Input) r20
            if (r20 == 0) goto L_0x0165
            int r1 = n51.C37356b.f89819R
            android.view.View r21 = p086g1.C6202b.m24689a(r0, r1)
            if (r21 == 0) goto L_0x0165
            int r1 = n51.C37356b.filter_state_view
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r22 = r2
            ge.bog.mobilebank.cleanarch.presentation.common.StateView r22 = (p341ge.bog.mobilebank.cleanarch.presentation.common.StateView) r22
            if (r22 == 0) goto L_0x0165
            int r1 = n51.C37356b.input_key_word
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r23 = r2
            ge.bog.designsystem.components.input.Input r23 = (p341ge.bog.designsystem.components.input.Input) r23
            if (r23 == 0) goto L_0x0165
            int r1 = n51.C37356b.key_words_container
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r24 = r2
            ge.bog.designsystem.components.chips.ChipGroup r24 = (p341ge.bog.designsystem.components.chips.ChipGroup) r24
            if (r24 == 0) goto L_0x0165
            int r1 = n51.C37356b.key_words_layer_view
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r25 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r25 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r25
            if (r25 == 0) goto L_0x0165
            int r1 = n51.C37356b.key_words_title
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r26 = r2
            androidx.appcompat.widget.AppCompatTextView r26 = (androidx.appcompat.widget.AppCompatTextView) r26
            if (r26 == 0) goto L_0x0165
            int r1 = n51.C37356b.maximum_cash
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r27 = r2
            ge.bog.designsystem.components.input.Input r27 = (p341ge.bog.designsystem.components.input.Input) r27
            if (r27 == 0) goto L_0x0165
            int r1 = n51.C37356b.minimum_cash
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r28 = r2
            ge.bog.designsystem.components.input.Input r28 = (p341ge.bog.designsystem.components.input.Input) r28
            if (r28 == 0) goto L_0x0165
            int r1 = n51.C37356b.f89838u0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r29 = r2
            ge.bog.designsystem.components.loading.LoadingView r29 = (p341ge.bog.designsystem.components.loading.LoadingView) r29
            if (r29 == 0) goto L_0x0165
            int r1 = n51.C37356b.star_selector
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r30 = r2
            ge.bog.designsystem.components.input.Input r30 = (p341ge.bog.designsystem.components.input.Input) r30
            if (r30 == 0) goto L_0x0165
            int r1 = n51.C37356b.f89841z0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r31 = r2
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r31 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r31
            if (r31 == 0) goto L_0x0165
            int r1 = n51.C37356b.f89811B0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r32 = r2
            android.widget.TextView r32 = (android.widget.TextView) r32
            if (r32 == 0) goto L_0x0165
            int r1 = n51.C37356b.f89814D0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x0165
            p90.c8 r33 = p90.C27272c8.m84388a(r2)
            int r1 = n51.C37356b.ttleCash
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r34 = r2
            android.widget.TextView r34 = (android.widget.TextView) r34
            if (r34 == 0) goto L_0x0165
            o51.e r1 = new o51.e
            r3 = r1
            r4 = r0
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            return r1
        L_0x0165:
            android.content.res.Resources r0 = r35.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o51.C37648e.m110684a(android.view.View):o51.e");
    }

    /* renamed from: d */
    public static C37648e m110685d(LayoutInflater layoutInflater) {
        return m110686e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C37648e m110686e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37357c.activity_statements_filter, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m110684a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f90450d;
    }
}
