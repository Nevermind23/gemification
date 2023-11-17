package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import hy0.C36271e;
import hy0.C36272f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.list.SingleLineTextItem;

/* renamed from: iy0.c1 */
public final class C36586c1 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f88162d;

    /* renamed from: e */
    public final AppCompatImageView f88163e;

    /* renamed from: f */
    public final SingleLineTextItem f88164f;

    private C36586c1(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, SingleLineTextItem singleLineTextItem) {
        this.f88162d = constraintLayout;
        this.f88163e = appCompatImageView;
        this.f88164f = singleLineTextItem;
    }

    /* renamed from: a */
    public static C36586c1 m108469a(View view) {
        int i = C36271e.attachment_icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C36271e.attachment_text;
            SingleLineTextItem singleLineTextItem = (SingleLineTextItem) C6202b.m24689a(view, i);
            if (singleLineTextItem != null) {
                return new C36586c1((ConstraintLayout) view, appCompatImageView, singleLineTextItem);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C36586c1 m108470d(LayoutInflater layoutInflater) {
        return m108471e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C36586c1 m108471e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.item_attachment_link, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108469a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f88162d;
    }
}
