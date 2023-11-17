package p340za;

import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;

/* renamed from: za.a */
public abstract class C9273a {
    /* renamed from: a */
    public static List m34173a(String str) {
        int i;
        int i2;
        int i3;
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < length) {
            int i7 = 0;
            int i8 = 1;
            while (true) {
                i = i4 + 1;
                int charAt = (str.charAt(i4) - '?') - 1;
                i8 += charAt << i7;
                i7 += 5;
                if (charAt < 31) {
                    break;
                }
                i4 = i;
            }
            if ((i8 & 1) != 0) {
                i2 = ~(i8 >> 1);
            } else {
                i2 = i8 >> 1;
            }
            int i9 = i2 + i5;
            int i12 = 0;
            int i13 = 1;
            while (true) {
                i3 = i + 1;
                int charAt2 = (str.charAt(i) - '?') - 1;
                i13 += charAt2 << i12;
                i12 += 5;
                if (charAt2 < 31) {
                    break;
                }
                i = i3;
            }
            int i14 = i13 & 1;
            int i15 = i13 >> 1;
            if (i14 != 0) {
                i15 = ~i15;
            }
            i6 += i15;
            arrayList.add(new LatLng(((double) i9) * 1.0E-5d, ((double) i6) * 1.0E-5d));
            i5 = i9;
            i4 = i3;
        }
        return arrayList;
    }
}
