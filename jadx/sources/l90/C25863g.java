package l90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32303f;
import g91.C32343x;
import h80.C24895c0;
import he1.C41224m;
import he1.C41233s;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import o31.C37599g;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.model.common.ApplicationSalaryInfoUiModel;

/* renamed from: l90.g */
public final class C25863g extends C1819o {

    /* renamed from: l90.g$a */
    public final class C25864a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C24895c0 f65844d;

        /* renamed from: e */
        final /* synthetic */ C25863g f65845e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25864a(C25863g gVar, C24895c0 c0Var) {
            super(c0Var.mo3946b());
            C41536l.m120489i(c0Var, "binding");
            this.f65845e = gVar;
            this.f65844d = c0Var;
        }

        /* renamed from: i */
        private final C41224m m81278i(ApplicationSalaryInfoUiModel applicationSalaryInfoUiModel) {
            BigDecimal bigDecimal;
            String a = applicationSalaryInfoUiModel.mo56171a();
            if (a != null) {
                bigDecimal = new BigDecimal(a);
            } else {
                bigDecimal = null;
            }
            String n = C32303f.m95203n(bigDecimal, applicationSalaryInfoUiModel.mo56173d());
            String e = applicationSalaryInfoUiModel.mo56175e();
            if (e == null && (e = applicationSalaryInfoUiModel.mo56177f()) == null) {
                e = applicationSalaryInfoUiModel.mo56172b();
            }
            return C41233s.m119492a(n, e);
        }

        /* renamed from: h */
        public final C24895c0 mo64654h(ApplicationSalaryInfoUiModel applicationSalaryInfoUiModel) {
            boolean z;
            C41536l.m120489i(applicationSalaryInfoUiModel, "income");
            C25863g gVar = this.f65845e;
            C41224m i = m81278i(applicationSalaryInfoUiModel);
            String str = (String) i.mo95675a();
            String str2 = (String) i.mo95676b();
            C24895c0 c0Var = this.f65844d;
            c0Var.f63908g.setText(C32343x.m95388F(applicationSalaryInfoUiModel.mo56178g(), new Object[0]));
            TextView textView = c0Var.f63909h;
            C41536l.m120488h(textView, "bindData$lambda$2$lambda$1$lambda$0");
            if (str2 == null || C40439w.m117118v(str2)) {
                z = true;
            } else {
                z = false;
            }
            C32343x.m95483r1(textView, true ^ z, false, 2, (Object) null);
            textView.setText(str2);
            c0Var.f63911j.setText(str);
            List f = gVar.mo6026f();
            C41536l.m120488h(f, "currentList");
            if (C41536l.m120484d(C41358y.m120019i0(f), applicationSalaryInfoUiModel)) {
                View view = c0Var.f63906e;
                C41536l.m120488h(view, "divider");
                C32343x.m95455i0(view);
            }
            return c0Var;
        }
    }

    public C25863g() {
        super(C37599g.f90345a.mo90787d());
    }

    /* renamed from: k */
    public void onBindViewHolder(C25864a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object obj = mo6026f().get(i);
        C41536l.m120488h(obj, "currentList[position]");
        aVar.mo64654h((ApplicationSalaryInfoUiModel) obj);
    }

    /* renamed from: l */
    public C25864a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C24895c0 d = C24895c0.m79562d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(LayoutInflater.f….context), parent, false)");
        return new C25864a(this, d);
    }
}
