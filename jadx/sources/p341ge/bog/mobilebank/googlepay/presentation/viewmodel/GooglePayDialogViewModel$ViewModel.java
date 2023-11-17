package p341ge.bog.mobilebank.googlepay.presentation.viewmodel;

import hd1.C41204a;
import j51.C36735g;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m51.C37228a;
import nk0.C26521a;
import nk0.C26522b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;

/* renamed from: ge.bog.mobilebank.googlepay.presentation.viewmodel.GooglePayDialogViewModel$ViewModel */
public final class GooglePayDialogViewModel$ViewModel extends C21481a implements C26521a, C26522b {

    /* renamed from: d */
    private final C36735g f63025d;

    /* renamed from: e */
    private final PreferencesApiManager f63026e;

    /* renamed from: f */
    private final C26521a f63027f = this;

    /* renamed from: g */
    private final C26522b f63028g = this;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GooglePayDialogViewModel$ViewModel(C36735g gVar, PreferencesApiManager preferencesApiManager) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(gVar, "getLoginInfo");
        C41536l.m120489i(preferencesApiManager, "preferences");
        this.f63025d = gVar;
        this.f63026e = preferencesApiManager;
    }

    public void onDismiss() {
        PreferencesApiManager preferencesApiManager = this.f63026e;
        C37228a a = this.f63025d.mo89562a();
        preferencesApiManager.setGooglePayPopupCloseDate(String.valueOf(a != null ? Long.valueOf(a.mo90305b()) : null));
    }
}
