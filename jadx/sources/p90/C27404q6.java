package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.TwoLineReverseTextItem;
import p366bk.C10324m;

/* renamed from: p90.q6 */
public final class C27404q6 implements C6201a {

    /* renamed from: d */
    private final LayerView f69613d;

    /* renamed from: e */
    public final ImageView f69614e;

    /* renamed from: f */
    public final View f69615f;

    /* renamed from: g */
    public final TwoLineReverseTextItem f69616g;

    /* renamed from: h */
    public final ListItem f69617h;

    /* renamed from: i */
    public final ImageView f69618i;

    /* renamed from: j */
    public final LayerView f69619j;

    private C27404q6(LayerView layerView, ImageView imageView, View view, TwoLineReverseTextItem twoLineReverseTextItem, ListItem listItem, ImageView imageView2, LayerView layerView2) {
        this.f69613d = layerView;
        this.f69614e = imageView;
        this.f69615f = view;
        this.f69616g = twoLineReverseTextItem;
        this.f69617h = listItem;
        this.f69618i = imageView2;
        this.f69619j = layerView2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = p366bk.C10322k.item_external_transfer_divider;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p90.C27404q6 m84919a(android.view.View r10) {
        /*
            int r0 = p366bk.C10322k.f28836g2
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r4 = r1
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            if (r4 == 0) goto L_0x0049
            int r0 = p366bk.C10322k.item_external_transfer_divider
            android.view.View r5 = p086g1.C6202b.m24689a(r10, r0)
            if (r5 == 0) goto L_0x0049
            int r0 = p366bk.C10322k.item_external_transfer_info
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r6 = r1
            ge.bog.designsystem.components.list.TwoLineReverseTextItem r6 = (p341ge.bog.designsystem.components.list.TwoLineReverseTextItem) r6
            if (r6 == 0) goto L_0x0049
            int r0 = p366bk.C10322k.item_other_transfer_type
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r7 = r1
            ge.bog.designsystem.components.list.ListItem r7 = (p341ge.bog.designsystem.components.list.ListItem) r7
            if (r7 == 0) goto L_0x0049
            int r0 = p366bk.C10322k.item_transfer_type_icon
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r8 = r1
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            if (r8 == 0) goto L_0x0049
            int r0 = p366bk.C10322k.item_transfer_type_icon_layer
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r9 = r1
            ge.bog.designsystem.components.layersandshadows.LayerView r9 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r9
            if (r9 == 0) goto L_0x0049
            p90.q6 r0 = new p90.q6
            r3 = r10
            ge.bog.designsystem.components.layersandshadows.LayerView r3 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r0
        L_0x0049:
            android.content.res.Resources r10 = r10.getResources()
            java.lang.String r10 = r10.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r10 = r1.concat(r10)
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p90.C27404q6.m84919a(android.view.View):p90.q6");
    }

    /* renamed from: d */
    public static C27404q6 m84920d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.item_transfer_external_list_type, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84919a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f69613d;
    }
}
