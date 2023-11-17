package p376cg;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p653wf.C18588q;

/* renamed from: cg.i */
public final class C10430i implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f29694d;

    /* renamed from: e */
    public final ImageView f29695e;

    private C10430i(ConstraintLayout constraintLayout, ImageView imageView) {
        this.f29694d = constraintLayout;
        this.f29695e = imageView;
    }

    /* renamed from: a */
    public static C10430i m37885a(View view) {
        int i = C18588q.noHistoryBankLogo;
        ImageView imageView = (ImageView) C6202b.m24689a(view, i);
        if (imageView != null) {
            return new C10430i((ConstraintLayout) view, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f29694d;
    }
}
