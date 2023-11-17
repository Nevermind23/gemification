package og1;

import com.facetec.sdk.FaceTecSDK;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import mg1.C41767d;
import org.java_websocket.exceptions.IncompleteHandshakeException;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.exceptions.InvalidHandshakeException;
import pg1.C42198a;
import pg1.C42199b;
import pg1.C42200c;
import pg1.C42202e;
import rg1.C42378f;
import sg1.C42567a;
import sg1.C42568b;
import sg1.C42569c;
import sg1.C42570d;
import sg1.C42571e;
import sg1.C42572f;
import sg1.C42574h;
import sg1.C42575i;
import ug1.C43104c;

/* renamed from: og1.a */
public abstract class C41947a {

    /* renamed from: a */
    protected C42202e f98661a = null;

    /* renamed from: b */
    protected C42200c f98662b = null;

    /* renamed from: n */
    public static ByteBuffer m121829n(ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        byte b = 48;
        while (byteBuffer.hasRemaining()) {
            byte b2 = byteBuffer.get();
            allocate.put(b2);
            if (b == 13 && b2 == 10) {
                allocate.limit(allocate.position() - 2);
                allocate.position(0);
                return allocate;
            }
            b = b2;
        }
        byteBuffer.position(byteBuffer.position() - allocate.position());
        return null;
    }

    /* renamed from: o */
    public static String m121830o(ByteBuffer byteBuffer) {
        ByteBuffer n = m121829n(byteBuffer);
        if (n == null) {
            return null;
        }
        return C43104c.m123693d(n.array(), 0, n.limit());
    }

    /* renamed from: u */
    public static C42569c m121831u(ByteBuffer byteBuffer, C42202e eVar) {
        C42569c cVar;
        String o = m121830o(byteBuffer);
        if (o != null) {
            String[] split = o.split(" ", 3);
            if (split.length == 3) {
                if (eVar == C42202e.CLIENT) {
                    cVar = m121832v(split, o);
                } else {
                    cVar = m121833w(split, o);
                }
                String o2 = m121830o(byteBuffer);
                while (o2 != null && o2.length() > 0) {
                    String[] split2 = o2.split(":", 2);
                    if (split2.length == 2) {
                        if (cVar.mo98027c(split2[0])) {
                            String str = split2[0];
                            cVar.mo98023a(str, cVar.mo98030j(split2[0]) + "; " + split2[1].replaceFirst("^ +", ""));
                        } else {
                            cVar.mo98023a(split2[0], split2[1].replaceFirst("^ +", ""));
                        }
                        o2 = m121830o(byteBuffer);
                    } else {
                        throw new InvalidHandshakeException("not an http header");
                    }
                }
                if (o2 != null) {
                    return cVar;
                }
                throw new IncompleteHandshakeException();
            }
            throw new InvalidHandshakeException();
        }
        throw new IncompleteHandshakeException(byteBuffer.capacity() + 128);
    }

    /* renamed from: v */
    private static C42569c m121832v(String[] strArr, String str) {
        if (!"101".equals(strArr[1])) {
            throw new InvalidHandshakeException(String.format("Invalid status code received: %s Status line: %s", new Object[]{strArr[1], str}));
        } else if ("HTTP/1.1".equalsIgnoreCase(strArr[0])) {
            C42571e eVar = new C42571e();
            eVar.mo98025g(Short.parseShort(strArr[1]));
            eVar.mo98026i(strArr[2]);
            return eVar;
        } else {
            throw new InvalidHandshakeException(String.format("Invalid status line received: %s Status line: %s", new Object[]{strArr[0], str}));
        }
    }

    /* renamed from: w */
    private static C42569c m121833w(String[] strArr, String str) {
        if (!"GET".equalsIgnoreCase(strArr[0])) {
            throw new InvalidHandshakeException(String.format("Invalid request method received: %s Status line: %s", new Object[]{strArr[0], str}));
        } else if ("HTTP/1.1".equalsIgnoreCase(strArr[2])) {
            C42570d dVar = new C42570d();
            dVar.mo98022h(strArr[1]);
            return dVar;
        } else {
            throw new InvalidHandshakeException(String.format("Invalid status line received: %s Status line: %s", new Object[]{strArr[2], str}));
        }
    }

    /* renamed from: a */
    public abstract C42199b mo97125a(C42567a aVar, C42574h hVar);

    /* renamed from: b */
    public abstract C42199b mo97126b(C42567a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo97127c(C42572f fVar) {
        if (!fVar.mo98030j("Upgrade").equalsIgnoreCase("websocket") || !fVar.mo98030j("Connection").toLowerCase(Locale.ENGLISH).contains("upgrade")) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public int mo97128d(int i) {
        if (i >= 0) {
            return i;
        }
        throw new InvalidDataException((int) FaceTecSDK.REQUEST_CODE_SESSION, "Negative count");
    }

    /* renamed from: e */
    public abstract C41947a mo97129e();

    /* renamed from: f */
    public abstract ByteBuffer mo97130f(C42378f fVar);

    /* renamed from: g */
    public abstract List mo97131g(String str, boolean z);

    /* renamed from: h */
    public List mo97132h(C42572f fVar) {
        return mo97133i(fVar, true);
    }

    /* renamed from: i */
    public List mo97133i(C42572f fVar, boolean z) {
        byte[] bArr;
        int i;
        StringBuilder sb = new StringBuilder(100);
        if (fVar instanceof C42567a) {
            sb.append("GET ");
            sb.append(((C42567a) fVar).mo98021d());
            sb.append(" HTTP/1.1");
        } else if (fVar instanceof C42574h) {
            sb.append("HTTP/1.1 101 ");
            sb.append(((C42574h) fVar).mo98024b());
        } else {
            throw new IllegalArgumentException("unknown role");
        }
        sb.append("\r\n");
        Iterator e = fVar.mo98028e();
        while (e.hasNext()) {
            String str = (String) e.next();
            String j = fVar.mo98030j(str);
            sb.append(str);
            sb.append(": ");
            sb.append(j);
            sb.append("\r\n");
        }
        sb.append("\r\n");
        byte[] a = C43104c.m123690a(sb.toString());
        if (z) {
            bArr = fVar.mo98029f();
        } else {
            bArr = null;
        }
        if (bArr == null) {
            i = 0;
        } else {
            i = bArr.length;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i + a.length);
        allocate.put(a);
        if (bArr != null) {
            allocate.put(bArr);
        }
        allocate.flip();
        return Collections.singletonList(allocate);
    }

    /* renamed from: j */
    public abstract C42198a mo97134j();

    /* renamed from: k */
    public abstract C42568b mo97135k(C42568b bVar);

    /* renamed from: l */
    public abstract C42569c mo97136l(C42567a aVar, C42575i iVar);

    /* renamed from: m */
    public abstract void mo97137m(C41767d dVar, C42378f fVar);

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public int mo97138p(C42572f fVar) {
        String j = fVar.mo98030j("Sec-WebSocket-Version");
        if (j.length() > 0) {
            try {
                return new Integer(j.trim()).intValue();
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    /* renamed from: q */
    public abstract void mo97139q();

    /* renamed from: r */
    public void mo97140r(C42202e eVar) {
        this.f98661a = eVar;
    }

    /* renamed from: s */
    public abstract List mo97141s(ByteBuffer byteBuffer);

    /* renamed from: t */
    public C42572f mo97142t(ByteBuffer byteBuffer) {
        return m121831u(byteBuffer, this.f98661a);
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
