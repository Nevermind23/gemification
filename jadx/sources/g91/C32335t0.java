package g91;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.core.content.C0767a;
import i10.C25100c;
import iu0.C36546y;
import p341ge.bog.mobilebank.model.usrinfo.ClientCategory;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p366bk.C10316e;
import p366bk.C10326o;
import p366bk.C10328q;
import p366bk.C10329r;

/* renamed from: g91.t0 */
public abstract class C32335t0 {

    /* renamed from: g91.t0$a */
    static /* synthetic */ class C32336a {

        /* renamed from: a */
        static final /* synthetic */ int[] f79769a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                ge.bog.mobilebank.model.usrinfo.ClientCategory[] r0 = p341ge.bog.mobilebank.model.usrinfo.ClientCategory.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f79769a = r0
                ge.bog.mobilebank.model.usrinfo.ClientCategory r1 = p341ge.bog.mobilebank.model.usrinfo.ClientCategory.SOLO     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f79769a     // Catch:{ NoSuchFieldError -> 0x001d }
                ge.bog.mobilebank.model.usrinfo.ClientCategory r1 = p341ge.bog.mobilebank.model.usrinfo.ClientCategory.WEALTH_MANAGEMENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: g91.C32335t0.C32336a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static int m95356a(ClientCategory clientCategory) {
        int i = C32336a.f79769a[clientCategory.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    /* renamed from: b */
    public static int m95357b() {
        return m95358c(C36546y.m108285N());
    }

    /* renamed from: c */
    public static int m95358c(Context context) {
        return m95359d(context, false);
    }

    /* renamed from: d */
    public static int m95359d(Context context, boolean z) {
        return m95360e(context, C10316e.f28605g, z);
    }

    /* renamed from: e */
    public static int m95360e(Context context, int i, boolean z) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        int i2 = typedValue.resourceId;
        if (z) {
            return i2;
        }
        return C0767a.m2893c(context, i2);
    }

    /* renamed from: f */
    public static int m95361f() {
        try {
            return PreferencesApiManager.getInstance().getThemeType();
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: g */
    public static Drawable m95362g(Context context, int i) {
        return C0767a.m2895e(context, m95364i(context, i));
    }

    /* renamed from: h */
    public static int m95363h(int i) {
        return m95364i(C36546y.m108285N(), i);
    }

    /* renamed from: i */
    public static int m95364i(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: j */
    public static int m95365j() {
        return m95366k(C36546y.m108285N());
    }

    /* renamed from: k */
    public static int m95366k(Context context) {
        return m95367l(context, false);
    }

    /* renamed from: l */
    public static int m95367l(Context context, boolean z) {
        return m95360e(context, C10316e.f28606i, z);
    }

    /* renamed from: m */
    public static int m95368m() {
        try {
            int themeType = PreferencesApiManager.getInstance().getThemeType();
            if (themeType == 1) {
                return C10329r.SoloTheme;
            }
            if (themeType != 2) {
                return C10329r.AppTheme;
            }
            return C10329r.WealthTheme;
        } catch (Exception unused) {
            return C10329r.AppTheme;
        }
    }

    /* renamed from: n */
    public static void m95369n(Context context) {
        int themeType = PreferencesApiManager.getInstance().getThemeType();
        if (themeType == 1) {
            int i = C10329r.SoloTheme;
            context.setTheme(i);
            C36546y.m108285N().setTheme(i);
            Activity b = C25100c.m80063b(context);
            if (b != null) {
                b.setTaskDescription(new ActivityManager.TaskDescription(context.getString(C10328q.application_name), BitmapFactory.decodeResource(context.getResources(), C10326o.ic_launcher), m95365j()));
            }
        } else if (themeType != 2) {
            int i2 = C10329r.AppTheme;
            context.setTheme(i2);
            C36546y.m108285N().setTheme(i2);
        } else {
            int i3 = C10329r.WealthTheme;
            context.setTheme(i3);
            C36546y.m108285N().setTheme(i3);
        }
    }
}
