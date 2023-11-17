package g81;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32359z0;
import java.util.Set;
import l81.C37107d;
import p341ge.bog.mobilebank.model.KeyValue;
import p341ge.bog.mobilebank.model.payment.PaymentDebtResponse;
import p341ge.bog.mobilebank.model.payment.PaymentServiceConfigParameter;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10322k;
import p366bk.C10324m;
import r90.C27950a;

/* renamed from: g81.j */
public class C32195j extends RecyclerView.C1736h {

    /* renamed from: d */
    private PaymentDebtResponse f79358d = new PaymentDebtResponse();

    /* renamed from: e */
    private PaymentServiceConfigParameter[] f79359e;

    /* renamed from: f */
    private Set f79360f;

    /* renamed from: g81.j$a */
    class C32196a extends C37107d {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public View f79361f = mo90036h(C10322k.debt_item_divider);
        /* access modifiers changed from: private */

        /* renamed from: g */
        public BogTextView f79362g = ((BogTextView) mo90036h(C10322k.debt_item_key));
        /* access modifiers changed from: private */

        /* renamed from: h */
        public BogTextView f79363h = ((BogTextView) mo90036h(C10322k.debt_item_value));

        C32196a(View view) {
            super(view);
        }
    }

    /* renamed from: g */
    private String m94858g(String str) {
        for (PaymentServiceConfigParameter paymentServiceConfigParameter : this.f79359e) {
            if (paymentServiceConfigParameter.getId().equals(str)) {
                return paymentServiceConfigParameter.getName();
            }
        }
        return str;
    }

    /* renamed from: f */
    public KeyValue mo72717f(int i) {
        return this.f79358d.getParameter()[i];
    }

    public int getItemCount() {
        if (this.f79358d.getParameter() != null) {
            return this.f79358d.getParameter().length;
        }
        return 0;
    }

    /* renamed from: h */
    public void onBindViewHolder(C32196a aVar, int i) {
        if (i == getItemCount() - 1) {
            aVar.f79361f.setVisibility(8);
        } else {
            aVar.f79361f.setVisibility(0);
        }
        String key = mo72717f(i).getKey();
        String value = mo72717f(i).getValue();
        aVar.f79362g.setText(String.format("%s:", new Object[]{C27950a.m86286c(m94858g(key), true)}));
        if (this.f79360f.contains(Integer.valueOf(i))) {
            value = C32359z0.m95555Z((double) Float.parseFloat(value)) + " ₾";
        }
        aVar.f79363h.setText(value);
    }

    /* renamed from: i */
    public C32196a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C32196a(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.debt_recycler_item, viewGroup, false));
    }

    /* renamed from: j */
    public void mo72720j(PaymentDebtResponse paymentDebtResponse, PaymentServiceConfigParameter[] paymentServiceConfigParameterArr, Set set) {
        this.f79358d = paymentDebtResponse;
        this.f79359e = paymentServiceConfigParameterArr;
        this.f79360f = set;
        notifyDataSetChanged();
    }
}
