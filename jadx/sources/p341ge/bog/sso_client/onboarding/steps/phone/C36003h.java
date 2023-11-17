package p341ge.bog.sso_client.onboarding.steps.phone;

import androidx.lifecycle.C1645y;
import p341ge.bog.sso_client.models.CountryCode;

/* renamed from: ge.bog.sso_client.onboarding.steps.phone.h */
public final /* synthetic */ class C36003h implements C1645y {

    /* renamed from: a */
    public final /* synthetic */ C36008m f87101a;

    /* renamed from: b */
    public final /* synthetic */ CountryCodeActionSheet f87102b;

    public /* synthetic */ C36003h(C36008m mVar, CountryCodeActionSheet countryCodeActionSheet) {
        this.f87101a = mVar;
        this.f87102b = countryCodeActionSheet;
    }

    public final void onChanged(Object obj) {
        C36008m.m107183y1(this.f87101a, this.f87102b, (CountryCode) obj);
    }
}
