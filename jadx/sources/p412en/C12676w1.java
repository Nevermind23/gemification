package p412en;

import androidx.lifecycle.C1644x;
import c41.C31270e;
import df1.C40651b;
import df1.C40654d;
import df1.C40655e;
import ed1.C40734b;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40767b;
import g91.C32343x;
import hd1.C41204a;
import he1.C41238w;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p341ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData;
import p341ge.bog.mobilebank.cardapplications.presentation.model.RecoverCardUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.expiringcard.ExpiringCardPopUpUiModel;
import p341ge.bog.mobilebank.cleanarch.mainactivity.model.ExpiringCardPopUpData;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import p355an.C10092j;
import p523mm.C16790v0;
import ue1.C43075l;

/* renamed from: en.w1 */
public final class C12676w1 extends C21481a implements C12650r1, C12656s1 {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C16790v0 f37528d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C10092j f37529e;

    /* renamed from: f */
    private final PreferencesApiManager f37530f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final ExpiringCardPopUpData f37531g;

    /* renamed from: h */
    private final C12650r1 f37532h = this;

    /* renamed from: i */
    private final C12656s1 f37533i = this;

    /* renamed from: j */
    private final C40767b f37534j;

    /* renamed from: k */
    private final C1644x f37535k;

    /* renamed from: l */
    private final C1644x f37536l;

    /* renamed from: m */
    private final C1644x f37537m;

    /* renamed from: en.w1$a */
    static final class C12677a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C12676w1 f37538d;

        /* renamed from: en.w1$a$a */
        /* synthetic */ class C12678a extends C41535k implements C43075l {
            C12678a(Object obj) {
                super(1, obj, C10092j.class, "transform", "transformRecoverCards(Ljava/util/List;)Ljava/util/List;", 0);
            }

            public final List invoke(List list) {
                C41536l.m120489i(list, "p0");
                return ((C10092j) this.receiver).mo26567m(list);
            }
        }

        /* renamed from: en.w1$a$b */
        static final class C12679b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C12676w1 f37539d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12679b(C12676w1 w1Var) {
                super(1);
                this.f37539d = w1Var;
            }

            /* renamed from: a */
            public final void mo33343a(List list) {
                Object obj;
                boolean z;
                C41536l.m120488h(list, "it");
                C12676w1 w1Var = this.f37539d;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((RecoverCardUiModel) obj).mo39815e() == w1Var.f37531g.mo52881a()) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                RecoverCardUiModel recoverCardUiModel = (RecoverCardUiModel) obj;
                if (recoverCardUiModel != null) {
                    C37224b.m109965d(this.f37539d.mo33332jj(), new CardApplicationTypeData.RecoverCardOrderData(recoverCardUiModel, (StringSource) null, 2, (DefaultConstructorMarker) null));
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo33343a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12677a(C12676w1 w1Var) {
            super(1);
            this.f37538d = w1Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final void m48132d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        public static final List invoke$lambda$0(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: c */
        public final C40754t invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C40734b y = this.f37538d.f37528d.mo43911a().mo95062A(new C12666u1(new C12678a(this.f37538d.f37529e))).mo95084m(new C12671v1(new C12679b(this.f37538d))).mo95092y();
            C41536l.m120488h(y, "private fun subscribeToR…ndToLifecycle()\n        }");
            return C31270e.m92878g(y, -1);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12676w1(C16790v0 v0Var, C10092j jVar, PreferencesApiManager preferencesApiManager, ExpiringCardPopUpData expiringCardPopUpData) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(v0Var, "getRecoverCards");
        C41536l.m120489i(jVar, "debitCardsMapper");
        C41536l.m120489i(preferencesApiManager, "preferencesApiManager");
        C41536l.m120489i(expiringCardPopUpData, "data");
        this.f37528d = v0Var;
        this.f37529e = jVar;
        this.f37530f = preferencesApiManager;
        this.f37531g = expiringCardPopUpData;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Unit>()");
        this.f37534j = h1;
        this.f37535k = new C1644x(m48120pw(expiringCardPopUpData, m48117hw()));
        this.f37536l = new C1644x();
        this.f37537m = new C1644x();
        m48118nw();
    }

    /* renamed from: hw */
    private final int m48117hw() {
        Calendar instance = Calendar.getInstance();
        long timeInMillis = instance.getTimeInMillis();
        instance.set(5, instance.getActualMaximum(5));
        return C40651b.m117470E(C40654d.m117511o(instance.getTimeInMillis() - timeInMillis, C40655e.MILLISECONDS), C40655e.DAYS);
    }

    /* renamed from: nw */
    private final void m48118nw() {
        C40749p L0 = this.f37534j.mo94989L0(new C12661t1(new C12677a(this)));
        C41536l.m120488h(L0, "private fun subscribeToR…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, mo33331Ib()));
    }

    /* access modifiers changed from: private */
    /* renamed from: ow */
    public static final C40754t m48119ow(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: pw */
    private final ExpiringCardPopUpUiModel m48120pw(ExpiringCardPopUpData expiringCardPopUpData, int i) {
        return new ExpiringCardPopUpUiModel(expiringCardPopUpData.mo52881a(), expiringCardPopUpData.mo52887f(), expiringCardPopUpData.mo52883d(), i, expiringCardPopUpData.mo52882b());
    }

    /* renamed from: fa */
    public void mo33329fa() {
        C32343x.m95472o(this.f37534j);
    }

    /* renamed from: iw */
    public C1644x mo33333ta() {
        return this.f37535k;
    }

    /* renamed from: jw */
    public final C12650r1 mo33337jw() {
        return this.f37532h;
    }

    /* renamed from: kw */
    public C1644x mo33332jj() {
        return this.f37536l;
    }

    /* renamed from: lw */
    public C1644x mo33331Ib() {
        return this.f37537m;
    }

    /* renamed from: mw */
    public final C12656s1 mo33340mw() {
        return this.f37533i;
    }

    public void onDismiss() {
        this.f37530f.setLastTimeExpiringCardPopupWasShown(this.f37531g.mo52881a());
    }
}
