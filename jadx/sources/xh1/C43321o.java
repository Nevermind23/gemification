package xh1;

import com.salesforce.marketingcloud.C11398b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: xh1.o */
public enum C43321o {
    UNKNOWN(0),
    ETHERNET(1),
    WIFI(2),
    CELLULAR(4),
    VPN(8),
    LOOPBACK(16),
    ADAPTER_TYPE_ANY(32),
    CELLULAR_2G(64),
    CELLULAR_3G(128),
    CELLULAR_4G(Integer.valueOf(C11398b.f33139r)),
    CELLULAR_5G(Integer.valueOf(C11398b.f33140s));
    

    /* renamed from: p */
    private static final Map f101103p = null;

    /* renamed from: d */
    public final Integer f101105d;

    static {
        int i;
        f101103p = new HashMap();
        for (C43321o oVar : values()) {
            f101103p.put(oVar.f101105d, oVar);
        }
    }

    private C43321o(Integer num) {
        this.f101105d = num;
    }
}
