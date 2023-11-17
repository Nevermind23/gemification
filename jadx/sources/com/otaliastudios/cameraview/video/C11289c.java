package com.otaliastudios.cameraview.video;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import com.otaliastudios.cameraview.C11280b;
import com.otaliastudios.cameraview.internal.DeviceEncoders;
import p360be.C10254d;
import p360be.C10255e;
import p374ce.C10396b;
import p389de.C12075a;
import p389de.C12076b;
import p389de.C12093j;
import p389de.C12102m;
import p389de.C12103n;
import p458id.C15600b;
import p472jd.C15744a;
import p486kd.C16401d;
import p612td.C17928b;
import p693zd.C19009a;
import p693zd.C19011b;

/* renamed from: com.otaliastudios.cameraview.video.c */
public class C11289c extends C11291d implements C10255e, C12093j.C12098b {

    /* renamed from: q */
    private static final C15600b f32807q = C15600b.m56349a(C11289c.class.getSimpleName());

    /* renamed from: g */
    private C12093j f32808g;

    /* renamed from: h */
    private final Object f32809h = new Object();

    /* renamed from: i */
    private C10254d f32810i;

    /* renamed from: j */
    private int f32811j;

    /* renamed from: k */
    private int f32812k;

    /* renamed from: l */
    private int f32813l;

    /* renamed from: m */
    private C19009a f32814m;

    /* renamed from: n */
    private C19011b f32815n;

    /* renamed from: o */
    private boolean f32816o;

    /* renamed from: p */
    private C17928b f32817p;

    /* renamed from: com.otaliastudios.cameraview.video.c$a */
    static /* synthetic */ class C11290a {

        /* renamed from: a */
        static final /* synthetic */ int[] f32818a;

        /* renamed from: b */
        static final /* synthetic */ int[] f32819b;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|(2:1|2)|3|(2:5|6)|7|9|10|(2:11|12)|13|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        static {
            /*
                jd.b[] r0 = p472jd.C15745b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f32819b = r0
                r1 = 1
                jd.b r2 = p472jd.C15745b.AAC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f32819b     // Catch:{ NoSuchFieldError -> 0x001d }
                jd.b r3 = p472jd.C15745b.HE_AAC     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f32819b     // Catch:{ NoSuchFieldError -> 0x0028 }
                jd.b r4 = p472jd.C15745b.AAC_ELD     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r3 = f32819b     // Catch:{ NoSuchFieldError -> 0x0033 }
                jd.b r4 = p472jd.C15745b.DEVICE_DEFAULT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                jd.m[] r3 = p472jd.C15756m.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f32818a = r3
                jd.m r4 = p472jd.C15756m.H_263     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f32818a     // Catch:{ NoSuchFieldError -> 0x004e }
                jd.m r3 = p472jd.C15756m.H_264     // Catch:{ NoSuchFieldError -> 0x004e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f32818a     // Catch:{ NoSuchFieldError -> 0x0058 }
                jd.m r1 = p472jd.C15756m.DEVICE_DEFAULT     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.otaliastudios.cameraview.video.C11289c.C11290a.<clinit>():void");
        }
    }

    public C11289c(C16401d dVar, C10254d dVar2, C19009a aVar) {
        super(dVar);
        boolean z = true;
        this.f32811j = 1;
        this.f32812k = 1;
        this.f32813l = 0;
        this.f32810i = dVar2;
        this.f32814m = aVar;
        this.f32816o = (aVar == null || !aVar.mo47158b(C19009a.C19010a.VIDEO_SNAPSHOT)) ? false : z;
    }

    /* renamed from: p */
    private static int m41344p(C10396b bVar, int i) {
        return (int) (((float) bVar.mo27062e()) * 0.07f * ((float) bVar.mo27060c()) * ((float) i));
    }

    /* renamed from: a */
    public void mo26314a(SurfaceTexture surfaceTexture, int i, float f, float f2) {
        int i2;
        C10396b bVar;
        int i3;
        int i4;
        int i5;
        C12076b bVar2;
        if (this.f32811j == 1 && this.f32812k == 0) {
            f32807q.mo42878c("Starting the encoder engine.");
            C11280b.C11281a aVar = this.f32821a;
            if (aVar.f32781o <= 0) {
                aVar.f32781o = 30;
            }
            if (aVar.f32780n <= 0) {
                aVar.f32780n = m41344p(aVar.f32770d, aVar.f32781o);
            }
            C11280b.C11281a aVar2 = this.f32821a;
            if (aVar2.f32782p <= 0) {
                aVar2.f32782p = 64000;
            }
            String str = "";
            int i6 = C11290a.f32818a[aVar2.f32774h.ordinal()];
            char c = 3;
            if (i6 == 1) {
                str = "video/3gpp";
            } else if (i6 == 2) {
                str = "video/avc";
            } else if (i6 == 3) {
                str = "video/avc";
            }
            String str2 = "";
            int i7 = C11290a.f32819b[this.f32821a.f32775i.ordinal()];
            char c2 = 4;
            if (i7 == 1 || i7 == 2 || i7 == 3) {
                str2 = "audio/mp4a-latm";
            } else if (i7 == 4) {
                str2 = "audio/mp4a-latm";
            }
            String str3 = str2;
            C12102m mVar = new C12102m();
            C12075a aVar3 = new C12075a();
            C15744a aVar4 = this.f32821a.f32776j;
            if (aVar4 == C15744a.ON) {
                i2 = aVar3.f35486b;
            } else if (aVar4 == C15744a.MONO) {
                i2 = 1;
            } else {
                i2 = aVar4 == C15744a.STEREO ? 2 : 0;
            }
            boolean z = i2 > 0;
            DeviceEncoders deviceEncoders = null;
            C10396b bVar3 = null;
            boolean z2 = false;
            int i8 = 0;
            int i9 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (!z2) {
                C15600b bVar4 = f32807q;
                Object[] objArr = new Object[5];
                objArr[0] = "Checking DeviceEncoders...";
                objArr[1] = "videoOffset:";
                objArr[2] = Integer.valueOf(i8);
                objArr[c] = "audioOffset:";
                objArr[c2] = Integer.valueOf(i9);
                bVar4.mo42878c(objArr);
                try {
                    new DeviceEncoders(0, str, str3, i8, i9);
                    DeviceEncoders deviceEncoders2 = r13;
                    DeviceEncoders deviceEncoders3 = new DeviceEncoders(1, str, str3, i8, i9);
                    try {
                        C10396b g = deviceEncoders2.mo29474g(this.f32821a.f32770d);
                        try {
                            int e = deviceEncoders2.mo29472e(this.f32821a.f32780n);
                            try {
                                int f3 = deviceEncoders2.mo29473f(g, this.f32821a.f32781o);
                                try {
                                    deviceEncoders2.mo29478k(str, g, f3, e);
                                    if (z) {
                                        int d = deviceEncoders2.mo29471d(this.f32821a.f32782p);
                                        try {
                                            deviceEncoders2.mo29477j(str3, d, aVar3.f35489e, i2);
                                            i13 = d;
                                        } catch (DeviceEncoders.VideoException e2) {
                                            e = e2;
                                            i13 = d;
                                            bVar3 = g;
                                            i12 = e;
                                            i14 = f3;
                                            f32807q.mo42878c("Got VideoException:", e.getMessage());
                                            i8++;
                                            deviceEncoders = deviceEncoders2;
                                            c = 3;
                                            c2 = 4;
                                        } catch (DeviceEncoders.AudioException e3) {
                                            e = e3;
                                            i13 = d;
                                            bVar3 = g;
                                            i12 = e;
                                            i14 = f3;
                                            f32807q.mo42878c("Got AudioException:", e.getMessage());
                                            i9++;
                                            deviceEncoders = deviceEncoders2;
                                            c = 3;
                                            c2 = 4;
                                        }
                                    }
                                    deviceEncoders = deviceEncoders2;
                                    z2 = true;
                                    bVar3 = g;
                                    i12 = e;
                                    i14 = f3;
                                } catch (DeviceEncoders.VideoException e4) {
                                    e = e4;
                                    bVar3 = g;
                                    i12 = e;
                                    i14 = f3;
                                    f32807q.mo42878c("Got VideoException:", e.getMessage());
                                    i8++;
                                    deviceEncoders = deviceEncoders2;
                                    c = 3;
                                    c2 = 4;
                                } catch (DeviceEncoders.AudioException e5) {
                                    e = e5;
                                    bVar3 = g;
                                    i12 = e;
                                    i14 = f3;
                                    f32807q.mo42878c("Got AudioException:", e.getMessage());
                                    i9++;
                                    deviceEncoders = deviceEncoders2;
                                    c = 3;
                                    c2 = 4;
                                }
                            } catch (DeviceEncoders.VideoException e6) {
                                e = e6;
                                bVar3 = g;
                                i12 = e;
                                f32807q.mo42878c("Got VideoException:", e.getMessage());
                                i8++;
                                deviceEncoders = deviceEncoders2;
                                c = 3;
                                c2 = 4;
                            } catch (DeviceEncoders.AudioException e7) {
                                e = e7;
                                bVar3 = g;
                                i12 = e;
                                f32807q.mo42878c("Got AudioException:", e.getMessage());
                                i9++;
                                deviceEncoders = deviceEncoders2;
                                c = 3;
                                c2 = 4;
                            }
                        } catch (DeviceEncoders.VideoException e8) {
                            e = e8;
                            bVar3 = g;
                            f32807q.mo42878c("Got VideoException:", e.getMessage());
                            i8++;
                            deviceEncoders = deviceEncoders2;
                            c = 3;
                            c2 = 4;
                        } catch (DeviceEncoders.AudioException e9) {
                            e = e9;
                            bVar3 = g;
                            f32807q.mo42878c("Got AudioException:", e.getMessage());
                            i9++;
                            deviceEncoders = deviceEncoders2;
                            c = 3;
                            c2 = 4;
                        }
                    } catch (DeviceEncoders.VideoException e12) {
                        e = e12;
                        f32807q.mo42878c("Got VideoException:", e.getMessage());
                        i8++;
                        deviceEncoders = deviceEncoders2;
                        c = 3;
                        c2 = 4;
                    } catch (DeviceEncoders.AudioException e13) {
                        e = e13;
                        f32807q.mo42878c("Got AudioException:", e.getMessage());
                        i9++;
                        deviceEncoders = deviceEncoders2;
                        c = 3;
                        c2 = 4;
                    }
                    c = 3;
                    c2 = 4;
                } catch (RuntimeException unused) {
                    f32807q.mo42880h("Could not respect encoders parameters.", "Going on again without checking encoders, possibly failing.");
                    C11280b.C11281a aVar5 = this.f32821a;
                    bVar = aVar5.f32770d;
                    i3 = aVar5.f32780n;
                    i5 = aVar5.f32781o;
                    i4 = aVar5.f32782p;
                }
            }
            bVar = bVar3;
            i3 = i12;
            i4 = i13;
            i5 = i14;
            C11280b.C11281a aVar6 = this.f32821a;
            aVar6.f32770d = bVar;
            aVar6.f32780n = i3;
            aVar6.f32782p = i4;
            aVar6.f32781o = i5;
            mVar.f35596a = bVar.mo27062e();
            mVar.f35597b = this.f32821a.f32770d.mo27060c();
            C11280b.C11281a aVar7 = this.f32821a;
            mVar.f35598c = aVar7.f32780n;
            mVar.f35599d = aVar7.f32781o;
            mVar.f35600e = i + aVar7.f32769c;
            mVar.f35601f = str;
            mVar.f35602g = deviceEncoders.mo29475h();
            mVar.f35578h = this.f32813l;
            mVar.f35582l = f;
            mVar.f35583m = f2;
            mVar.f35584n = EGL14.eglGetCurrentContext();
            if (this.f32816o) {
                mVar.f35579i = C19009a.C19010a.VIDEO_SNAPSHOT;
                mVar.f35580j = this.f32815n;
                mVar.f35581k = this.f32821a.f32769c;
            }
            C12103n nVar = new C12103n(mVar);
            C11280b.C11281a aVar8 = this.f32821a;
            aVar8.f32769c = 0;
            this.f32817p.mo45593e(aVar8.f32770d.mo27062e(), this.f32821a.f32770d.mo27062e());
            if (z) {
                aVar3.f35485a = this.f32821a.f32782p;
                aVar3.f35486b = i2;
                aVar3.f35487c = deviceEncoders.mo29469b();
                bVar2 = new C12076b(aVar3);
            } else {
                bVar2 = null;
            }
            synchronized (this.f32809h) {
                C11280b.C11281a aVar9 = this.f32821a;
                C12093j jVar = new C12093j(aVar9.f32771e, nVar, bVar2, aVar9.f32778l, aVar9.f32777k, this);
                this.f32808g = jVar;
                jVar.mo32269q("filter", this.f32817p);
                this.f32808g.mo32270r();
            }
            this.f32811j = 0;
        }
        if (this.f32811j == 0) {
            C15600b bVar5 = f32807q;
            bVar5.mo42878c("scheduling frame.");
            synchronized (this.f32809h) {
                if (this.f32808g != null) {
                    bVar5.mo42878c("dispatching frame.");
                    C12103n.C12105b B = ((C12103n) this.f32808g.mo32268p()).mo32284B();
                    B.f35593a = surfaceTexture.getTimestamp();
                    B.f35594b = System.currentTimeMillis();
                    surfaceTexture.getTransformMatrix(B.f35595c);
                    this.f32808g.mo32269q("frame", B);
                }
            }
        }
        if (this.f32811j == 0 && this.f32812k == 1) {
            f32807q.mo42878c("Stopping the encoder engine.");
            this.f32811j = 1;
            synchronized (this.f32809h) {
                C12093j jVar2 = this.f32808g;
                if (jVar2 != null) {
                    jVar2.mo32271s();
                    this.f32808g = null;
                }
            }
        }
    }

    /* renamed from: b */
    public void mo29491b() {
    }

    /* renamed from: c */
    public void mo29492c(int i, Exception exc) {
        if (exc != null) {
            f32807q.mo42877b("Error onEncodingEnd", exc);
            this.f32821a = null;
            this.f32823c = exc;
        } else if (i == 1) {
            f32807q.mo42878c("onEncodingEnd because of max duration.");
            this.f32821a.f32779m = 2;
        } else if (i == 2) {
            f32807q.mo42878c("onEncodingEnd because of max size.");
            this.f32821a.f32779m = 1;
        } else {
            f32807q.mo42878c("onEncodingEnd because of user.");
        }
        this.f32811j = 1;
        this.f32812k = 1;
        this.f32810i.mo26832b(this);
        this.f32810i = null;
        C19011b bVar = this.f32815n;
        if (bVar != null) {
            bVar.mo47162c();
            this.f32815n = null;
        }
        synchronized (this.f32809h) {
            this.f32808g = null;
        }
        mo29494g();
    }

    /* renamed from: d */
    public void mo26315d(int i) {
        this.f32813l = i;
        if (this.f32816o) {
            this.f32815n = new C19011b(this.f32814m, this.f32821a.f32770d);
        }
    }

    /* renamed from: e */
    public void mo29493e() {
        mo29495h();
    }

    /* renamed from: f */
    public void mo26316f(C17928b bVar) {
        C17928b a = bVar.mo45590a();
        this.f32817p = a;
        a.mo45593e(this.f32821a.f32770d.mo27062e(), this.f32821a.f32770d.mo27060c());
        synchronized (this.f32809h) {
            C12093j jVar = this.f32808g;
            if (jVar != null) {
                jVar.mo32269q("filter", this.f32817p);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo29481l() {
        this.f32810i.mo26833c(this);
        this.f32812k = 0;
        mo29496i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo29487m(boolean z) {
        if (z) {
            f32807q.mo42878c("Stopping the encoder engine from isCameraShutdown.");
            this.f32812k = 1;
            this.f32811j = 1;
            synchronized (this.f32809h) {
                C12093j jVar = this.f32808g;
                if (jVar != null) {
                    jVar.mo32271s();
                    this.f32808g = null;
                }
            }
            return;
        }
        this.f32812k = 1;
    }
}
