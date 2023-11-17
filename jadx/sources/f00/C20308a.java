package f00;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32319m;
import g91.C32343x;
import h00.C24842a;
import he1.C41233s;
import i10.C25100c;
import iu0.C36546y;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.application.presentation.activity.ApplicationDetailsActivity;
import p341ge.bog.mobilebank.model.Application;
import p341ge.bog.mobilebank.model.deposits.DepositAppDetails;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;

/* renamed from: f00.a */
public final class C20308a extends RecyclerView.C1736h {

    /* renamed from: f */
    public static final C20309a f55224f = new C20309a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Map f55225d = C41344r0.m119933o(C41233s.m119492a(C24842a.DEBIT_CARD.mo63277b(), Integer.valueOf(C10320i.card_icon)), C41233s.m119492a(C24842a.DEPOSIT.mo63277b(), Integer.valueOf(C10320i.ic_depost)), C41233s.m119492a(C24842a.CREDIT_APPLICATION.mo63277b(), Integer.valueOf(C10320i.ic_consumer_loan_application_icon)));

    /* renamed from: e */
    private List f55226e = C41341q.m119907j();

    /* renamed from: f00.a$a */
    public static final class C20309a {
        private C20309a() {
        }

        public /* synthetic */ C20309a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: f00.a$b */
    private final class C20310b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final TextView f55227d;

        /* renamed from: e */
        final /* synthetic */ C20308a f55228e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20310b(C20308a aVar, View view) {
            super(view);
            C41536l.m120489i(view, "v");
            this.f55228e = aVar;
            View findViewById = view.findViewById(C10322k.f28741Hf);
            C41536l.m120488h(findViewById, "v.findViewById(R.id.header_text)");
            TextView textView = (TextView) findViewById;
            this.f55227d = textView;
            textView.setText(C10328q.applications_history_header);
        }
    }

    /* renamed from: f00.a$c */
    private final class C20311c extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private View f55229d;

        /* renamed from: e */
        private final TextView f55230e;

        /* renamed from: f */
        private final TextView f55231f;

        /* renamed from: g */
        private final ImageView f55232g;

        /* renamed from: h */
        final /* synthetic */ C20308a f55233h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20311c(C20308a aVar, View view) {
            super(view);
            C41536l.m120489i(view, "rootView");
            this.f55233h = aVar;
            this.f55229d = view;
            View findViewById = view.findViewById(C10322k.time_text);
            C41536l.m120488h(findViewById, "rootView.findViewById(R.id.time_text)");
            this.f55230e = (TextView) findViewById;
            View findViewById2 = this.f55229d.findViewById(C10322k.provider_text);
            C41536l.m120488h(findViewById2, "rootView.findViewById(R.id.provider_text)");
            this.f55231f = (TextView) findViewById2;
            View findViewById3 = this.f55229d.findViewById(C10322k.rounded_image);
            C41536l.m120488h(findViewById3, "rootView.findViewById(R.id.rounded_image)");
            this.f55232g = (ImageView) findViewById3;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m66360j(C20311c cVar, Application application, View view) {
            C41536l.m120489i(cVar, "this$0");
            C41536l.m120489i(application, "$application");
            C36546y.m108282F().mo27152s("applications", cVar.m66361k(application), "open_past_application");
            ApplicationDetailsActivity.C20801a aVar = ApplicationDetailsActivity.f56053J;
            C41536l.m120488h(view, "it");
            Activity a = C25100c.m80062a(view);
            if (a != null) {
                aVar.mo49468a(a, application);
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        /* renamed from: k */
        private final String m66361k(Application application) {
            String appType = application.getAppType();
            if (C41536l.m120484d(appType, C24842a.DEBIT_CARD.mo63277b())) {
                return "DEBIT_CARD";
            }
            if (C41536l.m120484d(appType, C24842a.DEPOSIT.mo63277b())) {
                return "DEPOSIT";
            }
            if (C41536l.m120484d(appType, C24842a.CREDIT_APPLICATION.mo63277b())) {
                return "CREDIT_APPLICATION";
            }
            C41536l.m120484d(appType, C24842a.CREDIT_LIMIT_APP.mo63277b());
            return "";
        }

        /* renamed from: i */
        public final void mo48790i(Application application) {
            String str;
            List<DepositAppDetails.ContractDetail> list;
            DepositAppDetails.ContractDetail contractDetail;
            C41536l.m120489i(application, "application");
            ImageView imageView = this.f55232g;
            Object obj = this.f55233h.f55225d.get(application.getAppType());
            C41536l.m120486f(obj);
            imageView.setImageResource(((Number) obj).intValue());
            this.f55230e.setText(C32319m.m95296c(application.getCreateDate(), this.itemView.getContext()));
            if (!C41536l.m120484d(application.getAppType(), C24842a.DEBIT_CARD.mo63277b()) && !C41536l.m120484d(application.getAppType(), C24842a.DEPOSIT.mo63277b())) {
                this.f55231f.setText(C32343x.m95388F(application.getDictionaryKey(), new Object[0]));
            } else if (application.getCardDetails() != null) {
                this.f55231f.setText(C32343x.m95388F(application.getCardDetails().subProductDictionaryKey, new Object[0]));
            } else {
                TextView textView = this.f55231f;
                DepositAppDetails depositDetails = application.getDepositDetails();
                if (depositDetails == null || (list = depositDetails.contractDetails) == null || (contractDetail = (DepositAppDetails.ContractDetail) C41358y.m120009Y(list)) == null) {
                    str = null;
                } else {
                    str = contractDetail.dictionaryKey;
                }
                textView.setText(C32343x.m95388F(str, new Object[0]));
            }
            this.f55229d.setOnClickListener(new C20312b(this, application));
        }
    }

    /* renamed from: g */
    public final void mo48789g(List list) {
        C41536l.m120489i(list, "data");
        this.f55226e = list;
        notifyDataSetChanged();
    }

    public int getItemCount() {
        return this.f55226e.size() + 1;
    }

    public int getItemViewType(int i) {
        return i == 0 ? 1 : 2;
    }

    public void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        C41536l.m120489i(f0Var, "holder");
        if (i > 0) {
            ((C20311c) f0Var).mo48790i((Application) this.f55226e.get(i - 1));
        }
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        if (i == 1) {
            return new C20310b(this, C32343x.m95470n0(C10324m.payments_last_operations_list_header, viewGroup, false, 2, (Object) null));
        }
        if (i == 2) {
            return new C20311c(this, C32343x.m95470n0(C10324m.application_history_item, viewGroup, false, 2, (Object) null));
        }
        throw new IllegalStateException("Unknown ViewType");
    }
}
