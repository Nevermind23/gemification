package sk0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import ok0.C27029e;
import ok0.C27030f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;

/* renamed from: sk0.f */
public final class C28243f implements C6201a {

    /* renamed from: d */
    private final LayerView f71660d;

    /* renamed from: e */
    public final LayerView f71661e;

    /* renamed from: f */
    public final AppCompatTextView f71662f;

    private C28243f(LayerView layerView, LayerView layerView2, AppCompatTextView appCompatTextView) {
        this.f71660d = layerView;
        this.f71661e = layerView2;
        this.f71662f = appCompatTextView;
    }

    /* renamed from: a */
    public static C28243f m86794a(View view) {
        LayerView layerView = (LayerView) view;
        int i = C27029e.title_header;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
        if (appCompatTextView != null) {
            return new C28243f(layerView, layerView, appCompatTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28243f m86795d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27030f.item_list_search_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m86794a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f71660d;
    }
}
