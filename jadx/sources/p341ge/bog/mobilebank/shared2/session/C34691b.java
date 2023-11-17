package p341ge.bog.mobilebank.shared2.session;

import android.os.Handler;
import android.os.Message;

/* renamed from: ge.bog.mobilebank.shared2.session.b */
public final /* synthetic */ class C34691b implements Handler.Callback {

    /* renamed from: a */
    public final /* synthetic */ SessionManager f83864a;

    public /* synthetic */ C34691b(SessionManager sessionManager) {
        this.f83864a = sessionManager;
    }

    public final boolean handleMessage(Message message) {
        return SessionManager.m101894r(this.f83864a, message);
    }
}
