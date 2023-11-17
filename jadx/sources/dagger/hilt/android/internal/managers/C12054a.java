package dagger.hilt.android.internal.managers;

import android.app.Activity;
import android.app.Application;
import androidx.activity.ComponentActivity;
import p516mf.C16681a;
import p586rf.C17605a;
import p627uf.C18154b;

/* renamed from: dagger.hilt.android.internal.managers.a */
public class C12054a implements C18154b {

    /* renamed from: d */
    private volatile Object f35454d;

    /* renamed from: e */
    private final Object f35455e = new Object();

    /* renamed from: f */
    protected final Activity f35456f;

    /* renamed from: g */
    private final C18154b f35457g;

    /* renamed from: dagger.hilt.android.internal.managers.a$a */
    public interface C12055a {
        /* renamed from: a */
        C17605a mo32185a();
    }

    public C12054a(Activity activity) {
        this.f35456f = activity;
        this.f35457g = new C12056b((ComponentActivity) activity);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo32184a() {
        if (this.f35456f.getApplication() instanceof C18154b) {
            return ((C12055a) C16681a.m59022a(this.f35457g, C12055a.class)).mo32185a().mo32371b(this.f35456f).mo32370a();
        }
        if (Application.class.equals(this.f35456f.getApplication().getClass())) {
            throw new IllegalStateException("Hilt Activity must be attached to an @HiltAndroidApp Application. Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?");
        }
        throw new IllegalStateException("Hilt Activity must be attached to an @AndroidEntryPoint Application. Found: " + this.f35456f.getApplication().getClass());
    }

    public Object generatedComponent() {
        if (this.f35454d == null) {
            synchronized (this.f35455e) {
                if (this.f35454d == null) {
                    this.f35454d = mo32184a();
                }
            }
        }
        return this.f35454d;
    }
}
