package p149l;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.SparseArray;
import androidx.core.app.C0700h;
import androidx.core.content.C0767a;
import java.util.ArrayList;
import p149l.C6854a;

/* renamed from: l.b */
public final class C6856b {

    /* renamed from: a */
    public final Intent f20535a;

    /* renamed from: b */
    public final Bundle f20536b;

    C6856b(Intent intent, Bundle bundle) {
        this.f20535a = intent;
        this.f20536b = bundle;
    }

    /* renamed from: a */
    public void mo20930a(Context context, Uri uri) {
        this.f20535a.setData(uri);
        C0767a.m2903m(context, this.f20535a, this.f20536b);
    }

    /* renamed from: l.b$a */
    public static final class C6857a {

        /* renamed from: a */
        private final Intent f20537a = new Intent("android.intent.action.VIEW");

        /* renamed from: b */
        private final C6854a.C6855a f20538b = new C6854a.C6855a();

        /* renamed from: c */
        private ArrayList f20539c;

        /* renamed from: d */
        private Bundle f20540d;

        /* renamed from: e */
        private ArrayList f20541e;

        /* renamed from: f */
        private SparseArray f20542f;

        /* renamed from: g */
        private Bundle f20543g;

        /* renamed from: h */
        private int f20544h = 0;

        /* renamed from: i */
        private boolean f20545i = true;

        public C6857a() {
        }

        /* renamed from: b */
        private void m26642b(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            C0700h.m2717a(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f20537a.putExtras(bundle);
        }

        /* renamed from: a */
        public C6856b mo20931a() {
            if (!this.f20537a.hasExtra("android.support.customtabs.extra.SESSION")) {
                m26642b((IBinder) null, (PendingIntent) null);
            }
            ArrayList arrayList = this.f20539c;
            if (arrayList != null) {
                this.f20537a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList arrayList2 = this.f20541e;
            if (arrayList2 != null) {
                this.f20537a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f20537a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f20545i);
            this.f20537a.putExtras(this.f20538b.mo20928a().mo20927a());
            Bundle bundle = this.f20543g;
            if (bundle != null) {
                this.f20537a.putExtras(bundle);
            }
            if (this.f20542f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f20542f);
                this.f20537a.putExtras(bundle2);
            }
            this.f20537a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f20544h);
            return new C6856b(this.f20537a, this.f20540d);
        }

        /* renamed from: c */
        public C6857a mo20932c(int i) {
            this.f20538b.mo20929b(i);
            return this;
        }

        public C6857a(C6859d dVar) {
        }
    }
}
