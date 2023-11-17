package p389de;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import p389de.C12093j;
import p458id.C15600b;
import p651wd.C18516k;

/* renamed from: de.i */
public abstract class C12088i {
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static final C15600b f35531q = C15600b.m56349a(C12088i.class.getSimpleName());
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f35532a = 0;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f35533b;

    /* renamed from: c */
    protected MediaCodec f35534c;

    /* renamed from: d */
    protected C18516k f35535d;

    /* renamed from: e */
    private C12093j.C12094a f35536e;

    /* renamed from: f */
    private int f35537f;

    /* renamed from: g */
    private C12100l f35538g;

    /* renamed from: h */
    private MediaCodec.BufferInfo f35539h;

    /* renamed from: i */
    private C12087h f35540i;

    /* renamed from: j */
    private final Map f35541j = new HashMap();

    /* renamed from: k */
    private long f35542k;

    /* renamed from: l */
    private boolean f35543l;

    /* renamed from: m */
    private long f35544m = 0;

    /* renamed from: n */
    private long f35545n = Long.MIN_VALUE;

    /* renamed from: o */
    private long f35546o = 0;

    /* renamed from: p */
    private long f35547p = Long.MIN_VALUE;

    /* renamed from: de.i$a */
    class C12089a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C12093j.C12094a f35548d;

        /* renamed from: e */
        final /* synthetic */ long f35549e;

        C12089a(C12093j.C12094a aVar, long j) {
            this.f35548d = aVar;
            this.f35549e = j;
        }

        public void run() {
            C12088i.f35531q.mo42878c(C12088i.this.f35533b, "Prepare was called. Executing.");
            C12088i.this.m44349w(1);
            C12088i.this.mo32233q(this.f35548d, this.f35549e);
            C12088i.this.m44349w(2);
        }
    }

    /* renamed from: de.i$b */
    class C12090b implements Runnable {
        C12090b() {
        }

        public void run() {
            if (C12088i.this.f35532a < 2 || C12088i.this.f35532a >= 3) {
                C12088i.f35531q.mo42877b(C12088i.this.f35533b, "Wrong state while starting. Aborting.", Integer.valueOf(C12088i.this.f35532a));
                return;
            }
            C12088i.this.m44349w(3);
            C12088i.f35531q.mo42880h(C12088i.this.f35533b, "Start was called. Executing.");
            C12088i.this.mo32234r();
        }
    }

    /* renamed from: de.i$c */
    class C12091c implements Runnable {

        /* renamed from: d */
        final /* synthetic */ AtomicInteger f35552d;

        /* renamed from: e */
        final /* synthetic */ String f35553e;

        /* renamed from: f */
        final /* synthetic */ Object f35554f;

        C12091c(AtomicInteger atomicInteger, String str, Object obj) {
            this.f35552d = atomicInteger;
            this.f35553e = str;
            this.f35554f = obj;
        }

        public void run() {
            C12088i.f35531q.mo42879g(C12088i.this.f35533b, "Notify was called. Executing. pendingEvents:", Integer.valueOf(this.f35552d.intValue()));
            C12088i.this.mo32258o(this.f35553e, this.f35554f);
            this.f35552d.decrementAndGet();
        }
    }

    /* renamed from: de.i$d */
    class C12092d implements Runnable {
        C12092d() {
        }

        public void run() {
            C12088i.f35531q.mo42880h(C12088i.this.f35533b, "Stop was called. Executing.");
            C12088i.this.mo32235s();
        }
    }

    protected C12088i(String str) {
        this.f35533b = str;
    }

    /* renamed from: p */
    private void m44348p() {
        if (this.f35543l) {
            f35531q.mo42880h(this.f35533b, "onMaxLengthReached: Called twice.");
            return;
        }
        this.f35543l = true;
        int i = this.f35532a;
        if (i >= 5) {
            f35531q.mo42880h(this.f35533b, "onMaxLengthReached: Reached in wrong state. Aborting.", Integer.valueOf(i));
            return;
        }
        f35531q.mo42880h(this.f35533b, "onMaxLengthReached: Requesting a stop.");
        m44349w(5);
        this.f35536e.mo32275d(this.f35537f);
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void m44349w(int i) {
        String str;
        if (this.f35547p == Long.MIN_VALUE) {
            this.f35547p = System.currentTimeMillis();
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f35547p;
        this.f35547p = System.currentTimeMillis();
        switch (i) {
            case 0:
                str = "NONE";
                break;
            case 1:
                str = "PREPARING";
                break;
            case 2:
                str = "PREPARED";
                break;
            case 3:
                str = "STARTING";
                break;
            case 4:
                str = "STARTED";
                break;
            case 5:
                str = "LIMIT_REACHED";
                break;
            case 6:
                str = "STOPPING";
                break;
            case 7:
                str = "STOPPED";
                break;
            default:
                str = null;
                break;
        }
        f35531q.mo42880h(this.f35533b, "setState:", str, "millisSinceLastState:", Long.valueOf(currentTimeMillis));
        this.f35532a = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo32249e(C12084f fVar) {
        do {
        } while (!mo32263z(fVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo32250f(boolean z) {
        boolean z2;
        C15600b bVar = f35531q;
        bVar.mo42878c(this.f35533b, "DRAINING - EOS:", Boolean.valueOf(z));
        MediaCodec mediaCodec = this.f35534c;
        if (mediaCodec == null) {
            bVar.mo42877b("drain() was called before prepare() or after releasing.");
            return;
        }
        if (this.f35540i == null) {
            this.f35540i = new C12087h(mediaCodec);
        }
        while (true) {
            int dequeueOutputBuffer = this.f35534c.dequeueOutputBuffer(this.f35539h, 0);
            C15600b bVar2 = f35531q;
            bVar2.mo42878c(this.f35533b, "DRAINING - Got status:", Integer.valueOf(dequeueOutputBuffer));
            if (dequeueOutputBuffer == -1) {
                if (!z) {
                    return;
                }
            } else if (dequeueOutputBuffer == -3) {
                this.f35540i.mo32248c();
            } else if (dequeueOutputBuffer == -2) {
                if (!this.f35536e.mo32272a()) {
                    this.f35537f = this.f35536e.mo32273b(this.f35534c.getOutputFormat());
                    m44349w(4);
                    this.f35538g = new C12100l(this.f35537f);
                }
            } else if (dequeueOutputBuffer < 0) {
                bVar2.mo42877b("Unexpected result from dequeueOutputBuffer: " + dequeueOutputBuffer);
            } else {
                ByteBuffer b = this.f35540i.mo32247b(dequeueOutputBuffer);
                if ((this.f35539h.flags & 2) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2 && this.f35536e.mo32272a()) {
                    MediaCodec.BufferInfo bufferInfo = this.f35539h;
                    if (bufferInfo.size != 0) {
                        b.position(bufferInfo.offset);
                        MediaCodec.BufferInfo bufferInfo2 = this.f35539h;
                        b.limit(bufferInfo2.offset + bufferInfo2.size);
                        if (this.f35545n == Long.MIN_VALUE) {
                            long j = this.f35539h.presentationTimeUs;
                            this.f35545n = j;
                            bVar2.mo42880h(this.f35533b, "DRAINING - Got the first presentation time:", Long.valueOf(j));
                        }
                        MediaCodec.BufferInfo bufferInfo3 = this.f35539h;
                        long j2 = bufferInfo3.presentationTimeUs;
                        this.f35546o = j2;
                        long j3 = ((this.f35544m * 1000) + j2) - this.f35545n;
                        bufferInfo3.presentationTimeUs = j3;
                        bVar2.mo42879g(this.f35533b, "DRAINING - About to write(). Adjusted presentation:", Long.valueOf(j3));
                        C12099k kVar = (C12099k) this.f35538g.mo46313d();
                        kVar.f35574a = this.f35539h;
                        kVar.f35575b = this.f35537f;
                        kVar.f35576c = b;
                        mo32259u(this.f35538g, kVar);
                    }
                }
                this.f35534c.releaseOutputBuffer(dequeueOutputBuffer, false);
                if (!z && !this.f35543l) {
                    long j4 = this.f35545n;
                    if (j4 != Long.MIN_VALUE) {
                        long j5 = this.f35546o;
                        if (j5 - j4 > this.f35542k) {
                            bVar2.mo42880h(this.f35533b, "DRAINING - Reached maxLength! mLastTimeUs:", Long.valueOf(j5), "mStartTimeUs:", Long.valueOf(this.f35545n), "mDeltaUs:", Long.valueOf(this.f35546o - this.f35545n), "mMaxLengthUs:", Long.valueOf(this.f35542k));
                            m44348p();
                            return;
                        }
                    }
                }
                if ((this.f35539h.flags & 4) != 0) {
                    bVar2.mo42880h(this.f35533b, "DRAINING - Got EOS. Releasing the codec.");
                    mo32236t();
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo32251g(C12084f fVar) {
        C12084f fVar2 = fVar;
        f35531q.mo42879g(this.f35533b, "ENCODING - Buffer:", Integer.valueOf(fVar2.f35524c), "Bytes:", Integer.valueOf(fVar2.f35525d), "Presentation:", Long.valueOf(fVar2.f35526e));
        if (fVar2.f35527f) {
            this.f35534c.queueInputBuffer(fVar2.f35524c, 0, 0, fVar2.f35526e, 4);
        } else {
            this.f35534c.queueInputBuffer(fVar2.f35524c, 0, fVar2.f35525d, fVar2.f35526e, 0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract int mo32232h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public long mo32252i() {
        return this.f35542k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final int mo32253j(String str) {
        return ((AtomicInteger) this.f35541j.get(str)).intValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public boolean mo32254k() {
        return this.f35543l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo32255l(String str, Object obj) {
        if (!this.f35541j.containsKey(str)) {
            this.f35541j.put(str, new AtomicInteger(0));
        }
        AtomicInteger atomicInteger = (AtomicInteger) this.f35541j.get(str);
        atomicInteger.incrementAndGet();
        f35531q.mo42879g(this.f35533b, "Notify was called. Posting. pendingEvents:", Integer.valueOf(atomicInteger.intValue()));
        this.f35535d.mo46323i(new C12091c(atomicInteger, str, obj));
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo32256m(long j) {
        this.f35544m = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo32257n() {
        m44348p();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo32258o(String str, Object obj) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract void mo32233q(C12093j.C12094a aVar, long j);

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract void mo32234r();

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public abstract void mo32235s();

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo32236t() {
        f35531q.mo42880h(this.f35533b, "is being released. Notifying controller and releasing codecs.");
        this.f35536e.mo32274c(this.f35537f);
        this.f35534c.stop();
        this.f35534c.release();
        this.f35534c = null;
        this.f35538g.mo46311b();
        this.f35538g = null;
        this.f35540i = null;
        m44349w(7);
        this.f35535d.mo46318a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo32259u(C12100l lVar, C12099k kVar) {
        this.f35536e.mo32276e(lVar, kVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final void mo32260v(C12093j.C12094a aVar, long j) {
        int i = this.f35532a;
        if (i >= 1) {
            f35531q.mo42877b(this.f35533b, "Wrong state while preparing. Aborting.", Integer.valueOf(i));
            return;
        }
        this.f35536e = aVar;
        this.f35539h = new MediaCodec.BufferInfo();
        this.f35542k = j;
        C18516k d = C18516k.m63025d(this.f35533b);
        this.f35535d = d;
        d.mo46321g().setPriority(10);
        f35531q.mo42878c(this.f35533b, "Prepare was called. Posting.");
        this.f35535d.mo46323i(new C12089a(aVar, j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final void mo32261x() {
        f35531q.mo42880h(this.f35533b, "Start was called. Posting.");
        this.f35535d.mo46323i(new C12090b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final void mo32262y() {
        int i = this.f35532a;
        if (i >= 6) {
            f35531q.mo42877b(this.f35533b, "Wrong state while stopping. Aborting.", Integer.valueOf(i));
            return;
        }
        m44349w(6);
        f35531q.mo42880h(this.f35533b, "Stop was called. Posting.");
        this.f35535d.mo46323i(new C12092d());
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public boolean mo32263z(C12084f fVar) {
        if (this.f35540i == null) {
            this.f35540i = new C12087h(this.f35534c);
        }
        int dequeueInputBuffer = this.f35534c.dequeueInputBuffer(0);
        if (dequeueInputBuffer < 0) {
            return false;
        }
        fVar.f35524c = dequeueInputBuffer;
        fVar.f35522a = this.f35540i.mo32246a(dequeueInputBuffer);
        return true;
    }
}
