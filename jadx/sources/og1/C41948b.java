package og1;

import com.facetec.sdk.FaceTecSDK;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import mg1.C41767d;
import org.java_websocket.exceptions.IncompleteException;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.exceptions.InvalidFrameException;
import org.java_websocket.exceptions.InvalidHandshakeException;
import org.java_websocket.exceptions.LimitExceededException;
import org.java_websocket.exceptions.NotSendableException;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p342j$.util.DesugarTimeZone;
import pg1.C42198a;
import pg1.C42199b;
import pg1.C42200c;
import pg1.C42201d;
import pg1.C42202e;
import qg1.C42352a;
import qg1.C42353b;
import rg1.C42374b;
import rg1.C42378f;
import rg1.C42379g;
import rg1.C42383j;
import sg1.C42567a;
import sg1.C42568b;
import sg1.C42569c;
import sg1.C42574h;
import sg1.C42575i;
import tg1.C43019a;
import tg1.C43020b;
import ug1.C43101a;
import ug1.C43104c;
import vh1.C43168a;
import vh1.C43169b;

/* renamed from: og1.b */
public class C41948b extends C41947a {

    /* renamed from: c */
    private final C43168a f98663c;

    /* renamed from: d */
    private C42353b f98664d;

    /* renamed from: e */
    private C42353b f98665e;

    /* renamed from: f */
    private List f98666f;

    /* renamed from: g */
    private C42353b f98667g;

    /* renamed from: h */
    private C43019a f98668h;

    /* renamed from: i */
    private List f98669i;

    /* renamed from: j */
    private C42378f f98670j;

    /* renamed from: k */
    private final List f98671k;

    /* renamed from: l */
    private ByteBuffer f98672l;

    /* renamed from: m */
    private final SecureRandom f98673m;

    /* renamed from: n */
    private int f98674n;

    /* renamed from: og1.b$a */
    private class C41949a {

        /* renamed from: a */
        private int f98675a;

        /* renamed from: b */
        private int f98676b;

        C41949a(int i, int i2) {
            this.f98675a = i;
            this.f98676b = i2;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public int m121896c() {
            return this.f98675a;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public int m121897d() {
            return this.f98676b;
        }
    }

    public C41948b() {
        this(Collections.emptyList());
    }

    /* renamed from: A */
    private C42199b m121852A(String str) {
        for (C43019a aVar : this.f98669i) {
            if (aVar.mo101601a(str)) {
                this.f98668h = aVar;
                this.f98663c.mo97517f("acceptHandshake - Matching protocol found: {}", aVar);
                return C42199b.MATCHED;
            }
        }
        return C42199b.NOT_MATCHED;
    }

    /* renamed from: B */
    private ByteBuffer m121853B(C42378f fVar) {
        boolean z;
        int i;
        int i2;
        int i3;
        ByteBuffer f = fVar.mo97824f();
        int i4 = 0;
        if (this.f98661a == C42202e.CLIENT) {
            z = true;
        } else {
            z = false;
        }
        int O = m121861O(f);
        if (O > 1) {
            i = O + 1;
        } else {
            i = O;
        }
        int i5 = i + 1;
        if (z) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i5 + i2 + f.remaining());
        byte C = m121854C(fVar.mo97835c());
        if (fVar.mo97837e()) {
            i3 = -128;
        } else {
            i3 = 0;
        }
        byte b = (byte) (C | ((byte) i3));
        if (fVar.mo97833a()) {
            b = (byte) (b | m121859M(1));
        }
        if (fVar.mo97834b()) {
            b = (byte) (b | m121859M(2));
        }
        if (fVar.mo97836d()) {
            b = (byte) (m121859M(3) | b);
        }
        allocate.put(b);
        byte[] W = m121869W((long) f.remaining(), O);
        if (O == 1) {
            allocate.put((byte) (W[0] | m121857I(z)));
        } else if (O == 2) {
            allocate.put((byte) (m121857I(z) | 126));
            allocate.put(W);
        } else if (O == 8) {
            allocate.put((byte) (m121857I(z) | Byte.MAX_VALUE));
            allocate.put(W);
        } else {
            throw new IllegalStateException("Size representation not supported/specified");
        }
        if (z) {
            ByteBuffer allocate2 = ByteBuffer.allocate(4);
            allocate2.putInt(this.f98673m.nextInt());
            allocate.put(allocate2.array());
            while (f.hasRemaining()) {
                allocate.put((byte) (f.get() ^ allocate2.get(i4 % 4)));
                i4++;
            }
        } else {
            allocate.put(f);
            f.flip();
        }
        allocate.flip();
        return allocate;
    }

    /* renamed from: C */
    private byte m121854C(C42200c cVar) {
        if (cVar == C42200c.CONTINUOUS) {
            return 0;
        }
        if (cVar == C42200c.TEXT) {
            return 1;
        }
        if (cVar == C42200c.BINARY) {
            return 2;
        }
        if (cVar == C42200c.CLOSING) {
            return 8;
        }
        if (cVar == C42200c.PING) {
            return 9;
        }
        if (cVar == C42200c.PONG) {
            return 10;
        }
        throw new IllegalArgumentException("Don't know how to handle " + cVar.toString());
    }

    /* renamed from: D */
    private String m121855D(String str) {
        try {
            return C43101a.m123683g(MessageDigest.getInstance("SHA1").digest((str.trim() + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").getBytes()));
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: E */
    private long m121856E() {
        long j;
        synchronized (this.f98671k) {
            j = 0;
            for (ByteBuffer limit : this.f98671k) {
                j += (long) limit.limit();
            }
        }
        return j;
    }

    /* renamed from: I */
    private byte m121857I(boolean z) {
        return z ? Byte.MIN_VALUE : 0;
    }

    /* renamed from: K */
    private ByteBuffer m121858K() {
        ByteBuffer allocate;
        synchronized (this.f98671k) {
            long j = 0;
            for (ByteBuffer limit : this.f98671k) {
                j += (long) limit.limit();
            }
            m121876y();
            allocate = ByteBuffer.allocate((int) j);
            for (ByteBuffer put : this.f98671k) {
                allocate.put(put);
            }
        }
        allocate.flip();
        return allocate;
    }

    /* renamed from: M */
    private byte m121859M(int i) {
        if (i == 1) {
            return 64;
        }
        if (i != 2) {
            return i != 3 ? (byte) 0 : 16;
        }
        return 32;
    }

    /* renamed from: N */
    private String m121860N() {
        Calendar instance = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        return simpleDateFormat.format(instance.getTime());
    }

    /* renamed from: O */
    private int m121861O(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() <= 125) {
            return 1;
        }
        if (byteBuffer.remaining() <= 65535) {
            return 2;
        }
        return 8;
    }

    /* renamed from: P */
    private void m121862P(C41767d dVar, RuntimeException runtimeException) {
        this.f98663c.mo97512a("Runtime exception during onWebsocketMessage", runtimeException);
        dVar.mo96576s().mo96584b(dVar, runtimeException);
    }

    /* renamed from: Q */
    private void m121863Q(C41767d dVar, C42378f fVar) {
        try {
            dVar.mo96576s().mo96587h(dVar, fVar.mo97824f());
        } catch (RuntimeException e) {
            m121862P(dVar, e);
        }
    }

    /* renamed from: R */
    private void m121864R(C41767d dVar, C42378f fVar) {
        String str;
        int i;
        if (fVar instanceof C42374b) {
            C42374b bVar = (C42374b) fVar;
            i = bVar.mo97828o();
            str = bVar.mo97829p();
        } else {
            i = 1005;
            str = "";
        }
        if (dVar.mo96575r() == C42201d.CLOSING) {
            dVar.mo96569f(i, str, true);
        } else if (mo97134j() == C42198a.TWOWAY) {
            dVar.mo96566c(i, str, true);
        } else {
            dVar.mo96573o(i, str, false);
        }
    }

    /* renamed from: S */
    private void m121865S(C41767d dVar, C42378f fVar, C42200c cVar) {
        C42200c cVar2 = C42200c.CONTINUOUS;
        if (cVar != cVar2) {
            m121867U(fVar);
        } else if (fVar.mo97837e()) {
            m121866T(dVar, fVar);
        } else if (this.f98670j == null) {
            this.f98663c.mo97513b("Protocol error: Continuous frame sequence was not started.");
            throw new InvalidDataException((int) FaceTecSDK.REQUEST_CODE_SESSION, "Continuous frame sequence was not started.");
        }
        if (cVar == C42200c.TEXT && !C43104c.m123691b(fVar.mo97824f())) {
            this.f98663c.mo97513b("Protocol error: Payload is not UTF8");
            throw new InvalidDataException(1007);
        } else if (cVar == cVar2 && this.f98670j != null) {
            m121875x(fVar.mo97824f());
        }
    }

    /* renamed from: T */
    private void m121866T(C41767d dVar, C42378f fVar) {
        if (this.f98670j != null) {
            m121875x(fVar.mo97824f());
            m121876y();
            if (this.f98670j.mo97835c() == C42200c.TEXT) {
                ((C42379g) this.f98670j).mo97827j(m121858K());
                ((C42379g) this.f98670j).mo97825h();
                try {
                    dVar.mo96576s().mo96589n(dVar, C43104c.m123694e(this.f98670j.mo97824f()));
                } catch (RuntimeException e) {
                    m121862P(dVar, e);
                }
            } else if (this.f98670j.mo97835c() == C42200c.BINARY) {
                ((C42379g) this.f98670j).mo97827j(m121858K());
                ((C42379g) this.f98670j).mo97825h();
                try {
                    dVar.mo96576s().mo96587h(dVar, this.f98670j.mo97824f());
                } catch (RuntimeException e2) {
                    m121862P(dVar, e2);
                }
            }
            this.f98670j = null;
            m121877z();
            return;
        }
        this.f98663c.mo97518g("Protocol error: Previous continuous frame sequence not completed.");
        throw new InvalidDataException((int) FaceTecSDK.REQUEST_CODE_SESSION, "Continuous frame sequence was not started.");
    }

    /* renamed from: U */
    private void m121867U(C42378f fVar) {
        if (this.f98670j == null) {
            this.f98670j = fVar;
            m121875x(fVar.mo97824f());
            m121876y();
            return;
        }
        this.f98663c.mo97518g("Protocol error: Previous continuous frame sequence not completed.");
        throw new InvalidDataException((int) FaceTecSDK.REQUEST_CODE_SESSION, "Previous continuous frame sequence not completed.");
    }

    /* renamed from: V */
    private void m121868V(C41767d dVar, C42378f fVar) {
        try {
            dVar.mo96576s().mo96589n(dVar, C43104c.m123694e(fVar.mo97824f()));
        } catch (RuntimeException e) {
            m121862P(dVar, e);
        }
    }

    /* renamed from: W */
    private byte[] m121869W(long j, int i) {
        byte[] bArr = new byte[i];
        int i2 = (i * 8) - 8;
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) ((int) (j >>> (i2 - (i3 * 8))));
        }
        return bArr;
    }

    /* renamed from: X */
    private C42200c m121870X(byte b) {
        if (b == 0) {
            return C42200c.CONTINUOUS;
        }
        if (b == 1) {
            return C42200c.TEXT;
        }
        if (b == 2) {
            return C42200c.BINARY;
        }
        switch (b) {
            case 8:
                return C42200c.CLOSING;
            case 9:
                return C42200c.PING;
            case 10:
                return C42200c.PONG;
            default:
                throw new InvalidFrameException("Unknown opcode " + ((short) b));
        }
    }

    /* renamed from: Y */
    private C42378f m121871Y(ByteBuffer byteBuffer) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        String str;
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i2 = 2;
            m121873a0(remaining, 2);
            byte b = byteBuffer.get();
            if ((b >> 8) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((b & 64) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((b & 32) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((b & 16) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            byte b2 = byteBuffer.get();
            if ((b2 & Byte.MIN_VALUE) != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            int i3 = (byte) (b2 & Byte.MAX_VALUE);
            C42200c X = m121870X((byte) (b & 15));
            if (i3 < 0 || i3 > 125) {
                C41949a b0 = m121874b0(byteBuffer, X, i3, remaining, 2);
                i3 = b0.m121896c();
                i2 = b0.m121897d();
            }
            m121872Z((long) i3);
            if (z5) {
                i = 4;
            } else {
                i = 0;
            }
            m121873a0(remaining, i2 + i + i3);
            ByteBuffer allocate = ByteBuffer.allocate(mo97128d(i3));
            if (z5) {
                byte[] bArr = new byte[4];
                byteBuffer.get(bArr);
                for (int i4 = 0; i4 < i3; i4++) {
                    allocate.put((byte) (byteBuffer.get() ^ bArr[i4 % 4]));
                }
            } else {
                allocate.put(byteBuffer.array(), byteBuffer.position(), allocate.limit());
                byteBuffer.position(byteBuffer.position() + allocate.limit());
            }
            C42379g g = C42379g.m122915g(X);
            g.mo97838i(z);
            g.mo97839k(z2);
            g.mo97840l(z3);
            g.mo97841m(z4);
            allocate.flip();
            g.mo97827j(allocate);
            if (g.mo97835c() != C42200c.CONTINUOUS) {
                if (g.mo97833a() || g.mo97834b() || g.mo97836d()) {
                    this.f98667g = mo97144F();
                } else {
                    this.f98667g = this.f98665e;
                }
            }
            if (this.f98667g == null) {
                this.f98667g = this.f98665e;
            }
            this.f98667g.mo97786d(g);
            this.f98667g.mo97787e(g);
            if (this.f98663c.mo97515d()) {
                C43168a aVar = this.f98663c;
                Integer valueOf = Integer.valueOf(g.mo97824f().remaining());
                if (g.mo97824f().remaining() > 1000) {
                    str = "too big to display";
                } else {
                    str = new String(g.mo97824f().array());
                }
                aVar.mo97514c("afterDecoding({}): {}", valueOf, str);
            }
            g.mo97825h();
            return g;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: Z */
    private void m121872Z(long j) {
        if (j <= 2147483647L) {
            int i = this.f98674n;
            if (j > ((long) i)) {
                this.f98663c.mo97514c("Payload limit reached. Allowed: {} Current: {}", Integer.valueOf(i), Long.valueOf(j));
                throw new LimitExceededException("Payload limit reached.", this.f98674n);
            } else if (j < 0) {
                this.f98663c.mo97518g("Limit underflow: Payloadsize is to little...");
                throw new LimitExceededException("Payloadsize is to little...");
            }
        } else {
            this.f98663c.mo97518g("Limit exedeed: Payloadsize is to big...");
            throw new LimitExceededException("Payloadsize is to big...");
        }
    }

    /* renamed from: a0 */
    private void m121873a0(int i, int i2) {
        if (i < i2) {
            this.f98663c.mo97518g("Incomplete frame: maxpacketsize < realpacketsize");
            throw new IncompleteException(i2);
        }
    }

    /* renamed from: b0 */
    private C41949a m121874b0(ByteBuffer byteBuffer, C42200c cVar, int i, int i2, int i3) {
        int i4;
        int i5;
        if (cVar == C42200c.PING || cVar == C42200c.PONG || cVar == C42200c.CLOSING) {
            this.f98663c.mo97518g("Invalid frame: more than 125 octets");
            throw new InvalidFrameException("more than 125 octets");
        }
        if (i == 126) {
            i4 = i3 + 2;
            m121873a0(i2, i4);
            byte[] bArr = new byte[3];
            bArr[1] = byteBuffer.get();
            bArr[2] = byteBuffer.get();
            i5 = new BigInteger(bArr).intValue();
        } else {
            i4 = i3 + 8;
            m121873a0(i2, i4);
            byte[] bArr2 = new byte[8];
            for (int i6 = 0; i6 < 8; i6++) {
                bArr2[i6] = byteBuffer.get();
            }
            long longValue = new BigInteger(bArr2).longValue();
            m121872Z(longValue);
            i5 = (int) longValue;
        }
        return new C41949a(i5, i4);
    }

    /* renamed from: x */
    private void m121875x(ByteBuffer byteBuffer) {
        synchronized (this.f98671k) {
            this.f98671k.add(byteBuffer);
        }
    }

    /* renamed from: y */
    private void m121876y() {
        long E = m121856E();
        if (E > ((long) this.f98674n)) {
            m121877z();
            this.f98663c.mo97514c("Payload limit reached. Allowed: {} Current: {}", Integer.valueOf(this.f98674n), Long.valueOf(E));
            throw new LimitExceededException(this.f98674n);
        }
    }

    /* renamed from: z */
    private void m121877z() {
        synchronized (this.f98671k) {
            this.f98671k.clear();
        }
    }

    /* renamed from: F */
    public C42353b mo97144F() {
        return this.f98664d;
    }

    /* renamed from: G */
    public List mo97145G() {
        return this.f98666f;
    }

    /* renamed from: H */
    public List mo97146H() {
        return this.f98669i;
    }

    /* renamed from: J */
    public int mo97147J() {
        return this.f98674n;
    }

    /* renamed from: L */
    public C43019a mo97148L() {
        return this.f98668h;
    }

    /* renamed from: a */
    public C42199b mo97125a(C42567a aVar, C42574h hVar) {
        if (!mo97127c(hVar)) {
            this.f98663c.mo97518g("acceptHandshakeAsClient - Missing/wrong upgrade or connection in handshake.");
            return C42199b.NOT_MATCHED;
        } else if (!aVar.mo98027c("Sec-WebSocket-Key") || !hVar.mo98027c("Sec-WebSocket-Accept")) {
            this.f98663c.mo97518g("acceptHandshakeAsClient - Missing Sec-WebSocket-Key or Sec-WebSocket-Accept");
            return C42199b.NOT_MATCHED;
        } else {
            if (!m121855D(aVar.mo98030j("Sec-WebSocket-Key")).equals(hVar.mo98030j("Sec-WebSocket-Accept"))) {
                this.f98663c.mo97518g("acceptHandshakeAsClient - Wrong key for Sec-WebSocket-Key.");
                return C42199b.NOT_MATCHED;
            }
            C42199b bVar = C42199b.NOT_MATCHED;
            String j = hVar.mo98030j("Sec-WebSocket-Extensions");
            Iterator it = this.f98666f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C42353b bVar2 = (C42353b) it.next();
                if (bVar2.mo97790g(j)) {
                    this.f98664d = bVar2;
                    bVar = C42199b.MATCHED;
                    this.f98663c.mo97517f("acceptHandshakeAsClient - Matching extension found: {}", bVar2);
                    break;
                }
            }
            C42199b A = m121852A(hVar.mo98030j("Sec-WebSocket-Protocol"));
            C42199b bVar3 = C42199b.MATCHED;
            if (A == bVar3 && bVar == bVar3) {
                return bVar3;
            }
            this.f98663c.mo97518g("acceptHandshakeAsClient - No matching extension or protocol found.");
            return C42199b.NOT_MATCHED;
        }
    }

    /* renamed from: b */
    public C42199b mo97126b(C42567a aVar) {
        if (mo97138p(aVar) != 13) {
            this.f98663c.mo97518g("acceptHandshakeAsServer - Wrong websocket version.");
            return C42199b.NOT_MATCHED;
        }
        C42199b bVar = C42199b.NOT_MATCHED;
        String j = aVar.mo98030j("Sec-WebSocket-Extensions");
        Iterator it = this.f98666f.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C42353b bVar2 = (C42353b) it.next();
            if (bVar2.mo97785c(j)) {
                this.f98664d = bVar2;
                bVar = C42199b.MATCHED;
                this.f98663c.mo97517f("acceptHandshakeAsServer - Matching extension found: {}", bVar2);
                break;
            }
        }
        C42199b A = m121852A(aVar.mo98030j("Sec-WebSocket-Protocol"));
        C42199b bVar3 = C42199b.MATCHED;
        if (A == bVar3 && bVar == bVar3) {
            return bVar3;
        }
        this.f98663c.mo97518g("acceptHandshakeAsServer - No matching extension or protocol found.");
        return C42199b.NOT_MATCHED;
    }

    /* renamed from: e */
    public C41947a mo97129e() {
        ArrayList arrayList = new ArrayList();
        for (C42353b b : mo97145G()) {
            arrayList.add(b.mo97784b());
        }
        ArrayList arrayList2 = new ArrayList();
        for (C43019a b2 : mo97146H()) {
            arrayList2.add(b2.mo101602b());
        }
        return new C41948b(arrayList, arrayList2, this.f98674n);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C41948b bVar = (C41948b) obj;
        if (this.f98674n != bVar.mo97147J()) {
            return false;
        }
        C42353b bVar2 = this.f98664d;
        if (bVar2 == null ? bVar.mo97144F() != null : !bVar2.equals(bVar.mo97144F())) {
            return false;
        }
        C43019a aVar = this.f98668h;
        C43019a L = bVar.mo97148L();
        if (aVar != null) {
            return aVar.equals(L);
        }
        if (L == null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public ByteBuffer mo97130f(C42378f fVar) {
        String str;
        mo97144F().mo97791h(fVar);
        if (this.f98663c.mo97515d()) {
            C43168a aVar = this.f98663c;
            Integer valueOf = Integer.valueOf(fVar.mo97824f().remaining());
            if (fVar.mo97824f().remaining() > 1000) {
                str = "too big to display";
            } else {
                str = new String(fVar.mo97824f().array());
            }
            aVar.mo97514c("afterEnconding({}): {}", valueOf, str);
        }
        return m121853B(fVar);
    }

    /* renamed from: g */
    public List mo97131g(String str, boolean z) {
        C42383j jVar = new C42383j();
        jVar.mo97827j(ByteBuffer.wrap(C43104c.m123695f(str)));
        jVar.mo97842n(z);
        try {
            jVar.mo97825h();
            return Collections.singletonList(jVar);
        } catch (InvalidDataException e) {
            throw new NotSendableException(e);
        }
    }

    public int hashCode() {
        int i;
        C42353b bVar = this.f98664d;
        int i2 = 0;
        if (bVar != null) {
            i = bVar.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        C43019a aVar = this.f98668h;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        int i4 = this.f98674n;
        return ((i3 + i2) * 31) + (i4 ^ (i4 >>> 32));
    }

    /* renamed from: j */
    public C42198a mo97134j() {
        return C42198a.TWOWAY;
    }

    /* renamed from: k */
    public C42568b mo97135k(C42568b bVar) {
        bVar.mo98023a("Upgrade", "websocket");
        bVar.mo98023a("Connection", "Upgrade");
        byte[] bArr = new byte[16];
        this.f98673m.nextBytes(bArr);
        bVar.mo98023a("Sec-WebSocket-Key", C43101a.m123683g(bArr));
        bVar.mo98023a("Sec-WebSocket-Version", BankApiResponse.INVALID_SESSION_CODE);
        StringBuilder sb = new StringBuilder();
        for (C42353b bVar2 : this.f98666f) {
            if (!(bVar2.mo97789f() == null || bVar2.mo97789f().length() == 0)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(bVar2.mo97789f());
            }
        }
        if (sb.length() != 0) {
            bVar.mo98023a("Sec-WebSocket-Extensions", sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        for (C43019a aVar : this.f98669i) {
            if (aVar.mo101603c().length() != 0) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(aVar.mo101603c());
            }
        }
        if (sb2.length() != 0) {
            bVar.mo98023a("Sec-WebSocket-Protocol", sb2.toString());
        }
        return bVar;
    }

    /* renamed from: l */
    public C42569c mo97136l(C42567a aVar, C42575i iVar) {
        iVar.mo98023a("Upgrade", "websocket");
        iVar.mo98023a("Connection", aVar.mo98030j("Connection"));
        String j = aVar.mo98030j("Sec-WebSocket-Key");
        if (j == null || "".equals(j)) {
            throw new InvalidHandshakeException("missing Sec-WebSocket-Key");
        }
        iVar.mo98023a("Sec-WebSocket-Accept", m121855D(j));
        if (mo97144F().mo97793i().length() != 0) {
            iVar.mo98023a("Sec-WebSocket-Extensions", mo97144F().mo97793i());
        }
        if (!(mo97148L() == null || mo97148L().mo101603c().length() == 0)) {
            iVar.mo98023a("Sec-WebSocket-Protocol", mo97148L().mo101603c());
        }
        iVar.mo98026i("Web Socket Protocol Handshake");
        iVar.mo98023a("Server", "TooTallNate Java-WebSocket");
        iVar.mo98023a("Date", m121860N());
        return iVar;
    }

    /* renamed from: m */
    public void mo97137m(C41767d dVar, C42378f fVar) {
        C42200c c = fVar.mo97835c();
        if (c == C42200c.CLOSING) {
            m121864R(dVar, fVar);
        } else if (c == C42200c.PING) {
            dVar.mo96576s().mo96558f(dVar, fVar);
        } else if (c == C42200c.PONG) {
            dVar.mo96563B();
            dVar.mo96576s().mo96559i(dVar, fVar);
        } else if (!fVar.mo97837e() || c == C42200c.CONTINUOUS) {
            m121865S(dVar, fVar, c);
        } else if (this.f98670j != null) {
            this.f98663c.mo97513b("Protocol error: Continuous frame sequence not completed.");
            throw new InvalidDataException((int) FaceTecSDK.REQUEST_CODE_SESSION, "Continuous frame sequence not completed.");
        } else if (c == C42200c.TEXT) {
            m121868V(dVar, fVar);
        } else if (c == C42200c.BINARY) {
            m121863Q(dVar, fVar);
        } else {
            this.f98663c.mo97513b("non control or continious frame expected");
            throw new InvalidDataException((int) FaceTecSDK.REQUEST_CODE_SESSION, "non control or continious frame expected");
        }
    }

    /* renamed from: q */
    public void mo97139q() {
        this.f98672l = null;
        C42353b bVar = this.f98664d;
        if (bVar != null) {
            bVar.mo97783a();
        }
        this.f98664d = new C42352a();
        this.f98668h = null;
    }

    /* renamed from: s */
    public List mo97141s(ByteBuffer byteBuffer) {
        LinkedList linkedList;
        while (true) {
            linkedList = new LinkedList();
            if (this.f98672l == null) {
                break;
            }
            try {
                byteBuffer.mark();
                int remaining = byteBuffer.remaining();
                int remaining2 = this.f98672l.remaining();
                if (remaining2 > remaining) {
                    this.f98672l.put(byteBuffer.array(), byteBuffer.position(), remaining);
                    byteBuffer.position(byteBuffer.position() + remaining);
                    return Collections.emptyList();
                }
                this.f98672l.put(byteBuffer.array(), byteBuffer.position(), remaining2);
                byteBuffer.position(byteBuffer.position() + remaining2);
                linkedList.add(m121871Y((ByteBuffer) this.f98672l.duplicate().position(0)));
                this.f98672l = null;
            } catch (IncompleteException e) {
                ByteBuffer allocate = ByteBuffer.allocate(mo97128d(e.mo97331a()));
                this.f98672l.rewind();
                allocate.put(this.f98672l);
                this.f98672l = allocate;
            }
        }
        while (byteBuffer.hasRemaining()) {
            byteBuffer.mark();
            try {
                linkedList.add(m121871Y(byteBuffer));
            } catch (IncompleteException e2) {
                byteBuffer.reset();
                ByteBuffer allocate2 = ByteBuffer.allocate(mo97128d(e2.mo97331a()));
                this.f98672l = allocate2;
                allocate2.put(byteBuffer);
            }
        }
        return linkedList;
    }

    public String toString() {
        String aVar = super.toString();
        if (mo97144F() != null) {
            aVar = aVar + " extension: " + mo97144F().toString();
        }
        if (mo97148L() != null) {
            aVar = aVar + " protocol: " + mo97148L().toString();
        }
        return aVar + " max frame size: " + this.f98674n;
    }

    public C41948b(List list) {
        this(list, Collections.singletonList(new C43020b("")));
    }

    public C41948b(List list, List list2) {
        this(list, list2, Integer.MAX_VALUE);
    }

    public C41948b(List list, List list2, int i) {
        this.f98663c = C43169b.m123832i(C41948b.class);
        this.f98664d = new C42352a();
        this.f98665e = new C42352a();
        this.f98673m = new SecureRandom();
        if (list == null || list2 == null || i < 1) {
            throw new IllegalArgumentException();
        }
        this.f98666f = new ArrayList(list.size());
        this.f98669i = new ArrayList(list2.size());
        this.f98671k = new ArrayList();
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (((C42353b) it.next()).getClass().equals(C42352a.class)) {
                z = true;
            }
        }
        this.f98666f.addAll(list);
        if (!z) {
            List list3 = this.f98666f;
            list3.add(list3.size(), this.f98664d);
        }
        this.f98669i.addAll(list2);
        this.f98674n = i;
        this.f98667g = null;
    }
}
