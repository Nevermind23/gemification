package p621tm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeDetailsUiModel;
import p411em.C12487d;
import p481jm.C16235n;
import p615tg.C17963d;
import ue1.C43075l;

/* renamed from: tm.e */
public final class C17997e extends C1819o {

    /* renamed from: f */
    private final C43075l f51220f;

    /* renamed from: tm.e$a */
    public static final class C17998a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C16235n f51221d;

        /* renamed from: e */
        private final C43075l f51222e;

        /* renamed from: tm.e$a$a */
        public /* synthetic */ class C17999a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f51223a;

            /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|17) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    nm.b[] r0 = p537nm.C17071b.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    nm.b r1 = p537nm.C17071b.STANDARD     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    nm.b r1 = p537nm.C17071b.RECOVER     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    nm.b r1 = p537nm.C17071b.INSTANT     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    nm.b r1 = p537nm.C17071b.SCHOOL     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    nm.b r1 = p537nm.C17071b.STUDENT     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    nm.b r1 = p537nm.C17071b.PAYROLL     // Catch:{ NoSuchFieldError -> 0x003d }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                    r2 = 6
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
                L_0x003d:
                    nm.b r1 = p537nm.C17071b.WISHCARD     // Catch:{ NoSuchFieldError -> 0x0046 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                    r2 = 7
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
                L_0x0046:
                    f51223a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p621tm.C17997e.C17998a.C17999a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17998a(C16235n nVar, C43075l lVar) {
            super(nVar.mo3946b());
            C41536l.m120489i(nVar, "binding");
            C41536l.m120489i(lVar, "onClick");
            this.f51221d = nVar;
            this.f51222e = lVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m61980j(C17998a aVar, CardApplicationTypeDetailsUiModel cardApplicationTypeDetailsUiModel, View view) {
            C41536l.m120489i(aVar, "this$0");
            C41536l.m120489i(cardApplicationTypeDetailsUiModel, "$item");
            aVar.f51222e.invoke(cardApplicationTypeDetailsUiModel);
        }

        /* renamed from: i */
        public final void mo45692i(CardApplicationTypeDetailsUiModel cardApplicationTypeDetailsUiModel) {
            int i;
            C41536l.m120489i(cardApplicationTypeDetailsUiModel, "item");
            AppCompatImageView appCompatImageView = this.f51221d.f45924e;
            switch (C17999a.f51223a[cardApplicationTypeDetailsUiModel.mo39368g().ordinal()]) {
                case 1:
                    i = C12487d.f37161c;
                    break;
                case 2:
                    i = C12487d.f37165m;
                    break;
                case 3:
                    i = C12487d.icons_24_payment_category_travel;
                    break;
                case 4:
                    i = C12487d.icons_24_smile;
                    break;
                case 5:
                    i = C12487d.icons_24_loan_education;
                    break;
                case 6:
                    i = C12487d.icons_24_general_user_business_fill;
                    break;
                case 7:
                    i = C12487d.ic_wish_star;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            appCompatImageView.setImageResource(i);
            this.f51221d.f45926g.setTitle(C32343x.m95388F(cardApplicationTypeDetailsUiModel.mo39363d(), new Object[0]));
            this.f51221d.f45926g.setText(C32343x.m95388F(cardApplicationTypeDetailsUiModel.mo39367f(), new Object[0]));
            this.f51221d.f45925f.setEnabled(cardApplicationTypeDetailsUiModel.mo39369h());
            this.f51221d.f45925f.setFocusable(cardApplicationTypeDetailsUiModel.mo39369h());
            this.f51221d.f45925f.setOnClickListener(new C17996d(this, cardApplicationTypeDetailsUiModel));
            ProgressBar progressBar = this.f51221d.f45927h;
            C41536l.m120488h(progressBar, "binding.loader");
            C32343x.m95483r1(progressBar, cardApplicationTypeDetailsUiModel.mo39371i(), false, 2, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17997e(C43075l lVar) {
        super(C17963d.f51158a.mo45633d());
        C41536l.m120489i(lVar, "onClick");
        this.f51220f = lVar;
    }

    /* renamed from: k */
    public void onBindViewHolder(C17998a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        aVar.mo45692i((CardApplicationTypeDetailsUiModel) g);
    }

    /* renamed from: l */
    public C17998a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C16235n d = C16235n.m57875d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …      false\n            )");
        return new C17998a(d, this.f51220f);
    }
}
