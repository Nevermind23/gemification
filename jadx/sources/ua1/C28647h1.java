package ua1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import ba1.C10216u;
import ba1.C10217v;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.SingleLineTextItem;
import p341ge.bog.designsystem.components.toggle.ToggleView;

/* renamed from: ua1.h1 */
public final class C28647h1 implements C6201a {

    /* renamed from: d */
    private final ListItem f72752d;

    /* renamed from: e */
    public final AppCompatImageView f72753e;

    /* renamed from: f */
    public final SingleLineTextItem f72754f;

    /* renamed from: g */
    public final ToggleView f72755g;

    private C28647h1(ListItem listItem, AppCompatImageView appCompatImageView, SingleLineTextItem singleLineTextItem, ToggleView toggleView) {
        this.f72752d = listItem;
        this.f72753e = appCompatImageView;
        this.f72754f = singleLineTextItem;
        this.f72755g = toggleView;
    }

    /* renamed from: a */
    public static C28647h1 m87692a(View view) {
        int i = C10216u.setting_image;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C10216u.setting_text;
            SingleLineTextItem singleLineTextItem = (SingleLineTextItem) C6202b.m24689a(view, i);
            if (singleLineTextItem != null) {
                i = C10216u.setting_toggle;
                ToggleView toggleView = (ToggleView) C6202b.m24689a(view, i);
                if (toggleView != null) {
                    return new C28647h1((ListItem) view, appCompatImageView, singleLineTextItem, toggleView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28647h1 m87693d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.item_security_settings_toggle, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87692a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f72752d;
    }
}
