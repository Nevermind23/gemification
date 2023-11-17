package p536nl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p480jl.C16213d;
import p480jl.C16214e;

/* renamed from: nl.r */
public final class C17065r implements C6201a {

    /* renamed from: d */
    private final LayerView f47669d;

    /* renamed from: e */
    public final ImageView f47670e;

    /* renamed from: f */
    public final AppCompatTextView f47671f;

    private C17065r(LayerView layerView, ImageView imageView, AppCompatTextView appCompatTextView) {
        this.f47669d = layerView;
        this.f47670e = imageView;
        this.f47671f = appCompatTextView;
    }

    /* renamed from: a */
    public static C17065r m59966a(View view) {
        int i = C16213d.pdf_icon;
        ImageView imageView = (ImageView) C6202b.m24689a(view, i);
        if (imageView != null) {
            i = C16213d.schedule_title;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView != null) {
                return new C17065r((LayerView) view, imageView, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C17065r m59967d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C16214e.item_bnpl_schedule_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m59966a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f47669d;
    }
}
