package p341ge.bog.mobilebank.giftcards.presentation.chooseanimation;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import di0.C20021m;
import di0.C20022n;
import di0.C20023o;
import di0.C20024p;
import ed1.C40749p;
import ed1.C40754t;
import g91.C32343x;
import gi0.C24726a;
import gi0.C24727b;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import hi0.C25028a;
import hi0.C25029b;
import hi0.C25030c;
import hi0.C25031d;
import hi0.C25032e;
import ii0.C25214a;
import ii0.C25215b;
import j51.C36734f;
import java.util.Iterator;
import java.util.List;
import jj0.C25459a;
import k51.C36874b;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.giftcards.presentation.activity.GiftCardFlowMode;
import p341ge.bog.mobilebank.giftcards.presentation.activity.GiftCardsFlow;
import p341ge.bog.mobilebank.giftcards.presentation.chooseanimation.C24133a;
import p341ge.bog.mobilebank.shared2.network.models.BffApiError;
import ue1.C43075l;
import vh0.C29075a;
import vh0.C29076b;
import wh0.C29398f;
import wh0.C29399g;
import wh0.C29400h;
import wh0.C29412s;
import wh0.C29413t;
import wh0.C29414u;
import wh0.C29416w;
import wh0.C29419z;
import xh0.C29780a;
import xh0.C29793j;
import xh0.C29800p;

/* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.c */
public final class C24142c extends C21481a {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public final C1644x f62535A = new C1644x(new C25029b(false, false, 3, (DefaultConstructorMarker) null));

    /* renamed from: B */
    private final C1644x f62536B;

    /* renamed from: C */
    private final C1644x f62537C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public boolean f62538D;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final GiftCardsFlow.Animations f62539d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C25214a f62540e;

    /* renamed from: f */
    private final C24727b f62541f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C25459a f62542g;

    /* renamed from: h */
    private final C25215b f62543h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C24726a f62544i;

    /* renamed from: j */
    private final C36734f f62545j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C29399g f62546k;

    /* renamed from: l */
    private final C29419z f62547l;

    /* renamed from: m */
    private final C29400h f62548m;

    /* renamed from: n */
    private final C29412s f62549n;

    /* renamed from: o */
    private final C29398f f62550o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C29414u f62551p;

    /* renamed from: q */
    private final C29416w f62552q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final C29413t f62553r;

    /* renamed from: s */
    private final C1644x f62554s = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final C1644x f62555t = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: u */
    public final C1644x f62556u = new C1644x();

    /* renamed from: v */
    private final C1644x f62557v = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: w */
    public final C1644x f62558w = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: x */
    public final C1644x f62559x = new C1644x(new C25031d(false, 1, (DefaultConstructorMarker) null));
    /* access modifiers changed from: private */

    /* renamed from: y */
    public final C1644x f62560y = new C1644x();

    /* renamed from: z */
    private final C1644x f62561z = new C1644x();

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.c$a */
    static final class C24143a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C24142c f62562d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24143a(C24142c cVar) {
            super(1);
            this.f62562d = cVar;
        }

        /* renamed from: a */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "requestCode");
            return C31270e.m92880i(this.f62562d.f62546k.mo69240a("GIFT_CARD_SKIN"), num.intValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.c$b */
    static final class C24144b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C24142c f62563d;

        /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.c$b$a */
        static final class C24145a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C24142c f62564d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24145a(C24142c cVar) {
                super(1);
                this.f62564d = cVar;
            }

            /* renamed from: a */
            public final void mo61747a(List list) {
                C41536l.m120489i(list, "giftCardDesigns");
                C24142c cVar = this.f62564d;
                cVar.m77810Xw(cVar.f62555t, this.f62564d.f62542g.mo64029c(list, this.f62564d.f62539d.mo61589d().mo61778g(), this.f62564d.f62539d.mo61589d().mo61771a()));
                this.f62564d.m77807Sw();
                this.f62564d.m77813bx(list);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo61747a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24144b(C24142c cVar) {
            super(1);
            this.f62563d = cVar;
        }

        /* renamed from: a */
        public final void mo61746a(C31128a aVar) {
            C24142c cVar = this.f62563d;
            C1644x rw = cVar.f62558w;
            C41536l.m120488h(aVar, "result");
            cVar.m77810Xw(rw, aVar);
            C31132b.m92648j(aVar, (int[]) null, new C24145a(this.f62563d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo61746a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.c$c */
    public interface C24146c {
        /* renamed from: a */
        C24142c mo32822a(GiftCardsFlow.Animations animations);
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.c$d */
    static final class C24147d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C24142c f62565d;

        /* renamed from: e */
        final /* synthetic */ C29800p f62566e;

        /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.c$d$a */
        static final class C24148a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C31128a f62567d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24148a(C31128a aVar) {
                super(1);
                this.f62567d = aVar;
            }

            /* renamed from: a */
            public final C25031d invoke(C25031d dVar) {
                return dVar.mo63451a(this.f62567d instanceof C31128a.C31130b);
            }
        }

        /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.c$d$b */
        static final class C24149b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C24142c f62568d;

            /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.c$d$b$a */
            static final class C24150a extends C41537m implements C43075l {

                /* renamed from: d */
                public static final C24150a f62569d = new C24150a();

                C24150a() {
                    super(1);
                }

                /* renamed from: a */
                public final C25029b invoke(C25029b bVar) {
                    return bVar.mo63439a(false, false);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24149b(C24142c cVar) {
                super(1);
                this.f62568d = cVar;
            }

            /* renamed from: a */
            public final void mo61750a(C29793j jVar) {
                C24142c cVar = this.f62568d;
                cVar.m77815dx(cVar.f62535A, C24150a.f62569d);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo61750a((C29793j) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.c$d$c */
        static final class C24151c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C24142c f62570d;

            /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.c$d$c$a */
            static final class C24152a extends C41537m implements C43075l {

                /* renamed from: d */
                final /* synthetic */ C24142c f62571d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C24152a(C24142c cVar) {
                    super(1);
                    this.f62571d = cVar;
                }

                /* renamed from: a */
                public final C25029b invoke(C25029b bVar) {
                    return bVar.mo63439a(!this.f62571d.f62538D, true);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24151c(C24142c cVar) {
                super(1);
                this.f62570d = cVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "error");
                C24142c cVar = this.f62570d;
                cVar.m77815dx(cVar.f62535A, new C24152a(this.f62570d));
                C37224b.m109966e(this.f62570d.f62556u, new C24133a.C24138e(th));
            }
        }

        /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.c$d$d */
        static final class C24153d extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C24142c f62572d;

            /* renamed from: e */
            final /* synthetic */ C29800p f62573e;

            /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.c$d$d$a */
            static final class C24154a extends C41537m implements C43075l {

                /* renamed from: d */
                public static final C24154a f62574d = new C24154a();

                C24154a() {
                    super(1);
                }

                /* renamed from: a */
                public final C25029b invoke(C25029b bVar) {
                    return bVar.mo63439a(true, true);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24153d(C24142c cVar, C29800p pVar) {
                super(1);
                this.f62572d = cVar;
                this.f62573e = pVar;
            }

            /* renamed from: a */
            public final void mo61754a(C29793j jVar) {
                C41536l.m120489i(jVar, "giftCardOfferDetails");
                this.f62572d.f62551p.mo69254a(jVar);
                this.f62572d.f62553r.mo69253a(this.f62573e.mo70048a());
                C24142c cVar = this.f62572d;
                cVar.m77815dx(cVar.f62535A, C24154a.f62574d);
                C37224b.m109966e(this.f62572d.f62556u, C24133a.C24135b.f62529a);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo61754a((C29793j) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24147d(C24142c cVar, C29800p pVar) {
            super(1);
            this.f62565d = cVar;
            this.f62566e = pVar;
        }

        /* renamed from: a */
        public final void mo61748a(C31128a aVar) {
            C24142c cVar = this.f62565d;
            C29800p pVar = this.f62566e;
            cVar.m77815dx(cVar.f62559x, new C24148a(aVar));
            C41536l.m120488h(aVar, "invoke$lambda$0");
            C31132b.m92646h(aVar, (int[]) null, new C24149b(cVar), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C24151c(cVar), 1, (Object) null);
            C31132b.m92648j(aVar, (int[]) null, new C24153d(cVar, pVar), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo61748a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.c$e */
    static final class C24155e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ boolean f62575d;

        /* renamed from: e */
        final /* synthetic */ String f62576e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24155e(boolean z, String str) {
            super(1);
            this.f62575d = z;
            this.f62576e = str;
        }

        /* renamed from: a */
        public final C25030c invoke(C25030c cVar) {
            String str;
            C41536l.m120489i(cVar, "state");
            if (this.f62575d) {
                str = this.f62576e;
            } else {
                str = "";
            }
            return C25030c.m79960b(cVar, false, str, 1, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.c$f */
    static final class C24156f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ boolean f62577d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24156f(boolean z) {
            super(1);
            this.f62577d = z;
        }

        /* renamed from: a */
        public final C25029b invoke(C25029b bVar) {
            C41536l.m120488h(bVar, "state");
            return C25029b.m79956b(bVar, !this.f62577d, false, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.c$g */
    static final class C24157g extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C24157g f62578d = new C24157g();

        C24157g() {
            super(1);
        }

        /* renamed from: a */
        public final C25031d invoke(C25031d dVar) {
            return dVar.mo63451a(false);
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.c$h */
    static final class C24158h extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C24158h f62579d = new C24158h();

        C24158h() {
            super(1);
        }

        /* renamed from: a */
        public final C25029b invoke(C25029b bVar) {
            return bVar.mo63439a(true, true);
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.c$i */
    static final class C24159i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C24142c f62580d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24159i(C24142c cVar) {
            super(1);
            this.f62580d = cVar;
        }

        /* renamed from: a */
        public final C25030c invoke(C25030c cVar) {
            C41536l.m120489i(cVar, "state");
            return C25030c.m79960b(cVar, this.f62580d.f62540e.mo63740a(), (String) null, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.c$j */
    static final class C24160j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ boolean f62581d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24160j(boolean z) {
            super(1);
            this.f62581d = z;
        }

        /* renamed from: a */
        public final C25030c invoke(C25030c cVar) {
            C41536l.m120489i(cVar, "state");
            return C25030c.m79960b(cVar, this.f62581d, (String) null, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.c$k */
    static final class C24161k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C24142c f62582d;

        /* renamed from: e */
        final /* synthetic */ C25032e f62583e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24161k(C24142c cVar, C25032e eVar) {
            super(1);
            this.f62582d = cVar;
            this.f62583e = eVar;
        }

        /* renamed from: a */
        public final C25030c invoke(C25030c cVar) {
            C41536l.m120489i(cVar, "inputState");
            return C25030c.m79960b(cVar, false, this.f62582d.f62544i.mo63117a(this.f62583e.mo63457b()), 1, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.c$l */
    static final class C24162l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C24142c f62584d;

        /* renamed from: e */
        final /* synthetic */ C25028a f62585e;

        /* renamed from: f */
        final /* synthetic */ String f62586f;

        /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.c$l$a */
        static final class C24163a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C24142c f62587d;

            /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.c$l$a$a */
            static final class C24164a extends C41537m implements C43075l {

                /* renamed from: d */
                public static final C24164a f62588d = new C24164a();

                C24164a() {
                    super(1);
                }

                /* renamed from: a */
                public final C25029b invoke(C25029b bVar) {
                    return bVar.mo63439a(false, false);
                }
            }

            /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.c$l$a$b */
            static final class C24165b extends C41537m implements C43075l {

                /* renamed from: d */
                public static final C24165b f62589d = new C24165b();

                C24165b() {
                    super(1);
                }

                /* renamed from: a */
                public final C25031d invoke(C25031d dVar) {
                    return dVar.mo63451a(true);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24163a(C24142c cVar) {
                super(1);
                this.f62587d = cVar;
            }

            /* renamed from: a */
            public final void mo61764a(C29800p pVar) {
                C24142c cVar = this.f62587d;
                cVar.m77815dx(cVar.f62535A, C24164a.f62588d);
                C24142c cVar2 = this.f62587d;
                cVar2.m77815dx(cVar2.f62559x, C24165b.f62589d);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo61764a((C29800p) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.c$l$b */
        static final class C24166b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C24142c f62590d;

            /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.c$l$b$a */
            static final class C24167a extends C41537m implements C43075l {

                /* renamed from: d */
                final /* synthetic */ C24142c f62591d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C24167a(C24142c cVar) {
                    super(1);
                    this.f62591d = cVar;
                }

                /* renamed from: a */
                public final C25029b invoke(C25029b bVar) {
                    return bVar.mo63439a(!this.f62591d.f62538D, true);
                }
            }

            /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.c$l$b$b */
            static final class C24168b extends C41537m implements C43075l {

                /* renamed from: d */
                public static final C24168b f62592d = new C24168b();

                C24168b() {
                    super(1);
                }

                /* renamed from: a */
                public final C25031d invoke(C25031d dVar) {
                    return dVar.mo63451a(false);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24166b(C24142c cVar) {
                super(1);
                this.f62590d = cVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "error");
                C24142c cVar = this.f62590d;
                cVar.m77815dx(cVar.f62535A, new C24167a(this.f62590d));
                if (th instanceof BffApiError) {
                    C24142c cVar2 = this.f62590d;
                    cVar2.m77810Xw(cVar2.f62560y, C32343x.m95388F(((BffApiError) th).mo84716b(), new Object[0]));
                } else {
                    C37224b.m109965d(this.f62590d.f62556u, new C24133a.C24138e(th));
                }
                C24142c cVar3 = this.f62590d;
                cVar3.m77815dx(cVar3.f62559x, C24168b.f62592d);
            }
        }

        /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.c$l$c */
        static final class C24169c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C25028a f62593d;

            /* renamed from: e */
            final /* synthetic */ C24142c f62594e;

            /* renamed from: f */
            final /* synthetic */ String f62595f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24169c(C25028a aVar, C24142c cVar, String str) {
                super(1);
                this.f62593d = aVar;
                this.f62594e = cVar;
                this.f62595f = str;
            }

            /* renamed from: a */
            public final void mo61770a(C29800p pVar) {
                C41238w wVar;
                C41536l.m120489i(pVar, "phoneNumberValidationResult");
                if (this.f62593d != null) {
                    C24142c cVar = this.f62594e;
                    String str = this.f62595f;
                    if (C41536l.m120484d(cVar.f62539d.mo61588b(), GiftCardFlowMode.GiveAwayGiftCard.f62412d)) {
                        cVar.m77806Qw(pVar);
                    } else {
                        cVar.m77808Tw(str, pVar);
                    }
                    wVar = C41238w.f97225a;
                } else {
                    wVar = null;
                }
                if (wVar == null) {
                    C24142c cVar2 = this.f62594e;
                    cVar2.m77811Zw();
                    if (C41536l.m120484d(cVar2.f62539d.mo61588b(), GiftCardFlowMode.GiveAwayGiftCard.f62412d) && !pVar.mo70050c()) {
                        cVar2.m77810Xw(cVar2.f62560y, C32343x.m95388F("giftcard.giveaway.application.phone.validation.text", new Object[0]));
                    }
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo61770a((C29800p) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24162l(C24142c cVar, C25028a aVar, String str) {
            super(1);
            this.f62584d = cVar;
            this.f62585e = aVar;
            this.f62586f = str;
        }

        /* renamed from: a */
        public final void mo61763a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92646h(aVar, (int[]) null, new C24163a(this.f62584d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C24166b(this.f62584d), 1, (Object) null);
            C31132b.m92648j(aVar, (int[]) null, new C24169c(this.f62585e, this.f62584d, this.f62586f), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo61763a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24142c(GiftCardsFlow.Animations animations, C25214a aVar, C24727b bVar, C25459a aVar2, C25215b bVar2, C24726a aVar3, C36734f fVar, C29399g gVar, C29419z zVar, C29400h hVar, C29412s sVar, C29398f fVar2, C29414u uVar, C29416w wVar, C29413t tVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        GiftCardsFlow.Animations animations2 = animations;
        C25214a aVar4 = aVar;
        C24727b bVar3 = bVar;
        C25459a aVar5 = aVar2;
        C25215b bVar4 = bVar2;
        C24726a aVar6 = aVar3;
        C36734f fVar3 = fVar;
        C29399g gVar2 = gVar;
        C29419z zVar2 = zVar;
        C29400h hVar2 = hVar;
        C29412s sVar2 = sVar;
        C29398f fVar4 = fVar2;
        C29414u uVar2 = uVar;
        C41536l.m120489i(animations2, "animationsData");
        C41536l.m120489i(aVar4, "checkContactsPermission");
        C41536l.m120489i(bVar3, "phoneContactsUiMapper");
        C41536l.m120489i(aVar5, "giftCardsAnimationsUiMapper");
        C41536l.m120489i(bVar4, "createCursor");
        C41536l.m120489i(aVar6, "chosenContactMapper");
        C41536l.m120489i(fVar3, "getClientPhonesUseCase");
        C41536l.m120489i(gVar2, "getExternalFileUseCase");
        C41536l.m120489i(zVar2, "validatePhoneNumberUseCase");
        C41536l.m120489i(hVar2, "getGiftCardOfferDetailsUseCase");
        C41536l.m120489i(sVar2, "saveChooseAnimationInfoUseCase");
        C41536l.m120489i(fVar4, "getDraftPurchaseModel");
        C41536l.m120489i(uVar2, "saveGiftCardOfferDetailsUseCase");
        C41536l.m120489i(wVar, "saveOwnerUseCase");
        C41536l.m120489i(tVar, "saveDstClientKey");
        boolean z = true;
        this.f62539d = animations2;
        this.f62540e = aVar4;
        this.f62541f = bVar3;
        this.f62542g = aVar5;
        this.f62543h = bVar4;
        this.f62544i = aVar6;
        this.f62545j = fVar3;
        this.f62546k = gVar2;
        this.f62547l = zVar2;
        this.f62548m = hVar2;
        this.f62549n = sVar2;
        this.f62550o = fVar4;
        this.f62551p = uVar2;
        this.f62552q = wVar;
        this.f62553r = tVar;
        this.f62536B = new C1644x(Boolean.valueOf(animations.mo61588b() instanceof GiftCardFlowMode.PurchaseGiftCard));
        List e = animations.mo61589d().mo61775e();
        this.f62537C = new C1644x(Boolean.valueOf((e == null || !(e.isEmpty() ^ true)) ? false : z));
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C20021m(new C24143a(this)));
        C41536l.m120488h(L0, "merge(onInit(), onRefres…equestCode)\n            }");
        C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C20022n(new C24144b(this)));
        C41536l.m120488h(F0, "merge(onInit(), onRefres…      }\n                }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Qw */
    public final void m77806Qw(C29800p pVar) {
        m77811Zw();
        if (pVar.mo70050c()) {
            this.f62553r.mo69253a(pVar.mo70048a());
            C29416w wVar = this.f62552q;
            String b = pVar.mo70049b();
            if (b == null) {
                b = "";
            }
            wVar.mo69256a(b);
            C37224b.m109966e(this.f62556u, C24133a.C24136c.f62530a);
            return;
        }
        m77810Xw(this.f62560y, C32343x.m95388F("giftcard.giveaway.application.phone.validation.text", new Object[0]));
    }

    /* access modifiers changed from: private */
    /* renamed from: Sw */
    public final void m77807Sw() {
        m77810Xw(this.f62557v, new C25030c(this.f62540e.mo63740a(), (String) null, 2, (DefaultConstructorMarker) null));
        if (this.f62540e.mo63740a()) {
            m77810Xw(this.f62554s, this.f62541f.mo63118b(C25215b.m80278b(this.f62543h, (String) null, 1, (Object) null)));
        } else {
            C37224b.m109966e(this.f62556u, C24133a.C24137d.f62531a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Tw */
    public final void m77808Tw(String str, C29800p pVar) {
        C29400h hVar = this.f62548m;
        long f = this.f62539d.mo61589d().mo61777f();
        boolean z = this.f62538D;
        if (str == null) {
            str = "";
        }
        C41205b F0 = C32343x.m95413R0(C31270e.m92880i(hVar.mo69241a(f, z, str), -1)).mo94981F0(new C20024p(new C24147d(this, pVar)));
        C41536l.m120488h(F0, "private fun handlePurcha…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Uw */
    public static final void m77809Uw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Xw */
    public final void m77810Xw(C1644x xVar, Object obj) {
        xVar.mo4826r(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Zw */
    public final void m77811Zw() {
        m77815dx(this.f62559x, C24157g.f62578d);
        m77815dx(this.f62535A, C24158h.f62579d);
    }

    /* renamed from: ax */
    private final void m77812ax(String str, C25028a aVar) {
        C29076b bVar;
        C29412s sVar = this.f62549n;
        long f = this.f62539d.mo61589d().mo61777f();
        boolean z = this.f62538D;
        C29075a aVar2 = new C29075a(aVar.mo63433f(), aVar.mo63430d(), aVar.mo63435h(), aVar.mo63431e());
        String h = this.f62539d.mo61589d().mo61779h();
        if (this.f62539d.mo61588b() instanceof GiftCardFlowMode.PurchaseGiftCard) {
            bVar = C29076b.PURCHASE;
        } else {
            bVar = C29076b.GIVE_AWAY;
        }
        sVar.mo69252a(f, str, z, aVar2, h, bVar, this.f62539d.mo61589d().mo61771a(), this.f62539d.mo61589d().mo61772b(), this.f62539d.mo61589d().mo61773d());
    }

    /* access modifiers changed from: private */
    /* renamed from: bx */
    public final void m77813bx(List list) {
        boolean z;
        C29075a g = this.f62550o.mo69239a().mo68941g();
        if (g != null) {
            long c = g.mo68930c();
            Iterator it = list.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (((C29780a) it.next()).mo69942d() == c) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    break;
                }
                i++;
            }
            m77810Xw(this.f62561z, Integer.valueOf(i));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: dx */
    public final void m77815dx(C1644x xVar, C43075l lVar) {
        Object f = xVar.mo4814f();
        if (f != null) {
            xVar.mo4826r(lVar.invoke(f));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: hw */
    public static final C40754t m77819hw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: hx */
    private final void m77820hx(String str, C25028a aVar) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        C41536l.m120488h(sb2, "filterTo(StringBuilder(), predicate).toString()");
        C41205b F0 = C31270e.m92880i(C32343x.m95415S0(this.f62547l.mo69258a(sb2)), -1).mo94981F0(new C20023o(new C24162l(this, aVar, sb2)));
        C41536l.m120488h(F0, "private fun validatePhon…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: iw */
    public static final void m77821iw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: ix */
    static /* synthetic */ void m77822ix(C24142c cVar, String str, C25028a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            aVar = null;
        }
        cVar.m77820hx(str, aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: jx */
    public static final void m77824jx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Ew */
    public LiveData mo61725Ew() {
        return this.f62555t;
    }

    /* renamed from: Fw */
    public LiveData mo61726Fw() {
        return this.f62536B;
    }

    /* renamed from: Gw */
    public LiveData mo61727Gw() {
        return this.f62558w;
    }

    /* renamed from: Hw */
    public LiveData mo61728Hw() {
        return this.f62556u;
    }

    /* renamed from: Iw */
    public LiveData mo61729Iw() {
        return this.f62535A;
    }

    /* renamed from: Jw */
    public LiveData mo61730Jw() {
        return this.f62560y;
    }

    /* renamed from: Kw */
    public LiveData mo61731Kw() {
        return this.f62557v;
    }

    /* renamed from: Lw */
    public LiveData mo61732Lw() {
        return this.f62559x;
    }

    /* renamed from: Mw */
    public void mo61733Mw(String str) {
        C41536l.m120489i(str, "query");
        m77810Xw(this.f62554s, this.f62541f.mo63118b(this.f62543h.mo63741a(str)));
    }

    /* renamed from: Nw */
    public LiveData mo61734Nw() {
        return this.f62554s;
    }

    /* renamed from: Ow */
    public LiveData mo61735Ow() {
        return this.f62537C;
    }

    /* renamed from: Pw */
    public LiveData mo61736Pw() {
        return this.f62561z;
    }

    /* renamed from: Rw */
    public void mo61737Rw(String str, C25028a aVar) {
        C41536l.m120489i(str, "inputText");
        C41536l.m120489i(aVar, "animationUiModel");
        m77812ax(str, aVar);
        m77820hx(str, aVar);
    }

    /* renamed from: Vw */
    public void mo61738Vw() {
        C37224b.m109966e(this.f62556u, C24133a.C24134a.f62528a);
    }

    /* renamed from: Ww */
    public void mo61739Ww() {
        List e = this.f62539d.mo61589d().mo61775e();
        if (e == null) {
            e = C41341q.m119907j();
        }
        C37224b.m109966e(this.f62556u, new C24133a.C24140g(e));
    }

    /* renamed from: Yw */
    public void mo61740Yw(boolean z) {
        String str;
        Object obj;
        this.f62538D = z;
        C24726a aVar = this.f62544i;
        Iterator it = this.f62545j.mo89561a().iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C36874b) obj).mo89807b()) {
                break;
            }
        }
        C36874b bVar = (C36874b) obj;
        if (bVar != null) {
            str = bVar.mo89806a();
        }
        if (str == null) {
            str = "";
        }
        m77815dx(this.f62557v, new C24155e(z, aVar.mo63117a(str)));
        m77815dx(this.f62535A, new C24156f(z));
    }

    /* renamed from: cx */
    public void mo61741cx() {
        C37224b.m109966e(this.f62556u, C24133a.C24139f.f62533a);
    }

    /* renamed from: ex */
    public void mo61742ex() {
        m77815dx(this.f62557v, new C24159i(this));
    }

    /* renamed from: fx */
    public void mo61743fx(boolean z) {
        m77815dx(this.f62557v, new C24160j(z));
    }

    /* renamed from: gx */
    public void mo61744gx(C25032e eVar) {
        C41536l.m120489i(eVar, "contact");
        m77815dx(this.f62557v, new C24161k(this, eVar));
        m77822ix(this, eVar.mo63457b(), (C25028a) null, 2, (Object) null);
    }
}
