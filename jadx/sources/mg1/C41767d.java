package mg1;

import com.facetec.sdk.FaceTecSDK;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import og1.C41947a;
import org.java_websocket.exceptions.IncompleteHandshakeException;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.exceptions.InvalidHandshakeException;
import org.java_websocket.exceptions.LimitExceededException;
import org.java_websocket.exceptions.WebsocketNotConnectedException;
import pg1.C42198a;
import pg1.C42199b;
import pg1.C42201d;
import pg1.C42202e;
import rg1.C42378f;
import rg1.C42381h;
import sg1.C42567a;
import sg1.C42568b;
import sg1.C42572f;
import sg1.C42574h;
import ug1.C43104c;
import vh1.C43168a;
import vh1.C43169b;

/* renamed from: mg1.d */
public class C41767d implements C41765b {

    /* renamed from: d */
    private final C43168a f98055d = C43169b.m123832i(C41767d.class);

    /* renamed from: e */
    public final BlockingQueue f98056e;

    /* renamed from: f */
    public final BlockingQueue f98057f;

    /* renamed from: g */
    private final C41768e f98058g;

    /* renamed from: h */
    private SelectionKey f98059h;

    /* renamed from: i */
    private ByteChannel f98060i;

    /* renamed from: j */
    private boolean f98061j = false;

    /* renamed from: k */
    private volatile C42201d f98062k = C42201d.NOT_YET_CONNECTED;

    /* renamed from: l */
    private List f98063l;

    /* renamed from: m */
    private C41947a f98064m = null;

    /* renamed from: n */
    private C42202e f98065n;

    /* renamed from: o */
    private ByteBuffer f98066o = ByteBuffer.allocate(0);

    /* renamed from: p */
    private C42567a f98067p = null;

    /* renamed from: q */
    private String f98068q = null;

    /* renamed from: r */
    private Integer f98069r = null;

    /* renamed from: s */
    private Boolean f98070s = null;

    /* renamed from: t */
    private String f98071t = null;

    /* renamed from: u */
    private long f98072u = System.nanoTime();

    /* renamed from: v */
    private final Object f98073v = new Object();

    public C41767d(C41768e eVar, C41947a aVar) {
        if (eVar == null || (aVar == null && this.f98065n == C42202e.SERVER)) {
            throw new IllegalArgumentException("parameters must not be null");
        }
        this.f98056e = new LinkedBlockingQueue();
        this.f98057f = new LinkedBlockingQueue();
        this.f98058g = eVar;
        this.f98065n = C42202e.CLIENT;
        if (aVar != null) {
            this.f98064m = aVar.mo97129e();
        }
    }

    /* renamed from: C */
    private void m121076C(ByteBuffer byteBuffer) {
        String str;
        C43168a aVar = this.f98055d;
        Integer valueOf = Integer.valueOf(byteBuffer.remaining());
        if (byteBuffer.remaining() > 1000) {
            str = "too big to display";
        } else {
            str = new String(byteBuffer.array());
        }
        aVar.mo97514c("write({}): {}", valueOf, str);
        this.f98056e.add(byteBuffer);
        this.f98058g.mo96586g(this);
    }

    /* renamed from: D */
    private void m121077D(List list) {
        synchronized (this.f98073v) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                m121076C((ByteBuffer) it.next());
            }
        }
    }

    /* renamed from: h */
    private void m121078h(RuntimeException runtimeException) {
        m121076C(m121082p(500));
        mo96573o(-1, runtimeException.getMessage(), false);
    }

    /* renamed from: i */
    private void m121079i(InvalidDataException invalidDataException) {
        m121076C(m121082p(404));
        mo96573o(invalidDataException.mo97333a(), invalidDataException.getMessage(), false);
    }

    /* renamed from: k */
    private void m121080k(ByteBuffer byteBuffer) {
        try {
            for (C42378f fVar : this.f98064m.mo97141s(byteBuffer)) {
                this.f98055d.mo97517f("matched frame: {}", fVar);
                this.f98064m.mo97137m(this, fVar);
            }
        } catch (LimitExceededException e) {
            if (e.mo97334b() == Integer.MAX_VALUE) {
                this.f98055d.mo97512a("Closing due to invalid size of frame", e);
                this.f98058g.mo96584b(this, e);
            }
            mo96567d(e);
        } catch (InvalidDataException e2) {
            this.f98055d.mo97512a("Closing due to invalid data in frame", e2);
            this.f98058g.mo96584b(this, e2);
            mo96567d(e2);
        } catch (LinkageError | ThreadDeath | VirtualMachineError e3) {
            this.f98055d.mo97513b("Got fatal error during frame processing");
            throw e3;
        } catch (Error e4) {
            this.f98055d.mo97513b("Closing web socket due to an error during frame processing");
            this.f98058g.mo96584b(this, new Exception(e4));
            mo96565b(1011, "Got error " + e4.getClass().getName());
        }
    }

    /* renamed from: l */
    private boolean m121081l(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        if (this.f98066o.capacity() == 0) {
            byteBuffer2 = byteBuffer;
        } else {
            if (this.f98066o.remaining() < byteBuffer.remaining()) {
                ByteBuffer allocate = ByteBuffer.allocate(this.f98066o.capacity() + byteBuffer.remaining());
                this.f98066o.flip();
                allocate.put(this.f98066o);
                this.f98066o = allocate;
            }
            this.f98066o.put(byteBuffer);
            this.f98066o.flip();
            byteBuffer2 = this.f98066o;
        }
        byteBuffer2.mark();
        try {
            C42202e eVar = this.f98065n;
            if (eVar == C42202e.SERVER) {
                C41947a aVar = this.f98064m;
                if (aVar == null) {
                    for (C41947a e : this.f98063l) {
                        C41947a e2 = e.mo97129e();
                        try {
                            e2.mo97140r(this.f98065n);
                            byteBuffer2.reset();
                            C42572f t = e2.mo97142t(byteBuffer2);
                            if (!(t instanceof C42567a)) {
                                this.f98055d.mo97518g("Closing due to wrong handshake");
                                m121079i(new InvalidDataException((int) FaceTecSDK.REQUEST_CODE_SESSION, "wrong http function"));
                                return false;
                            }
                            C42567a aVar2 = (C42567a) t;
                            if (e2.mo97126b(aVar2) == C42199b.MATCHED) {
                                this.f98071t = aVar2.mo98021d();
                                try {
                                    m121077D(e2.mo97132h(e2.mo97136l(aVar2, this.f98058g.mo96560j(this, e2, aVar2))));
                                    this.f98064m = e2;
                                    m121083w(aVar2);
                                    return true;
                                } catch (InvalidDataException e3) {
                                    this.f98055d.mo97516e("Closing due to wrong handshake. Possible handshake rejection", e3);
                                    m121079i(e3);
                                    return false;
                                } catch (RuntimeException e4) {
                                    this.f98055d.mo97512a("Closing due to internal server error", e4);
                                    this.f98058g.mo96584b(this, e4);
                                    m121078h(e4);
                                    return false;
                                }
                            } else {
                                continue;
                            }
                        } catch (InvalidHandshakeException unused) {
                        }
                    }
                    if (this.f98064m == null) {
                        this.f98055d.mo97518g("Closing due to protocol error: no draft matches");
                        m121079i(new InvalidDataException((int) FaceTecSDK.REQUEST_CODE_SESSION, "no draft matches"));
                    }
                    return false;
                }
                C42572f t2 = aVar.mo97142t(byteBuffer2);
                if (!(t2 instanceof C42567a)) {
                    this.f98055d.mo97518g("Closing due to protocol error: wrong http function");
                    mo96573o(FaceTecSDK.REQUEST_CODE_SESSION, "wrong http function", false);
                    return false;
                }
                C42567a aVar3 = (C42567a) t2;
                if (this.f98064m.mo97126b(aVar3) == C42199b.MATCHED) {
                    m121083w(aVar3);
                    return true;
                }
                this.f98055d.mo97518g("Closing due to protocol error: the handshake did finally not match");
                mo96565b(FaceTecSDK.REQUEST_CODE_SESSION, "the handshake did finally not match");
                return false;
            }
            if (eVar == C42202e.CLIENT) {
                this.f98064m.mo97140r(eVar);
                C42572f t3 = this.f98064m.mo97142t(byteBuffer2);
                if (!(t3 instanceof C42574h)) {
                    this.f98055d.mo97518g("Closing due to protocol error: wrong http function");
                    mo96573o(FaceTecSDK.REQUEST_CODE_SESSION, "wrong http function", false);
                    return false;
                }
                C42574h hVar = (C42574h) t3;
                if (this.f98064m.mo97125a(this.f98067p, hVar) == C42199b.MATCHED) {
                    try {
                        this.f98058g.mo96561l(this, this.f98067p, hVar);
                        m121083w(hVar);
                        return true;
                    } catch (InvalidDataException e5) {
                        this.f98055d.mo97516e("Closing due to invalid data exception. Possible handshake rejection", e5);
                        mo96573o(e5.mo97333a(), e5.getMessage(), false);
                        return false;
                    } catch (RuntimeException e6) {
                        this.f98055d.mo97512a("Closing since client was never connected", e6);
                        this.f98058g.mo96584b(this, e6);
                        mo96573o(-1, e6.getMessage(), false);
                        return false;
                    }
                } else {
                    this.f98055d.mo97517f("Closing due to protocol error: draft {} refuses handshake", this.f98064m);
                    mo96565b(FaceTecSDK.REQUEST_CODE_SESSION, "draft " + this.f98064m + " refuses handshake");
                }
            }
            return false;
        } catch (InvalidHandshakeException e7) {
            try {
                this.f98055d.mo97516e("Closing due to invalid handshake", e7);
                mo96567d(e7);
            } catch (IncompleteHandshakeException e8) {
                if (this.f98066o.capacity() == 0) {
                    byteBuffer2.reset();
                    int a = e8.mo97332a();
                    if (a == 0) {
                        a = byteBuffer2.capacity() + 16;
                    }
                    ByteBuffer allocate2 = ByteBuffer.allocate(a);
                    this.f98066o = allocate2;
                    allocate2.put(byteBuffer);
                } else {
                    ByteBuffer byteBuffer3 = this.f98066o;
                    byteBuffer3.position(byteBuffer3.limit());
                    ByteBuffer byteBuffer4 = this.f98066o;
                    byteBuffer4.limit(byteBuffer4.capacity());
                }
            }
        }
    }

    /* renamed from: p */
    private ByteBuffer m121082p(int i) {
        String str;
        if (i != 404) {
            str = "500 Internal Server Error";
        } else {
            str = "404 WebSocket Upgrade Failure";
        }
        return ByteBuffer.wrap(C43104c.m123690a("HTTP/1.1 " + str + "\r\nContent-Type: text/html\r\nServer: TooTallNate Java-WebSocket\r\nContent-Length: " + (str.length() + 48) + "\r\n\r\n<html><head></head><body><h1>" + str + "</h1></body></html>"));
    }

    /* renamed from: w */
    private void m121083w(C42572f fVar) {
        this.f98055d.mo97517f("open using draft: {}", this.f98064m);
        this.f98062k = C42201d.OPEN;
        mo96563B();
        try {
            this.f98058g.mo96590o(this, fVar);
        } catch (RuntimeException e) {
            this.f98058g.mo96584b(this, e);
        }
    }

    /* renamed from: y */
    private void m121084y(Collection collection) {
        if (!mo96580v()) {
            throw new WebsocketNotConnectedException();
        } else if (collection != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                C42378f fVar = (C42378f) it.next();
                this.f98055d.mo97517f("send frame: {}", fVar);
                arrayList.add(this.f98064m.mo97130f(fVar));
            }
            m121077D(arrayList);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: A */
    public void mo96562A(C42568b bVar) {
        this.f98067p = this.f98064m.mo97135k(bVar);
        this.f98071t = bVar.mo98021d();
        try {
            this.f98058g.mo96557e(this, this.f98067p);
            m121077D(this.f98064m.mo97132h(this.f98067p));
        } catch (InvalidDataException unused) {
            throw new InvalidHandshakeException("Handshake data rejected by client.");
        } catch (RuntimeException e) {
            this.f98055d.mo97512a("Exception in startHandshake", e);
            this.f98058g.mo96584b(this, e);
            throw new InvalidHandshakeException("rejected because of " + e);
        }
    }

    /* renamed from: B */
    public void mo96563B() {
        this.f98072u = System.nanoTime();
    }

    /* renamed from: a */
    public void mo96564a(int i) {
        mo96566c(i, "", false);
    }

    /* renamed from: b */
    public void mo96565b(int i, String str) {
        mo96566c(i, str, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0083, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo96566c(int r6, java.lang.String r7, boolean r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            pg1.d r0 = r5.f98062k     // Catch:{ all -> 0x0084 }
            pg1.d r1 = pg1.C42201d.CLOSING     // Catch:{ all -> 0x0084 }
            if (r0 == r1) goto L_0x0082
            pg1.d r0 = r5.f98062k     // Catch:{ all -> 0x0084 }
            pg1.d r2 = pg1.C42201d.f99290g     // Catch:{ all -> 0x0084 }
            if (r0 == r2) goto L_0x0082
            pg1.d r0 = r5.f98062k     // Catch:{ all -> 0x0084 }
            pg1.d r2 = pg1.C42201d.OPEN     // Catch:{ all -> 0x0084 }
            r3 = 0
            if (r0 != r2) goto L_0x0065
            r0 = 1006(0x3ee, float:1.41E-42)
            if (r6 != r0) goto L_0x001f
            r5.f98062k = r1     // Catch:{ all -> 0x0084 }
            r5.mo96573o(r6, r7, r3)     // Catch:{ all -> 0x0084 }
            monitor-exit(r5)
            return
        L_0x001f:
            og1.a r1 = r5.f98064m     // Catch:{ all -> 0x0084 }
            pg1.a r1 = r1.mo97134j()     // Catch:{ all -> 0x0084 }
            pg1.a r2 = pg1.C42198a.NONE     // Catch:{ all -> 0x0084 }
            if (r1 == r2) goto L_0x0061
            if (r8 != 0) goto L_0x0037
            mg1.e r1 = r5.f98058g     // Catch:{ RuntimeException -> 0x0031 }
            r1.mo96583a(r5, r6, r7)     // Catch:{ RuntimeException -> 0x0031 }
            goto L_0x0037
        L_0x0031:
            r1 = move-exception
            mg1.e r2 = r5.f98058g     // Catch:{ InvalidDataException -> 0x004f }
            r2.mo96584b(r5, r1)     // Catch:{ InvalidDataException -> 0x004f }
        L_0x0037:
            boolean r1 = r5.mo96580v()     // Catch:{ InvalidDataException -> 0x004f }
            if (r1 == 0) goto L_0x0061
            rg1.b r1 = new rg1.b     // Catch:{ InvalidDataException -> 0x004f }
            r1.<init>()     // Catch:{ InvalidDataException -> 0x004f }
            r1.mo97831r(r7)     // Catch:{ InvalidDataException -> 0x004f }
            r1.mo97830q(r6)     // Catch:{ InvalidDataException -> 0x004f }
            r1.mo97825h()     // Catch:{ InvalidDataException -> 0x004f }
            r5.mo96555m(r1)     // Catch:{ InvalidDataException -> 0x004f }
            goto L_0x0061
        L_0x004f:
            r1 = move-exception
            vh1.a r2 = r5.f98055d     // Catch:{ all -> 0x0084 }
            java.lang.String r4 = "generated frame is invalid"
            r2.mo97512a(r4, r1)     // Catch:{ all -> 0x0084 }
            mg1.e r2 = r5.f98058g     // Catch:{ all -> 0x0084 }
            r2.mo96584b(r5, r1)     // Catch:{ all -> 0x0084 }
            java.lang.String r1 = "generated frame is invalid"
            r5.mo96573o(r0, r1, r3)     // Catch:{ all -> 0x0084 }
        L_0x0061:
            r5.mo96573o(r6, r7, r8)     // Catch:{ all -> 0x0084 }
            goto L_0x0079
        L_0x0065:
            r0 = -3
            if (r6 != r0) goto L_0x006d
            r6 = 1
            r5.mo96573o(r0, r7, r6)     // Catch:{ all -> 0x0084 }
            goto L_0x0079
        L_0x006d:
            r0 = 1002(0x3ea, float:1.404E-42)
            if (r6 != r0) goto L_0x0075
            r5.mo96573o(r6, r7, r8)     // Catch:{ all -> 0x0084 }
            goto L_0x0079
        L_0x0075:
            r6 = -1
            r5.mo96573o(r6, r7, r3)     // Catch:{ all -> 0x0084 }
        L_0x0079:
            pg1.d r6 = pg1.C42201d.CLOSING     // Catch:{ all -> 0x0084 }
            r5.f98062k = r6     // Catch:{ all -> 0x0084 }
            r6 = 0
            r5.f98066o = r6     // Catch:{ all -> 0x0084 }
            monitor-exit(r5)
            return
        L_0x0082:
            monitor-exit(r5)
            return
        L_0x0084:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mg1.C41767d.mo96566c(int, java.lang.String, boolean):void");
    }

    /* renamed from: d */
    public void mo96567d(InvalidDataException invalidDataException) {
        mo96566c(invalidDataException.mo97333a(), invalidDataException.getMessage(), false);
    }

    /* renamed from: e */
    public void mo96568e(int i, String str) {
        mo96569f(i, str, false);
    }

    /* renamed from: f */
    public synchronized void mo96569f(int i, String str, boolean z) {
        if (this.f98062k != C42201d.f99290g) {
            if (this.f98062k == C42201d.OPEN && i == 1006) {
                this.f98062k = C42201d.CLOSING;
            }
            SelectionKey selectionKey = this.f98059h;
            if (selectionKey != null) {
                selectionKey.cancel();
            }
            ByteChannel byteChannel = this.f98060i;
            if (byteChannel != null) {
                try {
                    byteChannel.close();
                } catch (IOException e) {
                    if (e.getMessage() == null || !e.getMessage().equals("Broken pipe")) {
                        this.f98055d.mo97512a("Exception during channel.close()", e);
                        this.f98058g.mo96584b(this, e);
                    } else {
                        this.f98055d.mo97516e("Caught IOException: Broken pipe during closeConnection()", e);
                    }
                }
            }
            try {
                this.f98058g.mo96588k(this, i, str, z);
            } catch (RuntimeException e2) {
                this.f98058g.mo96584b(this, e2);
            }
            C41947a aVar = this.f98064m;
            if (aVar != null) {
                aVar.mo97139q();
            }
            this.f98067p = null;
            this.f98062k = C42201d.f99290g;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo96570g(int i, boolean z) {
        mo96569f(i, "", z);
    }

    /* renamed from: j */
    public void mo96571j(ByteBuffer byteBuffer) {
        String str;
        C43168a aVar = this.f98055d;
        Integer valueOf = Integer.valueOf(byteBuffer.remaining());
        if (byteBuffer.remaining() > 1000) {
            str = "too big to display";
        } else {
            str = new String(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining());
        }
        aVar.mo97514c("process({}): ({})", valueOf, str);
        if (this.f98062k != C42201d.NOT_YET_CONNECTED) {
            if (this.f98062k == C42201d.OPEN) {
                m121080k(byteBuffer);
            }
        } else if (m121081l(byteBuffer) && !mo96579u() && !mo96577t()) {
            if (byteBuffer.hasRemaining()) {
                m121080k(byteBuffer);
            } else if (this.f98066o.hasRemaining()) {
                m121080k(this.f98066o);
            }
        }
    }

    /* renamed from: m */
    public void mo96555m(C42378f fVar) {
        m121084y(Collections.singletonList(fVar));
    }

    /* renamed from: n */
    public void mo96572n() {
        if (this.f98062k == C42201d.NOT_YET_CONNECTED) {
            mo96570g(-1, true);
        } else if (this.f98061j) {
            mo96569f(this.f98069r.intValue(), this.f98068q, this.f98070s.booleanValue());
        } else if (this.f98064m.mo97134j() == C42198a.NONE) {
            mo96570g(1000, true);
        } else if (this.f98064m.mo97134j() != C42198a.ONEWAY) {
            mo96570g(1006, true);
        } else if (this.f98065n == C42202e.SERVER) {
            mo96570g(1006, true);
        } else {
            mo96570g(1000, true);
        }
    }

    /* renamed from: o */
    public synchronized void mo96573o(int i, String str, boolean z) {
        if (!this.f98061j) {
            this.f98069r = Integer.valueOf(i);
            this.f98068q = str;
            this.f98070s = Boolean.valueOf(z);
            this.f98061j = true;
            this.f98058g.mo96586g(this);
            try {
                this.f98058g.mo96585d(this, i, str, z);
            } catch (RuntimeException e) {
                this.f98055d.mo97512a("Exception in onWebsocketClosing", e);
                this.f98058g.mo96584b(this, e);
            }
            C41947a aVar = this.f98064m;
            if (aVar != null) {
                aVar.mo97139q();
            }
            this.f98067p = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public long mo96574q() {
        return this.f98072u;
    }

    /* renamed from: r */
    public C42201d mo96575r() {
        return this.f98062k;
    }

    /* renamed from: s */
    public C41768e mo96576s() {
        return this.f98058g;
    }

    /* renamed from: t */
    public boolean mo96577t() {
        return this.f98062k == C42201d.f99290g;
    }

    public String toString() {
        return super.toString();
    }

    /* renamed from: u */
    public boolean mo96579u() {
        return this.f98062k == C42201d.CLOSING;
    }

    /* renamed from: v */
    public boolean mo96580v() {
        return this.f98062k == C42201d.OPEN;
    }

    /* renamed from: x */
    public void mo96581x(String str) {
        boolean z;
        if (str != null) {
            C41947a aVar = this.f98064m;
            if (this.f98065n == C42202e.CLIENT) {
                z = true;
            } else {
                z = false;
            }
            m121084y(aVar.mo97131g(str, z));
            return;
        }
        throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
    }

    /* renamed from: z */
    public void mo96582z() {
        C42381h c = this.f98058g.mo96556c(this);
        if (c != null) {
            mo96555m(c);
            return;
        }
        throw new NullPointerException("onPreparePing(WebSocket) returned null. PingFrame to sent can't be null.");
    }
}
