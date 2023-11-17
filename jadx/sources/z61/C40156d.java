package z61;

import a71.C30505b;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c91.C31355y;
import org.parceler.C42035e;
import p341ge.bog.mobilebank.model.foreigntransfer.ForeignBank;
import p341ge.bog.mobilebank.model.foreigntransfer.ForeignBankList;
import p341ge.bog.mobilebank.model.foreigntransfer.TransferCountryCode;
import p341ge.bog.mobilebank.p975ui.wizard.activities.C35862c;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: z61.d */
public class C40156d extends C31355y implements C40151b, C30505b.C30507b {

    /* renamed from: A */
    private TextWatcher f95409A = new C40157a();

    /* renamed from: v */
    private int f95410v = 1999;

    /* renamed from: w */
    private RecyclerView f95411w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public C30505b f95412x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public C40152c f95413y;

    /* renamed from: z */
    private boolean f95414z;

    /* renamed from: z61.d$a */
    class C40157a implements TextWatcher {
        C40157a() {
        }

        public void afterTextChanged(Editable editable) {
            ForeignBank foreignBank;
            String obj = editable.toString();
            if (!TextUtils.isEmpty(obj)) {
                foreignBank = new ForeignBank();
                foreignBank.setBankName(obj);
                foreignBank.setSwift(obj);
            } else {
                foreignBank = null;
            }
            C40156d.this.mo70854j(foreignBank);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: z61.d$b */
    class C40158b extends C30505b {
        C40158b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: s */
        public boolean mo92730s() {
            C40156d.this.f95413y.mo94102d(C40156d.this.mo71611z1(), C40156d.this.f95412x.mo92727l().size());
            return true;
        }
    }

    /* renamed from: h2 */
    private void m116310h2() {
        this.f77882e.getEditText().addTextChangedListener(this.f95409A);
        this.f77882e.setTag(Boolean.TRUE);
    }

    /* renamed from: j2 */
    public static C40156d m116311j2(ForeignBank foreignBank, String str) {
        String str2;
        Bundle bundle = new Bundle();
        C40156d dVar = new C40156d();
        bundle.putParcelable("SELECTED_BANK", C42035e.m122121c(foreignBank));
        bundle.putString("INPUT_DESCRIPTION", str);
        dVar.setArguments(bundle);
        if (foreignBank != null) {
            if (foreignBank.getSwift() != null) {
                str2 = foreignBank.getSwift();
            } else {
                str2 = foreignBank.getBankName();
            }
            dVar.mo71717U1(str2);
        }
        return dVar;
    }

    /* renamed from: k2 */
    private void m116312k2(TransferCountryCode transferCountryCode) {
        C35862c cVar = this.f77883f;
        if (cVar instanceof C40150a) {
            ((C40150a) cVar).mo87875p0(transferCountryCode);
        }
    }

    /* renamed from: l2 */
    private boolean m116313l2() {
        this.f77882e.getEditText().removeTextChangedListener(this.f95409A);
        if (this.f77882e.getTag() == null) {
            return false;
        }
        this.f77882e.setTag((Object) null);
        return true;
    }

    /* renamed from: n2 */
    private void m116314n2(ForeignBank foreignBank) {
        mo71733r1().putParcelable("SELECTED_BANK", C42035e.m122121c(foreignBank));
    }

    /* renamed from: A */
    public void mo94090A(String str, TransferCountryCode transferCountryCode) {
        ForeignBank i2 = mo94106i2();
        if (i2 != null && str.equals(i2.getSwift())) {
            i2.setCountryCode(transferCountryCode);
            m116314n2(i2);
            m116312k2(transferCountryCode);
        }
    }

    /* renamed from: B */
    public void mo94091B(String str) {
    }

    /* renamed from: G1 */
    public boolean mo71549G1() {
        return false;
    }

    /* renamed from: U0 */
    public void mo94092U0() {
    }

    /* renamed from: X0 */
    public void mo94093X0() {
        this.f95412x.mo92723B();
    }

    /* renamed from: a0 */
    public void mo94094a0(String str) {
        this.f95412x.mo92728n();
    }

    /* renamed from: c */
    public void mo94095c() {
        this.f77883f.mo87958V2();
    }

    /* renamed from: e */
    public void mo94096e() {
        this.f77883f.mo87971y3();
    }

    /* renamed from: i0 */
    public void mo94097i0(ForeignBankList foreignBankList, String str) {
        boolean z;
        if (str.equals(mo71611z1())) {
            this.f95412x.mo70848G(foreignBankList.getList());
            C30505b bVar = this.f95412x;
            if (foreignBankList.getSummary().getTotalCount() <= this.f95412x.mo92727l().size()) {
                z = true;
            } else {
                z = false;
            }
            bVar.mo92722A(z);
        }
    }

    /* renamed from: i2 */
    public ForeignBank mo94106i2() {
        return (ForeignBank) C42035e.m122119a(mo71733r1().getParcelable("SELECTED_BANK"));
    }

    /* renamed from: j */
    public void mo70854j(ForeignBank foreignBank) {
        String str;
        String str2;
        boolean z;
        boolean l2 = m116313l2();
        m116314n2(foreignBank);
        if (foreignBank != null) {
            str2 = foreignBank.getBankName();
            str = foreignBank.getSwift();
        } else {
            str2 = "";
            str = str2;
        }
        this.f77882e.setValue(str2);
        mo71717U1(str);
        this.f95412x.mo70849H(str);
        C35862c cVar = this.f77883f;
        if (foreignBank != null || !this.f95414z) {
            z = true;
        } else {
            z = false;
        }
        cVar.mo87965p3(z);
        this.f95413y.mo94101c(str);
        if (!this.f95414z || foreignBank == null || foreignBank.getSwift() == null) {
            m116312k2((TransferCountryCode) null);
        } else {
            this.f95413y.mo94100b(foreignBank.getSwift());
        }
        if (l2) {
            m116310h2();
        }
    }

    /* access modifiers changed from: protected */
    public int layoutId() {
        return C10324m.fragment_foreign_bank_selector_wizard;
    }

    /* renamed from: m2 */
    public void mo94107m2(boolean z) {
        this.f95414z = z;
    }

    public void onActivityCreated(Bundle bundle) {
        mo71711N1(false);
        super.onActivityCreated(bundle);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        this.f77883f = (C35862c) requireActivity();
    }

    public void onPause() {
        super.onPause();
        m116313l2();
    }

    public void onResume() {
        super.onResume();
        m116310h2();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f95411w = (RecyclerView) view.findViewById(C10322k.f28872n2);
        C40158b bVar = new C40158b();
        this.f95412x = bVar;
        bVar.mo70850I(this);
        this.f95411w.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f95411w.setAdapter(this.f95412x);
        this.f95413y = new C40152c(this);
        this.f77882e.setUnderHintText(mo71733r1().getString("INPUT_DESCRIPTION"));
        mo70854j(mo94106i2());
    }

    /* renamed from: r0 */
    public void mo94098r0(ForeignBankList foreignBankList, String str) {
        boolean z;
        if (str.equals(mo71611z1())) {
            this.f95412x.mo92729r(foreignBankList.getList());
            C30505b bVar = this.f95412x;
            if (foreignBankList.getSummary().getTotalCount() <= this.f95412x.mo92727l().size()) {
                z = true;
            } else {
                z = false;
            }
            bVar.mo92722A(z);
            return;
        }
        this.f95412x.mo92728n();
    }

    /* renamed from: w */
    public void mo94099w() {
    }
}
