package au0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import eu0.C31812a;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import o31.C37599g;
import p341ge.bog.mobilebank.loyaltyprogress.presentation.model.starsguide.StarsGuideUiModel;
import p341ge.bog.mobilebank.loyaltyprogress.presentation.model.starsguide.SubProductUiModel;
import rt0.C38339a;
import rt0.C38340b;
import vt0.C39469f;
import vt0.C39472i;
import vt0.C39473j;

/* renamed from: au0.c */
public final class C31072c extends C1819o {

    /* renamed from: au0.c$a */
    public final class C31073a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C39469f f77268d;

        /* renamed from: e */
        final /* synthetic */ C31072c f77269e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31073a(C31072c cVar, C39469f fVar) {
            super(fVar.mo3946b());
            C41536l.m120489i(fVar, "binding");
            this.f77269e = cVar;
            this.f77268d = fVar;
        }

        /* renamed from: i */
        private final void m92490i(StarsGuideUiModel starsGuideUiModel) {
            int i;
            LayoutInflater from = LayoutInflater.from(this.f77268d.mo3946b().getContext());
            C39473j d = C39473j.m114748d(from);
            C41536l.m120488h(d, "inflate(\n                inflater\n            )");
            d.f93919e.setVisibility(0);
            List<SubProductUiModel> a = starsGuideUiModel.mo75402a();
            if (a == null) {
                a = C41341q.m119907j();
            }
            for (SubProductUiModel subProductUiModel : a) {
                C39472i d2 = C39472i.m114744d(from, d.f93919e, false);
                C41536l.m120488h(d2, "inflate(\n               …  false\n                )");
                d2.f93917g.setText(subProductUiModel.mo75419b());
                Context context = this.f77268d.mo3946b().getContext();
                if (subProductUiModel.mo75420d().mo63390c()) {
                    i = C38339a.f91920h;
                } else {
                    i = C38339a.f91914b;
                }
                int c = C0767a.m2893c(context, i);
                d2.f93917g.setTextColor(c);
                d2.f93916f.setTextColor(c);
                d2.f93915e.setImageTintList(ColorStateList.valueOf(c));
                AppCompatTextView appCompatTextView = d2.f93916f;
                int a2 = subProductUiModel.mo75418a();
                appCompatTextView.setText("+" + a2);
                d.f93919e.addView(d2.mo3946b());
            }
            this.f77268d.f93900e.setBottomItemView(d.mo3946b());
        }

        /* renamed from: h */
        public final void mo71276h(StarsGuideUiModel starsGuideUiModel) {
            C41536l.m120489i(starsGuideUiModel, "product");
            if (starsGuideUiModel.mo75403b().mo63390c()) {
                m92490i(starsGuideUiModel);
            }
            this.f77268d.f93902g.setTitle(starsGuideUiModel.mo75404d());
            this.f77268d.f93902g.setText(starsGuideUiModel.mo75406e());
            int c = C0767a.m2893c(this.f77268d.mo3946b().getContext(), C38339a.f91920h);
            int c2 = C0767a.m2893c(this.f77268d.mo3946b().getContext(), C38339a.f91914b);
            if (starsGuideUiModel.mo75410h().mo63390c()) {
                this.f77268d.f93902g.setEnabled(true);
                this.f77268d.f93901f.setImageResource(C38340b.f91927o);
                this.f77268d.f93901f.setImageTintList(ColorStateList.valueOf(c));
            } else {
                this.f77268d.f93902g.setEnabled(false);
                C31812a f = starsGuideUiModel.mo75408f();
                if (f != null) {
                    this.f77268d.f93901f.setImageResource(f.mo72252c());
                }
                this.f77268d.f93901f.setImageTintList(ColorStateList.valueOf(c2));
            }
            if (starsGuideUiModel.mo75403b().mo63390c()) {
                this.f77268d.f93905j.setVisibility(8);
                return;
            }
            this.f77268d.f93905j.setVisibility(0);
            AppCompatTextView appCompatTextView = this.f77268d.f93904i;
            int g = starsGuideUiModel.mo75409g();
            appCompatTextView.setText("+ " + g);
            if (starsGuideUiModel.mo75410h().mo63390c()) {
                this.f77268d.f93903h.setImageTintList(ColorStateList.valueOf(c));
                this.f77268d.f93904i.setTextColor(c);
                return;
            }
            this.f77268d.f93903h.setImageTintList(ColorStateList.valueOf(c2));
            this.f77268d.f93904i.setTextColor(c2);
        }
    }

    public C31072c() {
        super(C37599g.f90345a.mo90787d());
    }

    /* renamed from: k */
    public void onBindViewHolder(C31073a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        aVar.mo71276h((StarsGuideUiModel) g);
    }

    /* renamed from: l */
    public C31073a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C39469f d = C39469f.m114733d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …rent, false\n            )");
        return new C31073a(this, d);
    }
}
