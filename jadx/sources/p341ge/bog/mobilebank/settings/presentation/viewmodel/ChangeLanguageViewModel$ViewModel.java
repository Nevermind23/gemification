package p341ge.bog.mobilebank.settings.presentation.viewmodel;

import android.content.Context;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import com.medallia.digital.mobilesdk.MedalliaDigital;
import com.salesforce.marketingcloud.storage.p385db.C11772k;
import f10.C20329a;
import hd1.C41204a;
import iu0.C36546y;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import n41.C37353c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import w11.C39501a;
import w11.C39502b;

/* renamed from: ge.bog.mobilebank.settings.presentation.viewmodel.ChangeLanguageViewModel$ViewModel */
public final class ChangeLanguageViewModel$ViewModel extends C21481a implements C39501a, C39502b {

    /* renamed from: d */
    private final Client f83627d;

    /* renamed from: e */
    private final PreferencesApiManager f83628e;

    /* renamed from: f */
    private final Context f83629f;

    /* renamed from: g */
    private final C39501a f83630g = this;

    /* renamed from: h */
    private final C39502b f83631h = this;

    /* renamed from: i */
    private final C20329a f83632i = C20329a.f55281b.mo48813a();

    /* renamed from: j */
    private final C1644x f83633j;

    /* renamed from: k */
    private final C1644x f83634k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChangeLanguageViewModel$ViewModel(Client client, PreferencesApiManager preferencesApiManager, Context context) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(client, "client");
        C41536l.m120489i(preferencesApiManager, "preferencesApiManager");
        C41536l.m120489i(context, "context");
        this.f83627d = client;
        this.f83628e = preferencesApiManager;
        this.f83629f = context;
        this.f83633j = new C1644x(preferencesApiManager.getLanguage());
        this.f83634k = new C1644x();
    }

    /* renamed from: Aq */
    public LiveData mo84131Aq() {
        return this.f83633j;
    }

    /* renamed from: R */
    public LiveData mo84132R() {
        return this.f83634k;
    }

    /* renamed from: dw */
    public final C39502b mo84133dw() {
        return this.f83631h;
    }

    /* renamed from: ew */
    public void mo84134ew(C37353c cVar) {
        C41536l.m120489i(cVar, C11772k.C11773a.f34182n);
        if (cVar != this.f83632i.mo48811h()) {
            this.f83632i.mo48812k(this.f83629f, cVar);
            this.f83627d.changeDeviceLanguage();
            C36546y.m108282F().mo27152s("user_settings", cVar.mo90434c(), "switch_language");
            MedalliaDigital.setCustomParameter("language", cVar);
            this.f83627d.resetDataForLanguage();
            C37224b.m109962a(this.f83634k);
        }
    }
}
