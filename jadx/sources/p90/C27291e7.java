package p90;

import android.view.View;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.InfoMessageView;
import p366bk.C10322k;

/* renamed from: p90.e7 */
public final class C27291e7 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f68655d;

    /* renamed from: e */
    public final InfoMessageView f68656e;

    private C27291e7(LinearLayout linearLayout, InfoMessageView infoMessageView) {
        this.f68655d = linearLayout;
        this.f68656e = infoMessageView;
    }

    /* renamed from: a */
    public static C27291e7 m84465a(View view) {
        int i = C10322k.error_message_view;
        InfoMessageView infoMessageView = (InfoMessageView) C6202b.m24689a(view, i);
        if (infoMessageView != null) {
            return new C27291e7((LinearLayout) view, infoMessageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f68655d;
    }
}
