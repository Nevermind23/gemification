package ha0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import da0.C19951e;
import da0.C19952f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;

/* renamed from: ha0.u */
public final class C24944u implements C6201a {

    /* renamed from: d */
    private final LayerView f64252d;

    /* renamed from: e */
    public final AppCompatTextView f64253e;

    /* renamed from: f */
    public final ImageView f64254f;

    /* renamed from: g */
    public final AppCompatTextView f64255g;

    private C24944u(LayerView layerView, AppCompatTextView appCompatTextView, ImageView imageView, AppCompatTextView appCompatTextView2) {
        this.f64252d = layerView;
        this.f64253e = appCompatTextView;
        this.f64254f = imageView;
        this.f64255g = appCompatTextView2;
    }

    /* renamed from: a */
    public static C24944u m79756a(View view) {
        int i = C19951e.f54505E;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
        if (appCompatTextView != null) {
            i = C19951e.f54521W;
            ImageView imageView = (ImageView) C6202b.m24689a(view, i);
            if (imageView != null) {
                i = C19951e.f54508F0;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
                if (appCompatTextView2 != null) {
                    return new C24944u((LayerView) view, appCompatTextView, imageView, appCompatTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C24944u m79757d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C19952f.list_item_deposit_advisor, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m79756a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f64252d;
    }
}
