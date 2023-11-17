package jx0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import fx0.C32024d;
import fx0.C32025e;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.chips_thumbnail.ChipThumbnail;

/* renamed from: jx0.c0 */
public final class C36814c0 implements C6201a {

    /* renamed from: d */
    private final FrameLayout f88814d;

    /* renamed from: e */
    public final ChipThumbnail f88815e;

    private C36814c0(FrameLayout frameLayout, ChipThumbnail chipThumbnail) {
        this.f88814d = frameLayout;
        this.f88815e = chipThumbnail;
    }

    /* renamed from: a */
    public static C36814c0 m109069a(View view) {
        int i = C32024d.template_chip;
        ChipThumbnail chipThumbnail = (ChipThumbnail) C6202b.m24689a(view, i);
        if (chipThumbnail != null) {
            return new C36814c0((FrameLayout) view, chipThumbnail);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C36814c0 m109070d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C32025e.item_payment_form_element_template_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m109069a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f88814d;
    }
}
