package ng1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;
import javax.net.SocketFactory;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import mg1.C41763a;
import mg1.C41765b;
import mg1.C41767d;
import og1.C41947a;
import og1.C41948b;
import rg1.C42378f;
import sg1.C42570d;
import sg1.C42572f;
import sg1.C42574h;

/* renamed from: ng1.c */
public abstract class C41803c extends C41763a implements Runnable, C41765b {

    /* renamed from: m */
    protected URI f98127m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C41767d f98128n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public Socket f98129o;

    /* renamed from: p */
    private SocketFactory f98130p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public OutputStream f98131q;

    /* renamed from: r */
    private Proxy f98132r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public Thread f98133s;

    /* renamed from: t */
    private Thread f98134t;

    /* renamed from: u */
    private C41947a f98135u;

    /* renamed from: v */
    private Map f98136v;

    /* renamed from: w */
    private CountDownLatch f98137w;

    /* renamed from: x */
    private CountDownLatch f98138x;

    /* renamed from: y */
    private int f98139y;

    /* renamed from: z */
    private C41801a f98140z;

    /* renamed from: ng1.c$a */
    class C41804a implements C41801a {
        C41804a() {
        }

        /* renamed from: a */
        public InetAddress mo96618a(URI uri) {
            return InetAddress.getByName(uri.getHost());
        }
    }

    /* renamed from: ng1.c$b */
    private class C41805b implements Runnable {

        /* renamed from: d */
        private final C41803c f98142d;

        C41805b(C41803c cVar) {
            this.f98142d = cVar;
        }

        /* renamed from: a */
        private void m121200a() {
            try {
                if (C41803c.this.f98129o != null) {
                    C41803c.this.f98129o.close();
                }
            } catch (IOException e) {
                C41803c.this.mo96584b(this.f98142d, e);
            }
        }

        /* renamed from: b */
        private void m121201b() {
            while (!Thread.interrupted()) {
                try {
                    ByteBuffer byteBuffer = (ByteBuffer) C41803c.this.f98128n.f98056e.take();
                    C41803c.this.f98131q.write(byteBuffer.array(), 0, byteBuffer.limit());
                    C41803c.this.f98131q.flush();
                } catch (InterruptedException unused) {
                    for (ByteBuffer byteBuffer2 : C41803c.this.f98128n.f98056e) {
                        C41803c.this.f98131q.write(byteBuffer2.array(), 0, byteBuffer2.limit());
                        C41803c.this.f98131q.flush();
                    }
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }

        public void run() {
            Thread currentThread = Thread.currentThread();
            currentThread.setName("WebSocketWriteThread-" + Thread.currentThread().getId());
            try {
                m121201b();
            } catch (IOException e) {
                C41803c.this.m121172K(e);
            } catch (Throwable th) {
                m121200a();
                Thread unused = C41803c.this.f98133s = null;
                throw th;
            }
            m121200a();
            Thread unused2 = C41803c.this.f98133s = null;
        }
    }

    public C41803c(URI uri) {
        this(uri, new C41948b());
    }

    /* renamed from: J */
    private int m121171J() {
        int port = this.f98127m.getPort();
        String scheme = this.f98127m.getScheme();
        if ("wss".equals(scheme)) {
            if (port == -1) {
                return 443;
            }
            return port;
        } else if (!"ws".equals(scheme)) {
            throw new IllegalArgumentException("unknown scheme: " + scheme);
        } else if (port == -1) {
            return 80;
        } else {
            return port;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public void m121172K(IOException iOException) {
        if (iOException instanceof SSLException) {
            mo26277Q(iOException);
        }
        this.f98128n.mo96572n();
    }

    /* renamed from: V */
    private boolean m121173V() {
        if (this.f98132r != Proxy.NO_PROXY) {
            this.f98129o = new Socket(this.f98132r);
            return true;
        }
        SocketFactory socketFactory = this.f98130p;
        if (socketFactory != null) {
            this.f98129o = socketFactory.createSocket();
        } else {
            Socket socket = this.f98129o;
            if (socket == null) {
                this.f98129o = new Socket(this.f98132r);
                return true;
            } else if (socket.isClosed()) {
                throw new IOException();
            }
        }
        return false;
    }

    /* renamed from: X */
    private void m121174X() {
        String str;
        String rawPath = this.f98127m.getRawPath();
        String rawQuery = this.f98127m.getRawQuery();
        if (rawPath == null || rawPath.length() == 0) {
            rawPath = C11110u2.f31950c;
        }
        if (rawQuery != null) {
            rawPath = rawPath + '?' + rawQuery;
        }
        int J = m121171J();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f98127m.getHost());
        if (J == 80 || J == 443) {
            str = "";
        } else {
            str = ":" + J;
        }
        sb.append(str);
        String sb2 = sb.toString();
        C42570d dVar = new C42570d();
        dVar.mo98022h(rawPath);
        dVar.mo98023a("Host", sb2);
        Map map = this.f98136v;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                dVar.mo98023a((String) entry.getKey(), (String) entry.getValue());
            }
        }
        this.f98128n.mo96562A(dVar);
    }

    /* renamed from: Y */
    private void m121175Y() {
        SSLSocketFactory sSLSocketFactory;
        SocketFactory socketFactory = this.f98130p;
        if (socketFactory instanceof SSLSocketFactory) {
            sSLSocketFactory = (SSLSocketFactory) socketFactory;
        } else {
            SSLContext instance = SSLContext.getInstance("TLSv1.2");
            instance.init((KeyManager[]) null, (TrustManager[]) null, (SecureRandom) null);
            sSLSocketFactory = instance.getSocketFactory();
        }
        this.f98129o = sSLSocketFactory.createSocket(this.f98129o, this.f98127m.getHost(), m121171J(), true);
    }

    /* renamed from: H */
    public void mo96619H() {
        if (this.f98133s != null) {
            this.f98128n.mo96564a(1000);
        }
    }

    /* renamed from: I */
    public void mo96620I() {
        if (this.f98134t == null) {
            Thread thread = new Thread(this);
            this.f98134t = thread;
            thread.setName("WebSocketConnectReadThread-" + this.f98134t.getId());
            this.f98134t.start();
            return;
        }
        throw new IllegalStateException("WebSocketClient objects are not reuseable");
    }

    /* renamed from: L */
    public boolean mo96621L() {
        return this.f98128n.mo96577t();
    }

    /* renamed from: M */
    public boolean mo96622M() {
        return this.f98128n.mo96579u();
    }

    /* renamed from: N */
    public abstract void mo26276N(int i, String str, boolean z);

    /* renamed from: O */
    public void mo96623O(int i, String str) {
    }

    /* renamed from: P */
    public void mo96624P(int i, String str, boolean z) {
    }

    /* renamed from: Q */
    public abstract void mo26277Q(Exception exc);

    /* renamed from: R */
    public abstract void mo26278R(String str);

    /* renamed from: S */
    public void mo96625S(ByteBuffer byteBuffer) {
    }

    /* renamed from: T */
    public abstract void mo26279T(C42574h hVar);

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public void mo96626U(SSLParameters sSLParameters) {
        sSLParameters.setEndpointIdentificationAlgorithm("HTTPS");
    }

    /* renamed from: W */
    public void mo96627W(String str) {
        this.f98128n.mo96581x(str);
    }

    /* renamed from: a */
    public void mo96583a(C41765b bVar, int i, String str) {
        mo96623O(i, str);
    }

    /* renamed from: b */
    public final void mo96584b(C41765b bVar, Exception exc) {
        mo26277Q(exc);
    }

    /* renamed from: d */
    public void mo96585d(C41765b bVar, int i, String str, boolean z) {
        mo96624P(i, str, z);
    }

    /* renamed from: g */
    public final void mo96586g(C41765b bVar) {
    }

    /* renamed from: h */
    public final void mo96587h(C41765b bVar, ByteBuffer byteBuffer) {
        mo96625S(byteBuffer);
    }

    /* renamed from: k */
    public final void mo96588k(C41765b bVar, int i, String str, boolean z) {
        mo96548B();
        Thread thread = this.f98133s;
        if (thread != null) {
            thread.interrupt();
        }
        mo26276N(i, str, z);
        this.f98137w.countDown();
        this.f98138x.countDown();
    }

    /* renamed from: m */
    public void mo96555m(C42378f fVar) {
        this.f98128n.mo96555m(fVar);
    }

    /* renamed from: n */
    public final void mo96589n(C41765b bVar, String str) {
        mo26278R(str);
    }

    /* renamed from: o */
    public final void mo96590o(C41765b bVar, C42572f fVar) {
        mo96547A();
        mo26279T((C42574h) fVar);
        this.f98137w.countDown();
    }

    public void run() {
        int read;
        InetSocketAddress inetSocketAddress;
        try {
            boolean V = m121173V();
            this.f98129o.setTcpNoDelay(mo96551w());
            this.f98129o.setReuseAddress(mo96550v());
            if (!this.f98129o.isConnected()) {
                if (this.f98140z == null) {
                    inetSocketAddress = InetSocketAddress.createUnresolved(this.f98127m.getHost(), m121171J());
                } else {
                    inetSocketAddress = new InetSocketAddress(this.f98140z.mo96618a(this.f98127m), m121171J());
                }
                this.f98129o.connect(inetSocketAddress, this.f98139y);
            }
            if (V && "wss".equals(this.f98127m.getScheme())) {
                m121175Y();
            }
            Socket socket = this.f98129o;
            if (socket instanceof SSLSocket) {
                SSLSocket sSLSocket = (SSLSocket) socket;
                SSLParameters sSLParameters = sSLSocket.getSSLParameters();
                mo96626U(sSLParameters);
                sSLSocket.setSSLParameters(sSLParameters);
            }
            InputStream inputStream = this.f98129o.getInputStream();
            this.f98131q = this.f98129o.getOutputStream();
            m121174X();
            Thread thread = new Thread(new C41805b(this));
            this.f98133s = thread;
            thread.start();
            byte[] bArr = new byte[16384];
            while (!mo96622M() && !mo96621L() && (read = inputStream.read(bArr)) != -1) {
                try {
                    this.f98128n.mo96571j(ByteBuffer.wrap(bArr, 0, read));
                } catch (IOException e) {
                    m121172K(e);
                } catch (RuntimeException e2) {
                    mo26277Q(e2);
                    this.f98128n.mo96568e(1006, e2.getMessage());
                }
            }
            this.f98128n.mo96572n();
            this.f98134t = null;
        } catch (Exception e3) {
            mo96584b(this.f98128n, e3);
            this.f98128n.mo96568e(-1, e3.getMessage());
        } catch (InternalError e4) {
            if (!(e4.getCause() instanceof InvocationTargetException) || !(e4.getCause().getCause() instanceof IOException)) {
                throw e4;
            }
            IOException iOException = (IOException) e4.getCause().getCause();
            mo96584b(this.f98128n, iOException);
            this.f98128n.mo96568e(-1, iOException.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public Collection mo96549u() {
        return Collections.singletonList(this.f98128n);
    }

    public C41803c(URI uri, C41947a aVar) {
        this(uri, aVar, (Map) null, 0);
    }

    public C41803c(URI uri, C41947a aVar, Map map, int i) {
        this.f98127m = null;
        this.f98128n = null;
        this.f98129o = null;
        this.f98130p = null;
        this.f98132r = Proxy.NO_PROXY;
        this.f98137w = new CountDownLatch(1);
        this.f98138x = new CountDownLatch(1);
        this.f98139y = 0;
        this.f98140z = null;
        if (uri == null) {
            throw new IllegalArgumentException();
        } else if (aVar != null) {
            this.f98127m = uri;
            this.f98135u = aVar;
            this.f98140z = new C41804a();
            if (map != null) {
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                this.f98136v = treeMap;
                treeMap.putAll(map);
            }
            this.f98139y = i;
            mo96553z(false);
            mo96552y(false);
            this.f98128n = new C41767d(this, aVar);
        } else {
            throw new IllegalArgumentException("null as draft is permitted for `WebSocketServer` only!");
        }
    }
}
