package p416fd;

import android.content.Context;
import android.view.OrientationEventListener;
import android.view.WindowManager;

/* renamed from: fd.o */
public class C12859o {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f37997a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public WindowManager f37998b;

    /* renamed from: c */
    private OrientationEventListener f37999c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C12858n f38000d;

    /* renamed from: fd.o$a */
    class C12860a extends OrientationEventListener {
        C12860a(Context context, int i) {
            super(context, i);
        }

        public void onOrientationChanged(int i) {
            int rotation;
            WindowManager a = C12859o.this.f37998b;
            C12858n b = C12859o.this.f38000d;
            if (C12859o.this.f37998b != null && b != null && (rotation = a.getDefaultDisplay().getRotation()) != C12859o.this.f37997a) {
                int unused = C12859o.this.f37997a = rotation;
                b.mo27456a(rotation);
            }
        }
    }

    /* renamed from: e */
    public void mo33526e(Context context, C12858n nVar) {
        mo33527f();
        Context applicationContext = context.getApplicationContext();
        this.f38000d = nVar;
        this.f37998b = (WindowManager) applicationContext.getSystemService("window");
        C12860a aVar = new C12860a(applicationContext, 3);
        this.f37999c = aVar;
        aVar.enable();
        this.f37997a = this.f37998b.getDefaultDisplay().getRotation();
    }

    /* renamed from: f */
    public void mo33527f() {
        OrientationEventListener orientationEventListener = this.f37999c;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        this.f37999c = null;
        this.f37998b = null;
        this.f38000d = null;
    }
}
