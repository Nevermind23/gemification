package p358bc;

import android.support.p013v4.media.session.C0125b;
import com.google.zxing.C5751a;
import com.google.zxing.C5756f;
import com.google.zxing.C5768q;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;
import p200ob.C7508b;
import p415fc.C12838c;
import p415fc.C12839d;

/* renamed from: bc.d */
public final class C10225d implements C5768q {
    /* renamed from: b */
    private static C7508b m37318b(byte[][] bArr, int i) {
        int i2 = i * 2;
        C7508b bVar = new C7508b(bArr[0].length + i2, bArr.length + i2);
        bVar.mo21970b();
        int h = (bVar.mo21978h() - i) - 1;
        int i3 = 0;
        while (i3 < bArr.length) {
            byte[] bArr2 = bArr[i3];
            for (int i4 = 0; i4 < bArr[0].length; i4++) {
                if (bArr2[i4] == 1) {
                    bVar.mo21984n(i4 + i, h);
                }
            }
            i3++;
            h--;
        }
        return bVar;
    }

    /* renamed from: c */
    private static C7508b m37319c(C12839d dVar, String str, int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        boolean z3;
        dVar.mo33493e(str, i);
        byte[][] b = dVar.mo33494f().mo33489b(1, 4);
        if (i3 > i2) {
            z = true;
        } else {
            z = false;
        }
        if (b[0].length < b.length) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            b = m37320d(b);
            z3 = true;
        } else {
            z3 = false;
        }
        int min = Math.min(i2 / b[0].length, i3 / b.length);
        if (min <= 1) {
            return m37318b(b, i4);
        }
        byte[][] b2 = dVar.mo33494f().mo33489b(min, min << 2);
        if (z3) {
            b2 = m37320d(b2);
        }
        return m37318b(b2, i4);
    }

    /* renamed from: d */
    private static byte[][] m37320d(byte[][] bArr) {
        int length = bArr[0].length;
        int[] iArr = new int[2];
        iArr[1] = bArr.length;
        iArr[0] = length;
        byte[][] bArr2 = (byte[][]) Array.newInstance(Byte.TYPE, iArr);
        for (int i = 0; i < bArr.length; i++) {
            int length2 = (bArr.length - i) - 1;
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                bArr2[i2][length2] = bArr[i][i2];
            }
        }
        return bArr2;
    }

    /* renamed from: a */
    public C7508b mo18891a(String str, C5751a aVar, int i, int i2, Map map) {
        if (aVar == C5751a.PDF_417) {
            C12839d dVar = new C12839d();
            int i3 = 30;
            int i4 = 2;
            if (map != null) {
                C5756f fVar = C5756f.PDF417_COMPACT;
                if (map.containsKey(fVar)) {
                    dVar.mo33495h(Boolean.parseBoolean(map.get(fVar).toString()));
                }
                C5756f fVar2 = C5756f.PDF417_COMPACTION;
                if (map.containsKey(fVar2)) {
                    dVar.mo33496i(C12838c.valueOf(map.get(fVar2).toString()));
                }
                C5756f fVar3 = C5756f.PDF417_DIMENSIONS;
                if (!map.containsKey(fVar3)) {
                    C5756f fVar4 = C5756f.MARGIN;
                    if (map.containsKey(fVar4)) {
                        i3 = Integer.parseInt(map.get(fVar4).toString());
                    }
                    C5756f fVar5 = C5756f.ERROR_CORRECTION;
                    if (map.containsKey(fVar5)) {
                        i4 = Integer.parseInt(map.get(fVar5).toString());
                    }
                    C5756f fVar6 = C5756f.CHARACTER_SET;
                    if (map.containsKey(fVar6)) {
                        dVar.mo33497j(Charset.forName(map.get(fVar6).toString()));
                    }
                } else {
                    C0125b.m366a(map.get(fVar3));
                    throw null;
                }
            }
            return m37319c(dVar, str, i4, i, i2, i3);
        }
        throw new IllegalArgumentException("Can only encode PDF_417, but got ".concat(String.valueOf(aVar)));
    }
}
