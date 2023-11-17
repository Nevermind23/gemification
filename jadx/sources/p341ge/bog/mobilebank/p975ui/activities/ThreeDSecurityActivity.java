package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30734pb;
import a81.C30747qb;
import a81.C30760rb;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CompoundButton;
import com.medallia.digital.mobilesdk.MedalliaDigital;
import g91.C32297d;
import g91.C32303f;
import g91.C32343x;
import hc1.C41185v;
import hd0.C24978b;
import jg1.C41438c;
import jg1.C41452l;
import l50.C25841u;
import p341ge.bog.mobilebank.eventbus.events.CardSecurityUpdateEvent;
import p341ge.bog.mobilebank.model.Lang;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.manager.RootBankApiManager;
import p341ge.bog.mobilebank.rest.model.otpparameter.UpdateCardSecurityParams;
import p366bk.C10328q;
import p745er.C20288a;
import p90.C27323i;
import pc0.C27494a;
import r90.C27950a;

/* renamed from: ge.bog.mobilebank.ui.activities.ThreeDSecurityActivity */
public class ThreeDSecurityActivity extends C35471p0 implements C41185v.C41186a {

    /* renamed from: G */
    protected RootBankApiManager f85545G;

    /* renamed from: H */
    protected C41438c f85546H;

    /* renamed from: I */
    protected C27494a f85547I;

    /* renamed from: J */
    private C27323i f85548J;

    /* renamed from: K */
    private String[] f85549K;

    /* renamed from: L */
    private int f85550L = -1;

    /* renamed from: M */
    private boolean f85551M;

    /* renamed from: N */
    boolean f85552N;

    /* renamed from: O */
    private long f85553O;

    /* renamed from: ge.bog.mobilebank.ui.activities.ThreeDSecurityActivity$a */
    class C35334a implements CompoundButton.OnCheckedChangeListener {
        C35334a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            ThreeDSecurityActivity.this.m104873P2();
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.ThreeDSecurityActivity$b */
    class C35335b implements CompoundButton.OnCheckedChangeListener {
        C35335b() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            ThreeDSecurityActivity.this.m104879V2();
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.ThreeDSecurityActivity$c */
    class C35336c implements TextWatcher {
        C35336c() {
        }

        public void afterTextChanged(Editable editable) {
            ThreeDSecurityActivity.this.m104879V2();
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public /* synthetic */ void m104861C2(View view) {
        m104875R2();
    }

    /* renamed from: J2 */
    private void m104867J2() {
        if (m104868K2() != null) {
            m104868K2().mo4577k1();
        }
    }

    /* renamed from: K2 */
    private C41185v m104868K2() {
        return C20288a.m66329d(getSupportFragmentManager());
    }

    /* renamed from: L2 */
    private UpdateCardSecurityParams m104869L2(String str, String str2, String str3) {
        Lang lang;
        C24978b bVar;
        if (this.f85550L == 0) {
            lang = Lang.GE;
        } else {
            lang = Lang.EN;
        }
        long j = this.f85553O;
        String inputText = this.f85548J.f68906j.getInputText();
        String name = lang.name();
        if (this.f85548J.f68904h.isChecked()) {
            bVar = C24978b.YES;
        } else {
            bVar = C24978b.NO;
        }
        return new UpdateCardSecurityParams(j, inputText, name, bVar.mo63391e(), BankApi.SERVICE_CARDS_CREATE_OR_UPDATE_SECURITY, str, str2, str3);
    }

    /* access modifiers changed from: private */
    /* renamed from: M2 */
    public /* synthetic */ void m104870M2(View view) {
        m104874Q2();
    }

    /* access modifiers changed from: private */
    /* renamed from: N2 */
    public /* synthetic */ void m104871N2(View view) {
        m104872O2();
    }

    /* renamed from: O2 */
    private void m104872O2() {
        String[] strArr = this.f85549K;
        int length = (this.f85550L + 1) % strArr.length;
        this.f85550L = length;
        this.f85548J.f68905i.setInputText(strArr[length]);
    }

    /* access modifiers changed from: private */
    /* renamed from: P2 */
    public void m104873P2() {
        this.f85548J.f68902f.animate().alpha(1.0f);
        this.f85548J.f68903g.animate().alpha(1.0f);
        this.f85548J.f68904h.setEnabled(this.f85551M);
        this.f85548J.f68906j.setEnabled(true);
        this.f85548J.f68905i.setEnabled(true);
        m104879V2();
    }

    /* renamed from: Q2 */
    private void m104874Q2() {
        C32303f.m95184D(C27950a.m86284a("link.terms.3d.security.pdf"), this);
    }

    /* renamed from: R2 */
    private void m104875R2() {
        if (this.f85548J.f68908l.isEnabled()) {
            C41185v.m119403r2(BankApi.SERVICE_CARDS_CREATE_OR_UPDATE_SECURITY, this.f85547I.mo66809a(m104869L2((String) null, (String) null, (String) null))).mo4576A1(getSupportFragmentManager(), (String) null);
        }
    }

    /* renamed from: S2 */
    public static void m104876S2(Activity activity, Long l, boolean z, String str, boolean z2, boolean z3) {
        Intent intent = new Intent(activity, ThreeDSecurityActivity.class);
        intent.putExtra("CARD_ID", l);
        intent.putExtra("IS_3D_ENABLED", z);
        intent.putExtra("MOBILE_NUMBER", str);
        intent.putExtra("IS_DIGIPASS_ENABLED", z2);
        intent.putExtra("IS_DIGIPASS_ALLOWED", z3);
        activity.startActivity(intent);
    }

    /* renamed from: T2 */
    public static void m104877T2(Activity activity, C25841u uVar) {
        boolean z;
        boolean z2;
        Intent intent = new Intent(activity, ThreeDSecurityActivity.class);
        intent.putExtra("CARD_ID", uVar.mo64614a());
        C24978b h = uVar.mo64622h();
        C24978b bVar = C24978b.YES;
        boolean z3 = true;
        if (h == bVar) {
            z = true;
        } else {
            z = false;
        }
        intent.putExtra("IS_3D_ENABLED", z);
        intent.putExtra("MOBILE_NUMBER", uVar.mo64621g());
        if (uVar.mo64615b() == bVar) {
            z2 = true;
        } else {
            z2 = false;
        }
        intent.putExtra("IS_DIGIPASS_ENABLED", z2);
        if (uVar.mo64616c() != bVar) {
            z3 = false;
        }
        intent.putExtra("IS_DIGIPASS_ALLOWED", z3);
        activity.startActivity(intent);
    }

    /* renamed from: U2 */
    private void m104878U2(String str, String str2, String str3) {
        Lang lang;
        if (m104868K2() != null) {
            m104868K2().mo95635L2(true);
        }
        this.f85548J.f68907k.setVisibility(0);
        if (this.f85550L == 0) {
            lang = Lang.GE;
        } else {
            lang = Lang.EN;
        }
        this.f85545G.updateCardSecurity(this.f85553O, this.f85548J.f68906j.getInputText(), lang.name(), this.f85548J.f68904h.isChecked(), this.f85547I.mo66809a(m104869L2(str, str2, str3)));
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public void m104879V2() {
        boolean z;
        boolean isEmpty = TextUtils.isEmpty(this.f85548J.f68906j.getInputText());
        boolean isEmpty2 = TextUtils.isEmpty(this.f85548J.f68905i.getInputText());
        if (isEmpty || isEmpty2 || !this.f85548J.f68901e.isChecked()) {
            z = false;
        } else {
            z = true;
        }
        this.f85548J.f68908l.setEnabled(z);
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        m104878U2(str, str2, str3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C27323i d = C27323i.m84599d(getLayoutInflater());
        this.f85548J = d;
        super.mo70996D2(bundle, d);
        this.f85548J.f68908l.setOnClickListener(new C30734pb(this));
        this.f85548J.f68910n.setOnClickListener(new C30747qb(this));
        C32343x.m95423W0(this.f85546H, this);
        this.f85549K = new String[]{getString(C10328q.lang_ge), getString(C10328q.lang_en)};
        this.f85553O = getIntent().getLongExtra("CARD_ID", -1);
        this.f85551M = getIntent().getBooleanExtra("IS_DIGIPASS_ALLOWED", false);
        if (bundle == null) {
            String stringExtra = getIntent().getStringExtra("MOBILE_NUMBER");
            if (stringExtra == null) {
                stringExtra = "";
            }
            this.f85552N = getIntent().getBooleanExtra("IS_DIGIPASS_ENABLED", false);
            this.f85550L = 0;
            this.f85548J.f68905i.setInputText(this.f85549K[0]);
            this.f85548J.f68906j.setInputText(stringExtra);
            this.f85548J.f68904h.setChecked(this.f85552N);
        }
        m104873P2();
        this.f85548J.f68904h.setOnCheckedChangeListener(new C35334a());
        this.f85548J.f68901e.setOnCheckedChangeListener(new C35335b());
        this.f85548J.f68905i.setOnClickListener(new C30760rb(this));
        C35336c cVar = new C35336c();
        this.f85548J.f68906j.getTextInput().addTextChangedListener(cVar);
        this.f85548J.f68905i.getTextInput().addTextChangedListener(cVar);
        this.f85548J.f68908l.setEnabled(false);
    }

    /* renamed from: R */
    public void mo37616R(String str, String str2) {
        C32297d.m95154b(this, str);
    }

    /* renamed from: S */
    public void mo37617S(boolean z) {
        this.f85548J.f68907k.setVisibility(z ? 0 : 8);
    }

    @C41452l
    public void onCardSecurityUpdateEvent(CardSecurityUpdateEvent cardSecurityUpdateEvent) {
        int state = cardSecurityUpdateEvent.getState();
        if (state == 20) {
            m104867J2();
            if (cardSecurityUpdateEvent.getCardId() == this.f85553O) {
                MedalliaDigital.enableIntercept();
                finish();
            }
        } else if (state == 30) {
            m104867J2();
            C32297d.m95153a(this);
        } else if (state == 40) {
            if (cardSecurityUpdateEvent.isScaError()) {
                m104868K2().mo95634K2(C27950a.m86284a(cardSecurityUpdateEvent.getErrorKey()));
            } else {
                m104867J2();
                C32297d.m95154b(this, C27950a.m86284a(cardSecurityUpdateEvent.getErrorKey()));
            }
        }
        this.f85548J.f68907k.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C32343x.m95489t1(this.f85546H, this);
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return getString(C10328q.header_text_3d_security);
    }
}
