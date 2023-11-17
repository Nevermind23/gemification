package xz0;

import android.os.Bundle;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import g91.C32343x;
import hd1.C41204a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.liabilityoverdue.liabilityinfo.LiabilityOverdueInfoUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.liabilityoverdue.liabilityinfo.ManagerInfoUiModel;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p380ck.C10464h;

/* renamed from: xz0.k */
public final class C39985k extends C21481a implements C39983i, C39984j {

    /* renamed from: l */
    public static final C39986a f94971l = new C39986a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final PreferencesApiManager f94972d;

    /* renamed from: e */
    private final LiabilityOverdueInfoUiModel f94973e;

    /* renamed from: f */
    private final C39983i f94974f = this;

    /* renamed from: g */
    private final C39984j f94975g = this;

    /* renamed from: h */
    private final C1644x f94976h;

    /* renamed from: i */
    private final C1644x f94977i;

    /* renamed from: j */
    private final C1644x f94978j;

    /* renamed from: k */
    private final C1644x f94979k;

    /* renamed from: xz0.k$a */
    public static final class C39986a {
        private C39986a() {
        }

        public /* synthetic */ C39986a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: xz0.k$b */
    public interface C39987b {
        /* renamed from: a */
        C39985k mo32800a(LiabilityOverdueInfoUiModel liabilityOverdueInfoUiModel);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39985k(PreferencesApiManager preferencesApiManager, LiabilityOverdueInfoUiModel liabilityOverdueInfoUiModel) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(preferencesApiManager, "preferencesApiManager");
        C41536l.m120489i(liabilityOverdueInfoUiModel, "data");
        this.f94972d = preferencesApiManager;
        this.f94973e = liabilityOverdueInfoUiModel;
        C1644x xVar = new C1644x();
        this.f94976h = xVar;
        this.f94977i = new C1644x();
        this.f94978j = new C1644x();
        this.f94979k = new C1644x();
        xVar.mo4823o(liabilityOverdueInfoUiModel);
        C32343x.m95397J0(this, "Collection_popup_home", (String) null, "Display_popup", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 18, (Object) null);
    }

    /* renamed from: Ii */
    public LiveData mo93818Ii() {
        return this.f94979k;
    }

    /* renamed from: Ks */
    public LiveData mo93819Ks() {
        return this.f94978j;
    }

    /* renamed from: M5 */
    public void mo93814M5() {
        String b;
        ManagerInfoUiModel a = this.f94973e.mo54309a();
        if (a != null && (b = a.mo54321b()) != null) {
            C37224b.m109965d(this.f94978j, b);
        }
    }

    /* renamed from: dw */
    public final C39983i mo93822dw() {
        return this.f94974f;
    }

    /* renamed from: ew */
    public final C39984j mo93823ew() {
        return this.f94975g;
    }

    /* renamed from: gg */
    public LiveData mo93820gg() {
        return this.f94977i;
    }

    /* renamed from: j4 */
    public LiveData mo93821j4() {
        return this.f94976h;
    }

    public void onDismiss() {
        this.f94972d.setLastShowLiabilityOverduePopupDate();
    }

    /* renamed from: rj */
    public void mo93816rj() {
        String str;
        boolean z;
        String str2;
        String b;
        ManagerInfoUiModel a = this.f94973e.mo54309a();
        if (!(a == null || (b = a.mo54321b()) == null)) {
            C37224b.m109965d(this.f94979k, b);
        }
        ManagerInfoUiModel a2 = this.f94973e.mo54309a();
        if (a2 != null) {
            str = a2.mo54320a();
        } else {
            str = null;
        }
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str2 = "Callback_request";
        } else {
            str2 = "Call_Manager";
        }
        C32343x.m95397J0(this, "Collection_popup_home", (String) null, str2, C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 18, (Object) null);
    }

    /* renamed from: u7 */
    public void mo93817u7(boolean z) {
        String str;
        C37224b.m109962a(this.f94977i);
        if (z) {
            str = "Close_Popup_Button";
        } else {
            str = "Close_Popup_X";
        }
        C32343x.m95397J0(this, "Collection_popup_home", (String) null, str, C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 18, (Object) null);
    }
}
