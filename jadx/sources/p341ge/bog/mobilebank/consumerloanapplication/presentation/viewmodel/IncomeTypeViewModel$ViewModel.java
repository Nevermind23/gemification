package p341ge.bog.mobilebank.consumerloanapplication.presentation.viewmodel;

import androidx.lifecycle.C1644x;
import b41.C31128a;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import g90.C20781c;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o90.C26796e2;
import o90.C26800f2;
import o90.C26815g2;
import o90.C26819h2;
import p341ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.FormData;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.IncomeType;
import p855oy.C27094a;
import t80.C28326c;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.viewmodel.IncomeTypeViewModel$ViewModel */
public final class IncomeTypeViewModel$ViewModel extends C21481a implements C26796e2, C26800f2 {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C28326c f59979d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C27094a f59980e;

    /* renamed from: f */
    private final C26796e2 f59981f = this;

    /* renamed from: g */
    private final C26800f2 f59982g = this;

    /* renamed from: h */
    private final C1644x f59983h = new C1644x();

    /* renamed from: i */
    private final C1644x f59984i = new C1644x();

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.viewmodel.IncomeTypeViewModel$ViewModel$a */
    static final class C22725a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ IncomeTypeViewModel$ViewModel f59985d;

        /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.viewmodel.IncomeTypeViewModel$ViewModel$a$a */
        /* synthetic */ class C22726a extends C41535k implements C43075l {
            C22726a(Object obj) {
                super(1, obj, C27094a.class, "transform", "transform(Ljava/util/List;)Ljava/util/List;", 0);
            }

            public final List invoke(List list) {
                C41536l.m120489i(list, "p0");
                return ((C27094a) this.receiver).mo66388b(list);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22725a(IncomeTypeViewModel$ViewModel incomeTypeViewModel$ViewModel) {
            super(1);
            this.f59985d = incomeTypeViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        public static final List invoke$lambda$0(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "it");
            C40749p k0 = this.f59985d.f59979d.mo67968a().mo95075O().mo95026k0(new C22730c(new C22726a(this.f59985d.f59980e)));
            C41536l.m120488h(k0, "getIncomeTypesLookup().t…ookupUiMapper::transform)");
            return C31270e.m92879h(k0, 1);
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.viewmodel.IncomeTypeViewModel$ViewModel$b */
    static final class C22727b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ IncomeTypeViewModel$ViewModel f59986d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22727b(IncomeTypeViewModel$ViewModel incomeTypeViewModel$ViewModel) {
            super(1);
            this.f59986d = incomeTypeViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo56297a(C31128a aVar) {
            this.f59986d.mo56294o0().mo4823o(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56297a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IncomeTypeViewModel$ViewModel(C28326c cVar, C27094a aVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(cVar, "getIncomeTypesLookup");
        C41536l.m120489i(aVar, "lookupUiMapper");
        this.f59979d = cVar;
        this.f59980e = aVar;
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C26815g2(new C22725a(this)));
        C41536l.m120488h(L0, "merge(\n                o…le(RC_INIT)\n            }");
        C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C26819h2(new C22727b(this)));
        C41536l.m120488h(F0, "merge(\n                o…result)\n                }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: fw */
    public static final C40754t m73704fw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: gw */
    public static final void m73705gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: E6 */
    public void mo56288E6(LookupUiModel lookupUiModel) {
        LookupUiModel lookupUiModel2 = lookupUiModel;
        C41536l.m120489i(lookupUiModel2, "selectedIncomeType");
        String uuid = UUID.randomUUID().toString();
        C41536l.m120488h(uuid, "randomUUID().toString()");
        mo56289h().mo4823o(C32343x.m95466m(new FormData((String) null, uuid, C20781c.FULL, false, IncomeType.f59832d.mo56156a(lookupUiModel.mo52393d()), lookupUiModel2, (String) null, (String) null, (String) null, (String) null, (String) null, (LookupUiModel) null, (String) null, 8137, (DefaultConstructorMarker) null)));
    }

    /* renamed from: jw */
    public C1644x mo56289h() {
        return this.f59984i;
    }

    /* renamed from: kw */
    public C1644x mo56294o0() {
        return this.f59983h;
    }

    /* renamed from: lw */
    public final C26796e2 mo56292lw() {
        return this.f59981f;
    }

    /* renamed from: mw */
    public final C26800f2 mo56293mw() {
        return this.f59982g;
    }
}
