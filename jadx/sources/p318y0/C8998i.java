package p318y0;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;
import java.util.List;

/* renamed from: y0.i */
public interface C8998i extends Closeable {
    /* renamed from: A1 */
    Cursor mo23649A1(C9007l lVar, CancellationSignal cancellationSignal);

    /* renamed from: F */
    void mo23650F();

    /* renamed from: I */
    List mo23651I();

    /* renamed from: L */
    void mo23652L(String str);

    /* renamed from: N0 */
    C9008m mo23653N0(String str);

    /* renamed from: U0 */
    int mo23654U0(String str, int i, ContentValues contentValues, String str2, Object[] objArr);

    /* renamed from: X */
    void mo23655X();

    /* renamed from: Y */
    void mo23656Y(String str, Object[] objArr);

    /* renamed from: Z */
    void mo23657Z();

    /* renamed from: b1 */
    Cursor mo23659b1(String str);

    /* renamed from: g1 */
    Cursor mo23661g1(C9007l lVar);

    /* renamed from: i0 */
    void mo23662i0();

    boolean isOpen();

    /* renamed from: m1 */
    boolean mo23664m1();

    /* renamed from: w1 */
    boolean mo23665w1();

    /* renamed from: z */
    String mo23666z();
}
