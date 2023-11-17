package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p601sg.C17783h;

/* renamed from: ak.x */
public final class C10043x implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f27710d;

    /* renamed from: e */
    public final FrameLayout f27711e;

    /* renamed from: f */
    public final C9891d f27712f;

    /* renamed from: g */
    public final Barrier f27713g;

    /* renamed from: h */
    public final ImageView f27714h;

    /* renamed from: i */
    public final TextView f27715i;

    /* renamed from: j */
    public final AppCompatTextView f27716j;

    /* renamed from: k */
    public final AppCompatImageView f27717k;

    /* renamed from: l */
    public final CardView f27718l;

    private C10043x(ConstraintLayout constraintLayout, FrameLayout frameLayout, C9891d dVar, Barrier barrier, ImageView imageView, TextView textView, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, CardView cardView) {
        this.f27710d = constraintLayout;
        this.f27711e = frameLayout;
        this.f27712f = dVar;
        this.f27713g = barrier;
        this.f27714h = imageView;
        this.f27715i = textView;
        this.f27716j = appCompatTextView;
        this.f27717k = appCompatImageView;
        this.f27718l = cardView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = p601sg.C17782g.f49801v;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p352ak.C10043x m36836a(android.view.View r12) {
        /*
            int r0 = p601sg.C17782g.f49795u
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r4 = r1
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            if (r4 == 0) goto L_0x0063
            int r0 = p601sg.C17782g.f49801v
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            if (r1 == 0) goto L_0x0063
            ak.d r5 = p352ak.C9891d.m36278a(r1)
            int r0 = p601sg.C17782g.f49760g0
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r6 = r1
            androidx.constraintlayout.widget.Barrier r6 = (androidx.constraintlayout.widget.Barrier) r6
            if (r6 == 0) goto L_0x0063
            int r0 = p601sg.C17782g.f49714O1
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r7 = r1
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            if (r7 == 0) goto L_0x0063
            int r0 = p601sg.C17782g.f49743X1
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto L_0x0063
            int r0 = p601sg.C17782g.f49716O4
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r9 = r1
            androidx.appcompat.widget.AppCompatTextView r9 = (androidx.appcompat.widget.AppCompatTextView) r9
            if (r9 == 0) goto L_0x0063
            int r0 = p601sg.C17782g.thumbnail_image
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r10 = r1
            androidx.appcompat.widget.AppCompatImageView r10 = (androidx.appcompat.widget.AppCompatImageView) r10
            if (r10 == 0) goto L_0x0063
            int r0 = p601sg.C17782g.thumbnail_image_layout
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r11 = r1
            androidx.cardview.widget.CardView r11 = (androidx.cardview.widget.CardView) r11
            if (r11 == 0) goto L_0x0063
            ak.x r0 = new ak.x
            r3 = r12
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
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
        throw new UnsupportedOperationException("Method not decompiled: p352ak.C10043x.m36836a(android.view.View):ak.x");
    }

    /* renamed from: d */
    public static C10043x m36837d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.layout_banner_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36836a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f27710d;
    }
}
