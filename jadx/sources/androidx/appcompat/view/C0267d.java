package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import com.github.mikephil.charting.utils.Utils;
import p030c.C2218i;

/* renamed from: androidx.appcompat.view.d */
public class C0267d extends ContextWrapper {

    /* renamed from: f */
    private static Configuration f1396f;

    /* renamed from: a */
    private int f1397a;

    /* renamed from: b */
    private Resources.Theme f1398b;

    /* renamed from: c */
    private LayoutInflater f1399c;

    /* renamed from: d */
    private Configuration f1400d;

    /* renamed from: e */
    private Resources f1401e;

    /* renamed from: androidx.appcompat.view.d$a */
    static class C0268a {
        /* renamed from: a */
        static Context m916a(C0267d dVar, Configuration configuration) {
            return dVar.createConfigurationContext(configuration);
        }
    }

    public C0267d(Context context, int i) {
        super(context);
        this.f1397a = i;
    }

    /* renamed from: b */
    private Resources m910b() {
        if (this.f1401e == null) {
            Configuration configuration = this.f1400d;
            if (configuration == null || (Build.VERSION.SDK_INT >= 26 && m912e(configuration))) {
                this.f1401e = super.getResources();
            } else {
                this.f1401e = C0268a.m916a(this, this.f1400d).getResources();
            }
        }
        return this.f1401e;
    }

    /* renamed from: d */
    private void m911d() {
        boolean z;
        if (this.f1398b == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f1398b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f1398b.setTo(theme);
            }
        }
        mo746f(this.f1398b, this.f1397a, z);
    }

    /* renamed from: e */
    private static boolean m912e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f1396f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = Utils.FLOAT_EPSILON;
            f1396f = configuration2;
        }
        return configuration.equals(f1396f);
    }

    /* renamed from: a */
    public void mo743a(Configuration configuration) {
        if (this.f1401e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.f1400d == null) {
            this.f1400d = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: c */
    public int mo745c() {
        return this.f1397a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo746f(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        return m910b();
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f1399c == null) {
            this.f1399c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f1399c;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1398b;
        if (theme != null) {
            return theme;
        }
        if (this.f1397a == 0) {
            this.f1397a = C2218i.f6619f;
        }
        m911d();
        return this.f1398b;
    }

    public void setTheme(int i) {
        if (this.f1397a != i) {
            this.f1397a = i;
            m911d();
        }
    }

    public C0267d(Context context, Resources.Theme theme) {
        super(context);
        this.f1398b = theme;
    }
}
