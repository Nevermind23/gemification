package com.otaliastudios.cameraview.internal;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p374ce.C10396b;
import p458id.C15600b;

public class DeviceEncoders {

    /* renamed from: e */
    private static final C15600b f32783e = C15600b.m56349a(DeviceEncoders.class.getSimpleName());

    /* renamed from: f */
    static boolean f32784f = true;

    /* renamed from: a */
    private final MediaCodecInfo f32785a;

    /* renamed from: b */
    private final MediaCodecInfo f32786b;

    /* renamed from: c */
    private final MediaCodecInfo.VideoCapabilities f32787c;

    /* renamed from: d */
    private final MediaCodecInfo.AudioCapabilities f32788d;

    public class AudioException extends RuntimeException {
        /* synthetic */ AudioException(DeviceEncoders deviceEncoders, String str, C11282a aVar) {
            this(str);
        }

        private AudioException(String str) {
            super(str);
        }
    }

    public class VideoException extends RuntimeException {
        /* synthetic */ VideoException(DeviceEncoders deviceEncoders, String str, C11282a aVar) {
            this(str);
        }

        private VideoException(String str) {
            super(str);
        }
    }

    /* renamed from: com.otaliastudios.cameraview.internal.DeviceEncoders$a */
    class C11282a implements Comparator {
        C11282a() {
        }

        /* renamed from: a */
        public int compare(MediaCodecInfo mediaCodecInfo, MediaCodecInfo mediaCodecInfo2) {
            return Boolean.compare(DeviceEncoders.this.mo29476i(mediaCodecInfo2.getName()), DeviceEncoders.this.mo29476i(mediaCodecInfo.getName()));
        }
    }

    public DeviceEncoders(int i, String str, String str2, int i2, int i3) {
        if (f32784f) {
            List c = mo29470c();
            MediaCodecInfo a = mo29468a(c, str, i, i2);
            this.f32785a = a;
            C15600b bVar = f32783e;
            bVar.mo42878c("Enabled. Found video encoder:", a.getName());
            MediaCodecInfo a2 = mo29468a(c, str2, i, i3);
            this.f32786b = a2;
            bVar.mo42878c("Enabled. Found audio encoder:", a2.getName());
            this.f32787c = a.getCapabilitiesForType(str).getVideoCapabilities();
            this.f32788d = a2.getCapabilitiesForType(str2).getAudioCapabilities();
            return;
        }
        this.f32785a = null;
        this.f32786b = null;
        this.f32787c = null;
        this.f32788d = null;
        f32783e.mo42878c("Disabled.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public MediaCodecInfo mo29468a(List list, String str, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            int i3 = 0;
            if (!it.hasNext()) {
                break;
            }
            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) it.next();
            String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
            int length = supportedTypes.length;
            while (true) {
                if (i3 >= length) {
                    break;
                } else if (supportedTypes[i3].equalsIgnoreCase(str)) {
                    arrayList.add(mediaCodecInfo);
                    break;
                } else {
                    i3++;
                }
            }
        }
        f32783e.mo42878c("findDeviceEncoder -", "type:", str, "encoders:", Integer.valueOf(arrayList.size()));
        if (i == 1) {
            Collections.sort(arrayList, new C11282a());
        }
        if (arrayList.size() >= i2 + 1) {
            return (MediaCodecInfo) arrayList.get(i2);
        }
        throw new RuntimeException("No encoders for type:" + str);
    }

    /* renamed from: b */
    public String mo29469b() {
        MediaCodecInfo mediaCodecInfo = this.f32786b;
        if (mediaCodecInfo != null) {
            return mediaCodecInfo.getName();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public List mo29470c() {
        ArrayList arrayList = new ArrayList();
        for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(0).getCodecInfos()) {
            if (mediaCodecInfo.isEncoder()) {
                arrayList.add(mediaCodecInfo);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public int mo29471d(int i) {
        if (!f32784f) {
            return i;
        }
        int intValue = this.f32788d.getBitrateRange().clamp(Integer.valueOf(i)).intValue();
        f32783e.mo42878c("getSupportedAudioBitRate -", "inputRate:", Integer.valueOf(i), "adjustedRate:", Integer.valueOf(intValue));
        return intValue;
    }

    /* renamed from: e */
    public int mo29472e(int i) {
        if (!f32784f) {
            return i;
        }
        int intValue = this.f32787c.getBitrateRange().clamp(Integer.valueOf(i)).intValue();
        f32783e.mo42878c("getSupportedVideoBitRate -", "inputRate:", Integer.valueOf(i), "adjustedRate:", Integer.valueOf(intValue));
        return intValue;
    }

    /* renamed from: f */
    public int mo29473f(C10396b bVar, int i) {
        if (!f32784f) {
            return i;
        }
        int doubleValue = (int) this.f32787c.getSupportedFrameRatesFor(bVar.mo27062e(), bVar.mo27060c()).clamp(Double.valueOf((double) i)).doubleValue();
        f32783e.mo42878c("getSupportedVideoFrameRate -", "inputRate:", Integer.valueOf(i), "adjustedRate:", Integer.valueOf(doubleValue));
        return doubleValue;
    }

    /* renamed from: g */
    public C10396b mo29474g(C10396b bVar) {
        if (!f32784f) {
            return bVar;
        }
        int e = bVar.mo27062e();
        int c = bVar.mo27060c();
        double d = ((double) e) / ((double) c);
        C15600b bVar2 = f32783e;
        bVar2.mo42878c("getSupportedVideoSize - started. width:", Integer.valueOf(e), "height:", Integer.valueOf(c));
        if (this.f32787c.getSupportedWidths().getUpper().intValue() < e) {
            e = this.f32787c.getSupportedWidths().getUpper().intValue();
            c = (int) Math.round(((double) e) / d);
            bVar2.mo42878c("getSupportedVideoSize - exceeds maxWidth! width:", Integer.valueOf(e), "height:", Integer.valueOf(c));
        }
        if (this.f32787c.getSupportedHeights().getUpper().intValue() < c) {
            c = this.f32787c.getSupportedHeights().getUpper().intValue();
            e = (int) Math.round(((double) c) * d);
            bVar2.mo42878c("getSupportedVideoSize - exceeds maxHeight! width:", Integer.valueOf(e), "height:", Integer.valueOf(c));
        }
        while (e % this.f32787c.getWidthAlignment() != 0) {
            e--;
        }
        while (c % this.f32787c.getHeightAlignment() != 0) {
            c--;
        }
        f32783e.mo42878c("getSupportedVideoSize - aligned. width:", Integer.valueOf(e), "height:", Integer.valueOf(c));
        if (!this.f32787c.getSupportedWidths().contains(Integer.valueOf(e))) {
            throw new VideoException(this, "Width not supported after adjustment. Desired:" + e + " Range:" + this.f32787c.getSupportedWidths(), (C11282a) null);
        } else if (this.f32787c.getSupportedHeights().contains(Integer.valueOf(c))) {
            try {
                if (!this.f32787c.getSupportedHeightsFor(e).contains(Integer.valueOf(c))) {
                    int intValue = this.f32787c.getSupportedWidths().getLower().intValue();
                    int widthAlignment = this.f32787c.getWidthAlignment();
                    int i = e;
                    while (i >= intValue) {
                        i -= 32;
                        while (i % widthAlignment != 0) {
                            i--;
                        }
                        int round = (int) Math.round(((double) i) / d);
                        if (this.f32787c.getSupportedHeightsFor(i).contains(Integer.valueOf(round))) {
                            f32783e.mo42880h("getSupportedVideoSize - restarting with smaller size.");
                            return mo29474g(new C10396b(i, round));
                        }
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            if (this.f32787c.isSizeSupported(e, c)) {
                return new C10396b(e, c);
            }
            throw new VideoException(this, "Size not supported for unknown reason. Might be an aspect ratio issue. Desired size:" + new C10396b(e, c), (C11282a) null);
        } else {
            throw new VideoException(this, "Height not supported after adjustment. Desired:" + c + " Range:" + this.f32787c.getSupportedHeights(), (C11282a) null);
        }
    }

    /* renamed from: h */
    public String mo29475h() {
        MediaCodecInfo mediaCodecInfo = this.f32785a;
        if (mediaCodecInfo != null) {
            return mediaCodecInfo.getName();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo29476i(String str) {
        boolean z;
        String lowerCase = str.toLowerCase();
        if (lowerCase.startsWith("omx.google.") || lowerCase.startsWith("c2.android.") || (!lowerCase.startsWith("omx.") && !lowerCase.startsWith("c2."))) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052 A[SYNTHETIC, Splitter:B:24:0x0052] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo29477j(java.lang.String r3, int r4, int r5, int r6) {
        /*
            r2 = this;
            android.media.MediaCodecInfo r0 = r2.f32786b
            if (r0 == 0) goto L_0x0056
            r0 = 0
            android.media.MediaFormat r3 = android.media.MediaFormat.createAudioFormat(r3, r5, r6)     // Catch:{ Exception -> 0x0031, all -> 0x002f }
            r5 = 2
            if (r6 != r5) goto L_0x000f
            r5 = 12
            goto L_0x0011
        L_0x000f:
            r5 = 16
        L_0x0011:
            java.lang.String r6 = "channel-mask"
            r3.setInteger(r6, r5)     // Catch:{ Exception -> 0x0031, all -> 0x002f }
            java.lang.String r5 = "bitrate"
            r3.setInteger(r5, r4)     // Catch:{ Exception -> 0x0031, all -> 0x002f }
            android.media.MediaCodecInfo r4 = r2.f32786b     // Catch:{ Exception -> 0x0031, all -> 0x002f }
            java.lang.String r4 = r4.getName()     // Catch:{ Exception -> 0x0031, all -> 0x002f }
            android.media.MediaCodec r4 = android.media.MediaCodec.createByCodecName(r4)     // Catch:{ Exception -> 0x0031, all -> 0x002f }
            r5 = 1
            r4.configure(r3, r0, r0, r5)     // Catch:{ Exception -> 0x002d }
            r4.release()     // Catch:{ Exception -> 0x0056 }
            goto L_0x0056
        L_0x002d:
            r3 = move-exception
            goto L_0x0033
        L_0x002f:
            r3 = move-exception
            goto L_0x0050
        L_0x0031:
            r3 = move-exception
            r4 = r0
        L_0x0033:
            com.otaliastudios.cameraview.internal.DeviceEncoders$AudioException r5 = new com.otaliastudios.cameraview.internal.DeviceEncoders$AudioException     // Catch:{ all -> 0x004e }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x004e }
            r6.<init>()     // Catch:{ all -> 0x004e }
            java.lang.String r1 = "Failed to configure video audio: "
            r6.append(r1)     // Catch:{ all -> 0x004e }
            java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x004e }
            r6.append(r3)     // Catch:{ all -> 0x004e }
            java.lang.String r3 = r6.toString()     // Catch:{ all -> 0x004e }
            r5.<init>(r2, r3, r0)     // Catch:{ all -> 0x004e }
            throw r5     // Catch:{ all -> 0x004e }
        L_0x004e:
            r3 = move-exception
            r0 = r4
        L_0x0050:
            if (r0 == 0) goto L_0x0055
            r0.release()     // Catch:{ Exception -> 0x0055 }
        L_0x0055:
            throw r3
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.otaliastudios.cameraview.internal.DeviceEncoders.mo29477j(java.lang.String, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005f A[SYNTHETIC, Splitter:B:19:0x005f] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo29478k(java.lang.String r3, p374ce.C10396b r4, int r5, int r6) {
        /*
            r2 = this;
            android.media.MediaCodecInfo r0 = r2.f32785a
            if (r0 == 0) goto L_0x0063
            r0 = 0
            int r1 = r4.mo27062e()     // Catch:{ Exception -> 0x003e, all -> 0x003c }
            int r4 = r4.mo27060c()     // Catch:{ Exception -> 0x003e, all -> 0x003c }
            android.media.MediaFormat r3 = android.media.MediaFormat.createVideoFormat(r3, r1, r4)     // Catch:{ Exception -> 0x003e, all -> 0x003c }
            java.lang.String r4 = "color-format"
            r1 = 2130708361(0x7f000789, float:1.701803E38)
            r3.setInteger(r4, r1)     // Catch:{ Exception -> 0x003e, all -> 0x003c }
            java.lang.String r4 = "bitrate"
            r3.setInteger(r4, r6)     // Catch:{ Exception -> 0x003e, all -> 0x003c }
            java.lang.String r4 = "frame-rate"
            r3.setInteger(r4, r5)     // Catch:{ Exception -> 0x003e, all -> 0x003c }
            java.lang.String r4 = "i-frame-interval"
            r5 = 1
            r3.setInteger(r4, r5)     // Catch:{ Exception -> 0x003e, all -> 0x003c }
            android.media.MediaCodecInfo r4 = r2.f32785a     // Catch:{ Exception -> 0x003e, all -> 0x003c }
            java.lang.String r4 = r4.getName()     // Catch:{ Exception -> 0x003e, all -> 0x003c }
            android.media.MediaCodec r4 = android.media.MediaCodec.createByCodecName(r4)     // Catch:{ Exception -> 0x003e, all -> 0x003c }
            r4.configure(r3, r0, r0, r5)     // Catch:{ Exception -> 0x003a }
            r4.release()     // Catch:{ Exception -> 0x0063 }
            goto L_0x0063
        L_0x003a:
            r3 = move-exception
            goto L_0x0040
        L_0x003c:
            r3 = move-exception
            goto L_0x005d
        L_0x003e:
            r3 = move-exception
            r4 = r0
        L_0x0040:
            com.otaliastudios.cameraview.internal.DeviceEncoders$VideoException r5 = new com.otaliastudios.cameraview.internal.DeviceEncoders$VideoException     // Catch:{ all -> 0x005b }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x005b }
            r6.<init>()     // Catch:{ all -> 0x005b }
            java.lang.String r1 = "Failed to configure video codec: "
            r6.append(r1)     // Catch:{ all -> 0x005b }
            java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x005b }
            r6.append(r3)     // Catch:{ all -> 0x005b }
            java.lang.String r3 = r6.toString()     // Catch:{ all -> 0x005b }
            r5.<init>(r2, r3, r0)     // Catch:{ all -> 0x005b }
            throw r5     // Catch:{ all -> 0x005b }
        L_0x005b:
            r3 = move-exception
            r0 = r4
        L_0x005d:
            if (r0 == 0) goto L_0x0062
            r0.release()     // Catch:{ Exception -> 0x0062 }
        L_0x0062:
            throw r3
        L_0x0063:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.otaliastudios.cameraview.internal.DeviceEncoders.mo29478k(java.lang.String, ce.b, int, int):void");
    }
}
