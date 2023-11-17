package o31;

import he1.C41233s;
import java.util.HashMap;
import kotlin.jvm.internal.C41536l;

/* renamed from: o31.x */
public final class C37622x {

    /* renamed from: a */
    public static final C37622x f90386a = new C37622x();

    /* renamed from: b */
    private static final HashMap f90387b = C41344r0.m119930l(C41233s.m119492a(4304, "a"), C41233s.m119492a(4305, "b"), C41233s.m119492a(4306, "g"), C41233s.m119492a(4307, "d"), C41233s.m119492a(4308, "e"), C41233s.m119492a(4309, "v"), C41233s.m119492a(4310, "z"), C41233s.m119492a(4311, "t"), C41233s.m119492a(4312, "i"), C41233s.m119492a(4313, "k"), C41233s.m119492a(4314, "l"), C41233s.m119492a(4315, "m"), C41233s.m119492a(4316, "n"), C41233s.m119492a(4317, "o"), C41233s.m119492a(4318, "p"), C41233s.m119492a(4319, "jh"), C41233s.m119492a(4320, "r"), C41233s.m119492a(4321, "s"), C41233s.m119492a(4322, "t"), C41233s.m119492a(4323, "u"), C41233s.m119492a(4324, "f"), C41233s.m119492a(4325, "q"), C41233s.m119492a(4326, "gh"), C41233s.m119492a(4327, "k"), C41233s.m119492a(4328, "sh"), C41233s.m119492a(4329, "ch"), C41233s.m119492a(4330, "ts"), C41233s.m119492a(4331, "dz"), C41233s.m119492a(4332, "ts"), C41233s.m119492a(4333, "ch"), C41233s.m119492a(4334, "kh"), C41233s.m119492a(4335, "j"), C41233s.m119492a(4336, "h"));

    private C37622x() {
    }

    /* renamed from: a */
    public final String mo90794a(String str) {
        C41536l.m120489i(str, "s");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            Object obj = (String) f90387b.get(Character.valueOf(charAt));
            if (obj == null) {
                obj = Character.valueOf(charAt);
            } else {
                C41536l.m120488h(obj, "kaToEnChars[c] ?: c");
            }
            sb.append(obj);
        }
        String sb2 = sb.toString();
        C41536l.m120488h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
