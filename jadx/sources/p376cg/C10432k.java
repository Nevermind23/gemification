package p376cg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p653wf.C18589r;

/* renamed from: cg.k */
public final class C10432k implements C6201a {

    /* renamed from: d */
    private final LinearLayout f29698d;

    /* renamed from: e */
    public final LinearLayout f29699e;

    /* renamed from: f */
    public final AppCompatTextView f29700f;

    /* renamed from: g */
    public final View f29701g;

    /* renamed from: h */
    public final View f29702h;

    /* renamed from: i */
    public final AppCompatImageView f29703i;

    /* renamed from: j */
    public final AppCompatTextView f29704j;

    private C10432k(LinearLayout linearLayout, LinearLayout linearLayout2, AppCompatTextView appCompatTextView, View view, View view2, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView2) {
        this.f29698d = linearLayout;
        this.f29699e = linearLayout2;
        this.f29700f = appCompatTextView;
        this.f29701g = view;
        this.f29702h = view2;
        this.f29703i = appCompatImageView;
        this.f29704j = appCompatTextView2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r0 = p653wf.C18588q.f52161h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        r0 = p653wf.C18588q.f52165p;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p376cg.C10432k m37892a(android.view.View r10) {
        /*
            int r0 = p653wf.C18588q.answer_layout
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r4 = r1
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            if (r4 == 0) goto L_0x0046
            int r0 = p653wf.C18588q.answer_tex
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r5 = r1
            androidx.appcompat.widget.AppCompatTextView r5 = (androidx.appcompat.widget.AppCompatTextView) r5
            if (r5 == 0) goto L_0x0046
            int r0 = p653wf.C18588q.f52161h
            android.view.View r6 = p086g1.C6202b.m24689a(r10, r0)
            if (r6 == 0) goto L_0x0046
            int r0 = p653wf.C18588q.f52165p
            android.view.View r7 = p086g1.C6202b.m24689a(r10, r0)
            if (r7 == 0) goto L_0x0046
            int r0 = p653wf.C18588q.question_icon
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r8 = r1
            androidx.appcompat.widget.AppCompatImageView r8 = (androidx.appcompat.widget.AppCompatImageView) r8
            if (r8 == 0) goto L_0x0046
            int r0 = p653wf.C18588q.f52167t0
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r9 = r1
            androidx.appcompat.widget.AppCompatTextView r9 = (androidx.appcompat.widget.AppCompatTextView) r9
            if (r9 == 0) goto L_0x0046
            cg.k r0 = new cg.k
            r3 = r10
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r0
        L_0x0046:
            android.content.res.Resources r10 = r10.getResources()
            java.lang.String r10 = r10.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r10 = r1.concat(r10)
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p376cg.C10432k.m37892a(android.view.View):cg.k");
    }

    /* renamed from: d */
    public static C10432k m37893d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C18589r.item_faq, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m37892a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f29698d;
    }
}
