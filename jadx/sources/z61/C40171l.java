package z61;

import a71.C30515e;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import c91.C31355y;
import g91.C32297d;
import hd1.C41205b;
import java.util.ArrayList;
import java.util.List;
import org.parceler.C42035e;
import p341ge.bog.mobilebank.model.foreigntransfer.ReportingCode;
import p341ge.bog.mobilebank.model.foreigntransfer.TransferCountryCode;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p341ge.bog.mobilebank.rest.model.RestCallback;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p366bk.C10322k;
import p366bk.C10324m;
import r90.C27950a;

/* renamed from: z61.l */
public class C40171l extends C31355y implements C30515e.C30516a {

    /* renamed from: v */
    private BogInputLayout f95440v;

    /* renamed from: w */
    private View f95441w;

    /* renamed from: x */
    private View f95442x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public C30515e f95443y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public List f95444z = new ArrayList();

    /* renamed from: z61.l$a */
    class C40172a implements TextWatcher {
        C40172a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ArrayList arrayList = new ArrayList();
            for (ReportingCode reportingCode : C40171l.this.f95444z) {
                if (reportingCode.getReportingCode() != null && reportingCode.getReportingCode().toLowerCase().contains(charSequence.toString().toLowerCase())) {
                    arrayList.add(reportingCode);
                }
            }
            C40171l.this.f95443y.mo70872o(arrayList);
            C40171l.this.f95443y.notifyDataSetChanged();
        }
    }

    /* renamed from: z61.l$b */
    class C40173b extends RestCallback {
        C40173b() {
        }

        public void onEnqueue(C41205b bVar) {
            C40171l.this.addDisposable(bVar);
        }

        public void onFailure(Throwable th) {
            C40171l.this.m116397r2();
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            if (bankApiResponse.isSuccess()) {
                C40171l.this.f95444z = (List) bankApiResponse.getResult();
                C40171l.this.f95443y.mo70872o(C40171l.this.f95444z);
                C40171l.this.f95443y.notifyDataSetChanged();
                C40171l.this.m116392m2();
                return;
            }
            C32297d.m95154b(C40171l.this.getActivity(), C27950a.m86284a(bankApiResponse.getKey()));
            C40171l.this.m116397r2();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public void m116392m2() {
        this.f95442x.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public /* synthetic */ void m116393n2(View view) {
        m116394o2();
    }

    /* renamed from: o2 */
    private void m116394o2() {
        m116396q2();
        this.mBankApi.foreignTransferGetReportingCodes(TransferCountryCode.COUNTRY_CODE_UNITED_ARAB_EMIRATES.getValue(), new C40173b());
    }

    /* renamed from: p2 */
    public static C40171l m116395p2(ReportingCode reportingCode) {
        String str;
        Bundle bundle = new Bundle();
        bundle.putParcelable("SELECTED_CODE", C42035e.m122121c(reportingCode));
        C40171l lVar = new C40171l();
        lVar.setArguments(bundle);
        if (reportingCode != null) {
            str = reportingCode.getReportingCode();
        } else {
            str = null;
        }
        lVar.mo71717U1(str);
        return lVar;
    }

    /* renamed from: q2 */
    private void m116396q2() {
        this.f95441w.setVisibility(8);
        this.f95442x.setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public void m116397r2() {
        this.f95442x.setVisibility(8);
        this.f95441w.setVisibility(0);
    }

    /* renamed from: G1 */
    public boolean mo71549G1() {
        return true;
    }

    /* renamed from: J1 */
    public boolean mo67196J1() {
        return false;
    }

    /* renamed from: T0 */
    public void mo70874T0(ReportingCode reportingCode) {
        this.f77883f.mo87965p3(true);
        mo71733r1().putParcelable("SELECTED_CODE", C42035e.m122121c(reportingCode));
        mo71717U1(reportingCode.getReportingCode());
    }

    /* renamed from: l2 */
    public ReportingCode mo94137l2() {
        return (ReportingCode) C42035e.m122119a(mo71733r1().getParcelable("SELECTED_CODE"));
    }

    /* access modifiers changed from: protected */
    public int layoutId() {
        return C10324m.fragment_reporoting_code_selector;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f95440v = (BogInputLayout) view.findViewById(C10322k.search_input_layout);
        this.f95441w = view.findViewById(C10322k.retryLayout);
        this.f95442x = view.findViewById(C10322k.f28913yq);
        view.findViewById(C10322k.horizontal_error_retry_button).setOnClickListener(new C40170k(this));
        this.f77889l.setLayoutManager(new LinearLayoutManager(getContext()));
        C30515e eVar = new C30515e(this);
        this.f95443y = eVar;
        this.f77889l.setAdapter(eVar);
        ReportingCode l2 = mo94137l2();
        if (l2 != null) {
            this.f95443y.mo70873p(l2.getReportingCode());
        }
        this.f95440v.requestFocus();
        this.f95440v.getEditText().addTextChangedListener(new C40172a());
        m116394o2();
    }
}
