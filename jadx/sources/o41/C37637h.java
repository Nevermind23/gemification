package o41;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import java.net.InetAddress;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: o41.h */
public final class C37637h {

    /* renamed from: b */
    public static final C37638a f90401b = new C37638a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final Context f90402a;

    /* renamed from: o41.h$a */
    public static final class C37638a {
        private C37638a() {
        }

        public /* synthetic */ C37638a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C37637h(Context context) {
        C41536l.m120489i(context, "context");
        this.f90402a = context;
    }

    /* renamed from: a */
    public final String mo90815a() {
        List<LinkAddress> list;
        T t;
        InetAddress address;
        Object systemService = this.f90402a.getSystemService("connectivity");
        C41536l.m120487g(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        LinkProperties linkProperties = connectivityManager.getLinkProperties(connectivityManager.getActiveNetwork());
        String str = null;
        if (linkProperties != null) {
            list = linkProperties.getLinkAddresses();
        } else {
            list = null;
        }
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                String hostAddress = ((LinkAddress) t).getAddress().getHostAddress();
                boolean z = false;
                if (hostAddress != null) {
                    C41536l.m120488h(hostAddress, "hostAddress");
                    z = C40440x.m117137L(hostAddress, '.', false, 2, (Object) null);
                    continue;
                }
                if (z) {
                    break;
                }
            }
            LinkAddress linkAddress = (LinkAddress) t;
            if (!(linkAddress == null || (address = linkAddress.getAddress()) == null)) {
                str = address.getHostAddress();
            }
        }
        if (str == null) {
            return "127.0.0.1";
        }
        return str;
    }
}
