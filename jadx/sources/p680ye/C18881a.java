package p680ye;

import af1.C40303i;
import be1.C40330c;
import ed1.C40741h;
import ed1.C40757w;
import hd1.C41205b;
import he1.C41217g;
import he1.C41238w;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41545u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p375cf.C10415c;
import p404ef.C12437a;
import p639ve.C18310a;
import p652we.C18523b;
import p652we.C18532c;
import p652we.C18539d;
import p652we.C18548g;
import p652we.C18551i;
import p652we.C18561l;
import p694ze.C19015a;
import p694ze.C19016b;
import p694ze.C19017c;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ye.a */
public final class C18881a {

    /* renamed from: a */
    private final C18884b f52838a;

    /* renamed from: ye.a$a */
    public static final class C18882a {

        /* renamed from: f */
        static final /* synthetic */ C40303i[] f52839f = {C41520a0.m120441g(new C41545u(C41520a0.m120436b(C18882a.class), "sharedLifecycle", "getSharedLifecycle()Lcom/tinder/scarlet/Lifecycle;"))};

        /* renamed from: a */
        private final C41217g f52840a = C41219i.m119470b(new C18883a(this));

        /* renamed from: b */
        private final C18532c f52841b;

        /* renamed from: c */
        private final C18561l.C18568b f52842c;

        /* renamed from: d */
        private final C12437a f52843d;

        /* renamed from: e */
        private final C40757w f52844e;

        /* renamed from: ye.a$a$a */
        static final class C18883a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C18882a f52845d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C18883a(C18882a aVar) {
                super(0);
                this.f52845d = aVar;
            }

            /* renamed from: b */
            public final C10415c invoke() {
                return this.f52845d.m63907c();
            }
        }

        public C18882a(C18532c cVar, C18561l.C18568b bVar, C12437a aVar, C40757w wVar) {
            C41536l.m120490j(cVar, "lifecycle");
            C41536l.m120490j(bVar, "webSocketFactory");
            C41536l.m120490j(aVar, "backoffStrategy");
            C41536l.m120490j(wVar, "scheduler");
            this.f52841b = cVar;
            this.f52842c = bVar;
            this.f52843d = aVar;
            this.f52844e = wVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public final C10415c m63907c() {
            C10415c cVar = new C10415c(0, 1, (DefaultConstructorMarker) null);
            this.f52841b.mo26347a(cVar);
            return cVar;
        }

        /* renamed from: d */
        private final C18532c m63908d() {
            C41217g gVar = this.f52840a;
            C40303i iVar = f52839f[0];
            return (C18532c) gVar.getValue();
        }

        /* renamed from: b */
        public final C18881a mo46879b() {
            return new C18881a(new C18884b(m63908d(), this.f52842c, this.f52843d, this.f52844e));
        }
    }

    /* renamed from: ye.a$b */
    public static final class C18884b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C19015a f52846a = new C19015a(this);
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C40330c f52847b;

        /* renamed from: c */
        private final C18310a f52848c;

        /* renamed from: d */
        private final C18532c f52849d;

        /* renamed from: e */
        private final C18561l.C18568b f52850e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final C12437a f52851f;

        /* renamed from: g */
        private final C40757w f52852g;

        /* renamed from: ye.a$b$a */
        static final class C18885a extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C18885a f52853d = new C18885a();

            C18885a() {
                super(1);
            }

            /* renamed from: a */
            public final boolean mo46885a(C18523b.C18524a.C18525a aVar) {
                C41536l.m120490j(aVar, "$receiver");
                return C41536l.m120484d(aVar.mo46335a(), C18532c.C18533a.C18535b.f52030a);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(mo46885a((C18523b.C18524a.C18525a) obj));
            }
        }

        /* renamed from: ye.a$b$b */
        static final class C18886b extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C18886b f52854d = new C18886b();

            C18886b() {
                super(1);
            }

            /* renamed from: a */
            public final boolean mo46886a(C18523b.C18524a.C18525a aVar) {
                C41536l.m120490j(aVar, "$receiver");
                return aVar.mo46335a() instanceof C18532c.C18533a.C18536c;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(mo46886a((C18523b.C18524a.C18525a) obj));
            }
        }

        /* renamed from: ye.a$b$c */
        static final class C18887c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C18884b f52855d;

            /* renamed from: ye.a$b$c$a */
            static final class C18888a extends C41537m implements C43075l {

                /* renamed from: d */
                final /* synthetic */ C18887c f52856d;

                /* renamed from: ye.a$b$c$a$a */
                static final class C18889a extends C41537m implements C43079p {

                    /* renamed from: d */
                    final /* synthetic */ C18888a f52857d;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C18889a(C18888a aVar) {
                        super(2);
                        this.f52857d = aVar;
                    }

                    /* renamed from: a */
                    public final void mo46889a(C18551i.C18555d dVar, C18523b bVar) {
                        C41536l.m120490j(dVar, "$receiver");
                        C41536l.m120490j(bVar, "it");
                        this.f52857d.f52856d.f52855d.m63927t();
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        mo46889a((C18551i.C18555d) obj, (C18523b) obj2);
                        return C41238w.f97225a;
                    }
                }

                /* renamed from: ye.a$b$c$a$b */
                static final class C18890b extends C41537m implements C43079p {

                    /* renamed from: d */
                    final /* synthetic */ C18888a f52858d;

                    /* renamed from: e */
                    final /* synthetic */ C18310a.C18315c.C18316a f52859e;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C18890b(C18888a aVar, C18310a.C18315c.C18316a aVar2) {
                        super(2);
                        this.f52858d = aVar;
                        this.f52859e = aVar2;
                    }

                    /* renamed from: a */
                    public final C18310a.C18312b.C18313a.C18314a invoke(C18551i.C18555d dVar, C18523b.C18524a.C18525a aVar) {
                        C41536l.m120490j(dVar, "$receiver");
                        C41536l.m120490j(aVar, "it");
                        return C18310a.C18315c.C18316a.m62647g(this.f52859e, dVar, new C18551i.C18553b(this.f52858d.f52856d.f52855d.m63926s(), 0), (Object) null, 2, (Object) null);
                    }
                }

                /* renamed from: ye.a$b$c$a$c */
                static final class C18891c extends C41537m implements C43079p {

                    /* renamed from: d */
                    final /* synthetic */ C18888a f52860d;

                    /* renamed from: e */
                    final /* synthetic */ C18310a.C18315c.C18316a f52861e;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C18891c(C18888a aVar, C18310a.C18315c.C18316a aVar2) {
                        super(2);
                        this.f52860d = aVar;
                        this.f52861e = aVar2;
                    }

                    /* renamed from: a */
                    public final C18310a.C18312b.C18313a.C18314a invoke(C18551i.C18555d dVar, C18523b.C18524a.C18525a aVar) {
                        C41536l.m120490j(dVar, "$receiver");
                        C41536l.m120490j(aVar, "it");
                        this.f52860d.f52856d.f52855d.m63927t();
                        return C18310a.C18315c.C18316a.m62646c(this.f52861e, dVar, (Object) null, 1, (Object) null);
                    }
                }

                /* renamed from: ye.a$b$c$a$d */
                static final class C18892d extends C41537m implements C43079p {

                    /* renamed from: d */
                    final /* synthetic */ C18310a.C18315c.C18316a f52862d;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C18892d(C18310a.C18315c.C18316a aVar) {
                        super(2);
                        this.f52862d = aVar;
                    }

                    /* renamed from: a */
                    public final C18310a.C18312b.C18313a.C18314a invoke(C18551i.C18555d dVar, C18523b.C18524a.C18526b bVar) {
                        C41536l.m120490j(dVar, "$receiver");
                        C41536l.m120490j(bVar, "it");
                        return C18310a.C18315c.C18316a.m62647g(this.f52862d, dVar, C18551i.C18554c.f52063a, (Object) null, 2, (Object) null);
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C18888a(C18887c cVar) {
                    super(1);
                    this.f52856d = cVar;
                }

                /* renamed from: a */
                public final void mo46888a(C18310a.C18315c.C18316a aVar) {
                    C41536l.m120490j(aVar, "$receiver");
                    aVar.mo46081e(new C18889a(this));
                    aVar.mo46080d(this.f52856d.f52855d.m63924p(), new C18890b(this, aVar));
                    aVar.mo46080d(this.f52856d.f52855d.m63925q(), new C18891c(this, aVar));
                    aVar.mo46080d(C18310a.C18319d.f51764c.mo46087a(C18523b.C18524a.C18526b.class), new C18892d(aVar));
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    mo46888a((C18310a.C18315c.C18316a) obj);
                    return C41238w.f97225a;
                }
            }

            /* renamed from: ye.a$b$c$b */
            static final class C18893b extends C41537m implements C43075l {

                /* renamed from: d */
                final /* synthetic */ C18887c f52863d;

                /* renamed from: ye.a$b$c$b$a */
                static final class C18894a extends C41537m implements C43079p {

                    /* renamed from: d */
                    final /* synthetic */ C18893b f52864d;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C18894a(C18893b bVar) {
                        super(2);
                        this.f52864d = bVar;
                    }

                    /* renamed from: a */
                    public final void mo46894a(C18551i.C18557f fVar, C18523b bVar) {
                        C41536l.m120490j(fVar, "$receiver");
                        C41536l.m120490j(bVar, "it");
                        this.f52864d.f52863d.f52855d.m63927t();
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        mo46894a((C18551i.C18557f) obj, (C18523b) obj2);
                        return C41238w.f97225a;
                    }
                }

                /* renamed from: ye.a$b$c$b$b */
                static final class C18895b extends C41537m implements C43079p {

                    /* renamed from: d */
                    final /* synthetic */ C18893b f52865d;

                    /* renamed from: e */
                    final /* synthetic */ C18310a.C18315c.C18316a f52866e;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C18895b(C18893b bVar, C18310a.C18315c.C18316a aVar) {
                        super(2);
                        this.f52865d = bVar;
                        this.f52866e = aVar;
                    }

                    /* renamed from: a */
                    public final C18310a.C18312b.C18313a.C18314a invoke(C18551i.C18557f fVar, C18523b.C18527b bVar) {
                        C41536l.m120490j(fVar, "$receiver");
                        C41536l.m120490j(bVar, "it");
                        C18548g h = this.f52865d.f52863d.f52855d.m63926s();
                        return C18310a.C18315c.C18316a.m62647g(this.f52866e, fVar, new C18551i.C18553b(h, fVar.mo46381a() + 1), (Object) null, 2, (Object) null);
                    }
                }

                /* renamed from: ye.a$b$c$b$c */
                static final class C18896c extends C41537m implements C43079p {

                    /* renamed from: d */
                    final /* synthetic */ C18893b f52867d;

                    /* renamed from: e */
                    final /* synthetic */ C18310a.C18315c.C18316a f52868e;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C18896c(C18893b bVar, C18310a.C18315c.C18316a aVar) {
                        super(2);
                        this.f52867d = bVar;
                        this.f52868e = aVar;
                    }

                    /* renamed from: a */
                    public final C18310a.C18312b.C18313a.C18314a invoke(C18551i.C18557f fVar, C18523b.C18524a.C18525a aVar) {
                        C41536l.m120490j(fVar, "$receiver");
                        C41536l.m120490j(aVar, "it");
                        this.f52867d.f52863d.f52855d.m63927t();
                        return C18310a.C18315c.C18316a.m62646c(this.f52868e, fVar, (Object) null, 1, (Object) null);
                    }
                }

                /* renamed from: ye.a$b$c$b$d */
                static final class C18897d extends C41537m implements C43079p {

                    /* renamed from: d */
                    final /* synthetic */ C18893b f52869d;

                    /* renamed from: e */
                    final /* synthetic */ C18310a.C18315c.C18316a f52870e;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C18897d(C18893b bVar, C18310a.C18315c.C18316a aVar) {
                        super(2);
                        this.f52869d = bVar;
                        this.f52870e = aVar;
                    }

                    /* renamed from: a */
                    public final C18310a.C18312b.C18313a.C18314a invoke(C18551i.C18557f fVar, C18523b.C18524a.C18525a aVar) {
                        C41536l.m120490j(fVar, "$receiver");
                        C41536l.m120490j(aVar, "it");
                        this.f52869d.f52863d.f52855d.m63922l(fVar);
                        return C18310a.C18315c.C18316a.m62647g(this.f52870e, fVar, C18551i.C18555d.f52064a, (Object) null, 2, (Object) null);
                    }
                }

                /* renamed from: ye.a$b$c$b$e */
                static final class C18898e extends C41537m implements C43079p {

                    /* renamed from: d */
                    final /* synthetic */ C18893b f52871d;

                    /* renamed from: e */
                    final /* synthetic */ C18310a.C18315c.C18316a f52872e;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C18898e(C18893b bVar, C18310a.C18315c.C18316a aVar) {
                        super(2);
                        this.f52871d = bVar;
                        this.f52872e = aVar;
                    }

                    /* renamed from: a */
                    public final C18310a.C18312b.C18313a.C18314a invoke(C18551i.C18557f fVar, C18523b.C18524a.C18526b bVar) {
                        C41536l.m120490j(fVar, "$receiver");
                        C41536l.m120490j(bVar, "it");
                        this.f52871d.f52863d.f52855d.m63922l(fVar);
                        return C18310a.C18315c.C18316a.m62647g(this.f52872e, fVar, C18551i.C18554c.f52063a, (Object) null, 2, (Object) null);
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C18893b(C18887c cVar) {
                    super(1);
                    this.f52863d = cVar;
                }

                /* renamed from: a */
                public final void mo46893a(C18310a.C18315c.C18316a aVar) {
                    C41536l.m120490j(aVar, "$receiver");
                    aVar.mo46081e(new C18894a(this));
                    C18895b bVar = new C18895b(this, aVar);
                    C18310a.C18319d.C18320a aVar2 = C18310a.C18319d.f51764c;
                    aVar.mo46080d(aVar2.mo46087a(C18523b.C18527b.class), bVar);
                    aVar.mo46080d(this.f52863d.f52855d.m63924p(), new C18896c(this, aVar));
                    aVar.mo46080d(this.f52863d.f52855d.m63925q(), new C18897d(this, aVar));
                    aVar.mo46080d(aVar2.mo46087a(C18523b.C18524a.C18526b.class), new C18898e(this, aVar));
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    mo46893a((C18310a.C18315c.C18316a) obj);
                    return C41238w.f97225a;
                }
            }

            /* renamed from: ye.a$b$c$c */
            static final class C18899c extends C41537m implements C43075l {

                /* renamed from: d */
                final /* synthetic */ C18887c f52873d;

                /* renamed from: ye.a$b$c$c$a */
                static final class C18900a extends C41537m implements C43079p {

                    /* renamed from: d */
                    final /* synthetic */ C18310a.C18315c.C18316a f52874d;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C18900a(C18310a.C18315c.C18316a aVar) {
                        super(2);
                        this.f52874d = aVar;
                    }

                    /* renamed from: a */
                    public final C18310a.C18312b.C18313a.C18314a invoke(C18551i.C18553b bVar, C18523b.C18529d.C18530a aVar) {
                        C41536l.m120490j(bVar, "$receiver");
                        C41536l.m120490j(aVar, "it");
                        return C18310a.C18315c.C18316a.m62647g(this.f52874d, bVar, new C18551i.C18552a(bVar.mo46377b()), (Object) null, 2, (Object) null);
                    }
                }

                /* renamed from: ye.a$b$c$c$b */
                static final class C18901b extends C41537m implements C43079p {

                    /* renamed from: d */
                    final /* synthetic */ C18899c f52875d;

                    /* renamed from: e */
                    final /* synthetic */ C18310a.C18315c.C18316a f52876e;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C18901b(C18899c cVar, C18310a.C18315c.C18316a aVar) {
                        super(2);
                        this.f52875d = cVar;
                        this.f52876e = aVar;
                    }

                    /* renamed from: a */
                    public final C18310a.C18312b.C18313a.C18314a invoke(C18551i.C18553b bVar, C18523b.C18529d.C18531b bVar2) {
                        C41536l.m120490j(bVar, "$receiver");
                        C41536l.m120490j(bVar2, "it");
                        long a = this.f52875d.f52873d.f52855d.f52851f.mo33049a(bVar.mo46376a());
                        C41205b j = this.f52875d.f52873d.f52855d.m63928u(a);
                        return C18310a.C18315c.C18316a.m62647g(this.f52876e, bVar, new C18551i.C18557f(j, bVar.mo46376a(), a), (Object) null, 2, (Object) null);
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C18899c(C18887c cVar) {
                    super(1);
                    this.f52873d = cVar;
                }

                /* renamed from: a */
                public final void mo46899a(C18310a.C18315c.C18316a aVar) {
                    C41536l.m120490j(aVar, "$receiver");
                    aVar.mo46080d(this.f52873d.f52855d.m63929w(), new C18900a(aVar));
                    aVar.mo46080d(C18310a.C18319d.f51764c.mo46087a(C18523b.C18529d.C18531b.class), new C18901b(this, aVar));
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    mo46899a((C18310a.C18315c.C18316a) obj);
                    return C41238w.f97225a;
                }
            }

            /* renamed from: ye.a$b$c$d */
            static final class C18902d extends C41537m implements C43075l {

                /* renamed from: d */
                final /* synthetic */ C18887c f52877d;

                /* renamed from: ye.a$b$c$d$a */
                static final class C18903a extends C41537m implements C43079p {

                    /* renamed from: d */
                    final /* synthetic */ C18902d f52878d;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C18903a(C18902d dVar) {
                        super(2);
                        this.f52878d = dVar;
                    }

                    /* renamed from: a */
                    public final void mo46903a(C18551i.C18552a aVar, C18523b bVar) {
                        C41536l.m120490j(aVar, "$receiver");
                        C41536l.m120490j(bVar, "it");
                        this.f52878d.f52877d.f52855d.m63927t();
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        mo46903a((C18551i.C18552a) obj, (C18523b) obj2);
                        return C41238w.f97225a;
                    }
                }

                /* renamed from: ye.a$b$c$d$b */
                static final class C18904b extends C41537m implements C43079p {

                    /* renamed from: d */
                    final /* synthetic */ C18902d f52879d;

                    /* renamed from: e */
                    final /* synthetic */ C18310a.C18315c.C18316a f52880e;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C18904b(C18902d dVar, C18310a.C18315c.C18316a aVar) {
                        super(2);
                        this.f52879d = dVar;
                        this.f52880e = aVar;
                    }

                    /* renamed from: a */
                    public final C18310a.C18312b.C18313a.C18314a invoke(C18551i.C18552a aVar, C18523b.C18524a.C18525a aVar2) {
                        C41536l.m120490j(aVar, "$receiver");
                        C41536l.m120490j(aVar2, "it");
                        this.f52879d.f52877d.f52855d.m63927t();
                        return C18310a.C18315c.C18316a.m62646c(this.f52880e, aVar, (Object) null, 1, (Object) null);
                    }
                }

                /* renamed from: ye.a$b$c$d$c */
                static final class C18905c extends C41537m implements C43079p {

                    /* renamed from: d */
                    final /* synthetic */ C18902d f52881d;

                    /* renamed from: e */
                    final /* synthetic */ C18310a.C18315c.C18316a f52882e;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C18905c(C18902d dVar, C18310a.C18315c.C18316a aVar) {
                        super(2);
                        this.f52881d = dVar;
                        this.f52882e = aVar;
                    }

                    /* renamed from: a */
                    public final C18310a.C18312b.C18313a.C18314a invoke(C18551i.C18552a aVar, C18523b.C18524a.C18525a aVar2) {
                        C41536l.m120490j(aVar, "$receiver");
                        C41536l.m120490j(aVar2, "it");
                        this.f52881d.f52877d.f52855d.m63923o(aVar, aVar2.mo46335a());
                        return C18310a.C18315c.C18316a.m62647g(this.f52882e, aVar, C18551i.C18556e.f52065a, (Object) null, 2, (Object) null);
                    }
                }

                /* renamed from: ye.a$b$c$d$d */
                static final class C18906d extends C41537m implements C43079p {

                    /* renamed from: d */
                    final /* synthetic */ C18310a.C18315c.C18316a f52883d;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C18906d(C18310a.C18315c.C18316a aVar) {
                        super(2);
                        this.f52883d = aVar;
                    }

                    /* renamed from: a */
                    public final C18310a.C18312b.C18313a.C18314a invoke(C18551i.C18552a aVar, C18523b.C18524a.C18526b bVar) {
                        C41536l.m120490j(aVar, "$receiver");
                        C41536l.m120490j(bVar, "it");
                        aVar.mo46372a().mo46363a().cancel();
                        return C18310a.C18315c.C18316a.m62647g(this.f52883d, aVar, C18551i.C18554c.f52063a, (Object) null, 2, (Object) null);
                    }
                }

                /* renamed from: ye.a$b$c$d$e */
                static final class C18907e extends C41537m implements C43079p {

                    /* renamed from: d */
                    final /* synthetic */ C18902d f52884d;

                    /* renamed from: e */
                    final /* synthetic */ C18310a.C18315c.C18316a f52885e;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C18907e(C18902d dVar, C18310a.C18315c.C18316a aVar) {
                        super(2);
                        this.f52884d = dVar;
                        this.f52885e = aVar;
                    }

                    /* renamed from: a */
                    public final C18310a.C18312b.C18313a.C18314a invoke(C18551i.C18552a aVar, C18523b.C18529d.C18531b bVar) {
                        C41536l.m120490j(aVar, "$receiver");
                        C41536l.m120490j(bVar, "it");
                        long a = this.f52884d.f52877d.f52855d.f52851f.mo33049a(0);
                        return C18310a.C18315c.C18316a.m62647g(this.f52885e, aVar, new C18551i.C18557f(this.f52884d.f52877d.f52855d.m63928u(a), 0, a), (Object) null, 2, (Object) null);
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C18902d(C18887c cVar) {
                    super(1);
                    this.f52877d = cVar;
                }

                /* renamed from: a */
                public final void mo46902a(C18310a.C18315c.C18316a aVar) {
                    C41536l.m120490j(aVar, "$receiver");
                    aVar.mo46081e(new C18903a(this));
                    aVar.mo46080d(this.f52877d.f52855d.m63924p(), new C18904b(this, aVar));
                    aVar.mo46080d(this.f52877d.f52855d.m63925q(), new C18905c(this, aVar));
                    C18906d dVar = new C18906d(aVar);
                    C18310a.C18319d.C18320a aVar2 = C18310a.C18319d.f51764c;
                    aVar.mo46080d(aVar2.mo46087a(C18523b.C18524a.C18526b.class), dVar);
                    aVar.mo46080d(aVar2.mo46087a(C18523b.C18529d.C18531b.class), new C18907e(this, aVar));
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    mo46902a((C18310a.C18315c.C18316a) obj);
                    return C41238w.f97225a;
                }
            }

            /* renamed from: ye.a$b$c$e */
            static final class C18908e extends C41537m implements C43075l {

                /* renamed from: d */
                public static final C18908e f52886d = new C18908e();

                /* renamed from: ye.a$b$c$e$a */
                static final class C18909a extends C41537m implements C43079p {

                    /* renamed from: d */
                    final /* synthetic */ C18310a.C18315c.C18316a f52887d;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C18909a(C18310a.C18315c.C18316a aVar) {
                        super(2);
                        this.f52887d = aVar;
                    }

                    /* renamed from: a */
                    public final C18310a.C18312b.C18313a.C18314a invoke(C18551i.C18556e eVar, C18523b.C18529d.C18531b bVar) {
                        C41536l.m120490j(eVar, "$receiver");
                        C41536l.m120490j(bVar, "it");
                        return C18310a.C18315c.C18316a.m62647g(this.f52887d, eVar, C18551i.C18555d.f52064a, (Object) null, 2, (Object) null);
                    }
                }

                C18908e() {
                    super(1);
                }

                /* renamed from: a */
                public final void mo46908a(C18310a.C18315c.C18316a aVar) {
                    C41536l.m120490j(aVar, "$receiver");
                    aVar.mo46080d(C18310a.C18319d.f51764c.mo46087a(C18523b.C18529d.C18531b.class), new C18909a(aVar));
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    mo46908a((C18310a.C18315c.C18316a) obj);
                    return C41238w.f97225a;
                }
            }

            /* renamed from: ye.a$b$c$f */
            static final class C18910f extends C41537m implements C43075l {

                /* renamed from: d */
                final /* synthetic */ C18887c f52888d;

                /* renamed from: ye.a$b$c$f$a */
                static final class C18911a extends C41537m implements C43079p {

                    /* renamed from: d */
                    final /* synthetic */ C18910f f52889d;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C18911a(C18910f fVar) {
                        super(2);
                        this.f52889d = fVar;
                    }

                    /* renamed from: a */
                    public final void mo46911a(C18551i.C18554c cVar, C18523b bVar) {
                        C41536l.m120490j(cVar, "$receiver");
                        C41536l.m120490j(bVar, "it");
                        this.f52889d.f52888d.f52855d.f52846a.dispose();
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        mo46911a((C18551i.C18554c) obj, (C18523b) obj2);
                        return C41238w.f97225a;
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C18910f(C18887c cVar) {
                    super(1);
                    this.f52888d = cVar;
                }

                /* renamed from: a */
                public final void mo46910a(C18310a.C18315c.C18316a aVar) {
                    C41536l.m120490j(aVar, "$receiver");
                    aVar.mo46081e(new C18911a(this));
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    mo46910a((C18310a.C18315c.C18316a) obj);
                    return C41238w.f97225a;
                }
            }

            /* renamed from: ye.a$b$c$g */
            static final class C18912g extends C41537m implements C43075l {

                /* renamed from: d */
                final /* synthetic */ C18887c f52890d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C18912g(C18887c cVar) {
                    super(1);
                    this.f52890d = cVar;
                }

                /* renamed from: a */
                public final void mo46912a(C18310a.C18323e eVar) {
                    C41536l.m120490j(eVar, "transition");
                    if ((eVar instanceof C18310a.C18323e.C18325b) && (!C41536l.m120484d((C18551i) eVar.mo46090a(), (C18551i) ((C18310a.C18323e.C18325b) eVar).mo46096c()))) {
                        this.f52890d.f52855d.f52847b.onNext(new C18523b.C18528c(this.f52890d.f52855d.mo46881m()));
                    }
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    mo46912a((C18310a.C18323e) obj);
                    return C41238w.f97225a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C18887c(C18884b bVar) {
                super(1);
                this.f52855d = bVar;
            }

            /* renamed from: a */
            public final void mo46887a(C18310a.C18315c cVar) {
                C41536l.m120490j(cVar, "$receiver");
                C18888a aVar = new C18888a(this);
                C18310a.C18319d.C18320a aVar2 = C18310a.C18319d.f51764c;
                cVar.mo46077d(aVar2.mo46087a(C18551i.C18555d.class), aVar);
                cVar.mo46077d(aVar2.mo46087a(C18551i.C18557f.class), new C18893b(this));
                cVar.mo46077d(aVar2.mo46087a(C18551i.C18553b.class), new C18899c(this));
                cVar.mo46077d(aVar2.mo46087a(C18551i.C18552a.class), new C18902d(this));
                cVar.mo46077d(aVar2.mo46087a(C18551i.C18556e.class), C18908e.f52886d);
                cVar.mo46077d(aVar2.mo46087a(C18551i.C18554c.class), new C18910f(this));
                cVar.mo46075b(C18551i.C18555d.f52064a);
                cVar.mo46076c(new C18912g(this));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo46887a((C18310a.C18315c) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ye.a$b$d */
        static final class C18913d extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C18913d f52891d = new C18913d();

            C18913d() {
                super(1);
            }

            /* renamed from: a */
            public final boolean mo46913a(C18523b.C18529d.C18530a aVar) {
                C41536l.m120490j(aVar, "$receiver");
                return aVar.mo46343a() instanceof C18561l.C18562a.C18566d;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(mo46913a((C18523b.C18529d.C18530a) obj));
            }
        }

        public C18884b(C18532c cVar, C18561l.C18568b bVar, C12437a aVar, C40757w wVar) {
            C41536l.m120490j(cVar, "lifecycle");
            C41536l.m120490j(bVar, "webSocketFactory");
            C41536l.m120490j(aVar, "backoffStrategy");
            C41536l.m120490j(wVar, "scheduler");
            this.f52849d = cVar;
            this.f52850e = bVar;
            this.f52851f = aVar;
            this.f52852g = wVar;
            C40330c M = C40330c.m116776M();
            C41536l.m120485e(M, "PublishProcessor.create<Event>()");
            this.f52847b = M;
            this.f52848c = C18310a.f51746c.mo46059a(new C18887c(this));
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public final void m63922l(C18551i.C18557f fVar) {
            fVar.mo46382b().dispose();
        }

        /* access modifiers changed from: private */
        /* renamed from: o */
        public final void m63923o(C18551i.C18552a aVar, C18532c.C18533a aVar2) {
            if (aVar2 instanceof C18532c.C18533a.C18536c.C18538b) {
                aVar.mo46372a().mo46363a().mo42918c(((C18532c.C18533a.C18536c.C18538b) aVar2).mo46347a());
            } else if (C41536l.m120484d(aVar2, C18532c.C18533a.C18536c.C18537a.f52031a)) {
                aVar.mo46372a().mo46363a().cancel();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: p */
        public final C18310a.C18319d m63924p() {
            return C18310a.C18319d.f51764c.mo46087a(C18523b.C18524a.C18525a.class).mo46086c(C18885a.f52853d);
        }

        /* access modifiers changed from: private */
        /* renamed from: q */
        public final C18310a.C18319d m63925q() {
            return C18310a.C18319d.f51764c.mo46087a(C18523b.C18524a.C18525a.class).mo46086c(C18886b.f52854d);
        }

        /* access modifiers changed from: private */
        /* renamed from: s */
        public final C18548g m63926s() {
            C18561l create = this.f52850e.create();
            C19017c cVar = new C19017c(this);
            C40741h.m117964u(create.mo42916a()).mo94940w(this.f52852g).mo94926e(C18561l.C18562a.class).mo94922E(cVar);
            return new C18548g(create, cVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: t */
        public final void m63927t() {
            this.f52846a.mo47177g();
        }

        /* access modifiers changed from: private */
        /* renamed from: u */
        public final C41205b m63928u(long j) {
            C19016b bVar = new C19016b(this);
            C40741h.m117959J(j, TimeUnit.MILLISECONDS, this.f52852g).mo94942y().mo94922E(bVar);
            return bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: w */
        public final C18310a.C18319d m63929w() {
            return C18310a.C18319d.f51764c.mo46087a(C18523b.C18529d.C18530a.class).mo46086c(C18913d.f52891d);
        }

        /* renamed from: m */
        public final C18551i mo46881m() {
            return (C18551i) this.f52848c.mo46057b();
        }

        /* renamed from: n */
        public final void mo46882n(C18523b bVar) {
            C41536l.m120490j(bVar, "event");
            this.f52847b.onNext(bVar);
            this.f52848c.mo46058g(bVar);
        }

        /* renamed from: r */
        public final C40741h mo46883r() {
            C40741h y = this.f52847b.mo94942y();
            C41536l.m120485e(y, "eventProcessor.onBackpressureBuffer()");
            return y;
        }

        /* renamed from: v */
        public final void mo46884v() {
            this.f52849d.mo26347a(this.f52846a);
        }
    }

    public C18881a(C18884b bVar) {
        C41536l.m120490j(bVar, "stateManager");
        this.f52838a = bVar;
    }

    /* renamed from: a */
    public final C40741h mo46876a() {
        return this.f52838a.mo46883r();
    }

    /* renamed from: b */
    public final boolean mo46877b(C18539d dVar) {
        C41536l.m120490j(dVar, "message");
        C18551i m = this.f52838a.mo46881m();
        if (m instanceof C18551i.C18552a) {
            return ((C18551i.C18552a) m).mo46372a().mo46363a().mo42917b(dVar);
        }
        return false;
    }

    /* renamed from: c */
    public final void mo46878c() {
        this.f52838a.mo46884v();
    }
}
