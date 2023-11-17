package z61;

import a71.C30512d;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import c91.C31355y;
import g91.C32297d;
import hd1.C41205b;
import java.util.ArrayList;
import java.util.List;
import org.parceler.C42035e;
import p341ge.bog.mobilebank.model.BogCountry;
import p341ge.bog.mobilebank.rest.model.RestCallback;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p366bk.C10320i;
import p366bk.C10328q;
import p90.C27298f4;
import r90.C27950a;

/* renamed from: z61.j */
public class C40167j extends C31355y implements C30512d.C30513a {

    /* renamed from: v */
    private C27298f4 f95434v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public C30512d f95435w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public List f95436x = new ArrayList();

    /* renamed from: z61.j$a */
    class C40168a implements TextWatcher {
        C40168a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ArrayList arrayList = new ArrayList();
            for (BogCountry bogCountry : C40167j.this.f95436x) {
                if (bogCountry.getCountryNameInt() != null && bogCountry.getCountryNameInt().toLowerCase().contains(charSequence)) {
                    arrayList.add(bogCountry);
                }
            }
            C40167j.this.f95435w.mo70866o(arrayList);
            C40167j.this.f95435w.notifyDataSetChanged();
        }
    }

    /* renamed from: z61.j$b */
    class C40169b extends RestCallback {
        C40169b() {
        }

        public void onEnqueue(C41205b bVar) {
            C40167j.this.addDisposable(bVar);
        }

        public void onFailure(Throwable th) {
            C40167j.this.m116380r2();
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            if (bankApiResponse.isSuccess()) {
                C40167j.this.f95436x = (List) bankApiResponse.getResult();
                C40167j.this.f95435w.mo70866o(C40167j.this.f95436x);
                C40167j.this.f95435w.notifyDataSetChanged();
                C40167j.this.m116375m2();
                return;
            }
            C32297d.m95154b(C40167j.this.getActivity(), C27950a.m86284a(bankApiResponse.getKey()));
            C40167j.this.m116380r2();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public void m116375m2() {
        this.f95434v.f68723f.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public /* synthetic */ void m116376n2(View view) {
        m116377o2();
    }

    /* renamed from: o2 */
    private void m116377o2() {
        m116379q2();
        this.mBankApi.foreignTransferGetCountries(new C40169b());
    }

    /* renamed from: p2 */
    public static C40167j m116378p2(BogCountry bogCountry) {
        String str;
        Bundle bundle = new Bundle();
        bundle.putParcelable("SELECTED_COUNTRY", C42035e.m122121c(bogCountry));
        C40167j jVar = new C40167j();
        jVar.setArguments(bundle);
        if (bogCountry != null) {
            str = bogCountry.getCountryCode();
        } else {
            str = null;
        }
        jVar.mo71717U1(str);
        return jVar;
    }

    /* renamed from: q2 */
    private void m116379q2() {
        this.f95434v.f68724g.setVisibility(8);
        this.f95434v.f68723f.setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public void m116380r2() {
        this.f95434v.f68723f.setVisibility(8);
        this.f95434v.f68724g.setVisibility(0);
    }

    /* renamed from: G1 */
    public boolean mo71549G1() {
        return true;
    }

    /* renamed from: J1 */
    public boolean mo67196J1() {
        return false;
    }

    /* renamed from: L */
    public void mo70868L(BogCountry bogCountry) {
        this.f77883f.mo87965p3(true);
        mo71733r1().putParcelable("SELECTED_COUNTRY", C42035e.m122121c(bogCountry));
        mo71717U1(bogCountry.getCountryCode());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b2 */
    public void mo71661b2(View view) {
        super.mo71661b2(view);
        this.f95434v.f68725h.setUnderHintText(getString(C10328q.user_name_wizard_title_country));
        this.f95434v.f68725h.requestFocus();
        this.f95434v.f68725h.setRightDrawable(C10320i.merchant_search_icon);
    }

    /* renamed from: l2 */
    public BogCountry mo94131l2() {
        return (BogCountry) C42035e.m122119a(mo71733r1().getParcelable("SELECTED_COUNTRY"));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C27298f4 d = C27298f4.m84498d(layoutInflater, viewGroup, false);
        this.f95434v = d;
        return d.mo3946b();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f95434v = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f77889l.setLayoutManager(new LinearLayoutManager(getContext()));
        C30512d dVar = new C30512d(this);
        this.f95435w = dVar;
        this.f77889l.setAdapter(dVar);
        BogCountry l2 = mo94131l2();
        if (l2 != null) {
            this.f95435w.mo70867p(l2.getCountryCode());
        }
        this.f95434v.f68725h.getEditText().addTextChangedListener(new C40168a());
        m116377o2();
        this.f95434v.f68722e.mo3946b().setOnClickListener(new C40166i(this));
    }
}
