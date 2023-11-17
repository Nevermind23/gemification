package p362bg;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: bg.b */
public class C10272b {

    /* renamed from: d */
    private static final Pattern f28504d = Pattern.compile("([^:\\s]+)\\s*:\\s*([^:\\s]+)");

    /* renamed from: a */
    private final String f28505a;

    /* renamed from: b */
    private final List f28506b;

    /* renamed from: c */
    private final String f28507c;

    public C10272b(String str, List list, String str2) {
        this.f28505a = str;
        this.f28506b = list;
        this.f28507c = str2;
    }

    /* renamed from: d */
    public static C10272b m37452d(String str) {
        String str2 = null;
        if (str == null || str.trim().isEmpty()) {
            return new C10272b("UNKNOWN", (List) null, str);
        }
        Scanner scanner = new Scanner(new StringReader(str));
        scanner.useDelimiter("\\n");
        String next = scanner.next();
        ArrayList arrayList = new ArrayList();
        while (true) {
            Pattern pattern = f28504d;
            if (!scanner.hasNext(pattern)) {
                break;
            }
            Matcher matcher = pattern.matcher(scanner.next());
            matcher.find();
            arrayList.add(new C10271a(matcher.group(1), matcher.group(2)));
        }
        scanner.skip("\n\n");
        scanner.useDelimiter("\u0000");
        if (scanner.hasNext()) {
            str2 = scanner.next();
        }
        return new C10272b(next, arrayList, str2);
    }

    /* renamed from: a */
    public String mo26865a() {
        return mo26866b(false);
    }

    /* renamed from: b */
    public String mo26866b(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f28505a);
        sb.append(10);
        for (C10271a aVar : this.f28506b) {
            sb.append(aVar.mo26862a());
            sb.append(':');
            sb.append(aVar.mo26863b());
            sb.append(10);
        }
        sb.append(10);
        String str = this.f28507c;
        if (str != null) {
            sb.append(str);
            if (z) {
                sb.append("\n\n");
            }
        }
        sb.append("\u0000");
        return sb.toString();
    }

    /* renamed from: c */
    public String mo26867c(String str) {
        List<C10271a> list = this.f28506b;
        if (list == null) {
            return null;
        }
        for (C10271a aVar : list) {
            if (aVar.mo26862a().equals(str)) {
                return aVar.mo26863b();
            }
        }
        return null;
    }

    /* renamed from: e */
    public String mo26868e() {
        return this.f28507c;
    }

    /* renamed from: f */
    public String mo26869f() {
        return this.f28505a;
    }

    public String toString() {
        return "StompMessage{command='" + this.f28505a + '\'' + ", headers=" + this.f28506b + ", payload='" + this.f28507c + '\'' + '}';
    }
}
