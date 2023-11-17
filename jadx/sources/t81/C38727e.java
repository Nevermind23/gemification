package t81;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import n41.C37353c;
import p341ge.bog.mobilebank.model.smsnotification.SMSContact;
import p341ge.bog.mobilebank.p975ui.activities.SmsNotifManagerActivity;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogImageView;
import p90.C27348k4;

/* renamed from: t81.e */
public class C38727e extends C35651n1 {

    /* renamed from: d */
    private C27348k4 f92632d;

    /* renamed from: e */
    private SMSContact f92633e;

    /* renamed from: t81.e$a */
    class C38728a implements View.OnClickListener {
        C38728a() {
        }

        public void onClick(View view) {
            C38727e.this.m113417j1(true);
        }
    }

    /* renamed from: t81.e$b */
    class C38729b implements View.OnClickListener {
        C38729b() {
        }

        public void onClick(View view) {
            C38727e.this.m113417j1(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j1 */
    public void m113417j1(boolean z) {
        int i;
        C37353c cVar;
        BogImageView bogImageView = this.f92632d.f69162h;
        int i2 = 8;
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        bogImageView.setVisibility(i);
        BogImageView bogImageView2 = this.f92632d.f69163i;
        if (z) {
            i2 = 0;
        }
        bogImageView2.setVisibility(i2);
        SMSContact sMSContact = this.f92633e;
        if (sMSContact != null) {
            if (z) {
                cVar = C37353c.KA;
            } else {
                cVar = C37353c.EN;
            }
            sMSContact.languageCode = cVar.mo90433b();
        }
        try {
            ((SmsNotifManagerActivity) getActivity()).mo86378Q2();
        } catch (Exception unused) {
        }
    }

    /* renamed from: k1 */
    public void mo92360k1(SMSContact sMSContact) {
        C27348k4 k4Var;
        boolean z;
        this.f92633e = sMSContact;
        if (sMSContact != null && getActivity() != null && (k4Var = this.f92632d) != null) {
            k4Var.f69161g.setOnClickListener(new C38728a());
            this.f92632d.f69160f.setOnClickListener(new C38729b());
            String str = sMSContact.languageCode;
            if (str == null || C37353c.f89802f.mo90437a(str) == C37353c.KA) {
                z = true;
            } else {
                z = false;
            }
            m113417j1(z);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C27348k4 d = C27348k4.m84701d(getLayoutInflater(), viewGroup, false);
        this.f92632d = d;
        return d.mo3946b();
    }

    public void onStart() {
        super.onStart();
        try {
            ((SmsNotifManagerActivity) getActivity()).mo86379T2(true);
        } catch (Exception unused) {
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo92360k1(this.f92633e);
    }
}
