package i01;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import e01.C31638b;
import e01.C31639c;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;

/* renamed from: i01.e */
public final class C36337e implements C6201a {

    /* renamed from: d */
    private final ListItem f87698d;

    /* renamed from: e */
    public final View f87699e;

    /* renamed from: f */
    public final TwoLineTextItem f87700f;

    private C36337e(ListItem listItem, View view, TwoLineTextItem twoLineTextItem) {
        this.f87698d = listItem;
        this.f87699e = view;
        this.f87700f = twoLineTextItem;
    }

    /* renamed from: a */
    public static C36337e m107839a(View view) {
        int i = C31638b.f78217n;
        View a = C6202b.m24689a(view, i);
        if (a != null) {
            i = C31638b.qr_detail_info;
            TwoLineTextItem twoLineTextItem = (TwoLineTextItem) C6202b.m24689a(view, i);
            if (twoLineTextItem != null) {
                return new C36337e((ListItem) view, a, twoLineTextItem);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C36337e m107840d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31639c.item_qr_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m107839a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f87698d;
    }
}
