package hg1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: hg1.a */
public class C41263a implements C41264b {

    /* renamed from: d */
    private static final List f97278d = Collections.unmodifiableList(new ArrayList());

    /* renamed from: a */
    private String f97279a;

    /* renamed from: b */
    private List f97280b;

    /* renamed from: c */
    private byte[] f97281c;

    public C41263a(String str, List list, byte[] bArr) {
        this.f97279a = str;
        this.f97280b = Collections.unmodifiableList(list);
        this.f97281c = bArr;
    }

    /* renamed from: a */
    public C41263a mo95724a() {
        return this;
    }

    /* renamed from: b */
    public byte[] mo95725b() {
        return this.f97281c;
    }

    /* renamed from: c */
    public List mo95726c() {
        return this.f97280b;
    }

    /* renamed from: d */
    public String mo95727d() {
        return this.f97279a;
    }

    public C41263a(String str, byte[] bArr) {
        this(str, f97278d, bArr);
    }
}
