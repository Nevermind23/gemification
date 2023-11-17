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

/* renamed from: ua1.f1 */
public final class C28641f1 implements C6201a {

    /* renamed from: d */
    private final ListItem f72729d;

    /* renamed from: e */
    public final AppCompatImageView f72730e;

    /* renamed from: f */
    public final SingleLineTextItem f72731f;

    private C28641f1(ListItem listItem, AppCompatImageView appCompatImageView, SingleLineTextItem singleLineTextItem) {
        this.f72729d = listItem;
        this.f72730e = appCompatImageView;
        this.f72731f = singleLineTextItem;
    }

    /* renamed from: a */
    public static C28641f1 m87666a(View view) {
        int i = C10216u.setting_image;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C10216u.setting_text;
            SingleLineTextItem singleLineTextItem = (SingleLineTextItem) C6202b.m24689a(view, i);
            if (singleLineTextItem != null) {
                return new C28641f1((ListItem) view, appCompatImageView, singleLineTextItem);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28641f1 m87667d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.item_security_settings, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87666a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f72729d;
    }
}
