package p341ge.bog.mobilebank.payment.activities;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.C0430g1;
import e41.C31658b;
import g91.C32290b1;
import g91.C32297d;
import g91.C32303f;
import g91.C32343x;
import hc1.C41185v;
import iu0.C36546y;
import java.util.ArrayList;
import java.util.List;
import mw0.C37268a;
import mw0.C37269b;
import mw0.C37270c;
import mw0.C37271d;
import mw0.C37272e;
import mw0.C37273f;
import mw0.C37274g;
import mw0.C37275h;
import mw0.C37276i;
import mw0.C37277j;
import mw0.C37278k;
import org.parceler.C42035e;
import ow0.C37818a;
import p341ge.bog.mobilebank.model.ddsto.DDProviderItem;
import p341ge.bog.mobilebank.model.ddsto.DDSTO;
import p341ge.bog.mobilebank.payment.model.ParameterType;
import p341ge.bog.mobilebank.payment.model.PaymentCustomParameter;
import p341ge.bog.mobilebank.shared.tmx_profiling.TMXFlags;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10325n;
import p366bk.C10328q;
import p380ck.C10469j;
import q31.C38125h;
import xd0.C29742a;
import yd0.C29991a;
import yd0.C30003b;

/* renamed from: ge.bog.mobilebank.payment.activities.DDFormActivity */
public class DDFormActivity extends C33608c {

    /* renamed from: U */
    C37818a f81905U;

    /* renamed from: V */
    protected C29742a f81906V;

    /* renamed from: W */
    C31658b f81907W;

    /* renamed from: X */
    private String f81908X;

    /* access modifiers changed from: private */
    /* renamed from: P2 */
    public /* synthetic */ void m98581P2(View view) {
        if (this.f81908X != null) {
            new C10469j.C10474e(this.f81908X).mo27161b(C36546y.m108282F());
        }
        mo79601U2();
    }

    /* access modifiers changed from: private */
    /* renamed from: Q2 */
    public /* synthetic */ void m98582Q2(View view) {
        this.f81917G.f68860j.setVisibility(8);
        mo86441o2();
        mo79614K2().mo91085F();
    }

    /* renamed from: n3 */
    private void m98593n3() {
        getSupportFragmentManager().mo4367F1("REQUEST_KEY_END_YEAR_CAMPAIGN_POPUP", this, new C37278k(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public /* synthetic */ void m98594q3(String str, Bundle bundle) {
        if (bundle.getBoolean("RESULT_KEY_END_YEAR_CAMPAIGN_POPUP_CLOSED", true)) {
            finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public /* synthetic */ void m98595r3(C30003b bVar) {
        if (bVar.mo70300c()) {
            m98602z3(bVar);
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(new C37269b(this), 2000);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public /* synthetic */ void m98596s3(Throwable th) {
        new Handler(Looper.getMainLooper()).postDelayed(new C37269b(this), 2000);
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public /* synthetic */ void m98597t3(int i, View view, View view2) {
        mo79614K2().mo91095x(i, view);
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public /* synthetic */ boolean m98598u3(MenuItem menuItem) {
        this.f81905U.mo91069M();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public /* synthetic */ void m98599v3(View view) {
        boolean z = !this.f81918H;
        this.f81918H = z;
        if (z) {
            this.f81917G.f68868r.f70283g.setImageResource(C10320i.ic_checkbox_selected_color);
        } else {
            this.f81917G.f68868r.f70283g.setImageResource(C10320i.ic_checkbox_unselected_color);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public /* synthetic */ void m98600w3(View view) {
        C32303f.m95182B(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public /* synthetic */ void m98601x3(int i, C0430g1.C0433c cVar, View view) {
        C0430g1 g1Var = new C0430g1(this, this.f81917G.f68857g);
        g1Var.mo2097b().inflate(i, g1Var.mo2096a());
        g1Var.mo2099d(cVar);
        g1Var.mo2100e();
    }

    /* renamed from: z3 */
    private void m98602z3(C30003b bVar) {
        C38125h.m112238c(this).mo91620o(bVar).mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public void mo79599D0() {
        mo86438k1(this.f81907W.mo72084b(TMXFlags.TMX_FLAG_DD_KEY));
        this.f81917G.f68871u.setVisibility(8);
        this.f81917G.f68858h.setVisibility(0);
        this.f81917G.f68872v.setVisibility(8);
        this.f81917G.f68868r.f70288l.setOnClickListener(new C37268a(this));
        C36546y.m108282F().mo27138I("dd_details");
        mo86441o2();
        C37818a aVar = new C37818a(this, getIntent().getExtras().getString("PAYMENT_SERVICE_ID"), getIntent().getExtras().getBoolean("PAYMENT_IS_COMPANY", false), getIntent().getExtras().getBoolean("IS_TOPUP", false), (DDSTO) C42035e.m122119a(getIntent().getParcelableExtra("DD_ITEM")), (ArrayList) C42035e.m122119a(getIntent().getParcelableExtra("PAYMENT_RESULT_INFO")), (DDProviderItem) C42035e.m122119a(getIntent().getParcelableExtra("DD_PROVIDER_ITEM")), getIntent().getExtras().getString("PAYMENT_ESS_ID"), getIntent().getExtras().getString("DD_NAME", ""), this.f81921K);
        this.f81905U = aVar;
        this.f81922L = aVar;
        this.f81917G.f68862l.f68328f.mo3946b().setOnClickListener(new C37270c(this));
        mo79607y3(C10325n.dd_menu, new C37271d(this));
        mo79604a3(getString(C10328q.button_text_save));
        this.f81917G.f68868r.f70281e.setVisibility(0);
        this.f81917G.f68868r.f70283g.setImageResource(C10320i.ic_checkbox_selected_color);
        this.f81917G.f68868r.f70281e.setOnClickListener(new C37272e(this));
        this.f81917G.f68868r.f70285i.setOnClickListener(new C37273f(this));
        m98593n3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: M2 */
    public View mo79600M2(PaymentCustomParameter paymentCustomParameter, int i) {
        if (paymentCustomParameter.getStyle().getParameterType() != ParameterType.SELECT_MULTIPLE) {
            return super.mo79600M2(paymentCustomParameter, i);
        }
        View inflate = LayoutInflater.from(this).inflate(C10324m.dd_multi_acct, (ViewGroup) null);
        View findViewById = inflate.findViewById(C10322k.dd_acct_text_header);
        View findViewById2 = inflate.findViewById(C10322k.dd_acc_text_hint);
        TextView textView = (TextView) inflate.findViewById(C10322k.dd_acc_text_view);
        if (TextUtils.isEmpty(paymentCustomParameter.getValueToDisplayInForm())) {
            findViewById.setVisibility(4);
            textView.setVisibility(8);
            findViewById2.setVisibility(0);
        } else {
            findViewById.setVisibility(0);
            textView.setText(paymentCustomParameter.getValueToDisplayInForm());
            textView.setVisibility(0);
            findViewById2.setVisibility(8);
        }
        inflate.setOnClickListener(new C37274g(this, i, inflate));
        return inflate;
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        C41185v P = ((C37818a) mo79614K2()).mo91071P();
        if (P != null) {
            P.mo4577k1();
        }
        ((C37818a) mo79614K2()).mo91073T(str, str2, str3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        String string = getIntent().getExtras().getString("PAYMENT_COMPANY_NAME");
        this.f81908X = string;
        if (string != null) {
            new C10469j.C10472c(this.f81908X).mo27161b(C36546y.m108282F());
        }
        super.mo37451O1(bundle);
    }

    /* renamed from: R */
    public void mo37616R(String str, String str2) {
        C32297d.m95154b(this, str);
    }

    /* renamed from: S */
    public void mo37617S(boolean z) {
        if (z) {
            mo86441o2();
        } else {
            mo86425J1();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: U2 */
    public void mo79601U2() {
        if (!this.f81917G.f68868r.f70288l.isEnabled() || this.f81918H) {
            super.mo79601U2();
        } else {
            C32290b1.m95127q(this.f81917G.f68868r.f70281e);
        }
    }

    /* renamed from: X2 */
    public void mo79602X2(String str, String str2, boolean z) {
    }

    /* renamed from: Y2 */
    public void mo79603Y2(List list) {
        super.mo79603Y2(list);
    }

    /* renamed from: a3 */
    public void mo79604a3(String str) {
        this.f81917G.f68868r.f70288l.setText(getString(C10328q.button_text_save));
    }

    /* renamed from: o3 */
    public void mo79605o3() {
        mo86438k1(C32343x.m95465l1(this.f81906V.mo47470a(C29991a.C29994c.C29997c.f75809e)).mo95070I(new C37275h(this), new C37276i(this)));
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        ((C37818a) mo79614K2()).mo91072S();
    }

    /* renamed from: p3 */
    public void mo79606p3(boolean z) {
        this.f81917G.f68857g.setVisibility(z ? 0 : 8);
    }

    /* renamed from: y3 */
    public void mo79607y3(int i, C0430g1.C0433c cVar) {
        this.f81917G.f68857g.setOnClickListener(new C37277j(this, i, cVar));
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return getString(C10328q.header_text_automatics);
    }
}
