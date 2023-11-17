package com.medallia.digital.mobilesdk;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.C0750x;
import androidx.work.C1963h;
import androidx.work.C2068l;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import java.util.concurrent.CountDownLatch;
import p130j6.C6731g;
import p130j6.C6732h;

public class SubmitMediaFeedbackWorker extends Worker {

    /* renamed from: e */
    private static final String f30599e = "1002";

    /* renamed from: a */
    private final Context f30600a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2068l.C2069a[] f30601b = {C2068l.C2069a.m8066b()};
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final CountDownLatch f30602c = new CountDownLatch(1);

    /* renamed from: d */
    private final NotificationManager f30603d;

    /* renamed from: com.medallia.digital.mobilesdk.SubmitMediaFeedbackWorker$a */
    class C10710a implements C10796e6<String> {

        /* renamed from: a */
        final /* synthetic */ Boolean f30604a;

        /* renamed from: b */
        final /* synthetic */ C11024n8 f30605b;

        C10710a(Boolean bool, C11024n8 n8Var) {
            this.f30604a = bool;
            this.f30605b = n8Var;
        }

        /* renamed from: a */
        private void m38999a() {
            SubmitMediaFeedbackWorker.this.f30601b[0] = C2068l.C2069a.m8067c();
            SubmitMediaFeedbackWorker.this.f30602c.countDown();
            SubmitMediaFeedbackWorker.this.mo28037a(this.f30605b);
        }

        /* renamed from: a */
        public void mo27796a(C10859h4 h4Var) {
            C10735b4.m39111c("LivingLens Submit Media Feedback failed" + h4Var.getMessage());
            m38999a();
        }

        /* renamed from: a */
        public void mo27797a(String str) {
            C10735b4.m39113e("LivingLens Submit Media Feedback successfully sent ");
            if (!this.f30604a.booleanValue()) {
                C10933k4.m40000a(C10884i4.m39721c().mo28483b()).mo28628a(new Intent("com.medallia.digital.mobilesdk.sync_userjourney_action"));
            }
            C10735b4.m39113e("LivingLens Media capture response: " + str);
            m38999a();
        }
    }

    public SubmitMediaFeedbackWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f30600a = context;
        this.f30603d = (NotificationManager) context.getSystemService("notification");
    }

    /* renamed from: a */
    private void m38992a() {
        if (Build.VERSION.SDK_INT >= 26) {
            C6732h.m26251a();
            NotificationChannel a = C6731g.m26250a(f30599e, this.f30600a.getString(C10706R.string.channel_name), 3);
            a.setDescription(this.f30600a.getString(C10706R.string.channel_desc));
            this.f30603d.createNotificationChannel(a);
        }
    }

    /* renamed from: b */
    private C1963h m38994b() {
        if (Build.VERSION.SDK_INT >= 26) {
            m38992a();
        }
        C0750x.C0759e eVar = new C0750x.C0759e(this.f30600a, f30599e);
        Context context = this.f30600a;
        int i = C10706R.string.upload_media_file;
        return new C1963h(0, eVar.mo3219k(context.getString(i)).mo3232y(this.f30600a.getString(i)).mo3229v(C10706R.C10707drawable.ic_black).mo3226s(false).mo3227t(-2).mo3212b());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: com.medallia.digital.mobilesdk.w4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: com.medallia.digital.mobilesdk.w4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: com.medallia.digital.mobilesdk.t4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: com.medallia.digital.mobilesdk.t4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: com.medallia.digital.mobilesdk.w4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: com.medallia.digital.mobilesdk.t4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: com.medallia.digital.mobilesdk.w4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: com.medallia.digital.mobilesdk.w4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: com.medallia.digital.mobilesdk.w4} */
    /* JADX WARNING: type inference failed for: r1v4, types: [com.medallia.digital.mobilesdk.t4] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.work.C2068l.C2069a mo28039c() {
        /*
            r8 = this;
            java.lang.String r0 = "mediaCaptureConfig"
            java.lang.String r1 = "mediaData"
            androidx.work.e r2 = r8.getInputData()
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r4 = 0
            r5 = 0
            if (r2 == 0) goto L_0x0063
            java.lang.String r6 = r2.mo6730j(r1)     // Catch:{ JSONException -> 0x0046 }
            if (r6 == 0) goto L_0x0023
            com.medallia.digital.mobilesdk.w4 r6 = new com.medallia.digital.mobilesdk.w4     // Catch:{ JSONException -> 0x0046 }
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0046 }
            java.lang.String r1 = r2.mo6730j(r1)     // Catch:{ JSONException -> 0x0046 }
            r7.<init>(r1)     // Catch:{ JSONException -> 0x0046 }
            r6.<init>(r7)     // Catch:{ JSONException -> 0x0046 }
            goto L_0x0024
        L_0x0023:
            r6 = r5
        L_0x0024:
            java.lang.String r1 = r2.mo6730j(r0)     // Catch:{ JSONException -> 0x0044 }
            if (r1 == 0) goto L_0x0039
            com.medallia.digital.mobilesdk.t4 r1 = new com.medallia.digital.mobilesdk.t4     // Catch:{ JSONException -> 0x0044 }
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0044 }
            java.lang.String r0 = r2.mo6730j(r0)     // Catch:{ JSONException -> 0x0044 }
            r7.<init>(r0)     // Catch:{ JSONException -> 0x0044 }
            r1.<init>(r7)     // Catch:{ JSONException -> 0x0044 }
            r5 = r1
        L_0x0039:
            java.lang.String r0 = "isPreviewsApp"
            boolean r0 = r2.mo6727h(r0, r4)     // Catch:{ JSONException -> 0x0044 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)     // Catch:{ JSONException -> 0x0044 }
            goto L_0x0060
        L_0x0044:
            r0 = move-exception
            goto L_0x0048
        L_0x0046:
            r0 = move-exception
            r6 = r5
        L_0x0048:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "LivingLens Error getting data from getInputData()"
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.medallia.digital.mobilesdk.C10735b4.m39111c(r0)
        L_0x0060:
            r0 = r5
            r5 = r6
            goto L_0x0064
        L_0x0063:
            r0 = r5
        L_0x0064:
            com.medallia.digital.mobilesdk.n8 r1 = new com.medallia.digital.mobilesdk.n8
            java.lang.String r2 = r5.mo29138d()
            java.util.UUID r6 = r8.getId()
            java.lang.String r6 = r6.toString()
            r1.<init>(r2, r6)
            r8.mo28038b((com.medallia.digital.mobilesdk.C11024n8) r1)
            com.medallia.digital.mobilesdk.m4 r2 = com.medallia.digital.mobilesdk.C10998m4.m40266h()
            com.medallia.digital.mobilesdk.SubmitMediaFeedbackWorker$a r6 = new com.medallia.digital.mobilesdk.SubmitMediaFeedbackWorker$a
            r6.<init>(r3, r1)
            r2.mo28740a((com.medallia.digital.mobilesdk.C11173w4) r5, (com.medallia.digital.mobilesdk.C11099t4) r0, (java.lang.Boolean) r3, (com.medallia.digital.mobilesdk.C10796e6<java.lang.String>) r6)
            java.util.concurrent.CountDownLatch r0 = r8.f30602c     // Catch:{ InterruptedException -> 0x008a }
            r0.await()     // Catch:{ InterruptedException -> 0x008a }
            goto L_0x0092
        L_0x008a:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.medallia.digital.mobilesdk.C10735b4.m39111c(r0)
        L_0x0092:
            java.lang.String r0 = "LivingLens Return from Submit Media Feedback Worker"
            com.medallia.digital.mobilesdk.C10735b4.m39109b(r0)
            androidx.work.l$a[] r0 = r8.f30601b
            r0 = r0[r4]
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.SubmitMediaFeedbackWorker.mo28039c():androidx.work.l$a");
    }

    public C2068l.C2069a doWork() {
        setForegroundAsync(m38994b());
        return mo28039c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28037a(C11024n8 n8Var) {
        if (n8Var != null) {
            boolean a = C10876i1.m39698a().mo28465a((C10785e0) n8Var);
            C10735b4.m39109b("Worker Manager Data Delete from DB? " + a + " " + n8Var.mo28842a());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo28038b(C11024n8 n8Var) {
        if (n8Var == null) {
            return false;
        }
        C10735b4.m39109b("Worker Manager Data Saved in DB: " + n8Var.mo28842a());
        return C10876i1.m39698a().mo28472c((C10785e0) n8Var);
    }
}
