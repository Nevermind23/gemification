package p389de;

import android.media.MediaFormat;
import android.media.MediaMuxer;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p458id.C15600b;
import p651wd.C18516k;

/* renamed from: de.j */
public class C12093j {
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final C15600b f35557l = C15600b.m56349a(C12093j.class.getSimpleName());
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final List f35558a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public MediaMuxer f35559b;

    /* renamed from: c */
    private int f35560c = 0;

    /* renamed from: d */
    private int f35561d = 0;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f35562e = false;

    /* renamed from: f */
    private final C12094a f35563f = new C12094a();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C18516k f35564g = C18516k.m63025d("EncoderEngine");
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final Object f35565h = new Object();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C12098b f35566i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f35567j = 0;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f35568k;

    /* renamed from: de.j$a */
    public class C12094a {

        /* renamed from: a */
        private Map f35569a = new HashMap();

        /* renamed from: de.j$a$a */
        class C12095a implements Runnable {
            C12095a() {
            }

            public void run() {
                C12093j.this.f35559b.start();
                boolean unused = C12093j.this.f35562e = true;
                if (C12093j.this.f35566i != null) {
                    C12093j.this.f35566i.mo29491b();
                }
            }
        }

        /* renamed from: de.j$a$b */
        class C12096b implements Runnable {
            C12096b() {
            }

            public void run() {
                C12093j.this.mo32271s();
            }
        }

        /* renamed from: de.j$a$c */
        class C12097c implements Runnable {
            C12097c() {
            }

            public void run() {
                C12093j.this.m44384o();
            }
        }

        public C12094a() {
        }

        /* renamed from: a */
        public boolean mo32272a() {
            boolean b;
            synchronized (C12093j.this.f35565h) {
                b = C12093j.this.f35562e;
            }
            return b;
        }

        /* renamed from: b */
        public int mo32273b(MediaFormat mediaFormat) {
            int addTrack;
            synchronized (C12093j.this.f35565h) {
                if (!C12093j.this.f35562e) {
                    addTrack = C12093j.this.f35559b.addTrack(mediaFormat);
                    C12093j.f35557l.mo42880h("notifyStarted:", "Assigned track", Integer.valueOf(addTrack), "to format", mediaFormat.getString("mime"));
                    if (C12093j.m44377h(C12093j.this) == C12093j.this.f35558a.size()) {
                        C12093j.f35557l.mo42880h("notifyStarted:", "All encoders have started.", "Starting muxer and dispatching onEncodingStart().");
                        C12093j.this.f35564g.mo46324j(new C12095a());
                    }
                } else {
                    throw new IllegalStateException("Trying to start but muxer started already");
                }
            }
            return addTrack;
        }

        /* renamed from: c */
        public void mo32274c(int i) {
            synchronized (C12093j.this.f35565h) {
                C12093j.f35557l.mo42880h("notifyStopped:", "Called for track", Integer.valueOf(i));
                if (C12093j.m44372c(C12093j.this) == C12093j.this.f35558a.size()) {
                    C12093j.f35557l.mo42880h("requestStop:", "All encoders have been stopped.", "Stopping the muxer.");
                    C12093j.this.f35564g.mo46324j(new C12097c());
                }
            }
        }

        /* renamed from: d */
        public void mo32275d(int i) {
            synchronized (C12093j.this.f35565h) {
                C12093j.f35557l.mo42880h("requestStop:", "Called for track", Integer.valueOf(i));
                if (C12093j.m44378i(C12093j.this) == 0) {
                    C12093j.f35557l.mo42880h("requestStop:", "All encoders have requested a stop.", "Stopping them.");
                    C12093j jVar = C12093j.this;
                    int unused = jVar.f35567j = jVar.f35568k;
                    C12093j.this.f35564g.mo46324j(new C12096b());
                }
            }
        }

        /* renamed from: e */
        public void mo32276e(C12100l lVar, C12099k kVar) {
            int i;
            Integer num = (Integer) this.f35569a.get(Integer.valueOf(kVar.f35575b));
            Map map = this.f35569a;
            Integer valueOf = Integer.valueOf(kVar.f35575b);
            if (num == null) {
                i = 1;
            } else {
                num = Integer.valueOf(num.intValue() + 1);
                i = num.intValue();
            }
            map.put(valueOf, Integer.valueOf(i));
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(kVar.f35574a.presentationTimeUs / 1000);
            C12093j.f35557l.mo42879g("write:", "Writing into muxer -", "track:", Integer.valueOf(kVar.f35575b), "presentation:", Long.valueOf(kVar.f35574a.presentationTimeUs), "readable:", instance.get(13) + ":" + instance.get(14), "count:", num);
            C12093j.this.f35559b.writeSampleData(kVar.f35575b, kVar.f35576c, kVar.f35574a);
            lVar.mo46315f(kVar);
        }
    }

    /* renamed from: de.j$b */
    public interface C12098b {
        /* renamed from: b */
        void mo29491b();

        /* renamed from: c */
        void mo29492c(int i, Exception exc);

        /* renamed from: e */
        void mo29493e();
    }

    public C12093j(File file, C12107p pVar, C12076b bVar, int i, long j, C12098b bVar2) {
        int i2;
        ArrayList<C12088i> arrayList = new ArrayList<>();
        this.f35558a = arrayList;
        this.f35566i = bVar2;
        arrayList.add(pVar);
        if (bVar != null) {
            arrayList.add(bVar);
        }
        try {
            this.f35559b = new MediaMuxer(file.toString(), 0);
            int i3 = 0;
            for (C12088i h : arrayList) {
                i3 += h.mo32232h();
            }
            long j2 = (j / ((long) (i3 / 8))) * 1000 * 1000;
            long j3 = ((long) i) * 1000;
            int i4 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            if (i4 > 0 && i > 0) {
                if (j2 < j3) {
                    i2 = 2;
                } else {
                    i2 = 1;
                }
                this.f35568k = i2;
                j2 = Math.min(j2, j3);
            } else if (i4 > 0) {
                this.f35568k = 2;
            } else if (i > 0) {
                this.f35568k = 1;
                j2 = j3;
            } else {
                j2 = Long.MAX_VALUE;
            }
            f35557l.mo42880h("Computed a max duration of", Float.valueOf(((float) j2) / 1000000.0f));
            for (C12088i v : this.f35558a) {
                v.mo32260v(this.f35563f, j2);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    static /* synthetic */ int m44372c(C12093j jVar) {
        int i = jVar.f35561d + 1;
        jVar.f35561d = i;
        return i;
    }

    /* renamed from: h */
    static /* synthetic */ int m44377h(C12093j jVar) {
        int i = jVar.f35560c + 1;
        jVar.f35560c = i;
        return i;
    }

    /* renamed from: i */
    static /* synthetic */ int m44378i(C12093j jVar) {
        int i = jVar.f35560c - 1;
        jVar.f35560c = i;
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public void m44384o() {
        f35557l.mo42878c("end:", "Releasing muxer after all encoders have been released.");
        MediaMuxer mediaMuxer = this.f35559b;
        if (mediaMuxer != null) {
            try {
                mediaMuxer.stop();
                e = null;
            } catch (Exception e) {
                e = e;
            }
            try {
                this.f35559b.release();
            } catch (Exception e2) {
                if (e == null) {
                    e = e2;
                }
            }
            this.f35559b = null;
        } else {
            e = null;
        }
        C15600b bVar = f35557l;
        bVar.mo42880h("end:", "Dispatching end to listener - reason:", Integer.valueOf(this.f35567j), "error:", e);
        C12098b bVar2 = this.f35566i;
        if (bVar2 != null) {
            bVar2.mo29492c(this.f35567j, e);
            this.f35566i = null;
        }
        this.f35567j = 0;
        this.f35560c = 0;
        this.f35561d = 0;
        this.f35562e = false;
        this.f35564g.mo46318a();
        bVar.mo42878c("end:", "Completed.");
    }

    /* renamed from: p */
    public C12107p mo32268p() {
        return (C12107p) this.f35558a.get(0);
    }

    /* renamed from: q */
    public final void mo32269q(String str, Object obj) {
        f35557l.mo42879g("Passing event to encoders:", str);
        for (C12088i l : this.f35558a) {
            l.mo32255l(str, obj);
        }
    }

    /* renamed from: r */
    public final void mo32270r() {
        f35557l.mo42878c("Passing event to encoders:", "START");
        for (C12088i x : this.f35558a) {
            x.mo32261x();
        }
    }

    /* renamed from: s */
    public final void mo32271s() {
        f35557l.mo42878c("Passing event to encoders:", "STOP");
        for (C12088i y : this.f35558a) {
            y.mo32262y();
        }
        C12098b bVar = this.f35566i;
        if (bVar != null) {
            bVar.mo29493e();
        }
    }
}
