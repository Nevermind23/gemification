package p389de;

import android.media.AudioRecord;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingQueue;
import p389de.C12093j;
import p458id.C15600b;

/* renamed from: de.b */
public class C12076b extends C12088i {
    /* access modifiers changed from: private */

    /* renamed from: F */
    public static final C15600b f35493F = C15600b.m56349a(C12076b.class.getSimpleName());

    /* renamed from: A */
    private int f35494A = 0;

    /* renamed from: B */
    private int f35495B = 0;

    /* renamed from: C */
    private long f35496C = 0;

    /* renamed from: D */
    private long f35497D = 0;

    /* renamed from: E */
    private Map f35498E = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: r */
    public boolean f35499r = false;

    /* renamed from: s */
    private C12078b f35500s;

    /* renamed from: t */
    private C12079c f35501t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public C12082e f35502u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public final C12081d f35503v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public C12075a f35504w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public C12085g f35505x = new C12085g();
    /* access modifiers changed from: private */

    /* renamed from: y */
    public final LinkedBlockingQueue f35506y = new LinkedBlockingQueue();
    /* access modifiers changed from: private */

    /* renamed from: z */
    public C12080c f35507z;

    /* renamed from: de.b$b */
    private class C12078b extends Thread {
        /* renamed from: a */
        private void m44328a(C12084f fVar) {
            long nanoTime = System.nanoTime() / 1000000;
            C12076b.f35493F.mo42879g("encoding thread - performing pending operation for timestamp:", Long.valueOf(fVar.f35526e), "- encoding.");
            fVar.f35522a.put(fVar.f35523b);
            C12076b.this.f35502u.mo46315f(fVar.f35523b);
            C12076b.this.f35506y.remove(fVar);
            C12076b.this.mo32251g(fVar);
            boolean z = fVar.f35527f;
            C12076b.this.f35505x.mo46315f(fVar);
            C12076b.f35493F.mo42879g("encoding thread - performing pending operation for timestamp:", Long.valueOf(fVar.f35526e), "- draining.");
            C12076b.this.mo32250f(z);
        }

        public void run() {
            while (true) {
                if (!C12076b.this.f35506y.isEmpty()) {
                    C12076b.f35493F.mo42879g("encoding thread - performing", Integer.valueOf(C12076b.this.f35506y.size()), "pending operations.");
                    while (true) {
                        C12084f fVar = (C12084f) C12076b.this.f35506y.peek();
                        if (fVar == null) {
                            continue;
                            break;
                        } else if (fVar.f35527f) {
                            C12076b.this.mo32249e(fVar);
                            m44328a(fVar);
                            C12076b.this.f35505x.mo46311b();
                            return;
                        } else if (C12076b.this.mo32263z(fVar)) {
                            m44328a(fVar);
                        } else {
                            C12076b.this.m44322J(3);
                        }
                    }
                } else {
                    C12076b.this.m44322J(3);
                }
            }
        }

        private C12078b() {
        }
    }

    /* renamed from: de.b$c */
    private class C12079c extends Thread {

        /* renamed from: d */
        private AudioRecord f35509d;

        /* renamed from: e */
        private ByteBuffer f35510e;

        /* renamed from: f */
        private int f35511f;

        /* renamed from: g */
        private long f35512g;

        /* renamed from: h */
        private long f35513h;

        /* renamed from: a */
        private void m44329a(ByteBuffer byteBuffer, long j, boolean z) {
            int remaining = byteBuffer.remaining();
            C12084f fVar = (C12084f) C12076b.this.f35505x.mo46313d();
            fVar.f35523b = byteBuffer;
            fVar.f35526e = j;
            fVar.f35525d = remaining;
            fVar.f35527f = z;
            C12076b.this.f35506y.add(fVar);
        }

        /* renamed from: b */
        private void m44330b(int i, boolean z) {
            boolean z2;
            long e = C12076b.this.f35503v.mo32242e(i);
            this.f35512g = e;
            if (this.f35513h == Long.MIN_VALUE) {
                this.f35513h = e;
                C12076b.this.mo32256m(System.currentTimeMillis() - C12081d.m44334a((long) i, C12076b.this.f35504w.mo32229d()));
            }
            if (!C12076b.this.mo32254k()) {
                if (this.f35512g - this.f35513h > C12076b.this.mo32252i()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && !z) {
                    C12076b.f35493F.mo42880h("read thread - this frame reached the maxLength! deltaUs:", Long.valueOf(this.f35512g - this.f35513h));
                    C12076b.this.mo32257n();
                }
            }
            m44331c();
        }

        /* renamed from: c */
        private void m44331c() {
            int c = C12076b.this.f35503v.mo32240c(C12076b.this.f35504w.mo32231f());
            if (c > 0) {
                long d = C12076b.this.f35503v.mo32241d(this.f35512g);
                long b = C12081d.m44335b((long) C12076b.this.f35504w.mo32231f(), C12076b.this.f35504w.mo32229d());
                C12076b.f35493F.mo42880h("read thread - GAPS: trying to add", Integer.valueOf(c), "noise buffers. PERFORMANCE_MAX_GAPS:", 8);
                for (int i = 0; i < Math.min(c, 8); i++) {
                    ByteBuffer byteBuffer = (ByteBuffer) C12076b.this.f35502u.mo46313d();
                    if (byteBuffer == null) {
                        C12076b.f35493F.mo42877b("read thread - GAPS: aborting because we have no free buffer.");
                        return;
                    }
                    byteBuffer.clear();
                    C12076b.this.f35507z.mo32239a(byteBuffer);
                    byteBuffer.rewind();
                    m44329a(byteBuffer, d, false);
                    d += b;
                }
            }
        }

        /* renamed from: d */
        private boolean m44332d(boolean z) {
            ByteBuffer byteBuffer = (ByteBuffer) C12076b.this.f35502u.mo46313d();
            this.f35510e = byteBuffer;
            if (byteBuffer == null) {
                if (z) {
                    C12076b.f35493F.mo42879g("read thread - eos: true - No buffer, retrying.");
                } else {
                    C12076b.f35493F.mo42880h("read thread - eos: false - Skipping audio frame,", "encoding is too slow.");
                    C12076b.this.m44322J(6);
                }
                return false;
            }
            byteBuffer.clear();
            this.f35511f = this.f35509d.read(this.f35510e, C12076b.this.f35504w.mo32231f());
            C12076b.f35493F.mo42879g("read thread - eos:", Boolean.valueOf(z), "- Read new audio frame. Bytes:", Integer.valueOf(this.f35511f));
            int i = this.f35511f;
            if (i > 0) {
                m44330b(i, z);
                C12076b.f35493F.mo42879g("read thread - eos:", Boolean.valueOf(z), "- mLastTimeUs:", Long.valueOf(this.f35512g));
                this.f35510e.limit(this.f35511f);
                m44329a(this.f35510e, this.f35512g, z);
            } else if (i == -3) {
                C12076b.f35493F.mo42877b("read thread - eos:", Boolean.valueOf(z), "- Got AudioRecord.ERROR_INVALID_OPERATION");
            } else if (i == -2) {
                C12076b.f35493F.mo42877b("read thread - eos:", Boolean.valueOf(z), "- Got AudioRecord.ERROR_BAD_VALUE");
            }
            return true;
        }

        public void run() {
            boolean z;
            this.f35509d.startRecording();
            while (true) {
                z = false;
                if (C12076b.this.f35499r) {
                    break;
                } else if (!C12076b.this.mo32254k()) {
                    m44332d(false);
                }
            }
            C12076b.f35493F.mo42880h("Stop was requested. We're out of the loop. Will post an endOfStream.");
            while (!z) {
                z = m44332d(true);
            }
            this.f35509d.stop();
            this.f35509d.release();
            this.f35509d = null;
        }

        private C12079c() {
            this.f35513h = Long.MIN_VALUE;
            setPriority(10);
            int i = C12076b.this.f35504w.f35489e;
            int a = C12076b.this.f35504w.mo32226a();
            Objects.requireNonNull(C12076b.this.f35504w);
            int minBufferSize = AudioRecord.getMinBufferSize(i, a, 2);
            int f = C12076b.this.f35504w.mo32231f() * C12076b.this.f35504w.mo32227b();
            while (f < minBufferSize) {
                f += C12076b.this.f35504w.mo32231f();
            }
            int i2 = C12076b.this.f35504w.f35489e;
            int a2 = C12076b.this.f35504w.mo32226a();
            Objects.requireNonNull(C12076b.this.f35504w);
            this.f35509d = new AudioRecord(5, i2, a2, 2, f);
        }
    }

    public C12076b(C12075a aVar) {
        super("AudioEncoder");
        C12075a e = aVar.mo32230e();
        this.f35504w = e;
        this.f35503v = new C12081d(e.mo32229d());
        this.f35500s = new C12078b();
        this.f35501t = new C12079c();
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public void m44322J(int i) {
        try {
            Thread.sleep(C12081d.m44334a((long) (this.f35504w.mo32231f() * i), this.f35504w.mo32229d()));
        } catch (InterruptedException unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public int mo32232h() {
        return this.f35504w.f35485a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo32233q(C12093j.C12094a aVar, long j) {
        C12075a aVar2 = this.f35504w;
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat(aVar2.f35488d, aVar2.f35489e, aVar2.f35486b);
        createAudioFormat.setInteger("aac-profile", 2);
        createAudioFormat.setInteger("channel-mask", this.f35504w.mo32226a());
        createAudioFormat.setInteger("bitrate", this.f35504w.f35485a);
        try {
            C12075a aVar3 = this.f35504w;
            String str = aVar3.f35487c;
            if (str != null) {
                this.f35534c = MediaCodec.createByCodecName(str);
            } else {
                this.f35534c = MediaCodec.createEncoderByType(aVar3.f35488d);
            }
            this.f35534c.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 1);
            this.f35534c.start();
            this.f35502u = new C12082e(this.f35504w.mo32231f(), this.f35504w.mo32228c());
            this.f35507z = new C12080c(this.f35504w);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo32234r() {
        this.f35499r = false;
        this.f35501t.start();
        this.f35500s.start();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo32235s() {
        this.f35499r = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo32236t() {
        super.mo32236t();
        this.f35499r = false;
        this.f35500s = null;
        this.f35501t = null;
        C12082e eVar = this.f35502u;
        if (eVar != null) {
            eVar.mo46311b();
            this.f35502u = null;
        }
    }
}
