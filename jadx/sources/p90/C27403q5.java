package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.checkbox.MaterialCheckBox;
import p086g1.C6201a;
import p086g1.C6202b;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.q5 */
public final class C27403q5 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f69608d;

    /* renamed from: e */
    public final ImageView f69609e;

    /* renamed from: f */
    public final TextView f69610f;

    /* renamed from: g */
    public final TextView f69611g;

    /* renamed from: h */
    public final MaterialCheckBox f69612h;

    private C27403q5(LinearLayout linearLayout, ImageView imageView, TextView textView, TextView textView2, MaterialCheckBox materialCheckBox) {
        this.f69608d = linearLayout;
        this.f69609e = imageView;
        this.f69610f = textView;
        this.f69611g = textView2;
        this.f69612h = materialCheckBox;
    }

    /* renamed from: a */
    public static C27403q5 m84915a(View view) {
        int i = C10322k.contact_icon_image;
        ImageView imageView = (ImageView) C6202b.m24689a(view, i);
        if (imageView != null) {
            i = C10322k.contact_name_text;
            TextView textView = (TextView) C6202b.m24689a(view, i);
            if (textView != null) {
                i = C10322k.nickname_text;
                TextView textView2 = (TextView) C6202b.m24689a(view, i);
                if (textView2 != null) {
                    i = C10322k.select_checkbox;
                    MaterialCheckBox materialCheckBox = (MaterialCheckBox) C6202b.m24689a(view, i);
                    if (materialCheckBox != null) {
                        return new C27403q5((LinearLayout) view, imageView, textView, textView2, materialCheckBox);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27403q5 m84916d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.item_money_request_contact, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84915a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f69608d;
    }
}
