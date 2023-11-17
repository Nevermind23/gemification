package c91;

import a91.C30877c;
import a91.C30879d;
import a91.C30899k;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import g81.C32195j;
import g91.C32289b0;
import g91.C32303f;
import g91.C32315k0;
import g91.C32359z0;
import i91.C36368b;
import i91.C36370c;
import iu0.C36546y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import l81.C37104a;
import org.parceler.C42035e;
import p341ge.bog.mobilebank.model.KeyValue;
import p341ge.bog.mobilebank.model.payment.PaymentDebtResponse;
import p341ge.bog.mobilebank.model.payment.PaymentProviderConfiguration;
import p341ge.bog.mobilebank.model.payment.PaymentServiceConfigParameter;
import p341ge.bog.mobilebank.model.payment.PaymentsServiceConfigInputOption;
import p341ge.bog.mobilebank.model.template.TemplateBasketItem;
import p341ge.bog.mobilebank.model.template.TemplateBasketParameter;
import p341ge.bog.mobilebank.p975ui.model.C35692a;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p341ge.bog.mobilebank.p975ui.views.widgets.MaskedEditText2;
import p341ge.bog.mobilebank.p975ui.wizard.activities.OldPaymentWizardActivity;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p366bk.C10322k;
import p366bk.C10328q;
import p90.C27258b4;
import r90.C27950a;
import r90.C27954d;

/* renamed from: c91.p */
public class C31320p extends C31355y implements C36370c.C36372b {

    /* renamed from: A */
    private boolean f77762A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public boolean f77763B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public boolean f77764C;

    /* renamed from: D */
    private C36370c f77765D;

    /* renamed from: E */
    private boolean f77766E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public String f77767F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public boolean f77768G;

    /* renamed from: H */
    public boolean f77769H;

    /* renamed from: I */
    private boolean f77770I;

    /* renamed from: J */
    private boolean f77771J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public C30899k f77772K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public C30877c f77773L;

    /* renamed from: M */
    private int f77774M;

    /* renamed from: N */
    private List f77775N;

    /* renamed from: O */
    private PaymentDebtResponse f77776O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public ArrayList f77777P = new ArrayList();

    /* renamed from: Q */
    long f77778Q;

    /* renamed from: R */
    AtomicBoolean f77779R = new AtomicBoolean(false);

    /* renamed from: S */
    boolean f77780S;

    /* renamed from: T */
    String f77781T;

    /* renamed from: U */
    boolean f77782U;

    /* renamed from: V */
    C37104a f77783V = new C31324d();

    /* renamed from: W */
    boolean f77784W;

    /* renamed from: X */
    TextWatcher f77785X = new C31325e();

    /* renamed from: Y */
    MaskedEditText2.AfterTextMaskedListener f77786Y = new C31326f();

    /* renamed from: v */
    private C27258b4 f77787v;

    /* renamed from: w */
    private C32195j f77788w;

    /* renamed from: x */
    private C30879d f77789x;

    /* renamed from: y */
    private PaymentServiceConfigParameter f77790y;

    /* renamed from: z */
    private PaymentServiceConfigParameter f77791z;

    /* renamed from: c91.p$a */
    class C31321a implements C37104a {
        C31321a() {
        }

        /* renamed from: Z0 */
        public void mo48298Z0(int i) {
            C31320p.this.getArguments().putString("PAYMENT_PARAMETER_VALUE", C31320p.this.f77772K.mo71111h().getId());
            C31320p.this.m93028r2().mo87965p3(true);
            if (C31320p.this.mo71588F2()) {
                C31320p.this.m93028r2().mo87933e4(false, true);
                C31320p.this.mBankApiManager.getPaymentsProviderConfiguration("", "", C31320p.this.f77772K.mo71111h().getId(), BankApiResponse.SUCCESSFUL_RESPONSE_CODE);
            }
        }
    }

    /* renamed from: c91.p$b */
    class C31322b implements View.OnTouchListener {
        C31322b() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                C31320p.this.f77778Q = System.currentTimeMillis();
                return false;
            }
            long currentTimeMillis = System.currentTimeMillis();
            C31320p pVar = C31320p.this;
            if (currentTimeMillis - pVar.f77778Q <= 300) {
                return false;
            }
            pVar.mo71729m1();
            return false;
        }
    }

    /* renamed from: c91.p$c */
    class C31323c implements Runnable {
        C31323c() {
        }

        public void run() {
            C31320p.this.f77882e.getEditText().setSelection(C31320p.this.f77767F.length());
        }
    }

    /* renamed from: c91.p$d */
    class C31324d implements C37104a {
        C31324d() {
        }

        /* renamed from: Z0 */
        public void mo48298Z0(int i) {
            if (C31320p.this.f77768G) {
                C31320p.this.f77882e.getEditText().removeTextChangedListener(C31320p.this.f77785X);
                String o = C32303f.m95204o(C31320p.this.f77773L.mo71065h(i).mo86821a() / 100.0d);
                C31320p.this.mo71597P2(i);
                C31320p.this.getArguments().putString("PAYMENT_PARAMETER_VALUE", o);
                C31320p.this.f77883f.mo87965p3(true);
                C31320p.this.f77882e.setValue(o);
                C31320p.this.f77882e.getEditText().formatWithNonSelectable();
                C31320p.this.f77882e.getEditText().setSelection(o.length());
                C31320p.this.f77882e.getEditText().addTextChangedListener(C31320p.this.f77785X);
                return;
            }
            String str = "";
            for (TemplateBasketParameter next : ((TemplateBasketItem) C31320p.this.f77777P.get(i)).getTemplateParameters()) {
                if (next.getParameterKey().equals("phone") && !next.getParameterValue().equals("+995") && !next.getParameterValue().equals("995")) {
                    str = str + next.getParameterValue();
                }
            }
            C31320p.this.f77882e.getEditText().setText(str);
            C31320p.this.f77882e.getEditText().setSelection(str.length());
        }
    }

    /* renamed from: c91.p$e */
    class C31325e implements TextWatcher {
        C31325e() {
        }

        public void afterTextChanged(Editable editable) {
            C31320p.this.m93033z2(editable);
            if (!C32315k0.m95250E(C31320p.this.m93031x2())) {
                C31320p.this.getArguments().putString("PAYMENT_PARAMETER_VALUE", editable.toString());
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            boolean z = true;
            if (i3 == 0) {
                C31320p.this.f77782U = true;
            }
            C31320p pVar = C31320p.this;
            pVar.f77781T = pVar.f77882e.getText();
            C31320p pVar2 = C31320p.this;
            if (i3 - i <= 1) {
                z = false;
            }
            pVar2.f77784W = z;
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            boolean z;
            boolean z2 = false;
            if (!C31320p.this.f77768G) {
                if (C31320p.this.mo71590I2() && C31320p.this.mo71589H2() && !charSequence.toString().equals(C31320p.this.mo71611z1())) {
                    C31320p.this.m93028r2().mo87966q3(C36546y.m108285N().getString(C10328q.f28930I0));
                    C31320p.this.f77764C = false;
                    C31320p.this.f77882e.getRightImage().setVisibility(8);
                }
                if (C31320p.this.f77763B && C31320p.this.f77773L != null) {
                    C31320p.this.f77773L.mo71068k(-1);
                    C31320p.this.f77773L.notifyDataSetChanged();
                }
            } else {
                C31320p.this.mo71731p1();
                C31320p pVar = C31320p.this;
                if (!pVar.f77781T.equals(pVar.f77882e.getEditText().getText().toString().replace(" ₾", "")) && C31320p.this.f77773L != null) {
                    C31320p.this.mo71597P2(-1);
                    C31320p.this.f77773L.mo71068k(-1);
                    C31320p.this.f77773L.notifyDataSetChanged();
                }
            }
            if (C31320p.this.m93028r2() != null) {
                if (!C31320p.this.f77763B ? C31320p.this.f77882e.getCleanText().replaceAll("-", "").length() <= 0 : C31320p.this.f77882e.getCleanText().length() < 9) {
                    z = false;
                } else {
                    z = true;
                }
                OldPaymentWizardActivity m2 = C31320p.this.m93028r2();
                if (z || C31320p.this.mo71586E1()) {
                    z2 = true;
                }
                m2.mo87965p3(z2);
            }
        }
    }

    /* renamed from: c91.p$f */
    class C31326f implements MaskedEditText2.AfterTextMaskedListener {
        C31326f() {
        }

        public void afterTextMasked() {
            C31320p.this.getArguments().putString("PAYMENT_PARAMETER_VALUE", C31320p.this.f77882e.getEditText().getText().toString());
        }
    }

    /* renamed from: c91.p$g */
    class C31327g implements Runnable {
        C31327g() {
        }

        public void run() {
            C31320p.this.mo71604h3();
            C31320p.this.m93028r2().mo87918I3();
        }
    }

    /* renamed from: c91.p$h */
    class C31328h implements C30879d.C30880a {
        C31328h() {
        }

        /* renamed from: a */
        public void mo71074a(C36368b bVar) {
            C31320p.this.f77882e.getEditText().setText(bVar.mo89098b().replace("+995", ""));
            C31320p.this.f77882e.getEditText().setSelection(C31320p.this.f77882e.getText().length());
        }
    }

    /* renamed from: B2 */
    private void m93005B2() {
        if (this.f77789x == null || this.f77765D == null) {
            mo71604h3();
            C36370c f = C36370c.m107926f(getActivity().getApplication());
            this.f77765D = f;
            f.mo89115q(this);
        }
        if (!this.f77765D.mo89116r()) {
            mo71571D();
        }
    }

    /* renamed from: C2 */
    private void m93006C2() {
        int i;
        if (m93028r2().mo87932Z3() && m93028r2().mo87922N2() == m93028r2().mo87923N3() - 1 && m93028r2().mo87923N3() > 1) {
            if ("PLUS".equals(m93028r2().mo87917H3())) {
                i = C10328q.bonus_exchange_available_plus_points;
            } else {
                i = C10328q.bonus_exchange_available_express_points;
            }
            String string = getString(i);
            m93028r2().setTitle(string + ": " + C32303f.m95207r(m93028r2().mo87926Q3()));
        }
    }

    /* renamed from: D2 */
    private void m93007D2() {
        this.f77777P.clear();
        try {
            Iterator<TemplateBasketItem> it = this.mClient.getTemplateBasketItemsWithConfig().getTemplates().iterator();
            while (it.hasNext()) {
                TemplateBasketItem next = it.next();
                if (this.mClient.getTemplateBasketItemsWithConfig().getConfig().get(next.getServiceId()).getServiceConfigJson().isMobileServiceConfig()) {
                    this.f77777P.add(next);
                }
            }
        } catch (Exception unused) {
        }
        if (this.f77777P.size() > 0) {
            this.f77766E = true;
        }
        if (this.f77766E) {
            m93017i3();
        }
    }

    /* renamed from: U2 */
    private void m93008U2(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f77882e.getEditText().setText(str);
            this.f77882e.getEditText().setSelection(str.length());
        }
    }

    /* renamed from: W2 */
    private void m93009W2() {
        if (!TextUtils.isEmpty(this.f77767F)) {
            if (mo71549G1() || m93031x2() != null) {
                C30899k kVar = this.f77772K;
                if (kVar != null) {
                    kVar.notifyDataSetChanged();
                }
            } else {
                this.f77882e.setValue(this.f77767F);
                this.f77882e.getEditText().post(new C31323c());
            }
        }
        if (this.f77768G) {
            this.f77882e.setInputType(BogInputLayout.INPUT_TYPE_NUM_REAL);
            PaymentServiceConfigParameter paymentServiceConfigParameter = (PaymentServiceConfigParameter) C42035e.m122119a(getArguments().getParcelable("PAYMENT_PACK_PARAMETER"));
            this.f77791z = paymentServiceConfigParameter;
            if (paymentServiceConfigParameter != null) {
                m93017i3();
            }
        } else {
            PaymentServiceConfigParameter paymentServiceConfigParameter2 = this.f77790y;
            if (paymentServiceConfigParameter2 == null || paymentServiceConfigParameter2.getInput()[0] == null || !this.f77790y.getInput()[0].isNumeric()) {
                this.f77882e.setInputType(BogInputLayout.INPUT_TYPE_TEXT_NO_SUGGESTIONS);
            } else {
                this.f77882e.setInputType(BogInputLayout.INPUT_TYPE_NUM_DIGIT);
            }
            if (!(this.f77790y == null || m93031x2() != null || this.f77790y.getInput()[0].getMaxLength() == null)) {
                C32359z0.m95573i0(this.f77882e.getEditText(), this.f77790y.getInput()[0].getMaxLength().intValue());
            }
        }
        if (this.f77763B) {
            C32359z0.m95573i0(this.f77882e.getEditText(), 9);
            this.f77882e.setOriginalInputType(BogInputLayout.INPUT_TYPE_NUM_PHONE);
            if (C36370c.m107927h(getActivity())) {
                m93005B2();
            } else {
                C36370c.m107933n(this, getString(C10328q.contacts_permission_desc));
            }
        }
        if (!mo71588F2() && !this.f77770I) {
            this.f77882e.setHintText(C27950a.m86286c(this.f77790y.getName(), true));
        }
        if (this.f77770I) {
            this.f77882e.setHintText(C36546y.m108285N().getString(C10328q.common_text_template_name));
        }
    }

    /* renamed from: X2 */
    private void m93010X2() {
        this.f77787v.f68382h.setOnTouchListener(new C31322b());
    }

    /* renamed from: Y2 */
    private void m93011Y2() {
        PaymentsServiceConfigInputOption[] paymentsServiceConfigInputOptionArr;
        if (mo71549G1()) {
            this.f77882e.setVisibility(8);
            this.f77885h.setVisibility(0);
            this.f77787v.f68387m.setVisibility(0);
            this.f77787v.f68384j.setLayoutManager(new LinearLayoutManager(getContext()));
            if (mo71588F2()) {
                paymentsServiceConfigInputOptionArr = m93023l3();
            } else {
                paymentsServiceConfigInputOptionArr = this.f77790y.getInput()[0].getInputOption();
            }
            boolean z = true;
            if (!mo71588F2()) {
                this.f77787v.f68386l.setText(C27950a.m86286c(this.f77790y.getName(), true));
            } else {
                this.f77787v.f68386l.setText(C36546y.m108285N().getString(C10328q.payments_provider));
            }
            int i = 0;
            while (true) {
                if (i >= paymentsServiceConfigInputOptionArr.length) {
                    i = -1;
                    break;
                } else if (paymentsServiceConfigInputOptionArr[i].getId().equals(mo71611z1())) {
                    break;
                } else {
                    i++;
                }
            }
            PaymentServiceConfigParameter paymentServiceConfigParameter = this.f77790y;
            if (!(paymentServiceConfigParameter == null || paymentServiceConfigParameter.getInput() == null || this.f77790y.getInput()[0] == null)) {
                z = this.f77790y.getInput()[0].getInputOptionBundle();
            }
            C30899k kVar = new C30899k(z, paymentsServiceConfigInputOptionArr, i, new C31321a());
            this.f77772K = kVar;
            this.f77787v.f68384j.setAdapter(kVar);
        }
    }

    /* renamed from: a3 */
    private void m93012a3() {
        this.f77787v.f68379e.setText(C36546y.m108285N().getString(C10328q.payments_wizard_mobile_contacts_title_capital));
        this.f77787v.f68379e.setVisibility(0);
        C30879d dVar = this.f77789x;
        if (dVar != null && dVar.getItemCount() > 0) {
            this.f77787v.f68379e.setVisibility(0);
        }
        this.f77787v.f68382h.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f77787v.f68382h.setVisibility(0);
        if (C36370c.m107927h(getActivity())) {
            m93005B2();
        }
    }

    /* renamed from: i3 */
    private void m93017i3() {
        if (this.f77787v.f68382h.getVisibility() == 4) {
            this.f77787v.f68382h.setVisibility(0);
        }
        if (this.f77787v.f68379e.getVisibility() == 4) {
            this.f77787v.f68382h.setVisibility(0);
        }
        if (this.f77763B) {
            if (this.f77882e.getText().length() > 0 || !this.f77766E) {
                m93012a3();
                C30879d dVar = this.f77789x;
                if (dVar == null || (dVar.getItemCount() == 0 && this.f77766E)) {
                    m93019j3(true);
                }
            } else {
                m93019j3(true);
            }
        } else if (this.f77768G) {
            m93019j3(false);
        }
        if (!this.f77768G && !this.f77766E) {
            C30879d dVar2 = this.f77789x;
            if (dVar2 == null || dVar2.getItemCount() == 0) {
                this.f77787v.f68382h.setVisibility(4);
                this.f77787v.f68379e.setVisibility(4);
            }
        }
    }

    /* renamed from: j3 */
    private void m93019j3(boolean z) {
        C36546y yVar;
        int i;
        int i2;
        this.f77787v.f68382h.setVisibility(0);
        this.f77787v.f68382h.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.f77787v.f68379e.setVisibility(0);
        if (this.f77773L == null) {
            if (this.f77768G) {
                i2 = mo71608t2();
            } else {
                i2 = -1;
            }
            this.f77773L = new C30877c(m93032y2(z), i2, this.f77783V);
        }
        this.f77787v.f68382h.setAdapter(this.f77773L);
        BogTextView bogTextView = this.f77787v.f68379e;
        if (z) {
            yVar = C36546y.m108285N();
            i = C10328q.payments_wizard_templates;
        } else {
            yVar = C36546y.m108285N();
            i = C10328q.payments_wizard_choose_pack;
        }
        bogTextView.setText(yVar.getString(i));
    }

    /* renamed from: k3 */
    private void m93021k3() {
        String string;
        if (this.f77882e != null && (string = getArguments().getString("PAYMENT_ICON_URL")) != null) {
            this.f77882e.loadRightPhotoFromURL(string);
        }
    }

    /* renamed from: l3 */
    private PaymentsServiceConfigInputOption[] m93023l3() {
        int size = this.f77775N.size();
        PaymentsServiceConfigInputOption[] paymentsServiceConfigInputOptionArr = new PaymentsServiceConfigInputOption[size];
        for (int i = 0; i < size; i++) {
            paymentsServiceConfigInputOptionArr[i] = new PaymentsServiceConfigInputOption(((PaymentProviderConfiguration) this.f77775N.get(i)).getServiceName(), ((PaymentProviderConfiguration) this.f77775N.get(i)).getServiceId());
        }
        return paymentsServiceConfigInputOptionArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public OldPaymentWizardActivity m93028r2() {
        return (OldPaymentWizardActivity) getActivity();
    }

    /* renamed from: u2 */
    private String m93029u2() {
        String z1 = mo71611z1();
        if (mo71549G1() || !this.f77768G) {
            return z1;
        }
        return z1.replace(" ₾", "");
    }

    /* renamed from: w2 */
    private void m93030w2() {
        if (this.f77883f != null) {
            this.f77882e.post(new C31327g());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x2 */
    public String m93031x2() {
        PaymentServiceConfigParameter paymentServiceConfigParameter = this.f77790y;
        if (paymentServiceConfigParameter == null || paymentServiceConfigParameter.getParamMask() == null) {
            return null;
        }
        return this.f77790y.getParamMask().toLowerCase();
    }

    /* renamed from: y2 */
    private ArrayList m93032y2(boolean z) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (!z) {
            for (PaymentsServiceConfigInputOption paymentsServiceConfigInputOption : this.f77791z.getInput()[0].getInputOption()) {
                arrayList.add(new C35692a(C27950a.m86286c(paymentsServiceConfigInputOption.getValue(), true), paymentsServiceConfigInputOption.getId(), paymentsServiceConfigInputOption.getService(), paymentsServiceConfigInputOption.getAmount(), C32289b0.m95092d(paymentsServiceConfigInputOption.getService())));
            }
        } else {
            Iterator it = this.f77777P.iterator();
            while (it.hasNext()) {
                TemplateBasketItem templateBasketItem = (TemplateBasketItem) it.next();
                if (templateBasketItem.getTemplateImage() != null) {
                    str = templateBasketItem.getTemplateImage();
                } else {
                    str = templateBasketItem.getLogo();
                }
                arrayList.add(new C35692a(templateBasketItem.getTemplateNameOrServiceName(this.mClient), "", "", -1.0d, C32289b0.m95093e(str)));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: z2 */
    public void m93033z2(Editable editable) {
        boolean z;
        if (!this.f77763B) {
            return;
        }
        if (editable.toString().contains(" ")) {
            String replace = editable.toString().replace(" ", "");
            this.f77882e.getEditText().setText(replace);
            this.f77882e.getEditText().setSelection(replace.length());
            return;
        }
        if (editable.length() < 0 || !this.f77780S) {
            m93017i3();
        } else {
            if (!this.f77884g) {
                m93017i3();
            }
            String cleanText = this.f77882e.getCleanText();
            C36370c cVar = this.f77765D;
            if (mo71610y1() != 305) {
                z = true;
            } else {
                z = false;
            }
            cVar.mo89114o(cleanText, z);
            this.f77789x.mo71073k(this.f77765D.mo89113g());
            C30879d dVar = this.f77789x;
            if (dVar == null || dVar.getItemCount() == 0) {
                m93017i3();
            }
        }
        if (this.f77882e.getCleanText().length() == 9 && this.f77763B && this.f77769H && !editable.toString().equals(mo71611z1())) {
            m93030w2();
        }
    }

    /* renamed from: A2 */
    public boolean mo71585A2() {
        return this.f77771J;
    }

    /* renamed from: D */
    public void mo71571D() {
        if (this.f77789x == null) {
            boolean z = true;
            this.f77780S = true;
            C36370c cVar = this.f77765D;
            if (mo71610y1() == 305) {
                z = false;
            }
            cVar.mo89114o("", z);
            C30879d dVar = new C30879d(this.f77765D.mo89113g());
            this.f77789x = dVar;
            dVar.mo71072j(new C31328h());
        }
        RecyclerView.C1736h adapter = this.f77787v.f68382h.getAdapter();
        C30879d dVar2 = this.f77789x;
        if (adapter != dVar2) {
            this.f77787v.f68382h.setAdapter(dVar2);
            this.f77787v.f68382h.setLayoutManager(new LinearLayoutManager(getContext()));
            return;
        }
        dVar2.notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    /* renamed from: E1 */
    public boolean mo71586E1() {
        return this.f77768G && m93028r2().mo87931Y3();
    }

    /* renamed from: E2 */
    public void mo71587E2() {
        PaymentServiceConfigParameter paymentServiceConfigParameter;
        Parcelable parcelable;
        if (this.f77790y == null && (parcelable = getArguments().getParcelable("PAYMENT_PARAMETER")) != null) {
            this.f77790y = (PaymentServiceConfigParameter) C42035e.m122119a(parcelable);
        }
        if (this.f77775N == null) {
            long j = getArguments().getLong("PAYMENT_PROVIDERS_LIST", -1);
            if (j != -1) {
                this.f77775N = C27954d.m86300f(j).getChildren();
            }
        }
        this.f77763B = getArguments().getBoolean("PAYMENT_MOBILE", false);
        this.f77767F = mo71611z1();
        if (!mo71588F2() && (paymentServiceConfigParameter = this.f77790y) != null) {
            this.f77768G = "amount".equals(paymentServiceConfigParameter.getInput()[0].getType());
        }
        this.f77764C = mo71589H2();
        this.f77769H = getArguments().getBoolean("PAYMENT_MOBILE_UNIVERSAL", false);
        this.f77762A = getArguments().getBoolean("PAYMENT_DEBT_VERIFY_FRAGMENT", this.f77769H);
        this.f77770I = getArguments().getBoolean("IS_TEMPLATE_MODIFY", false);
        this.f77771J = getArguments().getBoolean("MULTIPLE_INPUT_OPTION", false);
    }

    /* renamed from: F2 */
    public boolean mo71588F2() {
        return this.f77775N != null;
    }

    /* renamed from: G1 */
    public boolean mo71549G1() {
        mo71587E2();
        if (this.f77790y == null && this.f77775N == null) {
            return false;
        }
        if (mo71588F2() || (!this.f77763B && this.f77790y.getInput()[0].getType().equals("select"))) {
            return true;
        }
        return false;
    }

    /* renamed from: H2 */
    public boolean mo71589H2() {
        return getArguments().getBoolean("PAYMENT_DEBT_VERIFIED", false) || this.f77764C;
    }

    /* renamed from: I2 */
    public boolean mo71590I2() {
        return this.f77762A;
    }

    /* renamed from: J1 */
    public boolean mo67196J1() {
        return !mo71549G1();
    }

    /* renamed from: J2 */
    public boolean mo71591J2() {
        return this.f77770I;
    }

    /* access modifiers changed from: protected */
    /* renamed from: K1 */
    public void mo71592K1() {
        if (!this.f77884g && !mo71549G1()) {
            mo71726e2();
        }
    }

    /* renamed from: K2 */
    public void mo71593K2(String str) {
        this.f77764C = true;
        m93017i3();
        getArguments().putString("PAYMENT_ICON_URL", str);
        m93021k3();
    }

    /* renamed from: L2 */
    public void mo71594L2() {
        try {
            m93028r2().mo87933e4(false, false);
        } catch (Exception unused) {
        }
    }

    /* renamed from: M2 */
    public void mo71595M2() {
        this.f77882e.getEditText().setText("");
        BogInputLayout bogInputLayout = this.f77882e;
        bogInputLayout.setInputType(bogInputLayout.getOriginalInputType());
    }

    /* renamed from: O2 */
    public void mo71596O2(int i) {
        this.f77774M = i;
    }

    /* renamed from: P2 */
    public void mo71597P2(int i) {
        mo71733r1().putInt("PAYMENT_PACK_INDEX", i);
    }

    /* renamed from: R2 */
    public void mo71598R2(boolean z) {
        this.f77764C = z;
    }

    /* renamed from: S0 */
    public void mo71576S0() {
        this.f77780S = false;
    }

    /* renamed from: S2 */
    public void mo71599S2(boolean z) {
        this.f77762A = z;
    }

    /* renamed from: T1 */
    public void mo71600T1(int i) {
        BogInputLayout bogInputLayout = this.f77882e;
        if (bogInputLayout != null) {
            bogInputLayout.getEditText().setText("");
            this.f77882e.setInputType(i);
        }
    }

    /* renamed from: T2 */
    public void mo71601T2(boolean z) {
        this.f77771J = z;
    }

    /* renamed from: V2 */
    public void mo71602V2(PaymentDebtResponse paymentDebtResponse) {
        this.f77776O = paymentDebtResponse;
        if (this.f77787v != null) {
            if (this.f77788w == null) {
                this.f77788w = new C32195j();
                this.f77787v.f68382h.setLayoutManager(new LinearLayoutManager(getContext()));
                this.f77787v.f68379e.setVisibility(8);
                this.f77787v.f68382h.setAdapter(this.f77788w);
            }
            try {
                this.f77788w.mo72720j(paymentDebtResponse, m93028r2().mo87924O3(), m93028r2().mo87920K3());
            } catch (Exception unused) {
            }
            this.f77787v.f68382h.setVisibility(0);
        }
    }

    /* renamed from: Z2 */
    public boolean mo71603Z2() {
        return mo71549G1();
    }

    /* renamed from: h3 */
    public void mo71604h3() {
        this.f77787v.f68379e.setVisibility(4);
        this.f77787v.f68380f.setVisibility(8);
        this.f77787v.f68382h.setVisibility(4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o1 */
    public void mo71558o1() {
        if (!mo71549G1()) {
            mo71726e2();
        } else {
            mo71727k1(1.0f);
        }
        if (mo71605q2()) {
            m93017i3();
        }
        if (this.f77763B) {
            m93007D2();
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m93006C2();
        if (this.f77763B && this.f77897t) {
            m93017i3();
        }
        PaymentDebtResponse paymentDebtResponse = this.f77776O;
        if (paymentDebtResponse != null) {
            mo71602V2(paymentDebtResponse);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C27258b4 d = C27258b4.m84332d(layoutInflater, viewGroup, false);
        this.f77787v = d;
        return d.mo3946b();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f77787v = null;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 9898 && C32303f.m95190a(iArr) && !this.f77779R.get()) {
            m93005B2();
            this.f77779R.set(true);
            m93017i3();
        }
    }

    public void onResume() {
        String str;
        super.onResume();
        if (m93031x2() == null || this.f77763B) {
            if (this.f77767F.isEmpty()) {
                str = mo71611z1();
            } else {
                str = this.f77767F;
            }
            m93008U2(str);
        }
        if (this.f77788w != null) {
            this.f77787v.f68382h.setLayoutManager(new LinearLayoutManager(getContext()));
            this.f77787v.f68382h.setAdapter(this.f77788w);
            this.f77787v.f68382h.setVisibility(0);
        }
        if (!this.f77884g && !mo71549G1() && !this.f77887j) {
            mo71726e2();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f77885h = (LinearLayout) view.findViewById(C10322k.payment_wizard_selector_recycler_layout);
        this.f77886i = (ViewGroup) view.findViewById(C10322k.payment_wizard_input_container);
        BogInputLayout bogInputLayout = (BogInputLayout) view.findViewById(C10322k.wizard_input_layout);
        this.f77882e = bogInputLayout;
        bogInputLayout.getEditText().setSaveEnabled(false);
        this.f77787v.f68388n.f69177f.getEditText().setSaveEnabled(false);
        mo71587E2();
        if (!this.f77884g && this.f77763B) {
            m93007D2();
        }
        if (this.f77768G) {
            mo71719W1(" ₾");
            this.f77882e.getEditText().setNonSelectableString(" ₾");
        }
        if (this.f77763B) {
            this.f77787v.f68388n.f69177f.setPreserveText(true);
        }
        if (!mo71549G1()) {
            if (C32315k0.m95250E(m93031x2())) {
                String replace = mo71611z1().replace(m93031x2().replace("x", ""), "").replace(" ", "");
                this.f77882e.getEditText().initMask(m93031x2(), "x");
                this.f77882e.getEditText().setMaskedText(replace);
                this.f77882e.getEditText().setSelection(mo71611z1().length(), mo71611z1().length());
                this.f77882e.getEditText().setAfterTextMaskedListener(this.f77786Y);
                getArguments().putString("PAYMENT_PARAMETER_VALUE", this.f77882e.getEditText().getText().toString());
            }
            this.f77882e.getEditText().removeTextChangedListener(this.f77785X);
            this.f77882e.getEditText().addTextChangedListener(this.f77785X);
        }
        m93011Y2();
        m93009W2();
        m93010X2();
        mo71730n1();
        m93021k3();
    }

    /* renamed from: q2 */
    public boolean mo71605q2() {
        C30879d dVar = this.f77789x;
        return dVar != null && dVar.getItemCount() > 0;
    }

    /* renamed from: s2 */
    public int mo71606s2() {
        return this.f77774M;
    }

    /* renamed from: t1 */
    public BogInputLayout mo71607t1() {
        return this.f77882e;
    }

    /* renamed from: t2 */
    public int mo71608t2() {
        return mo71733r1().getInt("PAYMENT_PACK_INDEX", -1);
    }

    /* renamed from: v2 */
    public KeyValue mo71609v2() {
        mo71587E2();
        if (this.f77790y != null) {
            KeyValue keyValue = new KeyValue();
            keyValue.setKey(this.f77790y.getId());
            String u2 = m93029u2();
            if (C32315k0.m95250E(m93031x2())) {
                u2 = u2.replaceAll(" ", "");
            }
            keyValue.setValue(u2);
            return keyValue;
        } else if (!mo71591J2()) {
            return null;
        } else {
            KeyValue keyValue2 = new KeyValue();
            keyValue2.setKey("TEMPLATE_NAME_ID");
            keyValue2.setValue(mo71611z1());
            return keyValue2;
        }
    }

    /* renamed from: y1 */
    public int mo71610y1() {
        BogInputLayout bogInputLayout = this.f77882e;
        if (bogInputLayout != null) {
            return bogInputLayout.getLastInputType();
        }
        return BogInputLayout.INPUT_TYPE_NUM_PHONE;
    }

    /* renamed from: z1 */
    public String mo71611z1() {
        return getArguments().getString("PAYMENT_PARAMETER_VALUE", "");
    }
}
