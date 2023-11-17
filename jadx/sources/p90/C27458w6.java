package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.C1360g;
import androidx.databinding.ViewDataBinding;
import p366bk.C10324m;

/* renamed from: p90.w6 */
public abstract class C27458w6 extends ViewDataBinding {

    /* renamed from: y */
    public final ImageView f70178y;

    /* renamed from: z */
    public final ImageView f70179z;

    protected C27458w6(Object obj, View view, int i, ImageView imageView, ImageView imageView2) {
        super(obj, view, i);
        this.f70178y = imageView;
        this.f70179z = imageView2;
    }

    /* renamed from: B */
    public static C27458w6 m85139B(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        C1360g.m4684d();
        return m85140C(layoutInflater, viewGroup, z, (Object) null);
    }

    /* renamed from: C */
    public static C27458w6 m85140C(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (C27458w6) ViewDataBinding.m4664r(layoutInflater, C10324m.layout_credit_info_banner, viewGroup, z, obj);
    }
}
