package com.salesforce.marketingcloud.messages.iam;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.alarms.C11307a;
import com.salesforce.marketingcloud.alarms.C11327b;
import com.salesforce.marketingcloud.analytics.C11358f;
import com.salesforce.marketingcloud.events.C11424c;
import com.salesforce.marketingcloud.events.C11436f;
import com.salesforce.marketingcloud.internal.C11505g;
import com.salesforce.marketingcloud.internal.C11513l;
import com.salesforce.marketingcloud.media.C11555b;
import com.salesforce.marketingcloud.media.C11580o;
import com.salesforce.marketingcloud.messages.iam.InAppMessage;
import com.salesforce.marketingcloud.messages.iam.InAppMessageManager;
import com.salesforce.marketingcloud.storage.C11751c;
import com.salesforce.marketingcloud.storage.C11794g;
import com.salesforce.marketingcloud.storage.C11800j;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import com.salesforce.marketingcloud.util.C11808c;
import com.salesforce.marketingcloud.util.C11824l;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.salesforce.marketingcloud.messages.iam.m */
class C11658m implements InAppMessageManager, C11650i, C11327b.C11329b, C11555b.C11556a, C11436f {

    /* renamed from: u */
    private static final int f33780u = 1;

    /* renamed from: v */
    private static final int f33781v = 111;

    /* renamed from: w */
    static final String f33782w = C11461g.m41875a("InAppMessageManager");

    /* renamed from: x */
    private static final String f33783x = "messagesAttemptedInSession";

    /* renamed from: y */
    private static final String f33784y = "maxMessagesPerSession";

    /* renamed from: z */
    private static final String f33785z = "minDurationBetweenMessages";

    /* renamed from: d */
    private final C11327b f33786d;

    /* renamed from: e */
    private final UrlHandler f33787e;

    /* renamed from: f */
    private final C11513l f33788f;

    /* renamed from: g */
    final Context f33789g;

    /* renamed from: h */
    final C11800j f33790h;

    /* renamed from: i */
    final C11358f f33791i;

    /* renamed from: j */
    final Object f33792j = new Object();

    /* renamed from: k */
    private Typeface f33793k;

    /* renamed from: l */
    private int f33794l;

    /* renamed from: m */
    private C11555b f33795m;

    /* renamed from: n */
    private InAppMessage f33796n;

    /* renamed from: o */
    private final AtomicInteger f33797o;

    /* renamed from: p */
    final AtomicInteger f33798p;

    /* renamed from: q */
    final Handler f33799q;

    /* renamed from: r */
    private final Handler f33800r;

    /* renamed from: s */
    InAppMessageManager.EventListener f33801s;

    /* renamed from: t */
    C11580o f33802t;

    /* renamed from: com.salesforce.marketingcloud.messages.iam.m$a */
    class C11659a extends C11505g {

        /* renamed from: b */
        final /* synthetic */ String f33803b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11659a(String str, Object[] objArr, String str2) {
            super(str, objArr);
            this.f33803b = str2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29760a() {
            InAppMessage a = C11658m.this.f33790h.mo31619p().mo31541a((Collection<String>) Collections.singletonList(this.f33803b), C11658m.this.f33790h.mo31604b());
            if (a != null) {
                C11658m.this.mo30741d(a);
                return;
            }
            C11461g.m41880a(C11658m.f33782w, "Unable to find InAppMessage for message id [%s]", this.f33803b);
        }
    }

    /* renamed from: com.salesforce.marketingcloud.messages.iam.m$b */
    class C11660b extends C11505g {

        /* renamed from: b */
        final /* synthetic */ InAppMessage f33805b;

        /* renamed from: com.salesforce.marketingcloud.messages.iam.m$b$a */
        class C11661a implements Runnable {
            C11661a() {
            }

            public void run() {
                C11660b bVar = C11660b.this;
                C11658m.this.f33801s.didShowMessage(bVar.f33805b);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11660b(String str, Object[] objArr, InAppMessage inAppMessage) {
            super(str, objArr);
            this.f33805b = inAppMessage;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29760a() {
            C11658m.this.f33790h.mo31619p().mo31542a(this.f33805b);
            C11658m.this.f33791i.mo29795a(this.f33805b);
            C11658m.this.mo30740d();
            synchronized (C11658m.this.f33792j) {
                if (C11658m.this.f33801s != null) {
                    try {
                        new Handler(Looper.getMainLooper()).post(new C11661a());
                    } catch (Exception e) {
                        C11461g.m41885b(C11658m.f33782w, e, "InAppMessage EventListener threw an exception", new Object[0]);
                    }
                }
            }
        }
    }

    /* renamed from: com.salesforce.marketingcloud.messages.iam.m$c */
    class C11662c extends C11505g {
        C11662c(String str, Object... objArr) {
            super(str, objArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29760a() {
            C11658m mVar = C11658m.this;
            mVar.mo30731a(mVar.f33790h.mo31619p().mo31545d(C11658m.this.f33790h.mo31604b()));
        }
    }

    /* renamed from: com.salesforce.marketingcloud.messages.iam.m$d */
    class C11663d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InAppMessage f33809a;

        C11663d(InAppMessage inAppMessage) {
            this.f33809a = inAppMessage;
        }

        public void run() {
            synchronized (C11658m.this.f33792j) {
                InAppMessageManager.EventListener eventListener = C11658m.this.f33801s;
                if (eventListener != null) {
                    try {
                        if (!eventListener.shouldShowMessage(this.f33809a)) {
                            C11461g.m41880a(C11658m.f33782w, "InAppMessage EventListener[%s] returned false for shouldShowMessage [%s]", C11658m.this.f33801s.getClass().getName(), this.f33809a.mo30522id());
                            return;
                        }
                    } catch (Exception e) {
                        C11461g.m41885b(C11658m.f33782w, e, "InAppMessage EventListener threw exception during shouldShowMessage", new Object[0]);
                    }
                }
            }
            try {
                Class<? extends C11645f> a = C11658m.this.mo30729a(this.f33809a);
                if (a != null) {
                    C11658m mVar = C11658m.this;
                    if (mVar.mo30733a(a, this.f33809a, mVar.f33789g)) {
                        C11658m.this.f33789g.startActivity(new Intent(C11658m.this.f33789g, a).setFlags(276889600).putExtra("messageHandler", new C11654k(this.f33809a)));
                        return;
                    }
                    return;
                }
                C11461g.m41880a(C11658m.f33782w, "Not supported", new Object[0]);
            } catch (Exception e2) {
                C11461g.m41885b(C11658m.f33782w, e2, "Failed to display InAppMessage [%s]", this.f33809a.mo30522id());
            }
        }
    }

    /* renamed from: com.salesforce.marketingcloud.messages.iam.m$e */
    static /* synthetic */ class C11664e {

        /* renamed from: a */
        static final /* synthetic */ int[] f33811a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.salesforce.marketingcloud.messages.iam.InAppMessage$Type[] r0 = com.salesforce.marketingcloud.messages.iam.InAppMessage.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f33811a = r0
                com.salesforce.marketingcloud.messages.iam.InAppMessage$Type r1 = com.salesforce.marketingcloud.messages.iam.InAppMessage.Type.bannerTop     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f33811a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.salesforce.marketingcloud.messages.iam.InAppMessage$Type r1 = com.salesforce.marketingcloud.messages.iam.InAppMessage.Type.bannerBottom     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f33811a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.salesforce.marketingcloud.messages.iam.InAppMessage$Type r1 = com.salesforce.marketingcloud.messages.iam.InAppMessage.Type.modal     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f33811a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.salesforce.marketingcloud.messages.iam.InAppMessage$Type r1 = com.salesforce.marketingcloud.messages.iam.InAppMessage.Type.fullImageFill     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f33811a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.salesforce.marketingcloud.messages.iam.InAppMessage$Type r1 = com.salesforce.marketingcloud.messages.iam.InAppMessage.Type.full     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.messages.iam.C11658m.C11664e.<clinit>():void");
        }
    }

    C11658m(Context context, C11800j jVar, C11327b bVar, C11580o oVar, UrlHandler urlHandler, C11513l lVar, C11358f fVar, Handler handler) {
        this.f33789g = context;
        this.f33790h = jVar;
        this.f33786d = bVar;
        this.f33802t = oVar;
        this.f33787e = urlHandler;
        this.f33791i = fVar;
        this.f33788f = lVar;
        bVar.mo29671a((C11327b.C11329b) this, C11307a.C11309b.IAM_IMAGE_BATCH);
        this.f33798p = new AtomicInteger();
        this.f33797o = new AtomicInteger();
        this.f33799q = new Handler(Looper.getMainLooper());
        this.f33800r = handler;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Class<? extends C11645f> mo30729a(InAppMessage inAppMessage) {
        int i = C11664e.f33811a[inAppMessage.type().ordinal()];
        if (i == 1 || i == 2) {
            return IamBannerActivity.class;
        }
        if (i == 3) {
            return IamModalActivity.class;
        }
        if (i == 4) {
            return IamFullImageFillActivity.class;
        }
        if (i != 5) {
            return null;
        }
        return IamFullscreenActivity.class;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo30734b(JSONObject jSONObject) {
        String optString = jSONObject.optString("id");
        String optString2 = jSONObject.optString("activityInstanceId");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return "";
        }
        String optString3 = jSONObject.optString("endDateUtc", (String) null);
        if (optString3 != null) {
            try {
                if (C11824l.m43299f(optString3).getTime() < System.currentTimeMillis()) {
                    return "ExpiredMessage";
                }
            } catch (Exception unused) {
                return "InvalidDate";
            }
        }
        String optString4 = jSONObject.optString("startDateUtc", (String) null);
        if (optString4 != null && m42562a(optString4)) {
            return "InvalidDate";
        }
        String optString5 = jSONObject.optString("modifiedDateUtc", (String) null);
        if (optString5 == null) {
            return "NoModifiedDate";
        }
        if (m42562a(optString5)) {
            return "InvalidDate";
        }
        try {
            InAppMessage.Type.valueOf(jSONObject.getString("type"));
            JSONObject optJSONObject = jSONObject.optJSONObject("media");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("title");
            JSONObject optJSONObject3 = jSONObject.optJSONObject("body");
            JSONArray optJSONArray = jSONObject.optJSONArray("buttons");
            if (optJSONObject == null && optJSONObject2 == null && optJSONObject3 == null && (optJSONArray == null || optJSONArray.length() == 0)) {
                return "NoContent";
            }
            if (optJSONObject != null) {
                Object opt = optJSONObject.opt(C11769i.C11770a.f34149l);
                if (!(opt instanceof String) || TextUtils.isEmpty((String) opt)) {
                    return "InvalidMedia";
                }
            }
            if (optJSONObject2 != null && TextUtils.isEmpty(optJSONObject2.optString("text", (String) null))) {
                return "InvalidTitle";
            }
            if (optJSONObject3 != null && TextUtils.isEmpty(optJSONObject3.optString("text", (String) null))) {
                return "InvalidBody";
            }
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject4 = optJSONArray.optJSONObject(i);
                    if (optJSONObject4 == null || TextUtils.isEmpty(optJSONObject4.optString("id")) || TextUtils.isEmpty(optJSONObject4.optString("text"))) {
                        return "InvalidButton";
                    }
                }
            }
            return null;
        } catch (Exception unused2) {
            return "NoMessageType";
        }
    }

    /* renamed from: c */
    public void mo30738c() {
        this.f33800r.removeCallbacksAndMessages((Object) null);
    }

    public boolean canDisplay(InAppMessage inAppMessage) {
        InAppMessage inAppMessage2 = this.f33796n;
        if (inAppMessage2 == null) {
            this.f33788f.mo30089b().execute(new C11660b("can_display", new Object[0], inAppMessage));
            this.f33796n = inAppMessage;
        } else if (inAppMessage != inAppMessage2) {
            C11461g.m41880a(f33782w, "In App Message [%s] not displayed because [%s] is currently being displayed", inAppMessage.mo30522id(), this.f33796n.mo30522id());
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo30740d() {
        this.f33798p.incrementAndGet();
        int i = this.f33790h.mo31608f().getInt(C11424c.f33235y, 0);
        if (i > 0) {
            this.f33799q.sendMessageDelayed(this.f33799q.obtainMessage(111), TimeUnit.SECONDS.toMillis((long) i));
        }
    }

    public int getStatusBarColor() {
        return this.f33794l;
    }

    public Typeface getTypeface() {
        return this.f33793k;
    }

    public void handleMessageFinished(InAppMessage inAppMessage, C11651j jVar) {
        InAppMessage inAppMessage2 = this.f33796n;
        if (inAppMessage2 != null && inAppMessage2.mo30522id().equals(inAppMessage.mo30522id())) {
            C11358f fVar = this.f33791i;
            if (fVar != null) {
                fVar.mo29796a(inAppMessage, jVar);
            }
            synchronized (this.f33792j) {
                InAppMessageManager.EventListener eventListener = this.f33801s;
                if (eventListener != null) {
                    try {
                        eventListener.didCloseMessage(inAppMessage);
                    } catch (Exception e) {
                        C11461g.m41885b(f33782w, e, "InAppMessageEventListener threw an exception", new Object[0]);
                    }
                }
            }
        }
        this.f33796n = null;
    }

    public void handleOutcomes(Collection<String> collection) {
        if (collection != null && !collection.isEmpty()) {
            String str = f33782w;
            C11461g.m41891d(str, "Resolving IAM from outcomes %s", collection.toString());
            InAppMessage a = this.f33790h.mo31619p().mo31541a(collection, this.f33790h.mo31604b());
            if (a != null) {
                C11461g.m41891d(str, "Outcomes resolved to message[%s]", a.mo30522id());
                mo30741d(a);
                return;
            }
            C11461g.m41891d(str, "No message resolved.", new Object[0]);
        }
    }

    public C11580o imageHandler() {
        return this.f33802t;
    }

    public void setInAppMessageListener(InAppMessageManager.EventListener eventListener) {
        synchronized (this.f33792j) {
            this.f33801s = eventListener;
        }
    }

    public void setStatusBarColor(int i) {
        this.f33794l = i;
    }

    public void setTypeface(Typeface typeface) {
        this.f33793k = typeface;
    }

    public void showMessage(String str) {
        if (str != null) {
            this.f33788f.mo30089b().execute(new C11659a("iam_showMessage", new Object[0], str));
        }
    }

    public UrlHandler urlHandler() {
        return this.f33787e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public JSONObject mo30730a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C11769i.f34134e, this.f33790h.mo31619p().mo31543c(this.f33790h.mo31604b()));
            InAppMessageManager.EventListener eventListener = this.f33801s;
            if (eventListener != null) {
                jSONObject.put("eventListener", eventListener.getClass().getName());
            }
            jSONObject.put("subscriberToken", this.f33790h.mo31606c().mo31112b(C11751c.f34090j, "null"));
            jSONObject.put("custom_font_set", this.f33793k != null);
            jSONObject.put("status_bar_color", this.f33794l);
        } catch (Exception e) {
            C11461g.m41885b(f33782w, e, "Unable to compile componentState for InAppMessageManager", new Object[0]);
        }
        return jSONObject;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo30735b() {
        this.f33798p.set(0);
        this.f33797o.set(0);
        this.f33799q.removeCallbacksAndMessages((Object) null);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0075 A[SYNTHETIC, Splitter:B:24:0x0075] */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo30739c(com.salesforce.marketingcloud.messages.iam.InAppMessage r9) {
        /*
            r8 = this;
            boolean r0 = r9.displayLimitOverride()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = f33782w
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r9 = r9.mo30522id()
            r1[r2] = r9
            java.lang.String r9 = "InAppMessage [%s] has displayLimit Override set. The message will not honour displayLimit settings"
            com.salesforce.marketingcloud.C11461g.m41880a((java.lang.String) r0, (java.lang.String) r9, (java.lang.Object[]) r1)
            return r2
        L_0x0018:
            com.salesforce.marketingcloud.storage.j r0 = r8.f33790h
            android.content.SharedPreferences r0 = r0.mo31608f()
            r3 = 2147483647(0x7fffffff, float:NaN)
            java.lang.String r4 = "event_max_display_in_session"
            int r0 = r0.getInt(r4, r3)
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x0080 }
            r3.<init>()     // Catch:{ Exception -> 0x0080 }
            java.util.concurrent.atomic.AtomicInteger r5 = r8.f33798p     // Catch:{ Exception -> 0x0080 }
            int r5 = r5.get()     // Catch:{ Exception -> 0x0080 }
            java.lang.String r6 = "maxMessagesPerSession"
            if (r5 < r0) goto L_0x004f
            com.salesforce.marketingcloud.storage.j r0 = r8.f33790h     // Catch:{ Exception -> 0x004c }
            android.content.SharedPreferences r0 = r0.mo31608f()     // Catch:{ Exception -> 0x004c }
            int r0 = r0.getInt(r4, r2)     // Catch:{ Exception -> 0x004c }
            r3.put(r6, r0)     // Catch:{ Exception -> 0x004c }
            java.lang.String r6 = "messagesAttemptedInSession"
            java.util.concurrent.atomic.AtomicInteger r0 = r8.f33797o     // Catch:{ Exception -> 0x004c }
        L_0x0047:
            int r0 = r0.incrementAndGet()     // Catch:{ Exception -> 0x004c }
            goto L_0x006d
        L_0x004c:
            r0 = move-exception
            r3 = r1
            goto L_0x0082
        L_0x004f:
            android.os.Handler r0 = r8.f33799q     // Catch:{ Exception -> 0x0080 }
            r4 = 111(0x6f, float:1.56E-43)
            boolean r0 = r0.hasMessages(r4)     // Catch:{ Exception -> 0x0080 }
            if (r0 == 0) goto L_0x0072
            java.lang.String r0 = "minDurationBetweenMessages"
            com.salesforce.marketingcloud.storage.j r4 = r8.f33790h     // Catch:{ Exception -> 0x004c }
            android.content.SharedPreferences r4 = r4.mo31608f()     // Catch:{ Exception -> 0x004c }
            java.lang.String r5 = "event_min_time_sec_in_session"
            int r4 = r4.getInt(r5, r2)     // Catch:{ Exception -> 0x004c }
            r3.put(r0, r4)     // Catch:{ Exception -> 0x004c }
            java.util.concurrent.atomic.AtomicInteger r0 = r8.f33797o     // Catch:{ Exception -> 0x004c }
            goto L_0x0047
        L_0x006d:
            r3.put(r6, r0)     // Catch:{ Exception -> 0x004c }
            r0 = r1
            goto L_0x0073
        L_0x0072:
            r0 = r2
        L_0x0073:
            if (r0 == 0) goto L_0x0092
            com.salesforce.marketingcloud.analytics.f r4 = r8.f33791i     // Catch:{ Exception -> 0x007b }
            r4.mo29797a((com.salesforce.marketingcloud.messages.iam.InAppMessage) r9, (org.json.JSONObject) r3)     // Catch:{ Exception -> 0x007b }
            goto L_0x0092
        L_0x007b:
            r3 = move-exception
            r7 = r3
            r3 = r0
            r0 = r7
            goto L_0x0082
        L_0x0080:
            r0 = move-exception
            r3 = r2
        L_0x0082:
            java.lang.String r4 = f33782w
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r9 = r9.mo30522id()
            r1[r2] = r9
            java.lang.String r9 = "Failed to log message Debug Analytics for IAM %s"
            com.salesforce.marketingcloud.C11461g.m41885b(r4, r0, r9, r1)
            r0 = r3
        L_0x0092:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.messages.iam.C11658m.mo30739c(com.salesforce.marketingcloud.messages.iam.InAppMessage):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo30741d(InAppMessage inAppMessage) {
        if (inAppMessage != null && !mo30739c(inAppMessage)) {
            this.f33800r.postDelayed(new C11663d(inAppMessage), (long) inAppMessage.messageDelaySec());
        }
    }

    /* renamed from: a */
    public void mo29684a(C11307a.C11309b bVar) {
        if (bVar == C11307a.C11309b.IAM_IMAGE_BATCH) {
            this.f33788f.mo30089b().execute(new C11662c("iam_image_cache", new Object[0]));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo30736b(InAppMessage inAppMessage) {
        try {
            this.f33791i.mo29799b(inAppMessage);
        } catch (Exception e) {
            C11461g.m41885b(f33782w, e, "Failed to log download analytics for IAM %s", inAppMessage.mo30522id());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo30731a(List<String> list) {
        if (!list.isEmpty()) {
            C11555b bVar = this.f33795m;
            if (bVar != null) {
                bVar.mo30173b();
            }
            C11555b a = this.f33802t.mo30230a(list);
            this.f33795m = a;
            a.mo30171a((C11555b.C11556a) this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo30737b(boolean z) {
        this.f33786d.mo29681e(C11307a.C11309b.IAM_IMAGE_BATCH);
        this.f33799q.removeCallbacksAndMessages((Object) null);
        C11555b bVar = this.f33795m;
        if (bVar != null) {
            bVar.mo30173b();
        }
        if (z) {
            C11794g p = this.f33790h.mo31619p();
            this.f33802t.mo30237a((Collection<String>) p.mo31545d(this.f33790h.mo31604b()));
            p.mo31539a((Collection<String>) Collections.emptyList());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo30732a(JSONObject jSONObject) {
        if (jSONObject.optInt("version") != 1) {
            C11461g.m41884b(f33782w, "Unable to handle sync payload due to version mismatch", new Object[0]);
            return;
        }
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("items");
            int length = jSONArray.length();
            C11461g.m41880a(f33782w, "%d in app message(s) received from sync.", Integer.valueOf(length));
            TreeSet treeSet = new TreeSet();
            C11794g p = this.f33790h.mo31619p();
            C11808c b = this.f33790h.mo31604b();
            List<String> d = p.mo31545d(b);
            for (int i = 0; i < length; i++) {
                try {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    String b2 = mo30734b(jSONObject2);
                    if (b2 == null) {
                        InAppMessage inAppMessage = new InAppMessage(jSONObject2);
                        if (p.mo31538a(inAppMessage, b) == 1) {
                            mo30736b(inAppMessage);
                        }
                        p.mo31544c(inAppMessage.mo30522id(), jSONObject2.optInt("displayCount", 0));
                        treeSet.add(inAppMessage.mo30522id());
                    } else if (!b2.isEmpty()) {
                        this.f33791i.mo29798a(jSONObject2.optString("id"), jSONObject2.optString("activityInstanceId"), Collections.singletonList(b2));
                    }
                } catch (Exception e) {
                    C11461g.m41885b(f33782w, e, "Unable to parse in app message payload", new Object[0]);
                }
            }
            p.mo31539a((Collection<String>) treeSet);
            List<String> d2 = p.mo31545d(b);
            mo30731a(d2);
            TreeSet treeSet2 = new TreeSet(d);
            treeSet2.removeAll(d2);
            this.f33802t.mo30237a((Collection<String>) treeSet2);
        } catch (JSONException e2) {
            C11461g.m41885b(f33782w, e2, "Unable to get InAppMessages from sync payload", new Object[0]);
        }
    }

    /* renamed from: a */
    public void mo30174a(boolean z) {
        if (z) {
            this.f33786d.mo29680d(C11307a.C11309b.IAM_IMAGE_BATCH);
            return;
        }
        this.f33786d.mo29675b(C11307a.C11309b.IAM_IMAGE_BATCH);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo30733a(Class<? extends C11645f> cls, InAppMessage inAppMessage, Context context) {
        return (cls == Class.forName(IamFullscreenActivity.class.getName()) && inAppMessage.type() == InAppMessage.Type.fullImageFill && context.getResources().getConfiguration().orientation != 1) ? false : true;
    }

    /* renamed from: a */
    private boolean m42562a(String str) {
        try {
            C11824l.m43299f(str);
            return false;
        } catch (Exception unused) {
            return true;
        }
    }
}
