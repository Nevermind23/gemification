package p341ge.bog.mobilebank.lifestyleoffers.presentation.home;

import android.os.Bundle;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import ao0.C10119a;
import ao0.C10125f;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import ed0.C20217b;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40767b;
import g91.C32343x;
import go0.C15407l;
import go0.C15408m;
import go0.C15411p;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import iu0.C36546y;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import ko0.C16521c;
import kotlin.jvm.internal.C41527d0;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.lifestyleoffers.presentation.shared.model.LifestyleOffersFilterResultData;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p380ck.C10464h;
import sn0.C17898b;
import to0.C18071a;
import ue1.C43075l;
import ue1.C43081r;
import uo0.C18269a;
import uo0.C18270b;
import uo0.C18273e;
import uo0.C18274f;
import vo0.C18490b;
import zn0.C19091f;
import zn0.C19103o;
import zn0.C19105q;

/* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.home.LifestyleOffersHomeViewModel */
public interface LifestyleOffersHomeViewModel {

    /* renamed from: a */
    public static final C14997a f43199a = C14997a.f43225a;

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.home.LifestyleOffersHomeViewModel$ViewModel */
    public static final class ViewModel extends C21481a implements C14998b, C14999c {
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final C19103o f43200d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final C19091f f43201e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final C19105q f43202f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public final C20217b f43203g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public final C18490b f43204h;

        /* renamed from: i */
        private final C18071a f43205i;

        /* renamed from: j */
        private final PreferencesApiManager f43206j;

        /* renamed from: k */
        private final C14998b f43207k = this;

        /* renamed from: l */
        private final C14999c f43208l = this;

        /* renamed from: m */
        private final C1644x f43209m = new C1644x();

        /* renamed from: n */
        private final C1644x f43210n = new C1644x();

        /* renamed from: o */
        private final C1644x f43211o = new C1644x();

        /* renamed from: p */
        private final C1644x f43212p = new C1644x();

        /* renamed from: q */
        private final C1644x f43213q = new C1644x();

        /* renamed from: r */
        private final C1644x f43214r = new C1644x();

        /* renamed from: s */
        private final C1644x f43215s = new C1644x();

        /* renamed from: t */
        private final C1644x f43216t = new C1644x();

        /* renamed from: u */
        private final C1644x f43217u = new C1644x();

        /* renamed from: v */
        private final C1644x f43218v = new C1644x();

        /* renamed from: w */
        private final C40767b f43219w;

        /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.home.LifestyleOffersHomeViewModel$ViewModel$a */
        static final class C14991a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ViewModel f43220d;

            /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.home.LifestyleOffersHomeViewModel$ViewModel$a$a */
            static final class C14992a extends C41537m implements C43081r {

                /* renamed from: d */
                public static final C14992a f43221d = new C14992a();

                C14992a() {
                    super(4);
                }

                /* renamed from: a */
                public final C15411p invoke(C10125f fVar, Boolean bool, C18270b bVar, List list) {
                    C41536l.m120489i(fVar, "offers");
                    C41536l.m120489i(bool, "isAllowed");
                    C41536l.m120489i(bVar, "bnplOffer");
                    C41536l.m120489i(list, "lookUps");
                    return new C15411p(fVar, bool.booleanValue(), bVar, list);
                }
            }

            /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.home.LifestyleOffersHomeViewModel$ViewModel$a$b */
            static final class C14993b extends C41537m implements C43075l {

                /* renamed from: d */
                final /* synthetic */ ViewModel f43222d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C14993b(ViewModel viewModel) {
                    super(1);
                    this.f43222d = viewModel;
                }

                /* renamed from: a */
                public final C41224m invoke(C15411p pVar) {
                    C41536l.m120489i(pVar, "data");
                    return C41233s.m119492a(this.f43222d.f43204h.mo46281g(pVar.mo42502b(), pVar.mo42501a(), pVar.mo42503c()), Boolean.valueOf(pVar.mo42504d()));
                }
            }

            /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.home.LifestyleOffersHomeViewModel$ViewModel$a$c */
            /* synthetic */ class C14994c extends C41535k implements C43075l {
                C14994c(Object obj) {
                    super(1, obj, ViewModel.class, "buildList", "buildList(Lkotlin/Pair;)Ljava/util/List;", 0);
                }

                /* renamed from: b */
                public final List invoke(C41224m mVar) {
                    C41536l.m120489i(mVar, "p0");
                    return ((ViewModel) this.receiver).m54967nw(mVar);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14991a(ViewModel viewModel) {
                super(1);
                this.f43220d = viewModel;
            }

            /* access modifiers changed from: private */
            /* renamed from: e */
            public static final C15411p m55003e(C43081r rVar, Object obj, Object obj2, Object obj3, Object obj4) {
                C41536l.m120489i(rVar, "$tmp0");
                return (C15411p) rVar.invoke(obj, obj2, obj3, obj4);
            }

            /* access modifiers changed from: private */
            /* renamed from: f */
            public static final C41224m m55004f(C43075l lVar, Object obj) {
                C41536l.m120489i(lVar, "$tmp0");
                return (C41224m) lVar.invoke(obj);
            }

            /* access modifiers changed from: private */
            /* renamed from: g */
            public static final List m55005g(C43075l lVar, Object obj) {
                C41536l.m120489i(lVar, "$tmp0");
                return (List) lVar.invoke(obj);
            }

            /* renamed from: d */
            public final C40754t invoke(Integer num) {
                boolean z;
                C41536l.m120489i(num, "requestCode");
                C19103o jw = this.f43220d.f43200d;
                if (num.intValue() != -1) {
                    z = true;
                } else {
                    z = false;
                }
                C40749p k0 = C40762x.m118152R(jw.mo47304a(z), this.f43220d.f43202f.mo47306a(), this.f43220d.f43201e.mo47294d(), this.f43220d.f43203g.mo48650b("LIFE_STYLE_CAMPAIGN_TYPES"), new C15019b(C14992a.f43221d)).mo95075O().mo95026k0(new C15020c(new C14993b(this.f43220d))).mo95026k0(new C15021d(new C14994c(this.f43220d)));
                C41536l.m120488h(k0, "@HiltViewModel\n    class…e(Date())\n        }\n    }");
                return C31270e.m92879h(k0, 1);
            }
        }

        /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.home.LifestyleOffersHomeViewModel$ViewModel$b */
        static final class C14995b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ViewModel f43223d;

            /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.home.LifestyleOffersHomeViewModel$ViewModel$b$a */
            static final class C14996a extends C41537m implements C43075l {

                /* renamed from: d */
                final /* synthetic */ ViewModel f43224d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C14996a(ViewModel viewModel) {
                    super(1);
                    this.f43224d = viewModel;
                }

                /* renamed from: a */
                public final void mo41968a(List list) {
                    this.f43224d.mo41959x().mo4826r(list);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    mo41968a((List) obj);
                    return C41238w.f97225a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14995b(ViewModel viewModel) {
                super(1);
                this.f43223d = viewModel;
            }

            /* renamed from: a */
            public final void mo41967a(C31128a aVar) {
                this.f43223d.mo41933B1().mo4823o(aVar);
                C41536l.m120488h(aVar, "result");
                C31132b.m92648j(aVar, (int[]) null, new C14996a(this.f43223d), 1, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo41967a((C31128a) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewModel(C19103o oVar, C19091f fVar, C19105q qVar, C20217b bVar, C18490b bVar2, C18071a aVar, PreferencesApiManager preferencesApiManager) {
            super((C41204a) null, 1, (DefaultConstructorMarker) null);
            C41536l.m120489i(oVar, "getLifestyleOffers");
            C41536l.m120489i(fVar, "getBnplOfferInfo");
            C41536l.m120489i(qVar, "isChooserPopupAllowed");
            C41536l.m120489i(bVar, "getLookup");
            C41536l.m120489i(bVar2, "offersUiMapper");
            C41536l.m120489i(aVar, "blackListManager");
            C41536l.m120489i(preferencesApiManager, "preferences");
            this.f43200d = oVar;
            this.f43201e = fVar;
            this.f43202f = qVar;
            this.f43203g = bVar;
            this.f43204h = bVar2;
            this.f43205i = aVar;
            this.f43206j = preferencesApiManager;
            C40767b h1 = C40767b.m118210h1();
            C41536l.m120488h(h1, "create<Int>()");
            this.f43219w = h1;
            aVar.mo45755b("DISMISSED_RECOMMENDED_OFFERS");
            C40749p L0 = C40749p.m118047l0(h1, onRefresh()).mo94989L0(new C15407l(new C14991a(this)));
            C41536l.m120488h(L0, "merge(offersSubject, onR…C_INIT)\n                }");
            C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C15408m(new C14995b(this)));
            C41536l.m120488h(F0, "merge(offersSubject, onR…      }\n                }");
            bindToLifecycle(F0);
        }

        /* access modifiers changed from: private */
        /* renamed from: fw */
        public static final C40754t m54959fw(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C40754t) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: gw */
        public static final void m54960gw(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: ge.bog.designsystem.components.common.Image$Resource} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v1, resolved type: ge.bog.designsystem.components.common.Image$Resource} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v1, resolved type: ge.bog.designsystem.components.common.Image$Url} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v3, resolved type: ge.bog.designsystem.components.common.Image$Resource} */
        /* access modifiers changed from: private */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: nw */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.List m54967nw(he1.C41224m r31) {
            /*
                r30 = this;
                java.lang.Object r0 = r31.mo95675a()
                uo0.h r0 = (uo0.C18283h) r0
                java.lang.Object r1 = r31.mo95676b()
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                r2 = 0
                if (r1 == 0) goto L_0x001c
                boolean r1 = r30.m54968ow()
                if (r1 == 0) goto L_0x001c
                uo0.f$c r1 = uo0.C18274f.C18277c.f51638a
                goto L_0x001d
            L_0x001c:
                r1 = r2
            L_0x001d:
                java.util.List r3 = r0.mo46011h()
                boolean r3 = r3.isEmpty()
                r4 = 1
                r3 = r3 ^ r4
                if (r3 == 0) goto L_0x0033
                uo0.f$f r3 = new uo0.f$f
                java.util.List r5 = r0.mo46011h()
                r3.<init>(r5)
                goto L_0x0034
            L_0x0033:
                r3 = r2
            L_0x0034:
                java.util.List r5 = r0.mo46009f()
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>()
                java.util.Iterator r5 = r5.iterator()
            L_0x0041:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L_0x0063
                java.lang.Object r6 = r5.next()
                r7 = r6
                uo0.e r7 = (uo0.C18273e) r7
                r15 = r30
                to0.a r8 = r15.f43205i
                java.lang.String r9 = "DISMISSED_RECOMMENDED_OFFERS"
                long r12 = r7.mo45962k()
                boolean r7 = r8.mo45756c(r9, r12)
                r7 = r7 ^ r4
                if (r7 == 0) goto L_0x0041
                r11.add(r6)
                goto L_0x0041
            L_0x0063:
                r15 = r30
                boolean r5 = r11.isEmpty()
                r5 = r5 ^ r4
                r14 = 0
                r13 = 2
                if (r5 == 0) goto L_0x0096
                ge.bog.designsystem.components.common.Image$Resource r9 = new ge.bog.designsystem.components.common.Image$Resource
                int r5 = sn0.C17900d.f50940f
                r9.<init>(r5, r2, r13, r2)
                java.lang.String r5 = "life.style.offers.main.page.recommended.offers.block.header"
                java.lang.Object[] r6 = new java.lang.Object[r14]
                java.lang.String r10 = g91.C32343x.m95388F(r5, r6)
                uo0.f$d r5 = new uo0.f$d
                r7 = 0
                java.lang.Integer r8 = java.lang.Integer.valueOf(r13)
                r12 = 0
                r16 = 8
                r17 = 33
                r18 = 0
                r6 = r5
                r13 = r16
                r14 = r17
                r15 = r18
                r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
                goto L_0x0097
            L_0x0096:
                r5 = r2
            L_0x0097:
                java.util.List r6 = r0.mo46005c()
                boolean r6 = r6.isEmpty()
                r6 = r6 ^ r4
                r7 = 4
                if (r6 == 0) goto L_0x00da
                uo0.f$d r6 = new uo0.f$d
                r9 = 0
                java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
                ge.bog.designsystem.components.common.Image$Resource r11 = new ge.bog.designsystem.components.common.Image$Resource
                int r8 = sn0.C17900d.f50940f
                r15 = 2
                r11.<init>(r8, r2, r15, r2)
                java.lang.String r8 = "life.style.offers.main.page.installment.block.header"
                r14 = 0
                java.lang.Object[] r12 = new java.lang.Object[r14]
                java.lang.String r12 = g91.C32343x.m95388F(r8, r12)
                java.util.List r13 = r0.mo46005c()
                ge.bog.mobilebank.lifestyleoffers.presentation.home.LifestyleOffersHomeViewModel$a r8 = p341ge.bog.mobilebank.lifestyleoffers.presentation.home.LifestyleOffersHomeViewModel.f43199a
                uo0.a r16 = r8.mo41969a()
                r17 = 0
                r18 = 65
                r19 = 0
                r8 = r6
                r7 = r14
                r14 = r16
                r7 = r15
                r15 = r17
                r16 = r18
                r17 = r19
                r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
                goto L_0x00dc
            L_0x00da:
                r7 = 2
                r6 = r2
            L_0x00dc:
                java.util.List r8 = r0.mo46006d()
                boolean r8 = r8.isEmpty()
                r8 = r8 ^ r4
                if (r8 == 0) goto L_0x0113
                uo0.f$d r8 = new uo0.f$d
                r10 = 0
                java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
                ge.bog.designsystem.components.common.Image$Resource r12 = new ge.bog.designsystem.components.common.Image$Resource
                int r9 = sn0.C17900d.icons_16_system_timer_fill
                r12.<init>(r9, r2, r7, r2)
                java.lang.String r9 = "life.style.offers.main.page.last.minute.block.header"
                r13 = 0
                java.lang.Object[] r14 = new java.lang.Object[r13]
                java.lang.String r13 = g91.C32343x.m95388F(r9, r14)
                java.util.List r14 = r0.mo46006d()
                ge.bog.mobilebank.lifestyleoffers.presentation.home.LifestyleOffersHomeViewModel$a r9 = p341ge.bog.mobilebank.lifestyleoffers.presentation.home.LifestyleOffersHomeViewModel.f43199a
                uo0.a r15 = r9.mo41970b()
                r16 = 0
                r17 = 65
                r18 = 0
                r9 = r8
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
                goto L_0x0114
            L_0x0113:
                r8 = r2
            L_0x0114:
                uo0.b r9 = r0.mo46003a()
                boolean r9 = r9.mo45931f()
                if (r9 == 0) goto L_0x014d
                uo0.f$a r9 = new uo0.f$a
                uo0.b r10 = r0.mo46003a()
                java.util.List r11 = r10.mo45929e()
                uo0.b r10 = r0.mo46003a()
                java.util.List r12 = r10.mo45928d()
                uo0.b r10 = r0.mo46003a()
                java.lang.String r13 = r10.mo45925a()
                uo0.b r10 = r0.mo46003a()
                java.lang.String r14 = r10.mo45927c()
                uo0.b r10 = r0.mo46003a()
                boolean r15 = r10.mo45926b()
                r10 = r9
                r10.<init>(r11, r12, r13, r14, r15)
                goto L_0x014e
            L_0x014d:
                r9 = r2
            L_0x014e:
                java.util.List r10 = r0.mo46010g()
                java.util.ArrayList r11 = new java.util.ArrayList
                r12 = 10
                int r12 = ie1.C41343r.m119925u(r10, r12)
                r11.<init>(r12)
                java.util.Iterator r10 = r10.iterator()
            L_0x0161:
                boolean r12 = r10.hasNext()
                if (r12 == 0) goto L_0x01bf
                java.lang.Object r12 = r10.next()
                uo0.d r12 = (uo0.C18272d) r12
                long r14 = r12.mo45944e()
                java.lang.String r21 = r12.mo45943d()
                if (r21 == 0) goto L_0x0191
                ge.bog.designsystem.components.common.Image$Url r16 = new ge.bog.designsystem.components.common.Image$Url
                r22 = 0
                r23 = 0
                r24 = 0
                r25 = 0
                r26 = 0
                r27 = 0
                r28 = 126(0x7e, float:1.77E-43)
                r29 = 0
                r20 = r16
                r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29)
                r23 = r16
                goto L_0x019a
            L_0x0191:
                ge.bog.designsystem.components.common.Image$Resource r4 = new ge.bog.designsystem.components.common.Image$Resource
                int r13 = sn0.C17900d.f50940f
                r4.<init>(r13, r2, r7, r2)
                r23 = r4
            L_0x019a:
                java.lang.String r24 = r12.mo45942c()
                java.util.List r25 = r12.mo45947g()
                uo0.f$d r4 = new uo0.f$d
                java.lang.Long r21 = java.lang.Long.valueOf(r14)
                r12 = 3
                java.lang.Integer r22 = java.lang.Integer.valueOf(r12)
                r26 = 0
                r27 = 0
                r28 = 96
                r29 = 0
                r20 = r4
                r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29)
                r11.add(r4)
                r4 = 1
                goto L_0x0161
            L_0x01bf:
                java.util.List r4 = r0.mo46007e()
                if (r4 == 0) goto L_0x01ce
                boolean r4 = r4.isEmpty()
                if (r4 == 0) goto L_0x01cc
                goto L_0x01ce
            L_0x01cc:
                r14 = 0
                goto L_0x01cf
            L_0x01ce:
                r14 = 1
            L_0x01cf:
                if (r14 != 0) goto L_0x01db
                java.util.List r4 = r0.mo46007e()
                uo0.f$e r10 = new uo0.f$e
                r10.<init>(r4)
                goto L_0x01dc
            L_0x01db:
                r10 = r2
            L_0x01dc:
                r4 = 8
                uo0.f[] r4 = new uo0.C18274f[r4]
                r12 = 0
                r4[r12] = r1
                r1 = 1
                r4[r1] = r3
                java.util.List r0 = r0.mo46004b()
                if (r0 == 0) goto L_0x01f2
                uo0.f$b r1 = new uo0.f$b
                r1.<init>(r0, r2, r7, r2)
                r2 = r1
            L_0x01f2:
                r4[r7] = r2
                r0 = 3
                r4[r0] = r5
                r0 = 4
                r4[r0] = r10
                r0 = 5
                r4[r0] = r6
                r0 = 6
                r4[r0] = r8
                r0 = 7
                r4[r0] = r9
                java.util.List r0 = ie1.C41341q.m119912o(r4)
                java.util.List r0 = ie1.C41358y.m120023m0(r0, r11)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.lifestyleoffers.presentation.home.LifestyleOffersHomeViewModel.ViewModel.m54967nw(he1.m):java.util.List");
        }

        /* renamed from: ow */
        private final boolean m54968ow() {
            C41224m lifestyleChooserPopupHiddenData = this.f43206j.getLifestyleChooserPopupHiddenData(C36546y.m108285N().mo89315M());
            Integer num = (Integer) lifestyleChooserPopupHiddenData.mo95675a();
            Long l = (Long) lifestyleChooserPopupHiddenData.mo95676b();
            Calendar instance = Calendar.getInstance();
            C41536l.m120488h(l, "lastHiddenDateMillis");
            instance.setTime(new Date(l.longValue()));
            if (num != null && num.intValue() == 0) {
                return true;
            }
            if (num != null && num.intValue() == 1) {
                instance.add(5, 1);
            } else if (num == null || num.intValue() != 2) {
                return false;
            } else {
                instance.add(5, 30);
            }
            return instance.getTime().before(new Date());
        }

        /* renamed from: Aw */
        public C1644x mo41933B1() {
            return this.f43209m;
        }

        /* renamed from: If */
        public void mo41935If() {
            mo41938Pd().mo4823o(C32343x.m95466m(C41238w.f97225a));
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: uo0.f} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: uo0.f} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: uo0.f} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: uo0.f} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: uo0.f} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: Os */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo41937Os(ko0.C16521c r5) {
            /*
                r4 = this;
                java.lang.String r0 = "type"
                kotlin.jvm.internal.C41536l.m120489i(r5, r0)
                androidx.lifecycle.x r0 = r4.mo41959x()
                java.lang.Object r0 = r0.mo4814f()
                java.util.List r0 = (java.util.List) r0
                r1 = 0
                if (r0 == 0) goto L_0x002a
                java.util.Iterator r0 = r0.iterator()
            L_0x0016:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x0028
                java.lang.Object r2 = r0.next()
                r3 = r2
                uo0.f r3 = (uo0.C18274f) r3
                boolean r3 = r3 instanceof uo0.C18274f.C18279e
                if (r3 == 0) goto L_0x0016
                r1 = r2
            L_0x0028:
                uo0.f r1 = (uo0.C18274f) r1
            L_0x002a:
                java.lang.String r0 = "null cannot be cast to non-null type ge.bog.mobilebank.lifestyleoffers.presentation.shared.model.LifestyleOfferViewType.ProgressOffers"
                kotlin.jvm.internal.C41536l.m120487g(r1, r0)
                uo0.f$e r1 = (uo0.C18274f.C18279e) r1
                java.util.List r0 = r1.mo45995c()
                androidx.lifecycle.x r1 = r4.mo41944co()
                he1.m r5 = he1.C41233s.m119492a(r5, r0)
                java.lang.Object r5 = r5.mo95678e()
                m41.C37224b.m109965d(r1, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.lifestyleoffers.presentation.home.LifestyleOffersHomeViewModel.ViewModel.mo41937Os(ko0.c):void");
        }

        /* renamed from: Qq */
        public void mo41939Qq(long j, Integer num) {
            C18274f fVar;
            C18274f.C18278d dVar;
            boolean z;
            Object obj;
            boolean z2;
            List k;
            Object obj2;
            boolean z3;
            long j2 = j;
            Integer num2 = num;
            C32343x.m95397J0(this, "life_style_main_page_recommended_offers", String.valueOf(j), "close_offer", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 16, (Object) null);
            this.f43205i.mo45757d("DISMISSED_RECOMMENDED_OFFERS", j2);
            List list = (List) mo41959x().mo4814f();
            List list2 = null;
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    C18274f fVar2 = (C18274f) obj2;
                    if (!(fVar2 instanceof C18274f.C18278d) || !C41536l.m120484d(((C18274f.C18278d) fVar2).mo45988g(), num2)) {
                        z3 = false;
                        continue;
                    } else {
                        z3 = true;
                        continue;
                    }
                    if (z3) {
                        break;
                    }
                }
                fVar = (C18274f) obj2;
            } else {
                fVar = null;
            }
            if (fVar instanceof C18274f.C18278d) {
                dVar = (C18274f.C18278d) fVar;
            } else {
                dVar = null;
            }
            if (dVar == null || (k = dVar.mo45993k()) == null || k.size() != 1) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                C1644x qw = mo41959x();
                List list3 = (List) mo41959x().mo4814f();
                if (list3 != null) {
                    C41536l.m120488h(list3, C11755a.C11756a.f34100b);
                    List B0 = C41358y.m119991B0(list3);
                    if (B0 != null) {
                        B0.remove(dVar);
                        list2 = B0;
                    }
                }
                qw.mo4826r(list2);
                return;
            }
            C1644x qw2 = mo41959x();
            List<Object> list4 = (List) mo41959x().mo4814f();
            if (list4 != null) {
                List arrayList = new ArrayList(C41343r.m119925u(list4, 10));
                for (Object obj3 : list4) {
                    if (obj3 instanceof C18274f.C18278d) {
                        C18274f.C18278d dVar2 = (C18274f.C18278d) obj3;
                        if (C41536l.m120484d(dVar2.mo45988g(), num2)) {
                            List B02 = C41358y.m119991B0(dVar2.mo45993k());
                            Iterator it2 = B02.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it2.next();
                                if (((C18273e) obj).mo45962k() == j2) {
                                    z2 = true;
                                    continue;
                                } else {
                                    z2 = false;
                                    continue;
                                }
                                if (z2) {
                                    break;
                                }
                            }
                            C41527d0.m120454a(B02).remove(obj);
                            obj3 = C18274f.C18278d.m62532d(dVar2, (Long) null, (Integer) null, (Image) null, (String) null, B02, (C18269a) null, 0, 111, (Object) null);
                        }
                    }
                    arrayList.add(obj3);
                }
                list2 = arrayList;
            }
            qw2.mo4826r(list2);
        }

        /* renamed from: We */
        public void mo41940We() {
            mo41946g5().mo4823o(C32343x.m95466m(C41238w.f97225a));
        }

        /* renamed from: Yt */
        public void mo41941Yt() {
            this.f43219w.onNext(-1);
        }

        /* renamed from: b3 */
        public void mo41942b3() {
            C31128a aVar = (C31128a) mo41933B1().mo4814f();
            boolean z = false;
            if (aVar != null && C31132b.m92639a(aVar)) {
                z = true;
            }
            if (!z) {
                this.f43219w.onNext(1);
            }
        }

        /* renamed from: bi */
        public void mo41943bi() {
            this.f43206j.hideLifestyleChooserPopup(C36546y.m108285N().mo89315M());
        }

        /* renamed from: gb */
        public void mo41947gb(Long l, Integer num) {
            if (num != null && num.intValue() == 1) {
                C37224b.m109962a(mo41936Lh());
            } else if (num != null && num.intValue() == 4) {
                C37224b.m109965d(mo41945f8(), new LifestyleOffersFilterResultData((List) null, C41339p.m119900e(C10119a.INSTALLMENT), 1, (DefaultConstructorMarker) null));
            } else if (l != null) {
                mo41950pg().mo4823o(C32343x.m95466m(l));
            }
        }

        /* renamed from: h2 */
        public void mo41948h2(long j, String str, boolean z) {
            if (!z) {
                C36546y.m108282F().mo27137H("life_style_offers", "offer_click", String.valueOf(j), (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
                C37224b.m109965d(mo41934I1(), Long.valueOf(j));
                return;
            }
            C37224b.m109965d(mo41949i2(), C41233s.m119492a(Long.valueOf(j), str));
        }

        /* renamed from: pw */
        public final C14998b mo41951pw() {
            return this.f43207k;
        }

        /* renamed from: qw */
        public C1644x mo41959x() {
            return this.f43210n;
        }

        /* renamed from: rw */
        public C1644x mo41946g5() {
            return this.f43213q;
        }

        /* renamed from: sw */
        public C1644x mo41949i2() {
            return this.f43211o;
        }

        /* renamed from: tw */
        public C1644x mo41950pg() {
            return this.f43217u;
        }

        /* renamed from: uw */
        public C1644x mo41945f8() {
            return this.f43216t;
        }

        /* renamed from: vw */
        public C1644x mo41936Lh() {
            return this.f43215s;
        }

        /* renamed from: ww */
        public C1644x mo41938Pd() {
            return this.f43214r;
        }

        /* renamed from: xw */
        public C1644x mo41934I1() {
            return this.f43212p;
        }

        /* renamed from: yw */
        public C1644x mo41944co() {
            return this.f43218v;
        }

        /* renamed from: zw */
        public final C14999c mo41962zw() {
            return this.f43208l;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.home.LifestyleOffersHomeViewModel$a */
    public static final class C14997a {

        /* renamed from: a */
        static final /* synthetic */ C14997a f43225a = new C14997a();

        /* renamed from: b */
        private static final C18269a f43226b = new C18269a(C17898b.f50931h, C17898b.f50930g, C17898b.f50932i);

        /* renamed from: c */
        private static final C18269a f43227c;

        static {
            int i = C17898b.color_support_third_tr_25;
            int i2 = C17898b.color_support_third_solid_600;
            f43227c = new C18269a(i, i2, i2);
        }

        private C14997a() {
        }

        /* renamed from: a */
        public final C18269a mo41969a() {
            return f43227c;
        }

        /* renamed from: b */
        public final C18269a mo41970b() {
            return f43226b;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.home.LifestyleOffersHomeViewModel$b */
    public interface C14998b {
        /* renamed from: If */
        void mo41935If();

        /* renamed from: Os */
        void mo41937Os(C16521c cVar);

        /* renamed from: Qq */
        void mo41939Qq(long j, Integer num);

        /* renamed from: We */
        void mo41940We();

        /* renamed from: Yt */
        void mo41941Yt();

        /* renamed from: b3 */
        void mo41942b3();

        /* renamed from: bi */
        void mo41943bi();

        /* renamed from: gb */
        void mo41947gb(Long l, Integer num);

        /* renamed from: h2 */
        void mo41948h2(long j, String str, boolean z);
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.home.LifestyleOffersHomeViewModel$c */
    public interface C14999c {
        /* renamed from: B1 */
        LiveData mo41933B1();

        /* renamed from: I1 */
        LiveData mo41934I1();

        /* renamed from: Lh */
        LiveData mo41936Lh();

        /* renamed from: Pd */
        LiveData mo41938Pd();

        /* renamed from: co */
        LiveData mo41944co();

        /* renamed from: f8 */
        LiveData mo41945f8();

        /* renamed from: g5 */
        LiveData mo41946g5();

        /* renamed from: i2 */
        LiveData mo41949i2();

        /* renamed from: pg */
        LiveData mo41950pg();

        /* renamed from: x */
        LiveData mo41959x();
    }
}
