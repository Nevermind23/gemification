package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.content.LocusIdCompat;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import p266u.C8434b;

/* renamed from: androidx.core.app.x */
public abstract class C0750x {

    /* renamed from: androidx.core.app.x$a */
    public static class C0751a {

        /* renamed from: a */
        final Bundle f3324a;

        /* renamed from: b */
        private IconCompat f3325b;

        /* renamed from: c */
        private final C0695f1[] f3326c;

        /* renamed from: d */
        private final C0695f1[] f3327d;

        /* renamed from: e */
        private boolean f3328e;

        /* renamed from: f */
        boolean f3329f;

        /* renamed from: g */
        private final int f3330g;

        /* renamed from: h */
        private final boolean f3331h;

        /* renamed from: i */
        public int f3332i;

        /* renamed from: j */
        public CharSequence f3333j;

        /* renamed from: k */
        public PendingIntent f3334k;

        /* renamed from: l */
        private boolean f3335l;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C0751a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i != 0 ? IconCompat.m3114c((Resources) null, "", i) : null, charSequence, pendingIntent);
        }

        /* renamed from: a */
        public PendingIntent mo3191a() {
            return this.f3334k;
        }

        /* renamed from: b */
        public boolean mo3192b() {
            return this.f3328e;
        }

        /* renamed from: c */
        public Bundle mo3193c() {
            return this.f3324a;
        }

        /* renamed from: d */
        public IconCompat mo3194d() {
            int i;
            if (this.f3325b == null && (i = this.f3332i) != 0) {
                this.f3325b = IconCompat.m3114c((Resources) null, "", i);
            }
            return this.f3325b;
        }

        /* renamed from: e */
        public C0695f1[] mo3195e() {
            return this.f3326c;
        }

        /* renamed from: f */
        public int mo3196f() {
            return this.f3330g;
        }

        /* renamed from: g */
        public boolean mo3197g() {
            return this.f3329f;
        }

        /* renamed from: h */
        public CharSequence mo3198h() {
            return this.f3333j;
        }

        /* renamed from: i */
        public boolean mo3199i() {
            return this.f3335l;
        }

        /* renamed from: j */
        public boolean mo3200j() {
            return this.f3331h;
        }

        public C0751a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (C0695f1[]) null, (C0695f1[]) null, true, 0, true, false, false);
        }

        C0751a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C0695f1[] f1VarArr, C0695f1[] f1VarArr2, boolean z, int i, boolean z2, boolean z3, boolean z4) {
            this.f3329f = true;
            this.f3325b = iconCompat;
            if (iconCompat != null && iconCompat.mo3303g() == 2) {
                this.f3332i = iconCompat.mo3301e();
            }
            this.f3333j = C0759e.m2842d(charSequence);
            this.f3334k = pendingIntent;
            this.f3324a = bundle == null ? new Bundle() : bundle;
            this.f3326c = f1VarArr;
            this.f3327d = f1VarArr2;
            this.f3328e = z;
            this.f3330g = i;
            this.f3329f = z2;
            this.f3331h = z3;
            this.f3335l = z4;
        }
    }

    /* renamed from: androidx.core.app.x$b */
    public static class C0752b extends C0761f {

        /* renamed from: e */
        private IconCompat f3336e;

        /* renamed from: f */
        private IconCompat f3337f;

        /* renamed from: g */
        private boolean f3338g;

        /* renamed from: h */
        private CharSequence f3339h;

        /* renamed from: i */
        private boolean f3340i;

        /* renamed from: androidx.core.app.x$b$a */
        private static class C0753a {
            /* renamed from: a */
            static Notification.BigPictureStyle m2823a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                return bigPictureStyle.bigPicture(bitmap);
            }

            /* renamed from: b */
            static Notification.BigPictureStyle m2824b(Notification.Builder builder) {
                return new Notification.BigPictureStyle(builder);
            }

            /* renamed from: c */
            static Notification.BigPictureStyle m2825c(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                return bigPictureStyle.setBigContentTitle(charSequence);
            }

            /* renamed from: d */
            static void m2826d(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            /* renamed from: e */
            static void m2827e(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        /* renamed from: androidx.core.app.x$b$b */
        private static class C0754b {
            /* renamed from: a */
            static void m2828a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* renamed from: androidx.core.app.x$b$c */
        private static class C0755c {
            /* renamed from: a */
            static void m2829a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                C0765z.m2887a(bigPictureStyle, icon);
            }

            /* renamed from: b */
            static void m2830b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                Notification.BigPictureStyle unused = bigPictureStyle.setContentDescription(charSequence);
            }

            /* renamed from: c */
            static void m2831c(Notification.BigPictureStyle bigPictureStyle, boolean z) {
                Notification.BigPictureStyle unused = bigPictureStyle.showBigPictureWhenCollapsed(z);
            }
        }

        /* renamed from: b */
        public void mo3201b(C0748w wVar) {
            Context context;
            int i = Build.VERSION.SDK_INT;
            Notification.BigPictureStyle c = C0753a.m2825c(C0753a.m2824b(wVar.mo3115a()), this.f3391b);
            IconCompat iconCompat = this.f3336e;
            Context context2 = null;
            if (iconCompat != null) {
                if (i >= 31) {
                    if (wVar instanceof C0664b0) {
                        context = ((C0664b0) wVar).mo3118f();
                    } else {
                        context = null;
                    }
                    C0755c.m2829a(c, this.f3336e.mo3309m(context));
                } else if (iconCompat.mo3303g() == 1) {
                    c = C0753a.m2823a(c, this.f3336e.mo3300d());
                }
            }
            if (this.f3338g) {
                if (this.f3337f == null) {
                    C0753a.m2826d(c, (Bitmap) null);
                } else {
                    if (wVar instanceof C0664b0) {
                        context2 = ((C0664b0) wVar).mo3118f();
                    }
                    C0754b.m2828a(c, this.f3337f.mo3309m(context2));
                }
            }
            if (this.f3393d) {
                C0753a.m2827e(c, this.f3392c);
            }
            if (i >= 31) {
                C0755c.m2831c(c, this.f3340i);
                C0755c.m2830b(c, this.f3339h);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public String mo3202c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        /* renamed from: h */
        public C0752b mo3203h(Bitmap bitmap) {
            IconCompat iconCompat;
            if (bitmap == null) {
                iconCompat = null;
            } else {
                iconCompat = IconCompat.m3113b(bitmap);
            }
            this.f3337f = iconCompat;
            this.f3338g = true;
            return this;
        }

        /* renamed from: i */
        public C0752b mo3204i(Bitmap bitmap) {
            this.f3336e = bitmap == null ? null : IconCompat.m3113b(bitmap);
            return this;
        }

        /* renamed from: j */
        public C0752b mo3205j(CharSequence charSequence) {
            this.f3392c = C0759e.m2842d(charSequence);
            this.f3393d = true;
            return this;
        }
    }

    /* renamed from: androidx.core.app.x$c */
    public static class C0756c extends C0761f {

        /* renamed from: e */
        private CharSequence f3341e;

        /* renamed from: androidx.core.app.x$c$a */
        static class C0757a {
            /* renamed from: a */
            static Notification.BigTextStyle m2837a(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.bigText(charSequence);
            }

            /* renamed from: b */
            static Notification.BigTextStyle m2838b(Notification.Builder builder) {
                return new Notification.BigTextStyle(builder);
            }

            /* renamed from: c */
            static Notification.BigTextStyle m2839c(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setBigContentTitle(charSequence);
            }

            /* renamed from: d */
            static Notification.BigTextStyle m2840d(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setSummaryText(charSequence);
            }
        }

        /* renamed from: a */
        public void mo3206a(Bundle bundle) {
            super.mo3206a(bundle);
        }

        /* renamed from: b */
        public void mo3201b(C0748w wVar) {
            Notification.BigTextStyle a = C0757a.m2837a(C0757a.m2839c(C0757a.m2838b(wVar.mo3115a()), this.f3391b), this.f3341e);
            if (this.f3393d) {
                C0757a.m2840d(a, this.f3392c);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public String mo3202c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        /* renamed from: h */
        public C0756c mo3207h(CharSequence charSequence) {
            this.f3341e = C0759e.m2842d(charSequence);
            return this;
        }

        /* renamed from: i */
        public C0756c mo3208i(CharSequence charSequence) {
            this.f3391b = C0759e.m2842d(charSequence);
            return this;
        }
    }

    /* renamed from: androidx.core.app.x$d */
    public static final class C0758d {
        /* renamed from: a */
        public static Notification.BubbleMetadata m2841a(C0758d dVar) {
            return null;
        }
    }

    /* renamed from: androidx.core.app.x$f */
    public static abstract class C0761f {

        /* renamed from: a */
        protected C0759e f3390a;

        /* renamed from: b */
        CharSequence f3391b;

        /* renamed from: c */
        CharSequence f3392c;

        /* renamed from: d */
        boolean f3393d = false;

        /* renamed from: a */
        public void mo3206a(Bundle bundle) {
            if (this.f3393d) {
                bundle.putCharSequence("android.summaryText", this.f3392c);
            }
            CharSequence charSequence = this.f3391b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String c = mo3202c();
            if (c != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c);
            }
        }

        /* renamed from: b */
        public abstract void mo3201b(C0748w wVar);

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public abstract String mo3202c();

        /* renamed from: d */
        public RemoteViews mo3234d(C0748w wVar) {
            return null;
        }

        /* renamed from: e */
        public RemoteViews mo3235e(C0748w wVar) {
            return null;
        }

        /* renamed from: f */
        public RemoteViews mo3236f(C0748w wVar) {
            return null;
        }

        /* renamed from: g */
        public void mo3237g(C0759e eVar) {
            if (this.f3390a != eVar) {
                this.f3390a = eVar;
                if (eVar != null) {
                    eVar.mo3231x(this);
                }
            }
        }
    }

    /* renamed from: a */
    public static Bundle m2807a(Notification notification) {
        return notification.extras;
    }

    /* renamed from: androidx.core.app.x$e */
    public static class C0759e {

        /* renamed from: A */
        boolean f3342A;

        /* renamed from: B */
        boolean f3343B;

        /* renamed from: C */
        String f3344C;

        /* renamed from: D */
        Bundle f3345D;

        /* renamed from: E */
        int f3346E;

        /* renamed from: F */
        int f3347F;

        /* renamed from: G */
        Notification f3348G;

        /* renamed from: H */
        RemoteViews f3349H;

        /* renamed from: I */
        RemoteViews f3350I;

        /* renamed from: J */
        RemoteViews f3351J;

        /* renamed from: K */
        String f3352K;

        /* renamed from: L */
        int f3353L;

        /* renamed from: M */
        String f3354M;

        /* renamed from: N */
        LocusIdCompat f3355N;

        /* renamed from: O */
        long f3356O;

        /* renamed from: P */
        int f3357P;

        /* renamed from: Q */
        int f3358Q;

        /* renamed from: R */
        boolean f3359R;

        /* renamed from: S */
        Notification f3360S;

        /* renamed from: T */
        boolean f3361T;

        /* renamed from: U */
        Object f3362U;

        /* renamed from: V */
        public ArrayList f3363V;

        /* renamed from: a */
        public Context f3364a;

        /* renamed from: b */
        public ArrayList f3365b;

        /* renamed from: c */
        public ArrayList f3366c;

        /* renamed from: d */
        ArrayList f3367d;

        /* renamed from: e */
        CharSequence f3368e;

        /* renamed from: f */
        CharSequence f3369f;

        /* renamed from: g */
        PendingIntent f3370g;

        /* renamed from: h */
        PendingIntent f3371h;

        /* renamed from: i */
        RemoteViews f3372i;

        /* renamed from: j */
        Bitmap f3373j;

        /* renamed from: k */
        CharSequence f3374k;

        /* renamed from: l */
        int f3375l;

        /* renamed from: m */
        int f3376m;

        /* renamed from: n */
        boolean f3377n;

        /* renamed from: o */
        boolean f3378o;

        /* renamed from: p */
        C0761f f3379p;

        /* renamed from: q */
        CharSequence f3380q;

        /* renamed from: r */
        CharSequence f3381r;

        /* renamed from: s */
        CharSequence[] f3382s;

        /* renamed from: t */
        int f3383t;

        /* renamed from: u */
        int f3384u;

        /* renamed from: v */
        boolean f3385v;

        /* renamed from: w */
        String f3386w;

        /* renamed from: x */
        boolean f3387x;

        /* renamed from: y */
        String f3388y;

        /* renamed from: z */
        boolean f3389z;

        /* renamed from: androidx.core.app.x$e$a */
        static class C0760a {
            /* renamed from: a */
            static AudioAttributes m2870a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            /* renamed from: b */
            static AudioAttributes.Builder m2871b() {
                return new AudioAttributes.Builder();
            }

            /* renamed from: c */
            static AudioAttributes.Builder m2872c(AudioAttributes.Builder builder, int i) {
                return builder.setContentType(i);
            }

            /* renamed from: d */
            static AudioAttributes.Builder m2873d(AudioAttributes.Builder builder, int i) {
                return builder.setLegacyStreamType(i);
            }

            /* renamed from: e */
            static AudioAttributes.Builder m2874e(AudioAttributes.Builder builder, int i) {
                return builder.setUsage(i);
            }
        }

        public C0759e(Context context, String str) {
            this.f3365b = new ArrayList();
            this.f3366c = new ArrayList();
            this.f3367d = new ArrayList();
            this.f3377n = true;
            this.f3389z = false;
            this.f3346E = 0;
            this.f3347F = 0;
            this.f3353L = 0;
            this.f3357P = 0;
            this.f3358Q = 0;
            Notification notification = new Notification();
            this.f3360S = notification;
            this.f3364a = context;
            this.f3352K = str;
            notification.when = System.currentTimeMillis();
            this.f3360S.audioStreamType = -1;
            this.f3376m = 0;
            this.f3363V = new ArrayList();
            this.f3359R = true;
        }

        /* renamed from: d */
        protected static CharSequence m2842d(CharSequence charSequence) {
            if (charSequence != null && charSequence.length() > 5120) {
                return charSequence.subSequence(0, 5120);
            }
            return charSequence;
        }

        /* renamed from: e */
        private Bitmap m2843e(Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f3364a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C8434b.f23901b);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(C8434b.f23900a);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double min = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * min), (int) Math.ceil(((double) bitmap.getHeight()) * min), true);
        }

        /* renamed from: n */
        private void m2844n(int i, boolean z) {
            if (z) {
                Notification notification = this.f3360S;
                notification.flags = i | notification.flags;
                return;
            }
            Notification notification2 = this.f3360S;
            notification2.flags = (~i) & notification2.flags;
        }

        /* renamed from: A */
        public C0759e mo3209A(int i) {
            this.f3347F = i;
            return this;
        }

        /* renamed from: B */
        public C0759e mo3210B(long j) {
            this.f3360S.when = j;
            return this;
        }

        /* renamed from: a */
        public C0759e mo3211a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f3365b.add(new C0751a(i, charSequence, pendingIntent));
            return this;
        }

        /* renamed from: b */
        public Notification mo3212b() {
            return new C0664b0(this).mo3116c();
        }

        /* renamed from: c */
        public Bundle mo3213c() {
            if (this.f3345D == null) {
                this.f3345D = new Bundle();
            }
            return this.f3345D;
        }

        /* renamed from: f */
        public C0759e mo3214f(boolean z) {
            m2844n(16, z);
            return this;
        }

        /* renamed from: g */
        public C0759e mo3215g(String str) {
            this.f3352K = str;
            return this;
        }

        /* renamed from: h */
        public C0759e mo3216h(int i) {
            this.f3346E = i;
            return this;
        }

        /* renamed from: i */
        public C0759e mo3217i(PendingIntent pendingIntent) {
            this.f3370g = pendingIntent;
            return this;
        }

        /* renamed from: j */
        public C0759e mo3218j(CharSequence charSequence) {
            this.f3369f = m2842d(charSequence);
            return this;
        }

        /* renamed from: k */
        public C0759e mo3219k(CharSequence charSequence) {
            this.f3368e = m2842d(charSequence);
            return this;
        }

        /* renamed from: l */
        public C0759e mo3220l(int i) {
            Notification notification = this.f3360S;
            notification.defaults = i;
            if ((i & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        /* renamed from: m */
        public C0759e mo3221m(PendingIntent pendingIntent) {
            this.f3360S.deleteIntent = pendingIntent;
            return this;
        }

        /* renamed from: o */
        public C0759e mo3222o(Bitmap bitmap) {
            this.f3373j = m2843e(bitmap);
            return this;
        }

        /* renamed from: p */
        public C0759e mo3223p(int i, int i2, int i3) {
            int i4;
            Notification notification = this.f3360S;
            notification.ledARGB = i;
            notification.ledOnMS = i2;
            notification.ledOffMS = i3;
            if (i2 == 0 || i3 == 0) {
                i4 = 0;
            } else {
                i4 = 1;
            }
            notification.flags = i4 | (notification.flags & -2);
            return this;
        }

        /* renamed from: q */
        public C0759e mo3224q(boolean z) {
            this.f3389z = z;
            return this;
        }

        /* renamed from: r */
        public C0759e mo3225r(int i) {
            this.f3375l = i;
            return this;
        }

        /* renamed from: s */
        public C0759e mo3226s(boolean z) {
            m2844n(2, z);
            return this;
        }

        /* renamed from: t */
        public C0759e mo3227t(int i) {
            this.f3376m = i;
            return this;
        }

        /* renamed from: u */
        public C0759e mo3228u(boolean z) {
            this.f3377n = z;
            return this;
        }

        /* renamed from: v */
        public C0759e mo3229v(int i) {
            this.f3360S.icon = i;
            return this;
        }

        /* renamed from: w */
        public C0759e mo3230w(Uri uri) {
            Notification notification = this.f3360S;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder e = C0760a.m2874e(C0760a.m2872c(C0760a.m2871b(), 4), 5);
            this.f3360S.audioAttributes = C0760a.m2870a(e);
            return this;
        }

        /* renamed from: x */
        public C0759e mo3231x(C0761f fVar) {
            if (this.f3379p != fVar) {
                this.f3379p = fVar;
                if (fVar != null) {
                    fVar.mo3237g(this);
                }
            }
            return this;
        }

        /* renamed from: y */
        public C0759e mo3232y(CharSequence charSequence) {
            this.f3360S.tickerText = m2842d(charSequence);
            return this;
        }

        /* renamed from: z */
        public C0759e mo3233z(long[] jArr) {
            this.f3360S.vibrate = jArr;
            return this;
        }

        public C0759e(Context context) {
            this(context, (String) null);
        }
    }
}
