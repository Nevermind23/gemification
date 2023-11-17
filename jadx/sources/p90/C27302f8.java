package p90;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10322k;

/* renamed from: p90.f8 */
public final class C27302f8 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f68738d;

    /* renamed from: e */
    public final Guideline f68739e;

    /* renamed from: f */
    public final Guideline f68740f;

    /* renamed from: g */
    public final ImageView f68741g;

    /* renamed from: h */
    public final BogTextView f68742h;

    private C27302f8(ConstraintLayout constraintLayout, Guideline guideline, Guideline guideline2, ImageView imageView, BogTextView bogTextView) {
        this.f68738d = constraintLayout;
        this.f68739e = guideline;
        this.f68740f = guideline2;
        this.f68741g = imageView;
        this.f68742h = bogTextView;
    }

    /* renamed from: a */
    public static C27302f8 m84512a(View view) {
        int i = C10322k.guideline1;
        Guideline guideline = (Guideline) C6202b.m24689a(view, i);
        if (guideline != null) {
            i = C10322k.guideline2;
            Guideline guideline2 = (Guideline) C6202b.m24689a(view, i);
            if (guideline2 != null) {
                i = C10322k.toolbarLeftIV;
                ImageView imageView = (ImageView) C6202b.m24689a(view, i);
                if (imageView != null) {
                    i = C10322k.toolbarTitleTV;
                    BogTextView bogTextView = (BogTextView) C6202b.m24689a(view, i);
                    if (bogTextView != null) {
                        return new C27302f8((ConstraintLayout) view, guideline, guideline2, imageView, bogTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f68738d;
    }
}
