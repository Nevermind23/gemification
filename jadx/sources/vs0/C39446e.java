package vs0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p90.C27272c8;
import rs0.C38337d;

/* renamed from: vs0.e */
public final class C39446e implements C6201a {

    /* renamed from: d */
    private final NestedScrollView f93727d;

    /* renamed from: e */
    public final EmptyWidget f93728e;

    /* renamed from: f */
    public final RecyclerView f93729f;

    /* renamed from: g */
    public final TwoLineTextItem f93730g;

    /* renamed from: h */
    public final LayerView f93731h;

    /* renamed from: i */
    public final EmptyWidget f93732i;

    /* renamed from: j */
    public final Button f93733j;

    /* renamed from: k */
    public final PageState f93734k;

    /* renamed from: l */
    public final C27272c8 f93735l;

    private C39446e(NestedScrollView nestedScrollView, EmptyWidget emptyWidget, RecyclerView recyclerView, TwoLineTextItem twoLineTextItem, LayerView layerView, EmptyWidget emptyWidget2, Button button, PageState pageState, C27272c8 c8Var) {
        this.f93727d = nestedScrollView;
        this.f93728e = emptyWidget;
        this.f93729f = recyclerView;
        this.f93730g = twoLineTextItem;
        this.f93731h = layerView;
        this.f93732i = emptyWidget2;
        this.f93733j = button;
        this.f93734k = pageState;
        this.f93735l = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004d, code lost:
        r0 = rs0.C38336c.f91897w1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static vs0.C39446e m114636a(android.view.View r12) {
        /*
            int r0 = rs0.C38336c.accounts_header_label
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r4 = r1
            ge.bog.designsystem.components.emptywidget.EmptyWidget r4 = (p341ge.bog.designsystem.components.emptywidget.EmptyWidget) r4
            if (r4 == 0) goto L_0x0063
            int r0 = rs0.C38336c.f91870e
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r5 = r1
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            if (r5 == 0) goto L_0x0063
            int r0 = rs0.C38336c.f91887q
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r6 = r1
            ge.bog.designsystem.components.list.TwoLineTextItem r6 = (p341ge.bog.designsystem.components.list.TwoLineTextItem) r6
            if (r6 == 0) goto L_0x0063
            int r0 = rs0.C38336c.f91855H
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r7 = r1
            ge.bog.designsystem.components.layersandshadows.LayerView r7 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r7
            if (r7 == 0) goto L_0x0063
            int r0 = rs0.C38336c.details_header_label
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r8 = r1
            ge.bog.designsystem.components.emptywidget.EmptyWidget r8 = (p341ge.bog.designsystem.components.emptywidget.EmptyWidget) r8
            if (r8 == 0) goto L_0x0063
            int r0 = rs0.C38336c.go_to_piggy_bank_page_button
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r9 = r1
            ge.bog.designsystem.components.buttons.Button r9 = (p341ge.bog.designsystem.components.buttons.Button) r9
            if (r9 == 0) goto L_0x0063
            int r0 = rs0.C38336c.f91894u1
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r10 = r1
            ge.bog.designsystem.components.pagestate.PageState r10 = (p341ge.bog.designsystem.components.pagestate.PageState) r10
            if (r10 == 0) goto L_0x0063
            int r0 = rs0.C38336c.f91897w1
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            if (r1 == 0) goto L_0x0063
            p90.c8 r11 = p90.C27272c8.m84388a(r1)
            vs0.e r0 = new vs0.e
            r3 = r12
            androidx.core.widget.NestedScrollView r3 = (androidx.core.widget.NestedScrollView) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        L_0x0063:
            android.content.res.Resources r12 = r12.getResources()
            java.lang.String r12 = r12.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r12 = r1.concat(r12)
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vs0.C39446e.m114636a(android.view.View):vs0.e");
    }

    /* renamed from: d */
    public static C39446e m114637d(LayoutInflater layoutInflater) {
        return m114638e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C39446e m114638e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C38337d.activity_piggy_bank_success, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m114636a(inflate);
    }

    /* renamed from: c */
    public NestedScrollView mo3946b() {
        return this.f93727d;
    }
}
