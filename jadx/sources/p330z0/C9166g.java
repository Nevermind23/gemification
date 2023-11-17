package p330z0;

import android.database.sqlite.SQLiteProgram;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41536l;
import p318y0.C9006k;

/* renamed from: z0.g */
public class C9166g implements C9006k {

    /* renamed from: d */
    private final SQLiteProgram f25414d;

    public C9166g(SQLiteProgram sQLiteProgram) {
        C41536l.m120489i(sQLiteProgram, "delegate");
        this.f25414d = sQLiteProgram;
    }

    /* renamed from: X0 */
    public void mo23618X0(int i, byte[] bArr) {
        C41536l.m120489i(bArr, C11755a.C11756a.f34100b);
        this.f25414d.bindBlob(i, bArr);
    }

    /* renamed from: b */
    public void mo23620b(int i, double d) {
        this.f25414d.bindDouble(i, d);
    }

    public void close() {
        this.f25414d.close();
    }

    /* renamed from: j */
    public void mo23623j(int i, String str) {
        C41536l.m120489i(str, C11755a.C11756a.f34100b);
        this.f25414d.bindString(i, str);
    }

    /* renamed from: j1 */
    public void mo23624j1(int i) {
        this.f25414d.bindNull(i);
    }

    /* renamed from: r */
    public void mo23628r(int i, long j) {
        this.f25414d.bindLong(i, j);
    }
}
