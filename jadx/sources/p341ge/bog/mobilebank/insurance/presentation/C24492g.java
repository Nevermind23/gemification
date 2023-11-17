package p341ge.bog.mobilebank.insurance.presentation;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import el0.C20263a;
import el0.C20265c;
import el0.C20266d;
import el0.C20267e;
import g91.C32289b0;
import g91.C32343x;
import he1.C41238w;
import il0.C25225b;
import il0.C25226c;
import il0.C25227d;
import il0.C25228e;
import il0.C25229f;
import il0.C25230g;
import il0.C25231h;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ml0.C26249c;
import ml0.C26250d;
import ml0.C26253f;
import nl0.C26550g;
import nl0.C26551h;
import nl0.C26552i;
import nl0.C26553j;
import o31.C37599g;
import p341ge.bog.designsystem.components.cardbadgesupdate.CardBadgeView;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.list.ThreeLineTextItem;
import p341ge.bog.designsystem.components.textimagecard.TextImageCardView;
import p341ge.bog.mobilebank.insurance.presentation.C24476b;
import p341ge.bog.mobilebank.insurance.presentation.C24479c;
import p504lh.C16575a;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.insurance.presentation.g */
public final class C24492g extends C1819o {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C43075l f63198f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C43075l f63199g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C43064a f63200h;

    /* renamed from: ge.bog.mobilebank.insurance.presentation.g$a */
    public static final class C24493a extends RecyclerView.C1734f0 {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24493a(C25230g gVar) {
            super(gVar.mo3946b());
            C41536l.m120489i(gVar, "binding");
            gVar.f64811e.setText(C32343x.m95388F("text.insurance.product.list.general.text", new Object[0]));
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.presentation.g$b */
    public static final class C24494b extends RecyclerView.C1734f0 {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24494b(C25226c cVar) {
            super(cVar.mo3946b());
            C41536l.m120489i(cVar, "binding");
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.presentation.g$c */
    public static final class C24495c extends RecyclerView.C1734f0 {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24495c(C25227d dVar) {
            super(dVar.mo3946b());
            C41536l.m120489i(dVar, "binding");
            dVar.f64804e.setTitle(C32343x.m95388F("text.insurance.list.active.policies", new Object[0]));
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.presentation.g$d */
    public static final class C24496d extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C25231h f63201d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final C43075l f63202e;

        /* renamed from: f */
        private final C24497a f63203f;

        /* renamed from: ge.bog.mobilebank.insurance.presentation.g$d$a */
        public static final class C24497a extends C1819o {

            /* renamed from: g */
            public static final C24498a f63204g = new C24498a((DefaultConstructorMarker) null);
            /* access modifiers changed from: private */

            /* renamed from: f */
            public final C43075l f63205f;

            /* renamed from: ge.bog.mobilebank.insurance.presentation.g$d$a$a */
            public static final class C24498a {
                private C24498a() {
                }

                public /* synthetic */ C24498a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            /* renamed from: ge.bog.mobilebank.insurance.presentation.g$d$a$b */
            public static final class C24499b extends RecyclerView.C1734f0 {

                /* renamed from: d */
                private final C25225b f63206d;

                /* renamed from: e */
                private final C43075l f63207e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C24499b(C25225b bVar, C43075l lVar) {
                    super(bVar.mo63749c());
                    C41536l.m120489i(bVar, "binding");
                    C41536l.m120489i(lVar, "policyClicked");
                    this.f63206d = bVar;
                    this.f63207e = lVar;
                }

                /* access modifiers changed from: private */
                /* renamed from: j */
                public static final void m78760j(C24499b bVar, C24476b bVar2, View view) {
                    C41536l.m120489i(bVar, "this$0");
                    C41536l.m120489i(bVar2, "$item");
                    bVar.f63207e.invoke(bVar2);
                }

                /* renamed from: i */
                public final void mo62479i(C24476b bVar) {
                    String str;
                    C41536l.m120489i(bVar, "item");
                    C25225b bVar2 = this.f63206d;
                    ThreeLineTextItem threeLineTextItem = bVar2.f64801g;
                    Context context = bVar2.mo63749c().getContext();
                    this.f63206d.mo63749c().setOnClickListener(new C26550g(this, bVar));
                    if (bVar instanceof C24476b.C24477a) {
                        threeLineTextItem.setTitle(context.getString(C20267e.policies_list_car_insurance));
                        C24476b.C24477a aVar = (C24476b.C24477a) bVar;
                        threeLineTextItem.setText(context.getString(C20267e.policies_list_policy_number) + ": " + aVar.mo62467e().mo65305r());
                        threeLineTextItem.setSubtitle(aVar.mo62467e().mo65286a());
                    } else if (bVar instanceof C24476b.C24478b) {
                        C24476b.C24478b bVar3 = (C24476b.C24478b) bVar;
                        threeLineTextItem.setTitle(C32343x.m95388F(bVar3.mo62468e().mo65340t(), new Object[0]));
                        threeLineTextItem.setText(context.getString(C20267e.policies_list_policy_number) + ": " + bVar3.mo62468e().mo65336p());
                        if (bVar.mo62466d()) {
                            str = C32343x.m95388F("text.travel.insurance.policy.amex.gift", new Object[0]);
                        } else {
                            C24476b.C24478b bVar4 = (C24476b.C24478b) bVar;
                            str = bVar4.mo62468e().mo65330j() + " " + bVar4.mo62468e().mo65332l();
                        }
                        threeLineTextItem.setSubtitle(str);
                    }
                    this.f63206d.f64799e.setCard(C16575a.AMERICAN_EXPRESS);
                    CardBadgeView cardBadgeView = this.f63206d.f64799e;
                    C41536l.m120488h(cardBadgeView, "binding.amexIcon");
                    C32343x.m95483r1(cardBadgeView, bVar.mo62466d(), false, 2, (Object) null);
                }
            }

            /* renamed from: ge.bog.mobilebank.insurance.presentation.g$d$a$c */
            static final class C24500c extends C41537m implements C43075l {

                /* renamed from: d */
                final /* synthetic */ C24497a f63208d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C24500c(C24497a aVar) {
                    super(1);
                    this.f63208d = aVar;
                }

                /* renamed from: a */
                public final void mo62480a(C24476b bVar) {
                    C41536l.m120489i(bVar, "policy");
                    this.f63208d.f63205f.invoke(bVar);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    mo62480a((C24476b) obj);
                    return C41238w.f97225a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C24497a(C43075l lVar) {
                super(C37599g.f90345a.mo90787d());
                C41536l.m120489i(lVar, "policyClicked");
                this.f63205f = lVar;
            }

            /* renamed from: l */
            public void onBindViewHolder(C24499b bVar, int i) {
                C41536l.m120489i(bVar, "holder");
                Object g = mo6027g(i);
                C41536l.m120488h(g, "getItem(position)");
                bVar.mo62479i((C24476b) g);
            }

            /* renamed from: m */
            public C24499b onCreateViewHolder(ViewGroup viewGroup, int i) {
                C41536l.m120489i(viewGroup, "parent");
                C25225b d = C25225b.m80298d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                C41536l.m120488h(d, "inflate(\n               …lse\n                    )");
                return new C24499b(d, new C24500c(this));
            }
        }

        /* renamed from: ge.bog.mobilebank.insurance.presentation.g$d$b */
        static final class C24501b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C24496d f63209d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24501b(C24496d dVar) {
                super(1);
                this.f63209d = dVar;
            }

            /* renamed from: a */
            public final void mo62481a(C24476b bVar) {
                C41536l.m120489i(bVar, "policy");
                this.f63209d.f63202e.invoke(bVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo62481a((C24476b) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24496d(C25231h hVar, C43075l lVar) {
            super(hVar.mo3946b());
            C41536l.m120489i(hVar, "binding");
            C41536l.m120489i(lVar, "policyClicked");
            this.f63201d = hVar;
            this.f63202e = lVar;
            C24497a aVar = new C24497a(new C24501b(this));
            this.f63203f = aVar;
            hVar.f64815g.setAdapter(aVar);
        }

        /* renamed from: i */
        public final void mo62476i(C26553j jVar) {
            C41536l.m120489i(jVar, "policyGroup");
            this.f63201d.f64814f.setText(C32343x.m95388F(jVar.mo65822c(), new Object[0]));
            C32289b0.m95107s(this.f63201d.f64813e, C32289b0.m95091c(jVar.mo65821b()), Integer.valueOf(C20263a.f55161a), (Integer) null, false, false);
            this.f63203f.mo6029i(jVar.mo65820a());
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.presentation.g$e */
    public static final class C24502e extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C25229f f63210d;

        /* renamed from: e */
        private final C43075l f63211e;

        /* renamed from: ge.bog.mobilebank.insurance.presentation.g$e$a */
        public /* synthetic */ class C24503a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f63212a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    ml0.d[] r0 = ml0.C26250d.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    ml0.d r1 = ml0.C26250d.AUTO     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    ml0.d r1 = ml0.C26250d.TRAVEL     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f63212a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.insurance.presentation.C24492g.C24502e.C24503a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24502e(C25229f fVar, C43075l lVar) {
            super(fVar.mo3946b());
            C41536l.m120489i(fVar, "binding");
            C41536l.m120489i(lVar, "newProductClicked");
            this.f63210d = fVar;
            this.f63211e = lVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m78765j(C26249c cVar, C24502e eVar, View view) {
            C41536l.m120489i(cVar, "$product");
            C41536l.m120489i(eVar, "this$0");
            C26250d c = cVar.mo65278c();
            if (c != null) {
                eVar.f63211e.invoke(c);
            }
        }

        /* renamed from: i */
        public final void mo62482i(C26249c cVar) {
            int i;
            String a;
            C41536l.m120489i(cVar, "product");
            TextImageCardView textImageCardView = this.f63210d.f64809e;
            textImageCardView.setDescription(C32343x.m95388F(cVar.mo65277b(), new Object[0]));
            textImageCardView.setText(C32343x.m95388F(cVar.mo65276a(), new Object[0]));
            C26250d c = cVar.mo65278c();
            if (c == null) {
                i = -1;
            } else {
                i = C24503a.f63212a[c.ordinal()];
            }
            if (i == 1) {
                textImageCardView.setImage(new Image.Animation.Raw(C20266d.f55170a, (Image.Animation.AnimationConfig) null, 2, (DefaultConstructorMarker) null));
            } else if (i != 2) {
                C26253f d = cVar.mo65279d();
                if (!(d == null || (a = d.mo65315a()) == null)) {
                    String c2 = C32289b0.m95091c(a);
                    C41536l.m120488h(c2, "generateImageUrl(it)");
                    new Image.Url(c2, (Image.Placeholder) null, (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 126, (DefaultConstructorMarker) null);
                }
            } else {
                textImageCardView.setImage(new Image.Animation.Raw(C20266d.f55171b, (Image.Animation.AnimationConfig) null, 2, (DefaultConstructorMarker) null));
            }
            textImageCardView.setOnClickListener(new C26551h(cVar, this));
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.presentation.g$f */
    public static final class C24504f extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C25228e f63213d;

        /* renamed from: e */
        private final C43064a f63214e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24504f(C25228e eVar, C43064a aVar) {
            super(eVar.mo3946b());
            C41536l.m120489i(eVar, "binding");
            C41536l.m120489i(aVar, "reloadClicked");
            this.f63213d = eVar;
            this.f63214e = aVar;
            Context context = eVar.mo3946b().getContext();
            eVar.f64807f.setOnClickListener(new C26552i(this));
            eVar.f64806e.setText(C32343x.m95420V("rbc.ins.policies.loading.error", context.getString(C20267e.f55172a), new Object[0]));
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public static final void m78768i(C24504f fVar, View view) {
            C41536l.m120489i(fVar, "this$0");
            fVar.f63214e.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.presentation.g$g */
    static final class C24505g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C24492g f63215d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24505g(C24492g gVar) {
            super(1);
            this.f63215d = gVar;
        }

        /* renamed from: a */
        public final void mo62483a(C26250d dVar) {
            C41536l.m120489i(dVar, "productType");
            this.f63215d.f63199g.invoke(dVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62483a((C26250d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.presentation.g$h */
    static final class C24506h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C24492g f63216d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24506h(C24492g gVar) {
            super(1);
            this.f63216d = gVar;
        }

        /* renamed from: a */
        public final void mo62484a(C24476b bVar) {
            C41536l.m120489i(bVar, "policy");
            this.f63216d.f63198f.invoke(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62484a((C24476b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.presentation.g$i */
    static final class C24507i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C24492g f63217d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24507i(C24492g gVar) {
            super(0);
            this.f63217d = gVar;
        }

        public final void invoke() {
            this.f63217d.f63200h.invoke();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24492g(C43075l lVar, C43075l lVar2, C43064a aVar) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(lVar, "policyClicked");
        C41536l.m120489i(lVar2, "newProductClicked");
        C41536l.m120489i(aVar, "reloadPolicesClicked");
        this.f63198f = lVar;
        this.f63199g = lVar2;
        this.f63200h = aVar;
    }

    public int getItemViewType(int i) {
        C24479c cVar = (C24479c) mo6027g(i);
        if (cVar instanceof C24479c.C24480a) {
            return C20265c.item_insurance_products_header;
        }
        if (cVar instanceof C24479c.C24485f) {
            return C20265c.item_insurance_product;
        }
        if (cVar instanceof C24479c.C24484e) {
            return C20265c.item_insurance_polices_header;
        }
        if (cVar instanceof C24479c.C24483d) {
            return C20265c.item_policy;
        }
        if (cVar instanceof C24479c.C24482c) {
            return C20265c.item_insurance_polices_footer;
        }
        if (cVar instanceof C24479c.C24481b) {
            return C20265c.item_insurance_polices_reload;
        }
        throw new NoWhenBranchMatchedException();
    }

    public void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        C41536l.m120489i(f0Var, "holder");
        C24479c cVar = (C24479c) mo6027g(i);
        if (cVar instanceof C24479c.C24483d) {
            ((C24496d) f0Var).mo62476i(((C24479c.C24483d) cVar).mo62469a());
        } else if (cVar instanceof C24479c.C24485f) {
            ((C24502e) f0Var).mo62482i(((C24479c.C24485f) cVar).mo62470a());
        }
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == C20265c.item_insurance_products_header) {
            C25230g d = C25230g.m80318d(from, viewGroup, false);
            C41536l.m120488h(d, "inflate(inflater, parent, false)");
            return new C24493a(d);
        } else if (i == C20265c.item_insurance_product) {
            C25229f d2 = C25229f.m80314d(from, viewGroup, false);
            C41536l.m120488h(d2, "inflate(inflater, parent, false)");
            return new C24502e(d2, new C24505g(this));
        } else if (i == C20265c.item_insurance_polices_header) {
            C25227d d3 = C25227d.m80306d(from, viewGroup, false);
            C41536l.m120488h(d3, "inflate(inflater, parent, false)");
            return new C24495c(d3);
        } else if (i == C20265c.item_policy) {
            C25231h d4 = C25231h.m80322d(from, viewGroup, false);
            C41536l.m120488h(d4, "inflate(inflater, parent, false)");
            return new C24496d(d4, new C24506h(this));
        } else if (i == C20265c.item_insurance_polices_footer) {
            C25226c d5 = C25226c.m80302d(from, viewGroup, false);
            C41536l.m120488h(d5, "inflate(inflater, parent, false)");
            return new C24494b(d5);
        } else if (i == C20265c.item_insurance_polices_reload) {
            C25228e d6 = C25228e.m80310d(from, viewGroup, false);
            C41536l.m120488h(d6, "inflate(inflater, parent, false)");
            return new C24504f(d6, new C24507i(this));
        } else {
            throw new UnsupportedOperationException("Unknown view type");
        }
    }
}
