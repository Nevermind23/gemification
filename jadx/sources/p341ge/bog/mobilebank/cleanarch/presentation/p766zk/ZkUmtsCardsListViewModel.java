package p341ge.bog.mobilebank.cleanarch.presentation.p766zk;

import androidx.lifecycle.C1607m0;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import gd1.C40992a;
import h60.C24884b;
import h60.C24885c;
import h60.C24886d;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import iu0.C36546y;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p785hx.C25078b;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.zk.ZkUmtsCardsListViewModel */
public final class ZkUmtsCardsListViewModel extends C21481a {

    /* renamed from: d */
    private final C25078b f59465d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1644x f59466e = new C1644x();

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.zk.ZkUmtsCardsListViewModel$a */
    static final class C22477a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ZkUmtsCardsListViewModel f59467d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22477a(ZkUmtsCardsListViewModel zkUmtsCardsListViewModel) {
            super(1);
            this.f59467d = zkUmtsCardsListViewModel;
        }

        /* renamed from: a */
        public final void mo55479a(C41205b bVar) {
            C21484c.m69417i(this.f59467d.f59466e, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55479a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.zk.ZkUmtsCardsListViewModel$b */
    static final class C22478b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ZkUmtsCardsListViewModel f59468d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22478b(ZkUmtsCardsListViewModel zkUmtsCardsListViewModel) {
            super(1);
            this.f59468d = zkUmtsCardsListViewModel;
        }

        /* renamed from: a */
        public final void mo55480a(List list) {
            C21484c.m69418j(this.f59468d.f59466e, new ArrayList(list));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55480a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.zk.ZkUmtsCardsListViewModel$c */
    static final class C22479c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ZkUmtsCardsListViewModel f59469d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22479c(ZkUmtsCardsListViewModel zkUmtsCardsListViewModel) {
            super(1);
            this.f59469d = zkUmtsCardsListViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f59469d.f59466e, th, (Object) null, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.zk.ZkUmtsCardsListViewModel$d */
    static final class C22480d extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C22480d f59470d = new C22480d();

        C22480d() {
            super(1);
        }

        /* renamed from: a */
        public final C21503d invoke(C21503d dVar) {
            C41536l.m120488h(dVar, "it");
            try {
                if (dVar instanceof C21503d.C21506c) {
                    Object a = dVar.mo53701a();
                    C41536l.m120486f(a);
                    return new C21503d.C21506c((ArrayList) a);
                } else if (dVar instanceof C21503d.C21504a) {
                    return new C21503d.C21504a(((C21503d.C21504a) dVar).mo53706f(), (Object) null, 2, (DefaultConstructorMarker) null);
                } else {
                    if (dVar instanceof C21503d.C21505b) {
                        return new C21503d.C21505b((Object) null, 1, (DefaultConstructorMarker) null);
                    }
                    throw new NoWhenBranchMatchedException();
                }
            } catch (Throwable th) {
                return new C21503d.C21504a(th, (Object) null, 2, (DefaultConstructorMarker) null);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ZkUmtsCardsListViewModel(C25078b bVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(bVar, "getUmtsCardsUseCase");
        this.f59465d = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: iw */
    public static final void m72878iw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: jw */
    public static final void m72879jw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: kw */
    public static final void m72880kw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: hw */
    public final void mo55476hw(String str) {
        C41536l.m120489i(str, "systemName");
        C41205b I = this.f59465d.mo63534a(str).mo95063B(C40992a.m118827a()).mo95083l(new C24884b(new C22477a(this))).mo95070I(new C24885c(new C22478b(this)), new C24886d(new C22479c(this)));
        C41536l.m120488h(I, "fun getUmtsCards(systemN…       })\n        )\n    }");
        addDisposable(I);
    }

    /* renamed from: lw */
    public final LiveData mo55477lw() {
        return C1607m0.m5655c(this.f59466e, C22480d.f59470d);
    }

    /* renamed from: mw */
    public final void mo55478mw() {
        C36546y.m108282F().mo27152s("umts", "click_card", "zolotaya_korona");
    }
}
