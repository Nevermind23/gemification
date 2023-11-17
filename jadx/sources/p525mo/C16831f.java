package p525mo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import o31.C37599g;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p341ge.bog.mobilebank.categorypackages.presentation.application.firststage.model.EmailUiModel;
import p356ao.C10110b;
import p413eo.C12757m0;
import p539no.C17132a;

/* renamed from: mo.f */
public final class C16831f extends C1819o {

    /* renamed from: f */
    private final C16833b f47113f;

    /* renamed from: mo.f$a */
    public static final class C16832a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C12757m0 f47114d;

        /* renamed from: e */
        private final C16833b f47115e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16832a(C12757m0 m0Var, C16833b bVar) {
            super(m0Var.mo3946b());
            C41536l.m120489i(m0Var, "binding");
            C41536l.m120489i(bVar, "onEmailClick");
            this.f47114d = m0Var;
            this.f47115e = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m59305j(C16832a aVar, EmailUiModel emailUiModel, View view) {
            C41536l.m120489i(aVar, "this$0");
            C41536l.m120489i(emailUiModel, "$email");
            aVar.f47115e.mo43943a(emailUiModel);
        }

        /* renamed from: i */
        public final void mo43954i(C17132a aVar, boolean z) {
            C41536l.m120489i(aVar, "data");
            C12757m0 m0Var = this.f47114d;
            EmailUiModel a = aVar.mo44550a();
            TwoLineTextItem twoLineTextItem = this.f47114d.f37793f;
            twoLineTextItem.setText(a.mo40655a());
            if (aVar.mo44551b()) {
                twoLineTextItem.setTitle(C32343x.m95388F("packages.application.I.email.list.Asheet.field.selected.header", new Object[0]));
                twoLineTextItem.setTitleColorRes(C10110b.f27905n);
            } else {
                twoLineTextItem.setTitle(C32343x.m95388F("packages.application.I.email.list.Asheet.field.header", new Object[0]));
                twoLineTextItem.setTitleColorRes(C10110b.f27898g);
            }
            this.itemView.setOnClickListener(new C16830e(this, a));
            View view = m0Var.f37792e;
            C41536l.m120488h(view, "divider");
            C32343x.m95483r1(view, !z, false, 2, (Object) null);
        }
    }

    /* renamed from: mo.f$b */
    public interface C16833b {
        /* renamed from: a */
        void mo43943a(EmailUiModel emailUiModel);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16831f(C16833b bVar) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(bVar, "onEmailClick");
        this.f47113f = bVar;
    }

    /* renamed from: k */
    public void onBindViewHolder(C16832a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object obj = mo6026f().get(i);
        C41536l.m120488h(obj, "currentList[position]");
        C17132a aVar2 = (C17132a) obj;
        boolean z = true;
        if (i != getItemCount() - 1) {
            z = false;
        }
        aVar.mo43954i(aVar2, z);
    }

    /* renamed from: l */
    public C16832a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C12757m0 d = C12757m0.m48423d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(LayoutInflater.f….context), parent, false)");
        return new C16832a(d, this.f47113f);
    }
}
