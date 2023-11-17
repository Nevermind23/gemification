package p341ge.bog.mobilebank.bnpl.presentation.welcome;

import android.os.Bundle;
import androidx.lifecycle.C1644x;
import hd1.C41204a;
import iu0.C36546y;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p380ck.C10464h;
import p382cm.C10508d;
import p382cm.C10509e;

/* renamed from: ge.bog.mobilebank.bnpl.presentation.welcome.BnplWelcomeViewModel$ViewModel */
public final class BnplWelcomeViewModel$ViewModel extends C21481a implements C10508d, C10509e {

    /* renamed from: d */
    private final PreferencesApiManager f41285d;

    /* renamed from: e */
    private final Client f41286e;

    /* renamed from: f */
    private final C10508d f41287f = this;

    /* renamed from: g */
    private final C10509e f41288g = this;

    /* renamed from: h */
    private final C1644x f41289h = new C1644x();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BnplWelcomeViewModel$ViewModel(PreferencesApiManager preferencesApiManager, Client client) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(preferencesApiManager, "preferencesApiManager");
        C41536l.m120489i(client, "client");
        this.f41285d = preferencesApiManager;
        this.f41286e = client;
    }

    /* renamed from: dw */
    public final C10508d mo38343dw() {
        return this.f41287f;
    }

    /* renamed from: ew */
    public C1644x mo27229aw() {
        return this.f41289h;
    }

    /* renamed from: fw */
    public final C10509e mo38345fw() {
        return this.f41288g;
    }

    /* renamed from: vb */
    public void mo27228vb() {
        this.f41285d.setBnplWelcomePageSeen(this.f41286e.getLoginInfo().mo90307d());
        mo27229aw().mo4823o(Boolean.TRUE);
        C36546y.m108282F().mo27152s("bnpl", "one_time_page", "click_infopage_next_button");
        C36546y.m108282F().mo27137H("BNPL_click_infopage_next_button", "", "", (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
    }
}
