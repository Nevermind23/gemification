package p585re;

import android.location.Location;
import com.threatmetrix.TrustDefender.C11879b0;
import com.threatmetrix.TrustDefender.C11907h;
import java.lang.reflect.Method;

/* renamed from: re.p */
public abstract class C17599p extends C11879b0 {

    /* renamed from: b */
    private static final Method f49308b;

    /* renamed from: c */
    private static final Method f49309c;

    /* renamed from: d */
    private static final String f49310d = C11907h.m43615j(C17599p.class);

    static {
        Class<Location> cls = Location.class;
        f49308b = C11879b0.m43538j(cls, "isFromMockProvider", new Class[0]);
        f49309c = C11879b0.m43538j(cls, "isMock", new Class[0]);
    }

    /* renamed from: k */
    public static boolean m61215k(Location location) {
        if (location == null) {
            C11907h.m43622q(f49310d, "Null context");
            return false;
        }
        Boolean bool = (Boolean) C11879b0.m43529a(location, f49308b, new Object[0]);
        Boolean bool2 = (Boolean) C11879b0.m43529a(location, f49309c, new Object[0]);
        return (bool2 != null ? bool2.booleanValue() : false) || (bool != null ? bool.booleanValue() : false);
    }
}
