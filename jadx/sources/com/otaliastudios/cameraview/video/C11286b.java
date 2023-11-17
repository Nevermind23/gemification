package com.otaliastudios.cameraview.video;

import android.location.Location;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import com.otaliastudios.cameraview.C11280b;
import com.otaliastudios.cameraview.internal.DeviceEncoders;
import com.otaliastudios.cameraview.video.C11291d;
import java.io.File;
import java.io.FileDescriptor;
import p341ge.bog.mobilebank.p975ui.views.widgets.cropview.subscaleview.SubsamplingScaleImageView;
import p374ce.C10396b;
import p458id.C15600b;
import p472jd.C15744a;
import p472jd.C15745b;
import p472jd.C15756m;

/* renamed from: com.otaliastudios.cameraview.video.b */
public abstract class C11286b extends C11291d {

    /* renamed from: j */
    protected static final C15600b f32801j = C15600b.m56349a(C11286b.class.getSimpleName());

    /* renamed from: g */
    protected MediaRecorder f32802g;

    /* renamed from: h */
    private CamcorderProfile f32803h;

    /* renamed from: i */
    private boolean f32804i;

    /* renamed from: com.otaliastudios.cameraview.video.b$a */
    class C11287a implements MediaRecorder.OnInfoListener {
        C11287a() {
        }

        public void onInfo(MediaRecorder mediaRecorder, int i, int i2) {
            boolean z;
            C15600b bVar = C11286b.f32801j;
            bVar.mo42878c("OnInfoListener:", "Received info", Integer.valueOf(i), Integer.valueOf(i2), "Thread: ", Thread.currentThread());
            switch (i) {
                case 800:
                    C11286b.this.f32821a.f32779m = 2;
                    break;
                case 801:
                case 802:
                    C11286b.this.f32821a.f32779m = 1;
                    break;
                default:
                    z = false;
                    break;
            }
            z = true;
            if (z) {
                bVar.mo42878c("OnInfoListener:", "Stopping");
                C11286b.this.mo29499o(false);
            }
        }
    }

    /* renamed from: com.otaliastudios.cameraview.video.b$b */
    class C11288b implements MediaRecorder.OnErrorListener {
        C11288b() {
        }

        public void onError(MediaRecorder mediaRecorder, int i, int i2) {
            C15600b bVar = C11286b.f32801j;
            bVar.mo42877b("OnErrorListener: got error", Integer.valueOf(i), Integer.valueOf(i2), ". Stopping.");
            C11286b bVar2 = C11286b.this;
            bVar2.f32821a = null;
            bVar2.f32823c = new RuntimeException("MediaRecorder error: " + i + " " + i2);
            bVar.mo42878c("OnErrorListener:", "Stopping");
            C11286b.this.mo29499o(false);
        }
    }

    C11286b(C11291d.C11292a aVar) {
        super(aVar);
    }

    /* renamed from: s */
    private boolean m41338s(C11280b.C11281a aVar, boolean z) {
        int i;
        String str;
        int f;
        C11280b.C11281a aVar2 = aVar;
        char c = 2;
        f32801j.mo42878c("prepareMediaRecorder:", "Preparing on thread", Thread.currentThread());
        this.f32802g = new MediaRecorder();
        this.f32803h = mo29483q(aVar);
        mo29482p(aVar2, this.f32802g);
        C15744a aVar3 = aVar2.f32776j;
        if (aVar3 == C15744a.ON) {
            i = this.f32803h.audioChannels;
        } else if (aVar3 == C15744a.MONO) {
            i = 1;
        } else {
            i = aVar3 == C15744a.STEREO ? 2 : 0;
        }
        boolean z2 = i > 0;
        if (z2) {
            this.f32802g.setAudioSource(0);
        }
        C15756m mVar = aVar2.f32774h;
        if (mVar == C15756m.H_264) {
            CamcorderProfile camcorderProfile = this.f32803h;
            camcorderProfile.videoCodec = 2;
            camcorderProfile.fileFormat = 2;
        } else if (mVar == C15756m.H_263) {
            CamcorderProfile camcorderProfile2 = this.f32803h;
            camcorderProfile2.videoCodec = 1;
            camcorderProfile2.fileFormat = 2;
        }
        C15745b bVar = aVar2.f32775i;
        char c2 = 4;
        if (bVar == C15745b.AAC) {
            this.f32803h.audioCodec = 3;
        } else if (bVar == C15745b.HE_AAC) {
            this.f32803h.audioCodec = 4;
        } else if (bVar == C15745b.AAC_ELD) {
            this.f32803h.audioCodec = 5;
        }
        this.f32802g.setOutputFormat(this.f32803h.fileFormat);
        if (aVar2.f32781o <= 0) {
            aVar2.f32781o = this.f32803h.videoFrameRate;
        }
        if (aVar2.f32780n <= 0) {
            aVar2.f32780n = this.f32803h.videoBitRate;
        }
        if (aVar2.f32782p <= 0 && z2) {
            aVar2.f32782p = this.f32803h.audioBitRate;
        }
        if (z) {
            CamcorderProfile camcorderProfile3 = this.f32803h;
            String str2 = "audio/3gpp";
            switch (camcorderProfile3.audioCodec) {
                case 2:
                    str2 = "audio/amr-wb";
                    break;
                case 3:
                case 4:
                case 5:
                    str2 = "audio/mp4a-latm";
                    break;
                case 6:
                    str2 = "audio/vorbis";
                    break;
            }
            int i2 = camcorderProfile3.videoCodec;
            if (i2 != 1) {
                str = "video/avc";
                if (i2 != 2) {
                    if (i2 == 3) {
                        str = "video/mp4v-es";
                    } else if (i2 == 4) {
                        str = "video/x-vnd.on2.vp8";
                    } else if (i2 == 5) {
                        str = "video/hevc";
                    }
                }
            } else {
                str = "video/3gpp";
            }
            boolean z3 = aVar2.f32769c % SubsamplingScaleImageView.ORIENTATION_180 != 0;
            if (z3) {
                aVar2.f32770d = aVar2.f32770d.mo27059b();
            }
            int i3 = 0;
            boolean z4 = false;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            C10396b bVar2 = null;
            while (!z4) {
                C15600b bVar3 = f32801j;
                Object[] objArr = new Object[6];
                objArr[0] = "prepareMediaRecorder:";
                objArr[1] = "Checking DeviceEncoders...";
                objArr[c] = "videoOffset:";
                objArr[3] = Integer.valueOf(i6);
                objArr[c2] = "audioOffset:";
                objArr[5] = Integer.valueOf(i7);
                bVar3.mo42878c(objArr);
                try {
                    C10396b bVar4 = bVar2;
                    DeviceEncoders deviceEncoders = new DeviceEncoders(0, str, str2, i6, i7);
                    try {
                        bVar2 = deviceEncoders.mo29474g(aVar2.f32770d);
                        try {
                            i3 = deviceEncoders.mo29472e(aVar2.f32780n);
                            f = deviceEncoders.mo29473f(bVar2, aVar2.f32781o);
                        } catch (DeviceEncoders.VideoException e) {
                            e = e;
                            f32801j.mo42878c("prepareMediaRecorder:", "Got VideoException:", e.getMessage());
                            i6++;
                            c = 2;
                            c2 = 4;
                        } catch (DeviceEncoders.AudioException e2) {
                            e = e2;
                            f32801j.mo42878c("prepareMediaRecorder:", "Got AudioException:", e.getMessage());
                            i7++;
                            c = 2;
                            c2 = 4;
                        }
                        try {
                            deviceEncoders.mo29478k(str, bVar2, f, i3);
                            if (z2) {
                                int d = deviceEncoders.mo29471d(aVar2.f32782p);
                                try {
                                    deviceEncoders.mo29477j(str2, d, this.f32803h.audioSampleRate, i);
                                    i4 = d;
                                } catch (DeviceEncoders.VideoException e3) {
                                    e = e3;
                                    i5 = f;
                                    i4 = d;
                                    f32801j.mo42878c("prepareMediaRecorder:", "Got VideoException:", e.getMessage());
                                    i6++;
                                    c = 2;
                                    c2 = 4;
                                } catch (DeviceEncoders.AudioException e4) {
                                    e = e4;
                                    i5 = f;
                                    i4 = d;
                                    f32801j.mo42878c("prepareMediaRecorder:", "Got AudioException:", e.getMessage());
                                    i7++;
                                    c = 2;
                                    c2 = 4;
                                }
                            }
                            z4 = true;
                            i5 = f;
                        } catch (DeviceEncoders.VideoException e5) {
                            e = e5;
                            i5 = f;
                            f32801j.mo42878c("prepareMediaRecorder:", "Got VideoException:", e.getMessage());
                            i6++;
                            c = 2;
                            c2 = 4;
                        } catch (DeviceEncoders.AudioException e6) {
                            e = e6;
                            i5 = f;
                            f32801j.mo42878c("prepareMediaRecorder:", "Got AudioException:", e.getMessage());
                            i7++;
                            c = 2;
                            c2 = 4;
                        }
                    } catch (DeviceEncoders.VideoException e7) {
                        e = e7;
                        bVar2 = bVar4;
                        f32801j.mo42878c("prepareMediaRecorder:", "Got VideoException:", e.getMessage());
                        i6++;
                        c = 2;
                        c2 = 4;
                    } catch (DeviceEncoders.AudioException e8) {
                        e = e8;
                        bVar2 = bVar4;
                        f32801j.mo42878c("prepareMediaRecorder:", "Got AudioException:", e.getMessage());
                        i7++;
                        c = 2;
                        c2 = 4;
                    }
                    c = 2;
                    c2 = 4;
                } catch (RuntimeException unused) {
                    f32801j.mo42880h("prepareMediaRecorder:", "Could not respect encoders parameters.", "Trying again without checking encoders.");
                    return m41338s(aVar2, false);
                }
            }
            C10396b bVar5 = bVar2;
            aVar2.f32770d = bVar5;
            aVar2.f32780n = i3;
            aVar2.f32782p = i4;
            aVar2.f32781o = i5;
            if (z3) {
                aVar2.f32770d = bVar5.mo27059b();
            }
        }
        boolean z5 = aVar2.f32769c % SubsamplingScaleImageView.ORIENTATION_180 != 0;
        MediaRecorder mediaRecorder = this.f32802g;
        C10396b bVar6 = aVar2.f32770d;
        mediaRecorder.setVideoSize(z5 ? bVar6.mo27060c() : bVar6.mo27062e(), z5 ? aVar2.f32770d.mo27062e() : aVar2.f32770d.mo27060c());
        this.f32802g.setVideoFrameRate(aVar2.f32781o);
        this.f32802g.setVideoEncoder(this.f32803h.videoCodec);
        this.f32802g.setVideoEncodingBitRate(aVar2.f32780n);
        if (z2) {
            this.f32802g.setAudioChannels(i);
            this.f32802g.setAudioSamplingRate(this.f32803h.audioSampleRate);
            this.f32802g.setAudioEncoder(this.f32803h.audioCodec);
            this.f32802g.setAudioEncodingBitRate(aVar2.f32782p);
        }
        Location location = aVar2.f32768b;
        if (location != null) {
            this.f32802g.setLocation((float) location.getLatitude(), (float) aVar2.f32768b.getLongitude());
        }
        File file = aVar2.f32771e;
        if (file != null) {
            this.f32802g.setOutputFile(file.getAbsolutePath());
        } else {
            FileDescriptor fileDescriptor = aVar2.f32772f;
            if (fileDescriptor != null) {
                this.f32802g.setOutputFile(fileDescriptor);
            } else {
                throw new IllegalStateException("file and fileDescriptor are both null.");
            }
        }
        this.f32802g.setOrientationHint(aVar2.f32769c);
        MediaRecorder mediaRecorder2 = this.f32802g;
        long j = aVar2.f32777k;
        if (j > 0) {
            j = Math.round(((double) j) / 0.9d);
        }
        mediaRecorder2.setMaxFileSize(j);
        f32801j.mo42878c("prepareMediaRecorder:", "Increased max size from", Long.valueOf(aVar2.f32777k), "to", Long.valueOf(Math.round(((double) aVar2.f32777k) / 0.9d)));
        this.f32802g.setMaxDuration(aVar2.f32778l);
        this.f32802g.setOnInfoListener(new C11287a());
        this.f32802g.setOnErrorListener(new C11288b());
        try {
            this.f32802g.prepare();
            this.f32804i = true;
            this.f32823c = null;
            return true;
        } catch (Exception e9) {
            f32801j.mo42880h("prepareMediaRecorder:", "Error while preparing media recorder.", e9);
            this.f32804i = false;
            this.f32823c = e9;
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo29481l() {
        if (!mo29488r(this.f32821a)) {
            this.f32821a = null;
            mo29499o(false);
            return;
        }
        try {
            this.f32802g.start();
            mo29496i();
        } catch (Exception e) {
            f32801j.mo42880h("start:", "Error while starting media recorder.", e);
            this.f32821a = null;
            this.f32823c = e;
            mo29499o(false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo29487m(boolean z) {
        if (this.f32802g != null) {
            mo29495h();
            try {
                C15600b bVar = f32801j;
                bVar.mo42878c("stop:", "Stopping MediaRecorder...");
                this.f32802g.stop();
                bVar.mo42878c("stop:", "Stopped MediaRecorder.");
            } catch (Exception e) {
                this.f32821a = null;
                if (this.f32823c == null) {
                    f32801j.mo42880h("stop:", "Error while closing media recorder.", e);
                    this.f32823c = e;
                }
            }
            try {
                C15600b bVar2 = f32801j;
                bVar2.mo42878c("stop:", "Releasing MediaRecorder...");
                this.f32802g.release();
                bVar2.mo42878c("stop:", "Released MediaRecorder.");
            } catch (Exception e2) {
                this.f32821a = null;
                if (this.f32823c == null) {
                    f32801j.mo42880h("stop:", "Error while releasing media recorder.", e2);
                    this.f32823c = e2;
                }
            }
        }
        this.f32803h = null;
        this.f32802g = null;
        this.f32804i = false;
        mo29494g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public abstract void mo29482p(C11280b.C11281a aVar, MediaRecorder mediaRecorder);

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract CamcorderProfile mo29483q(C11280b.C11281a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final boolean mo29488r(C11280b.C11281a aVar) {
        if (this.f32804i) {
            return true;
        }
        return m41338s(aVar, true);
    }
}
