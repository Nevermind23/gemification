package st0;

import ed1.C40762x;
import java.util.List;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.loyaltyprogress.data.model.StatusDetailsApiModel;
import tt0.C38795a;
import ue1.C43075l;
import ut0.C39099a;
import ut0.C39100b;
import ut0.C39101c;
import ut0.C39102d;
import yt0.C40063d;
import zt0.C40256a;

/* renamed from: st0.e */
public final class C38531e implements C40256a {

    /* renamed from: a */
    private final C38795a f92350a;

    /* renamed from: b */
    private final C39100b f92351b;

    /* renamed from: c */
    private final C39101c f92352c;

    /* renamed from: d */
    private final C39102d f92353d;

    /* renamed from: e */
    private final C39099a f92354e;

    /* renamed from: st0.e$a */
    /* synthetic */ class C38532a extends C41535k implements C43075l {
        C38532a(Object obj) {
            super(1, obj, C39099a.class, "convert", "convert(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C39099a) this.receiver).mo92770a(list);
        }
    }

    /* renamed from: st0.e$b */
    /* synthetic */ class C38533b extends C41535k implements C43075l {
        C38533b(Object obj) {
            super(1, obj, C39100b.class, "convert", "convert(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C39100b) this.receiver).mo92771a(list);
        }
    }

    /* renamed from: st0.e$c */
    /* synthetic */ class C38534c extends C41535k implements C43075l {
        C38534c(Object obj) {
            super(1, obj, C39101c.class, "convert", "convert(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C39101c) this.receiver).mo92772a(list);
        }
    }

    /* renamed from: st0.e$d */
    /* synthetic */ class C38535d extends C41535k implements C43075l {
        C38535d(Object obj) {
            super(1, obj, C39102d.class, "convert", "convert(Lge/bog/mobilebank/loyaltyprogress/data/model/StatusDetailsApiModel;)Lge/bog/mobilebank/loyaltyprogress/domain/model/StatusDetails;", 0);
        }

        /* renamed from: b */
        public final C40063d invoke(StatusDetailsApiModel statusDetailsApiModel) {
            C41536l.m120489i(statusDetailsApiModel, "p0");
            return ((C39102d) this.receiver).mo92773a(statusDetailsApiModel);
        }
    }

    public C38531e(C38795a aVar, C39100b bVar, C39101c cVar, C39102d dVar, C39099a aVar2) {
        C41536l.m120489i(aVar, "service");
        C41536l.m120489i(bVar, "starsGuideMapper");
        C41536l.m120489i(cVar, "statusBenefitsMapper");
        C41536l.m120489i(dVar, "detailsMapper");
        C41536l.m120489i(aVar2, "lookupMapper");
        this.f92350a = aVar;
        this.f92351b = bVar;
        this.f92352c = cVar;
        this.f92353d = dVar;
        this.f92354e = aVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static final List m113095i(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final List m113096j(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final List m113097k(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final C40063d m113098l(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40063d) lVar.invoke(obj);
    }

    /* renamed from: a */
    public C40762x mo92111a() {
        C40762x A = this.f92350a.mo92498a().mo95062A(new C38527a(new C38532a(this.f92354e)));
        C41536l.m120488h(A, "service.getNewsList().map(lookupMapper::convert)");
        return A;
    }

    /* renamed from: b */
    public C40762x mo92112b() {
        C40762x A = this.f92350a.mo92499b().mo95062A(new C38528b(new C38535d(this.f92353d)));
        C41536l.m120488h(A, "service.getStatusDetails…p(detailsMapper::convert)");
        return A;
    }

    /* renamed from: c */
    public C40762x mo92113c() {
        C40762x A = this.f92350a.mo92500c().mo95062A(new C38530d(new C38534c(this.f92352c)));
        C41536l.m120488h(A, "service.getStatusBenefit…sBenefitsMapper::convert)");
        return A;
    }

    /* renamed from: d */
    public C40762x mo92114d() {
        C40762x A = this.f92350a.mo92501d().mo95062A(new C38529c(new C38533b(this.f92351b)));
        C41536l.m120488h(A, "service.getStarsGuide().…tarsGuideMapper::convert)");
        return A;
    }
}
