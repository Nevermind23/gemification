package p341ge.bog.sso_client.onboarding.steps.phone;

import android.view.View;
import p341ge.bog.sso_client.models.CountryCode;
import p341ge.bog.sso_client.onboarding.steps.phone.CountryCodeActionSheet;

/* renamed from: ge.bog.sso_client.onboarding.steps.phone.b */
public final /* synthetic */ class C35997b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ CountryCodeActionSheet f87091d;

    /* renamed from: e */
    public final /* synthetic */ CountryCode f87092e;

    public /* synthetic */ C35997b(CountryCodeActionSheet countryCodeActionSheet, CountryCode countryCode) {
        this.f87091d = countryCodeActionSheet;
        this.f87092e = countryCode;
    }

    public final void onClick(View view) {
        CountryCodeActionSheet.C35994c.m107153j(this.f87091d, this.f87092e, view);
    }
}
