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

/* renamed from: ua1.g1 */
public final class C28644g1 implements C6201a {

    /* renamed from: d */
    private final ListItem f72744d;

    /* renamed from: e */
    public final AppCompatImageView f72745e;

    /* renamed from: f */
    public final AppCompatImageView f72746f;

    /* renamed from: g */
    public final SingleLineTextItem f72747g;

    private C28644g1(ListItem listItem, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, SingleLineTextItem singleLineTextItem) {
        this.f72744d = listItem;
        this.f72745e = appCompatImageView;
        this.f72746f = appCompatImageView2;
        this.f72747g = singleLineTextItem;
    }

    /* renamed from: a */
    public static C28644g1 m87680a(View view) {
        int i = C10216u.setting_image;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C10216u.setting_image_edit;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) C6202b.m24689a(view, i);
            if (appCompatImageView2 != null) {
                i = C10216u.setting_text;
                SingleLineTextItem singleLineTextItem = (SingleLineTextItem) C6202b.m24689a(view, i);
                if (singleLineTextItem != null) {
                    return new C28644g1((ListItem) view, appCompatImageView, appCompatImageView2, singleLineTextItem);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28644g1 m87681d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.item_security_settings_edit, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87680a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f72744d;
    }
}
