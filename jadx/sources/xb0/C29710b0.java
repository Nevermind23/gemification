package xb0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.SingleLineTextItem;
import rb0.C27985d;
import rb0.C27986e;

/* renamed from: xb0.b0 */
public final class C29710b0 implements C6201a {

    /* renamed from: d */
    private final ListItem f74979d;

    /* renamed from: e */
    public final AppCompatImageView f74980e;

    /* renamed from: f */
    public final SingleLineTextItem f74981f;

    private C29710b0(ListItem listItem, AppCompatImageView appCompatImageView, SingleLineTextItem singleLineTextItem) {
        this.f74979d = listItem;
        this.f74980e = appCompatImageView;
        this.f74981f = singleLineTextItem;
    }

    /* renamed from: a */
    public static C29710b0 m90206a(View view) {
        int i = C27985d.goal_icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C27985d.goal_name;
            SingleLineTextItem singleLineTextItem = (SingleLineTextItem) C6202b.m24689a(view, i);
            if (singleLineTextItem != null) {
                return new C29710b0((ListItem) view, appCompatImageView, singleLineTextItem);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C29710b0 m90207d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27986e.item_saving_goal, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m90206a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f74979d;
    }
}
