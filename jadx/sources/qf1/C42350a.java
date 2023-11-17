package qf1;

import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import of1.C41863a;
import of1.C41866b;
import of1.C41869b0;
import of1.C41880d0;
import of1.C41889f0;
import of1.C41896h;
import of1.C41912o;
import of1.C41914q;
import of1.C41931v;

/* renamed from: qf1.a */
public final class C42350a implements C41866b {

    /* renamed from: d */
    private final C41914q f99572d;

    /* renamed from: qf1.a$a */
    public /* synthetic */ class C42351a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f99573a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            f99573a = iArr;
        }
    }

    public C42350a(C41914q qVar) {
        C41536l.m120489i(qVar, "defaultDns");
        this.f99572d = qVar;
    }

    /* renamed from: b */
    private final InetAddress m122826b(Proxy proxy, C41931v vVar, C41914q qVar) {
        int i;
        Proxy.Type type = proxy.type();
        if (type == null) {
            i = -1;
        } else {
            i = C42351a.f99573a[type.ordinal()];
        }
        if (i == 1) {
            return (InetAddress) C41358y.m120007W(qVar.mo96882a(vVar.mo96954i()));
        }
        SocketAddress address = proxy.address();
        if (address != null) {
            InetAddress address2 = ((InetSocketAddress) address).getAddress();
            C41536l.m120488h(address2, "address() as InetSocketAddress).address");
            return address2;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
    }

    /* renamed from: a */
    public C41869b0 mo91242a(C41889f0 f0Var, C41880d0 d0Var) {
        boolean z;
        Proxy proxy;
        C41914q qVar;
        PasswordAuthentication passwordAuthentication;
        String str;
        C41863a a;
        C41536l.m120489i(d0Var, "response");
        List<C41896h> o = d0Var.mo96746o();
        C41869b0 e0 = d0Var.mo96742e0();
        C41931v j = e0.mo96681j();
        if (d0Var.mo96747q() == 407) {
            z = true;
        } else {
            z = false;
        }
        if (f0Var == null) {
            proxy = null;
        } else {
            proxy = f0Var.mo96801b();
        }
        if (proxy == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (C41896h hVar : o) {
            if (C40439w.m117115s("Basic", hVar.mo96822c(), true)) {
                if (f0Var == null || (a = f0Var.mo96800a()) == null) {
                    qVar = null;
                } else {
                    qVar = a.mo96657c();
                }
                if (qVar == null) {
                    qVar = this.f99572d;
                }
                if (z) {
                    SocketAddress address = proxy.address();
                    if (address != null) {
                        InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                        String hostName = inetSocketAddress.getHostName();
                        C41536l.m120488h(proxy, "proxy");
                        passwordAuthentication = Authenticator.requestPasswordAuthentication(hostName, m122826b(proxy, j, qVar), inetSocketAddress.getPort(), j.mo96964t(), hVar.mo96821b(), hVar.mo96822c(), j.mo96967v(), Authenticator.RequestorType.PROXY);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
                    }
                } else {
                    String i = j.mo96954i();
                    C41536l.m120488h(proxy, "proxy");
                    passwordAuthentication = Authenticator.requestPasswordAuthentication(i, m122826b(proxy, j, qVar), j.mo96959o(), j.mo96964t(), hVar.mo96821b(), hVar.mo96822c(), j.mo96967v(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthentication != null) {
                    if (z) {
                        str = "Proxy-Authorization";
                    } else {
                        str = "Authorization";
                    }
                    String userName = passwordAuthentication.getUserName();
                    C41536l.m120488h(userName, "auth.userName");
                    char[] password = passwordAuthentication.getPassword();
                    C41536l.m120488h(password, "auth.password");
                    return e0.mo96679h().mo96691i(str, C41912o.m121535a(userName, new String(password), hVar.mo96820a())).mo96684b();
                }
            }
        }
        return null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C42350a(C41914q qVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C41914q.f98531b : qVar);
    }
}
