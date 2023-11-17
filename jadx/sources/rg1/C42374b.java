package rg1;

import com.facetec.sdk.FaceTecSDK;
import java.nio.ByteBuffer;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.exceptions.InvalidFrameException;
import pg1.C42200c;
import ug1.C43103b;
import ug1.C43104c;

/* renamed from: rg1.b */
public class C42374b extends C42376d {

    /* renamed from: h */
    private int f99626h;

    /* renamed from: i */
    private String f99627i;

    public C42374b() {
        super(C42200c.CLOSING);
        mo97831r("");
        mo97830q(1000);
    }

    /* renamed from: s */
    private void m122898s() {
        byte[] f = C43104c.m123695f(this.f99627i);
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(this.f99626h);
        allocate.position(2);
        ByteBuffer allocate2 = ByteBuffer.allocate(f.length + 2);
        allocate2.put(allocate);
        allocate2.put(f);
        allocate2.rewind();
        super.mo97827j(allocate2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        throw new org.java_websocket.exceptions.InvalidDataException(1007);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        r3.position(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0015 */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m122899t(java.nio.ByteBuffer r3, int r4) {
        /*
            r2 = this;
            int r0 = r3.position()     // Catch:{ IllegalArgumentException -> 0x0015 }
            int r0 = r0 + 2
            r3.position(r0)     // Catch:{ IllegalArgumentException -> 0x0015 }
            java.lang.String r0 = ug1.C43104c.m123694e(r3)     // Catch:{ IllegalArgumentException -> 0x0015 }
            r2.f99627i = r0     // Catch:{ IllegalArgumentException -> 0x0015 }
            r3.position(r4)
            return
        L_0x0013:
            r0 = move-exception
            goto L_0x001d
        L_0x0015:
            org.java_websocket.exceptions.InvalidDataException r0 = new org.java_websocket.exceptions.InvalidDataException     // Catch:{ all -> 0x0013 }
            r1 = 1007(0x3ef, float:1.411E-42)
            r0.<init>(r1)     // Catch:{ all -> 0x0013 }
            throw r0     // Catch:{ all -> 0x0013 }
        L_0x001d:
            r3.position(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rg1.C42374b.m122899t(java.nio.ByteBuffer, int):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C42374b bVar = (C42374b) obj;
        if (this.f99626h != bVar.f99626h) {
            return false;
        }
        String str = this.f99627i;
        String str2 = bVar.f99627i;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public ByteBuffer mo97824f() {
        if (this.f99626h == 1005) {
            return C43103b.m123689a();
        }
        return super.mo97824f();
    }

    /* renamed from: h */
    public void mo97825h() {
        super.mo97825h();
        if (this.f99626h == 1007 && this.f99627i.isEmpty()) {
            throw new InvalidDataException(1007, "Received text is no valid utf8 string!");
        } else if (this.f99626h != 1005 || this.f99627i.length() <= 0) {
            int i = this.f99626h;
            if (i > 1015 && i < 3000) {
                throw new InvalidDataException((int) FaceTecSDK.REQUEST_CODE_SESSION, "Trying to send an illegal close code!");
            } else if (i == 1006 || i == 1015 || i == 1005 || i > 4999 || i < 1000 || i == 1004) {
                throw new InvalidFrameException("closecode must not be sent over the wire: " + this.f99626h);
            }
        } else {
            throw new InvalidDataException((int) FaceTecSDK.REQUEST_CODE_SESSION, "A close frame must have a closecode if it has a reason");
        }
    }

    public int hashCode() {
        int i;
        int hashCode = ((super.hashCode() * 31) + this.f99626h) * 31;
        String str = this.f99627i;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    /* renamed from: j */
    public void mo97827j(ByteBuffer byteBuffer) {
        this.f99626h = 1005;
        this.f99627i = "";
        byteBuffer.mark();
        if (byteBuffer.remaining() == 0) {
            this.f99626h = 1000;
        } else if (byteBuffer.remaining() == 1) {
            this.f99626h = FaceTecSDK.REQUEST_CODE_SESSION;
        } else {
            if (byteBuffer.remaining() >= 2) {
                ByteBuffer allocate = ByteBuffer.allocate(4);
                allocate.position(2);
                allocate.putShort(byteBuffer.getShort());
                allocate.position(0);
                this.f99626h = allocate.getInt();
            }
            byteBuffer.reset();
            try {
                m122899t(byteBuffer, byteBuffer.position());
            } catch (InvalidDataException unused) {
                this.f99626h = 1007;
                this.f99627i = null;
            }
        }
    }

    /* renamed from: o */
    public int mo97828o() {
        return this.f99626h;
    }

    /* renamed from: p */
    public String mo97829p() {
        return this.f99627i;
    }

    /* renamed from: q */
    public void mo97830q(int i) {
        this.f99626h = i;
        if (i == 1015) {
            this.f99626h = 1005;
            this.f99627i = "";
        }
        m122898s();
    }

    /* renamed from: r */
    public void mo97831r(String str) {
        if (str == null) {
            str = "";
        }
        this.f99627i = str;
        m122898s();
    }

    public String toString() {
        return super.toString() + "code: " + this.f99626h;
    }
}
