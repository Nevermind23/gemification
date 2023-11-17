package c91;

import a91.C30879d;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import g91.C32303f;
import hd1.C41205b;
import i91.C36368b;
import i91.C36370c;
import iu0.C36546y;
import p341ge.bog.mobilebank.model.GettingPhoneOwnerPurpose;
import p341ge.bog.mobilebank.model.account.AccountOwnerInfoWrapper;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p341ge.bog.mobilebank.p975ui.views.widgets.MaskedEditText2;
import p341ge.bog.mobilebank.p975ui.wizard.activities.AdvancedWizardActivity;
import p341ge.bog.mobilebank.rest.model.RestCallback;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p366bk.C10324m;
import p366bk.C10328q;

/* renamed from: c91.m */
public class C31315m<T extends AdvancedWizardActivity> extends C31331s<T> implements C36370c.C36372b, MaskedEditText2.ClipboardPasteTextListener {

    /* renamed from: H */
    private C36370c f77748H;

    /* renamed from: I */
    private C30879d f77749I;

    /* renamed from: J */
    private BogInputLayout f77750J;

    /* renamed from: K */
    private boolean f77751K;

    /* renamed from: L */
    private boolean f77752L = true;

    /* renamed from: M */
    private boolean f77753M = false;

    /* renamed from: N */
    private GettingPhoneOwnerPurpose f77754N;

    /* renamed from: O */
    private int f77755O = C10328q.contacts_permission_desc;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public String f77756P = null;

    /* renamed from: Q */
    private boolean f77757Q = false;

    /* renamed from: c91.m$a */
    class C31316a extends RestCallback {

        /* renamed from: a */
        final /* synthetic */ String f77758a;

        C31316a(String str) {
            this.f77758a = str;
        }

        public void onEnqueue(C41205b bVar) {
            C31315m.this.addDisposable(bVar);
        }

        public void onFailure(Throwable th) {
            if (C31315m.this.f77882e.getText().equals(this.f77758a)) {
                C31315m.this.f77883f.mo87958V2();
                C31315m mVar = C31315m.this;
                mVar.f77883f.mo87965p3(mVar.m92984x2());
            }
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            if (C31315m.this.f77882e.getText().equals(this.f77758a)) {
                C31315m.this.f77883f.mo87958V2();
                if (bankApiResponse.getResult() != null) {
                    C31315m.this.f77756P = ((AccountOwnerInfoWrapper) bankApiResponse.getResult()).clientInfo.getOwner();
                }
                C31315m mVar = C31315m.this;
                mVar.f77883f.mo87965p3(mVar.m92984x2());
            }
        }
    }

    /* renamed from: A2 */
    private boolean m92972A2() {
        return this.f77806E != null;
    }

    /* renamed from: B2 */
    private void m92973B2() {
        if (!this.f77751K) {
            if (this.f77749I == null || this.f77748H == null) {
                C36370c f = C36370c.m107926f(C36546y.m108285N());
                this.f77748H = f;
                f.mo89115q(this);
            }
            if (!this.f77748H.mo89116r()) {
                mo71571D();
            }
        } else if (!m92972A2() || mo71707D1().getSelectedSubTemplateItem() == -1) {
            mo71572E2();
        }
    }

    /* renamed from: C2 */
    private boolean m92974C2() {
        return this.f77882e.getText().matches("[0-9]+") && this.f77882e.getText().length() == 9;
    }

    /* access modifiers changed from: private */
    /* renamed from: D2 */
    public /* synthetic */ void m92975D2(C36368b bVar) {
        this.f77756P = bVar.mo89097a();
        this.f77882e.getEditText().setText(bVar.mo89098b().replace("+995", ""));
        this.f77882e.getEditText().setSelection(this.f77882e.getText().length());
    }

    /* renamed from: J2 */
    private void m92976J2() {
        this.f77882e.setOriginalInputType(BogInputLayout.INPUT_TYPE_NUM_PHONE);
        if (C36370c.m107927h(getActivity())) {
            this.f77882e.setOriginalInputType(BogInputLayout.INPUT_TYPE_TEXT_NO_SUGGESTIONS);
            m92973B2();
            return;
        }
        C36370c.m107933n(this, getString(this.f77755O));
    }

    /* renamed from: K2 */
    private void m92977K2() {
        this.f77804C.setText(C36546y.m108285N().getString(C10328q.payments_wizard_mobile_contacts_title_capital));
        this.f77802A.setVisibility(0);
        this.f77803B.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f77803B.setVisibility(0);
        if (C36370c.m107927h(getActivity())) {
            m92973B2();
        }
    }

    /* renamed from: L2 */
    private void m92978L2() {
        if (this.f77802A.getVisibility() == 4) {
            this.f77802A.setVisibility(0);
        }
        if (this.f77882e.getText().length() > 0 || !m92972A2()) {
            if (mo71707D1().getSelectedSubTemplateItem() == -1) {
                m92977K2();
            }
            C30879d dVar = this.f77749I;
            if (dVar == null || (dVar.getItemCount() == 0 && m92972A2())) {
                m92979M2();
            }
        } else {
            m92979M2();
        }
        if (!m92972A2()) {
            C30879d dVar2 = this.f77749I;
            if (dVar2 == null || dVar2.getItemCount() == 0) {
                this.f77802A.setVisibility(4);
            }
        }
    }

    /* renamed from: M2 */
    private void m92979M2() {
        this.f77802A.setVisibility(0);
        this.f77803B.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.f77803B.setAdapter(this.f77807F);
        this.f77803B.setVisibility(0);
        this.f77804C.setText(mo71707D1().getSubTemplateObjectsTitle());
        this.f77804C.setVisibility(0);
    }

    /* renamed from: w2 */
    private void m92983w2() {
        if (this.f77752L) {
            BogInputLayout bogInputLayout = (BogInputLayout) LayoutInflater.from(getContext()).inflate(C10324m.wizard_mobile_phone_index, (ViewGroup) null);
            this.f77750J = bogInputLayout;
            bogInputLayout.getEditText().setSaveEnabled(false);
            this.f77750J.setValue("+995");
            this.f77886i.addView(this.f77750J, 0, new LinearLayout.LayoutParams(0, -2, Utils.FLOAT_EPSILON));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x2 */
    public boolean m92984x2() {
        if ((!TextUtils.isEmpty(this.f77882e.getText()) || !this.f77894q) && !m92974C2()) {
            return false;
        }
        return true;
    }

    /* renamed from: z2 */
    private void m92985z2(String str) {
        this.f77883f.mo87971y3();
        this.mBankApi.getAcctOwnerInfoMaskedWithPhone(str, (String) null, this.f77754N, new C31316a(str));
    }

    /* renamed from: D */
    public void mo71571D() {
        mo71572E2();
        m92978L2();
    }

    /* renamed from: E2 */
    public void mo71572E2() {
        boolean z = true;
        this.f77751K = true;
        if (this.f77749I == null) {
            C36370c cVar = this.f77748H;
            if (this.f77882e.getLastInputType() == 305) {
                z = false;
            }
            cVar.mo89114o("", z);
            C30879d dVar = new C30879d(this.f77748H.mo89113g());
            this.f77749I = dVar;
            dVar.mo71072j(new C31314l(this));
        }
        RecyclerView.C1736h adapter = this.f77803B.getAdapter();
        C30879d dVar2 = this.f77749I;
        if (adapter != dVar2 && (dVar2.getItemCount() > 0 || !m92972A2())) {
            this.f77803B.setAdapter(this.f77749I);
            this.f77803B.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        this.f77749I.mo71073k(this.f77748H.mo89113g());
    }

    /* renamed from: F2 */
    public void mo71573F2(int i) {
        if (i > 0) {
            this.f77755O = i;
        }
    }

    /* renamed from: H2 */
    public void mo71574H2(boolean z, GettingPhoneOwnerPurpose gettingPhoneOwnerPurpose) {
        this.f77753M = z;
        this.f77754N = gettingPhoneOwnerPurpose;
    }

    /* renamed from: I2 */
    public void mo71575I2(boolean z) {
        this.f77752L = z;
    }

    /* renamed from: S0 */
    public void mo71576S0() {
        this.f77751K = false;
        if (this.f77897t) {
            m92978L2();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g2 */
    public void mo71552g2(Editable editable) {
        boolean z;
        super.mo71552g2(editable);
        if (editable.length() < 0 || !this.f77751K) {
            m92978L2();
            return;
        }
        if (!this.f77884g) {
            m92978L2();
        }
        String text = this.f77882e.getText();
        C36370c cVar = this.f77748H;
        if (this.f77882e.getLastInputType() != 305) {
            z = true;
        } else {
            z = false;
        }
        cVar.mo89114o(text, z);
        this.f77749I.mo71073k(this.f77748H.mo89113g());
        if (!m92974C2()) {
            this.f77883f.mo87958V2();
            this.f77883f.mo87965p3(m92984x2());
        } else if (this.f77753M) {
            m92985z2(text);
        } else {
            this.f77883f.mo87965p3(true);
        }
        RecyclerView.C1736h adapter = this.f77803B.getAdapter();
        C30879d dVar = this.f77749I;
        if (adapter != dVar) {
            this.f77803B.setAdapter(dVar);
        }
        C30879d dVar2 = this.f77749I;
        if (dVar2 == null || dVar2.getItemCount() == 0) {
            m92978L2();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o1 */
    public void mo71558o1() {
        super.mo71558o1();
        BogInputLayout bogInputLayout = this.f77750J;
        if (bogInputLayout != null) {
            bogInputLayout.showLayout();
        }
        m92978L2();
    }

    public boolean onManageClipboardText(String str) {
        if (!C36370c.m107927h(getActivity())) {
            if (!str.matches("[0-9]+")) {
                str = str.replaceAll("[^\\d.]", "");
            }
            if (str.length() > 9) {
                str = str.substring(str.length() - 9);
            }
        }
        this.f77882e.getEditText().setText(str);
        this.f77882e.getEditText().setSelection(str.length());
        return true;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 9898 && C32303f.m95190a(iArr)) {
            this.f77882e.setOriginalInputType(BogInputLayout.INPUT_TYPE_TEXT_NO_SUGGESTIONS);
            if (!this.f77757Q) {
                m92973B2();
                this.f77757Q = true;
            }
        }
    }

    public void onStart() {
        super.onStart();
        this.f77883f.mo87970x3(true);
    }

    public void onStop() {
        super.onStop();
        this.f77883f.mo87970x3(false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (mo71707D1() != null) {
            mo71573F2(mo71707D1().getMobileNumberInputContactPermissionTextId());
            Boolean showMobileNumberIndexPrefix = mo71707D1().getShowMobileNumberIndexPrefix();
            if (showMobileNumberIndexPrefix != null) {
                this.f77752L = showMobileNumberIndexPrefix.booleanValue();
            }
        }
        if (this.f77752L) {
            m92983w2();
        }
        if (this.f77897t) {
            BogInputLayout bogInputLayout = this.f77750J;
            if (bogInputLayout != null) {
                bogInputLayout.showLayout(mo71707D1().shouldAnimate());
            }
            m92978L2();
        }
        m92976J2();
        if (!TextUtils.isEmpty(mo71707D1().getValue()) && !mo71707D1().shouldAnimate()) {
            mo71607t1().collapseHint();
        }
        this.f77882e.getEditText().setClipboardPasteTextListener(this);
    }

    /* renamed from: y2 */
    public String mo71578y2() {
        return this.f77756P;
    }
}
