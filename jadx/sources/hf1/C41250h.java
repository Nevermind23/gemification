package hf1;

import ef1.C40814h0;
import ef1.C40818i0;
import gf1.C41097e;
import he1.C41228o;
import he1.C41238w;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C41550z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.C41556a;
import kotlinx.coroutines.flow.C41557b;
import me1.C41752f;
import me1.C41758g;
import oe1.C41853d;
import oe1.C41862l;
import ue1.C43079p;
import ue1.C43080q;

/* renamed from: hf1.h */
public final class C41250h extends C41247f {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C43080q f97246e;

    /* renamed from: hf1.h$a */
    static final class C41251a extends C41862l implements C43079p {

        /* renamed from: h */
        int f97247h;

        /* renamed from: i */
        private /* synthetic */ Object f97248i;

        /* renamed from: j */
        final /* synthetic */ C41250h f97249j;

        /* renamed from: k */
        final /* synthetic */ C41557b f97250k;

        /* renamed from: hf1.h$a$a */
        static final class C41252a implements C41557b {

            /* renamed from: a */
            final /* synthetic */ C41550z f97251a;

            /* renamed from: b */
            final /* synthetic */ C40814h0 f97252b;

            /* renamed from: c */
            final /* synthetic */ C41250h f97253c;

            /* renamed from: d */
            final /* synthetic */ C41557b f97254d;

            /* renamed from: hf1.h$a$a$a */
            static final class C41253a extends C41862l implements C43079p {

                /* renamed from: h */
                int f97255h;

                /* renamed from: i */
                final /* synthetic */ C41250h f97256i;

                /* renamed from: j */
                final /* synthetic */ C41557b f97257j;

                /* renamed from: k */
                final /* synthetic */ Object f97258k;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C41253a(C41250h hVar, C41557b bVar, Object obj, Continuation continuation) {
                    super(2, continuation);
                    this.f97256i = hVar;
                    this.f97257j = bVar;
                    this.f97258k = obj;
                }

                /* renamed from: a */
                public final Continuation mo3708a(Object obj, Continuation continuation) {
                    return new C41253a(this.f97256i, this.f97257j, this.f97258k, continuation);
                }

                /* renamed from: f */
                public final Object mo3709f(Object obj) {
                    Object c = C41793d.m121157c();
                    int i = this.f97255h;
                    if (i == 0) {
                        C41228o.m119483b(obj);
                        C43080q p = this.f97256i.f97246e;
                        C41557b bVar = this.f97257j;
                        Object obj2 = this.f97258k;
                        this.f97255h = 1;
                        if (p.invoke(bVar, obj2, this) == c) {
                            return c;
                        }
                    } else if (i == 1) {
                        C41228o.m119483b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    return C41238w.f97225a;
                }

                /* renamed from: n */
                public final Object invoke(C40814h0 h0Var, Continuation continuation) {
                    return ((C41253a) mo3708a(h0Var, continuation)).mo3709f(C41238w.f97225a);
                }
            }

            /* renamed from: hf1.h$a$a$b */
            static final class C41254b extends C41853d {

                /* renamed from: g */
                Object f97259g;

                /* renamed from: h */
                Object f97260h;

                /* renamed from: i */
                Object f97261i;

                /* renamed from: j */
                /* synthetic */ Object f97262j;

                /* renamed from: k */
                final /* synthetic */ C41252a f97263k;

                /* renamed from: l */
                int f97264l;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C41254b(C41252a aVar, Continuation continuation) {
                    super(continuation);
                    this.f97263k = aVar;
                }

                /* renamed from: f */
                public final Object mo3709f(Object obj) {
                    this.f97262j = obj;
                    this.f97264l |= Integer.MIN_VALUE;
                    return this.f97263k.mo95721b((Object) null, this);
                }
            }

            C41252a(C41550z zVar, C40814h0 h0Var, C41250h hVar, C41557b bVar) {
                this.f97251a = zVar;
                this.f97252b = h0Var;
                this.f97253c = hVar;
                this.f97254d = bVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* renamed from: b */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object mo95721b(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof hf1.C41250h.C41251a.C41252a.C41254b
                    if (r0 == 0) goto L_0x0013
                    r0 = r9
                    hf1.h$a$a$b r0 = (hf1.C41250h.C41251a.C41252a.C41254b) r0
                    int r1 = r0.f97264l
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f97264l = r1
                    goto L_0x0018
                L_0x0013:
                    hf1.h$a$a$b r0 = new hf1.h$a$a$b
                    r0.<init>(r7, r9)
                L_0x0018:
                    java.lang.Object r9 = r0.f97262j
                    java.lang.Object r1 = ne1.C41793d.m121157c()
                    int r2 = r0.f97264l
                    r3 = 1
                    if (r2 == 0) goto L_0x003b
                    if (r2 != r3) goto L_0x0033
                    java.lang.Object r8 = r0.f97261i
                    ef1.o1 r8 = (ef1.C40845o1) r8
                    java.lang.Object r8 = r0.f97260h
                    java.lang.Object r0 = r0.f97259g
                    hf1.h$a$a r0 = (hf1.C41250h.C41251a.C41252a) r0
                    he1.C41228o.m119483b(r9)
                    goto L_0x005e
                L_0x0033:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L_0x003b:
                    he1.C41228o.m119483b(r9)
                    kotlin.jvm.internal.z r9 = r7.f97251a
                    java.lang.Object r9 = r9.f97717d
                    ef1.o1 r9 = (ef1.C40845o1) r9
                    if (r9 == 0) goto L_0x005d
                    kotlinx.coroutines.flow.internal.ChildCancelledException r2 = new kotlinx.coroutines.flow.internal.ChildCancelledException
                    r2.<init>()
                    r9.mo95211a(r2)
                    r0.f97259g = r7
                    r0.f97260h = r8
                    r0.f97261i = r9
                    r0.f97264l = r3
                    java.lang.Object r9 = r9.mo95217v(r0)
                    if (r9 != r1) goto L_0x005d
                    return r1
                L_0x005d:
                    r0 = r7
                L_0x005e:
                    kotlin.jvm.internal.z r9 = r0.f97251a
                    ef1.h0 r1 = r0.f97252b
                    r2 = 0
                    ef1.j0 r3 = ef1.C40822j0.UNDISPATCHED
                    hf1.h$a$a$a r4 = new hf1.h$a$a$a
                    hf1.h r5 = r0.f97253c
                    kotlinx.coroutines.flow.b r0 = r0.f97254d
                    r6 = 0
                    r4.<init>(r5, r0, r8, r6)
                    r5 = 1
                    ef1.o1 r8 = ef1.C40821j.m118316b(r1, r2, r3, r4, r5, r6)
                    r9.f97717d = r8
                    he1.w r8 = he1.C41238w.f97225a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: hf1.C41250h.C41251a.C41252a.mo95721b(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41251a(C41250h hVar, C41557b bVar, Continuation continuation) {
            super(2, continuation);
            this.f97249j = hVar;
            this.f97250k = bVar;
        }

        /* renamed from: a */
        public final Continuation mo3708a(Object obj, Continuation continuation) {
            C41251a aVar = new C41251a(this.f97249j, this.f97250k, continuation);
            aVar.f97248i = obj;
            return aVar;
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            Object c = C41793d.m121157c();
            int i = this.f97247h;
            if (i == 0) {
                C41228o.m119483b(obj);
                C41550z zVar = new C41550z();
                C41250h hVar = this.f97249j;
                C41556a aVar = hVar.f97242d;
                C41252a aVar2 = new C41252a(zVar, (C40814h0) this.f97248i, hVar, this.f97250k);
                this.f97247h = 1;
                if (aVar.mo95707a(aVar2, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C41228o.m119483b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C41238w.f97225a;
        }

        /* renamed from: n */
        public final Object invoke(C40814h0 h0Var, Continuation continuation) {
            return ((C41251a) mo3708a(h0Var, continuation)).mo3709f(C41238w.f97225a);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C41250h(C43080q qVar, C41556a aVar, C41752f fVar, int i, C41097e eVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(qVar, aVar, (i2 & 4) != 0 ? C41758g.f98029d : fVar, (i2 & 8) != 0 ? -2 : i, (i2 & 16) != 0 ? C41097e.SUSPEND : eVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C41243d mo95711h(C41752f fVar, int i, C41097e eVar) {
        return new C41250h(this.f97246e, this.f97242d, fVar, i, eVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public Object mo95718o(C41557b bVar, Continuation continuation) {
        Object b = C40818i0.m118310b(new C41251a(this, bVar, (Continuation) null), continuation);
        return b == C41793d.m121157c() ? b : C41238w.f97225a;
    }

    public C41250h(C43080q qVar, C41556a aVar, C41752f fVar, int i, C41097e eVar) {
        super(aVar, fVar, i, eVar);
        this.f97246e = qVar;
    }
}
