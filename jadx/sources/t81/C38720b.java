package t81;

import android.view.View;
import p341ge.bog.mobilebank.model.smsnotification.SMSTypeGroup;

/* renamed from: t81.b */
public final /* synthetic */ class C38720b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C38721c f92614d;

    /* renamed from: e */
    public final /* synthetic */ SMSTypeGroup f92615e;

    /* renamed from: f */
    public final /* synthetic */ String f92616f;

    public /* synthetic */ C38720b(C38721c cVar, SMSTypeGroup sMSTypeGroup, String str) {
        this.f92614d = cVar;
        this.f92615e = sMSTypeGroup;
        this.f92616f = str;
    }

    public final void onClick(View view) {
        this.f92614d.m113409o1(this.f92615e, this.f92616f, view);
    }
}
