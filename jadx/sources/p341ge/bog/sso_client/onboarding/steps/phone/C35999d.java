package p341ge.bog.sso_client.onboarding.steps.phone;

import android.view.View;
import p341ge.bog.designsystem.components.input.Input;

/* renamed from: ge.bog.sso_client.onboarding.steps.phone.d */
public final /* synthetic */ class C35999d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Input f87094d;

    /* renamed from: e */
    public final /* synthetic */ CountryCodeActionSheet f87095e;

    /* renamed from: f */
    public final /* synthetic */ C36008m f87096f;

    public /* synthetic */ C35999d(Input input, CountryCodeActionSheet countryCodeActionSheet, C36008m mVar) {
        this.f87094d = input;
        this.f87095e = countryCodeActionSheet;
        this.f87096f = mVar;
    }

    public final void onClick(View view) {
        C36008m.m107161E1(this.f87094d, this.f87095e, this.f87096f, view);
    }
}
