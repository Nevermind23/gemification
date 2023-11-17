package z71;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import y71.C40030d;
import y71.C40031e;

/* renamed from: z71.m */
public final class C40186m implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f95544d;

    /* renamed from: e */
    public final TextView f95545e;

    /* renamed from: f */
    public final ImageView f95546f;

    private C40186m(ConstraintLayout constraintLayout, TextView textView, ImageView imageView) {
        this.f95544d = constraintLayout;
        this.f95545e = textView;
        this.f95546f = imageView;
    }

    /* renamed from: a */
    public static C40186m m116451a(View view) {
        int i = C40030d.insurance;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C40030d.insurance_badge;
            ImageView imageView = (ImageView) C6202b.m24689a(view, i);
            if (imageView != null) {
                return new C40186m((ConstraintLayout) view, textView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C40186m m116452d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C40031e.item_insurance, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m116451a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f95544d;
    }
}
