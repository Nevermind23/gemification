package com.threatmetrix.TrustDefender;

import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import com.threatmetrix.TrustDefender.C11879b0;
import com.threatmetrix.TrustDefender.C11907h;
import java.lang.reflect.Method;
import p585re.C17603t;

/* renamed from: com.threatmetrix.TrustDefender.y1 */
public class C12015y1 extends C11879b0 {

    /* renamed from: d */
    private static final String f35383d = C11907h.m43615j(C12015y1.class);

    /* renamed from: e */
    private static final Class f35384e;

    /* renamed from: f */
    private static final Method f35385f;

    /* renamed from: b */
    private Display f35386b;

    /* renamed from: c */
    private Point f35387c;

    static {
        Class i = C11879b0.m43537i(C11879b0.C11880a.WINDOW_MANAGER);
        f35384e = i;
        f35385f = C11879b0.m43538j(i, "getDefaultDisplay", new Class[0]);
    }

    public C12015y1(C17603t tVar) {
        if (f35385f != null) {
            try {
                Object systemService = tVar.f49314a.getSystemService("window");
                if (systemService instanceof WindowManager) {
                    this.f35386b = ((WindowManager) systemService).getDefaultDisplay();
                    this.f35387c = m44144k();
                }
            } catch (SecurityException e) {
                C11907h.C11908a.m43628f(f35383d, "User refuse granting permission {}", e.toString());
                C12014y0.m44139c(e);
            } catch (Exception e2) {
                C11907h.m43607b(f35383d, e2.toString());
            }
        }
    }

    /* renamed from: k */
    private Point m44144k() {
        Point point = new Point();
        this.f35386b.getRealSize(point);
        if (point.x == 0 || point.y == 0) {
            return null;
        }
        return point;
    }

    /* renamed from: l */
    public int mo32106l() {
        if (this.f35386b == null) {
            return 0;
        }
        Point point = this.f35387c;
        if (point != null) {
            return point.x;
        }
        Point point2 = new Point();
        this.f35386b.getSize(point2);
        return point2.x;
    }

    /* renamed from: m */
    public int mo32107m() {
        if (this.f35386b == null) {
            return 0;
        }
        Point point = this.f35387c;
        if (point != null) {
            return point.y;
        }
        Point point2 = new Point();
        this.f35386b.getSize(point2);
        return point2.y;
    }
}
