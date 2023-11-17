package gs0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lr0.C37129d;
import o31.C37599g;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.normalsteps.NormalStepsView;
import p341ge.bog.mobilebank.loans.presentation.model.OfferedPlanTypesUiModel;
import pr0.C37971v;

/* renamed from: gs0.d */
public final class C36068d extends C1819o {

    /* renamed from: f */
    private final C36071e f87195f;

    /* renamed from: gs0.d$a */
    public static final class C36069a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C37971v f87196d;

        /* renamed from: e */
        private final C36071e f87197e;

        /* renamed from: gs0.d$a$a */
        public /* synthetic */ class C36070a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f87198a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    fs0.c[] r0 = fs0.C32003c.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    fs0.c r1 = fs0.C32003c.NEW_PMT     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    fs0.c r1 = fs0.C32003c.SAME_PMT     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f87198a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: gs0.C36068d.C36069a.C36070a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36069a(C37971v vVar, C36071e eVar) {
            super(vVar.mo3946b());
            C41536l.m120489i(vVar, "binding");
            C41536l.m120489i(eVar, "onPrepaymentItemClicked");
            this.f87196d = vVar;
            this.f87197e = eVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m107313j(C36069a aVar, OfferedPlanTypesUiModel offeredPlanTypesUiModel, View view) {
            C41536l.m120489i(aVar, "this$0");
            C41536l.m120489i(offeredPlanTypesUiModel, "$item");
            aVar.f87197e.mo88786a(offeredPlanTypesUiModel);
        }

        /* renamed from: i */
        public final void mo88790i(OfferedPlanTypesUiModel offeredPlanTypesUiModel) {
            Image.Resource resource;
            C41536l.m120489i(offeredPlanTypesUiModel, "item");
            NormalStepsView normalStepsView = this.f87196d.f91268e;
            normalStepsView.setText(C32343x.m95388F(offeredPlanTypesUiModel.mo74332a(), new Object[0]));
            normalStepsView.setTitle(C32343x.m95388F(offeredPlanTypesUiModel.mo74334d(), new Object[0]));
            int i = C36070a.f87198a[offeredPlanTypesUiModel.mo74333b().ordinal()];
            if (i == 1) {
                resource = new Image.Resource(C37129d.reduction_of_monthly_contribution, (Boolean) null, 2, (DefaultConstructorMarker) null);
            } else if (i != 2) {
                resource = new Image.Resource(C37129d.prepayment_of_contribution, (Boolean) null, 2, (DefaultConstructorMarker) null);
            } else {
                resource = new Image.Resource(C37129d.reduction_of_term, (Boolean) null, 2, (DefaultConstructorMarker) null);
            }
            normalStepsView.setStartIcon(resource);
            this.f87196d.mo3946b().setOnClickListener(new C36067c(this, offeredPlanTypesUiModel));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36068d(C36071e eVar) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(eVar, "onPrepaymentItemClicked");
        this.f87195f = eVar;
    }

    /* renamed from: k */
    public void onBindViewHolder(C36069a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        aVar.mo88790i((OfferedPlanTypesUiModel) g);
    }

    /* renamed from: l */
    public C36069a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C37971v d = C37971v.m111630d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(LayoutInflater.f….context), parent, false)");
        return new C36069a(d, this.f87195f);
    }
}
