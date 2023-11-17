package p341ge.bog.mobilebank.bnpl.presentation.details;

import a41.C30482a;
import a41.C30489f;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import b31.C31123l;
import com.github.mikephil.charting.utils.Utils;
import g91.C32319m;
import g91.C32343x;
import he1.C41224m;
import he1.C41238w;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p341ge.bog.mobilebank.bnpl.presentation.details.C13838d;
import p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ExpandableItemView;
import p480jl.C16212c;
import p480jl.C16213d;
import p480jl.C16214e;
import p536nl.C17058k;
import p536nl.C17062o;
import p536nl.C17063p;
import p536nl.C17064q;
import p536nl.C17065r;
import p536nl.C17066s;
import p536nl.C17067t;
import p536nl.C17068u;
import p601sg.C17778c;
import p615tg.C17963d;
import p659wl.C18616f;
import p659wl.C18617g;
import p659wl.C18618h;
import p659wl.C18619i;
import p659wl.C18620j;
import p659wl.C18621k;
import p659wl.C18622l;
import p659wl.C18623m;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;
import x11.C39772e;

/* renamed from: ge.bog.mobilebank.bnpl.presentation.details.c */
public final class C13822c extends C1819o {

    /* renamed from: m */
    public static final C13823a f41086m = new C13823a((DefaultConstructorMarker) null);

    /* renamed from: f */
    private final C30482a f41087f;

    /* renamed from: g */
    private final C43075l f41088g;

    /* renamed from: h */
    private final C13826d f41089h;

    /* renamed from: i */
    private RecyclerView f41090i;

    /* renamed from: j */
    private C43064a f41091j;

    /* renamed from: k */
    private C43064a f41092k;

    /* renamed from: l */
    private C43064a f41093l;

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.c$a */
    public static final class C13823a {
        private C13823a() {
        }

        public /* synthetic */ C13823a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.c$b */
    public static final class C13824b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C17058k f41094d;

        /* renamed from: e */
        private final C13826d f41095e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13824b(C17058k kVar, C13826d dVar) {
            super(kVar.mo3946b());
            C41536l.m120489i(kVar, "binding");
            this.f41094d = kVar;
            this.f41095e = dVar;
            kVar.f47649i.setOnClickListener(new C18616f(this));
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public static final void m51549i(C13824b bVar, View view) {
            C41536l.m120489i(bVar, "this$0");
            C13826d dVar = bVar.f41095e;
            if (dVar != null) {
                dVar.mo38185a();
            }
        }

        /* renamed from: j */
        public final void mo38190j(C13838d.C13839a aVar) {
            long j;
            double d;
            C41536l.m120489i(aVar, "data");
            TwoLineTextItem twoLineTextItem = this.f41094d.f47645e;
            twoLineTextItem.setText(aVar.mo38197b());
            twoLineTextItem.setTitle(C32343x.m95388F("text.bnpl.product.details.page.prod.name", new Object[0]));
            TwoLineTextItem twoLineTextItem2 = this.f41094d.f47648h;
            twoLineTextItem2.setText(aVar.mo38200e());
            twoLineTextItem2.setTitle(C32343x.m95388F("text.bnpl.product.details.page.prod.type", new Object[0]));
            TwoLineTextItem twoLineTextItem3 = this.f41094d.f47646f;
            Long c = aVar.mo38198c();
            if (c != null) {
                j = c.longValue();
            } else {
                j = -1;
            }
            twoLineTextItem3.setText(C32319m.m95295b(j));
            twoLineTextItem3.setTitle(C32343x.m95388F("text.bnpl.product.details.page.next.pay.date", new Object[0]));
            TwoLineTextItem twoLineTextItem4 = this.f41094d.f47647g;
            Double d2 = aVar.mo38199d();
            if (d2 != null) {
                d = d2.doubleValue();
            } else {
                d = Utils.DOUBLE_EPSILON;
            }
            twoLineTextItem4.setText(C32343x.m95410Q(d, aVar.mo38196a(), false, 2, (Object) null));
            twoLineTextItem4.setTitle(C32343x.m95388F("text.bnpl.product.details.page.next.pay.amount", new Object[0]));
            this.f41094d.f47650j.setTitle(C32343x.m95388F("text.bnpl.product.details.page.details", new Object[0]));
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.c$c */
    public static final class C13825c extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C17067t f41096d;

        /* renamed from: e */
        private final C43064a f41097e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13825c(C17067t tVar, C43064a aVar) {
            super(tVar.mo3946b());
            C41536l.m120489i(tVar, "binding");
            this.f41096d = tVar;
            this.f41097e = aVar;
            tVar.f47674e.setOnClickListener(new C18617g(this));
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public static final void m51552i(C13825c cVar, View view) {
            C41536l.m120489i(cVar, "this$0");
            C43064a aVar = cVar.f41097e;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.c$d */
    public interface C13826d {
        /* renamed from: a */
        void mo38185a();
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.c$e */
    public static final class C13827e extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C17062o f41098d;

        /* renamed from: e */
        private final C30482a f41099e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13827e(C17062o oVar, C30482a aVar) {
            super(oVar.mo3946b());
            C41536l.m120489i(oVar, "binding");
            C41536l.m120489i(aVar, "productDetailsInput");
            this.f41098d = oVar;
            this.f41099e = aVar;
            Button button = oVar.f47662e;
            button.setOnClickListener(new C18618h(this));
            button.setButtonText(C32343x.m95388F("text.bnpl.product.details.page.cancel.button", new Object[0]));
            Button button2 = oVar.f47664g;
            button2.setOnClickListener(new C18619i(this));
            button2.setButtonText(C32343x.m95388F("text.bnpl.product.details.page.pay.button", new Object[0]));
            Button button3 = oVar.f47665h;
            button3.setOnClickListener(new C18620j(this));
            button3.setButtonText(C32343x.m95388F("text.bnpl.product.details.page.statement.button", new Object[0]));
            Button button4 = oVar.f47663f;
            button4.setOnClickListener(new C18621k(this));
            button4.setButtonText(C32343x.m95388F("loan.payment.pay", new Object[0]));
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public static final void m51558m(C13827e eVar, View view) {
            C41536l.m120489i(eVar, "this$0");
            eVar.f41099e.mo38239as();
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public static final void m51559n(C13827e eVar, View view) {
            C41536l.m120489i(eVar, "this$0");
            eVar.f41099e.mo38227L9();
        }

        /* access modifiers changed from: private */
        /* renamed from: o */
        public static final void m51560o(C13827e eVar, View view) {
            C41536l.m120489i(eVar, "this$0");
            eVar.f41099e.mo38232P9();
        }

        /* access modifiers changed from: private */
        /* renamed from: p */
        public static final void m51561p(C13827e eVar, View view) {
            C41536l.m120489i(eVar, "this$0");
            eVar.f41099e.mo38245ne();
        }

        /* renamed from: l */
        public final void mo38191l(C13838d.C13841c cVar) {
            C41536l.m120489i(cVar, "data");
            Button button = this.f41098d.f47662e;
            C41536l.m120488h(button, "binding.cancel");
            C32343x.m95483r1(button, cVar.mo38201a(), false, 2, (Object) null);
            Button button2 = this.f41098d.f47664g;
            C41536l.m120488h(button2, "binding.prePayment");
            C32343x.m95483r1(button2, cVar.mo38203c(), false, 2, (Object) null);
            Button button3 = this.f41098d.f47665h;
            C41536l.m120488h(button3, "binding.statement");
            C32343x.m95483r1(button3, cVar.mo38204d(), false, 2, (Object) null);
            Button button4 = this.f41098d.f47663f;
            C41536l.m120488h(button4, "binding.payment");
            C32343x.m95483r1(button4, cVar.mo38202b(), false, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.c$f */
    public static final class C13828f extends RecyclerView.C1734f0 {

        /* renamed from: f */
        public static final C13830b f41100f = new C13830b((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final C17064q f41101d;

        /* renamed from: e */
        private final RecyclerView f41102e;

        /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.c$f$a */
        static final class C13829a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C13828f f41103d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C13829a(C13828f fVar) {
                super(1);
                this.f41103d = fVar;
            }

            /* renamed from: a */
            public final void mo38193a(boolean z) {
                float f;
                ViewPropertyAnimator animate = this.f41103d.f41101d.f47668e.findViewById(C16213d.f45751p).animate();
                if (z) {
                    f = 180.0f;
                } else {
                    f = Utils.FLOAT_EPSILON;
                }
                animate.rotation(f).setDuration(300).start();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo38193a(((Boolean) obj).booleanValue());
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.c$f$b */
        public static final class C13830b {
            private C13830b() {
            }

            public /* synthetic */ C13830b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.c$f$c */
        public /* synthetic */ class C13831c {

            /* renamed from: a */
            public static final /* synthetic */ int[] f41104a;

            /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            static {
                /*
                    ge.bog.mobilebank.bnpl.presentation.details.d$b[] r0 = p341ge.bog.mobilebank.bnpl.presentation.details.C13838d.C13840b.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    ge.bog.mobilebank.bnpl.presentation.details.d$b r1 = p341ge.bog.mobilebank.bnpl.presentation.details.C13838d.C13840b.PENDING     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    ge.bog.mobilebank.bnpl.presentation.details.d$b r1 = p341ge.bog.mobilebank.bnpl.presentation.details.C13838d.C13840b.POSITIVE     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    ge.bog.mobilebank.bnpl.presentation.details.d$b r1 = p341ge.bog.mobilebank.bnpl.presentation.details.C13838d.C13840b.NEGATIVE     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    f41104a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.bnpl.presentation.details.C13822c.C13828f.C13831c.<clinit>():void");
            }
        }

        /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.c$f$d */
        static final class C13832d extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C13828f f41105d;

            /* renamed from: e */
            final /* synthetic */ C13838d.C13846h f41106e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C13832d(C13828f fVar, C13838d.C13846h hVar) {
                super(1);
                this.f41105d = fVar;
                this.f41106e = hVar;
            }

            /* renamed from: a */
            public final void mo38194a(View view) {
                C41536l.m120489i(view, "view");
                this.f41105d.m51569o(view, this.f41106e);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo38194a((View) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.c$f$e */
        static final class C13833e extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ C13828f f41107d;

            /* renamed from: e */
            final /* synthetic */ C13838d.C13846h f41108e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C13833e(C13828f fVar, C13838d.C13846h hVar) {
                super(2);
                this.f41107d = fVar;
                this.f41108e = hVar;
            }

            /* renamed from: a */
            public final void mo38195a(View view, int i) {
                C41536l.m120489i(view, "view");
                this.f41107d.m51568n(view, this.f41108e);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                mo38195a((View) obj, ((Number) obj2).intValue());
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13828f(C17064q qVar, RecyclerView recyclerView) {
            super(qVar.mo3946b());
            C41536l.m120489i(qVar, "binding");
            this.f41101d = qVar;
            this.f41102e = recyclerView;
            qVar.f47668e.setScrollableParent(recyclerView);
            qVar.f47668e.setOnStateChanged(new C13829a(this));
        }

        /* renamed from: l */
        private final void m51566l(TextView textView, boolean z) {
            float f;
            int i;
            if (z) {
                f = 0.6f;
            } else {
                f = 1.0f;
            }
            textView.setAlpha(f);
            Context context = this.itemView.getContext();
            if (z) {
                i = C17778c.f49635t;
            } else {
                i = C17778c.f49637v;
            }
            textView.setTextColor(C0767a.m2893c(context, i));
        }

        /* renamed from: m */
        private final void m51567m(ImageView imageView, int i, int i2) {
            imageView.setImageResource(i);
            imageView.setColorFilter(C0767a.m2893c(this.itemView.getContext(), i2));
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public final void m51568n(View view, C13838d.C13846h hVar) {
            C41536l.m120487g(view, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) view;
            viewGroup.removeAllViews();
            for (C41224m mVar : hVar.mo38211d()) {
                View inflate = LayoutInflater.from(this.itemView.getContext()).inflate(C16214e.layout_bnpl_schedule_details_key_value, (ViewGroup) null);
                ((TextView) inflate.findViewById(C16213d.key)).setText((CharSequence) mVar.mo95678e());
                ((TextView) inflate.findViewById(C16213d.f45727F0)).setText((CharSequence) mVar.mo95680f());
                viewGroup.addView(inflate);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: o */
        public final void m51569o(View view, C13838d.C13846h hVar) {
            TextView textView = (TextView) view.findViewById(C16213d.f45738a);
            TextView textView2 = (TextView) view.findViewById(C16213d.f45757t);
            textView.setText(hVar.mo38208a());
            textView2.setText(hVar.mo38209b());
            C41536l.m120488h(textView2, "dateTv");
            m51566l(textView2, false);
            C41536l.m120488h(textView, "amountTv");
            m51566l(textView, false);
            ImageView imageView = (ImageView) view.findViewById(C16213d.f45724E);
            int i = C13831c.f41104a[hVar.mo38210c().ordinal()];
            if (i == 1) {
                C41536l.m120488h(imageView, "setUpHeader$lambda$0");
                m51567m(imageView, C16212c.f45715c, C17778c.f49626g);
            } else if (i == 2) {
                C41536l.m120488h(imageView, "setUpHeader$lambda$0");
                m51567m(imageView, C16212c.f45716d, C17778c.f49617S);
                m51566l(textView2, true);
                m51566l(textView, true);
            } else if (i == 3) {
                C41536l.m120488h(imageView, "setUpHeader$lambda$0");
                m51567m(imageView, C16212c.f45717e, C17778c.f49605C);
            }
        }

        /* renamed from: k */
        public final void mo38192k(C13838d.C13846h hVar) {
            C41536l.m120489i(hVar, "data");
            this.f41101d.f47668e.setOnBindHeader(new C13832d(this, hVar));
            this.f41101d.f47668e.setOnBindItem(new C13833e(this, hVar));
            ExpandableItemView expandableItemView = this.f41101d.f47668e;
            C41536l.m120488h(expandableItemView, "binding.expandableItem");
            ExpandableItemView.m69446y(expandableItemView, 1, false, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.c$g */
    public static final class C13834g extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C17068u f41109d;

        /* renamed from: e */
        private final C43064a f41110e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13834g(C17068u uVar, C43064a aVar) {
            super(uVar.mo3946b());
            C41536l.m120489i(uVar, "binding");
            this.f41109d = uVar;
            this.f41110e = aVar;
            uVar.mo3946b().setOnClickListener(new C18622l(this));
            uVar.f47677f.setText(C32343x.m95388F("text.bnpl.product.details.page.agreement", new Object[0]));
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public static final void m51575i(C13834g gVar, View view) {
            C41536l.m120489i(gVar, "this$0");
            C43064a aVar = gVar.f41110e;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.c$h */
    public static final class C13835h extends RecyclerView.C1734f0 {
        C13835h(C17065r rVar, C13822c cVar, LayerView layerView) {
            super(layerView);
            rVar.f47670e.setOnClickListener(new C18623m(cVar));
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public static final void m51577i(C13822c cVar, View view) {
            C41536l.m120489i(cVar, "this$0");
            C43064a k = cVar.mo38186k();
            if (k != null) {
                k.invoke();
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.c$i */
    public static final class C13836i extends RecyclerView.C1734f0 {
        C13836i(LayerView layerView) {
            super(layerView);
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.c$j */
    public static final class C13837j extends RecyclerView.C1734f0 {
        C13837j(LayerView layerView) {
            super(layerView);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13822c(C30482a aVar, C43075l lVar, C13826d dVar) {
        super(C17963d.f51158a.mo45633d());
        C41536l.m120489i(aVar, "productDetailsInput");
        C41536l.m120489i(lVar, "onHeaderLoadFailed");
        this.f41087f = aVar;
        this.f41088g = lVar;
        this.f41089h = dVar;
    }

    public int getItemViewType(int i) {
        C13838d dVar = (C13838d) mo6027g(i);
        if (dVar instanceof C13838d.C13842d) {
            return C39772e.f94483l;
        }
        if (dVar instanceof C13838d.C13841c) {
            return C16214e.item_bnpl_operation_buttons;
        }
        if (dVar instanceof C13838d.C13839a) {
            return C16214e.item_bnpl_details;
        }
        if (dVar instanceof C13838d.C13844f) {
            return C16214e.item_bnpl_schedule_loading_error;
        }
        if (dVar instanceof C13838d.C13845g) {
            return C16214e.item_bnpl_schedule_header;
        }
        if (dVar instanceof C13838d.C13846h) {
            return C16214e.item_bnpl_schedule_expandable;
        }
        if (dVar instanceof C13838d.C13847i) {
            return C16214e.item_bnpl_schedule_loading;
        }
        if (dVar instanceof C13838d.C13848j) {
            return C16214e.item_bnpl_terms;
        }
        if (dVar instanceof C13838d.C13843e) {
            return C16214e.item_bnpl_schedule_bottom_layer;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: k */
    public final C43064a mo38186k() {
        return this.f41093l;
    }

    /* renamed from: l */
    public final void mo38187l(C43064a aVar) {
        this.f41091j = aVar;
    }

    /* renamed from: m */
    public final void mo38188m(C43064a aVar) {
        this.f41093l = aVar;
    }

    /* renamed from: n */
    public final void mo38189n(C43064a aVar) {
        this.f41092k = aVar;
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C41536l.m120489i(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f41090i = recyclerView;
    }

    public void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        C41536l.m120489i(f0Var, "holder");
        C13838d dVar = (C13838d) mo6027g(i);
        if (dVar instanceof C13838d.C13842d) {
            C13838d.C13842d dVar2 = (C13838d.C13842d) dVar;
            ((C30489f) f0Var).mo70837m(dVar2.mo38205a(), dVar2.mo38206b());
        } else if (dVar instanceof C13838d.C13841c) {
            ((C13827e) f0Var).mo38191l((C13838d.C13841c) dVar);
        } else if (dVar instanceof C13838d.C13839a) {
            ((C13824b) f0Var).mo38190j((C13838d.C13839a) dVar);
        } else if (dVar instanceof C13838d.C13846h) {
            ((C13828f) f0Var).mo38192k((C13838d.C13846h) dVar);
        }
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == C39772e.f94483l) {
            C31123l d = C31123l.m92612d(from, viewGroup, false);
            C41536l.m120488h(d, "inflate(inflater, parent, false)");
            return new C30489f(d, this.f41087f, (Integer) null, this.f41088g, 4, (DefaultConstructorMarker) null);
        } else if (i == C16214e.item_bnpl_operation_buttons) {
            C17062o d2 = C17062o.m59955d(from, viewGroup, false);
            C41536l.m120488h(d2, "inflate(inflater, parent, false)");
            return new C13827e(d2, this.f41087f);
        } else if (i == C16214e.item_bnpl_details) {
            C17058k d3 = C17058k.m59939d(from, viewGroup, false);
            C41536l.m120488h(d3, "inflate(inflater, parent, false)");
            return new C13824b(d3, this.f41089h);
        } else if (i == C16214e.item_bnpl_schedule_header) {
            C17065r d4 = C17065r.m59967d(from, viewGroup, false);
            C41536l.m120488h(d4, "inflate(\n               …  false\n                )");
            d4.f47671f.setText(C32343x.m95388F("text.bnpl.product.details.page.repayments.and.schedule", new Object[0]));
            return new C13835h(d4, this, d4.mo3946b());
        } else if (i == C16214e.item_bnpl_schedule_loading) {
            C17066s d5 = C17066s.m59971d(from, viewGroup, false);
            C41536l.m120488h(d5, "inflate(\n               …  false\n                )");
            return new C13836i(d5.mo3946b());
        } else if (i == C16214e.item_bnpl_schedule_loading_error) {
            C17067t d6 = C17067t.m59975d(from, viewGroup, false);
            C41536l.m120488h(d6, "inflate(inflater, parent, false)");
            return new C13825c(d6, this.f41091j);
        } else if (i == C16214e.item_bnpl_schedule_expandable) {
            C17064q d7 = C17064q.m59963d(from, viewGroup, false);
            C41536l.m120488h(d7, "inflate(inflater, parent, false)");
            return new C13828f(d7, this.f41090i);
        } else if (i == C16214e.item_bnpl_schedule_bottom_layer) {
            C17063p d8 = C17063p.m59959d(from, viewGroup, false);
            C41536l.m120488h(d8, "inflate(\n               …  false\n                )");
            return new C13837j(d8.mo3946b());
        } else if (i == C16214e.item_bnpl_terms) {
            C17068u d9 = C17068u.m59979d(from, viewGroup, false);
            C41536l.m120488h(d9, "inflate(inflater, parent, false)");
            return new C13834g(d9, this.f41092k);
        } else {
            throw new UnsupportedOperationException("Unknown view type");
        }
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C41536l.m120489i(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.f41090i = null;
    }
}
