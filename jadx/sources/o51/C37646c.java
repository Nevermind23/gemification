package o51;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import n51.C37357c;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.bigchips.BigChips;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.loading.LoadingView;

/* renamed from: o51.c */
public final class C37646c implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f90421d;

    /* renamed from: e */
    public final Input f90422e;

    /* renamed from: f */
    public final LinearLayout f90423f;

    /* renamed from: g */
    public final C37651h f90424g;

    /* renamed from: h */
    public final Button f90425h;

    /* renamed from: i */
    public final Group f90426i;

    /* renamed from: j */
    public final LinearLayout f90427j;

    /* renamed from: k */
    public final Input f90428k;

    /* renamed from: l */
    public final BigChips f90429l;

    /* renamed from: m */
    public final C37652i f90430m;

    /* renamed from: n */
    public final BigChips f90431n;

    /* renamed from: o */
    public final View f90432o;

    /* renamed from: p */
    public final LoadingView f90433p;

    /* renamed from: q */
    public final Input f90434q;

    /* renamed from: r */
    public final RecyclerView f90435r;

    private C37646c(ConstraintLayout constraintLayout, Input input, LinearLayout linearLayout, C37651h hVar, Button button, Group group, LinearLayout linearLayout2, Input input2, BigChips bigChips, C37652i iVar, BigChips bigChips2, View view, LoadingView loadingView, Input input3, RecyclerView recyclerView) {
        this.f90421d = constraintLayout;
        this.f90422e = input;
        this.f90423f = linearLayout;
        this.f90424g = hVar;
        this.f90425h = button;
        this.f90426i = group;
        this.f90427j = linearLayout2;
        this.f90428k = input2;
        this.f90429l = bigChips;
        this.f90430m = iVar;
        this.f90431n = bigChips2;
        this.f90432o = view;
        this.f90433p = loadingView;
        this.f90434q = input3;
        this.f90435r = recyclerView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005b, code lost:
        r1 = n51.C37356b.no_data;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        r1 = n51.C37356b.f89836s0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0018, code lost:
        r1 = n51.C37356b.data_error;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static o51.C37646c m110676a(android.view.View r19) {
        /*
            r0 = r19
            int r1 = n51.C37356b.f89830n
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r5 = r2
            ge.bog.designsystem.components.input.Input r5 = (p341ge.bog.designsystem.components.input.Input) r5
            if (r5 == 0) goto L_0x00a8
            int r1 = n51.C37356b.chips_layout
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r6 = r2
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            if (r6 == 0) goto L_0x00a8
            int r1 = n51.C37356b.data_error
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00a8
            o51.h r7 = o51.C37651h.m110697a(r2)
            int r1 = n51.C37356b.f89817J
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r8 = r2
            ge.bog.designsystem.components.buttons.Button r8 = (p341ge.bog.designsystem.components.buttons.Button) r8
            if (r8 == 0) goto L_0x00a8
            int r1 = n51.C37356b.download_group
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r9 = r2
            androidx.constraintlayout.widget.Group r9 = (androidx.constraintlayout.widget.Group) r9
            if (r9 == 0) goto L_0x00a8
            int r1 = n51.C37356b.download_type_layout
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r10 = r2
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            if (r10 == 0) goto L_0x00a8
            int r1 = n51.C37356b.end_date_input
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r11 = r2
            ge.bog.designsystem.components.input.Input r11 = (p341ge.bog.designsystem.components.input.Input) r11
            if (r11 == 0) goto L_0x00a8
            int r1 = n51.C37356b.excell_chip
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r12 = r2
            ge.bog.designsystem.components.bigchips.BigChips r12 = (p341ge.bog.designsystem.components.bigchips.BigChips) r12
            if (r12 == 0) goto L_0x00a8
            int r1 = n51.C37356b.no_data
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00a8
            o51.i r13 = o51.C37652i.m110700a(r2)
            int r1 = n51.C37356b.pdf_chip
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r14 = r2
            ge.bog.designsystem.components.bigchips.BigChips r14 = (p341ge.bog.designsystem.components.bigchips.BigChips) r14
            if (r14 == 0) goto L_0x00a8
            int r1 = n51.C37356b.f89836s0
            android.view.View r15 = p086g1.C6202b.m24689a(r0, r1)
            if (r15 == 0) goto L_0x00a8
            int r1 = n51.C37356b.f89837t0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r16 = r2
            ge.bog.designsystem.components.loading.LoadingView r16 = (p341ge.bog.designsystem.components.loading.LoadingView) r16
            if (r16 == 0) goto L_0x00a8
            int r1 = n51.C37356b.start_date_input
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r17 = r2
            ge.bog.designsystem.components.input.Input r17 = (p341ge.bog.designsystem.components.input.Input) r17
            if (r17 == 0) goto L_0x00a8
            int r1 = n51.C37356b.transactions_recycler
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r18 = r2
            androidx.recyclerview.widget.RecyclerView r18 = (androidx.recyclerview.widget.RecyclerView) r18
            if (r18 == 0) goto L_0x00a8
            o51.c r1 = new o51.c
            r4 = r0
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r1
        L_0x00a8:
            android.content.res.Resources r0 = r19.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o51.C37646c.m110676a(android.view.View):o51.c");
    }

    /* renamed from: d */
    public static C37646c m110677d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37357c.action_sheet_statements, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m110676a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f90421d;
    }
}
