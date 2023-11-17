package t81;

import android.view.View;
import p341ge.bog.mobilebank.model.smsnotification.SMSContact;

/* renamed from: t81.a */
public final /* synthetic */ class C38719a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C38721c f92612d;

    /* renamed from: e */
    public final /* synthetic */ SMSContact f92613e;

    public /* synthetic */ C38719a(C38721c cVar, SMSContact sMSContact) {
        this.f92612d = cVar;
        this.f92613e = sMSContact;
    }

    public final void onClick(View view) {
        this.f92612d.m113408n1(this.f92613e, view);
    }
}
