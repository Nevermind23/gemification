package p341ge.bog.mobilebank.galtandtaggart.presentation.search;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.RecyclerView;
import b41.C31128a;
import com.bumptech.glide.C2379b;
import com.bumptech.glide.C2394j;
import com.github.mikephil.charting.charts.LineChart;
import g91.C32290b1;
import g91.C32335t0;
import g91.C32343x;
import ie0.C25183c;
import ie0.C25185e;
import ie0.C25187g;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import jg0.C25448k;
import jg0.C25449l;
import jg0.C25450m;
import jg0.C25451n;
import jg0.C25452o;
import jg0.C25453p;
import jg0.C25454q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41527d0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o31.C37594d;
import p341ge.bog.designsystem.components.list.TwoLineReverseTextItem;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.mobilebank.galtandtaggart.presentation.search.GTSearchSymbolViewModel$ViewModel;
import ue0.C28714b1;
import ue0.C28717c1;
import ue0.C28723e1;
import ue0.C28763y0;
import ue1.C43075l;
import ue1.C43079p;
import ug0.C28775a;
import xe0.C29753k;
import xe0.C29758p;
import xe0.C29759q;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.search.g */
public final class C23760g extends RecyclerView.C1736h implements C28775a {

    /* renamed from: l */
    public static final C23761a f61842l = new C23761a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Context f61843d;

    /* renamed from: e */
    private final C25454q f61844e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final GTSearchSymbolViewModel$ViewModel f61845f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final BigDecimal f61846g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public List f61847h = C41341q.m119907j();

    /* renamed from: i */
    private final C28775a.C28776a f61848i = new C28775a.C28776a((List) null, (List) null, (List) null, false, (Context) null, (LineChart) null, (String) null, C11051p3.f31760d, (DefaultConstructorMarker) null);

    /* renamed from: j */
    private C43075l f61849j;

    /* renamed from: k */
    private C43079p f61850k;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.search.g$a */
    public static final class C23761a {
        private C23761a() {
        }

        public /* synthetic */ C23761a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.search.g$b */
    public final class C23762b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        final /* synthetic */ C23760g f61851d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23762b(C23760g gVar, C28717c1 c1Var) {
            super(c1Var.mo3946b());
            C41536l.m120489i(c1Var, "binding");
            this.f61851d = gVar;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.search.g$c */
    public final class C23763c extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C28723e1 f61852d;

        /* renamed from: e */
        final /* synthetic */ C23760g f61853e;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.search.g$c$a */
        public static final class C23764a implements Comparator {
            public final int compare(Object obj, Object obj2) {
                return C41506d.m120406e(((C29758p) obj).mo69873b(), ((C29758p) obj2).mo69873b());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23763c(C23760g gVar, C28723e1 e1Var) {
            super(e1Var.mo3946b());
            C41536l.m120489i(e1Var, "binding");
            this.f61853e = gVar;
            this.f61852d = e1Var;
            View findViewById = e1Var.f73214e.findViewById(C25187g.chartView);
            C41536l.m120488h(findViewById, "binding.chartContainer.f…dViewById(R.id.chartView)");
            gVar.mo60677m(false, (LineChart) findViewById, gVar.f61843d);
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public static final void m76732m(C23760g gVar, int i, View view) {
            C41536l.m120489i(gVar, "this$0");
            C43075l k = gVar.mo60675k();
            if (k != null) {
                Object obj = gVar.f61847h.get(i);
                C41536l.m120487g(obj, "null cannot be cast to non-null type ge.bog.mobilebank.galtandtaggart.presentation.search.GTSearchSymbolViewModel.ViewModel.ListItem.SearchItem");
                k.invoke(((GTSearchSymbolViewModel$ViewModel.C23720e.C23722b) obj).mo60633e());
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public static final void m76733n(C23760g gVar, int i, View view) {
            C41536l.m120489i(gVar, "this$0");
            C43075l k = gVar.mo60675k();
            if (k != null) {
                Object obj = gVar.f61847h.get(i);
                C41536l.m120487g(obj, "null cannot be cast to non-null type ge.bog.mobilebank.galtandtaggart.presentation.search.GTSearchSymbolViewModel.ViewModel.ListItem.SearchItem");
                k.invoke(((GTSearchSymbolViewModel$ViewModel.C23720e.C23722b) obj).mo60633e());
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: o */
        public static final void m76734o(C23760g gVar, GTSearchSymbolViewModel$ViewModel.C23720e.C23722b bVar, C23763c cVar, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C41536l.m120489i(gVar, "this$0");
            C41536l.m120489i(bVar, "$ticker");
            C41536l.m120489i(cVar, "this$1");
            C31128a h = bVar.mo60636h();
            C41536l.m120487g(h, "null cannot be cast to non-null type ge.bog.mobilebank.shared.requestedresult.RequestedResult.Success<kotlin.collections.List<ge.bog.mobilebank.galtandtaggart.domain.model.SymbolHistoryDataItem>>");
            List<C29758p> t0 = C41358y.m120030t0((Iterable) ((C31128a.C31131c) h).mo71340a(), new C23764a());
            ArrayList arrayList = new ArrayList(C41343r.m119925u(t0, 10));
            for (C29758p pVar : t0) {
                Date b = pVar.mo69873b();
                String bigDecimal = pVar.mo69872a().toString();
                C41536l.m120488h(bigDecimal, "historyItem.close.toString()");
                arrayList.add(new C29753k(b, bigDecimal));
            }
            gVar.mo60679o(arrayList);
            C41536l.m120488h(view, "v");
            bVar.mo60637i(C37594d.m110560a(view));
            cVar.itemView.post(new C25451n(gVar));
        }

        /* access modifiers changed from: private */
        /* renamed from: p */
        public static final void m76735p(C23760g gVar) {
            C41536l.m120489i(gVar, "this$0");
            gVar.notifyDataSetChanged();
        }

        /* renamed from: l */
        public final void mo60684l(GTSearchSymbolViewModel$ViewModel.C23720e.C23722b bVar, int i) {
            int i2;
            C41536l.m120489i(bVar, "ticker");
            this.f61852d.f73218i.setText(bVar.mo60633e());
            this.f61852d.f73218i.setTitle(bVar.mo60632d());
            this.f61852d.f73220k.setText(bVar.mo60629a());
            this.f61852d.f73220k.setTitle(bVar.mo60635g());
            this.f61852d.f73220k.setHorizontalGravity(8388613);
            TwoLineReverseTextItem twoLineReverseTextItem = this.f61852d.f73220k;
            if (bVar.mo60635g().charAt(0) == '-') {
                i2 = C25183c.f64646h;
            } else {
                i2 = C25183c.f64651m;
            }
            twoLineReverseTextItem.setTitleColorRes(i2);
            ((C2394j) ((C2394j) C2379b.m9210t(this.f61853e.f61843d).mo7757y(bVar.mo60631c()).mo7223d0(C32290b1.m95123m(C0767a.m2895e(this.f61853e.f61843d, C25185e.icons_16_payment_transfer_transfer_treasury), C32335t0.m95357b()))).mo7222d()).mo7718L0(this.f61852d.f73217h);
            this.f61852d.mo3946b().setOnClickListener(new C25448k(this.f61853e, i));
            this.f61852d.f73214e.setOnClickListener(new C25449l(this.f61853e, i));
            boolean z = bVar.mo60636h() instanceof C31128a.C31131c;
            LoadingView loadingView = this.f61852d.f73219j;
            C41536l.m120488h(loadingView, "binding.fullProgressBar");
            C32343x.m95483r1(loadingView, bVar.mo60636h() instanceof C31128a.C31130b, false, 2, (Object) null);
            FrameLayout frameLayout = this.f61852d.f73214e;
            C41536l.m120488h(frameLayout, "binding.chartContainer");
            C32343x.m95483r1(frameLayout, z, false, 2, (Object) null);
            if (!z) {
                this.f61852d.f73216g.notifyDataSetChanged();
                this.f61852d.f73216g.clear();
                this.f61852d.f73215f.setImageDrawable((Drawable) null);
            } else if (bVar.mo60630b() != null) {
                LineChart lineChart = this.f61852d.f73216g;
                C41536l.m120488h(lineChart, "binding.chartView");
                C32343x.m95483r1(lineChart, false, false, 2, (Object) null);
                this.f61852d.f73216g.clear();
                this.f61852d.f73215f.setImageBitmap(bVar.mo60630b());
            } else {
                this.f61852d.f73216g.notifyDataSetChanged();
                this.f61852d.f73216g.addOnLayoutChangeListener(new C25450m(this.f61853e, bVar, this));
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.search.g$d */
    public final class C23765d extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C28763y0 f61854d;

        /* renamed from: e */
        final /* synthetic */ C23760g f61855e;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.search.g$d$a */
        public /* synthetic */ class C23766a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f61856a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    xe0.q[] r0 = xe0.C29759q.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    xe0.q r1 = xe0.C29759q.TO_ADD     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    xe0.q r1 = xe0.C29759q.TO_REMOVE     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f61856a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.galtandtaggart.presentation.search.C23760g.C23765d.C23766a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23765d(C23760g gVar, C28763y0 y0Var) {
            super(y0Var.mo3946b());
            C41536l.m120489i(y0Var, "binding");
            this.f61855e = gVar;
            this.f61854d = y0Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static final void m76739k(C23760g gVar, C23765d dVar, View view) {
            C43075l k;
            C41536l.m120489i(gVar, "this$0");
            C41536l.m120489i(dVar, "this$1");
            int itemCount = gVar.getItemCount();
            int bindingAdapterPosition = dVar.getBindingAdapterPosition();
            boolean z = false;
            if (bindingAdapterPosition >= 0 && bindingAdapterPosition < itemCount) {
                z = true;
            }
            if (z && (k = gVar.mo60675k()) != null) {
                Object obj = gVar.f61847h.get(dVar.getBindingAdapterPosition());
                C41536l.m120487g(obj, "null cannot be cast to non-null type ge.bog.mobilebank.galtandtaggart.presentation.search.GTSearchSymbolViewModel.ViewModel.ListItem.SearchItem");
                k.invoke(((GTSearchSymbolViewModel$ViewModel.C23720e.C23722b) obj).mo60633e());
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public static final void m76740l(C23760g gVar, GTSearchSymbolViewModel$ViewModel.C23720e.C23722b bVar, C29759q qVar, View view) {
            C41536l.m120489i(gVar, "this$0");
            C41536l.m120489i(bVar, "$item");
            C41536l.m120489i(qVar, "$symbolState");
            gVar.f61845f.mo60609Aw(bVar.mo60633e());
            C43079p l = gVar.mo60676l();
            if (l != null) {
                l.invoke(bVar, qVar);
            }
        }

        /* renamed from: j */
        public final void mo60686j(GTSearchSymbolViewModel$ViewModel.C23720e.C23722b bVar) {
            int i;
            C29759q qVar;
            C41536l.m120489i(bVar, "item");
            C28763y0 y0Var = this.f61854d;
            C23760g gVar = this.f61855e;
            y0Var.f73545h.setText(bVar.mo60633e());
            y0Var.f73545h.setTitle(bVar.mo60632d());
            y0Var.f73544g.setText(bVar.mo60629a());
            y0Var.f73544g.setTitle(bVar.mo60635g());
            y0Var.f73544g.setHorizontalGravity(8388613);
            ((C2394j) ((C2394j) C2379b.m9210t(gVar.f61843d).mo7757y(bVar.mo60631c()).mo7223d0(C32290b1.m95123m(C0767a.m2895e(gVar.f61843d, C25185e.icons_16_payment_transfer_transfer_treasury), C32335t0.m95357b()))).mo7222d()).mo7718L0(this.f61854d.f73542e);
            TwoLineReverseTextItem twoLineReverseTextItem = y0Var.f73544g;
            if (bVar.mo60635g().charAt(0) == '-') {
                i = C25183c.f64646h;
            } else {
                i = C25183c.f64651m;
            }
            twoLineReverseTextItem.setTitleColorRes(i);
            if (gVar.f61845f.mo60610Bw(bVar.mo60634f(), gVar.f61846g)) {
                qVar = C29759q.TO_REMOVE;
            } else {
                qVar = C29759q.TO_ADD;
            }
            int i2 = C23766a.f61856a[qVar.ordinal()];
            if (i2 == 1) {
                y0Var.f73543f.setImageDrawable(gVar.f61843d.getDrawable(C25185e.f64660o));
            } else if (i2 == 2) {
                y0Var.f73543f.setImageDrawable(gVar.f61843d.getDrawable(C25185e.f64659n));
            }
            this.f61854d.mo3946b().setOnClickListener(new C25452o(gVar, this));
            y0Var.f73543f.setOnClickListener(new C25453p(gVar, bVar, qVar));
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.search.g$e */
    public final class C23767e extends RecyclerView.C1734f0 {

        /* renamed from: d */
        final /* synthetic */ C23760g f61857d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23767e(C23760g gVar, C28714b1 b1Var) {
            super(b1Var.mo3946b());
            C41536l.m120489i(b1Var, "binding");
            this.f61857d = gVar;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.search.g$f */
    public /* synthetic */ class C23768f {

        /* renamed from: a */
        public static final /* synthetic */ int[] f61858a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                jg0.q[] r0 = jg0.C25454q.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                jg0.q r1 = jg0.C25454q.CHART     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                jg0.q r1 = jg0.C25454q.STAR     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f61858a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.galtandtaggart.presentation.search.C23760g.C23768f.<clinit>():void");
        }
    }

    public C23760g(Context context, C25454q qVar, GTSearchSymbolViewModel$ViewModel gTSearchSymbolViewModel$ViewModel, BigDecimal bigDecimal) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(qVar, "searchType");
        C41536l.m120489i(gTSearchSymbolViewModel$ViewModel, "viewModel");
        this.f61843d = context;
        this.f61844e = qVar;
        this.f61845f = gTSearchSymbolViewModel$ViewModel;
        this.f61846g = bigDecimal;
    }

    /* renamed from: s */
    public static /* synthetic */ void m76716s(C23760g gVar, List list, Runnable runnable, int i, Object obj) {
        if ((i & 2) != 0) {
            runnable = null;
        }
        gVar.mo60682r(list, runnable);
    }

    /* renamed from: H0 */
    public C28775a.C28776a mo60603H0() {
        return this.f61848i;
    }

    public int getItemCount() {
        return this.f61847h.size();
    }

    public int getItemViewType(int i) {
        GTSearchSymbolViewModel$ViewModel.C23720e eVar = (GTSearchSymbolViewModel$ViewModel.C23720e) this.f61847h.get(i);
        if (C41536l.m120484d(eVar, GTSearchSymbolViewModel$ViewModel.C23720e.C23723c.f61796a)) {
            return 2;
        }
        if (C41536l.m120484d(eVar, GTSearchSymbolViewModel$ViewModel.C23720e.C23721a.f61787a)) {
            return 3;
        }
        if (eVar instanceof GTSearchSymbolViewModel$ViewModel.C23720e.C23722b) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: j */
    public final GTSearchSymbolViewModel$ViewModel.C23720e.C23722b mo60674j(int i) {
        List list = this.f61847h;
        if (list.size() <= i || i < 0 || !(list.get(i) instanceof GTSearchSymbolViewModel$ViewModel.C23720e.C23722b)) {
            return null;
        }
        Object obj = list.get(i);
        C41536l.m120487g(obj, "null cannot be cast to non-null type ge.bog.mobilebank.galtandtaggart.presentation.search.GTSearchSymbolViewModel.ViewModel.ListItem.SearchItem");
        return (GTSearchSymbolViewModel$ViewModel.C23720e.C23722b) obj;
    }

    /* renamed from: k */
    public final C43075l mo60675k() {
        return this.f61849j;
    }

    /* renamed from: l */
    public final C43079p mo60676l() {
        return this.f61850k;
    }

    /* renamed from: m */
    public void mo60677m(boolean z, LineChart lineChart, Context context) {
        C28775a.C28778c.m88238c(this, z, lineChart, context);
    }

    /* renamed from: n */
    public final void mo60678n(String str, C31128a aVar) {
        Object obj;
        boolean z;
        boolean z2;
        C41536l.m120489i(str, "symbol");
        C41536l.m120489i(aVar, "result");
        Iterator it = this.f61847h.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            GTSearchSymbolViewModel$ViewModel.C23720e eVar = (GTSearchSymbolViewModel$ViewModel.C23720e) obj;
            if (!(eVar instanceof GTSearchSymbolViewModel$ViewModel.C23720e.C23722b) || !C41536l.m120484d(((GTSearchSymbolViewModel$ViewModel.C23720e.C23722b) eVar).mo60633e(), str)) {
                z2 = false;
                continue;
            } else {
                z2 = true;
                continue;
            }
            if (z2) {
                break;
            }
        }
        GTSearchSymbolViewModel$ViewModel.C23720e eVar2 = (GTSearchSymbolViewModel$ViewModel.C23720e) obj;
        if (eVar2 != null) {
            ((GTSearchSymbolViewModel$ViewModel.C23720e.C23722b) eVar2).mo60638j(aVar);
        }
        Iterator it2 = this.f61847h.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            }
            GTSearchSymbolViewModel$ViewModel.C23720e eVar3 = (GTSearchSymbolViewModel$ViewModel.C23720e) it2.next();
            if (!(eVar3 instanceof GTSearchSymbolViewModel$ViewModel.C23720e.C23722b) || !C41536l.m120484d(((GTSearchSymbolViewModel$ViewModel.C23720e.C23722b) eVar3).mo60633e(), str)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                break;
            }
            i++;
        }
        notifyItemChanged(i);
    }

    /* renamed from: o */
    public void mo60679o(List list) {
        C28775a.C28778c.m88239d(this, list);
    }

    public void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        C41536l.m120489i(f0Var, "holder");
        GTSearchSymbolViewModel$ViewModel.C23720e eVar = (GTSearchSymbolViewModel$ViewModel.C23720e) this.f61847h.get(i);
        if (f0Var instanceof C23763c) {
            C41536l.m120487g(eVar, "null cannot be cast to non-null type ge.bog.mobilebank.galtandtaggart.presentation.search.GTSearchSymbolViewModel.ViewModel.ListItem.SearchItem");
            ((C23763c) f0Var).mo60684l((GTSearchSymbolViewModel$ViewModel.C23720e.C23722b) eVar, i);
        } else if (f0Var instanceof C23765d) {
            C41536l.m120487g(eVar, "null cannot be cast to non-null type ge.bog.mobilebank.galtandtaggart.presentation.search.GTSearchSymbolViewModel.ViewModel.ListItem.SearchItem");
            ((C23765d) f0Var).mo60686j((GTSearchSymbolViewModel$ViewModel.C23720e.C23722b) eVar);
        }
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 1) {
            int i2 = C23768f.f61858a[this.f61844e.ordinal()];
            if (i2 == 1) {
                C28723e1 d = C28723e1.m88012d(from, viewGroup, false);
                C41536l.m120488h(d, "inflate(\n               …                        )");
                return new C23763c(this, d);
            } else if (i2 == 2) {
                C28763y0 d2 = C28763y0.m88187d(from, viewGroup, false);
                C41536l.m120488h(d2, "inflate(\n               …                        )");
                return new C23765d(this, d2);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (i == 2) {
            C28714b1 d3 = C28714b1.m87974d(from, viewGroup, false);
            C41536l.m120488h(d3, "inflate(\n               …lse\n                    )");
            return new C23767e(this, d3);
        } else if (i == 3) {
            C28717c1 d4 = C28717c1.m87987d(from, viewGroup, false);
            C41536l.m120488h(d4, "inflate(\n               …lse\n                    )");
            return new C23762b(this, d4);
        } else {
            throw new IllegalStateException("Unknown ViewType");
        }
    }

    /* renamed from: p */
    public final void mo60680p(C43075l lVar) {
        this.f61849j = lVar;
    }

    /* renamed from: q */
    public final void mo60681q(C43079p pVar) {
        this.f61850k = pVar;
    }

    /* renamed from: r */
    public final void mo60682r(List list, Runnable runnable) {
        C41536l.m120489i(list, "tickerList");
        this.f61847h = list;
        notifyDataSetChanged();
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: t */
    public final void mo60683t() {
        boolean z;
        Iterator it = this.f61847h.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            GTSearchSymbolViewModel$ViewModel.C23720e eVar = (GTSearchSymbolViewModel$ViewModel.C23720e) it.next();
            if (!(eVar instanceof GTSearchSymbolViewModel$ViewModel.C23720e.C23722b) || !C41536l.m120484d(((GTSearchSymbolViewModel$ViewModel.C23720e.C23722b) eVar).mo60633e(), this.f61845f.mo60618tw())) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                break;
            }
            i++;
        }
        if (i != -1) {
            Object obj = this.f61847h.get(i);
            C41536l.m120487g(obj, "null cannot be cast to non-null type ge.bog.mobilebank.galtandtaggart.presentation.search.GTSearchSymbolViewModel.ViewModel.ListItem.SearchItem");
            GTSearchSymbolViewModel$ViewModel.C23720e.C23722b bVar = (GTSearchSymbolViewModel$ViewModel.C23720e.C23722b) obj;
            if (this.f61845f.mo60610Bw(bVar.mo60634f(), this.f61846g)) {
                C41527d0.m120454a(bVar.mo60634f()).remove(this.f61846g);
            } else {
                BigDecimal bigDecimal = this.f61846g;
                if (bigDecimal != null) {
                    bVar.mo60634f().add(bigDecimal);
                }
            }
            notifyItemChanged(i);
        }
    }
}
