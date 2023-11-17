package j11;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import f11.C31911e;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.SingleLineTextItem;
import p341ge.bog.designsystem.components.radiobutton.RadioButtonView;
import p90.C27272c8;

/* renamed from: j11.b */
public final class C36694b implements C6201a {

    /* renamed from: d */
    private final LinearLayout f88529d;

    /* renamed from: e */
    public final ListItem f88530e;

    /* renamed from: f */
    public final RadioButtonView f88531f;

    /* renamed from: g */
    public final LayerView f88532g;

    /* renamed from: h */
    public final ListItem f88533h;

    /* renamed from: i */
    public final RadioButtonView f88534i;

    /* renamed from: j */
    public final ListItem f88535j;

    /* renamed from: k */
    public final RadioButtonView f88536k;

    /* renamed from: l */
    public final EmptyWidget f88537l;

    /* renamed from: m */
    public final AppCompatImageView f88538m;

    /* renamed from: n */
    public final AppCompatImageView f88539n;

    /* renamed from: o */
    public final SingleLineTextItem f88540o;

    /* renamed from: p */
    public final ListItem f88541p;

    /* renamed from: q */
    public final SingleLineTextItem f88542q;

    /* renamed from: r */
    public final ListItem f88543r;

    /* renamed from: s */
    public final C27272c8 f88544s;

    private C36694b(LinearLayout linearLayout, ListItem listItem, RadioButtonView radioButtonView, LayerView layerView, ListItem listItem2, RadioButtonView radioButtonView2, ListItem listItem3, RadioButtonView radioButtonView3, EmptyWidget emptyWidget, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, SingleLineTextItem singleLineTextItem, ListItem listItem4, SingleLineTextItem singleLineTextItem2, ListItem listItem5, C27272c8 c8Var) {
        this.f88529d = linearLayout;
        this.f88530e = listItem;
        this.f88531f = radioButtonView;
        this.f88532g = layerView;
        this.f88533h = listItem2;
        this.f88534i = radioButtonView2;
        this.f88535j = listItem3;
        this.f88536k = radioButtonView3;
        this.f88537l = emptyWidget;
        this.f88538m = appCompatImageView;
        this.f88539n = appCompatImageView2;
        this.f88540o = singleLineTextItem;
        this.f88541p = listItem4;
        this.f88542q = singleLineTextItem2;
        this.f88543r = listItem5;
        this.f88544s = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009f, code lost:
        r1 = f11.C31910d.f78662Y;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static j11.C36694b m108820a(android.view.View r20) {
        /*
            r0 = r20
            int r1 = f11.C31910d.f78666g
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r5 = r2
            ge.bog.designsystem.components.list.ListItem r5 = (p341ge.bog.designsystem.components.list.ListItem) r5
            if (r5 == 0) goto L_0x00b5
            int r1 = f11.C31910d.dark_mode_auto_radio
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r6 = r2
            ge.bog.designsystem.components.radiobutton.RadioButtonView r6 = (p341ge.bog.designsystem.components.radiobutton.RadioButtonView) r6
            if (r6 == 0) goto L_0x00b5
            int r1 = f11.C31910d.dark_mode_container
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r7 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r7 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r7
            if (r7 == 0) goto L_0x00b5
            int r1 = f11.C31910d.f78667k
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r8 = r2
            ge.bog.designsystem.components.list.ListItem r8 = (p341ge.bog.designsystem.components.list.ListItem) r8
            if (r8 == 0) goto L_0x00b5
            int r1 = f11.C31910d.dark_mode_dark_radio
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r9 = r2
            ge.bog.designsystem.components.radiobutton.RadioButtonView r9 = (p341ge.bog.designsystem.components.radiobutton.RadioButtonView) r9
            if (r9 == 0) goto L_0x00b5
            int r1 = f11.C31910d.f78668m
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r10 = r2
            ge.bog.designsystem.components.list.ListItem r10 = (p341ge.bog.designsystem.components.list.ListItem) r10
            if (r10 == 0) goto L_0x00b5
            int r1 = f11.C31910d.dark_mode_none_radio
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r11 = r2
            ge.bog.designsystem.components.radiobutton.RadioButtonView r11 = (p341ge.bog.designsystem.components.radiobutton.RadioButtonView) r11
            if (r11 == 0) goto L_0x00b5
            int r1 = f11.C31910d.dark_mode_title
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r12 = r2
            ge.bog.designsystem.components.emptywidget.EmptyWidget r12 = (p341ge.bog.designsystem.components.emptywidget.EmptyWidget) r12
            if (r12 == 0) goto L_0x00b5
            int r1 = f11.C31910d.icon_en_tick_iv
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r13 = r2
            androidx.appcompat.widget.AppCompatImageView r13 = (androidx.appcompat.widget.AppCompatImageView) r13
            if (r13 == 0) goto L_0x00b5
            int r1 = f11.C31910d.icon_ge_tick_iv
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r14 = r2
            androidx.appcompat.widget.AppCompatImageView r14 = (androidx.appcompat.widget.AppCompatImageView) r14
            if (r14 == 0) goto L_0x00b5
            int r1 = f11.C31910d.select_en_text
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r15 = r2
            ge.bog.designsystem.components.list.SingleLineTextItem r15 = (p341ge.bog.designsystem.components.list.SingleLineTextItem) r15
            if (r15 == 0) goto L_0x00b5
            int r1 = f11.C31910d.select_en_view
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r16 = r2
            ge.bog.designsystem.components.list.ListItem r16 = (p341ge.bog.designsystem.components.list.ListItem) r16
            if (r16 == 0) goto L_0x00b5
            int r1 = f11.C31910d.select_ge_text
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r17 = r2
            ge.bog.designsystem.components.list.SingleLineTextItem r17 = (p341ge.bog.designsystem.components.list.SingleLineTextItem) r17
            if (r17 == 0) goto L_0x00b5
            int r1 = f11.C31910d.select_geo_view
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r18 = r2
            ge.bog.designsystem.components.list.ListItem r18 = (p341ge.bog.designsystem.components.list.ListItem) r18
            if (r18 == 0) goto L_0x00b5
            int r1 = f11.C31910d.f78662Y
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00b5
            p90.c8 r19 = p90.C27272c8.m84388a(r2)
            j11.b r1 = new j11.b
            r3 = r1
            r4 = r0
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r1
        L_0x00b5:
            android.content.res.Resources r0 = r20.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j11.C36694b.m108820a(android.view.View):j11.b");
    }

    /* renamed from: d */
    public static C36694b m108821d(LayoutInflater layoutInflater) {
        return m108822e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C36694b m108822e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31911e.activity_change_language, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108820a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f88529d;
    }
}
