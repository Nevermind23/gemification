package p341ge.bog.mobilebank.p975ui.fragments;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.github.mikephil.charting.utils.Utils;
import g91.C32290b1;
import g91.C32297d;
import g91.C32303f;
import g91.C32355x0;
import g91.C32359z0;
import hd1.C41205b;
import iu0.C36546y;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Iterator;
import java.util.Locale;
import jg1.C41452l;
import l81.C37104a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.mobilebank.eventbus.events.AccountLovEvent;
import p341ge.bog.mobilebank.model.CcyRate;
import p341ge.bog.mobilebank.model.ConvertCurrencyResult;
import p341ge.bog.mobilebank.model.account.AccountLov;
import p341ge.bog.mobilebank.p975ui.activities.ExchangeActivity;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogEditText;
import p341ge.bog.mobilebank.p975ui.views.widgets.ProviderDetailTypeView;
import p341ge.bog.mobilebank.p975ui.views.widgets.cropview.subscaleview.SubsamplingScaleImageView;
import p341ge.bog.mobilebank.rest.model.RestCallback;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p341ge.bog.mobilebank.transfers.model.TransferForm;
import p366bk.C10319h;
import p366bk.C10328q;
import p366bk.C10329r;
import p630ui.C18168a;
import p90.C27287e3;
import p90.C27337j3;
import q81.C38170e;
import r90.C27950a;

/* renamed from: ge.bog.mobilebank.ui.fragments.k */
public class C35629k extends C35651n1 implements C37104a {

    /* renamed from: A */
    private int f86132A = -1;

    /* renamed from: B */
    private int f86133B = -1;

    /* renamed from: C */
    private DecimalFormat f86134C = new DecimalFormat("#.####", new DecimalFormatSymbols(Locale.US));

    /* renamed from: D */
    private boolean f86135D = false;

    /* renamed from: E */
    private boolean f86136E = false;

    /* renamed from: F */
    private AccountLovEvent f86137F;

    /* renamed from: G */
    int f86138G = 0;

    /* renamed from: H */
    private TextWatcher f86139H = new C35632c();

    /* renamed from: I */
    private TextWatcher f86140I = new C35634e();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C27337j3 f86141d;

    /* renamed from: e */
    private CcyRate[] f86142e;

    /* renamed from: f */
    private boolean f86143f;

    /* renamed from: g */
    private boolean f86144g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public TextView f86145h;

    /* renamed from: i */
    private TextView f86146i;

    /* renamed from: j */
    private TextView f86147j;

    /* renamed from: k */
    private TextView f86148k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public TextView f86149l;

    /* renamed from: m */
    private TextView f86150m;

    /* renamed from: n */
    private TextView f86151n;

    /* renamed from: o */
    private TextView f86152o;

    /* renamed from: p */
    private int f86153p = -1;

    /* renamed from: q */
    private int f86154q = -1;

    /* renamed from: r */
    int f86155r = -1;

    /* renamed from: s */
    int f86156s = -1;

    /* renamed from: t */
    int f86157t = -1;

    /* renamed from: u */
    int f86158u = -1;

    /* renamed from: v */
    int f86159v = -1;

    /* renamed from: w */
    int f86160w = -1;

    /* renamed from: x */
    int f86161x = -1;

    /* renamed from: y */
    int f86162y = -1;

    /* renamed from: z */
    private boolean f86163z;

    /* renamed from: ge.bog.mobilebank.ui.fragments.k$a */
    class C35630a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ String f86164d;

        /* renamed from: e */
        final /* synthetic */ String f86165e;

        C35630a(String str, String str2) {
            this.f86164d = str;
            this.f86165e = str2;
        }

        public void run() {
            C35629k.this.f86149l.setText(this.f86164d);
            C35629k.this.f86145h.setText(this.f86165e);
            C35629k.this.f86141d.f69064m.mo3946b().setVisibility(0);
            C35629k.this.f86141d.f69061j.mo3946b().setVisibility(4);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.fragments.k$b */
    class C35631b implements Runnable {
        C35631b() {
        }

        public void run() {
            if (C35629k.this.f86141d.f69063l.getText().toString().equals(".") || C35629k.this.f86141d.f69063l.getText().length() <= 0 || Double.parseDouble(C35629k.this.f86141d.f69063l.getText().toString()) <= Utils.DOUBLE_EPSILON) {
                C35629k.this.m105833y1(true, true);
            } else {
                C35629k.this.f86141d.f69063l.setText(C35629k.this.f86141d.f69063l.getText());
                C35629k.this.f86141d.f69063l.setSelection(C35629k.this.f86141d.f69063l.getText().length());
            }
            C35629k.this.f86141d.f69067p.animate().setDuration(100).alpha(1.0f);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.fragments.k$c */
    class C35632c implements TextWatcher {
        C35632c() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (charSequence.length() > 0) {
                if (charSequence.toString().equals(".") || Double.parseDouble(charSequence.toString()) <= Utils.DOUBLE_EPSILON) {
                    C35629k.this.m105817U1("0.00");
                } else {
                    C35629k.this.m105833y1(true, false);
                }
            } else if (C35629k.this.f86141d.f69067p.getText().length() > 0) {
                C35629k.this.f86141d.f69067p.setText("");
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.fragments.k$d */
    class C35633d extends RestCallback {

        /* renamed from: a */
        final /* synthetic */ boolean f86169a;

        /* renamed from: b */
        final /* synthetic */ boolean f86170b;

        C35633d(boolean z, boolean z2) {
            this.f86169a = z;
            this.f86170b = z2;
        }

        public void onEnqueue(C41205b bVar) {
            C35629k.this.addDisposable(bVar);
        }

        public void onFailure(Throwable th) {
            super.onFailure(th);
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            super.onResponse(bankApiResponse);
            if (bankApiResponse.getResult() != null) {
                if (!this.f86169a) {
                    if (this.f86170b) {
                        if (C35629k.this.f86141d != null && C35629k.this.f86141d.f69063l.getText().length() > 0) {
                            C35629k.this.m105817U1(((ConvertCurrencyResult) bankApiResponse.getResult()).getAmount());
                        }
                    } else if (C35629k.this.f86141d != null && C35629k.this.f86141d.f69067p.getText().length() > 0) {
                        C35629k.this.m105816T1(((ConvertCurrencyResult) bankApiResponse.getResult()).getAmount());
                    }
                }
                C35629k.this.m105813Q1((ConvertCurrencyResult) bankApiResponse.getResult());
                return;
            }
            C32297d.m95154b(C35629k.this.getActivity(), C27950a.m86284a(bankApiResponse.getKey()));
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.fragments.k$e */
    class C35634e implements TextWatcher {
        C35634e() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (charSequence.length() > 0) {
                if (charSequence.toString().equals(".") || Double.parseDouble(charSequence.toString()) <= Utils.DOUBLE_EPSILON) {
                    C35629k.this.m105816T1("0.00");
                } else {
                    C35629k.this.m105833y1(false, false);
                }
            } else if (C35629k.this.f86141d.f69063l.getText().length() > 0) {
                C35629k.this.f86141d.f69063l.setText("");
            }
        }
    }

    /* renamed from: B1 */
    private long m105801B1() {
        AccountLovEvent accountLovEvent = this.f86137F;
        if (accountLovEvent == null || accountLovEvent.getAccountLovContainer() == null || this.f86137F.getAccountLovContainer().getConversion() == null || this.f86137F.getAccountLovContainer().getConversion().src == null) {
            return -1;
        }
        Iterator<AccountLov> it = this.f86137F.getAccountLovContainer().getConversion().src.iterator();
        while (it.hasNext()) {
            AccountLov next = it.next();
            if (next.isDefault()) {
                Iterator<AccountLov> it2 = next.getSubAccounts().iterator();
                while (it2.hasNext()) {
                    AccountLov next2 = it2.next();
                    if (mo86706A1()[this.f86132A].getCcy().equals(next2.getCcy())) {
                        return next2.getId();
                    }
                }
                return -1;
            }
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: C1 */
    public /* synthetic */ void m105802C1(String str, String str2) {
        this.f86150m.setText(str);
        this.f86146i.setText(str2);
        this.f86141d.f69068q.mo3946b().setVisibility(0);
        this.f86141d.f69062k.mo3946b().setVisibility(4);
    }

    /* access modifiers changed from: private */
    /* renamed from: D1 */
    public /* synthetic */ void m105803D1() {
        int i = this.f86133B;
        this.f86133B = this.f86132A;
        this.f86132A = i;
        m105818V1();
        if (this.f86138G == 0) {
            this.f86141d.f69066o.setRotation(180.0f);
            this.f86138G = SubsamplingScaleImageView.ORIENTATION_180;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E1 */
    public /* synthetic */ void m105804E1(View view) {
        mo86707J1();
    }

    /* access modifiers changed from: private */
    /* renamed from: F1 */
    public /* synthetic */ void m105805F1(View view) {
        mo86709M1();
    }

    /* access modifiers changed from: private */
    /* renamed from: G1 */
    public /* synthetic */ void m105806G1(View view) {
        m105810N1();
    }

    /* access modifiers changed from: private */
    /* renamed from: H1 */
    public /* synthetic */ void m105807H1(View view) {
        m105809L1();
    }

    /* renamed from: I1 */
    private void m105808I1() {
        this.f86142e = (CcyRate[]) C32359z0.m95595w(new CcyRate[]{new CcyRate("GEL")}, mo86711v1().mo86120L2());
        if (this.f86132A < 0) {
            this.f86132A = 0;
            this.f86141d.f69063l.addTextChangedListener(this.f86139H);
        }
        if (this.f86133B < 0) {
            this.f86133B = 1;
            this.f86141d.f69067p.addTextChangedListener(this.f86140I);
        }
        this.f86149l.setText(mo86706A1()[this.f86132A].getCcy());
        this.f86150m.setText(mo86706A1()[this.f86133B].getCcy());
        if (TextUtils.isEmpty(this.f86141d.f69063l.getText())) {
            this.f86141d.f69063l.setText("1");
            this.f86141d.f69063l.setSelection(1);
        } else {
            BogEditText bogEditText = this.f86141d.f69063l;
            bogEditText.setText(bogEditText.getText());
        }
        m105811O1();
        m105814R1();
        m105815S1();
    }

    /* renamed from: L1 */
    private void m105809L1() {
        if (mo86706A1() != null) {
            m105832x1();
            this.f86163z = true;
            C38170e eVar = new C38170e(getContext(), mo86706A1(), this.f86132A, this.f86156s, this.f86157t - C32355x0.m95522m(getContext()));
            eVar.mo91708m(this);
            eVar.show();
        }
    }

    /* renamed from: N1 */
    private void m105810N1() {
        if (mo86706A1() != null) {
            m105832x1();
            this.f86163z = false;
            C38170e eVar = new C38170e(getContext(), mo86706A1(), this.f86133B, this.f86155r, this.f86157t - C32355x0.m95522m(getContext()));
            eVar.mo91745l(true);
            eVar.mo91708m(this);
            eVar.show();
        }
    }

    /* renamed from: O1 */
    private void m105811O1() {
        this.f86145h.setText(C32303f.m95197h(mo86706A1()[this.f86132A].getCcy()));
        this.f86147j.setText(this.f86146i.getText());
    }

    /* renamed from: P1 */
    private void m105812P1() {
        this.f86141d.f69059h.setOnClickListener(new C35594e(this));
        this.f86141d.f69065n.setOnClickListener(new C35597f(this));
        this.f86141d.f69068q.mo3946b().setOnClickListener(new C35602g(this));
        this.f86141d.f69064m.mo3946b().setOnClickListener(new C35605h(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: Q1 */
    public void m105813Q1(ConvertCurrencyResult convertCurrencyResult) {
        String str;
        if (isAdded() && getActivity() != null) {
            String rate = convertCurrencyResult.getRate();
            String baseCcy = convertCurrencyResult.getBaseCcy();
            if (convertCurrencyResult.getBaseCcy().equals(this.f86149l.getText().toString())) {
                str = this.f86150m.getText().toString();
            } else {
                str = this.f86149l.getText().toString();
            }
            ProviderDetailTypeView providerDetailTypeView = this.f86141d.f69070s;
            int i = C10319h.ccy_rate_item_header_text_size;
            providerDetailTypeView.setTextSizeDimen(i);
            this.f86141d.f69070s.setTitleText(getString(C10328q.transfers_title_to_mbank_rate));
            this.f86141d.f69070s.setValueText(String.format("1%s=%s%s", new Object[]{C32303f.m95197h(baseCcy), rate, C32303f.m95197h(str)}));
            this.f86141d.f69072u.setTextSizeDimen(i);
            this.f86141d.f69072u.setTitleText(getString(C10328q.calculator_standard_rate));
            this.f86141d.f69072u.setValueText(String.format("1%s=%s%s", new Object[]{C32303f.m95197h(baseCcy), convertCurrencyResult.getRateSelf(), C32303f.m95197h(str)}));
        }
    }

    /* renamed from: R1 */
    private void m105814R1() {
        this.f86146i.setText(C32303f.m95197h(mo86706A1()[this.f86133B].getCcy()));
        this.f86148k.setText(this.f86146i.getText());
    }

    /* renamed from: S1 */
    private void m105815S1() {
        AccountLovEvent accountLovEvent;
        boolean z;
        boolean z2;
        int i = 8;
        boolean z3 = true;
        if (!this.mClient.isAuthorized() || (accountLovEvent = this.f86137F) == null || accountLovEvent.getState() != 20) {
            this.f86141d.f69057f.setVisibility(8);
            this.f86141d.f69059h.setEnabled(true);
            return;
        }
        String ccy = mo86706A1()[this.f86132A].getCcy();
        String ccy2 = mo86706A1()[this.f86133B].getCcy();
        if (this.f86137F.getAccountLovContainer() != null && this.f86137F.getAccountLovContainer().getConversion() != null && this.f86137F.getAccountLovContainer().getConversion().src != null && this.f86137F.getAccountLovContainer().getConversion().dst != null) {
            Iterator<AccountLov> it = this.f86137F.getAccountLovContainer().getConversion().src.iterator();
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AccountLov next = it.next();
                if (ccy.equals(next.getCcy())) {
                    z = true;
                    break;
                } else if (next.getSubAccounts() != null) {
                    Iterator<AccountLov> it2 = next.getSubAccounts().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (ccy.equals(it2.next().getCcy())) {
                                z = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
            Iterator<AccountLov> it3 = this.f86137F.getAccountLovContainer().getConversion().dst.iterator();
            z2 = false;
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                AccountLov next2 = it3.next();
                if (ccy2.equals(next2.getCcy())) {
                    z2 = true;
                    break;
                } else if (next2.getSubAccounts() != null) {
                    Iterator<AccountLov> it4 = next2.getSubAccounts().iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            if (ccy2.equals(it4.next().getCcy())) {
                                z2 = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
        } else {
            z2 = false;
            z = false;
        }
        InlineFeedback inlineFeedback = this.f86141d.f69057f;
        if (!z || !z2) {
            i = 0;
        }
        inlineFeedback.setVisibility(i);
        Button button = this.f86141d.f69059h;
        if (!z || !z2) {
            z3 = false;
        }
        button.setEnabled(z3);
    }

    /* access modifiers changed from: private */
    /* renamed from: T1 */
    public void m105816T1(String str) {
        this.f86141d.f69063l.removeTextChangedListener(this.f86139H);
        this.f86141d.f69063l.setText(str);
        this.f86141d.f69063l.addTextChangedListener(this.f86139H);
    }

    /* access modifiers changed from: private */
    /* renamed from: U1 */
    public void m105817U1(String str) {
        this.f86141d.f69067p.removeTextChangedListener(this.f86140I);
        this.f86141d.f69067p.setText(str);
        this.f86141d.f69067p.addTextChangedListener(this.f86140I);
    }

    /* renamed from: V1 */
    private void m105818V1() {
        this.f86141d.f69067p.animate().alpha(Utils.FLOAT_EPSILON).setDuration(100).withEndAction(new C35631b());
    }

    /* renamed from: x1 */
    private void m105832x1() {
        if (this.f86153p == -1) {
            this.f86153p = mo86711v1().mo86123O2();
        }
        if (this.f86154q == -1) {
            this.f86154q = mo86711v1().mo86122N2();
        }
        if (this.f86155r == -1) {
            this.f86155r = C32290b1.m95119i(this.f86146i).left;
        }
        if (this.f86157t == -1) {
            this.f86157t = C32290b1.m95119i(this.f86146i).top;
        }
        if (this.f86156s == -1) {
            this.f86156s = C32290b1.m95119i(this.f86145h).left;
        }
        if (this.f86159v == -1) {
            this.f86159v = C32290b1.m95119i(this.f86141d.f69068q.mo3946b()).left;
        }
        if (this.f86160w == -1) {
            this.f86160w = C32290b1.m95119i(this.f86141d.f69064m.mo3946b()).left;
        }
        if (this.f86162y == -1) {
            this.f86162y = C32290b1.m95119i(this.f86141d.f69064m.mo3946b()).top;
        }
        if (this.f86161x == -1) {
            this.f86161x = C32290b1.m95119i(this.f86141d.f69068q.mo3946b()).top;
        }
        if (this.f86158u == -1) {
            this.f86158u = C32290b1.m95119i(this.f86146i).top;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y1 */
    public void m105833y1(boolean z, boolean z2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        this.f86143f = z;
        this.f86144g = z2;
        String str6 = "";
        if (z) {
            str = this.f86141d.f69063l.getText().toString();
        } else {
            str = str6;
        }
        if (z) {
            str2 = str6;
        } else {
            str2 = this.f86141d.f69067p.getText().toString();
        }
        if (z2) {
            if (z) {
                str5 = "1";
            } else {
                str5 = str6;
            }
            if (!z) {
                str6 = "1";
            }
            str3 = str6;
            str4 = str5;
        } else {
            str4 = str;
            str3 = str2;
        }
        this.mBankApi.convertCurrency(this.f86149l.getText().toString(), this.f86150m.getText().toString(), str4, str3, new C35633d(z2, z));
    }

    /* renamed from: z1 */
    private void m105834z1() {
        C27337j3 j3Var = this.f86141d;
        C27287e3 e3Var = j3Var.f69064m;
        this.f86145h = e3Var.f68645e;
        C27287e3 e3Var2 = j3Var.f69068q;
        this.f86146i = e3Var2.f68645e;
        C27287e3 e3Var3 = j3Var.f69061j;
        this.f86147j = e3Var3.f68645e;
        C27287e3 e3Var4 = j3Var.f69062k;
        this.f86148k = e3Var4.f68645e;
        this.f86149l = e3Var.f68646f;
        this.f86150m = e3Var2.f68646f;
        this.f86151n = e3Var3.f68646f;
        this.f86152o = e3Var4.f68646f;
    }

    /* renamed from: A1 */
    public CcyRate[] mo86706A1() {
        return this.f86142e;
    }

    /* renamed from: J1 */
    public void mo86707J1() {
        C36546y.m108282F().mo27152s("currency_rates", "click_exchange_currency", (String) null);
        if (this.mClient.isAuthorized()) {
            TransferForm.startWith((Fragment) this, "TRANSFER", TransferForm.OPERATION_VIEW).setTransferForm(TransferForm.TRANSFER_FORM_CONVERSION).setAmount(this.f86141d.f69063l.getText().toString()).setSrcAcctKey(m105801B1()).start();
        } else {
            C32303f.m95188H(getActivity());
        }
    }

    /* renamed from: K1 */
    public void mo86708K1() {
        this.f86135D = true;
        if (this.f86136E) {
            m105808I1();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public void mo86709M1() {
        m105832x1();
        int i = this.f86161x;
        int i2 = this.f86153p;
        float f = (float) (this.f86162y - i2);
        int i3 = this.f86159v;
        int i4 = this.f86154q;
        float f2 = (float) (i3 - i4);
        float f3 = (float) (this.f86160w - i4);
        String charSequence = this.f86149l.getText().toString();
        String charSequence2 = this.f86150m.getText().toString();
        String charSequence3 = this.f86145h.getText().toString();
        String charSequence4 = this.f86146i.getText().toString();
        this.f86151n.setText(this.f86149l.getText());
        this.f86147j.setText(this.f86145h.getText());
        this.f86152o.setText(this.f86150m.getText());
        this.f86148k.setText(this.f86146i.getText());
        this.f86141d.f69062k.mo3946b().setY((float) (i - i2));
        this.f86141d.f69061j.mo3946b().setY(f);
        this.f86141d.f69062k.mo3946b().setX(f2);
        this.f86141d.f69061j.mo3946b().setX(f3);
        this.f86141d.f69062k.mo3946b().setVisibility(0);
        this.f86141d.f69061j.mo3946b().setVisibility(0);
        this.f86141d.f69068q.mo3946b().setVisibility(4);
        this.f86141d.f69064m.mo3946b().setVisibility(4);
        this.f86141d.f69062k.mo3946b().animate().x(f3).setInterpolator(new OvershootInterpolator()).withEndAction(new C35610i(this, charSequence, charSequence3));
        this.f86141d.f69061j.mo3946b().animate().x(f2).setInterpolator(new OvershootInterpolator()).withEndAction(new C35630a(charSequence2, charSequence4));
        int i5 = this.f86138G;
        if (i5 == 180) {
            this.f86138G = 0;
        } else if (i5 == 0) {
            this.f86138G = SubsamplingScaleImageView.ORIENTATION_180;
        }
        this.f86141d.f69066o.animate().rotation((float) this.f86138G).withEndAction(new C35626j(this));
    }

    /* renamed from: Z0 */
    public void mo48298Z0(int i) {
        if (this.f86163z) {
            this.f86132A = i;
            this.f86149l.setText(mo86706A1()[i].getCcy());
            m105811O1();
            m105818V1();
        } else {
            this.f86133B = i;
            this.f86150m.setText(mo86706A1()[i].getCcy());
            m105814R1();
            m105818V1();
        }
        m105815S1();
    }

    @C41452l
    public void onAccountLovEvent(AccountLovEvent accountLovEvent) {
        if (this.f86137F != accountLovEvent) {
            this.f86137F = accountLovEvent;
        }
        m105815S1();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C27337j3 d = C27337j3.m84658d(layoutInflater, viewGroup, false);
        this.f86141d = d;
        return d.mo3946b();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f86141d = null;
    }

    public void onStart() {
        super.onStart();
        this.mEventBus.mo96185q(this);
        if (this.mClient.isAuthorized()) {
            this.mClient.requestAccountLovs();
        } else {
            m105815S1();
        }
    }

    public void onStop() {
        super.onStop();
        this.mEventBus.mo96186s(this);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        new C18168a(requireContext(), C10329r.LayerRadius40Shadow10).mo45824a(this.f86141d.f69058g);
        m105834z1();
        this.f86136E = true;
        if (this.f86135D) {
            m105808I1();
        }
        m105812P1();
    }

    /* renamed from: v1 */
    public ExchangeActivity mo86711v1() {
        return (ExchangeActivity) getActivity();
    }
}
