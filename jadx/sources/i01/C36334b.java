package i01;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import e01.C31639c;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.inlinefeedback2.InlineFeedback2;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p90.C27272c8;

/* renamed from: i01.b */
public final class C36334b implements C6201a {

    /* renamed from: d */
    private final LinearLayout f87670d;

    /* renamed from: e */
    public final Button f87671e;

    /* renamed from: f */
    public final LinearLayout f87672f;

    /* renamed from: g */
    public final LayerView f87673g;

    /* renamed from: h */
    public final EmptyWidget f87674h;

    /* renamed from: i */
    public final InlineFeedback2 f87675i;

    /* renamed from: j */
    public final PageDescriptionView f87676j;

    /* renamed from: k */
    public final C27272c8 f87677k;

    private C36334b(LinearLayout linearLayout, Button button, LinearLayout linearLayout2, LayerView layerView, EmptyWidget emptyWidget, InlineFeedback2 inlineFeedback2, PageDescriptionView pageDescriptionView, C27272c8 c8Var) {
        this.f87670d = linearLayout;
        this.f87671e = button;
        this.f87672f = linearLayout2;
        this.f87673g = layerView;
        this.f87674h = emptyWidget;
        this.f87675i = inlineFeedback2;
        this.f87676j = pageDescriptionView;
        this.f87677k = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        r0 = e01.C31638b.f78209A;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static i01.C36334b m107825a(android.view.View r11) {
        /*
            int r0 = e01.C31638b.f78211b
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r4 = r1
            ge.bog.designsystem.components.buttons.Button r4 = (p341ge.bog.designsystem.components.buttons.Button) r4
            if (r4 == 0) goto L_0x0058
            int r0 = e01.C31638b.details
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r5 = r1
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            if (r5 == 0) goto L_0x0058
            int r0 = e01.C31638b.f78215l
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r6 = r1
            ge.bog.designsystem.components.layersandshadows.LayerView r6 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r6
            if (r6 == 0) goto L_0x0058
            int r0 = e01.C31638b.f78216m
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r7 = r1
            ge.bog.designsystem.components.emptywidget.EmptyWidget r7 = (p341ge.bog.designsystem.components.emptywidget.EmptyWidget) r7
            if (r7 == 0) goto L_0x0058
            int r0 = e01.C31638b.f78220q
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r8 = r1
            ge.bog.designsystem.components.inlinefeedback2.InlineFeedback2 r8 = (p341ge.bog.designsystem.components.inlinefeedback2.InlineFeedback2) r8
            if (r8 == 0) goto L_0x0058
            int r0 = e01.C31638b.f78222t
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r9 = r1
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r9 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r9
            if (r9 == 0) goto L_0x0058
            int r0 = e01.C31638b.f78209A
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            if (r1 == 0) goto L_0x0058
            p90.c8 r10 = p90.C27272c8.m84388a(r1)
            i01.b r0 = new i01.b
            r3 = r11
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        L_0x0058:
            android.content.res.Resources r11 = r11.getResources()
            java.lang.String r11 = r11.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r11 = r1.concat(r11)
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i01.C36334b.m107825a(android.view.View):i01.b");
    }

    /* renamed from: d */
    public static C36334b m107826d(LayoutInflater layoutInflater) {
        return m107827e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C36334b m107827e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31639c.activity_qr_result_page, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m107825a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f87670d;
    }
}
