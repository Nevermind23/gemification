package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.view.View;
import androidx.fragment.app.C1483c;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.e */
public final /* synthetic */ class C35806e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AccountItemView f86515d;

    /* renamed from: e */
    public final /* synthetic */ C1483c f86516e;

    public /* synthetic */ C35806e(AccountItemView accountItemView, C1483c cVar) {
        this.f86515d = accountItemView;
        this.f86516e = cVar;
    }

    public final void onClick(View view) {
        this.f86515d.lambda$setAccountBlocked$4(this.f86516e, view);
    }
}
