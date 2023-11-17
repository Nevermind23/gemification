package p481jm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p411em.C12489f;
import p90.C27272c8;

/* renamed from: jm.i */
public final class C16230i implements C6201a {

    /* renamed from: d */
    private final LinearLayoutCompat f45862d;

    /* renamed from: e */
    public final Button f45863e;

    /* renamed from: f */
    public final TwoLineTextItem f45864f;

    /* renamed from: g */
    public final TwoLineTextItem f45865g;

    /* renamed from: h */
    public final EmptyWidget f45866h;

    /* renamed from: i */
    public final PageState f45867i;

    /* renamed from: j */
    public final AppCompatTextView f45868j;

    /* renamed from: k */
    public final C27272c8 f45869k;

    private C16230i(LinearLayoutCompat linearLayoutCompat, Button button, TwoLineTextItem twoLineTextItem, TwoLineTextItem twoLineTextItem2, EmptyWidget emptyWidget, PageState pageState, AppCompatTextView appCompatTextView, C27272c8 c8Var) {
        this.f45862d = linearLayoutCompat;
        this.f45863e = button;
        this.f45864f = twoLineTextItem;
        this.f45865g = twoLineTextItem2;
        this.f45866h = emptyWidget;
        this.f45867i = pageState;
        this.f45868j = appCompatTextView;
        this.f45869k = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        r0 = p411em.C12488e.f37198d2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p481jm.C16230i m57849a(android.view.View r11) {
        /*
            int r0 = p411em.C12488e.f37210m
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r4 = r1
            ge.bog.designsystem.components.buttons.Button r4 = (p341ge.bog.designsystem.components.buttons.Button) r4
            if (r4 == 0) goto L_0x0058
            int r0 = p411em.C12488e.instant_card_details_card_item
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r5 = r1
            ge.bog.designsystem.components.list.TwoLineTextItem r5 = (p341ge.bog.designsystem.components.list.TwoLineTextItem) r5
            if (r5 == 0) goto L_0x0058
            int r0 = p411em.C12488e.instant_card_details_country_item
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r6 = r1
            ge.bog.designsystem.components.list.TwoLineTextItem r6 = (p341ge.bog.designsystem.components.list.TwoLineTextItem) r6
            if (r6 == 0) goto L_0x0058
            int r0 = p411em.C12488e.instant_card_status_details_header
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r7 = r1
            ge.bog.designsystem.components.emptywidget.EmptyWidget r7 = (p341ge.bog.designsystem.components.emptywidget.EmptyWidget) r7
            if (r7 == 0) goto L_0x0058
            int r0 = p411em.C12488e.instant_card_status_state
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r8 = r1
            ge.bog.designsystem.components.pagestate.PageState r8 = (p341ge.bog.designsystem.components.pagestate.PageState) r8
            if (r8 == 0) goto L_0x0058
            int r0 = p411em.C12488e.instant_card_status_text
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r9 = r1
            androidx.appcompat.widget.AppCompatTextView r9 = (androidx.appcompat.widget.AppCompatTextView) r9
            if (r9 == 0) goto L_0x0058
            int r0 = p411em.C12488e.f37198d2
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            if (r1 == 0) goto L_0x0058
            p90.c8 r10 = p90.C27272c8.m84388a(r1)
            jm.i r0 = new jm.i
            r3 = r11
            androidx.appcompat.widget.LinearLayoutCompat r3 = (androidx.appcompat.widget.LinearLayoutCompat) r3
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
        throw new UnsupportedOperationException("Method not decompiled: p481jm.C16230i.m57849a(android.view.View):jm.i");
    }

    /* renamed from: d */
    public static C16230i m57850d(LayoutInflater layoutInflater) {
        return m57851e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C16230i m57851e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C12489f.activity_instant_card_status, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m57849a(inflate);
    }

    /* renamed from: c */
    public LinearLayoutCompat mo3946b() {
        return this.f45862d;
    }
}
