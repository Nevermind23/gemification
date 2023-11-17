package p341ge.bog.mobilebank.categorypackages.presentation.application.result;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import o31.C37599g;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p341ge.bog.designsystem.components.pagestate.PageStateType;
import p341ge.bog.mobilebank.categorypackages.presentation.application.result.C14507c;
import p341ge.bog.mobilebank.categorypackages.presentation.application.result.model.DetailsItem;
import p413eo.C12767r0;
import p413eo.C12775v0;
import p413eo.C12777w0;
import p609so.C17904b;

/* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.result.b */
public final class C14503b extends C1819o {

    /* renamed from: f */
    private final C14504a f42331f;

    /* renamed from: g */
    public PageStateType f42332g;

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.result.b$a */
    public interface C14504a {
        void invoke();
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.result.b$b */
    public static final class C14505b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C12775v0 f42333d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14505b(C12775v0 v0Var) {
            super(v0Var.mo3946b());
            C41536l.m120489i(v0Var, "binding");
            this.f42333d = v0Var;
        }

        /* renamed from: h */
        public final void mo40721h(C14507c.C14508a aVar) {
            C41536l.m120489i(aVar, "data");
            C12775v0 v0Var = this.f42333d;
            v0Var.f37879e.removeAllViews();
            for (DetailsItem detailsItem : aVar.mo40724b()) {
                C12767r0 d = C12767r0.m48467d(LayoutInflater.from(this.itemView.getContext()), v0Var.f37879e, true);
                if (detailsItem instanceof DetailsItem.DetailHeader) {
                    TwoLineTextItem twoLineTextItem = d.f37842f;
                    C41536l.m120488h(twoLineTextItem, "detailsComponent");
                    C32343x.m95455i0(twoLineTextItem);
                    View view = d.f37843g;
                    C41536l.m120488h(view, "divider");
                    C32343x.m95455i0(view);
                    EmptyWidget emptyWidget = d.f37844h;
                    C41536l.m120488h(emptyWidget, "title");
                    C32343x.m95447f1(emptyWidget);
                    d.f37844h.setTitle(((DetailsItem.DetailHeader) detailsItem).mo40746a());
                } else if (detailsItem instanceof DetailsItem.DetailsKeyValue) {
                    TwoLineTextItem twoLineTextItem2 = d.f37842f;
                    C41536l.m120488h(twoLineTextItem2, "detailsComponent");
                    C32343x.m95447f1(twoLineTextItem2);
                    EmptyWidget emptyWidget2 = d.f37844h;
                    C41536l.m120488h(emptyWidget2, "title");
                    C32343x.m95455i0(emptyWidget2);
                    TwoLineTextItem twoLineTextItem3 = d.f37842f;
                    DetailsItem.DetailsKeyValue detailsKeyValue = (DetailsItem.DetailsKeyValue) detailsItem;
                    twoLineTextItem3.setTitle(detailsKeyValue.mo40756a());
                    twoLineTextItem3.setText(detailsKeyValue.mo40757b());
                    View view2 = d.f37843g;
                    C41536l.m120488h(view2, "divider");
                    C32343x.m95483r1(view2, !C41536l.m120484d(C41358y.m120019i0(aVar.mo40724b()), detailsItem), false, 2, (Object) null);
                }
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.result.b$c */
    public static final class C14506c extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C12777w0 f42334d;

        /* renamed from: e */
        private final C14504a f42335e;

        /* renamed from: f */
        private final PageStateType f42336f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14506c(C12777w0 w0Var, C14504a aVar, PageStateType pageStateType) {
            super(w0Var.mo3946b());
            C41536l.m120489i(w0Var, "binding");
            C41536l.m120489i(aVar, "onButtonClick");
            C41536l.m120489i(pageStateType, "status");
            this.f42334d = w0Var;
            this.f42335e = aVar;
            this.f42336f = pageStateType;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m53614j(C14506c cVar, View view) {
            C41536l.m120489i(cVar, "this$0");
            cVar.f42335e.invoke();
        }

        /* renamed from: i */
        public final void mo40722i(C14507c.C14509b bVar) {
            String str;
            C41536l.m120489i(bVar, "data");
            Button button = this.f42334d.f37886f;
            if (this.f42336f instanceof PageStateType.Warning) {
                str = C32343x.m95388F("packages.application.result.pending.button.label", new Object[0]);
            } else {
                str = C32343x.m95388F("packages.application.result.success.button.label", new Object[0]);
            }
            button.setButtonText(str);
            button.setOnClickListener(new C17904b(this));
            PageState pageState = this.f42334d.f37885e;
            pageState.setTitleText(bVar.mo40728b());
            pageState.setPageStateType(bVar.mo40729c());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14503b(C14504a aVar) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(aVar, "onButtonClick");
        this.f42331f = aVar;
    }

    public int getItemViewType(int i) {
        return ((C14507c) mo6026f().get(i)).mo40723a();
    }

    /* renamed from: k */
    public final PageStateType mo40719k() {
        PageStateType pageStateType = this.f42332g;
        if (pageStateType != null) {
            return pageStateType;
        }
        C41536l.m120506z("status");
        return null;
    }

    /* renamed from: l */
    public final void mo40720l(PageStateType pageStateType) {
        C41536l.m120489i(pageStateType, "<set-?>");
        this.f42332g = pageStateType;
    }

    public void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        C41536l.m120489i(f0Var, "holder");
        C14507c cVar = (C14507c) mo6026f().get(i);
        if (f0Var instanceof C14506c) {
            C41536l.m120487g(cVar, "null cannot be cast to non-null type ge.bog.mobilebank.categorypackages.presentation.application.result.ApplicationResultViewType.ResultHeader");
            ((C14506c) f0Var).mo40722i((C14507c.C14509b) cVar);
        } else if (f0Var instanceof C14505b) {
            C41536l.m120487g(cVar, "null cannot be cast to non-null type ge.bog.mobilebank.categorypackages.presentation.application.result.ApplicationResultViewType.ResultDetails");
            ((C14505b) f0Var).mo40721h((C14507c.C14508a) cVar);
        }
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == C14507c.C14510c.Header.ordinal()) {
            C12777w0 d = C12777w0.m48508d(from, viewGroup, false);
            C41536l.m120488h(d, "inflate(layoutInflater, parent, false)");
            return new C14506c(d, this.f42331f, mo40719k());
        } else if (i == C14507c.C14510c.Details.ordinal()) {
            C12775v0 d2 = C12775v0.m48500d(from, viewGroup, false);
            C41536l.m120488h(d2, "inflate(layoutInflater, parent, false)");
            return new C14505b(d2);
        } else {
            throw new IllegalStateException("unknown view type");
        }
    }
}
