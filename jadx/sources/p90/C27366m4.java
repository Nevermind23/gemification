package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.card.MaterialCardView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.m4 */
public final class C27366m4 implements C6201a {

    /* renamed from: d */
    private final MaterialCardView f69301d;

    /* renamed from: e */
    public final Button f69302e;

    private C27366m4(MaterialCardView materialCardView, Button button) {
        this.f69301d = materialCardView;
        this.f69302e = button;
    }

    /* renamed from: a */
    public static C27366m4 m84773a(View view) {
        int i = C10322k.home_error_reload_button;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            return new C27366m4((MaterialCardView) view, button);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27366m4 m84774d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.home_card_swiper_error_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84773a(inflate);
    }

    /* renamed from: c */
    public MaterialCardView mo3946b() {
        return this.f69301d;
    }
}
