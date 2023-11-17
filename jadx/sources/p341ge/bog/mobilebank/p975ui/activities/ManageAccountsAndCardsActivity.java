package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30525a6;
import a81.C30539b6;
import a81.C30553c6;
import a81.C30567d6;
import a81.C30581e6;
import a81.C30595f6;
import a81.C30609g6;
import a81.C30623h6;
import a81.C30637i6;
import a81.C30651j6;
import a81.C30664k6;
import a81.C30819w5;
import a81.C30832x5;
import a81.C30845y5;
import a81.C30858z5;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.C1547z;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.medallia.digital.mobilesdk.MedalliaDigital;
import g91.C32297d;
import g91.C32343x;
import gd1.C40992a;
import hd0.C24978b;
import hd1.C41205b;
import iu0.C36546y;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jg1.C41438c;
import jg1.C41452l;
import l50.C25832l;
import l50.C25836p;
import l50.C25838r;
import m50.C26144b;
import n50.C26371b;
import p189o0.C7357a;
import p341ge.bog.mobilebank.eventbus.events.CreditCardsEvent;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.account.ManageableAccount;
import p341ge.bog.mobilebank.model.credit.CreditCardAccount;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import p341ge.bog.mobilebank.p975ui.fragments.C35671t0;
import p341ge.bog.mobilebank.p975ui.fragments.C35673u0;
import p366bk.C10323l;
import p366bk.C10328q;
import p380ck.C10463g;
import p843nw.C26619b;
import p843nw.C26621d;
import p843nw.C26622e;
import p843nw.C26628j;
import p863pw.C27633k;
import p90.C27380o0;
import r90.C27950a;

/* renamed from: ge.bog.mobilebank.ui.activities.ManageAccountsAndCardsActivity */
public class ManageAccountsAndCardsActivity extends C35518v implements ViewPager.C1902j {

    /* renamed from: G */
    private C27380o0 f85058G;

    /* renamed from: H */
    public C26144b f85059H;

    /* renamed from: I */
    protected C35651n1[] f85060I = new C35651n1[2];

    /* renamed from: J */
    private List f85061J;

    /* renamed from: K */
    private C25836p f85062K;

    /* renamed from: L */
    private CreditCardsEvent f85063L;

    /* renamed from: M */
    private ArrayList f85064M;

    /* renamed from: N */
    C26628j f85065N;

    /* renamed from: O */
    C26622e f85066O;

    /* renamed from: P */
    C26619b f85067P;

    /* renamed from: Q */
    C26621d f85068Q;

    /* renamed from: R */
    protected C35673u0 f85069R;

    /* renamed from: S */
    protected Client f85070S;

    /* renamed from: T */
    protected C41438c f85071T;

    /* renamed from: ge.bog.mobilebank.ui.activities.ManageAccountsAndCardsActivity$a */
    class C35251a extends C1547z {
        C35251a(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        /* renamed from: d */
        public int mo6557d() {
            return ManageAccountsAndCardsActivity.this.f85060I.length;
        }

        /* renamed from: t */
        public Fragment mo4805t(int i) {
            return ManageAccountsAndCardsActivity.this.f85060I[i];
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y2 */
    public /* synthetic */ void m104175Y2(C41205b bVar) {
        mo86441o2();
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public static /* synthetic */ void m104176Z2() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a3 */
    public /* synthetic */ void m104177a3(Throwable th) {
        mo86425J1();
        mo74709H1(th);
    }

    /* access modifiers changed from: private */
    /* renamed from: b3 */
    public static /* synthetic */ void m104178b3() {
    }

    /* access modifiers changed from: private */
    /* renamed from: c3 */
    public /* synthetic */ void m104179c3(Throwable th) {
        mo86425J1();
        mo74709H1(th);
    }

    /* access modifiers changed from: private */
    /* renamed from: d3 */
    public /* synthetic */ void m104180d3(C41205b bVar) {
        mo86441o2();
    }

    /* access modifiers changed from: private */
    /* renamed from: e3 */
    public /* synthetic */ void m104181e3(C41205b bVar) {
        mo86441o2();
    }

    /* access modifiers changed from: private */
    /* renamed from: f3 */
    public /* synthetic */ void m104182f3() {
        C7357a.m28044b(this).mo21731d(new Intent("ge.bog.mobilebank.products.presentation.products.refresh_products"));
    }

    /* access modifiers changed from: private */
    /* renamed from: g3 */
    public /* synthetic */ void m104183g3(Throwable th) {
        mo86425J1();
        mo74709H1(th);
    }

    /* access modifiers changed from: private */
    /* renamed from: h3 */
    public /* synthetic */ void m104184h3(C41205b bVar) {
        mo86441o2();
    }

    /* access modifiers changed from: private */
    /* renamed from: i3 */
    public /* synthetic */ void m104185i3(C27633k kVar) {
        C25836p i = this.f85059H.mo65068i(kVar);
        this.f85062K = i;
        this.f85061J = C26371b.m82437g(i);
        ((C35673u0) this.f85060I[1]).mo86769i1();
        mo86251p3();
    }

    /* access modifiers changed from: private */
    /* renamed from: j3 */
    public /* synthetic */ void m104186j3(Throwable th) {
        mo86425J1();
        this.f85058G.f69427h.setVisibility(0);
        mo74709H1(th);
    }

    /* access modifiers changed from: private */
    /* renamed from: k3 */
    public /* synthetic */ void m104187k3(View view) {
        m104191r3();
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public /* synthetic */ void m104188l3(View view) {
        mo86249o3();
    }

    /* access modifiers changed from: private */
    /* renamed from: m3 */
    public /* synthetic */ void m104189m3(View view) {
        mo86252q3();
    }

    /* renamed from: n3 */
    private void m104190n3() {
        this.f85070S.requestCreditCards(false);
        this.f85062K = null;
        mo86438k1(this.f85065N.mo65882c(true).mo95027o0(C40992a.m118827a()).mo94980F(new C30819w5(this)).mo94983G0(new C30553c6(this), new C30567d6(this)));
    }

    /* renamed from: r3 */
    private void m104191r3() {
        m104190n3();
    }

    /* renamed from: s3 */
    private void m104192s3() {
        Resources resources = getResources();
        int i = C10323l.transition_anim_duration;
        ((TransitionDrawable) this.f85058G.f69426g.getBackground()).reverseTransition(resources.getInteger(i));
        ((TransitionDrawable) this.f85058G.f69425f.getBackground()).startTransition(getResources().getInteger(i));
    }

    /* renamed from: t3 */
    private void m104193t3() {
        Resources resources = getResources();
        int i = C10323l.transition_anim_duration;
        ((TransitionDrawable) this.f85058G.f69426g.getBackground()).startTransition(resources.getInteger(i));
        ((TransitionDrawable) this.f85058G.f69425f.getBackground()).reverseTransition(getResources().getInteger(i));
    }

    /* renamed from: u3 */
    private void m104194u3() {
        this.f85058G.f69429j.mo3946b().setOnClickListener(new C30664k6(this));
        this.f85058G.f69425f.setOnClickListener(new C30832x5(this));
        this.f85058G.f69426g.setOnClickListener(new C30845y5(this));
    }

    /* renamed from: v3 */
    private void m104195v3() {
        this.f85060I[0] = new C35671t0();
        this.f85060I[1] = this.f85069R;
    }

    /* renamed from: w3 */
    private void m104196w3() {
        this.f85058G.f69430k.setAdapter(new C35251a(getSupportFragmentManager()));
        this.f85058G.f69430k.addOnPageChangeListener(this);
    }

    /* renamed from: L */
    public void mo6548L(int i, float f, int i2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C27380o0 d = C27380o0.m84825d(getLayoutInflater());
        this.f85058G = d;
        super.mo70996D2(bundle, d);
        m104194u3();
        mo86441o2();
        C32343x.m95423W0(this.f85071T, this);
        m104195v3();
        m104196w3();
        ((TransitionDrawable) this.f85058G.f69425f.getBackground()).startTransition(0);
        m104190n3();
    }

    /* renamed from: Q */
    public void mo6549Q(int i) {
        if (i == 0) {
            C36546y.m108282F().mo27152s("settings_management", "accounts", "select_sub_tab");
            m104192s3();
            return;
        }
        C36546y.m108282F().mo27152s("settings_management", "cards", "select_sub_tab");
        m104193t3();
    }

    /* renamed from: T2 */
    public void mo86244T2(ManageableAccount manageableAccount, boolean z) {
        long j;
        C24978b bVar;
        C10463g F = C36546y.m108282F();
        String productGroup = manageableAccount.getProductGroup();
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        F.mo27153t("settings_management_acc", productGroup, "favorite", Long.valueOf(j));
        C26619b bVar2 = this.f85067P;
        String productGroup2 = manageableAccount.getProductGroup();
        String valueOf = String.valueOf(manageableAccount.getAcctKey());
        if (z) {
            bVar = C24978b.YES;
        } else {
            bVar = C24978b.NO;
        }
        mo86438k1(bVar2.mo65873a(productGroup2, valueOf, bVar).mo94906z(C40992a.m118827a()).mo94904r(new C30581e6(this)).mo94888G(new C30595f6(), new C30609g6(this)));
    }

    /* renamed from: U2 */
    public void mo86245U2(C25838r rVar, boolean z) {
        long j;
        C24978b bVar;
        C10463g F = C36546y.m108282F();
        String c = rVar.mo64576c();
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        F.mo27153t("settings_management_cards", c, "favorite", Long.valueOf(j));
        C26622e eVar = this.f85066O;
        String s = rVar.mo64594s();
        String valueOf = String.valueOf(rVar.mo64582h());
        if (z) {
            bVar = C24978b.YES;
        } else {
            bVar = C24978b.NO;
        }
        mo86438k1(eVar.mo65876a(s, valueOf, bVar).mo94906z(C40992a.m118827a()).mo94904r(new C30858z5(this)).mo94888G(new C30525a6(), new C30539b6(this)));
    }

    /* renamed from: V2 */
    public ArrayList mo86246V2() {
        return this.f85064M;
    }

    /* renamed from: W2 */
    public List mo86247W2() {
        return this.f85061J;
    }

    /* renamed from: X2 */
    public void mo86248X2(ManageableAccount manageableAccount, boolean z) {
        long j;
        C24978b bVar;
        C10463g F = C36546y.m108282F();
        String productGroup = manageableAccount.getProductGroup();
        if (z) {
            j = 0;
        } else {
            j = 1;
        }
        F.mo27153t("settings_management_acc", productGroup, "change_visibility", Long.valueOf(j));
        C26621d dVar = this.f85068Q;
        String productGroup2 = manageableAccount.getProductGroup();
        String valueOf = String.valueOf(manageableAccount.getAcctKey());
        if (z) {
            bVar = C24978b.YES;
        } else {
            bVar = C24978b.NO;
        }
        mo86438k1(dVar.mo65875a(productGroup2, valueOf, bVar).mo94906z(C40992a.m118827a()).mo94904r(new C30623h6(this)).mo94888G(new C30637i6(this), new C30651j6(this)));
    }

    /* renamed from: l0 */
    public void mo6550l0(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: o3 */
    public void mo86249o3() {
        this.f85058G.f69430k.setCurrentItem(0);
    }

    @C41452l
    public void onCreditCardsEvent(CreditCardsEvent creditCardsEvent) {
        int state = creditCardsEvent.getState();
        if (state == 10) {
            mo86441o2();
            if (this.f85070S.hasProduct("CREDITCARDACCOUNT")) {
                this.f85063L = creditCardsEvent;
                mo86251p3();
            }
        } else if (state == 20) {
            this.f85063L = creditCardsEvent;
            mo86251p3();
        } else if (state == 30) {
            this.f85058G.f69427h.setVisibility(0);
            mo86425J1();
        } else if (state == 40) {
            this.f85058G.f69427h.setVisibility(0);
            mo86425J1();
            C32297d.m95154b(this, C27950a.m86284a(creditCardsEvent.getErrorKey()));
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C32343x.m95489t1(this.f85071T, this);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        MedalliaDigital.enableIntercept();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        MedalliaDigital.disableIntercept();
    }

    /* renamed from: p3 */
    public void mo86251p3() {
        CreditCardsEvent creditCardsEvent;
        if (this.f85062K != null && (creditCardsEvent = this.f85063L) != null && creditCardsEvent.getState() == 20) {
            this.f85064M = new ArrayList();
            List<C25832l> a = this.f85062K.mo64561a().mo64555a();
            if (a.size() > 0) {
                for (C25832l lVar : a) {
                    ManageableAccount manageableAccount = new ManageableAccount();
                    manageableAccount.setAcctKey(lVar.mo64529g());
                    manageableAccount.setAcctName(lVar.mo64525d());
                    manageableAccount.setAvailableAmount(BigDecimal.valueOf(lVar.mo64532i()));
                    manageableAccount.setPrintAcctNo(lVar.mo64526e());
                    manageableAccount.setCcy(lVar.mo64533j());
                    manageableAccount.setDefault(lVar.mo64543t());
                    manageableAccount.setHidden(lVar.mo64545u());
                    manageableAccount.setProductGroup(lVar.mo64541r());
                    this.f85064M.add(manageableAccount);
                }
            }
            if (!(this.f85063L.getCreditCardsWrapper() == null || this.f85063L.getCreditCardsWrapper().getCardsContainer() == null || this.f85063L.getCreditCardsWrapper().getCardsContainer().getAccounts() == null)) {
                ArrayList<CreditCardAccount> accounts = this.f85063L.getCreditCardsWrapper().getCardsContainer().getAccounts();
                if (accounts.size() > 0) {
                    Iterator<CreditCardAccount> it = accounts.iterator();
                    while (it.hasNext()) {
                        this.f85064M.add(it.next());
                    }
                }
            }
            ((C35671t0) this.f85060I[0]).mo86768k1();
            this.f85058G.f69427h.setVisibility(4);
            mo86425J1();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q3 */
    public void mo86252q3() {
        this.f85058G.f69430k.setCurrentItem(1);
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return getString(C10328q.parameters_manage_accounts);
    }
}
