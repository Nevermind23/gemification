package sk0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import ok0.C27029e;
import ok0.C27030f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;

/* renamed from: sk0.c */
public final class C28240c implements C6201a {

    /* renamed from: d */
    private final LayerView f71647d;

    /* renamed from: e */
    public final ImageView f71648e;

    /* renamed from: f */
    public final Button f71649f;

    private C28240c(LayerView layerView, ImageView imageView, Button button) {
        this.f71647d = layerView;
        this.f71648e = imageView;
        this.f71649f = button;
    }

    /* renamed from: a */
    public static C28240c m86782a(View view) {
        int i = C27029e.badge_hub;
        ImageView imageView = (ImageView) C6202b.m24689a(view, i);
        if (imageView != null) {
            i = C27029e.button_hub;
            Button button = (Button) C6202b.m24689a(view, i);
            if (button != null) {
                return new C28240c((LayerView) view, imageView, button);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28240c m86783d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27030f.item_list_hub, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m86782a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f71647d;
    }
}
