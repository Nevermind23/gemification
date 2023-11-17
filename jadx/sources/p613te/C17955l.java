package p613te;

import java.net.InetAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import p613te.C17952j;

/* renamed from: te.l */
public class C17955l extends SSLSocketFactory {

    /* renamed from: b */
    private static final String f51145b = C17952j.m61850c(C17955l.class);

    /* renamed from: c */
    public static int f51146c = 86;

    /* renamed from: d */
    public static int f51147d = 92;

    /* renamed from: e */
    public static int f51148e = 1;

    /* renamed from: f */
    public static int f51149f = 2;

    /* renamed from: a */
    private SSLSocketFactory f51150a;

    static {
        int i = f51146c;
        if (((f51148e + i) * i) % f51149f != m61872d()) {
        }
    }

    public C17955l() {
        try {
            SSLContext instance = SSLContext.getInstance(C17931a.m61772g("\u000b\u0002\b", 8, 189, 1));
            instance.init((KeyManager[]) null, (TrustManager[]) null, (SecureRandom) null);
            this.f51150a = instance.getSocketFactory();
        } catch (GeneralSecurityException unused) {
            C17952j.C17953a.m61861f(f51145b, C17931a.m61772g("Lsnpbk\u001fhbu#rt&[T\\", 1, 'w', 3));
        }
    }

    /* renamed from: a */
    private Socket m61869a(Socket socket) {
        if (socket instanceof SSLSocket) {
            int i = 3;
            try {
                ((SSLSocket) socket).setEnabledProtocols(new String[]{C17931a.m61772g("1*2V\u0012\u0010\u0015", 215, '{', 0)});
                try {
                    throw null;
                } catch (Exception unused) {
                    f51146c = 47;
                    while (true) {
                        try {
                            int[] iArr = new int[-1];
                        } catch (Exception unused2) {
                            f51146c = 62;
                            while (true) {
                                try {
                                    i /= 0;
                                } catch (Exception unused3) {
                                    f51146c = m61870b();
                                }
                            }
                        }
                    }
                }
            } catch (IllegalArgumentException unused4) {
                C17952j.C17953a.m61856a(f51145b, C17931a.m61768c("cZ`\u0003<8:4'ZQWy3/2\u001f_oa\u001bhhl\u0017ijdcacdTR", 249, 3));
                return socket;
            }
        }
        return socket;
    }

    /* renamed from: b */
    public static int m61870b() {
        return 50;
    }

    /* renamed from: c */
    public static int m61871c() {
        return 2;
    }

    /* renamed from: d */
    public static int m61872d() {
        return 0;
    }

    public Socket createSocket(String str, int i) {
        SSLSocketFactory sSLSocketFactory = this.f51150a;
        int i2 = f51146c;
        if (((f51148e + i2) * i2) % f51149f != f51147d) {
            f51146c = 54;
            f51147d = 70;
        }
        return m61869a(sSLSocketFactory.createSocket(str, i));
    }

    public String[] getDefaultCipherSuites() {
        return this.f51150a.getDefaultCipherSuites();
    }

    public String[] getSupportedCipherSuites() {
        int i = f51146c;
        if (((f51148e + i) * i) % m61871c() != f51147d) {
            f51146c = 41;
            f51147d = 41;
        }
        return this.f51150a.getSupportedCipherSuites();
    }

    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        int i3 = f51146c;
        if (((f51148e + i3) * i3) % f51149f != m61872d()) {
            f51146c = 57;
            f51147d = m61870b();
        }
        return m61869a(this.f51150a.createSocket(str, i, inetAddress, i2));
    }

    public Socket createSocket(InetAddress inetAddress, int i) {
        Socket a = m61869a(this.f51150a.createSocket(inetAddress, i));
        int i2 = f51146c;
        if (((f51148e + i2) * i2) % f51149f != f51147d) {
            f51146c = m61870b();
            f51147d = 7;
        }
        return a;
    }

    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        Socket createSocket = this.f51150a.createSocket(inetAddress, i, inetAddress2, i2);
        int b = m61870b();
        if ((b * (f51148e + b)) % m61871c() != 0) {
            f51146c = m61870b();
            f51147d = 34;
        }
        return m61869a(createSocket);
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        SSLSocketFactory sSLSocketFactory = this.f51150a;
        int i2 = f51146c;
        if (((f51148e + i2) * i2) % f51149f != f51147d) {
            f51146c = m61870b();
            f51147d = 69;
        }
        return m61869a(sSLSocketFactory.createSocket(socket, str, i, z));
    }
}
