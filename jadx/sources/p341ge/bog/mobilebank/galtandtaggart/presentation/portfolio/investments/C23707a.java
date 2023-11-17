package p341ge.bog.mobilebank.galtandtaggart.presentation.portfolio.investments;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import b41.C31128a;
import com.github.mikephil.charting.charts.LineChart;
import ie0.C25190j;
import ig0.C25195c;
import ig0.C25196d;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.thumbnailgrouptext.ThumbnailGroupTextView;
import p341ge.bog.mobilebank.galtandtaggart.presentation.portfolio.investments.GTMyInvestmentsViewModel$ViewModel;
import p615tg.C17963d;
import ue0.C28757v0;
import ug0.C28775a;
import ug0.C28794g;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.portfolio.investments.a */
public final class C23707a extends C1819o implements C28775a {

    /* renamed from: f */
    private final C28775a.C28776a f61762f = new C28775a.C28776a((List) null, (List) null, (List) null, false, (Context) null, (LineChart) null, (String) null, C11051p3.f31760d, (DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C23708a f61763g;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.portfolio.investments.a$a */
    public interface C23708a {
        /* renamed from: U */
        void mo60565U(String str);
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.portfolio.investments.a$b */
    public final class C23709b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C28757v0 f61764d;

        /* renamed from: e */
        final /* synthetic */ C23707a f61765e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23709b(C23707a aVar, C28757v0 v0Var) {
            super(v0Var.mo3946b());
            C41536l.m120489i(v0Var, "binding");
            this.f61765e = aVar;
            this.f61764d = v0Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m76590j(C23707a aVar, GTMyInvestmentsViewModel$ViewModel.C23703f fVar, View view) {
            C41536l.m120489i(aVar, "this$0");
            C41536l.m120489i(fVar, "$item");
            C23708a k = aVar.f61763g;
            if (k != null) {
                k.mo60565U(fVar.mo60596a().mo69790g());
            }
        }

        /* renamed from: i */
        public final void mo60608i(GTMyInvestmentsViewModel$ViewModel.C23703f fVar) {
            Image.Url url;
            C41536l.m120489i(fVar, "item");
            ThumbnailGroupTextView thumbnailGroupTextView = this.f61764d.f73493e;
            String c = fVar.mo60596a().mo69785c();
            if (c != null) {
                url = new Image.Url(c, (Image.Placeholder) null, (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 126, (DefaultConstructorMarker) null);
            } else {
                url = null;
            }
            thumbnailGroupTextView.setIcon(url);
            thumbnailGroupTextView.setTopLeftTitle(fVar.mo60596a().mo69789f());
            thumbnailGroupTextView.setTopLeftText(fVar.mo60596a().mo69790g());
            thumbnailGroupTextView.setTopRightTitle(thumbnailGroupTextView.getContext().getString(C25190j.gt_portfolio_my_investments_share_count, new Object[]{fVar.mo60596a().mo69786d().toString()}));
            thumbnailGroupTextView.setTopRightText(fVar.mo60596a().mo69787e());
            thumbnailGroupTextView.setBottomLeftText(C28794g.m88258a(fVar.mo60596a().mo69783a(), fVar.mo60596a().mo69784b()));
            thumbnailGroupTextView.setBottomLeftTextColor(C25196d.m80258b(fVar.mo60596a().mo69783a()));
            thumbnailGroupTextView.setBottomRightText(C28794g.m88258a(fVar.mo60596a().mo69791h(), fVar.mo60596a().mo69793i()));
            thumbnailGroupTextView.setBottomRightTextColor(C25196d.m80258b(fVar.mo60596a().mo69791h()));
            this.f61764d.f73493e.setOnClickListener(new C25195c(this.f61765e, fVar));
        }
    }

    public C23707a() {
        super(C17963d.f51158a.mo45633d());
    }

    /* renamed from: l */
    private final Integer m76582l(String str) {
        int itemCount = getItemCount();
        if (itemCount < 0) {
            return null;
        }
        int i = 0;
        while (!C41536l.m120484d(((GTMyInvestmentsViewModel$ViewModel.C23703f) mo6027g(i)).mo60596a().mo69790g(), str)) {
            if (i == itemCount) {
                return null;
            }
            i++;
        }
        return Integer.valueOf(i);
    }

    /* renamed from: H0 */
    public C28775a.C28776a mo60603H0() {
        return this.f61762f;
    }

    /* renamed from: m */
    public void onBindViewHolder(C23709b bVar, int i) {
        C41536l.m120489i(bVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        bVar.mo60608i((GTMyInvestmentsViewModel$ViewModel.C23703f) g);
    }

    /* renamed from: n */
    public C23709b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C28757v0 d = C28757v0.m88160d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …rent, false\n            )");
        return new C23709b(this, d);
    }

    /* renamed from: o */
    public final void mo60606o(String str, C31128a aVar) {
        C41536l.m120489i(str, "symbol");
        C41536l.m120489i(aVar, "result");
        Integer l = m76582l(str);
        if (l != null) {
            notifyItemChanged(l.intValue());
        }
    }

    /* renamed from: p */
    public final void mo60607p(C23708a aVar) {
        C41536l.m120489i(aVar, "listener");
        this.f61763g = aVar;
    }
}
