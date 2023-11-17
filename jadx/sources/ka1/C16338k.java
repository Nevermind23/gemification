package ka1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import gb1.C32364b;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.radiobutton.RadioButtonView;
import p341ge.bog.sso_client.models.RelatedCompany;
import p615tg.C17963d;
import ua1.C28648i;
import ue1.C43079p;

/* renamed from: ka1.k */
public final class C16338k extends C1819o {

    /* renamed from: f */
    private C32364b f46165f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f46166g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f46167h;

    /* renamed from: i */
    private final C16340b f46168i = new C16340b(this);

    /* renamed from: ka1.k$a */
    public static final class C16339a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C28648i f46169d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16339a(C28648i iVar, C43079p pVar) {
            super(iVar.mo3946b());
            C41536l.m120489i(iVar, "binding");
            C41536l.m120489i(pVar, "checkedChangeListener");
            this.f46169d = iVar;
            this.itemView.setOnClickListener(new C16336i(this));
            iVar.f72759g.setOnCheckedChangeListener(new C16337j(pVar, this));
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m58139j(C16339a aVar, View view) {
            C41536l.m120489i(aVar, "this$0");
            aVar.f46169d.f72759g.setChecked(true);
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static final void m58140k(C43079p pVar, C16339a aVar, CompoundButton compoundButton, boolean z) {
            C41536l.m120489i(pVar, "$checkedChangeListener");
            C41536l.m120489i(aVar, "this$0");
            pVar.invoke(Integer.valueOf(aVar.getAdapterPosition()), Boolean.valueOf(z));
        }

        /* renamed from: l */
        public final C28648i mo43311l() {
            return this.f46169d;
        }
    }

    /* renamed from: ka1.k$b */
    public static final class C16340b implements C43079p {

        /* renamed from: d */
        final /* synthetic */ C16338k f46170d;

        C16340b(C16338k kVar) {
            this.f46170d = kVar;
        }

        /* renamed from: a */
        public void mo43312a(int i, boolean z) {
            if (!this.f46170d.f46167h && z) {
                int k = this.f46170d.f46166g;
                this.f46170d.f46166g = i;
                this.f46170d.notifyItemChanged(k);
                this.f46170d.notifyItemChanged(i);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo43312a(((Number) obj).intValue(), ((Boolean) obj2).booleanValue());
            return C41238w.f97225a;
        }
    }

    public C16338k(C32364b bVar) {
        super(C17963d.f51158a.mo45633d());
        this.f46165f = bVar;
    }

    /* renamed from: n */
    public final RelatedCompany mo43308n() {
        if (getItemCount() > 0) {
            return (RelatedCompany) mo6027g(this.f46166g);
        }
        return null;
    }

    /* renamed from: o */
    public void onBindViewHolder(C16339a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        boolean z = true;
        this.f46167h = true;
        RadioButtonView radioButtonView = aVar.mo43311l().f72759g;
        if (i != this.f46166g) {
            z = false;
        }
        radioButtonView.setChecked(z);
        this.f46167h = false;
        RelatedCompany relatedCompany = (RelatedCompany) mo6027g(i);
        aVar.mo43311l().f72758f.setText(relatedCompany.mo88301d());
        C32364b bVar = this.f46165f;
        if (bVar != null) {
            AppCompatImageView appCompatImageView = aVar.mo43311l().f72757e;
            C41536l.m120488h(appCompatImageView, "holder.binding.companyIcon");
            C32364b.C32365a.m95602a(bVar, appCompatImageView, relatedCompany.mo88299a(), 0, 4, (Object) null);
        }
    }

    /* renamed from: p */
    public C16339a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C28648i d = C28648i.m87697d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …rent, false\n            )");
        return new C16339a(d, this.f46168i);
    }
}
