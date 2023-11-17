package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.core.provider.C0946e;
import androidx.core.util.C1008h;
import androidx.emoji2.text.C1378e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.emoji2.text.c */
public abstract class C1372c {

    /* renamed from: androidx.emoji2.text.c$a */
    public static class C1373a {

        /* renamed from: a */
        private final C1374b f3931a;

        public C1373a(C1374b bVar) {
            this.f3931a = bVar == null ? m4716e() : bVar;
        }

        /* renamed from: a */
        private C1378e.C1382c m4713a(Context context, C0946e eVar) {
            if (eVar == null) {
                return null;
            }
            return new C1395j(context, eVar);
        }

        /* renamed from: b */
        private List m4714b(Signature[] signatureArr) {
            ArrayList arrayList = new ArrayList();
            for (Signature byteArray : signatureArr) {
                arrayList.add(byteArray.toByteArray());
            }
            return Collections.singletonList(arrayList);
        }

        /* renamed from: d */
        private C0946e m4715d(ProviderInfo providerInfo, PackageManager packageManager) {
            String str = providerInfo.authority;
            String str2 = providerInfo.packageName;
            return new C0946e(str, str2, "emojicompat-emoji-font", m4714b(this.f3931a.mo3985b(packageManager, str2)));
        }

        /* renamed from: e */
        private static C1374b m4716e() {
            if (Build.VERSION.SDK_INT >= 28) {
                return new C1376d();
            }
            return new C1375c();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
            r2 = r2.applicationInfo;
         */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean m4717f(android.content.pm.ProviderInfo r2) {
            /*
                r1 = this;
                if (r2 == 0) goto L_0x000d
                android.content.pm.ApplicationInfo r2 = r2.applicationInfo
                if (r2 == 0) goto L_0x000d
                int r2 = r2.flags
                r0 = 1
                r2 = r2 & r0
                if (r2 != r0) goto L_0x000d
                goto L_0x000e
            L_0x000d:
                r0 = 0
            L_0x000e:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.C1372c.C1373a.m4717f(android.content.pm.ProviderInfo):boolean");
        }

        /* renamed from: g */
        private ProviderInfo m4718g(PackageManager packageManager) {
            for (ResolveInfo a : this.f3931a.mo3986c(packageManager, new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0)) {
                ProviderInfo a2 = this.f3931a.mo3984a(a);
                if (m4717f(a2)) {
                    return a2;
                }
            }
            return null;
        }

        /* renamed from: c */
        public C1378e.C1382c mo3982c(Context context) {
            return m4713a(context, mo3983h(context));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public C0946e mo3983h(Context context) {
            PackageManager packageManager = context.getPackageManager();
            C1008h.m3531h(packageManager, "Package manager required to locate emoji font provider");
            ProviderInfo g = m4718g(packageManager);
            if (g == null) {
                return null;
            }
            try {
                return m4715d(g, packageManager);
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                return null;
            }
        }
    }

    /* renamed from: androidx.emoji2.text.c$b */
    public static class C1374b {
        /* renamed from: a */
        public abstract ProviderInfo mo3984a(ResolveInfo resolveInfo);

        /* renamed from: b */
        public Signature[] mo3985b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        /* renamed from: c */
        public abstract List mo3986c(PackageManager packageManager, Intent intent, int i);
    }

    /* renamed from: androidx.emoji2.text.c$c */
    public static class C1375c extends C1374b {
        /* renamed from: a */
        public ProviderInfo mo3984a(ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        /* renamed from: c */
        public List mo3986c(PackageManager packageManager, Intent intent, int i) {
            return packageManager.queryIntentContentProviders(intent, i);
        }
    }

    /* renamed from: androidx.emoji2.text.c$d */
    public static class C1376d extends C1375c {
        /* renamed from: b */
        public Signature[] mo3985b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    /* renamed from: a */
    public static C1395j m4712a(Context context) {
        return (C1395j) new C1373a((C1374b) null).mo3982c(context);
    }
}
