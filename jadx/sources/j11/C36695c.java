package j11;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import f11.C31911e;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.chips.Chip;
import p341ge.bog.designsystem.components.chips.ChipGroup;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p90.C27272c8;

/* renamed from: j11.c */
public final class C36695c implements C6201a {

    /* renamed from: d */
    private final CoordinatorLayout f88545d;

    /* renamed from: e */
    public final ConstraintLayout f88546e;

    /* renamed from: f */
    public final ConstraintLayout f88547f;

    /* renamed from: g */
    public final LinearLayout f88548g;

    /* renamed from: h */
    public final LinearLayout f88549h;

    /* renamed from: i */
    public final Chip f88550i;

    /* renamed from: j */
    public final FrameLayout f88551j;

    /* renamed from: k */
    public final FrameLayout f88552k;

    /* renamed from: l */
    public final FrameLayout f88553l;

    /* renamed from: m */
    public final Chip f88554m;

    /* renamed from: n */
    public final ChipGroup f88555n;

    /* renamed from: o */
    public final LayerView f88556o;

    /* renamed from: p */
    public final LayerView f88557p;

    /* renamed from: q */
    public final LayerView f88558q;

    /* renamed from: r */
    public final RecyclerView f88559r;

    /* renamed from: s */
    public final RecyclerView f88560s;

    /* renamed from: t */
    public final CoordinatorLayout f88561t;

    /* renamed from: u */
    public final AppCompatTextView f88562u;

    /* renamed from: v */
    public final AppCompatTextView f88563v;

    /* renamed from: w */
    public final AppCompatTextView f88564w;

    /* renamed from: x */
    public final C27272c8 f88565x;

    private C36695c(CoordinatorLayout coordinatorLayout, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, LinearLayout linearLayout, LinearLayout linearLayout2, Chip chip, FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3, Chip chip2, ChipGroup chipGroup, LayerView layerView, LayerView layerView2, LayerView layerView3, RecyclerView recyclerView, RecyclerView recyclerView2, CoordinatorLayout coordinatorLayout2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, C27272c8 c8Var) {
        this.f88545d = coordinatorLayout;
        this.f88546e = constraintLayout;
        this.f88547f = constraintLayout2;
        this.f88548g = linearLayout;
        this.f88549h = linearLayout2;
        this.f88550i = chip;
        this.f88551j = frameLayout;
        this.f88552k = frameLayout2;
        this.f88553l = frameLayout3;
        this.f88554m = chip2;
        this.f88555n = chipGroup;
        this.f88556o = layerView;
        this.f88557p = layerView2;
        this.f88558q = layerView3;
        this.f88559r = recyclerView;
        this.f88560s = recyclerView2;
        this.f88561t = coordinatorLayout2;
        this.f88562u = appCompatTextView;
        this.f88563v = appCompatTextView2;
        this.f88564w = appCompatTextView3;
        this.f88565x = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d3, code lost:
        r1 = f11.C31910d.f78662Y;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static j11.C36695c m108825a(android.view.View r25) {
        /*
            r0 = r25
            int r1 = f11.C31910d.f78664b
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r5 = r2
            androidx.constraintlayout.widget.ConstraintLayout r5 = (androidx.constraintlayout.widget.ConstraintLayout) r5
            if (r5 == 0) goto L_0x00e8
            int r1 = f11.C31910d.container_settings_language
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r6 = r2
            androidx.constraintlayout.widget.ConstraintLayout r6 = (androidx.constraintlayout.widget.ConstraintLayout) r6
            if (r6 == 0) goto L_0x00e8
            int r1 = f11.C31910d.container_settings_management
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r7 = r2
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            if (r7 == 0) goto L_0x00e8
            int r1 = f11.C31910d.container_settings_security
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r8 = r2
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            if (r8 == 0) goto L_0x00e8
            int r1 = f11.C31910d.english_chip
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r9 = r2
            ge.bog.designsystem.components.chips.Chip r9 = (p341ge.bog.designsystem.components.chips.Chip) r9
            if (r9 == 0) goto L_0x00e8
            int r1 = f11.C31910d.frame_settings_language
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r10 = r2
            android.widget.FrameLayout r10 = (android.widget.FrameLayout) r10
            if (r10 == 0) goto L_0x00e8
            int r1 = f11.C31910d.frame_settings_management
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r11 = r2
            android.widget.FrameLayout r11 = (android.widget.FrameLayout) r11
            if (r11 == 0) goto L_0x00e8
            int r1 = f11.C31910d.frame_settings_security
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r12 = r2
            android.widget.FrameLayout r12 = (android.widget.FrameLayout) r12
            if (r12 == 0) goto L_0x00e8
            int r1 = f11.C31910d.georgian_chip
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r13 = r2
            ge.bog.designsystem.components.chips.Chip r13 = (p341ge.bog.designsystem.components.chips.Chip) r13
            if (r13 == 0) goto L_0x00e8
            int r1 = f11.C31910d.language_group
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r14 = r2
            ge.bog.designsystem.components.chips.ChipGroup r14 = (p341ge.bog.designsystem.components.chips.ChipGroup) r14
            if (r14 == 0) goto L_0x00e8
            int r1 = f11.C31910d.layer_settings_language
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r15 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r15 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r15
            if (r15 == 0) goto L_0x00e8
            int r1 = f11.C31910d.layer_settings_management
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r16 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r16 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r16
            if (r16 == 0) goto L_0x00e8
            int r1 = f11.C31910d.layer_settings_security
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r17 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r17 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r17
            if (r17 == 0) goto L_0x00e8
            int r1 = f11.C31910d.recycler_management_items
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r18 = r2
            androidx.recyclerview.widget.RecyclerView r18 = (androidx.recyclerview.widget.RecyclerView) r18
            if (r18 == 0) goto L_0x00e8
            int r1 = f11.C31910d.recycler_security_items
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r19 = r2
            androidx.recyclerview.widget.RecyclerView r19 = (androidx.recyclerview.widget.RecyclerView) r19
            if (r19 == 0) goto L_0x00e8
            r20 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout r20 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r20
            int r1 = f11.C31910d.title_settings_language
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r21 = r2
            androidx.appcompat.widget.AppCompatTextView r21 = (androidx.appcompat.widget.AppCompatTextView) r21
            if (r21 == 0) goto L_0x00e8
            int r1 = f11.C31910d.title_settings_management
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r22 = r2
            androidx.appcompat.widget.AppCompatTextView r22 = (androidx.appcompat.widget.AppCompatTextView) r22
            if (r22 == 0) goto L_0x00e8
            int r1 = f11.C31910d.title_settings_security
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r23 = r2
            androidx.appcompat.widget.AppCompatTextView r23 = (androidx.appcompat.widget.AppCompatTextView) r23
            if (r23 == 0) goto L_0x00e8
            int r1 = f11.C31910d.f78662Y
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00e8
            p90.c8 r24 = p90.C27272c8.m84388a(r2)
            j11.c r0 = new j11.c
            r3 = r0
            r4 = r20
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r0
        L_0x00e8:
            android.content.res.Resources r0 = r25.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j11.C36695c.m108825a(android.view.View):j11.c");
    }

    /* renamed from: d */
    public static C36695c m108826d(LayoutInflater layoutInflater) {
        return m108827e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C36695c m108827e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31911e.activity_settings, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108825a(inflate);
    }

    /* renamed from: c */
    public CoordinatorLayout mo3946b() {
        return this.f88545d;
    }
}
