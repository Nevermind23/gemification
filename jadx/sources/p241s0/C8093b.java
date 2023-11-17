package p241s0;

import android.graphics.drawable.Drawable;
import androidx.appcompat.app.C0209a;
import androidx.appcompat.app.C0212b;
import androidx.appcompat.app.C0218d;
import kotlin.jvm.internal.C41536l;

/* renamed from: s0.b */
public final class C8093b extends C8092a {

    /* renamed from: f */
    private final C0218d f23255f;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C8093b(androidx.appcompat.app.C0218d r3, p241s0.C8095d r4) {
        /*
            r2 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.C41536l.m120489i(r3, r0)
            java.lang.String r0 = "configuration"
            kotlin.jvm.internal.C41536l.m120489i(r4, r0)
            androidx.appcompat.app.b r0 = r3.getDrawerToggleDelegate()
            if (r0 == 0) goto L_0x001f
            android.content.Context r0 = r0.mo515a()
            java.lang.String r1 = "checkNotNull(activity.dr… }.actionBarThemedContext"
            kotlin.jvm.internal.C41536l.m120488h(r0, r1)
            r2.<init>(r0, r4)
            r2.f23255f = r3
            return
        L_0x001f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Activity "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r3 = " does not have an DrawerToggleDelegate set"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p241s0.C8093b.<init>(androidx.appcompat.app.d, s0.d):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo23267c(Drawable drawable, int i) {
        boolean z;
        C0209a supportActionBar = this.f23255f.getSupportActionBar();
        if (supportActionBar != null) {
            C41536l.m120488h(supportActionBar, "checkNotNull(activity.su…ortActionBar()\"\n        }");
            if (drawable != null) {
                z = true;
            } else {
                z = false;
            }
            supportActionBar.mo565s(z);
            C0212b drawerToggleDelegate = this.f23255f.getDrawerToggleDelegate();
            if (drawerToggleDelegate != null) {
                C41536l.m120488h(drawerToggleDelegate, "checkNotNull(activity.dr…leDelegate set\"\n        }");
                drawerToggleDelegate.mo516b(drawable, i);
                return;
            }
            throw new IllegalStateException(("Activity " + this.f23255f + " does not have an DrawerToggleDelegate set").toString());
        }
        throw new IllegalStateException(("Activity " + this.f23255f + " does not have an ActionBar set via setSupportActionBar()").toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo23268d(CharSequence charSequence) {
        C0209a supportActionBar = this.f23255f.getSupportActionBar();
        if (supportActionBar != null) {
            C41536l.m120488h(supportActionBar, "checkNotNull(activity.su…ortActionBar()\"\n        }");
            supportActionBar.mo550A(charSequence);
            return;
        }
        throw new IllegalStateException(("Activity " + this.f23255f + " does not have an ActionBar set via setSupportActionBar()").toString());
    }
}
