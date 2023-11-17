package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.textbadge.TextBadgeView;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.r7 */
public final class C27414r7 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f69695d;

    /* renamed from: e */
    public final View f69696e;

    /* renamed from: f */
    public final AppCompatImageView f69697f;

    /* renamed from: g */
    public final AppCompatTextView f69698g;

    /* renamed from: h */
    public final TextBadgeView f69699h;

    /* renamed from: i */
    public final AppCompatTextView f69700i;

    private C27414r7(ConstraintLayout constraintLayout, View view, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, TextBadgeView textBadgeView, AppCompatTextView appCompatTextView2) {
        this.f69695d = constraintLayout;
        this.f69696e = view;
        this.f69697f = appCompatImageView;
        this.f69698g = appCompatTextView;
        this.f69699h = textBadgeView;
        this.f69700i = appCompatTextView2;
    }

    /* renamed from: a */
    public static C27414r7 m84962a(View view) {
        int i = C10322k.f28891s4;
        View a = C6202b.m24689a(view, i);
        if (a != null) {
            i = C10322k.item_image;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
            if (appCompatImageView != null) {
                i = C10322k.f28840hi;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
                if (appCompatTextView != null) {
                    i = C10322k.f28762Km;
                    TextBadgeView textBadgeView = (TextBadgeView) C6202b.m24689a(view, i);
                    if (textBadgeView != null) {
                        i = C10322k.tab_image_notification;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
                        if (appCompatTextView2 != null) {
                            return new C27414r7((ConstraintLayout) view, a, appCompatImageView, appCompatTextView, textBadgeView, appCompatTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27414r7 m84963d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.menu_list_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84962a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f69695d;
    }
}
