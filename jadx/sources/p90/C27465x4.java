package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.checkbox.MaterialCheckBox;
import p086g1.C6201a;
import p086g1.C6202b;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.x4 */
public final class C27465x4 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f70223d;

    /* renamed from: e */
    public final TextView f70224e;

    /* renamed from: f */
    public final TextView f70225f;

    /* renamed from: g */
    public final AppCompatTextView f70226g;

    /* renamed from: h */
    public final ImageView f70227h;

    /* renamed from: i */
    public final MaterialCheckBox f70228i;

    private C27465x4(ConstraintLayout constraintLayout, TextView textView, TextView textView2, AppCompatTextView appCompatTextView, ImageView imageView, MaterialCheckBox materialCheckBox) {
        this.f70223d = constraintLayout;
        this.f70224e = textView;
        this.f70225f = textView2;
        this.f70226g = appCompatTextView;
        this.f70227h = imageView;
        this.f70228i = materialCheckBox;
    }

    /* renamed from: a */
    public static C27465x4 m85168a(View view) {
        int i = C10322k.f28871n1;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C10322k.category_text;
            TextView textView2 = (TextView) C6202b.m24689a(view, i);
            if (textView2 != null) {
                i = C10322k.operation_description_text;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
                if (appCompatTextView != null) {
                    i = C10322k.operation_icon_image;
                    ImageView imageView = (ImageView) C6202b.m24689a(view, i);
                    if (imageView != null) {
                        i = C10322k.select_checkbox;
                        MaterialCheckBox materialCheckBox = (MaterialCheckBox) C6202b.m24689a(view, i);
                        if (materialCheckBox != null) {
                            return new C27465x4((ConstraintLayout) view, textView, textView2, appCompatTextView, imageView, materialCheckBox);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27465x4 m85169d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.item_bill_split_operation_select, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m85168a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f70223d;
    }
}
