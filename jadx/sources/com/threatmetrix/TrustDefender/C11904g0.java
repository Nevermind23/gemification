package com.threatmetrix.TrustDefender;

import android.content.Context;
import android.os.PowerManager;
import com.threatmetrix.TrustDefender.C11907h;
import com.threatmetrix.TrustDefender.C11969r1;

/* renamed from: com.threatmetrix.TrustDefender.g0 */
public abstract class C11904g0 {

    /* renamed from: a */
    private static final String f34833a = C11907h.m43615j(C11904g0.class);

    /* renamed from: a */
    public static boolean m43602a(Context context) {
        if (C11969r1.C11981l.m43998b() && C11969r1.C11983n.C11984a.f35247c >= C11969r1.C11983n.C11985b.f35261m) {
            try {
                Object systemService = context.getSystemService("power");
                if (!(systemService instanceof PowerManager)) {
                    return true;
                }
                return ((PowerManager) systemService).isInteractive();
            } catch (SecurityException e) {
                C11907h.C11908a.m43628f(f34833a, "User refuse granting permission {}", e.toString());
                C12014y0.m44139c(e);
            } catch (Exception e2) {
                C11907h.m43607b(f34833a, e2.toString());
            }
        }
        return true;
    }
}
