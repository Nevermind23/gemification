package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30690m6;
import a81.C30703n6;
import a81.C30716o6;
import a81.C30729p6;
import a81.C30742q6;
import a81.C30755r6;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import de1.C40640a;
import g91.C32297d;
import g91.C32303f;
import g91.C32335t0;
import g91.C32343x;
import gd1.C40992a;
import hd1.C41205b;
import j70.C25347g;
import jg1.C41438c;
import jg1.C41452l;
import md0.C26186e;
import o00.C26656a;
import p00.C27113k;
import p341ge.bog.mobilebank.eventbus.events.AgreementTemplateEvent;
import p341ge.bog.mobilebank.eventbus.events.PensionStatusEvent;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.PensionResult;
import p341ge.bog.mobilebank.model.PensionStatusResult;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.model.RestCallback;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p366bk.C10328q;
import p729cv.C19804f;
import p745er.C20288a;
import p748eu.C20292b;
import p90.C27389p0;
import r90.C27950a;

/* renamed from: ge.bog.mobilebank.ui.activities.ManagePensionFundsActivity */
public class ManagePensionFundsActivity extends C35533w implements C26656a {

    /* renamed from: G */
    private PensionStatusEvent f85073G;

    /* renamed from: H */
    private C27389p0 f85074H;

    /* renamed from: I */
    C19804f f85075I;

    /* renamed from: J */
    protected C25347g f85076J;

    /* renamed from: K */
    protected BankApi f85077K;

    /* renamed from: L */
    protected Client f85078L;

    /* renamed from: M */
    protected C41438c f85079M;

    /* renamed from: N */
    protected C20292b f85080N;

    /* renamed from: ge.bog.mobilebank.ui.activities.ManagePensionFundsActivity$a */
    class C35252a extends RestCallback {
        C35252a() {
        }

        public void onEnqueue(C41205b bVar) {
            ManagePensionFundsActivity.this.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            super.onFailure(th);
            ManagePensionFundsActivity.this.mo86253X2(false);
            C32297d.m95153a(ManagePensionFundsActivity.this);
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            super.onResponse(bankApiResponse);
            if (bankApiResponse.isSuccess()) {
                ManagePensionFundsActivity.this.f85075I.mo48092a();
                ManagePensionFundsActivity managePensionFundsActivity = ManagePensionFundsActivity.this;
                C32297d.m95160h(managePensionFundsActivity, managePensionFundsActivity.getString(C10328q.f28956f2));
                ManagePensionFundsActivity.this.f85078L.requestPensionStatus(true);
                return;
            }
            C32297d.m95154b(ManagePensionFundsActivity.this, C27950a.m86284a(bankApiResponse.getKey()));
            ManagePensionFundsActivity.this.mo86253X2(false);
        }
    }

    /* renamed from: K2 */
    private void m104218K2() {
        mo86438k1(C26186e.m81990h(this.f85076J.mo63913a(false)).mo95072K(C40640a.m117458b()).mo95063B(C40992a.m118827a()).mo95070I(new C30690m6(this), new C30703n6(this)));
    }

    /* renamed from: L2 */
    private C27113k m104219L2() {
        return C20288a.m66326a(getSupportFragmentManager());
    }

    /* access modifiers changed from: private */
    /* renamed from: M2 */
    public /* synthetic */ void m104220M2(PensionResult pensionResult) {
        mo86253X2(false);
        if (!pensionResult.isMember) {
            this.f85074H.f69504g.setText(C27950a.m86284a("text.georgian.pension.funds.not.member"));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: N2 */
    public /* synthetic */ void m104221N2(Throwable th) {
        mo86253X2(false);
        mo74709H1(th);
    }

    /* access modifiers changed from: private */
    /* renamed from: O2 */
    public /* synthetic */ void m104222O2() {
        mo86253X2(true);
        this.f85078L.requestPensionStatus(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: P2 */
    public /* synthetic */ void m104223P2(View view) {
        m104226S2();
    }

    /* access modifiers changed from: private */
    /* renamed from: Q2 */
    public /* synthetic */ void m104224Q2(View view) {
        m104227T2();
    }

    /* access modifiers changed from: private */
    /* renamed from: R2 */
    public /* synthetic */ void m104225R2(View view) {
        m104228U2();
    }

    /* renamed from: S2 */
    private void m104226S2() {
        C32303f.m95184D((String) this.f85074H.f69505h.getTag(), this);
    }

    /* renamed from: T2 */
    private void m104227T2() {
        PensionStatusEvent pensionStatusEvent = this.f85073G;
        if (pensionStatusEvent != null && pensionStatusEvent.pensionStatus != null) {
            if ((!this.f85074H.f69508k.isChecked() || PensionStatusResult.STATUS_ACTIVE.equals(this.f85073G.pensionStatus.serviceStatus)) && (this.f85074H.f69508k.isChecked() || !PensionStatusResult.STATUS_ACTIVE.equals(this.f85073G.pensionStatus.serviceStatus))) {
                this.f85074H.f69510m.setOrange(false, false);
            } else {
                this.f85074H.f69510m.setOrange(true, true);
            }
        }
    }

    /* renamed from: U2 */
    private void m104228U2() {
        if (!this.f85074H.f69508k.isChecked() || PensionStatusResult.STATUS_ACTIVE.equals(this.f85073G.pensionStatus.serviceStatus)) {
            if (!this.f85074H.f69508k.isChecked() && PensionStatusResult.STATUS_ACTIVE.equals(this.f85073G.pensionStatus.serviceStatus)) {
                m104229V2(false);
            }
        } else if (this.f85078L.isAuthorized()) {
            C20292b bVar = this.f85080N;
            if (bVar.mo48775b("MBANK_PENSION_CONTRACT_TYPE_ANDROID") != null) {
                mo86253X2(true);
                this.f85078L.getAgreementTemplate(bVar.mo48775b("MBANK_PENSION_CONTRACT_TYPE_ANDROID").mo49087d());
            }
        }
    }

    /* renamed from: V2 */
    private void m104229V2(boolean z) {
        mo86253X2(true);
        this.f85077K.sendPensionAccess(z ? 1 : 0, new C35252a());
    }

    /* renamed from: W2 */
    private void m104230W2() {
        this.f85074H.f69505h.setOnClickListener(new C30729p6(this));
        this.f85074H.f69508k.setOnClickListener(new C30742q6(this));
        this.f85074H.f69510m.setOnClickListener(new C30755r6(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C27389p0 d = C27389p0.m84859d(getLayoutInflater());
        this.f85074H = d;
        super.mo70996D2(bundle, d);
        C32343x.m95423W0(this.f85079M, this);
        m104230W2();
        mo86253X2(true);
        this.f85074H.f69507j.setText(C27950a.m86284a("text.georgian.pension.funds.settings.name"));
        this.f85074H.f69506i.setText(C27950a.m86284a("text.georgian.pension.funds.meaning"));
        this.f85074H.f69505h.setText(C27950a.m86284a("link.georgian.pension.funds.website.title"));
        this.f85074H.f69505h.setTag(C27950a.m86284a("link.georgian.pension.funds.website"));
        this.f85074H.f69505h.setTextColor(C32335t0.m95358c(this));
        this.f85074H.f69504g.setText("");
        this.f85074H.f69511n.setOnRefreshListener(new C30716o6(this));
        mo86253X2(true);
        this.f85078L.requestPensionStatus(true);
    }

    /* renamed from: X2 */
    public void mo86253X2(boolean z) {
        int i;
        FrameLayout frameLayout = this.f85074H.f69509l;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        frameLayout.setVisibility(i);
        this.f85074H.f69508k.setClickable(!z);
        m104227T2();
    }

    /* renamed from: m */
    public void mo39137m() {
        m104219L2().mo4577k1();
        m104229V2(true);
    }

    @C41452l
    public void onAgreementHtmlEvent(AgreementTemplateEvent agreementTemplateEvent) {
        if (agreementTemplateEvent.getState() == 20) {
            C27113k.m84047h2(agreementTemplateEvent.getHtml()).mo4576A1(getSupportFragmentManager(), (String) null);
            this.f85074H.f69509l.setVisibility(8);
            return;
        }
        C32297d.m95154b(this, C27950a.m86284a(agreementTemplateEvent.getErrorKey()));
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C32343x.m95489t1(this.f85079M, this);
    }

    @C41452l
    public void onPensionStatusEvent(PensionStatusEvent pensionStatusEvent) {
        this.f85073G = pensionStatusEvent;
        int state = pensionStatusEvent.getState();
        if (state == 10) {
            mo86253X2(true);
        } else if (state == 20) {
            if (PensionStatusResult.STATUS_ACTIVE.equals(pensionStatusEvent.pensionStatus.serviceStatus)) {
                this.f85074H.f69508k.setChecked(true);
                m104218K2();
            } else {
                mo86253X2(false);
            }
            this.f85074H.f69511n.setRefreshing(false);
        } else if (state == 30 || state == 40) {
            this.f85074H.f69511n.setRefreshing(false);
            mo86253X2(false);
            C32297d.m95154b(this, C27950a.m86286c(pensionStatusEvent.getErrorKey(), false));
        }
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return getString(C10328q.f28964p5);
    }
}
