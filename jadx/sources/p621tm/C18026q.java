package p621tm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cardapplications.presentation.model.ScoolCardOwnerUiModel;
import p481jm.C16221c0;

/* renamed from: tm.q */
public final class C18026q extends C1819o {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C18027a f51248f;

    /* renamed from: tm.q$a */
    public interface C18027a {
        /* renamed from: a */
        void mo39064a(ScoolCardOwnerUiModel scoolCardOwnerUiModel);
    }

    /* renamed from: tm.q$b */
    public final class C18028b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C16221c0 f51249d;

        /* renamed from: e */
        final /* synthetic */ C18026q f51250e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18028b(C18026q qVar, C16221c0 c0Var) {
            super(c0Var.mo3946b());
            C41536l.m120489i(c0Var, "binding");
            this.f51250e = qVar;
            this.f51249d = c0Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m62030j(C18026q qVar, ScoolCardOwnerUiModel scoolCardOwnerUiModel, View view) {
            C41536l.m120489i(qVar, "this$0");
            C41536l.m120489i(scoolCardOwnerUiModel, "$item");
            C18027a k = qVar.f51248f;
            if (k != null) {
                k.mo39064a(scoolCardOwnerUiModel);
            }
        }

        /* renamed from: i */
        public final void mo45721i(ScoolCardOwnerUiModel scoolCardOwnerUiModel) {
            C41536l.m120489i(scoolCardOwnerUiModel, "item");
            this.f51249d.f45784f.setText(scoolCardOwnerUiModel.mo39860e());
            this.f51249d.mo3946b().setOnClickListener(new C18029r(this.f51250e, scoolCardOwnerUiModel));
        }
    }

    public C18026q() {
        super(C18025p.f51247a);
    }

    /* renamed from: l */
    public void onBindViewHolder(C18028b bVar, int i) {
        C41536l.m120489i(bVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        bVar.mo45721i((ScoolCardOwnerUiModel) g);
    }

    /* renamed from: m */
    public C18028b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C16221c0 d = C16221c0.m57813d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(LayoutInflater.f….context), parent, false)");
        return new C18028b(this, d);
    }

    /* renamed from: n */
    public final void mo45720n(C18027a aVar) {
        C41536l.m120489i(aVar, "listener");
        this.f51248f = aVar;
    }
}
