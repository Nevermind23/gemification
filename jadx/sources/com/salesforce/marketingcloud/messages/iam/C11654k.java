package com.salesforce.marketingcloud.messages.iam;

import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.MarketingCloudSdk;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.media.C11580o;
import com.salesforce.marketingcloud.messages.iam.InAppMessage;
import java.util.Date;

/* renamed from: com.salesforce.marketingcloud.messages.iam.k */
class C11654k implements Parcelable {
    public static final Parcelable.Creator<C11654k> CREATOR = new C11655a();

    /* renamed from: g */
    private static final String f33772g = C11461g.m41875a("MessageHandler");

    /* renamed from: a */
    private final InAppMessage f33773a;

    /* renamed from: b */
    private C11650i f33774b;

    /* renamed from: c */
    private long f33775c;

    /* renamed from: d */
    private long f33776d;

    /* renamed from: e */
    private long f33777e;

    /* renamed from: f */
    private boolean f33778f;

    /* renamed from: com.salesforce.marketingcloud.messages.iam.k$a */
    class C11655a implements Parcelable.Creator<C11654k> {
        C11655a() {
        }

        /* renamed from: a */
        public C11654k createFromParcel(Parcel parcel) {
            return new C11654k(parcel);
        }

        /* renamed from: a */
        public C11654k[] newArray(int i) {
            return new C11654k[i];
        }
    }

    protected C11654k(Parcel parcel) {
        this((InAppMessage) parcel.readParcelable(InAppMessage.class.getClassLoader()));
        this.f33775c = parcel.readLong();
        this.f33776d = parcel.readLong();
        this.f33778f = parcel.readInt() != 1 ? false : true;
    }

    /* renamed from: h */
    private void m42533h() {
        if (this.f33778f) {
            this.f33776d += SystemClock.elapsedRealtime() - this.f33777e;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public PendingIntent mo30711a(Context context, InAppMessage.Button button) {
        UrlHandler urlHandler;
        String action = button.action();
        if (!(button.actionType() != InAppMessage.Button.ActionType.url || action == null || (urlHandler = this.f33774b.urlHandler()) == null)) {
            try {
                return urlHandler.handleUrl(context, action, UrlHandler.ACTION);
            } catch (Exception e) {
                C11461g.m41885b(f33772g, e, "Exception thrown by %s while handling url", urlHandler.getClass().getName());
            }
        }
        return null;
    }

    /* renamed from: b */
    public long mo30714b() {
        return this.f33776d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Date mo30715c() {
        return new Date(this.f33775c);
    }

    /* renamed from: d */
    public InAppMessage mo30716d() {
        return this.f33773a;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public C11580o mo30718e() {
        C11650i iVar = this.f33774b;
        if (iVar != null) {
            return iVar.imageHandler();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo30719f() {
        m42533h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo30720g() {
        if (this.f33775c == -1) {
            this.f33775c = System.currentTimeMillis();
        }
        this.f33777e = SystemClock.elapsedRealtime();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo30721i() {
        C11650i iVar = this.f33774b;
        if (iVar != null) {
            return iVar.getStatusBarColor();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo30722j() {
        m42533h();
        this.f33778f = false;
    }

    /* renamed from: k */
    public Typeface mo30723k() {
        C11650i iVar = this.f33774b;
        if (iVar != null) {
            return iVar.getTypeface();
        }
        return null;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f33773a, i);
        parcel.writeLong(this.f33775c);
        parcel.writeLong(this.f33776d);
        parcel.writeInt(this.f33778f ? 1 : 0);
    }

    C11654k(InAppMessage inAppMessage) {
        MarketingCloudSdk instance;
        this.f33775c = -1;
        this.f33778f = true;
        this.f33773a = inAppMessage;
        if ((MarketingCloudSdk.isInitializing() || MarketingCloudSdk.isReady()) && (instance = MarketingCloudSdk.getInstance()) != null) {
            this.f33774b = (C11650i) instance.getInAppMessageManager();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo30712a(C11651j jVar) {
        C11650i iVar = this.f33774b;
        if (iVar != null) {
            InAppMessage inAppMessage = this.f33773a;
            if (jVar == null) {
                jVar = C11651j.m42526e();
            }
            iVar.handleMessageFinished(inAppMessage, jVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f33774b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo30713a() {
        /*
            r2 = this;
            com.salesforce.marketingcloud.messages.iam.InAppMessage r0 = r2.f33773a
            if (r0 == 0) goto L_0x0010
            com.salesforce.marketingcloud.messages.iam.i r1 = r2.f33774b
            if (r1 == 0) goto L_0x0010
            boolean r0 = r1.canDisplay(r0)
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.messages.iam.C11654k.mo30713a():boolean");
    }
}
