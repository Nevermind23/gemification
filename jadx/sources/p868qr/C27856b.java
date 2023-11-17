package p868qr;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.C1314o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.InsuranceProviderUiModel;
import p366bk.C10316e;
import p366bk.C10329r;
import p642vh.C18368l;
import p90.C27385o5;

/* renamed from: qr.b */
public final class C27856b extends RecyclerView.C1736h {

    /* renamed from: d */
    private final List f70983d;

    /* renamed from: qr.b$a */
    public final class C27857a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C27385o5 f70984d;

        /* renamed from: e */
        final /* synthetic */ C27856b f70985e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27857a(C27856b bVar, C27385o5 o5Var) {
            super(o5Var.mo3946b());
            C41536l.m120489i(o5Var, "binding");
            this.f70985e = bVar;
            this.f70984d = o5Var;
            m86072o();
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m86067j(C27856b bVar, C27857a aVar, View view) {
            C41536l.m120489i(bVar, "this$0");
            C41536l.m120489i(aVar, "this$1");
            bVar.m86062g(aVar.getAdapterPosition());
        }

        /* renamed from: k */
        private final void m86068k(AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, boolean z) {
            int i;
            int i2;
            if (z) {
                i = C10329r.f28976w;
            } else {
                i = C10329r.TextCaption2Primary150Left;
            }
            C1314o.m4575q(appCompatTextView2, i);
            Context context = appCompatTextView2.getContext();
            C41536l.m120488h(context, "context");
            appCompatTextView2.setTextColor(C18368l.m62755d(context, C10316e.f28609l));
            if (z) {
                i2 = C10329r.TextCaption1Black400Left;
            } else {
                i2 = C10329r.TextCaption1Black150Left;
            }
            C1314o.m4575q(appCompatTextView, i2);
            Context context2 = appCompatTextView.getContext();
            C41536l.m120488h(context2, "context");
            appCompatTextView.setTextColor(C18368l.m62755d(context2, C10316e.f28611o));
        }

        /* renamed from: l */
        private final void m86069l(AppCompatTextView appCompatTextView, boolean z, boolean z2) {
            int i;
            if (z || z2) {
                i = C10329r.f28977y;
            } else {
                i = C10329r.TextH4Black150Left;
            }
            C1314o.m4575q(appCompatTextView, i);
            Context context = appCompatTextView.getContext();
            C41536l.m120488h(context, "context");
            appCompatTextView.setTextColor(C18368l.m62755d(context, C10316e.f28611o));
        }

        /* renamed from: m */
        private final void m86070m(boolean z, boolean z2) {
            C27385o5 o5Var = this.f70984d;
            AppCompatTextView appCompatTextView = o5Var.f69471k;
            C41536l.m120488h(appCompatTextView, "lifeInsuranceLabel");
            AppCompatTextView appCompatTextView2 = o5Var.f69472l;
            C41536l.m120488h(appCompatTextView2, "lifeInsuranceValue");
            m86068k(appCompatTextView, appCompatTextView2, z);
            AppCompatTextView appCompatTextView3 = o5Var.f69467g;
            C41536l.m120488h(appCompatTextView3, "creditInsuranceLabel");
            AppCompatTextView appCompatTextView4 = o5Var.f69468h;
            C41536l.m120488h(appCompatTextView4, "creditInsuranceValue");
            m86068k(appCompatTextView3, appCompatTextView4, z2);
            AppCompatTextView appCompatTextView5 = o5Var.f69473m;
            C41536l.m120488h(appCompatTextView5, "providerTitle");
            m86069l(appCompatTextView5, z, z2);
        }

        /* renamed from: n */
        private final void m86071n(InsuranceProviderUiModel insuranceProviderUiModel) {
            boolean z;
            boolean z2;
            this.f70984d.f69473m.setText(insuranceProviderUiModel.mo49829e());
            Group group = this.f70984d.f69470j;
            C41536l.m120488h(group, "binding.lifeInsuranceGroup");
            String d = insuranceProviderUiModel.mo49827d();
            if (d == null || C40439w.m117118v(d)) {
                z = true;
            } else {
                z = false;
            }
            C32343x.m95483r1(group, !z, false, 2, (Object) null);
            Group group2 = this.f70984d.f69466f;
            C41536l.m120488h(group2, "binding.creditInsuranceGroup");
            String a = insuranceProviderUiModel.mo49825a();
            if (a == null || C40439w.m117118v(a)) {
                z2 = true;
            } else {
                z2 = false;
            }
            C32343x.m95483r1(group2, !z2, false, 2, (Object) null);
            AppCompatTextView appCompatTextView = this.f70984d.f69472l;
            String d2 = insuranceProviderUiModel.mo49827d();
            String str = "";
            if (d2 == null) {
                d2 = str;
            }
            appCompatTextView.setText(d2);
            AppCompatTextView appCompatTextView2 = this.f70984d.f69468h;
            String a2 = insuranceProviderUiModel.mo49825a();
            if (a2 != null) {
                str = a2;
            }
            appCompatTextView2.setText(str);
            m86070m(insuranceProviderUiModel.mo49835i(), insuranceProviderUiModel.mo49832g());
        }

        /* renamed from: o */
        private final void m86072o() {
            this.f70984d.f69471k.setText(C32343x.m95388F("offers.loan.details.life.insurance.fee.label", new Object[0]));
            this.f70984d.f69467g.setText(C32343x.m95388F("offers.loan.details.payment.insurance.fee.label", new Object[0]));
        }

        /* renamed from: i */
        public final void mo67373i(InsuranceProviderUiModel insuranceProviderUiModel) {
            C41536l.m120489i(insuranceProviderUiModel, "provider");
            m86071n(insuranceProviderUiModel);
            this.f70984d.f69469i.setEnabled(insuranceProviderUiModel.mo49833h());
            this.f70984d.f69469i.setChecked(insuranceProviderUiModel.mo49831f());
            if (insuranceProviderUiModel.mo49833h()) {
                this.itemView.setOnClickListener(new C27855a(this.f70985e, this));
            } else {
                this.itemView.setOnClickListener((View.OnClickListener) null);
            }
        }
    }

    public C27856b(List list) {
        C41536l.m120489i(list, "items");
        this.f70983d = list;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final void m86062g(int i) {
        boolean z;
        int i2 = 0;
        for (Object next : this.f70983d) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C41341q.m119917t();
            }
            InsuranceProviderUiModel insuranceProviderUiModel = (InsuranceProviderUiModel) next;
            if (i2 == i) {
                z = true;
            } else {
                z = false;
            }
            insuranceProviderUiModel.mo49836j(z);
            i2 = i3;
        }
        notifyDataSetChanged();
    }

    public int getItemCount() {
        return this.f70983d.size();
    }

    /* renamed from: h */
    public final InsuranceProviderUiModel mo67370h() {
        Object obj;
        Iterator it = this.f70983d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((InsuranceProviderUiModel) obj).mo49831f()) {
                break;
            }
        }
        return (InsuranceProviderUiModel) obj;
    }

    /* renamed from: i */
    public void onBindViewHolder(C27857a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        InsuranceProviderUiModel insuranceProviderUiModel = (InsuranceProviderUiModel) C41358y.m120010Z(this.f70983d, i);
        if (insuranceProviderUiModel != null) {
            aVar.mo67373i(insuranceProviderUiModel);
        }
    }

    /* renamed from: j */
    public C27857a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C27385o5 d = C27385o5.m84845d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …rent, false\n            )");
        return new C27857a(this, d);
    }
}
