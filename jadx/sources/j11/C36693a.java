package j11;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import f11.C31911e;
import p086g1.C6201a;

/* renamed from: j11.a */
public final class C36693a implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f88523d;

    /* renamed from: e */
    public final Guideline f88524e;

    /* renamed from: f */
    public final Guideline f88525f;

    /* renamed from: g */
    public final C36697e f88526g;

    /* renamed from: h */
    public final C36697e f88527h;

    /* renamed from: i */
    public final C36697e f88528i;

    private C36693a(ConstraintLayout constraintLayout, Guideline guideline, Guideline guideline2, C36697e eVar, C36697e eVar2, C36697e eVar3) {
        this.f88523d = constraintLayout;
        this.f88524e = guideline;
        this.f88525f = guideline2;
        this.f88526g = eVar;
        this.f88527h = eVar2;
        this.f88528i = eVar3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r0 = f11.C31910d.mode_dark;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static j11.C36693a m108816a(android.view.View r9) {
        /*
            int r0 = f11.C31910d.f78669t
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r4 = r1
            androidx.constraintlayout.widget.Guideline r4 = (androidx.constraintlayout.widget.Guideline) r4
            if (r4 == 0) goto L_0x0044
            int r0 = f11.C31910d.f78670u
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r5 = r1
            androidx.constraintlayout.widget.Guideline r5 = (androidx.constraintlayout.widget.Guideline) r5
            if (r5 == 0) goto L_0x0044
            int r0 = f11.C31910d.mode_dark
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            if (r1 == 0) goto L_0x0044
            j11.e r6 = j11.C36697e.m108834a(r1)
            int r0 = f11.C31910d.mode_light
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            if (r1 == 0) goto L_0x0044
            j11.e r7 = j11.C36697e.m108834a(r1)
            int r0 = f11.C31910d.mode_system_default
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            if (r1 == 0) goto L_0x0044
            j11.e r8 = j11.C36697e.m108834a(r1)
            j11.a r0 = new j11.a
            r3 = r9
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r0
        L_0x0044:
            android.content.res.Resources r9 = r9.getResources()
            java.lang.String r9 = r9.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r9 = r1.concat(r9)
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j11.C36693a.m108816a(android.view.View):j11.a");
    }

    /* renamed from: d */
    public static C36693a m108817d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31911e.action_sheet_dark_mode_switch, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108816a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f88523d;
    }
}
