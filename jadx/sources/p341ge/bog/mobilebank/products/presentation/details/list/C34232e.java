package p341ge.bog.mobilebank.products.presentation.details.list;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import g91.C32343x;
import hy0.C36272f;
import iy0.C36583b1;
import iy0.C36597g0;
import iy0.C36610k1;
import iy0.C36613l1;
import iy0.C36616m1;
import iy0.C36619n1;
import iy0.C36628q1;
import iy0.C36637t1;
import iy0.C36640u1;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.productcards.AccountCardView;
import p341ge.bog.designsystem.components.productcards.CreditCardView;
import p341ge.bog.designsystem.components.productcards.DepositCardView;
import p341ge.bog.designsystem.components.productcards.GaltCardView;
import p341ge.bog.designsystem.components.productcards.LoanCardView;
import p341ge.bog.designsystem.components.productcards.PiggyBankCardView;
import p341ge.bog.mobilebank.products.presentation.details.list.C34242f;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import pz0.C38058h;
import pz0.C38059i;
import pz0.C38060j;
import pz0.C38061k;
import pz0.C38062l;
import pz0.C38063m;
import pz0.C38064n;
import pz0.C38065o;
import sz0.C38616d;
import ue1.C43064a;
import ue1.C43079p;

/* renamed from: ge.bog.mobilebank.products.presentation.details.list.e */
public final class C34232e extends RecyclerView.C1736h {

    /* renamed from: d */
    private final C43079p f83086d;

    /* renamed from: e */
    private final C43064a f83087e;

    /* renamed from: f */
    private List f83088f = C41341q.m119907j();

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.e$a */
    public final class C34233a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C36597g0 f83089d;

        /* renamed from: e */
        final /* synthetic */ C34232e f83090e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34233a(C34232e eVar, C36597g0 g0Var) {
            super(g0Var.mo3946b());
            C41536l.m120489i(g0Var, "binding");
            this.f83090e = eVar;
            this.f83089d = g0Var;
            g0Var.f88208e.setOnClickListener(new C38059i(eVar, this));
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public static final void m100681i(C34232e eVar, C34233a aVar, View view) {
            C41536l.m120489i(eVar, "this$0");
            C41536l.m120489i(aVar, "this$1");
            eVar.m100678i(aVar.getAdapterPosition());
        }

        /* renamed from: j */
        public final void mo82593j(AccountCardView.C13445a aVar) {
            C41536l.m120489i(aVar, "data");
            this.f83089d.f88208e.setData(aVar);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.e$b */
    public final class C34234b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C36583b1 f83091d;

        /* renamed from: e */
        final /* synthetic */ C34232e f83092e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34234b(C34232e eVar, C36583b1 b1Var) {
            super(b1Var.mo3946b());
            C41536l.m120489i(b1Var, "binding");
            this.f83092e = eVar;
            this.f83091d = b1Var;
        }

        /* renamed from: h */
        public final void mo82594h(String str) {
            C41536l.m120489i(str, "label");
            this.f83091d.mo3946b().setButtonText(str);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.e$c */
    public final class C34235c extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C36610k1 f83093d;

        /* renamed from: e */
        final /* synthetic */ C34232e f83094e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34235c(C34232e eVar, C36610k1 k1Var) {
            super(k1Var.mo3946b());
            C41536l.m120489i(k1Var, "binding");
            this.f83094e = eVar;
            this.f83093d = k1Var;
            k1Var.f88305e.setOnClickListener(new C38060j(eVar, this));
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public static final void m100685i(C34232e eVar, C34235c cVar, View view) {
            C41536l.m120489i(eVar, "this$0");
            C41536l.m120489i(cVar, "this$1");
            eVar.m100678i(cVar.getAdapterPosition());
        }

        /* renamed from: j */
        public final void mo82595j(CreditCardView.C13448a aVar) {
            C41536l.m120489i(aVar, "data");
            this.f83093d.f88305e.setData(aVar);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.e$d */
    public final class C34236d extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C36613l1 f83095d;

        /* renamed from: e */
        final /* synthetic */ C34232e f83096e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34236d(C34232e eVar, C36613l1 l1Var) {
            super(l1Var.mo3946b());
            C41536l.m120489i(l1Var, "binding");
            this.f83096e = eVar;
            this.f83095d = l1Var;
            l1Var.mo3946b().setOnClickListener(new C38061k(eVar, this));
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public static final void m100688i(C34232e eVar, C34236d dVar, View view) {
            C41536l.m120489i(eVar, "this$0");
            C41536l.m120489i(dVar, "this$1");
            eVar.m100678i(dVar.getAdapterPosition());
        }

        /* renamed from: j */
        public final void mo82596j(DepositCardView.C13453a aVar) {
            C41536l.m120489i(aVar, "data");
            this.f83095d.mo3946b().setData(aVar);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.e$e */
    public final class C34237e extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C36616m1 f83097d;

        /* renamed from: e */
        final /* synthetic */ C34232e f83098e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34237e(C34232e eVar, C36616m1 m1Var) {
            super(m1Var.mo3946b());
            C41536l.m120489i(m1Var, "binding");
            this.f83098e = eVar;
            this.f83097d = m1Var;
            m1Var.mo3946b().setOnClickListener(new C38062l(eVar, this));
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public static final void m100691i(C34232e eVar, C34237e eVar2, View view) {
            C41536l.m120489i(eVar, "this$0");
            C41536l.m120489i(eVar2, "this$1");
            eVar.m100678i(eVar2.getAdapterPosition());
        }

        /* renamed from: j */
        public final void mo82597j(GaltCardView.C13460b bVar) {
            C41536l.m120489i(bVar, "data");
            this.f83097d.mo3946b().setData(bVar);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.e$f */
    public final class C34238f extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C36619n1 f83099d;

        /* renamed from: e */
        final /* synthetic */ C34232e f83100e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34238f(C34232e eVar, C36619n1 n1Var) {
            super(n1Var.mo3946b());
            C41536l.m120489i(n1Var, "binding");
            this.f83100e = eVar;
            this.f83099d = n1Var;
            n1Var.mo3946b().setOnClickListener(new C38063m(eVar, this));
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public static final void m100694i(C34232e eVar, C34238f fVar, View view) {
            C41536l.m120489i(eVar, "this$0");
            C41536l.m120489i(fVar, "this$1");
            eVar.m100678i(fVar.getAdapterPosition());
        }

        /* renamed from: j */
        public final void mo82598j(C38616d dVar) {
            C41536l.m120489i(dVar, "data");
            this.f83099d.mo3946b().setData(dVar.mo92262a());
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.e$g */
    public final class C34239g extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C36628q1 f83101d;

        /* renamed from: e */
        final /* synthetic */ C34232e f83102e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34239g(C34232e eVar, C36628q1 q1Var) {
            super(q1Var.mo3946b());
            C41536l.m120489i(q1Var, "binding");
            this.f83102e = eVar;
            this.f83101d = q1Var;
            q1Var.mo3946b().setOnClickListener(new C38064n(eVar, this));
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public static final void m100697i(C34232e eVar, C34239g gVar, View view) {
            C41536l.m120489i(eVar, "this$0");
            C41536l.m120489i(gVar, "this$1");
            eVar.m100678i(gVar.getAdapterPosition());
        }

        /* renamed from: j */
        public final void mo82599j(LoanCardView.C13467c cVar) {
            C41536l.m120489i(cVar, "data");
            this.f83101d.mo3946b().setData(cVar);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.e$h */
    public final class C34240h extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C36637t1 f83103d;

        /* renamed from: e */
        final /* synthetic */ C34232e f83104e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34240h(C34232e eVar, C36637t1 t1Var) {
            super(t1Var.mo3946b());
            C41536l.m120489i(t1Var, "binding");
            this.f83104e = eVar;
            this.f83103d = t1Var;
            t1Var.mo3946b().setOnClickListener(new C38065o(eVar, this));
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public static final void m100700i(C34232e eVar, C34240h hVar, View view) {
            C41536l.m120489i(eVar, "this$0");
            C41536l.m120489i(hVar, "this$1");
            eVar.m100678i(hVar.getAdapterPosition());
        }

        /* renamed from: j */
        public final void mo82600j(PiggyBankCardView.C13471a aVar) {
            C41536l.m120489i(aVar, "data");
            this.f83103d.mo3946b().setData(aVar);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.e$i */
    public final class C34241i extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C36640u1 f83105d;

        /* renamed from: e */
        final /* synthetic */ C34232e f83106e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34241i(C34232e eVar, C36640u1 u1Var) {
            super(u1Var.mo3946b());
            C41536l.m120489i(u1Var, "binding");
            this.f83106e = eVar;
            this.f83105d = u1Var;
        }

        /* renamed from: h */
        public final void mo82601h(C34242f.C34244b bVar) {
            String str;
            C41536l.m120489i(bVar, "item");
            this.f83105d.f88437e.setText(bVar.mo82607b());
            TextView textView = this.f83105d.f88438f;
            StringSource a = bVar.mo82606a();
            if (a instanceof StringSource.Resource) {
                str = C32343x.m95452h0(((StringSource.Resource) bVar.mo82606a()).mo84420b(), new Object[0]);
            } else if (a instanceof StringSource.Dictionary) {
                str = C32343x.m95388F(((StringSource.Dictionary) bVar.mo82606a()).mo84399b(), new Object[0]);
            } else if (a instanceof StringSource.Raw) {
                str = ((StringSource.Raw) bVar.mo82606a()).mo84410b();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            textView.setText(str);
        }

        /* renamed from: i */
        public final void mo82602i(C34242f.C34246d dVar) {
            String str;
            C41536l.m120489i(dVar, "item");
            this.f83105d.f88437e.setText(dVar.mo82607b());
            TextView textView = this.f83105d.f88438f;
            StringSource a = dVar.mo82606a();
            if (a instanceof StringSource.Resource) {
                str = C32343x.m95452h0(((StringSource.Resource) dVar.mo82606a()).mo84420b(), new Object[0]);
            } else if (a instanceof StringSource.Dictionary) {
                str = C32343x.m95388F(((StringSource.Dictionary) dVar.mo82606a()).mo84399b(), new Object[0]);
            } else if (a instanceof StringSource.Raw) {
                str = ((StringSource.Raw) dVar.mo82606a()).mo84410b();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            textView.setText(str);
        }
    }

    public C34232e(C43079p pVar, C43064a aVar) {
        C41536l.m120489i(pVar, "onItemClicked");
        C41536l.m120489i(aVar, "onNewProductClicked");
        this.f83086d = pVar;
        this.f83087e = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final void m100677h(C34232e eVar, View view) {
        C41536l.m120489i(eVar, "this$0");
        eVar.f83087e.invoke();
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final void m100678i(int i) {
        if (this.f83088f.get(i) instanceof C34242f.C34245c) {
            C43079p pVar = this.f83086d;
            Object obj = this.f83088f.get(i);
            C41536l.m120487g(obj, "null cannot be cast to non-null type ge.bog.mobilebank.products.presentation.details.list.ProductListViewModel.ListItem.ProductItem<*>");
            pVar.invoke(Long.valueOf(((C34242f.C34245c) obj).mo82605b()), Integer.valueOf(i));
        }
    }

    public int getItemCount() {
        return this.f83088f.size();
    }

    public int getItemViewType(int i) {
        boolean z;
        C34242f fVar = (C34242f) this.f83088f.get(i);
        if (fVar instanceof C34242f.C34246d) {
            z = true;
        } else {
            z = fVar instanceof C34242f.C34244b;
        }
        if (z) {
            return C36272f.item_product_total_amount;
        }
        if (fVar instanceof C34242f.C34245c) {
            Object obj = this.f83088f.get(i);
            C41536l.m120487g(obj, "null cannot be cast to non-null type ge.bog.mobilebank.products.presentation.details.list.ProductListViewModel.ListItem.ProductItem<*>");
            Object a = ((C34242f.C34245c) obj).mo82604a();
            if (a instanceof AccountCardView.C13445a) {
                return C36272f.item_account_card_wide;
            }
            if (a instanceof CreditCardView.C13448a) {
                return C36272f.item_credit_card_wide;
            }
            if (a instanceof DepositCardView.C13453a) {
                return C36272f.item_deposit_card_wide;
            }
            if (a instanceof LoanCardView.C13467c) {
                return C36272f.item_loan_card_wide;
            }
            if (a instanceof GaltCardView.C13460b) {
                return C36272f.item_galt_card_wide;
            }
            if (a instanceof PiggyBankCardView.C13471a) {
                return C36272f.item_piggy_bank_wide;
            }
            if (a instanceof C38616d) {
                return C36272f.item_gift_cards_wide;
            }
            throw new UnsupportedOperationException("Unknown view type");
        } else if (fVar instanceof C34242f.C34243a) {
            return C36272f.item_add_product_button;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: j */
    public final void mo82592j(List list) {
        C41536l.m120489i(list, C11755a.C11756a.f34100b);
        this.f83088f = list;
        notifyDataSetChanged();
    }

    public void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        C41536l.m120489i(f0Var, "holder");
        int itemViewType = getItemViewType(i);
        if (itemViewType == C36272f.item_product_total_amount) {
            C34242f fVar = (C34242f) this.f83088f.get(i);
            C34241i iVar = null;
            if (fVar instanceof C34242f.C34244b) {
                if (f0Var instanceof C34241i) {
                    iVar = (C34241i) f0Var;
                }
                if (iVar != null) {
                    iVar.mo82601h((C34242f.C34244b) fVar);
                }
            } else if (fVar instanceof C34242f.C34246d) {
                if (f0Var instanceof C34241i) {
                    iVar = (C34241i) f0Var;
                }
                if (iVar != null) {
                    iVar.mo82602i((C34242f.C34246d) fVar);
                }
            }
        } else if (itemViewType == C36272f.item_account_card_wide) {
            Object obj = this.f83088f.get(i);
            C41536l.m120487g(obj, "null cannot be cast to non-null type ge.bog.mobilebank.products.presentation.details.list.ProductListViewModel.ListItem.ProductItem<*>");
            Object a = ((C34242f.C34245c) obj).mo82604a();
            if (a instanceof AccountCardView.C13445a) {
                ((C34233a) f0Var).mo82593j((AccountCardView.C13445a) a);
            }
        } else if (itemViewType == C36272f.item_credit_card_wide) {
            Object obj2 = this.f83088f.get(i);
            C41536l.m120487g(obj2, "null cannot be cast to non-null type ge.bog.mobilebank.products.presentation.details.list.ProductListViewModel.ListItem.ProductItem<*>");
            Object a2 = ((C34242f.C34245c) obj2).mo82604a();
            if (a2 instanceof CreditCardView.C13448a) {
                ((C34235c) f0Var).mo82595j((CreditCardView.C13448a) a2);
            }
        } else if (itemViewType == C36272f.item_deposit_card_wide) {
            Object obj3 = this.f83088f.get(i);
            C41536l.m120487g(obj3, "null cannot be cast to non-null type ge.bog.mobilebank.products.presentation.details.list.ProductListViewModel.ListItem.ProductItem<*>");
            Object a3 = ((C34242f.C34245c) obj3).mo82604a();
            if (a3 instanceof DepositCardView.C13453a) {
                ((C34236d) f0Var).mo82596j((DepositCardView.C13453a) a3);
            }
        } else if (itemViewType == C36272f.item_loan_card_wide) {
            Object obj4 = this.f83088f.get(i);
            C41536l.m120487g(obj4, "null cannot be cast to non-null type ge.bog.mobilebank.products.presentation.details.list.ProductListViewModel.ListItem.ProductItem<*>");
            Object a4 = ((C34242f.C34245c) obj4).mo82604a();
            if (a4 instanceof LoanCardView.C13467c) {
                ((C34239g) f0Var).mo82599j((LoanCardView.C13467c) a4);
            }
        } else if (itemViewType == C36272f.item_galt_card_wide) {
            Object obj5 = this.f83088f.get(i);
            C41536l.m120487g(obj5, "null cannot be cast to non-null type ge.bog.mobilebank.products.presentation.details.list.ProductListViewModel.ListItem.ProductItem<*>");
            Object a5 = ((C34242f.C34245c) obj5).mo82604a();
            if (a5 instanceof GaltCardView.C13460b) {
                ((C34237e) f0Var).mo82597j((GaltCardView.C13460b) a5);
            }
        } else if (itemViewType == C36272f.item_piggy_bank_wide) {
            Object obj6 = this.f83088f.get(i);
            C41536l.m120487g(obj6, "null cannot be cast to non-null type ge.bog.mobilebank.products.presentation.details.list.ProductListViewModel.ListItem.ProductItem<*>");
            Object a6 = ((C34242f.C34245c) obj6).mo82604a();
            if (a6 instanceof PiggyBankCardView.C13471a) {
                ((C34240h) f0Var).mo82600j((PiggyBankCardView.C13471a) a6);
            }
        } else if (itemViewType == C36272f.item_gift_cards_wide) {
            Object obj7 = this.f83088f.get(i);
            C41536l.m120487g(obj7, "null cannot be cast to non-null type ge.bog.mobilebank.products.presentation.details.list.ProductListViewModel.ListItem.ProductItem<*>");
            Object a7 = ((C34242f.C34245c) obj7).mo82604a();
            if (a7 instanceof C38616d) {
                ((C34238f) f0Var).mo82598j((C38616d) a7);
            }
        } else if (itemViewType == C36272f.item_add_product_button) {
            Object obj8 = this.f83088f.get(i);
            C41536l.m120487g(obj8, "null cannot be cast to non-null type ge.bog.mobilebank.products.presentation.details.list.ProductListViewModel.ListItem.AddNewAccountButton");
            ((C34234b) f0Var).mo82594h(((C34242f.C34243a) obj8).mo82603a());
        }
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == C36272f.item_product_total_amount) {
            C36640u1 d = C36640u1.m108696d(from, viewGroup, false);
            C41536l.m120488h(d, "inflate(\n               …lse\n                    )");
            return new C34241i(this, d);
        } else if (i == C36272f.item_add_product_button) {
            C36583b1 d2 = C36583b1.m108458d(from, viewGroup, false);
            d2.mo3946b().setOnClickListener(new C38058h(this));
            C41536l.m120488h(d2, "inflate(\n               …  }\n                    }");
            return new C34234b(this, d2);
        } else if (i == C36272f.item_account_card_wide) {
            C36597g0 d3 = C36597g0.m108516d(from, viewGroup, false);
            C41536l.m120488h(d3, "inflate(\n               …lse\n                    )");
            return new C34233a(this, d3);
        } else if (i == C36272f.item_credit_card_wide) {
            C36610k1 d4 = C36610k1.m108572d(from, viewGroup, false);
            C41536l.m120488h(d4, "inflate(\n               …lse\n                    )");
            return new C34235c(this, d4);
        } else if (i == C36272f.item_deposit_card_wide) {
            C36613l1 d5 = C36613l1.m108585d(from, viewGroup, false);
            C41536l.m120488h(d5, "inflate(\n               …lse\n                    )");
            return new C34236d(this, d5);
        } else if (i == C36272f.item_loan_card_wide) {
            C36628q1 d6 = C36628q1.m108648d(from, viewGroup, false);
            C41536l.m120488h(d6, "inflate(\n               …lse\n                    )");
            return new C34239g(this, d6);
        } else if (i == C36272f.item_galt_card_wide) {
            C36616m1 d7 = C36616m1.m108598d(from, viewGroup, false);
            C41536l.m120488h(d7, "inflate(\n               …lse\n                    )");
            return new C34237e(this, d7);
        } else if (i == C36272f.item_piggy_bank_wide) {
            C36637t1 d8 = C36637t1.m108684d(from, viewGroup, false);
            C41536l.m120488h(d8, "inflate(\n               …lse\n                    )");
            return new C34240h(this, d8);
        } else if (i == C36272f.item_gift_cards_wide) {
            C36619n1 d9 = C36619n1.m108611d(from, viewGroup, false);
            C41536l.m120488h(d9, "inflate(\n               …lse\n                    )");
            return new C34238f(this, d9);
        } else {
            throw new UnsupportedOperationException("Unknown view type");
        }
    }
}
