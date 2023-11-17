package p375cf;

import af1.C40297d;
import be1.C40329b;
import ed1.C40741h;
import ed1.C40743j;
import ed1.C40757w;
import fe1.C40940a;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41534j;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p652we.C18532c;
import ue1.C43079p;
import uh1.C43107b;
import uh1.C43108c;

/* renamed from: cf.c */
public final class C10415c implements C18532c, C43107b {

    /* renamed from: d */
    private final C40329b f29622d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C40329b f29623e;

    /* renamed from: f */
    private final /* synthetic */ C10414b f29624f;

    /* renamed from: cf.c$a */
    static final /* synthetic */ class C10416a extends C41534j implements C43079p {

        /* renamed from: d */
        public static final C10416a f29625d = new C10416a();

        C10416a() {
            super(2);
        }

        /* renamed from: b */
        public final boolean mo27075b(C18532c.C18533a aVar, C18532c.C18533a aVar2) {
            C41536l.m120490j(aVar, "p1");
            C41536l.m120490j(aVar2, "p2");
            return C10421e.m37851a(aVar, aVar2);
        }

        public final String getName() {
            return "isEquivalentTo";
        }

        public final C40297d getOwner() {
            return C41520a0.m120438d(C10421e.class, "scarlet");
        }

        public final String getSignature() {
            return "isEquivalentTo(Lcom/tinder/scarlet/Lifecycle$State;Lcom/tinder/scarlet/Lifecycle$State;)Z";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(mo27075b((C18532c.C18533a) obj, (C18532c.C18533a) obj2));
        }
    }

    /* renamed from: cf.c$b */
    static final class C10417b implements C40743j {

        /* renamed from: a */
        final /* synthetic */ long f29626a;

        /* renamed from: b */
        final /* synthetic */ C40757w f29627b;

        C10417b(long j, C40757w wVar) {
            this.f29626a = j;
            this.f29627b = wVar;
        }

        /* renamed from: b */
        public final C40741h mo27076a(C40741h hVar) {
            C41536l.m120490j(hVar, "it");
            long j = this.f29626a;
            if (j != 0) {
                return hVar.mo94925I(j, TimeUnit.MILLISECONDS, this.f29627b);
            }
            return hVar;
        }
    }

    /* renamed from: cf.c$c */
    static final /* synthetic */ class C10418c extends C41534j implements C43079p {

        /* renamed from: d */
        public static final C10418c f29628d = new C10418c();

        C10418c() {
            super(2);
        }

        /* renamed from: b */
        public final boolean mo27078b(C18532c.C18533a aVar, C18532c.C18533a aVar2) {
            C41536l.m120490j(aVar, "p1");
            C41536l.m120490j(aVar2, "p2");
            return C10421e.m37851a(aVar, aVar2);
        }

        public final String getName() {
            return "isEquivalentTo";
        }

        public final C40297d getOwner() {
            return C41520a0.m120438d(C10421e.class, "scarlet");
        }

        public final String getSignature() {
            return "isEquivalentTo(Lcom/tinder/scarlet/Lifecycle$State;Lcom/tinder/scarlet/Lifecycle$State;)Z";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(mo27078b((C18532c.C18533a) obj, (C18532c.C18533a) obj2));
        }
    }

    /* renamed from: cf.c$d */
    private final class C10419d extends C40940a {
        public C10419d() {
        }

        /* renamed from: e */
        public void onNext(C18532c.C18533a aVar) {
            C41536l.m120490j(aVar, "state");
            C10415c.this.f29623e.onNext(aVar);
            if (C41536l.m120484d(aVar, C18532c.C18533a.C18534a.f52029a)) {
                C10415c.this.f29623e.onComplete();
                dispose();
            }
        }

        public void onComplete() {
            throw new IllegalStateException("Stream is terminated");
        }

        public void onError(Throwable th) {
            C41536l.m120490j(th, "throwable");
            throw new IllegalStateException("Stream is terminated", th);
        }
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [cf.d] */
    /* JADX WARNING: type inference failed for: r0v4, types: [cf.d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C10415c(be1.C40329b r4, be1.C40329b r5, long r6, ed1.C40757w r8) {
        /*
            r3 = this;
            java.lang.String r0 = "upstreamProcessor"
            kotlin.jvm.internal.C41536l.m120490j(r4, r0)
            java.lang.String r0 = "downstreamProcessor"
            kotlin.jvm.internal.C41536l.m120490j(r5, r0)
            java.lang.String r0 = "throttleScheduler"
            kotlin.jvm.internal.C41536l.m120490j(r8, r0)
            r3.<init>()
            cf.b r0 = new cf.b
            ed1.h r1 = r5.mo94919B()
            java.lang.String r2 = "downstreamProcessor.onBackpressureLatest()"
            kotlin.jvm.internal.C41536l.m120485e(r1, r2)
            r0.<init>(r1, r8)
            r3.f29624f = r0
            r3.f29622d = r4
            r3.f29623e = r5
            ed1.h r4 = r4.mo94919B()
            cf.c$a r5 = p375cf.C10415c.C10416a.f29625d
            if (r5 == 0) goto L_0x0034
            cf.d r0 = new cf.d
            r0.<init>(r5)
            r5 = r0
        L_0x0034:
            jd1.d r5 = (jd1.C41397d) r5
            ed1.h r4 = r4.mo94930j(r5)
            cf.c$b r5 = new cf.c$b
            r5.<init>(r6, r8)
            ed1.h r4 = r4.mo94927f(r5)
            cf.c$c r5 = p375cf.C10415c.C10418c.f29628d
            if (r5 == 0) goto L_0x004d
            cf.d r6 = new cf.d
            r6.<init>(r5)
            r5 = r6
        L_0x004d:
            jd1.d r5 = (jd1.C41397d) r5
            ed1.h r4 = r4.mo94930j(r5)
            cf.c$d r5 = new cf.c$d
            r5.<init>()
            r4.mo94922E(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p375cf.C10415c.<init>(be1.b, be1.b, long, ed1.w):void");
    }

    /* renamed from: a */
    public void mo26347a(C43107b bVar) {
        this.f29624f.mo26347a(bVar);
    }

    /* renamed from: b */
    public void mo27070b(C43108c cVar) {
        this.f29622d.mo27070b(cVar);
    }

    /* renamed from: e */
    public void onNext(C18532c.C18533a aVar) {
        this.f29622d.onNext(aVar);
    }

    public void onComplete() {
        this.f29622d.onNext(C18532c.C18533a.C18534a.f52029a);
    }

    public void onError(Throwable th) {
        this.f29622d.onNext(C18532c.C18533a.C18534a.f52029a);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C10415c(long r8, ed1.C40757w r10) {
        /*
            r7 = this;
            java.lang.String r0 = "scheduler"
            kotlin.jvm.internal.C41536l.m120490j(r10, r0)
            be1.c r2 = be1.C40330c.m116776M()
            java.lang.String r0 = "PublishProcessor.create()"
            kotlin.jvm.internal.C41536l.m120485e(r2, r0)
            be1.a r3 = be1.C40327a.m116764M()
            java.lang.String r0 = "BehaviorProcessor.create()"
            kotlin.jvm.internal.C41536l.m120485e(r3, r0)
            r1 = r7
            r4 = r8
            r6 = r10
            r1.<init>(r2, r3, r4, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p375cf.C10415c.<init>(long, ed1.w):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10415c(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : j);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C10415c(long r3) {
        /*
            r2 = this;
            ed1.w r0 = de1.C40640a.m117457a()
            java.lang.String r1 = "Schedulers.computation()"
            kotlin.jvm.internal.C41536l.m120485e(r0, r1)
            r2.<init>(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p375cf.C10415c.<init>(long):void");
    }
}
