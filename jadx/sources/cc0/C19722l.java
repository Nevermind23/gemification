package cc0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C2379b;
import com.bumptech.glide.C2394j;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.deposits.presentation.model.SavingGoalUiModel;
import p341ge.bog.mobilebank.shared.helper.ImageSource;
import p615tg.C17963d;
import xb0.C29710b0;

/* renamed from: cc0.l */
public final class C19722l extends C1819o {

    /* renamed from: f */
    private final C19720j f54070f;

    /* renamed from: cc0.l$a */
    public static final class C19723a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C29710b0 f54071d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19723a(C29710b0 b0Var) {
            super(b0Var.mo3946b());
            C41536l.m120489i(b0Var, "binding");
            this.f54071d = b0Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m65411j(C19720j jVar, SavingGoalUiModel savingGoalUiModel, View view) {
            C41536l.m120489i(jVar, "$listener");
            C41536l.m120489i(savingGoalUiModel, "$item");
            jVar.mo47924a(savingGoalUiModel);
        }

        /* renamed from: i */
        public final void mo47928i(SavingGoalUiModel savingGoalUiModel, C19720j jVar) {
            C41536l.m120489i(savingGoalUiModel, "item");
            C41536l.m120489i(jVar, "listener");
            this.f54071d.mo3946b().setOnClickListener(new C19721k(jVar, savingGoalUiModel));
            ImageSource b = savingGoalUiModel.mo57864b();
            if (b instanceof ImageSource.Resource) {
                this.f54071d.f74980e.setImageResource(((ImageSource.Resource) savingGoalUiModel.mo57864b()).mo84372a());
            } else if (b instanceof ImageSource.Url) {
                C2394j y = C2379b.m9211u(this.f54071d.f74980e).mo7757y(((ImageSource.Url) savingGoalUiModel.mo57864b()).mo84384d());
                Integer b2 = ((ImageSource.Url) savingGoalUiModel.mo57864b()).mo84383b();
                if (b2 != null) {
                    C41536l.m120488h(y, "it");
                    C2394j jVar2 = (C2394j) y.mo7220c0(b2.intValue());
                }
                Integer a = ((ImageSource.Url) savingGoalUiModel.mo57864b()).mo84382a();
                if (a != null) {
                    C41536l.m120488h(y, "it");
                    C2394j jVar3 = (C2394j) y.mo7232j(a.intValue());
                }
                y.mo7718L0(this.f54071d.f74980e);
            }
            this.f54071d.f74981f.setText(C32343x.m95388F(savingGoalUiModel.mo57863a(), new Object[0]));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19722l(C19720j jVar) {
        super(C17963d.f51158a.mo45633d());
        C41536l.m120489i(jVar, "listener");
        this.f54070f = jVar;
    }

    /* renamed from: k */
    public void onBindViewHolder(C19723a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        aVar.mo47928i((SavingGoalUiModel) g, this.f54070f);
    }

    /* renamed from: l */
    public C19723a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C29710b0 d = C29710b0.m90207d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(LayoutInflater.f….context), parent, false)");
        return new C19723a(d);
    }
}
