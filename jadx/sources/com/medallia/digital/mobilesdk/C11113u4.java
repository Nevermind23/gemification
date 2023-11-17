package com.medallia.digital.mobilesdk;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.media.MediaRecorder;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.appcompat.app.C0214c;
import androidx.core.app.ActivityCompat;
import androidx.core.content.C0767a;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* renamed from: com.medallia.digital.mobilesdk.u4 */
class C11113u4 {

    /* renamed from: e */
    private static final int f31955e = 7;

    /* renamed from: f */
    private static final int f31956f = 2;

    /* renamed from: g */
    private static final int f31957g = 3;

    /* renamed from: h */
    private static final String f31958h = "/media";

    /* renamed from: i */
    private static final String f31959i = "video/*";

    /* renamed from: j */
    private static final int f31960j = 1048576;

    /* renamed from: k */
    private static final int f31961k = 5;

    /* renamed from: l */
    private static C11113u4 f31962l;

    /* renamed from: a */
    private MediaRecorder f31963a;

    /* renamed from: b */
    private C11225y4 f31964b = null;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public ProgressDialog f31965c;

    /* renamed from: d */
    private final List<String> f31966d = new ArrayList();

    /* renamed from: com.medallia.digital.mobilesdk.u4$a */
    static /* synthetic */ class C11114a {

        /* renamed from: a */
        static final /* synthetic */ int[] f31967a;

        /* renamed from: b */
        static final /* synthetic */ int[] f31968b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|5|6|7|9|10|11|12|13|14|15|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0059 */
        static {
            /*
                com.medallia.digital.mobilesdk.r4[] r0 = com.medallia.digital.mobilesdk.C11076r4.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31968b = r0
                r1 = 1
                com.medallia.digital.mobilesdk.r4 r2 = com.medallia.digital.mobilesdk.C11076r4.select     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f31968b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.medallia.digital.mobilesdk.r4 r3 = com.medallia.digital.mobilesdk.C11076r4.delete     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f31968b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.medallia.digital.mobilesdk.r4 r4 = com.medallia.digital.mobilesdk.C11076r4.replace     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r3 = f31968b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.medallia.digital.mobilesdk.r4 r4 = com.medallia.digital.mobilesdk.C11076r4.permission     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r3 = f31968b     // Catch:{ NoSuchFieldError -> 0x003e }
                com.medallia.digital.mobilesdk.r4 r4 = com.medallia.digital.mobilesdk.C11076r4.videoTimeLimitation     // Catch:{ NoSuchFieldError -> 0x003e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                com.medallia.digital.mobilesdk.a5[] r3 = com.medallia.digital.mobilesdk.C10721a5.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f31967a = r3
                com.medallia.digital.mobilesdk.a5 r4 = com.medallia.digital.mobilesdk.C10721a5.video     // Catch:{ NoSuchFieldError -> 0x004f }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                int[] r1 = f31967a     // Catch:{ NoSuchFieldError -> 0x0059 }
                com.medallia.digital.mobilesdk.a5 r3 = com.medallia.digital.mobilesdk.C10721a5.audio     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                int[] r0 = f31967a     // Catch:{ NoSuchFieldError -> 0x0063 }
                com.medallia.digital.mobilesdk.a5 r1 = com.medallia.digital.mobilesdk.C10721a5.upload     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.C11113u4.C11114a.<clinit>():void");
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.u4$b */
    class C11115b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C11087s4 f31969a;

        C11115b(C11087s4 s4Var) {
            this.f31969a = s4Var;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            this.f31969a.mo27619a(C11076r4.ok);
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.u4$c */
    class C11116c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C11087s4 f31971a;

        C11116c(C11087s4 s4Var) {
            this.f31971a = s4Var;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            this.f31971a.mo27619a(C11076r4.delete);
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.u4$d */
    class C11117d implements DialogInterface.OnClickListener {
        C11117d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.u4$e */
    class C11118e implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C11087s4 f31974a;

        C11118e(C11087s4 s4Var) {
            this.f31974a = s4Var;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            this.f31974a.mo27619a(C11076r4.replace);
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.u4$f */
    class C11119f implements DialogInterface.OnClickListener {
        C11119f() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.u4$g */
    class C11120g implements DialogInterface.OnClickListener {
        C11120g() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.u4$h */
    class C11121h implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C11087s4 f31978a;

        C11121h(C11087s4 s4Var) {
            this.f31978a = s4Var;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            this.f31978a.mo27619a(C11076r4.ok);
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.u4$i */
    class C11122i extends C11033o4 {

        /* renamed from: a */
        final /* synthetic */ C0214c.C0215a f31980a;

        C11122i(C0214c.C0215a aVar) {
            this.f31980a = aVar;
        }

        /* renamed from: a */
        public void mo27617a() {
            C0214c create = this.f31980a.create();
            if (create != null) {
                create.show();
            }
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.u4$j */
    class C11123j extends C11033o4 {
        C11123j() {
        }

        /* renamed from: a */
        public void mo27617a() {
            Context b = C10884i4.m39721c().mo28483b();
            ProgressDialog unused = C11113u4.this.f31965c = new ProgressDialog(C10884i4.m39721c().mo28484d());
            C11113u4.this.f31965c.setTitle(b.getString(C10706R.string.progress_dialog_title));
            C11113u4.this.f31965c.setMessage(b.getString(C10706R.string.progress_dialog_body));
            C11113u4.this.f31965c.setProgressStyle(0);
            C11113u4.this.f31965c.setIndeterminate(false);
            C11113u4.this.f31965c.setCancelable(false);
            C11113u4.this.f31965c.show();
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.u4$k */
    public enum C11124k {
        denyPermission(0),
        allowAudioPermission(1),
        stopAudioRecording(2),
        finishMediaRecording(3),
        unSupportedMediaFormat(4);
        

        /* renamed from: a */
        private final int f31989a;

        private C11124k(int i) {
            this.f31989a = i;
        }

        /* renamed from: a */
        public int mo29042a() {
            return this.f31989a;
        }
    }

    C11113u4() {
    }

    /* renamed from: b */
    protected static C11113u4 m40748b() {
        if (f31962l == null) {
            f31962l = new C11113u4();
        }
        return f31962l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo29033c() {
        try {
            ((Activity) C10884i4.m39721c().mo28484d().getBaseContext()).runOnUiThread(new C11123j());
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo29034d() {
        try {
            MediaRecorder mediaRecorder = this.f31963a;
            if (mediaRecorder != null) {
                mediaRecorder.stop();
                this.f31963a.release();
                this.f31963a = null;
                C10735b4.m39113e("Audio recording was finished");
            }
        } catch (Exception e) {
            C10735b4.m39111c("Audio Recorder doesn't exist " + e.getMessage());
            throw new Exception();
        }
    }

    /* renamed from: b */
    public String mo29031b(Uri uri, String str, String str2) {
        File a = mo29022a(str, str2);
        try {
            FileInputStream createInputStream = C10884i4.m39721c().mo28483b().getContentResolver().openAssetFileDescriptor(uri, "r").createInputStream();
            File file = new File(C10930k2.m39974a(uri));
            if (!file.exists()) {
                file.mkdirs();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(a);
            byte[] bArr = new byte[f31960j];
            while (true) {
                int read = createInputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
                fileOutputStream.flush();
            }
            createInputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
        return a.getAbsolutePath();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C11173w4 mo29020a(C11225y4 y4Var, C11013n2 n2Var, boolean z) {
        Activity activity = (Activity) C10884i4.m39721c().mo28484d().getBaseContext();
        this.f31964b = y4Var;
        ArrayList arrayList = new ArrayList();
        String d = y4Var.mo29229d();
        if (d != null && !d.isEmpty()) {
            int i = C11114a.f31967a[C10721a5.m39049a(d).ordinal()];
            if (i == 1) {
                int a = C0767a.m2891a(activity, "android.permission.CAMERA");
                if (a == 0 || this.f31966d.isEmpty() || !this.f31966d.contains("android.permission.CAMERA")) {
                    if (a != 0) {
                        arrayList.add("android.permission.CAMERA");
                    } else {
                        mo29026a(activity, y4Var.mo29230e());
                    }
                }
            } else if (i == 2) {
                int a2 = C0767a.m2891a(activity, "android.permission.RECORD_AUDIO");
                if (a2 == 0 || this.f31966d.isEmpty() || !this.f31966d.contains("android.permission.RECORD_AUDIO")) {
                    if (a2 == 0) {
                        return mo29021a(d, n2Var.getFormId(), n2Var.mo28793b(), y4Var.mo29228c());
                    }
                    arrayList.add("android.permission.RECORD_AUDIO");
                }
            } else if (i == 3) {
                int a3 = C0767a.m2891a(activity, "android.permission.READ_EXTERNAL_STORAGE");
                if (a3 == 0 || this.f31966d.isEmpty() || !this.f31966d.contains("android.permission.READ_EXTERNAL_STORAGE")) {
                    if (a3 != 0) {
                        arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
                    } else {
                        mo29025a(activity);
                    }
                }
            }
            mo29027a(C11076r4.permission, (C11087s4<C11076r4>) null, n2Var, z);
            return null;
        }
        if (!arrayList.isEmpty()) {
            ActivityCompat.m2589u(activity, (String[]) arrayList.toArray(new String[0]), 7);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo29032b(String str) {
        if (str != null && !this.f31966d.contains(str)) {
            this.f31966d.add(str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C11173w4 mo29021a(String str, String str2, String str3, String str4) {
        File file = new File(C10930k2.m39991f(f31958h));
        String uuid = UUID.randomUUID().toString();
        String str5 = file + C11110u2.f31950c + uuid + C10721a5.m39051c(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        MediaRecorder mediaRecorder = new MediaRecorder();
        this.f31963a = mediaRecorder;
        mediaRecorder.setAudioSource(1);
        this.f31963a.setOutputFormat(1);
        this.f31963a.setAudioEncoder(4);
        this.f31963a.setOutputFile(str5);
        try {
            this.f31963a.prepare();
            this.f31963a.start();
            C10735b4.m39109b("Start record audio was call");
            return new C11173w4(uuid, (String) null, str5, str2, str3, C10721a5.m39050b(str), System.currentTimeMillis(), str4, 0);
        } catch (Exception e) {
            C10735b4.m39113e("Cannot record audio media " + e.getMessage());
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public File mo29022a(String str, String str2) {
        File file = new File(C10930k2.m39985d(), f31958h);
        if (!file.exists()) {
            file.mkdir();
        }
        return new File(file, str + C10721a5.m39051c(str2));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0078 A[SYNTHETIC, Splitter:B:25:0x0078] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0080 A[Catch:{ Exception -> 0x007c }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0098 A[SYNTHETIC, Splitter:B:36:0x0098] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a0 A[Catch:{ Exception -> 0x009c }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo29023a(android.net.Uri r10, java.lang.String r11, java.lang.String r12) {
        /*
            r9 = this;
            java.io.File r0 = r9.mo29022a((java.lang.String) r11, (java.lang.String) r12)
            r1 = 0
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x005c, all -> 0x0059 }
            r3 = 29
            if (r2 < r3) goto L_0x0054
            com.medallia.digital.mobilesdk.i4 r11 = com.medallia.digital.mobilesdk.C10884i4.m39721c()     // Catch:{ Exception -> 0x005c, all -> 0x0059 }
            android.content.Context r11 = r11.mo28483b()     // Catch:{ Exception -> 0x005c, all -> 0x0059 }
            android.content.ContentResolver r11 = r11.getContentResolver()     // Catch:{ Exception -> 0x005c, all -> 0x0059 }
            java.lang.String r12 = "r"
            android.os.ParcelFileDescriptor r10 = r11.openFileDescriptor(r10, r12)     // Catch:{ Exception -> 0x005c, all -> 0x0059 }
            java.io.FileInputStream r11 = new java.io.FileInputStream     // Catch:{ Exception -> 0x005c, all -> 0x0059 }
            java.io.FileDescriptor r10 = r10.getFileDescriptor()     // Catch:{ Exception -> 0x005c, all -> 0x0059 }
            r11.<init>(r10)     // Catch:{ Exception -> 0x005c, all -> 0x0059 }
            java.nio.channels.FileChannel r10 = r11.getChannel()     // Catch:{ Exception -> 0x005c, all -> 0x0059 }
            java.io.FileOutputStream r11 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x004f, all -> 0x004a }
            r11.<init>(r0)     // Catch:{ Exception -> 0x004f, all -> 0x004a }
            java.nio.channels.FileChannel r1 = r11.getChannel()     // Catch:{ Exception -> 0x004f, all -> 0x004a }
            r3 = 0
            long r5 = r10.size()     // Catch:{ Exception -> 0x004f, all -> 0x004a }
            r2 = r10
            r7 = r1
            r2.transferTo(r3, r5, r7)     // Catch:{ Exception -> 0x004f, all -> 0x004a }
            r10.close()     // Catch:{ Exception -> 0x004f, all -> 0x004a }
            r10.close()     // Catch:{ Exception -> 0x007c }
            if (r1 == 0) goto L_0x008b
            r1.close()     // Catch:{ Exception -> 0x007c }
            goto L_0x008b
        L_0x004a:
            r11 = move-exception
            r8 = r1
            r1 = r10
            r10 = r8
            goto L_0x0096
        L_0x004f:
            r11 = move-exception
            r8 = r1
            r1 = r10
            r10 = r8
            goto L_0x005e
        L_0x0054:
            java.lang.String r10 = r9.mo29031b(r10, r11, r12)     // Catch:{ Exception -> 0x005c, all -> 0x0059 }
            return r10
        L_0x0059:
            r11 = move-exception
            r10 = r1
            goto L_0x0096
        L_0x005c:
            r11 = move-exception
            r10 = r1
        L_0x005e:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0095 }
            r12.<init>()     // Catch:{ all -> 0x0095 }
            java.lang.String r2 = "Can not create the media file + "
            r12.append(r2)     // Catch:{ all -> 0x0095 }
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x0095 }
            r12.append(r11)     // Catch:{ all -> 0x0095 }
            java.lang.String r11 = r12.toString()     // Catch:{ all -> 0x0095 }
            com.medallia.digital.mobilesdk.C10735b4.m39111c(r11)     // Catch:{ all -> 0x0095 }
            if (r1 == 0) goto L_0x007e
            r1.close()     // Catch:{ Exception -> 0x007c }
            goto L_0x007e
        L_0x007c:
            r10 = move-exception
            goto L_0x0084
        L_0x007e:
            if (r10 == 0) goto L_0x008b
            r10.close()     // Catch:{ Exception -> 0x007c }
            goto L_0x008b
        L_0x0084:
            java.lang.String r10 = r10.getMessage()
            com.medallia.digital.mobilesdk.C10735b4.m39111c(r10)
        L_0x008b:
            java.lang.String r10 = "File Saved to internal storage"
            com.medallia.digital.mobilesdk.C10735b4.m39109b(r10)
            java.lang.String r10 = r0.getAbsolutePath()
            return r10
        L_0x0095:
            r11 = move-exception
        L_0x0096:
            if (r1 == 0) goto L_0x009e
            r1.close()     // Catch:{ Exception -> 0x009c }
            goto L_0x009e
        L_0x009c:
            r10 = move-exception
            goto L_0x00a4
        L_0x009e:
            if (r10 == 0) goto L_0x00ab
            r10.close()     // Catch:{ Exception -> 0x009c }
            goto L_0x00ab
        L_0x00a4:
            java.lang.String r10 = r10.getMessage()
            com.medallia.digital.mobilesdk.C10735b4.m39111c(r10)
        L_0x00ab:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.C11113u4.mo29023a(android.net.Uri, java.lang.String, java.lang.String):java.lang.String");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29024a() {
        ProgressDialog progressDialog = this.f31965c;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f31965c = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29025a(Activity activity) {
        try {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setDataAndType(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, f31959i);
            activity.startActivityForResult(intent, 3);
        } catch (Exception e) {
            C10735b4.m39111c("Upload Media from gallery Error + " + e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29026a(Activity activity, int i) {
        try {
            Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
            intent.putExtra("android.intent.extra.durationLimit", i);
            activity.startActivityForResult(intent, 2);
        } catch (Exception e) {
            C10735b4.m39111c("Capture Video Error + " + e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0258  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo29027a(com.medallia.digital.mobilesdk.C11076r4 r24, com.medallia.digital.mobilesdk.C11087s4<com.medallia.digital.mobilesdk.C11076r4> r25, com.medallia.digital.mobilesdk.C11013n2 r26, boolean r27) {
        /*
            r23 = this;
            r1 = r23
            r0 = r25
            com.medallia.digital.mobilesdk.y0 r2 = com.medallia.digital.mobilesdk.C11208y0.m41106c()
            com.medallia.digital.mobilesdk.ConfigurationContract r2 = r2.mo29204a()
            r3 = 0
            r4 = 1
            if (r27 != 0) goto L_0x0018
            com.medallia.digital.mobilesdk.PropertyConfigurationContract r5 = r2.propertyConfiguration
            boolean r5 = r5.isLocalizationEnable()
            if (r5 != 0) goto L_0x0028
        L_0x0018:
            if (r27 == 0) goto L_0x002a
            if (r26 == 0) goto L_0x002a
            java.lang.String r5 = r26.getFormLanguage()
            java.lang.String r6 = "null"
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L_0x002a
        L_0x0028:
            r5 = r4
            goto L_0x002b
        L_0x002a:
            r5 = r3
        L_0x002b:
            if (r5 == 0) goto L_0x003c
            com.medallia.digital.mobilesdk.z3 r2 = r2.getLocalization()
            if (r2 == 0) goto L_0x003c
            com.medallia.digital.mobilesdk.ResourceContract r2 = r2.mo29251f()
            java.lang.String r2 = r2.getLocalUrl()
            goto L_0x003e
        L_0x003c:
            java.lang.String r2 = ""
        L_0x003e:
            com.medallia.digital.mobilesdk.i4 r6 = com.medallia.digital.mobilesdk.C10884i4.m39721c()
            android.content.Context r6 = r6.mo28483b()
            int[] r7 = com.medallia.digital.mobilesdk.C11113u4.C11114a.f31968b
            int r8 = r24.ordinal()
            r7 = r7[r8]
            r8 = 0
            if (r7 == r4) goto L_0x01e4
            r9 = 2
            if (r7 == r9) goto L_0x018c
            r9 = 3
            if (r7 == r9) goto L_0x0120
            r9 = 4
            if (r7 == r9) goto L_0x00d3
            r9 = 5
            if (r7 == r9) goto L_0x0068
            r12 = r8
            r13 = r12
            r15 = r13
            r16 = r15
            r17 = r16
            r18 = r17
            goto L_0x0235
        L_0x0068:
            int r7 = com.medallia.digital.mobilesdk.C10706R.string.record_limitation_title
            java.lang.String r7 = r6.getString(r7)
            int r9 = com.medallia.digital.mobilesdk.C10706R.string.record_limitation_body
            java.lang.String r9 = r6.getString(r9)
            java.lang.Object[] r10 = new java.lang.Object[r4]
            com.medallia.digital.mobilesdk.y4 r11 = r1.f31964b
            int r11 = r11.mo29230e()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10[r3] = r11
            java.lang.String r9 = java.lang.String.format(r9, r10)
            int r10 = com.medallia.digital.mobilesdk.C10706R.string.got_it
            java.lang.String r6 = r6.getString(r10)
            if (r5 == 0) goto L_0x00cc
            if (r26 == 0) goto L_0x00cc
            com.medallia.digital.mobilesdk.y3 r5 = com.medallia.digital.mobilesdk.C11221y3.m41127d()
            java.lang.String r6 = r26.getFormLanguage()
            com.medallia.digital.mobilesdk.y3$a r7 = com.medallia.digital.mobilesdk.C11221y3.C11222a.VIDEO_LIMITATION_ALERT_TITLE
            java.lang.String r7 = r5.mo29210a((java.lang.String) r2, (java.lang.String) r6, (com.medallia.digital.mobilesdk.C11221y3.C11224c) r8, (com.medallia.digital.mobilesdk.C11221y3.C11222a) r7)
            com.medallia.digital.mobilesdk.y3 r5 = com.medallia.digital.mobilesdk.C11221y3.m41127d()
            java.lang.String r6 = r26.getFormLanguage()
            com.medallia.digital.mobilesdk.y3$a r9 = com.medallia.digital.mobilesdk.C11221y3.C11222a.VIDEO_LIMITATION_ALERT_BODY
            java.lang.String r5 = r5.mo29210a((java.lang.String) r2, (java.lang.String) r6, (com.medallia.digital.mobilesdk.C11221y3.C11224c) r8, (com.medallia.digital.mobilesdk.C11221y3.C11222a) r9)
            java.lang.Object[] r6 = new java.lang.Object[r4]
            com.medallia.digital.mobilesdk.y4 r9 = r1.f31964b
            int r9 = r9.mo29230e()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r6[r3] = r9
            java.lang.String r9 = java.lang.String.format(r5, r6)
            com.medallia.digital.mobilesdk.y3 r5 = com.medallia.digital.mobilesdk.C11221y3.m41127d()
            java.lang.String r6 = r26.getFormLanguage()
            com.medallia.digital.mobilesdk.y3$a r10 = com.medallia.digital.mobilesdk.C11221y3.C11222a.GOT_IT
            java.lang.String r6 = r5.mo29210a((java.lang.String) r2, (java.lang.String) r6, (com.medallia.digital.mobilesdk.C11221y3.C11224c) r8, (com.medallia.digital.mobilesdk.C11221y3.C11222a) r10)
        L_0x00cc:
            com.medallia.digital.mobilesdk.u4$h r2 = new com.medallia.digital.mobilesdk.u4$h
            r2.<init>(r0)
            goto L_0x022c
        L_0x00d3:
            int r0 = com.medallia.digital.mobilesdk.C10706R.string.permission_deny_title
            java.lang.String r0 = r6.getString(r0)
            int r7 = com.medallia.digital.mobilesdk.C10706R.string.permission_deny_body
            java.lang.String r7 = r6.getString(r7)
            int r9 = com.medallia.digital.mobilesdk.C10706R.string.got_it
            java.lang.String r6 = r6.getString(r9)
            if (r5 == 0) goto L_0x0117
            if (r26 == 0) goto L_0x0117
            com.medallia.digital.mobilesdk.y3 r0 = com.medallia.digital.mobilesdk.C11221y3.m41127d()
            java.lang.String r5 = r26.getFormLanguage()
            com.medallia.digital.mobilesdk.y3$a r6 = com.medallia.digital.mobilesdk.C11221y3.C11222a.PERMISSION_DENY_TITLE
            java.lang.String r0 = r0.mo29210a((java.lang.String) r2, (java.lang.String) r5, (com.medallia.digital.mobilesdk.C11221y3.C11224c) r8, (com.medallia.digital.mobilesdk.C11221y3.C11222a) r6)
            com.medallia.digital.mobilesdk.y3 r5 = com.medallia.digital.mobilesdk.C11221y3.m41127d()
            java.lang.String r6 = r26.getFormLanguage()
            com.medallia.digital.mobilesdk.y3$a r7 = com.medallia.digital.mobilesdk.C11221y3.C11222a.PERMISSION_DENY_BODY
            java.lang.String r5 = r5.mo29210a((java.lang.String) r2, (java.lang.String) r6, (com.medallia.digital.mobilesdk.C11221y3.C11224c) r8, (com.medallia.digital.mobilesdk.C11221y3.C11222a) r7)
            com.medallia.digital.mobilesdk.y3 r6 = com.medallia.digital.mobilesdk.C11221y3.m41127d()
            java.lang.String r7 = r26.getFormLanguage()
            com.medallia.digital.mobilesdk.y3$a r9 = com.medallia.digital.mobilesdk.C11221y3.C11222a.GOT_IT
            java.lang.String r2 = r6.mo29210a((java.lang.String) r2, (java.lang.String) r7, (com.medallia.digital.mobilesdk.C11221y3.C11224c) r8, (com.medallia.digital.mobilesdk.C11221y3.C11222a) r9)
            r7 = r0
            r6 = r2
            r9 = r5
            goto L_0x0119
        L_0x0117:
            r9 = r7
            r7 = r0
        L_0x0119:
            com.medallia.digital.mobilesdk.u4$g r2 = new com.medallia.digital.mobilesdk.u4$g
            r2.<init>()
            goto L_0x022c
        L_0x0120:
            int r7 = com.medallia.digital.mobilesdk.C10706R.string.replace_capture_media_title
            java.lang.String r7 = r6.getString(r7)
            int r9 = com.medallia.digital.mobilesdk.C10706R.string.replace_capture_media_body
            java.lang.String r9 = r6.getString(r9)
            int r10 = com.medallia.digital.mobilesdk.C10706R.string.replace
            java.lang.String r10 = r6.getString(r10)
            int r11 = com.medallia.digital.mobilesdk.C10706R.string.cancel
            java.lang.String r6 = r6.getString(r11)
            if (r5 == 0) goto L_0x0177
            if (r26 == 0) goto L_0x0177
            com.medallia.digital.mobilesdk.y3 r5 = com.medallia.digital.mobilesdk.C11221y3.m41127d()
            java.lang.String r6 = r26.getFormLanguage()
            com.medallia.digital.mobilesdk.y3$a r7 = com.medallia.digital.mobilesdk.C11221y3.C11222a.ALERT_TITLE_REPLACE_MEDIA_CAPTURE
            java.lang.String r5 = r5.mo29210a((java.lang.String) r2, (java.lang.String) r6, (com.medallia.digital.mobilesdk.C11221y3.C11224c) r8, (com.medallia.digital.mobilesdk.C11221y3.C11222a) r7)
            com.medallia.digital.mobilesdk.y3 r6 = com.medallia.digital.mobilesdk.C11221y3.m41127d()
            java.lang.String r7 = r26.getFormLanguage()
            com.medallia.digital.mobilesdk.y3$a r9 = com.medallia.digital.mobilesdk.C11221y3.C11222a.ALERT_BODY_REPLACE_MEDIA_CAPTURE
            java.lang.String r6 = r6.mo29210a((java.lang.String) r2, (java.lang.String) r7, (com.medallia.digital.mobilesdk.C11221y3.C11224c) r8, (com.medallia.digital.mobilesdk.C11221y3.C11222a) r9)
            com.medallia.digital.mobilesdk.y3 r7 = com.medallia.digital.mobilesdk.C11221y3.m41127d()
            java.lang.String r9 = r26.getFormLanguage()
            com.medallia.digital.mobilesdk.y3$a r10 = com.medallia.digital.mobilesdk.C11221y3.C11222a.REPLACE
            java.lang.String r7 = r7.mo29210a((java.lang.String) r2, (java.lang.String) r9, (com.medallia.digital.mobilesdk.C11221y3.C11224c) r8, (com.medallia.digital.mobilesdk.C11221y3.C11222a) r10)
            com.medallia.digital.mobilesdk.y3 r9 = com.medallia.digital.mobilesdk.C11221y3.m41127d()
            java.lang.String r10 = r26.getFormLanguage()
            com.medallia.digital.mobilesdk.y3$a r11 = com.medallia.digital.mobilesdk.C11221y3.C11222a.CANCEL
            java.lang.String r2 = r9.mo29210a((java.lang.String) r2, (java.lang.String) r10, (com.medallia.digital.mobilesdk.C11221y3.C11224c) r8, (com.medallia.digital.mobilesdk.C11221y3.C11222a) r11)
            r9 = r6
            r6 = r2
            goto L_0x0179
        L_0x0177:
            r5 = r7
            r7 = r10
        L_0x0179:
            com.medallia.digital.mobilesdk.u4$e r2 = new com.medallia.digital.mobilesdk.u4$e
            r2.<init>(r0)
            com.medallia.digital.mobilesdk.u4$f r0 = new com.medallia.digital.mobilesdk.u4$f
            r0.<init>()
            r18 = r0
            r17 = r2
            r15 = r5
            r13 = r6
            r12 = r7
            goto L_0x0233
        L_0x018c:
            int r7 = com.medallia.digital.mobilesdk.C10706R.string.delete_capture_media_title
            java.lang.String r7 = r6.getString(r7)
            int r9 = com.medallia.digital.mobilesdk.C10706R.string.delete
            java.lang.String r9 = r6.getString(r9)
            int r10 = com.medallia.digital.mobilesdk.C10706R.string.cancel
            java.lang.String r6 = r6.getString(r10)
            if (r5 == 0) goto L_0x01ce
            if (r26 == 0) goto L_0x01ce
            com.medallia.digital.mobilesdk.y3 r5 = com.medallia.digital.mobilesdk.C11221y3.m41127d()
            java.lang.String r6 = r26.getFormLanguage()
            com.medallia.digital.mobilesdk.y3$a r7 = com.medallia.digital.mobilesdk.C11221y3.C11222a.ALERT_TITLE_DELETE_MEDIA_CAPTURE
            java.lang.String r5 = r5.mo29210a((java.lang.String) r2, (java.lang.String) r6, (com.medallia.digital.mobilesdk.C11221y3.C11224c) r8, (com.medallia.digital.mobilesdk.C11221y3.C11222a) r7)
            com.medallia.digital.mobilesdk.y3 r6 = com.medallia.digital.mobilesdk.C11221y3.m41127d()
            java.lang.String r7 = r26.getFormLanguage()
            com.medallia.digital.mobilesdk.y3$a r9 = com.medallia.digital.mobilesdk.C11221y3.C11222a.DELETE
            java.lang.String r6 = r6.mo29210a((java.lang.String) r2, (java.lang.String) r7, (com.medallia.digital.mobilesdk.C11221y3.C11224c) r8, (com.medallia.digital.mobilesdk.C11221y3.C11222a) r9)
            com.medallia.digital.mobilesdk.y3 r7 = com.medallia.digital.mobilesdk.C11221y3.m41127d()
            java.lang.String r9 = r26.getFormLanguage()
            com.medallia.digital.mobilesdk.y3$a r10 = com.medallia.digital.mobilesdk.C11221y3.C11222a.CANCEL
            java.lang.String r2 = r7.mo29210a((java.lang.String) r2, (java.lang.String) r9, (com.medallia.digital.mobilesdk.C11221y3.C11224c) r8, (com.medallia.digital.mobilesdk.C11221y3.C11222a) r10)
            r7 = r5
            goto L_0x01d0
        L_0x01ce:
            r2 = r6
            r6 = r9
        L_0x01d0:
            com.medallia.digital.mobilesdk.u4$c r5 = new com.medallia.digital.mobilesdk.u4$c
            r5.<init>(r0)
            com.medallia.digital.mobilesdk.u4$d r0 = new com.medallia.digital.mobilesdk.u4$d
            r0.<init>()
            r18 = r0
            r13 = r2
            r17 = r5
            r12 = r6
            r15 = r7
            r16 = r8
            goto L_0x0235
        L_0x01e4:
            int r7 = com.medallia.digital.mobilesdk.C10706R.string.wifi_warning_capture_media_title
            java.lang.String r7 = r6.getString(r7)
            int r9 = com.medallia.digital.mobilesdk.C10706R.string.wifi_warning_capture_media_body
            java.lang.String r9 = r6.getString(r9)
            int r10 = com.medallia.digital.mobilesdk.C10706R.string.got_it
            java.lang.String r6 = r6.getString(r10)
            if (r5 == 0) goto L_0x0227
            if (r26 == 0) goto L_0x0227
            com.medallia.digital.mobilesdk.y3 r5 = com.medallia.digital.mobilesdk.C11221y3.m41127d()
            java.lang.String r6 = r26.getFormLanguage()
            com.medallia.digital.mobilesdk.y3$a r7 = com.medallia.digital.mobilesdk.C11221y3.C11222a.WIFI_ALERT_TITLE
            java.lang.String r5 = r5.mo29210a((java.lang.String) r2, (java.lang.String) r6, (com.medallia.digital.mobilesdk.C11221y3.C11224c) r8, (com.medallia.digital.mobilesdk.C11221y3.C11222a) r7)
            com.medallia.digital.mobilesdk.y3 r6 = com.medallia.digital.mobilesdk.C11221y3.m41127d()
            java.lang.String r7 = r26.getFormLanguage()
            com.medallia.digital.mobilesdk.y3$a r9 = com.medallia.digital.mobilesdk.C11221y3.C11222a.WIFI_ALERT_BODY
            java.lang.String r6 = r6.mo29210a((java.lang.String) r2, (java.lang.String) r7, (com.medallia.digital.mobilesdk.C11221y3.C11224c) r8, (com.medallia.digital.mobilesdk.C11221y3.C11222a) r9)
            com.medallia.digital.mobilesdk.y3 r7 = com.medallia.digital.mobilesdk.C11221y3.m41127d()
            java.lang.String r9 = r26.getFormLanguage()
            com.medallia.digital.mobilesdk.y3$a r10 = com.medallia.digital.mobilesdk.C11221y3.C11222a.GOT_IT
            java.lang.String r2 = r7.mo29210a((java.lang.String) r2, (java.lang.String) r9, (com.medallia.digital.mobilesdk.C11221y3.C11224c) r8, (com.medallia.digital.mobilesdk.C11221y3.C11222a) r10)
            r7 = r5
            r9 = r6
            r6 = r2
        L_0x0227:
            com.medallia.digital.mobilesdk.u4$b r2 = new com.medallia.digital.mobilesdk.u4$b
            r2.<init>(r0)
        L_0x022c:
            r17 = r2
            r12 = r6
            r15 = r7
            r13 = r8
            r18 = r13
        L_0x0233:
            r16 = r9
        L_0x0235:
            com.medallia.digital.mobilesdk.l7 r10 = com.medallia.digital.mobilesdk.C10986l7.m40219c()
            if (r26 == 0) goto L_0x0243
            boolean r0 = r26.isDarkModeEnabled()
            if (r0 == 0) goto L_0x0243
            r11 = r4
            goto L_0x0244
        L_0x0243:
            r11 = r3
        L_0x0244:
            r14 = 0
            r19 = 0
            r20 = 0
            if (r26 == 0) goto L_0x0254
            com.medallia.digital.mobilesdk.MDAppearanceMode r0 = r26.mo28799d()
            if (r0 == 0) goto L_0x0254
            r21 = r4
            goto L_0x0256
        L_0x0254:
            r21 = r3
        L_0x0256:
            if (r26 == 0) goto L_0x025c
            com.medallia.digital.mobilesdk.MDAppearanceMode r8 = r26.mo28799d()
        L_0x025c:
            r22 = r8
            androidx.appcompat.app.c$a r0 = r10.mo28702a(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            com.medallia.digital.mobilesdk.u4$i r2 = new com.medallia.digital.mobilesdk.u4$i
            r2.<init>(r0)
            com.medallia.digital.mobilesdk.i4 r0 = com.medallia.digital.mobilesdk.C10884i4.m39721c()     // Catch:{ Exception -> 0x0279 }
            android.content.MutableContextWrapper r0 = r0.mo28484d()     // Catch:{ Exception -> 0x0279 }
            android.content.Context r0 = r0.getBaseContext()     // Catch:{ Exception -> 0x0279 }
            android.app.Activity r0 = (android.app.Activity) r0     // Catch:{ Exception -> 0x0279 }
            r0.runOnUiThread(r2)     // Catch:{ Exception -> 0x0279 }
            goto L_0x0281
        L_0x0279:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.medallia.digital.mobilesdk.C10735b4.m39111c(r0)
        L_0x0281:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.C11113u4.mo29027a(com.medallia.digital.mobilesdk.r4, com.medallia.digital.mobilesdk.s4, com.medallia.digital.mobilesdk.n2, boolean):void");
    }

    /* renamed from: a */
    public void mo29028a(String str) {
        try {
            C10930k2.m39983c(str);
            mo29034d();
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo29029a(Uri uri, int i) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(C10884i4.m39721c().mo28483b(), uri);
        String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
        mediaMetadataRetriever.release();
        return ((int) TimeUnit.MILLISECONDS.toSeconds(Long.parseLong(extractMetadata))) + -5 > i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo29030a(Uri uri, ArrayList<String> arrayList) {
        ContentResolver contentResolver = C10884i4.m39721c().mo28483b().getContentResolver();
        if (arrayList != null) {
            try {
                if (!arrayList.isEmpty()) {
                    FileDescriptor fileDescriptor = contentResolver.openFileDescriptor(uri, "r").getFileDescriptor();
                    MediaExtractor mediaExtractor = new MediaExtractor();
                    mediaExtractor.setDataSource(fileDescriptor);
                    int trackCount = mediaExtractor.getTrackCount();
                    for (int i = 0; i < trackCount; i++) {
                        if (arrayList.contains(mediaExtractor.getTrackFormat(i).getString("mime"))) {
                            C10735b4.m39113e("video format doesn't support");
                            return false;
                        }
                    }
                    return true;
                }
            } catch (Exception unused) {
                C10735b4.m39113e("Validate video format failed.");
            }
        }
        C10735b4.m39113e("unSupportedVideoFormats list is null");
        return true;
    }
}
