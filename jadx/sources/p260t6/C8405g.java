package p260t6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: t6.g */
public abstract class C8405g {
    /* renamed from: a */
    public static List m31541a(Object obj) {
        return Collections.singletonList(obj);
    }

    /* renamed from: b */
    public static List m31542b(Object... objArr) {
        int length = objArr.length;
        if (length == 0) {
            return Collections.emptyList();
        }
        if (length != 1) {
            return Collections.unmodifiableList(Arrays.asList(objArr));
        }
        return Collections.singletonList(objArr[0]);
    }
}
