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
import p341ge.bog.designsystem.components.textbadge.TextBadgeView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.o1 */
public final class C9981o1 implements C6201a {

    /* renamed from: d */
    private final View f27340d;

    /* renamed from: e */
    public final BadgeRelativeLayout f27341e;

    /* renamed from: f */
    public final TextBadgeView f27342f;

    /* renamed from: g */
    public final FrameLayout f27343g;

    /* renamed from: h */
    public final BadgeRelativeLayout f27344h;

    /* renamed from: i */
    public final AppCompatImageView f27345i;

    /* renamed from: j */
    public final Button f27346j;

    /* renamed from: k */
    public final LayerView f27347k;

    /* renamed from: l */
    public final AppCompatTextView f27348l;

    /* renamed from: m */
    public final Button f27349m;

    /* renamed from: n */
    public final AppCompatTextView f27350n;

    private C9981o1(View view, BadgeRelativeLayout badgeRelativeLayout, TextBadgeView textBadgeView, FrameLayout frameLayout, BadgeRelativeLayout badgeRelativeLayout2, AppCompatImageView appCompatImageView, Button button, LayerView layerView, AppCompatTextView appCompatTextView, Button button2, AppCompatTextView appCompatTextView2) {
        this.f27340d = view;
        this.f27341e = badgeRelativeLayout;
        this.f27342f = textBadgeView;
        this.f27343g = frameLayout;
        this.f27344h = badgeRelativeLayout2;
        this.f27345i = appCompatImageView;
        this.f27346j = button;
        this.f27347k = layerView;
        this.f27348l = appCompatTextView;
        this.f27349m = button2;
        this.f27350n = appCompatTextView2;
    }

    /* renamed from: a */
    public static C9981o1 m36607a(View view) {
        int i = C17782g.badgeContainer;
        BadgeRelativeLayout badgeRelativeLayout = (BadgeRelativeLayout) C6202b.m24689a(view, i);
        if (badgeRelativeLayout != null) {
            i = C17782g.bottom_text_badge;
            TextBadgeView textBadgeView = (TextBadgeView) C6202b.m24689a(view, i);
            if (textBadgeView != null) {
                i = C17782g.bottom_view_container;
                FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view, i);
                if (frameLayout != null) {
                    i = C17782g.f49683F0;
                    BadgeRelativeLayout badgeRelativeLayout2 = (BadgeRelativeLayout) C6202b.m24689a(view, i);
                    if (badgeRelativeLayout2 != null) {
                        i = C17782g.f49744Y3;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
                        if (appCompatImageView != null) {
                            i = C17782g.icon_button;
                            Button button = (Button) C6202b.m24689a(view, i);
                            if (button != null) {
                                i = C17782g.f49765i5;
                                LayerView layerView = (LayerView) C6202b.m24689a(view, i);
                                if (layerView != null) {
                                    i = C17782g.lowerText;
                                    AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
                                    if (appCompatTextView != null) {
                                        i = C17782g.text_button;
                                        Button button2 = (Button) C6202b.m24689a(view, i);
                                        if (button2 != null) {
                                            i = C17782g.upperText;
                                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
                                            if (appCompatTextView2 != null) {
                                                return new C9981o1(view, badgeRelativeLayout, textBadgeView, frameLayout, badgeRelativeLayout2, appCompatImageView, button, layerView, appCompatTextView, button2, appCompatTextView2);
                                            }
                                        }
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
    public static C9981o1 m36608c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.view_button_list_large, viewGroup);
            return m36607a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f27340d;
    }
}
