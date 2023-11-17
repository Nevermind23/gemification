package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.C0155k;
import androidx.activity.C0156l;
import androidx.appcompat.view.C0264b;
import androidx.appcompat.view.C0267d;
import androidx.appcompat.view.C0270f;
import androidx.appcompat.view.C0272g;
import androidx.appcompat.view.C0277i;
import androidx.appcompat.view.menu.C0294e;
import androidx.appcompat.view.menu.C0297g;
import androidx.appcompat.view.menu.C0313m;
import androidx.appcompat.view.menu.C0315n;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0413c2;
import androidx.appcompat.widget.C0417d2;
import androidx.appcompat.widget.C0444i;
import androidx.appcompat.widget.C0465m0;
import androidx.appcompat.widget.C0483r1;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.collection.SimpleArrayMap;
import androidx.core.app.C0745v;
import androidx.core.content.C0767a;
import androidx.core.content.res.C0808h;
import androidx.core.p016os.C0918j;
import androidx.core.util.C1002c;
import androidx.core.view.C1060a1;
import androidx.core.view.C1182j3;
import androidx.core.view.C1188k3;
import androidx.core.view.C1272y;
import androidx.core.view.C1278z;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.C1593j;
import androidx.lifecycle.C1619q;
import com.github.mikephil.charting.utils.Utils;
import com.salesforce.marketingcloud.C11398b;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import p030c.C2210a;
import p030c.C2212c;
import p030c.C2215f;
import p030c.C2216g;
import p030c.C2218i;
import p030c.C2219j;
import p045d.C5769a;

class AppCompatDelegateImpl extends C0238h implements C0297g.C0298a, LayoutInflater.Factory2 {

    /* renamed from: m0 */
    private static final SimpleArrayMap f1179m0 = new SimpleArrayMap();

    /* renamed from: n0 */
    private static final boolean f1180n0 = false;

    /* renamed from: o0 */
    private static final int[] f1181o0 = {16842836};

    /* renamed from: p0 */
    private static final boolean f1182p0 = (!"robolectric".equals(Build.FINGERPRINT));

    /* renamed from: q0 */
    private static final boolean f1183q0 = true;

    /* renamed from: A */
    Runnable f1184A;

    /* renamed from: B */
    ViewPropertyAnimatorCompat f1185B;

    /* renamed from: C */
    private boolean f1186C;

    /* renamed from: D */
    private boolean f1187D;

    /* renamed from: E */
    ViewGroup f1188E;

    /* renamed from: F */
    private TextView f1189F;

    /* renamed from: G */
    private View f1190G;

    /* renamed from: H */
    private boolean f1191H;

    /* renamed from: I */
    private boolean f1192I;

    /* renamed from: J */
    boolean f1193J;

    /* renamed from: K */
    boolean f1194K;

    /* renamed from: L */
    boolean f1195L;

    /* renamed from: M */
    boolean f1196M;

    /* renamed from: N */
    boolean f1197N;

    /* renamed from: O */
    private boolean f1198O;

    /* renamed from: P */
    private PanelFeatureState[] f1199P;

    /* renamed from: Q */
    private PanelFeatureState f1200Q;

    /* renamed from: R */
    private boolean f1201R;

    /* renamed from: S */
    private boolean f1202S;

    /* renamed from: T */
    private boolean f1203T;

    /* renamed from: U */
    boolean f1204U;

    /* renamed from: V */
    private Configuration f1205V;

    /* renamed from: W */
    private int f1206W;

    /* renamed from: X */
    private int f1207X;

    /* renamed from: Y */
    private int f1208Y;

    /* renamed from: Z */
    private boolean f1209Z;

    /* renamed from: a0 */
    private C0203q f1210a0;

    /* renamed from: b0 */
    private C0203q f1211b0;

    /* renamed from: c0 */
    boolean f1212c0;

    /* renamed from: d0 */
    int f1213d0;

    /* renamed from: e0 */
    private final Runnable f1214e0;

    /* renamed from: f0 */
    private boolean f1215f0;

    /* renamed from: g0 */
    private Rect f1216g0;

    /* renamed from: h0 */
    private Rect f1217h0;

    /* renamed from: i0 */
    private C0255w f1218i0;

    /* renamed from: j0 */
    private C0211a0 f1219j0;

    /* renamed from: k0 */
    private OnBackInvokedDispatcher f1220k0;

    /* renamed from: l0 */
    private OnBackInvokedCallback f1221l0;

    /* renamed from: m */
    final Object f1222m;

    /* renamed from: n */
    final Context f1223n;

    /* renamed from: o */
    Window f1224o;

    /* renamed from: p */
    private C0201o f1225p;

    /* renamed from: q */
    final C0227e f1226q;

    /* renamed from: r */
    C0209a f1227r;

    /* renamed from: s */
    MenuInflater f1228s;

    /* renamed from: t */
    private CharSequence f1229t;

    /* renamed from: u */
    private C0465m0 f1230u;

    /* renamed from: v */
    private C0193h f1231v;

    /* renamed from: w */
    private C0208u f1232w;

    /* renamed from: x */
    C0264b f1233x;

    /* renamed from: y */
    ActionBarContextView f1234y;

    /* renamed from: z */
    PopupWindow f1235z;

    protected static final class PanelFeatureState {

        /* renamed from: a */
        int f1236a;

        /* renamed from: b */
        int f1237b;

        /* renamed from: c */
        int f1238c;

        /* renamed from: d */
        int f1239d;

        /* renamed from: e */
        int f1240e;

        /* renamed from: f */
        int f1241f;

        /* renamed from: g */
        ViewGroup f1242g;

        /* renamed from: h */
        View f1243h;

        /* renamed from: i */
        View f1244i;

        /* renamed from: j */
        C0297g f1245j;

        /* renamed from: k */
        C0294e f1246k;

        /* renamed from: l */
        Context f1247l;

        /* renamed from: m */
        boolean f1248m;

        /* renamed from: n */
        boolean f1249n;

        /* renamed from: o */
        boolean f1250o;

        /* renamed from: p */
        public boolean f1251p;

        /* renamed from: q */
        boolean f1252q = false;

        /* renamed from: r */
        boolean f1253r;

        /* renamed from: s */
        Bundle f1254s;

        @SuppressLint({"BanParcelableUsage"})
        private static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new C0184a();

            /* renamed from: d */
            int f1255d;

            /* renamed from: e */
            boolean f1256e;

            /* renamed from: f */
            Bundle f1257f;

            /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState$a */
            class C0184a implements Parcelable.ClassLoaderCreator {
                C0184a() {
                }

                /* renamed from: a */
                public SavedState createFromParcel(Parcel parcel) {
                    return SavedState.m589a(parcel, (ClassLoader) null);
                }

                /* renamed from: b */
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.m589a(parcel, classLoader);
                }

                /* renamed from: c */
                public SavedState[] newArray(int i) {
                    return new SavedState[i];
                }
            }

            SavedState() {
            }

            /* renamed from: a */
            static SavedState m589a(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.f1255d = parcel.readInt();
                boolean z = true;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                savedState.f1256e = z;
                if (z) {
                    savedState.f1257f = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            public int describeContents() {
                return 0;
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f1255d);
                parcel.writeInt(this.f1256e ? 1 : 0);
                if (this.f1256e) {
                    parcel.writeBundle(this.f1257f);
                }
            }
        }

        PanelFeatureState(int i) {
            this.f1236a = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0315n mo496a(C0313m.C0314a aVar) {
            if (this.f1245j == null) {
                return null;
            }
            if (this.f1246k == null) {
                C0294e eVar = new C0294e(this.f1247l, C2216g.f6589j);
                this.f1246k = eVar;
                eVar.mo905f(aVar);
                this.f1245j.mo1002b(this.f1246k);
            }
            return this.f1246k.mo948d(this.f1242g);
        }

        /* renamed from: b */
        public boolean mo497b() {
            if (this.f1243h == null) {
                return false;
            }
            if (this.f1244i != null) {
                return true;
            }
            if (this.f1246k.mo947b().getCount() > 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo498c(C0297g gVar) {
            C0294e eVar;
            C0297g gVar2 = this.f1245j;
            if (gVar != gVar2) {
                if (gVar2 != null) {
                    gVar2.mo982Q(this.f1246k);
                }
                this.f1245j = gVar;
                if (gVar != null && (eVar = this.f1246k) != null) {
                    gVar.mo1002b(eVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo499d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C2210a.f6445a, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                newTheme.applyStyle(i, true);
            }
            newTheme.resolveAttribute(C2210a.f6434E, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                newTheme.applyStyle(i2, true);
            } else {
                newTheme.applyStyle(C2218i.f6617d, true);
            }
            C0267d dVar = new C0267d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f1247l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(C2219j.f6871y0);
            this.f1237b = obtainStyledAttributes.getResourceId(C2219j.f6626B0, 0);
            this.f1241f = obtainStyledAttributes.getResourceId(C2219j.f6621A0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$a */
    class C0185a implements Runnable {
        C0185a() {
        }

        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl.f1213d0 & 1) != 0) {
                appCompatDelegateImpl.mo478l0(0);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl2.f1213d0 & C11398b.f33143v) != 0) {
                appCompatDelegateImpl2.mo478l0(108);
            }
            AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl3.f1212c0 = false;
            appCompatDelegateImpl3.f1213d0 = 0;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$b */
    class C0186b implements C1060a1 {
        C0186b() {
        }

        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            int l = windowInsetsCompat.mo3496l();
            int h1 = AppCompatDelegateImpl.this.mo472h1(windowInsetsCompat, (Rect) null);
            if (l != h1) {
                windowInsetsCompat = windowInsetsCompat.mo3500q(windowInsetsCompat.mo3494j(), h1, windowInsetsCompat.mo3495k(), windowInsetsCompat.mo3493i());
            }
            return ViewCompat.m3591d0(view, windowInsetsCompat);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$c */
    class C0187c implements ContentFrameLayout.C0359a {
        C0187c() {
        }

        /* renamed from: a */
        public void mo510a() {
        }

        public void onDetachedFromWindow() {
            AppCompatDelegateImpl.this.mo475j0();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$d */
    class C0188d implements Runnable {

        /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$d$a */
        class C0189a extends C1188k3 {
            C0189a() {
            }

            /* renamed from: b */
            public void mo513b(View view) {
                AppCompatDelegateImpl.this.f1234y.setAlpha(1.0f);
                AppCompatDelegateImpl.this.f1185B.mo3474h((C1182j3) null);
                AppCompatDelegateImpl.this.f1185B = null;
            }

            /* renamed from: c */
            public void mo514c(View view) {
                AppCompatDelegateImpl.this.f1234y.setVisibility(0);
            }
        }

        C0188d() {
        }

        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            appCompatDelegateImpl.f1235z.showAtLocation(appCompatDelegateImpl.f1234y, 55, 0, 0);
            AppCompatDelegateImpl.this.mo479m0();
            if (AppCompatDelegateImpl.this.mo459X0()) {
                AppCompatDelegateImpl.this.f1234y.setAlpha(Utils.FLOAT_EPSILON);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.f1185B = ViewCompat.m3592e(appCompatDelegateImpl2.f1234y).mo3469b(1.0f);
                AppCompatDelegateImpl.this.f1185B.mo3474h(new C0189a());
                return;
            }
            AppCompatDelegateImpl.this.f1234y.setAlpha(1.0f);
            AppCompatDelegateImpl.this.f1234y.setVisibility(0);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$e */
    class C0190e extends C1188k3 {
        C0190e() {
        }

        /* renamed from: b */
        public void mo513b(View view) {
            AppCompatDelegateImpl.this.f1234y.setAlpha(1.0f);
            AppCompatDelegateImpl.this.f1185B.mo3474h((C1182j3) null);
            AppCompatDelegateImpl.this.f1185B = null;
        }

        /* renamed from: c */
        public void mo514c(View view) {
            AppCompatDelegateImpl.this.f1234y.setVisibility(0);
            if (AppCompatDelegateImpl.this.f1234y.getParent() instanceof View) {
                ViewCompat.m3613o0((View) AppCompatDelegateImpl.this.f1234y.getParent());
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$f */
    private class C0191f implements C0212b {
        C0191f() {
        }

        /* renamed from: a */
        public Context mo515a() {
            return AppCompatDelegateImpl.this.mo486r0();
        }

        /* renamed from: b */
        public void mo516b(Drawable drawable, int i) {
            C0209a u = AppCompatDelegateImpl.this.mo488u();
            if (u != null) {
                u.mo570x(drawable);
                u.mo567u(i);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$g */
    interface C0192g {
        /* renamed from: a */
        boolean mo517a(int i);

        View onCreatePanelView(int i);
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$h */
    private final class C0193h implements C0313m.C0314a {
        C0193h() {
        }

        /* renamed from: c */
        public void mo519c(C0297g gVar, boolean z) {
            AppCompatDelegateImpl.this.mo466c0(gVar);
        }

        /* renamed from: d */
        public boolean mo520d(C0297g gVar) {
            Window.Callback y0 = AppCompatDelegateImpl.this.mo494y0();
            if (y0 == null) {
                return true;
            }
            y0.onMenuOpened(108, gVar);
            return true;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$i */
    class C0194i implements C0264b.C0265a {

        /* renamed from: a */
        private C0264b.C0265a f1266a;

        /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$i$a */
        class C0195a extends C1188k3 {
            C0195a() {
            }

            /* renamed from: b */
            public void mo513b(View view) {
                AppCompatDelegateImpl.this.f1234y.setVisibility(8);
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                PopupWindow popupWindow = appCompatDelegateImpl.f1235z;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (appCompatDelegateImpl.f1234y.getParent() instanceof View) {
                    ViewCompat.m3613o0((View) AppCompatDelegateImpl.this.f1234y.getParent());
                }
                AppCompatDelegateImpl.this.f1234y.mo1257k();
                AppCompatDelegateImpl.this.f1185B.mo3474h((C1182j3) null);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.f1185B = null;
                ViewCompat.m3613o0(appCompatDelegateImpl2.f1188E);
            }
        }

        public C0194i(C0264b.C0265a aVar) {
            this.f1266a = aVar;
        }

        /* renamed from: a */
        public void mo521a(C0264b bVar) {
            this.f1266a.mo521a(bVar);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.f1235z != null) {
                appCompatDelegateImpl.f1224o.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.f1184A);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl2.f1234y != null) {
                appCompatDelegateImpl2.mo479m0();
                AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl3.f1185B = ViewCompat.m3592e(appCompatDelegateImpl3.f1234y).mo3469b(Utils.FLOAT_EPSILON);
                AppCompatDelegateImpl.this.f1185B.mo3474h(new C0195a());
            }
            AppCompatDelegateImpl appCompatDelegateImpl4 = AppCompatDelegateImpl.this;
            C0227e eVar = appCompatDelegateImpl4.f1226q;
            if (eVar != null) {
                eVar.onSupportActionModeFinished(appCompatDelegateImpl4.f1233x);
            }
            AppCompatDelegateImpl appCompatDelegateImpl5 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl5.f1233x = null;
            ViewCompat.m3613o0(appCompatDelegateImpl5.f1188E);
            AppCompatDelegateImpl.this.mo471f1();
        }

        /* renamed from: b */
        public boolean mo522b(C0264b bVar, Menu menu) {
            return this.f1266a.mo522b(bVar, menu);
        }

        /* renamed from: c */
        public boolean mo523c(C0264b bVar, MenuItem menuItem) {
            return this.f1266a.mo523c(bVar, menuItem);
        }

        /* renamed from: d */
        public boolean mo524d(C0264b bVar, Menu menu) {
            ViewCompat.m3613o0(AppCompatDelegateImpl.this.f1188E);
            return this.f1266a.mo524d(bVar, menu);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$j */
    static class C0196j {
        /* renamed from: a */
        static Context m608a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        /* renamed from: b */
        static void m609b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.densityDpi;
            int i2 = configuration2.densityDpi;
            if (i != i2) {
                configuration3.densityDpi = i2;
            }
        }

        /* renamed from: c */
        static void m610c(Configuration configuration, Locale locale) {
            configuration.setLayoutDirection(locale);
        }

        /* renamed from: d */
        static void m611d(Configuration configuration, Locale locale) {
            configuration.setLocale(locale);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$k */
    static class C0197k {
        /* renamed from: a */
        static boolean m612a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        /* renamed from: b */
        static String m613b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$l */
    static class C0198l {
        /* renamed from: a */
        static void m614a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList a = configuration.getLocales();
            LocaleList a2 = configuration2.getLocales();
            if (!a.equals(a2)) {
                configuration3.setLocales(a2);
                configuration3.locale = configuration2.locale;
            }
        }

        /* renamed from: b */
        static C0918j m615b(Configuration configuration) {
            return C0918j.m3351c(configuration.getLocales().toLanguageTags());
        }

        /* renamed from: c */
        public static void m616c(C0918j jVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(jVar.mo3368h()));
        }

        /* renamed from: d */
        static void m617d(Configuration configuration, C0918j jVar) {
            configuration.setLocales(LocaleList.forLanguageTags(jVar.mo3368h()));
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$m */
    static class C0199m {
        /* renamed from: a */
        static void m618a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                configuration3.colorMode = configuration3.colorMode | (configuration2.colorMode & 3);
            }
            if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                configuration3.colorMode = configuration3.colorMode | (configuration2.colorMode & 12);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$n */
    static class C0200n {
        /* renamed from: a */
        static OnBackInvokedDispatcher m619a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        /* renamed from: b */
        static OnBackInvokedCallback m620b(Object obj, AppCompatDelegateImpl appCompatDelegateImpl) {
            Objects.requireNonNull(appCompatDelegateImpl);
            C0251s sVar = new C0251s(appCompatDelegateImpl);
            C0155k.m415a(obj).registerOnBackInvokedCallback(1000000, sVar);
            return sVar;
        }

        /* renamed from: c */
        static void m621c(Object obj, Object obj2) {
            C0155k.m415a(obj).unregisterOnBackInvokedCallback(C0156l.m416a(obj2));
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$o */
    class C0201o extends C0277i {

        /* renamed from: e */
        private C0192g f1269e;

        /* renamed from: f */
        private boolean f1270f;

        /* renamed from: g */
        private boolean f1271g;

        /* renamed from: h */
        private boolean f1272h;

        C0201o(Window.Callback callback) {
            super(callback);
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: b */
        public boolean mo525b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f1271g = true;
                boolean dispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                this.f1271g = false;
                return dispatchKeyEvent;
            } catch (Throwable th) {
                this.f1271g = false;
                throw th;
            }
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: c */
        public void mo526c(Window.Callback callback) {
            try {
                this.f1270f = true;
                callback.onContentChanged();
                this.f1270f = false;
            } catch (Throwable th) {
                this.f1270f = false;
                throw th;
            }
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: d */
        public void mo527d(Window.Callback callback, int i, Menu menu) {
            try {
                this.f1272h = true;
                callback.onPanelClosed(i, menu);
                this.f1272h = false;
            } catch (Throwable th) {
                this.f1272h = false;
                throw th;
            }
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (this.f1271g) {
                return mo788a().dispatchKeyEvent(keyEvent);
            }
            if (AppCompatDelegateImpl.this.mo476k0(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
                return true;
            }
            return false;
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            if (super.dispatchKeyShortcutEvent(keyEvent) || AppCompatDelegateImpl.this.mo443J0(keyEvent.getKeyCode(), keyEvent)) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo530e(C0192g gVar) {
            this.f1269e = gVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public final ActionMode mo531f(ActionMode.Callback callback) {
            C0270f.C0271a aVar = new C0270f.C0271a(AppCompatDelegateImpl.this.f1223n, callback);
            C0264b T = AppCompatDelegateImpl.this.mo456T(aVar);
            if (T != null) {
                return aVar.mo769e(T);
            }
            return null;
        }

        public void onContentChanged() {
            if (this.f1270f) {
                mo788a().onContentChanged();
            }
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C0297g)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        public View onCreatePanelView(int i) {
            View onCreatePanelView;
            C0192g gVar = this.f1269e;
            if (gVar == null || (onCreatePanelView = gVar.onCreatePanelView(i)) == null) {
                return super.onCreatePanelView(i);
            }
            return onCreatePanelView;
        }

        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            AppCompatDelegateImpl.this.mo447M0(i);
            return true;
        }

        public void onPanelClosed(int i, Menu menu) {
            if (this.f1272h) {
                mo788a().onPanelClosed(i, menu);
                return;
            }
            super.onPanelClosed(i, menu);
            AppCompatDelegateImpl.this.mo449N0(i);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            C0297g gVar;
            if (menu instanceof C0297g) {
                gVar = (C0297g) menu;
            } else {
                gVar = null;
            }
            if (i == 0 && gVar == null) {
                return false;
            }
            boolean z = true;
            if (gVar != null) {
                gVar.mo1012e0(true);
            }
            C0192g gVar2 = this.f1269e;
            if (gVar2 == null || !gVar2.mo517a(i)) {
                z = false;
            }
            if (!z) {
                z = super.onPreparePanel(i, view, menu);
            }
            if (gVar != null) {
                gVar.mo1012e0(false);
            }
            return z;
        }

        public void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
            C0297g gVar;
            PanelFeatureState w0 = AppCompatDelegateImpl.this.mo492w0(0, true);
            if (w0 == null || (gVar = w0.f1245j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, gVar, i);
            }
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (!AppCompatDelegateImpl.this.mo436E0() || i != 0) {
                return super.onWindowStartingActionMode(callback, i);
            }
            return mo531f(callback);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$p */
    private class C0202p extends C0203q {

        /* renamed from: c */
        private final PowerManager f1274c;

        C0202p(Context context) {
            super();
            this.f1274c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public IntentFilter mo541b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        /* renamed from: c */
        public int mo542c() {
            return C0197k.m612a(this.f1274c) ? 2 : 1;
        }

        /* renamed from: d */
        public void mo543d() {
            AppCompatDelegateImpl.this.mo469f();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$q */
    abstract class C0203q {

        /* renamed from: a */
        private BroadcastReceiver f1276a;

        /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$q$a */
        class C0204a extends BroadcastReceiver {
            C0204a() {
            }

            public void onReceive(Context context, Intent intent) {
                C0203q.this.mo543d();
            }
        }

        C0203q() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo544a() {
            BroadcastReceiver broadcastReceiver = this.f1276a;
            if (broadcastReceiver != null) {
                try {
                    AppCompatDelegateImpl.this.f1223n.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f1276a = null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract IntentFilter mo541b();

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract int mo542c();

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract void mo543d();

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo545e() {
            mo544a();
            IntentFilter b = mo541b();
            if (b != null && b.countActions() != 0) {
                if (this.f1276a == null) {
                    this.f1276a = new C0204a();
                }
                AppCompatDelegateImpl.this.f1223n.registerReceiver(this.f1276a, b);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$r */
    private class C0205r extends C0203q {

        /* renamed from: c */
        private final C0230f0 f1279c;

        C0205r(C0230f0 f0Var) {
            super();
            this.f1279c = f0Var;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public IntentFilter mo541b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        /* renamed from: c */
        public int mo542c() {
            return this.f1279c.mo667d() ? 2 : 1;
        }

        /* renamed from: d */
        public void mo543d() {
            AppCompatDelegateImpl.this.mo469f();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$s */
    private static class C0206s {
        /* renamed from: a */
        static void m638a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$t */
    private class C0207t extends ContentFrameLayout {
        public C0207t(Context context) {
            super(context);
        }

        /* renamed from: b */
        private boolean m639b(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (AppCompatDelegateImpl.this.mo476k0(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
                return true;
            }
            return false;
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !m639b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            AppCompatDelegateImpl.this.mo468e0(0);
            return true;
        }

        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C5769a.m23210b(getContext(), i));
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$u */
    private final class C0208u implements C0313m.C0314a {
        C0208u() {
        }

        /* renamed from: c */
        public void mo519c(C0297g gVar, boolean z) {
            boolean z2;
            C0297g F = gVar.mo972F();
            if (F != gVar) {
                z2 = true;
            } else {
                z2 = false;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (z2) {
                gVar = F;
            }
            PanelFeatureState p0 = appCompatDelegateImpl.mo484p0(gVar);
            if (p0 == null) {
                return;
            }
            if (z2) {
                AppCompatDelegateImpl.this.mo465b0(p0.f1236a, p0, F);
                AppCompatDelegateImpl.this.mo470f0(p0, true);
                return;
            }
            AppCompatDelegateImpl.this.mo470f0(p0, z);
        }

        /* renamed from: d */
        public boolean mo520d(C0297g gVar) {
            Window.Callback y0;
            if (gVar != gVar.mo972F()) {
                return true;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (!appCompatDelegateImpl.f1193J || (y0 = appCompatDelegateImpl.mo494y0()) == null || AppCompatDelegateImpl.this.f1204U) {
                return true;
            }
            y0.onMenuOpened(108, gVar);
            return true;
        }
    }

    AppCompatDelegateImpl(Activity activity, C0227e eVar) {
        this(activity, (Window) null, eVar, activity);
    }

    /* renamed from: A0 */
    private boolean m489A0(PanelFeatureState panelFeatureState) {
        View view = panelFeatureState.f1244i;
        if (view != null) {
            panelFeatureState.f1243h = view;
            return true;
        } else if (panelFeatureState.f1245j == null) {
            return false;
        } else {
            if (this.f1232w == null) {
                this.f1232w = new C0208u();
            }
            View view2 = (View) panelFeatureState.mo496a(this.f1232w);
            panelFeatureState.f1243h = view2;
            if (view2 != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: B0 */
    private boolean m490B0(PanelFeatureState panelFeatureState) {
        panelFeatureState.mo499d(mo486r0());
        panelFeatureState.f1242g = new C0207t(panelFeatureState.f1247l);
        panelFeatureState.f1238c = 81;
        return true;
    }

    /* renamed from: C0 */
    private boolean m491C0(PanelFeatureState panelFeatureState) {
        Resources.Theme theme;
        Context context = this.f1223n;
        int i = panelFeatureState.f1236a;
        if ((i == 0 || i == 108) && this.f1230u != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme2 = context.getTheme();
            theme2.resolveAttribute(C2210a.f6448d, typedValue, true);
            if (typedValue.resourceId != 0) {
                theme = context.getResources().newTheme();
                theme.setTo(theme2);
                theme.applyStyle(typedValue.resourceId, true);
                theme.resolveAttribute(C2210a.f6449e, typedValue, true);
            } else {
                theme2.resolveAttribute(C2210a.f6449e, typedValue, true);
                theme = null;
            }
            if (typedValue.resourceId != 0) {
                if (theme == null) {
                    theme = context.getResources().newTheme();
                    theme.setTo(theme2);
                }
                theme.applyStyle(typedValue.resourceId, true);
            }
            if (theme != null) {
                C0267d dVar = new C0267d(context, 0);
                dVar.getTheme().setTo(theme);
                context = dVar;
            }
        }
        C0297g gVar = new C0297g(context);
        gVar.mo987V(this);
        panelFeatureState.mo498c(gVar);
        return true;
    }

    /* renamed from: D0 */
    private void m492D0(int i) {
        this.f1213d0 = (1 << i) | this.f1213d0;
        if (!this.f1212c0) {
            ViewCompat.m3603j0(this.f1224o.getDecorView(), this.f1214e0);
            this.f1212c0 = true;
        }
    }

    /* renamed from: I0 */
    private boolean m493I0(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        PanelFeatureState w0 = mo492w0(i, true);
        if (!w0.f1250o) {
            return m497S0(w0, keyEvent);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006a  */
    /* renamed from: L0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m494L0(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            androidx.appcompat.view.b r0 = r4.f1233x
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 1
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r2 = r4.mo492w0(r5, r0)
            if (r5 != 0) goto L_0x0043
            androidx.appcompat.widget.m0 r5 = r4.f1230u
            if (r5 == 0) goto L_0x0043
            boolean r5 = r5.mo1272a()
            if (r5 == 0) goto L_0x0043
            android.content.Context r5 = r4.f1223n
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            boolean r5 = r5.hasPermanentMenuKey()
            if (r5 != 0) goto L_0x0043
            androidx.appcompat.widget.m0 r5 = r4.f1230u
            boolean r5 = r5.mo1278f()
            if (r5 != 0) goto L_0x003c
            boolean r5 = r4.f1204U
            if (r5 != 0) goto L_0x0062
            boolean r5 = r4.m497S0(r2, r6)
            if (r5 == 0) goto L_0x0062
            androidx.appcompat.widget.m0 r5 = r4.f1230u
            boolean r0 = r5.mo1275d()
            goto L_0x0068
        L_0x003c:
            androidx.appcompat.widget.m0 r5 = r4.f1230u
            boolean r0 = r5.mo1273c()
            goto L_0x0068
        L_0x0043:
            boolean r5 = r2.f1250o
            if (r5 != 0) goto L_0x0064
            boolean r3 = r2.f1249n
            if (r3 == 0) goto L_0x004c
            goto L_0x0064
        L_0x004c:
            boolean r5 = r2.f1248m
            if (r5 == 0) goto L_0x0062
            boolean r5 = r2.f1253r
            if (r5 == 0) goto L_0x005b
            r2.f1248m = r1
            boolean r5 = r4.m497S0(r2, r6)
            goto L_0x005c
        L_0x005b:
            r5 = r0
        L_0x005c:
            if (r5 == 0) goto L_0x0062
            r4.m495P0(r2, r6)
            goto L_0x0068
        L_0x0062:
            r0 = r1
            goto L_0x0068
        L_0x0064:
            r4.mo470f0(r2, r0)
            r0 = r5
        L_0x0068:
            if (r0 == 0) goto L_0x0085
            android.content.Context r5 = r4.f1223n
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r6 = "audio"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L_0x007e
            r5.playSoundEffect(r1)
            goto L_0x0085
        L_0x007e:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r6 = "Couldn't get audio manager"
            android.util.Log.w(r5, r6)
        L_0x0085:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.m494L0(int, android.view.KeyEvent):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* renamed from: P0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m495P0(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState r13, android.view.KeyEvent r14) {
        /*
            r12 = this;
            boolean r0 = r13.f1250o
            if (r0 != 0) goto L_0x00f8
            boolean r0 = r12.f1204U
            if (r0 == 0) goto L_0x000a
            goto L_0x00f8
        L_0x000a:
            int r0 = r13.f1236a
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0027
            android.content.Context r0 = r12.f1223n
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.screenLayout
            r0 = r0 & 15
            r3 = 4
            if (r0 != r3) goto L_0x0023
            r0 = r2
            goto L_0x0024
        L_0x0023:
            r0 = r1
        L_0x0024:
            if (r0 == 0) goto L_0x0027
            return
        L_0x0027:
            android.view.Window$Callback r0 = r12.mo494y0()
            if (r0 == 0) goto L_0x003b
            int r3 = r13.f1236a
            androidx.appcompat.view.menu.g r4 = r13.f1245j
            boolean r0 = r0.onMenuOpened(r3, r4)
            if (r0 != 0) goto L_0x003b
            r12.mo470f0(r13, r2)
            return
        L_0x003b:
            android.content.Context r0 = r12.f1223n
            java.lang.String r3 = "window"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            if (r0 != 0) goto L_0x0048
            return
        L_0x0048:
            boolean r14 = r12.m497S0(r13, r14)
            if (r14 != 0) goto L_0x004f
            return
        L_0x004f:
            android.view.ViewGroup r14 = r13.f1242g
            r3 = -2
            if (r14 == 0) goto L_0x006a
            boolean r4 = r13.f1252q
            if (r4 == 0) goto L_0x0059
            goto L_0x006a
        L_0x0059:
            android.view.View r14 = r13.f1244i
            if (r14 == 0) goto L_0x00cc
            android.view.ViewGroup$LayoutParams r14 = r14.getLayoutParams()
            if (r14 == 0) goto L_0x00cc
            int r14 = r14.width
            r4 = -1
            if (r14 != r4) goto L_0x00cc
            r5 = r4
            goto L_0x00cd
        L_0x006a:
            if (r14 != 0) goto L_0x0077
            boolean r14 = r12.m490B0(r13)
            if (r14 == 0) goto L_0x0076
            android.view.ViewGroup r14 = r13.f1242g
            if (r14 != 0) goto L_0x0086
        L_0x0076:
            return
        L_0x0077:
            boolean r4 = r13.f1252q
            if (r4 == 0) goto L_0x0086
            int r14 = r14.getChildCount()
            if (r14 <= 0) goto L_0x0086
            android.view.ViewGroup r14 = r13.f1242g
            r14.removeAllViews()
        L_0x0086:
            boolean r14 = r12.m489A0(r13)
            if (r14 == 0) goto L_0x00f6
            boolean r14 = r13.mo497b()
            if (r14 != 0) goto L_0x0093
            goto L_0x00f6
        L_0x0093:
            android.view.View r14 = r13.f1243h
            android.view.ViewGroup$LayoutParams r14 = r14.getLayoutParams()
            if (r14 != 0) goto L_0x00a0
            android.view.ViewGroup$LayoutParams r14 = new android.view.ViewGroup$LayoutParams
            r14.<init>(r3, r3)
        L_0x00a0:
            int r4 = r13.f1237b
            android.view.ViewGroup r5 = r13.f1242g
            r5.setBackgroundResource(r4)
            android.view.View r4 = r13.f1243h
            android.view.ViewParent r4 = r4.getParent()
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x00b8
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            android.view.View r5 = r13.f1243h
            r4.removeView(r5)
        L_0x00b8:
            android.view.ViewGroup r4 = r13.f1242g
            android.view.View r5 = r13.f1243h
            r4.addView(r5, r14)
            android.view.View r14 = r13.f1243h
            boolean r14 = r14.hasFocus()
            if (r14 != 0) goto L_0x00cc
            android.view.View r14 = r13.f1243h
            r14.requestFocus()
        L_0x00cc:
            r5 = r3
        L_0x00cd:
            r13.f1249n = r1
            android.view.WindowManager$LayoutParams r14 = new android.view.WindowManager$LayoutParams
            r6 = -2
            int r7 = r13.f1239d
            int r8 = r13.f1240e
            r9 = 1002(0x3ea, float:1.404E-42)
            r10 = 8519680(0x820000, float:1.1938615E-38)
            r11 = -3
            r4 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            int r1 = r13.f1238c
            r14.gravity = r1
            int r1 = r13.f1241f
            r14.windowAnimations = r1
            android.view.ViewGroup r1 = r13.f1242g
            r0.addView(r1, r14)
            r13.f1250o = r2
            int r13 = r13.f1236a
            if (r13 != 0) goto L_0x00f5
            r12.mo471f1()
        L_0x00f5:
            return
        L_0x00f6:
            r13.f1252q = r2
        L_0x00f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.m495P0(androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState, android.view.KeyEvent):void");
    }

    /* renamed from: R0 */
    private boolean m496R0(PanelFeatureState panelFeatureState, int i, KeyEvent keyEvent, int i2) {
        C0297g gVar;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.f1248m || m497S0(panelFeatureState, keyEvent)) && (gVar = panelFeatureState.f1245j) != null) {
            z = gVar.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == 0 && this.f1230u == null) {
            mo470f0(panelFeatureState, true);
        }
        return z;
    }

    /* renamed from: S0 */
    private boolean m497S0(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        boolean z;
        int i;
        boolean z2;
        C0465m0 m0Var;
        C0465m0 m0Var2;
        C0465m0 m0Var3;
        if (this.f1204U) {
            return false;
        }
        if (panelFeatureState.f1248m) {
            return true;
        }
        PanelFeatureState panelFeatureState2 = this.f1200Q;
        if (!(panelFeatureState2 == null || panelFeatureState2 == panelFeatureState)) {
            mo470f0(panelFeatureState2, false);
        }
        Window.Callback y0 = mo494y0();
        if (y0 != null) {
            panelFeatureState.f1244i = y0.onCreatePanelView(panelFeatureState.f1236a);
        }
        int i2 = panelFeatureState.f1236a;
        if (i2 == 0 || i2 == 108) {
            z = true;
        } else {
            z = false;
        }
        if (z && (m0Var3 = this.f1230u) != null) {
            m0Var3.mo1280g();
        }
        if (panelFeatureState.f1244i == null && (!z || !(mo453Q0() instanceof C0221d0))) {
            C0297g gVar = panelFeatureState.f1245j;
            if (gVar == null || panelFeatureState.f1253r) {
                if (gVar == null && (!m491C0(panelFeatureState) || panelFeatureState.f1245j == null)) {
                    return false;
                }
                if (z && this.f1230u != null) {
                    if (this.f1231v == null) {
                        this.f1231v = new C0193h();
                    }
                    this.f1230u.mo1277e(panelFeatureState.f1245j, this.f1231v);
                }
                panelFeatureState.f1245j.mo1018h0();
                if (!y0.onCreatePanelMenu(panelFeatureState.f1236a, panelFeatureState.f1245j)) {
                    panelFeatureState.mo498c((C0297g) null);
                    if (z && (m0Var2 = this.f1230u) != null) {
                        m0Var2.mo1277e((Menu) null, this.f1231v);
                    }
                    return false;
                }
                panelFeatureState.f1253r = false;
            }
            panelFeatureState.f1245j.mo1018h0();
            Bundle bundle = panelFeatureState.f1254s;
            if (bundle != null) {
                panelFeatureState.f1245j.mo983R(bundle);
                panelFeatureState.f1254s = null;
            }
            if (!y0.onPreparePanel(0, panelFeatureState.f1244i, panelFeatureState.f1245j)) {
                if (z && (m0Var = this.f1230u) != null) {
                    m0Var.mo1277e((Menu) null, this.f1231v);
                }
                panelFeatureState.f1245j.mo1015g0();
                return false;
            }
            if (keyEvent != null) {
                i = keyEvent.getDeviceId();
            } else {
                i = -1;
            }
            if (KeyCharacterMap.load(i).getKeyboardType() != 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            panelFeatureState.f1251p = z2;
            panelFeatureState.f1245j.setQwertyMode(z2);
            panelFeatureState.f1245j.mo1015g0();
        }
        panelFeatureState.f1248m = true;
        panelFeatureState.f1249n = false;
        this.f1200Q = panelFeatureState;
        return true;
    }

    /* renamed from: T0 */
    private void m498T0(boolean z) {
        C0465m0 m0Var = this.f1230u;
        if (m0Var == null || !m0Var.mo1272a() || (ViewConfiguration.get(this.f1223n).hasPermanentMenuKey() && !this.f1230u.mo1287h())) {
            PanelFeatureState w0 = mo492w0(0, true);
            w0.f1252q = true;
            mo470f0(w0, false);
            m495P0(w0, (KeyEvent) null);
            return;
        }
        Window.Callback y0 = mo494y0();
        if (this.f1230u.mo1278f() && z) {
            this.f1230u.mo1273c();
            if (!this.f1204U) {
                y0.onPanelClosed(108, mo492w0(0, true).f1245j);
            }
        } else if (y0 != null && !this.f1204U) {
            if (this.f1212c0 && (this.f1213d0 & 1) != 0) {
                this.f1224o.getDecorView().removeCallbacks(this.f1214e0);
                this.f1214e0.run();
            }
            PanelFeatureState w02 = mo492w0(0, true);
            C0297g gVar = w02.f1245j;
            if (gVar != null && !w02.f1253r && y0.onPreparePanel(0, w02.f1244i, gVar)) {
                y0.onMenuOpened(108, w02.f1245j);
                this.f1230u.mo1275d();
            }
        }
    }

    /* renamed from: U0 */
    private int m499U0(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i != 9) {
            return i;
        } else {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
    }

    /* renamed from: V */
    private boolean m500V(boolean z) {
        return m501W(z, true);
    }

    /* renamed from: W */
    private boolean m501W(boolean z, boolean z2) {
        C0918j jVar;
        if (this.f1204U) {
            return false;
        }
        int a0 = m505a0();
        int F0 = mo438F0(this.f1223n, a0);
        if (Build.VERSION.SDK_INT < 33) {
            jVar = mo460Z(this.f1223n);
        } else {
            jVar = null;
        }
        if (!z2 && jVar != null) {
            jVar = mo490v0(this.f1223n.getResources().getConfiguration());
        }
        boolean e1 = m510e1(F0, jVar, z);
        if (a0 == 0) {
            m520u0(this.f1223n).mo545e();
        } else {
            C0203q qVar = this.f1210a0;
            if (qVar != null) {
                qVar.mo544a();
            }
        }
        if (a0 == 3) {
            m519t0(this.f1223n).mo545e();
        } else {
            C0203q qVar2 = this.f1211b0;
            if (qVar2 != null) {
                qVar2.mo544a();
            }
        }
        return e1;
    }

    /* renamed from: X */
    private void m502X() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f1188E.findViewById(16908290);
        View decorView = this.f1224o.getDecorView();
        contentFrameLayout.mo1585a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f1223n.obtainStyledAttributes(C2219j.f6871y0);
        obtainStyledAttributes.getValue(C2219j.f6671K0, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(C2219j.f6676L0, contentFrameLayout.getMinWidthMinor());
        int i = C2219j.f6661I0;
        if (obtainStyledAttributes.hasValue(i)) {
            obtainStyledAttributes.getValue(i, contentFrameLayout.getFixedWidthMajor());
        }
        int i2 = C2219j.f6666J0;
        if (obtainStyledAttributes.hasValue(i2)) {
            obtainStyledAttributes.getValue(i2, contentFrameLayout.getFixedWidthMinor());
        }
        int i3 = C2219j.f6651G0;
        if (obtainStyledAttributes.hasValue(i3)) {
            obtainStyledAttributes.getValue(i3, contentFrameLayout.getFixedHeightMajor());
        }
        int i4 = C2219j.f6656H0;
        if (obtainStyledAttributes.hasValue(i4)) {
            obtainStyledAttributes.getValue(i4, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* renamed from: Y */
    private void m503Y(Window window) {
        if (this.f1224o == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof C0201o)) {
                C0201o oVar = new C0201o(callback);
                this.f1225p = oVar;
                window.setCallback(oVar);
                C0483r1 u = C0483r1.m1945u(this.f1223n, (AttributeSet) null, f1181o0);
                Drawable h = u.mo2321h(0);
                if (h != null) {
                    window.setBackgroundDrawable(h);
                }
                u.mo2333w();
                this.f1224o = window;
                if (Build.VERSION.SDK_INT >= 33 && this.f1220k0 == null) {
                    mo451P((OnBackInvokedDispatcher) null);
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* renamed from: Y0 */
    private boolean m504Y0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f1224o.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || ViewCompat.m3578U((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* renamed from: a0 */
    private int m505a0() {
        int i = this.f1206W;
        return i != -100 ? i : C0238h.m797o();
    }

    /* renamed from: b1 */
    private void m506b1() {
        if (this.f1187D) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: c1 */
    private C0218d m507c1() {
        Context context = this.f1223n;
        while (context != null) {
            if (!(context instanceof C0218d)) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return (C0218d) context;
            }
        }
        return null;
    }

    /* renamed from: d0 */
    private void m508d0() {
        C0203q qVar = this.f1210a0;
        if (qVar != null) {
            qVar.mo544a();
        }
        C0203q qVar2 = this.f1211b0;
        if (qVar2 != null) {
            qVar2.mo544a();
        }
    }

    /* renamed from: d1 */
    private void m509d1(Configuration configuration) {
        Activity activity = (Activity) this.f1222m;
        if (activity instanceof C1619q) {
            if (((C1619q) activity).getLifecycle().mo4907b().mo4914b(C1593j.C1598b.CREATED)) {
                activity.onConfigurationChanged(configuration);
            }
        } else if (this.f1203T && !this.f1204U) {
            activity.onConfigurationChanged(configuration);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0082  */
    /* renamed from: e1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m510e1(int r9, androidx.core.p016os.C0918j r10, boolean r11) {
        /*
            r8 = this;
            android.content.Context r1 = r8.f1223n
            r4 = 0
            r5 = 0
            r0 = r8
            r2 = r9
            r3 = r10
            android.content.res.Configuration r0 = r0.m511g0(r1, r2, r3, r4, r5)
            android.content.Context r1 = r8.f1223n
            int r1 = r8.m518s0(r1)
            android.content.res.Configuration r2 = r8.f1205V
            if (r2 != 0) goto L_0x001f
            android.content.Context r2 = r8.f1223n
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
        L_0x001f:
            int r3 = r2.uiMode
            r3 = r3 & 48
            int r4 = r0.uiMode
            r4 = r4 & 48
            androidx.core.os.j r2 = r8.mo490v0(r2)
            r5 = 0
            if (r10 != 0) goto L_0x0030
            r0 = r5
            goto L_0x0034
        L_0x0030:
            androidx.core.os.j r0 = r8.mo490v0(r0)
        L_0x0034:
            r6 = 0
            if (r3 == r4) goto L_0x003a
            r3 = 512(0x200, float:7.175E-43)
            goto L_0x003b
        L_0x003a:
            r3 = r6
        L_0x003b:
            if (r0 == 0) goto L_0x0047
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0047
            r2 = r3 | 4
            r3 = r2 | 8192(0x2000, float:1.14794E-41)
        L_0x0047:
            int r2 = ~r1
            r2 = r2 & r3
            r7 = 1
            if (r2 == 0) goto L_0x0071
            if (r11 == 0) goto L_0x0071
            boolean r11 = r8.f1202S
            if (r11 == 0) goto L_0x0071
            boolean r11 = f1182p0
            if (r11 != 0) goto L_0x005a
            boolean r11 = r8.f1203T
            if (r11 == 0) goto L_0x0071
        L_0x005a:
            java.lang.Object r11 = r8.f1222m
            boolean r2 = r11 instanceof android.app.Activity
            if (r2 == 0) goto L_0x0071
            android.app.Activity r11 = (android.app.Activity) r11
            boolean r11 = r11.isChild()
            if (r11 != 0) goto L_0x0071
            java.lang.Object r11 = r8.f1222m
            android.app.Activity r11 = (android.app.Activity) r11
            androidx.core.app.ActivityCompat.m2588t(r11)
            r11 = r7
            goto L_0x0072
        L_0x0071:
            r11 = r6
        L_0x0072:
            if (r11 != 0) goto L_0x007f
            if (r3 == 0) goto L_0x007f
            r11 = r3 & r1
            if (r11 != r3) goto L_0x007b
            r6 = r7
        L_0x007b:
            r8.m512g1(r4, r0, r6, r5)
            goto L_0x0080
        L_0x007f:
            r7 = r11
        L_0x0080:
            if (r7 == 0) goto L_0x009c
            java.lang.Object r11 = r8.f1222m
            boolean r1 = r11 instanceof androidx.appcompat.app.C0218d
            if (r1 == 0) goto L_0x009c
            r1 = r3 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0091
            androidx.appcompat.app.d r11 = (androidx.appcompat.app.C0218d) r11
            r11.onNightModeChanged(r9)
        L_0x0091:
            r9 = r3 & 4
            if (r9 == 0) goto L_0x009c
            java.lang.Object r9 = r8.f1222m
            androidx.appcompat.app.d r9 = (androidx.appcompat.app.C0218d) r9
            r9.onLocalesChanged(r10)
        L_0x009c:
            if (r7 == 0) goto L_0x00b1
            if (r0 == 0) goto L_0x00b1
            android.content.Context r9 = r8.f1223n
            android.content.res.Resources r9 = r9.getResources()
            android.content.res.Configuration r9 = r9.getConfiguration()
            androidx.core.os.j r9 = r8.mo490v0(r9)
            r8.mo458W0(r9)
        L_0x00b1:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.m510e1(int, androidx.core.os.j, boolean):boolean");
    }

    /* renamed from: g0 */
    private Configuration m511g0(Context context, int i, C0918j jVar, Configuration configuration, boolean z) {
        int i2;
        if (i == 1) {
            i2 = 16;
        } else if (i == 2) {
            i2 = 32;
        } else if (z) {
            i2 = 0;
        } else {
            i2 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = Utils.FLOAT_EPSILON;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & -49);
        if (jVar != null) {
            mo457V0(configuration2, jVar);
        }
        return configuration2;
    }

    /* renamed from: g1 */
    private void m512g1(int i, C0918j jVar, boolean z, Configuration configuration) {
        Resources resources = this.f1223n.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i | (resources.getConfiguration().uiMode & -49);
        if (jVar != null) {
            mo457V0(configuration2, jVar);
        }
        resources.updateConfiguration(configuration2, (DisplayMetrics) null);
        if (Build.VERSION.SDK_INT < 26) {
            C0216c0.m676a(resources);
        }
        int i2 = this.f1207X;
        if (i2 != 0) {
            this.f1223n.setTheme(i2);
            this.f1223n.getTheme().applyStyle(this.f1207X, true);
        }
        if (z && (this.f1222m instanceof Activity)) {
            m509d1(configuration2);
        }
    }

    /* renamed from: h0 */
    private ViewGroup m513h0() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.f1223n.obtainStyledAttributes(C2219j.f6871y0);
        int i = C2219j.f6636D0;
        if (obtainStyledAttributes.hasValue(i)) {
            if (obtainStyledAttributes.getBoolean(C2219j.f6681M0, false)) {
                mo442J(1);
            } else if (obtainStyledAttributes.getBoolean(i, false)) {
                mo442J(108);
            }
            if (obtainStyledAttributes.getBoolean(C2219j.f6641E0, false)) {
                mo442J(109);
            }
            if (obtainStyledAttributes.getBoolean(C2219j.f6646F0, false)) {
                mo442J(10);
            }
            this.f1196M = obtainStyledAttributes.getBoolean(C2219j.f6876z0, false);
            obtainStyledAttributes.recycle();
            m516o0();
            this.f1224o.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f1223n);
            if (this.f1197N) {
                viewGroup = this.f1195L ? (ViewGroup) from.inflate(C2216g.f6594o, (ViewGroup) null) : (ViewGroup) from.inflate(C2216g.f6593n, (ViewGroup) null);
            } else if (this.f1196M) {
                viewGroup = (ViewGroup) from.inflate(C2216g.f6585f, (ViewGroup) null);
                this.f1194K = false;
                this.f1193J = false;
            } else if (this.f1193J) {
                TypedValue typedValue = new TypedValue();
                this.f1223n.getTheme().resolveAttribute(C2210a.f6448d, typedValue, true);
                if (typedValue.resourceId != 0) {
                    context = new C0267d(this.f1223n, typedValue.resourceId);
                } else {
                    context = this.f1223n;
                }
                viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(C2216g.f6595p, (ViewGroup) null);
                C0465m0 m0Var = (C0465m0) viewGroup.findViewById(C2215f.f6569p);
                this.f1230u = m0Var;
                m0Var.setWindowCallback(mo494y0());
                if (this.f1194K) {
                    this.f1230u.mo1288i(109);
                }
                if (this.f1191H) {
                    this.f1230u.mo1288i(2);
                }
                if (this.f1192I) {
                    this.f1230u.mo1288i(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                ViewCompat.m3550F0(viewGroup, new C0186b());
                if (this.f1230u == null) {
                    this.f1189F = (TextView) viewGroup.findViewById(C2215f.f6550M);
                }
                C0417d2.m1690c(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C2215f.f6555b);
                ViewGroup viewGroup2 = (ViewGroup) this.f1224o.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                    }
                }
                this.f1224o.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new C0187c());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f1193J + ", windowActionBarOverlay: " + this.f1194K + ", android:windowIsFloating: " + this.f1196M + ", windowActionModeOverlay: " + this.f1195L + ", windowNoTitle: " + this.f1197N + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    /* renamed from: i1 */
    private void m514i1(View view) {
        boolean z;
        int i;
        if ((ViewCompat.m3565N(view) & 8192) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = C0767a.m2893c(this.f1223n, C2212c.f6473b);
        } else {
            i = C0767a.m2893c(this.f1223n, C2212c.f6472a);
        }
        view.setBackgroundColor(i);
    }

    /* renamed from: n0 */
    private void m515n0() {
        if (!this.f1187D) {
            this.f1188E = m513h0();
            CharSequence x0 = mo493x0();
            if (!TextUtils.isEmpty(x0)) {
                C0465m0 m0Var = this.f1230u;
                if (m0Var != null) {
                    m0Var.setWindowTitle(x0);
                } else if (mo453Q0() != null) {
                    mo453Q0().mo551B(x0);
                } else {
                    TextView textView = this.f1189F;
                    if (textView != null) {
                        textView.setText(x0);
                    }
                }
            }
            m502X();
            mo450O0(this.f1188E);
            this.f1187D = true;
            PanelFeatureState w0 = mo492w0(0, false);
            if (this.f1204U) {
                return;
            }
            if (w0 == null || w0.f1245j == null) {
                m492D0(108);
            }
        }
    }

    /* renamed from: o0 */
    private void m516o0() {
        if (this.f1224o == null) {
            Object obj = this.f1222m;
            if (obj instanceof Activity) {
                m503Y(((Activity) obj).getWindow());
            }
        }
        if (this.f1224o == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: q0 */
    private static Configuration m517q0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = Utils.FLOAT_EPSILON;
        if (!(configuration2 == null || configuration.diff(configuration2) == 0)) {
            float f = configuration.fontScale;
            float f2 = configuration2.fontScale;
            if (f != f2) {
                configuration3.fontScale = f2;
            }
            int i = configuration.mcc;
            int i2 = configuration2.mcc;
            if (i != i2) {
                configuration3.mcc = i2;
            }
            int i3 = configuration.mnc;
            int i4 = configuration2.mnc;
            if (i3 != i4) {
                configuration3.mnc = i4;
            }
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 24) {
                C0198l.m614a(configuration, configuration2, configuration3);
            } else if (!C1002c.m3509a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i6 = configuration.touchscreen;
            int i7 = configuration2.touchscreen;
            if (i6 != i7) {
                configuration3.touchscreen = i7;
            }
            int i8 = configuration.keyboard;
            int i9 = configuration2.keyboard;
            if (i8 != i9) {
                configuration3.keyboard = i9;
            }
            int i12 = configuration.keyboardHidden;
            int i13 = configuration2.keyboardHidden;
            if (i12 != i13) {
                configuration3.keyboardHidden = i13;
            }
            int i14 = configuration.navigation;
            int i15 = configuration2.navigation;
            if (i14 != i15) {
                configuration3.navigation = i15;
            }
            int i16 = configuration.navigationHidden;
            int i17 = configuration2.navigationHidden;
            if (i16 != i17) {
                configuration3.navigationHidden = i17;
            }
            int i18 = configuration.orientation;
            int i19 = configuration2.orientation;
            if (i18 != i19) {
                configuration3.orientation = i19;
            }
            int i22 = configuration.screenLayout & 15;
            int i23 = configuration2.screenLayout;
            if (i22 != (i23 & 15)) {
                configuration3.screenLayout |= i23 & 15;
            }
            int i24 = configuration.screenLayout & 192;
            int i25 = configuration2.screenLayout;
            if (i24 != (i25 & 192)) {
                configuration3.screenLayout |= i25 & 192;
            }
            int i26 = configuration.screenLayout & 48;
            int i27 = configuration2.screenLayout;
            if (i26 != (i27 & 48)) {
                configuration3.screenLayout |= i27 & 48;
            }
            int i28 = configuration.screenLayout & 768;
            int i29 = configuration2.screenLayout;
            if (i28 != (i29 & 768)) {
                configuration3.screenLayout |= i29 & 768;
            }
            if (i5 >= 26) {
                C0199m.m618a(configuration, configuration2, configuration3);
            }
            int i32 = configuration.uiMode & 15;
            int i33 = configuration2.uiMode;
            if (i32 != (i33 & 15)) {
                configuration3.uiMode |= i33 & 15;
            }
            int i34 = configuration.uiMode & 48;
            int i35 = configuration2.uiMode;
            if (i34 != (i35 & 48)) {
                configuration3.uiMode |= i35 & 48;
            }
            int i36 = configuration.screenWidthDp;
            int i37 = configuration2.screenWidthDp;
            if (i36 != i37) {
                configuration3.screenWidthDp = i37;
            }
            int i38 = configuration.screenHeightDp;
            int i39 = configuration2.screenHeightDp;
            if (i38 != i39) {
                configuration3.screenHeightDp = i39;
            }
            int i42 = configuration.smallestScreenWidthDp;
            int i43 = configuration2.smallestScreenWidthDp;
            if (i42 != i43) {
                configuration3.smallestScreenWidthDp = i43;
            }
            C0196j.m609b(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    /* renamed from: s0 */
    private int m518s0(Context context) {
        int i;
        if (!this.f1209Z && (this.f1222m instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 29) {
                    i = 269221888;
                } else if (i2 >= 24) {
                    i = 786432;
                } else {
                    i = 0;
                }
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f1222m.getClass()), i);
                if (activityInfo != null) {
                    this.f1208Y = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                this.f1208Y = 0;
            }
        }
        this.f1209Z = true;
        return this.f1208Y;
    }

    /* renamed from: t0 */
    private C0203q m519t0(Context context) {
        if (this.f1211b0 == null) {
            this.f1211b0 = new C0202p(context);
        }
        return this.f1211b0;
    }

    /* renamed from: u0 */
    private C0203q m520u0(Context context) {
        if (this.f1210a0 == null) {
            this.f1210a0 = new C0205r(C0230f0.m718a(context));
        }
        return this.f1210a0;
    }

    /* renamed from: z0 */
    private void m521z0() {
        m515n0();
        if (this.f1193J && this.f1227r == null) {
            Object obj = this.f1222m;
            if (obj instanceof Activity) {
                this.f1227r = new C0233g0((Activity) this.f1222m, this.f1194K);
            } else if (obj instanceof Dialog) {
                this.f1227r = new C0233g0((Dialog) this.f1222m);
            }
            C0209a aVar = this.f1227r;
            if (aVar != null) {
                aVar.mo564r(this.f1215f0);
            }
        }
    }

    /* renamed from: A */
    public void mo431A(Bundle bundle) {
        String str;
        this.f1202S = true;
        m500V(false);
        m516o0();
        Object obj = this.f1222m;
        if (obj instanceof Activity) {
            try {
                str = C0745v.m2797c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                C0209a Q0 = mo453Q0();
                if (Q0 == null) {
                    this.f1215f0 = true;
                } else {
                    Q0.mo564r(true);
                }
            }
            C0238h.m792d(this);
        }
        this.f1205V = new Configuration(this.f1223n.getResources().getConfiguration());
        this.f1203T = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo432B() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f1222m
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0009
            androidx.appcompat.app.C0238h.m786H(r3)
        L_0x0009:
            boolean r0 = r3.f1212c0
            if (r0 == 0) goto L_0x0018
            android.view.Window r0 = r3.f1224o
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f1214e0
            r0.removeCallbacks(r1)
        L_0x0018:
            r0 = 1
            r3.f1204U = r0
            int r0 = r3.f1206W
            r1 = -100
            if (r0 == r1) goto L_0x0045
            java.lang.Object r0 = r3.f1222m
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0045
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x0045
            androidx.collection.SimpleArrayMap r0 = f1179m0
            java.lang.Object r1 = r3.f1222m
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f1206W
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x0054
        L_0x0045:
            androidx.collection.SimpleArrayMap r0 = f1179m0
            java.lang.Object r1 = r3.f1222m
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x0054:
            androidx.appcompat.app.a r0 = r3.f1227r
            if (r0 == 0) goto L_0x005b
            r0.mo560n()
        L_0x005b:
            r3.m508d0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.mo432B():void");
    }

    /* renamed from: C */
    public void mo433C(Bundle bundle) {
        m515n0();
    }

    /* renamed from: D */
    public void mo434D() {
        C0209a u = mo488u();
        if (u != null) {
            u.mo571y(true);
        }
    }

    /* renamed from: E */
    public void mo435E(Bundle bundle) {
    }

    /* renamed from: E0 */
    public boolean mo436E0() {
        return this.f1186C;
    }

    /* renamed from: F */
    public void mo437F() {
        m501W(true, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F0 */
    public int mo438F0(Context context, int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i != 0) {
                if (!(i == 1 || i == 2)) {
                    if (i == 3) {
                        return m519t0(context).mo542c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            } else {
                return m520u0(context).mo542c();
            }
        }
        return i;
    }

    /* renamed from: G */
    public void mo439G() {
        C0209a u = mo488u();
        if (u != null) {
            u.mo571y(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G0 */
    public boolean mo440G0() {
        boolean z = this.f1201R;
        this.f1201R = false;
        PanelFeatureState w0 = mo492w0(0, false);
        if (w0 == null || !w0.f1250o) {
            C0264b bVar = this.f1233x;
            if (bVar != null) {
                bVar.mo684c();
                return true;
            }
            C0209a u = mo488u();
            if (u == null || !u.mo554h()) {
                return false;
            }
            return true;
        }
        if (!z) {
            mo470f0(w0, true);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H0 */
    public boolean mo441H0(int i, KeyEvent keyEvent) {
        boolean z = true;
        if (i == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z = false;
            }
            this.f1201R = z;
        } else if (i == 82) {
            m493I0(0, keyEvent);
            return true;
        }
        return false;
    }

    /* renamed from: J */
    public boolean mo442J(int i) {
        int U0 = m499U0(i);
        if (this.f1197N && U0 == 108) {
            return false;
        }
        if (this.f1193J && U0 == 1) {
            this.f1193J = false;
        }
        if (U0 == 1) {
            m506b1();
            this.f1197N = true;
            return true;
        } else if (U0 == 2) {
            m506b1();
            this.f1191H = true;
            return true;
        } else if (U0 == 5) {
            m506b1();
            this.f1192I = true;
            return true;
        } else if (U0 == 10) {
            m506b1();
            this.f1195L = true;
            return true;
        } else if (U0 == 108) {
            m506b1();
            this.f1193J = true;
            return true;
        } else if (U0 != 109) {
            return this.f1224o.requestFeature(U0);
        } else {
            m506b1();
            this.f1194K = true;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J0 */
    public boolean mo443J0(int i, KeyEvent keyEvent) {
        C0209a u = mo488u();
        if (u != null && u.mo561o(i, keyEvent)) {
            return true;
        }
        PanelFeatureState panelFeatureState = this.f1200Q;
        if (panelFeatureState == null || !m496R0(panelFeatureState, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.f1200Q == null) {
                PanelFeatureState w0 = mo492w0(0, true);
                m497S0(w0, keyEvent);
                boolean R0 = m496R0(w0, keyEvent.getKeyCode(), keyEvent, 1);
                w0.f1248m = false;
                if (R0) {
                    return true;
                }
            }
            return false;
        }
        PanelFeatureState panelFeatureState2 = this.f1200Q;
        if (panelFeatureState2 != null) {
            panelFeatureState2.f1249n = true;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K0 */
    public boolean mo444K0(int i, KeyEvent keyEvent) {
        if (i != 4) {
            if (i == 82) {
                m494L0(0, keyEvent);
                return true;
            }
        } else if (mo440G0()) {
            return true;
        }
        return false;
    }

    /* renamed from: L */
    public void mo445L(int i) {
        m515n0();
        ViewGroup viewGroup = (ViewGroup) this.f1188E.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f1223n).inflate(i, viewGroup);
        this.f1225p.mo526c(this.f1224o.getCallback());
    }

    /* renamed from: M */
    public void mo446M(View view) {
        m515n0();
        ViewGroup viewGroup = (ViewGroup) this.f1188E.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f1225p.mo526c(this.f1224o.getCallback());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M0 */
    public void mo447M0(int i) {
        C0209a u;
        if (i == 108 && (u = mo488u()) != null) {
            u.mo555i(true);
        }
    }

    /* renamed from: N */
    public void mo448N(View view, ViewGroup.LayoutParams layoutParams) {
        m515n0();
        ViewGroup viewGroup = (ViewGroup) this.f1188E.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f1225p.mo526c(this.f1224o.getCallback());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N0 */
    public void mo449N0(int i) {
        if (i == 108) {
            C0209a u = mo488u();
            if (u != null) {
                u.mo555i(false);
            }
        } else if (i == 0) {
            PanelFeatureState w0 = mo492w0(i, true);
            if (w0.f1250o) {
                mo470f0(w0, false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O0 */
    public void mo450O0(ViewGroup viewGroup) {
    }

    /* renamed from: P */
    public void mo451P(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        OnBackInvokedCallback onBackInvokedCallback;
        super.mo451P(onBackInvokedDispatcher);
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.f1220k0;
        if (!(onBackInvokedDispatcher2 == null || (onBackInvokedCallback = this.f1221l0) == null)) {
            C0200n.m621c(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.f1221l0 = null;
        }
        if (onBackInvokedDispatcher == null) {
            Object obj = this.f1222m;
            if ((obj instanceof Activity) && ((Activity) obj).getWindow() != null) {
                this.f1220k0 = C0200n.m619a((Activity) this.f1222m);
                mo471f1();
            }
        }
        this.f1220k0 = onBackInvokedDispatcher;
        mo471f1();
    }

    /* renamed from: Q */
    public void mo452Q(Toolbar toolbar) {
        if (this.f1222m instanceof Activity) {
            C0209a u = mo488u();
            if (!(u instanceof C0233g0)) {
                this.f1228s = null;
                if (u != null) {
                    u.mo560n();
                }
                this.f1227r = null;
                if (toolbar != null) {
                    C0221d0 d0Var = new C0221d0(toolbar, mo493x0(), this.f1225p);
                    this.f1227r = d0Var;
                    this.f1225p.mo530e(d0Var.f1299c);
                    toolbar.setBackInvokedCallbackEnabled(true);
                } else {
                    this.f1225p.mo530e((C0192g) null);
                }
                mo491w();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q0 */
    public final C0209a mo453Q0() {
        return this.f1227r;
    }

    /* renamed from: R */
    public void mo454R(int i) {
        this.f1207X = i;
    }

    /* renamed from: S */
    public final void mo455S(CharSequence charSequence) {
        this.f1229t = charSequence;
        C0465m0 m0Var = this.f1230u;
        if (m0Var != null) {
            m0Var.setWindowTitle(charSequence);
        } else if (mo453Q0() != null) {
            mo453Q0().mo551B(charSequence);
        } else {
            TextView textView = this.f1189F;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    /* renamed from: T */
    public C0264b mo456T(C0264b.C0265a aVar) {
        C0227e eVar;
        if (aVar != null) {
            C0264b bVar = this.f1233x;
            if (bVar != null) {
                bVar.mo684c();
            }
            C0194i iVar = new C0194i(aVar);
            C0209a u = mo488u();
            if (u != null) {
                C0264b C = u.mo552C(iVar);
                this.f1233x = C;
                if (!(C == null || (eVar = this.f1226q) == null)) {
                    eVar.onSupportActionModeStarted(C);
                }
            }
            if (this.f1233x == null) {
                this.f1233x = mo463a1(iVar);
            }
            mo471f1();
            return this.f1233x;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V0 */
    public void mo457V0(Configuration configuration, C0918j jVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            C0198l.m617d(configuration, jVar);
            return;
        }
        C0196j.m611d(configuration, jVar.mo3364d(0));
        C0196j.m610c(configuration, jVar.mo3364d(0));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W0 */
    public void mo458W0(C0918j jVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            C0198l.m616c(jVar);
        } else {
            Locale.setDefault(jVar.mo3364d(0));
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f1188E;
     */
    /* renamed from: X0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo459X0() {
        /*
            r1 = this;
            boolean r0 = r1.f1187D
            if (r0 == 0) goto L_0x0010
            android.view.ViewGroup r0 = r1.f1188E
            if (r0 == 0) goto L_0x0010
            boolean r0 = androidx.core.view.ViewCompat.m3579V(r0)
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.mo459X0():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public C0918j mo460Z(Context context) {
        C0918j t;
        C0918j jVar;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || (t = C0238h.m799t()) == null) {
            return null;
        }
        C0918j v0 = mo490v0(context.getApplicationContext().getResources().getConfiguration());
        if (i >= 24) {
            jVar = C0213b0.m672b(t, v0);
        } else if (t.mo3366f()) {
            jVar = C0918j.m3352e();
        } else {
            jVar = C0918j.m3351c(t.mo3364d(0).toString());
        }
        if (jVar.mo3366f()) {
            return v0;
        }
        return jVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z0 */
    public boolean mo461Z0() {
        if (this.f1220k0 == null) {
            return false;
        }
        PanelFeatureState w0 = mo492w0(0, false);
        if ((w0 == null || !w0.f1250o) && this.f1233x == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo462a(C0297g gVar, MenuItem menuItem) {
        PanelFeatureState p0;
        Window.Callback y0 = mo494y0();
        if (y0 == null || this.f1204U || (p0 = mo484p0(gVar.mo972F())) == null) {
            return false;
        }
        return y0.onMenuItemSelected(p0.f1236a, menuItem);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* renamed from: a1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.appcompat.view.C0264b mo463a1(androidx.appcompat.view.C0264b.C0265a r8) {
        /*
            r7 = this;
            r7.mo479m0()
            androidx.appcompat.view.b r0 = r7.f1233x
            if (r0 == 0) goto L_0x000a
            r0.mo684c()
        L_0x000a:
            boolean r0 = r8 instanceof androidx.appcompat.app.AppCompatDelegateImpl.C0194i
            if (r0 != 0) goto L_0x0014
            androidx.appcompat.app.AppCompatDelegateImpl$i r0 = new androidx.appcompat.app.AppCompatDelegateImpl$i
            r0.<init>(r8)
            r8 = r0
        L_0x0014:
            androidx.appcompat.app.e r0 = r7.f1226q
            r1 = 0
            if (r0 == 0) goto L_0x0022
            boolean r2 = r7.f1204U
            if (r2 != 0) goto L_0x0022
            androidx.appcompat.view.b r0 = r0.onWindowStartingSupportActionMode(r8)     // Catch:{ AbstractMethodError -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            if (r0 == 0) goto L_0x0029
            r7.f1233x = r0
            goto L_0x015b
        L_0x0029:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f1234y
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x00d4
            boolean r0 = r7.f1196M
            if (r0 == 0) goto L_0x00b5
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r4 = r7.f1223n
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int r5 = p030c.C2210a.f6448d
            r4.resolveAttribute(r5, r0, r3)
            int r5 = r0.resourceId
            if (r5 == 0) goto L_0x0068
            android.content.Context r5 = r7.f1223n
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            r5.setTo(r4)
            int r4 = r0.resourceId
            r5.applyStyle(r4, r3)
            androidx.appcompat.view.d r4 = new androidx.appcompat.view.d
            android.content.Context r6 = r7.f1223n
            r4.<init>((android.content.Context) r6, (int) r2)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r5)
            goto L_0x006a
        L_0x0068:
            android.content.Context r4 = r7.f1223n
        L_0x006a:
            androidx.appcompat.widget.ActionBarContextView r5 = new androidx.appcompat.widget.ActionBarContextView
            r5.<init>(r4)
            r7.f1234y = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            int r6 = p030c.C2210a.f6450f
            r5.<init>(r4, r1, r6)
            r7.f1235z = r5
            r6 = 2
            androidx.core.widget.C1310m.m4543b(r5, r6)
            android.widget.PopupWindow r5 = r7.f1235z
            androidx.appcompat.widget.ActionBarContextView r6 = r7.f1234y
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r7.f1235z
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r4.getTheme()
            int r6 = p030c.C2210a.f6446b
            r5.resolveAttribute(r6, r0, r3)
            int r0 = r0.data
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r0 = android.util.TypedValue.complexToDimensionPixelSize(r0, r4)
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f1234y
            r4.setContentHeight(r0)
            android.widget.PopupWindow r0 = r7.f1235z
            r4 = -2
            r0.setHeight(r4)
            androidx.appcompat.app.AppCompatDelegateImpl$d r0 = new androidx.appcompat.app.AppCompatDelegateImpl$d
            r0.<init>()
            r7.f1184A = r0
            goto L_0x00d4
        L_0x00b5:
            android.view.ViewGroup r0 = r7.f1188E
            int r4 = p030c.C2215f.f6561h
            android.view.View r0 = r0.findViewById(r4)
            androidx.appcompat.widget.ViewStubCompat r0 = (androidx.appcompat.widget.ViewStubCompat) r0
            if (r0 == 0) goto L_0x00d4
            android.content.Context r4 = r7.mo486r0()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0.setLayoutInflater(r4)
            android.view.View r0 = r0.mo1898a()
            androidx.appcompat.widget.ActionBarContextView r0 = (androidx.appcompat.widget.ActionBarContextView) r0
            r7.f1234y = r0
        L_0x00d4:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f1234y
            if (r0 == 0) goto L_0x015b
            r7.mo479m0()
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f1234y
            r0.mo1257k()
            androidx.appcompat.view.e r0 = new androidx.appcompat.view.e
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f1234y
            android.content.Context r4 = r4.getContext()
            androidx.appcompat.widget.ActionBarContextView r5 = r7.f1234y
            android.widget.PopupWindow r6 = r7.f1235z
            if (r6 != 0) goto L_0x00ef
            goto L_0x00f0
        L_0x00ef:
            r3 = r2
        L_0x00f0:
            r0.<init>(r4, r5, r8, r3)
            android.view.Menu r3 = r0.mo686e()
            boolean r8 = r8.mo522b(r0, r3)
            if (r8 == 0) goto L_0x0159
            r0.mo690k()
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f1234y
            r8.mo1255h(r0)
            r7.f1233x = r0
            boolean r8 = r7.mo459X0()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x012a
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f1234y
            r1 = 0
            r8.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f1234y
            androidx.core.view.ViewPropertyAnimatorCompat r8 = androidx.core.view.ViewCompat.m3592e(r8)
            androidx.core.view.ViewPropertyAnimatorCompat r8 = r8.mo3469b(r0)
            r7.f1185B = r8
            androidx.appcompat.app.AppCompatDelegateImpl$e r0 = new androidx.appcompat.app.AppCompatDelegateImpl$e
            r0.<init>()
            r8.mo3474h(r0)
            goto L_0x0149
        L_0x012a:
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f1234y
            r8.setAlpha(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f1234y
            r8.setVisibility(r2)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f1234y
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x0149
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f1234y
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            androidx.core.view.ViewCompat.m3613o0(r8)
        L_0x0149:
            android.widget.PopupWindow r8 = r7.f1235z
            if (r8 == 0) goto L_0x015b
            android.view.Window r8 = r7.f1224o
            android.view.View r8 = r8.getDecorView()
            java.lang.Runnable r0 = r7.f1184A
            r8.post(r0)
            goto L_0x015b
        L_0x0159:
            r7.f1233x = r1
        L_0x015b:
            androidx.appcompat.view.b r8 = r7.f1233x
            if (r8 == 0) goto L_0x0166
            androidx.appcompat.app.e r0 = r7.f1226q
            if (r0 == 0) goto L_0x0166
            r0.onSupportActionModeStarted(r8)
        L_0x0166:
            r7.mo471f1()
            androidx.appcompat.view.b r8 = r7.f1233x
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.mo463a1(androidx.appcompat.view.b$a):androidx.appcompat.view.b");
    }

    /* renamed from: b */
    public void mo464b(C0297g gVar) {
        m498T0(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public void mo465b0(int i, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i >= 0) {
                PanelFeatureState[] panelFeatureStateArr = this.f1199P;
                if (i < panelFeatureStateArr.length) {
                    panelFeatureState = panelFeatureStateArr[i];
                }
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.f1245j;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.f1250o) && !this.f1204U) {
            this.f1225p.mo527d(this.f1224o.getCallback(), i, menu);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public void mo466c0(C0297g gVar) {
        if (!this.f1198O) {
            this.f1198O = true;
            this.f1230u.mo1289j();
            Window.Callback y0 = mo494y0();
            if (y0 != null && !this.f1204U) {
                y0.onPanelClosed(108, gVar);
            }
            this.f1198O = false;
        }
    }

    /* renamed from: e */
    public void mo467e(View view, ViewGroup.LayoutParams layoutParams) {
        m515n0();
        ((ViewGroup) this.f1188E.findViewById(16908290)).addView(view, layoutParams);
        this.f1225p.mo526c(this.f1224o.getCallback());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e0 */
    public void mo468e0(int i) {
        mo470f0(mo492w0(i, true), true);
    }

    /* renamed from: f */
    public boolean mo469f() {
        return m500V(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public void mo470f0(PanelFeatureState panelFeatureState, boolean z) {
        ViewGroup viewGroup;
        C0465m0 m0Var;
        if (!z || panelFeatureState.f1236a != 0 || (m0Var = this.f1230u) == null || !m0Var.mo1278f()) {
            WindowManager windowManager = (WindowManager) this.f1223n.getSystemService("window");
            if (!(windowManager == null || !panelFeatureState.f1250o || (viewGroup = panelFeatureState.f1242g) == null)) {
                windowManager.removeView(viewGroup);
                if (z) {
                    mo465b0(panelFeatureState.f1236a, panelFeatureState, (Menu) null);
                }
            }
            panelFeatureState.f1248m = false;
            panelFeatureState.f1249n = false;
            panelFeatureState.f1250o = false;
            panelFeatureState.f1243h = null;
            panelFeatureState.f1252q = true;
            if (this.f1200Q == panelFeatureState) {
                this.f1200Q = null;
            }
            if (panelFeatureState.f1236a == 0) {
                mo471f1();
                return;
            }
            return;
        }
        mo466c0(panelFeatureState.f1245j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f1 */
    public void mo471f1() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean Z0 = mo461Z0();
            if (Z0 && this.f1221l0 == null) {
                this.f1221l0 = C0200n.m620b(this.f1220k0, this);
            } else if (!Z0 && (onBackInvokedCallback = this.f1221l0) != null) {
                C0200n.m621c(this.f1220k0, onBackInvokedCallback);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h1 */
    public final int mo472h1(WindowInsetsCompat windowInsetsCompat, Rect rect) {
        int i;
        boolean z;
        int i2;
        int i3;
        boolean z2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i4;
        int i5 = 0;
        if (windowInsetsCompat != null) {
            i = windowInsetsCompat.mo3496l();
        } else if (rect != null) {
            i = rect.top;
        } else {
            i = 0;
        }
        ActionBarContextView actionBarContextView = this.f1234y;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f1234y.getLayoutParams();
            boolean z3 = true;
            if (this.f1234y.isShown()) {
                if (this.f1216g0 == null) {
                    this.f1216g0 = new Rect();
                    this.f1217h0 = new Rect();
                }
                Rect rect2 = this.f1216g0;
                Rect rect3 = this.f1217h0;
                if (windowInsetsCompat == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(windowInsetsCompat.mo3494j(), windowInsetsCompat.mo3496l(), windowInsetsCompat.mo3495k(), windowInsetsCompat.mo3493i());
                }
                C0417d2.m1688a(this.f1188E, rect2, rect3);
                int i6 = rect2.top;
                int i7 = rect2.left;
                int i8 = rect2.right;
                WindowInsetsCompat H = ViewCompat.m3553H(this.f1188E);
                if (H == null) {
                    i2 = 0;
                } else {
                    i2 = H.mo3494j();
                }
                if (H == null) {
                    i3 = 0;
                } else {
                    i3 = H.mo3495k();
                }
                if (marginLayoutParams2.topMargin == i6 && marginLayoutParams2.leftMargin == i7 && marginLayoutParams2.rightMargin == i8) {
                    z2 = false;
                } else {
                    marginLayoutParams2.topMargin = i6;
                    marginLayoutParams2.leftMargin = i7;
                    marginLayoutParams2.rightMargin = i8;
                    z2 = true;
                }
                if (i6 <= 0 || this.f1190G != null) {
                    View view = this.f1190G;
                    if (!(view == null || ((marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()).height == (i4 = marginLayoutParams2.topMargin) && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3))) {
                        marginLayoutParams.height = i4;
                        marginLayoutParams.leftMargin = i2;
                        marginLayoutParams.rightMargin = i3;
                        this.f1190G.setLayoutParams(marginLayoutParams);
                    }
                } else {
                    View view2 = new View(this.f1223n);
                    this.f1190G = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams2.topMargin, 51);
                    layoutParams.leftMargin = i2;
                    layoutParams.rightMargin = i3;
                    this.f1188E.addView(this.f1190G, -1, layoutParams);
                }
                View view3 = this.f1190G;
                if (view3 == null) {
                    z3 = false;
                }
                if (z3 && view3.getVisibility() != 0) {
                    m514i1(this.f1190G);
                }
                if (!this.f1195L && z3) {
                    i = 0;
                }
                z = z3;
                z3 = z2;
            } else if (marginLayoutParams2.topMargin != 0) {
                marginLayoutParams2.topMargin = 0;
                z = false;
            } else {
                z = false;
                z3 = false;
            }
            if (z3) {
                this.f1234y.setLayoutParams(marginLayoutParams2);
            }
        }
        View view4 = this.f1190G;
        if (view4 != null) {
            if (!z) {
                i5 = 8;
            }
            view4.setVisibility(i5);
        }
        return i;
    }

    /* renamed from: i */
    public Context mo473i(Context context) {
        Configuration configuration;
        boolean z = true;
        this.f1202S = true;
        int F0 = mo438F0(context, m505a0());
        if (C0238h.m800x(context)) {
            C0238h.m790U(context);
        }
        C0918j Z = mo460Z(context);
        if (f1183q0 && (context instanceof ContextThemeWrapper)) {
            try {
                C0206s.m638a((ContextThemeWrapper) context, m511g0(context, F0, Z, (Configuration) null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof C0267d) {
            try {
                ((C0267d) context).mo743a(m511g0(context, F0, Z, (Configuration) null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f1182p0) {
            return super.mo473i(context);
        }
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = Utils.FLOAT_EPSILON;
        Configuration configuration3 = C0196j.m608a(context, configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (!configuration3.equals(configuration4)) {
            configuration = m517q0(configuration3, configuration4);
        } else {
            configuration = null;
        }
        Configuration g0 = m511g0(context, F0, Z, configuration, true);
        C0267d dVar = new C0267d(context, C2218i.f6618e);
        dVar.mo743a(g0);
        boolean z2 = false;
        try {
            if (context.getTheme() == null) {
                z = false;
            }
            z2 = z;
        } catch (NullPointerException unused3) {
        }
        if (z2) {
            C0808h.C0814f.m3054a(dVar.getTheme());
        }
        return super.mo473i(dVar);
    }

    /* renamed from: i0 */
    public View mo474i0(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        boolean z2 = false;
        if (this.f1218i0 == null) {
            String string = this.f1223n.obtainStyledAttributes(C2219j.f6871y0).getString(C2219j.f6631C0);
            if (string == null) {
                this.f1218i0 = new C0255w();
            } else {
                try {
                    this.f1218i0 = (C0255w) this.f1223n.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f1218i0 = new C0255w();
                }
            }
        }
        boolean z3 = f1180n0;
        if (z3) {
            if (this.f1219j0 == null) {
                this.f1219j0 = new C0211a0();
            }
            if (this.f1219j0.mo573a(attributeSet)) {
                z = true;
                return this.f1218i0.mo727r(view, str, context, attributeSet, z, z3, true, C0413c2.m1673d());
            } else if (!(attributeSet instanceof XmlPullParser)) {
                z2 = m504Y0((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z2 = true;
            }
        }
        z = z2;
        return this.f1218i0.mo727r(view, str, context, attributeSet, z, z3, true, C0413c2.m1673d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public void mo475j0() {
        C0297g gVar;
        C0465m0 m0Var = this.f1230u;
        if (m0Var != null) {
            m0Var.mo1289j();
        }
        if (this.f1235z != null) {
            this.f1224o.getDecorView().removeCallbacks(this.f1184A);
            if (this.f1235z.isShowing()) {
                try {
                    this.f1235z.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f1235z = null;
        }
        mo479m0();
        PanelFeatureState w0 = mo492w0(0, false);
        if (w0 != null && (gVar = w0.f1245j) != null) {
            gVar.close();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public boolean mo476k0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f1222m;
        boolean z = true;
        if (((obj instanceof C1272y.C1273a) || (obj instanceof C0253u)) && (decorView = this.f1224o.getDecorView()) != null && C1272y.m4416d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f1225p.mo525b(this.f1224o.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z = false;
        }
        if (z) {
            return mo441H0(keyCode, keyEvent);
        }
        return mo444K0(keyCode, keyEvent);
    }

    /* renamed from: l */
    public View mo477l(int i) {
        m515n0();
        return this.f1224o.findViewById(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l0 */
    public void mo478l0(int i) {
        PanelFeatureState w0;
        PanelFeatureState w02 = mo492w0(i, true);
        if (w02.f1245j != null) {
            Bundle bundle = new Bundle();
            w02.f1245j.mo985T(bundle);
            if (bundle.size() > 0) {
                w02.f1254s = bundle;
            }
            w02.f1245j.mo1018h0();
            w02.f1245j.clear();
        }
        w02.f1253r = true;
        w02.f1252q = true;
        if ((i == 108 || i == 0) && this.f1230u != null && (w0 = mo492w0(0, false)) != null) {
            w0.f1248m = false;
            m497S0(w0, (KeyEvent) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m0 */
    public void mo479m0() {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.f1185B;
        if (viewPropertyAnimatorCompat != null) {
            viewPropertyAnimatorCompat.mo3470c();
        }
    }

    /* renamed from: n */
    public Context mo480n() {
        return this.f1223n;
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return mo474i0(view, str, context, attributeSet);
    }

    /* renamed from: p */
    public final C0212b mo483p() {
        return new C0191f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p0 */
    public PanelFeatureState mo484p0(Menu menu) {
        int i;
        PanelFeatureState[] panelFeatureStateArr = this.f1199P;
        if (panelFeatureStateArr != null) {
            i = panelFeatureStateArr.length;
        } else {
            i = 0;
        }
        for (int i2 = 0; i2 < i; i2++) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i2];
            if (panelFeatureState != null && panelFeatureState.f1245j == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    /* renamed from: q */
    public int mo485q() {
        return this.f1206W;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r0 */
    public final Context mo486r0() {
        Context context;
        C0209a u = mo488u();
        if (u != null) {
            context = u.mo557k();
        } else {
            context = null;
        }
        if (context == null) {
            return this.f1223n;
        }
        return context;
    }

    /* renamed from: s */
    public MenuInflater mo487s() {
        Context context;
        if (this.f1228s == null) {
            m521z0();
            C0209a aVar = this.f1227r;
            if (aVar != null) {
                context = aVar.mo557k();
            } else {
                context = this.f1223n;
            }
            this.f1228s = new C0272g(context);
        }
        return this.f1228s;
    }

    /* renamed from: u */
    public C0209a mo488u() {
        m521z0();
        return this.f1227r;
    }

    /* renamed from: v */
    public void mo489v() {
        LayoutInflater from = LayoutInflater.from(this.f1223n);
        if (from.getFactory() == null) {
            C1278z.m4422a(from, this);
        } else if (!(from.getFactory2() instanceof AppCompatDelegateImpl)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v0 */
    public C0918j mo490v0(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C0198l.m615b(configuration);
        }
        return C0918j.m3351c(C0197k.m613b(configuration.locale));
    }

    /* renamed from: w */
    public void mo491w() {
        if (mo453Q0() != null && !mo488u().mo558l()) {
            m492D0(0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w0 */
    public PanelFeatureState mo492w0(int i, boolean z) {
        PanelFeatureState[] panelFeatureStateArr = this.f1199P;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[(i + 1)];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.f1199P = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        PanelFeatureState panelFeatureState2 = new PanelFeatureState(i);
        panelFeatureStateArr[i] = panelFeatureState2;
        return panelFeatureState2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x0 */
    public final CharSequence mo493x0() {
        Object obj = this.f1222m;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this.f1229t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y0 */
    public final Window.Callback mo494y0() {
        return this.f1224o.getCallback();
    }

    /* renamed from: z */
    public void mo495z(Configuration configuration) {
        C0209a u;
        if (this.f1193J && this.f1187D && (u = mo488u()) != null) {
            u.mo559m(configuration);
        }
        C0444i.m1769b().mo2130g(this.f1223n);
        this.f1205V = new Configuration(this.f1223n.getResources().getConfiguration());
        m501W(false, false);
    }

    AppCompatDelegateImpl(Dialog dialog, C0227e eVar) {
        this(dialog.getContext(), dialog.getWindow(), eVar, dialog);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    private AppCompatDelegateImpl(Context context, Window window, C0227e eVar, Object obj) {
        C0218d c1;
        this.f1185B = null;
        this.f1186C = true;
        this.f1206W = -100;
        this.f1214e0 = new C0185a();
        this.f1223n = context;
        this.f1226q = eVar;
        this.f1222m = obj;
        if (this.f1206W == -100 && (obj instanceof Dialog) && (c1 = m507c1()) != null) {
            this.f1206W = c1.getDelegate().mo485q();
        }
        if (this.f1206W == -100) {
            SimpleArrayMap simpleArrayMap = f1179m0;
            Integer num = (Integer) simpleArrayMap.get(obj.getClass().getName());
            if (num != null) {
                this.f1206W = num.intValue();
                simpleArrayMap.remove(obj.getClass().getName());
            }
        }
        if (window != null) {
            m503Y(window);
        }
        C0444i.m1771h();
    }
}
