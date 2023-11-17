package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.notificationbadges.BadgeRelativeLayout;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.n1 */
public final class C9973n1 implements C6201a {

    /* renamed from: d */
    private final View f27296d;

    /* renamed from: e */
    public final BadgeRelativeLayout f27297e;

    /* renamed from: f */
    public final Button f27298f;

    /* renamed from: g */
    public final AppCompatTextView f27299g;

    /* renamed from: h */
    public final FrameLayout f27300h;

    /* renamed from: i */
    public final LayerView f27301i;

    /* renamed from: j */
    public final AppCompatImageView f27302j;

    /* renamed from: k */
    public final Button f27303k;

    /* renamed from: l */
    public final AppCompatTextView f27304l;

    private C9973n1(View view, BadgeRelativeLayout badgeRelativeLayout, Button button, AppCompatTextView appCompatTextView, FrameLayout frameLayout, LayerView layerView, AppCompatImageView appCompatImageView, Button button2, AppCompatTextView appCompatTextView2) {
        this.f27296d = view;
        this.f27297e = badgeRelativeLayout;
        this.f27298f = button;
        this.f27299g = appCompatTextView;
        this.f27300h = frameLayout;
        this.f27301i = layerView;
        this.f27302j = appCompatImageView;
        this.f27303k = button2;
        this.f27304l = appCompatTextView2;
    }

    /* renamed from: a */
    public static C9973n1 m36580a(View view) {
        int i = C17782g.badgeContainer;
        BadgeRelativeLayout badgeRelativeLayout = (BadgeRelativeLayout) C6202b.m24689a(view, i);
        if (badgeRelativeLayout != null) {
            i = C17782g.border_button;
            Button button = (Button) C6202b.m24689a(view, i);
            if (button != null) {
                i = C17782g.f49814z0;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
                if (appCompatTextView != null) {
                    i = C17782g.f49683F0;
                    FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view, i);
                    if (frameLayout != null) {
                        i = C17782g.f49772m4;
                        LayerView layerView = (LayerView) C6202b.m24689a(view, i);
                        if (layerView != null) {
                            i = C17782g.f49808w4;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
                            if (appCompatImageView != null) {
                                i = C17782g.text_button;
                                Button button2 = (Button) C6202b.m24689a(view, i);
                                if (button2 != null) {
                                    i = C17782g.top_text;
                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
                                    if (appCompatTextView2 != null) {
                                        return new C9973n1(view, badgeRelativeLayout, button, appCompatTextView, frameLayout, layerView, appCompatImageView, button2, appCompatTextView2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C9973n1 m36581c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.view_button_list, viewGroup);
            return m36580a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f27296d;
    }
}
